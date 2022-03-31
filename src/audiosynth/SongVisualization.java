package audiosynth;

import java.util.HashMap;
import java.util.Map;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.Rectangle;
import java.awt.*;

import audiosynth.waveform.Waveform;


/**
 * Visualizes a Song as a collection of multicolored rectangles.
 * 
 * Added on to Jonny Xue
 */
public class SongVisualization extends GraphicsGroup{
    public static final int MAX_PITCH = 120;

    private final Map<Waveform, Color> waveformColors = new HashMap<>();
    private double pixelsPerSecond;
    private double pixelsPerSemitone;
    private GraphicsGroup timeGraphicsGroup;


    /**
     * Creates an empty song visualization.
     *
     * @param pixelsPerSecond   Horizontal distance of one second
     * @param pixelsPerSemitone Number of pixels per pitch unit
     */
    public SongVisualization(double pixelsPerSecond, double pixelsPerSemitone){
        this.pixelsPerSecond = pixelsPerSecond;
        this.pixelsPerSemitone=pixelsPerSemitone;
        this.timeGraphicsGroup = new GraphicsGroup();
        this.add(timeGraphicsGroup);
    }
    /**
     * Shows the notes of the given song, removing any song already present.
     */
    public void showSong(Song song){
        this.removeAll();
        for(Note note : song.getNotes()){
            Rectangle soundRectangle = new Rectangle(note.getStartTime()*pixelsPerSecond, (MAX_PITCH - note.getPitch())*pixelsPerSemitone, 10, 10);
            soundRectangle.setFillColor(getNoteColor(note));
            timeGraphicsGroup.add(soundRectangle);
        }
    }

    /**
     * A helper method you can use to generate different colors for different
     * notes based on their waveform. (Study this. How does it work?)
     */
    private Color getNoteColor(Note note) {
        Waveform waveform = note.getWaveform();
        Color color = waveformColors.get(waveform);
        if (color == null) {
            color = Color.getHSBColor(waveformColors.size() * 0.382f % 1, 1, 0.6f);
            waveformColors.put(waveform, color);
        }
        return color;
    }

        /**
     * Moves the visualization to show that the given time is the current time.
     *
     * @param seconds Time from the beginning of the song
     * @param done    True if the song is done playing
     */
    public void setTime(double seconds, boolean done){
        timeGraphicsGroup.setPosition(-pixelsPerSecond*seconds, timeGraphicsGroup.getY());
        this.add(timeGraphicsGroup);
           
    }


    @Override
    public String toString() {
        return "SongVisualization [pixelsPerSecond=" + pixelsPerSecond + ", pixelsPerSemitone=" + pixelsPerSemitone
            + ", waveformColors=" + waveformColors + "]";
    }
}