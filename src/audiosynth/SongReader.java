package audiosynth;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import audiosynth.waveform.Noise;
import audiosynth.waveform.SawtoothWave;
import audiosynth.waveform.SineWave;
import audiosynth.waveform.SquareWave;
import audiosynth.waveform.TriangularWave;
import audiosynth.waveform.Waveform;

/**
 * A utility for reading Songs from text files. The text file consists of the following four values
 * in this order:
 *
 * Added to by Jonny Xue
 */
public class SongReader{
    private Map<String, Waveform> waveforms;

    /**
     * Creates a new song reader with the following name-to-waveform mappings:
     *
     * - "sine"   → SineWave
     * - "tri"    → TriangularWave
     * - "square" → SquareWave
     * - "saw"    → SawtoothWave
     * - "noise"  → Noise
     */
    public SongReader(){
        this.waveforms=new HashMap<>();
        waveforms.put("sine", new SineWave());
        waveforms.put("tri", new TriangularWave());
        waveforms.put("square", new SquareWave());
        waveforms.put("saw", new SawtoothWave());
        waveforms.put("noise", new Noise());
    }

    /**
     * Reads song data from the given project resource.
     */
    public Song readSong(String resourceName) {
        return readSong(getClass().getResourceAsStream("/" + resourceName));
    }

    /**
     * Reads song data from an arbitrary input stream. The song data should be
     * comma-separated text, one note per line, with the following format:
     *
     *     [waveform name], [pitch], [start time], [duration]
     *
     * For example, here are three notes:
     *
     *     sine, 61, 0.6, 0.2
     *     tri, 50, 0.8, 0.2
     *     square, 50, 1.6, 0.2
     */
    public Song readSong(InputStream in) {
        // Delimiter allows values to be separated by commas, spaces, or line breaks
        Scanner scanner = new Scanner(in).useDelimiter("\\s*,\\s*|\\s+");

        Song song = new Song();
        while(scanner.hasNext()) {
            Waveform waveform = waveforms.get(scanner.next());
            double pitch = scanner.nextDouble();
            double startTime = scanner.nextDouble();
            double duration = scanner.nextDouble();
            song.addNote(new Note(waveform, pitch, startTime, duration));
        }
        return song;
    }

    @Override
    public String toString() {
        return "SongReader [waveforms=" + waveforms + "]";
    }
}