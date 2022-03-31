package audiosynth;

import edu.macalester.graphics.CanvasWindow;
import java.awt.*;

/**
 * Generates and visualizes music.
 */
public class AudioSynth {
    public static void main(String[] args) {
    String fileName = "bach.csv";  
    Song song = new SongReader().readSong(fileName);
    
    SongVisualization visualization = new SongVisualization(80, 6);

    
    CanvasWindow window = new CanvasWindow(
        fileName,
        (int) visualization.getWidth(),
        (int) visualization.getHeight());
    window.add(visualization);
    visualization.showSong(song);
    song.renderAudio().play(visualization::setTime);

    window.setBackground(Color.BLACK);
        
    }
}
