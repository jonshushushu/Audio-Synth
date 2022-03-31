package audiosynth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import audiosynth.waveform.Waveform;
/**
 * A collection of notes that (perhaps) make music together.
 * A newly created song starts out empty — no notes.
 * 
 * Added to by Jonny Xue
 */
public class Song{
    private ArrayList<Note> notes;
    public Song(){
        this.notes = new ArrayList<>();
    }
    /**
     * Adds the given note to the notes already in the piece.
     */
    public void addNote(Note note){
        notes.add(note);
    }

    /**
     * Returns an unmodifiable collection of all the notes in the piece.
     */
    public List<Note> getNotes(){
        return Collections.unmodifiableList(notes);
    }

    /**
     * Returns maximum end time of any note in the song. Returns 0 if the song is empty.
     */
    public double getDuration(){
        if(notes.size()==0){
            return 0;
        }
        else{
            double max = notes.get(0).getDuration();
            for(int i = 1; i<notes.size(); i++){
                if(notes.get(i).getEndTime()>max){
                    max=notes.get(i).getEndTime();
                }
            }
            return max;
        }
    }

    /**
    * Renders all the notes in the piece to a normalized audio buffer.
    */
    public AudioBuffer renderAudio(){

    AudioBuffer audioBuffer = new AudioBuffer(Utils.convertSecondsToSamples(getDuration()));
    
    for(Note note : notes){
        double wavelength = Utils.convertPitchToWavelength(note.getPitch());
        Waveform waveform = note.getWaveform();
        Signal signal = waveform.createSignal(wavelength);
        audioBuffer.mix(signal, Utils.convertSecondsToSamples(note.getStartTime()), Utils.convertSecondsToSamples(note.getDuration()));
    }

    audioBuffer.normalize();
    return audioBuffer;

    }

    @Override
    public String toString() {
        return "Song [notes=" + notes + "]";
    }
}