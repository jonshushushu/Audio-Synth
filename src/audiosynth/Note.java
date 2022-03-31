package audiosynth;

import java.util.Objects;

import audiosynth.waveform.Waveform;

/**
 * A single note in a piece of music: a waveform at a given pitch, starting at a certain time, and
 * lasting for a certain duration.
 * 
 * Added to by Jonny Xue
 */
public final class Note{
    private Waveform waveform;
    private double pitch;
    private double startTime;
    private double duration;

    /**
     * Creates a note.
     *
     * @param waveform  The shape of the wave (must not be null)
     * @param pitch     Pitch in MIDI units
     * @param startTime Start time in seconds
     * @param duration  Duration in seconds
     * 
     */
    public Note(Waveform waveform, double pitch, double startTime, double duration){
        this.waveform = Objects.requireNonNull(waveform, "waveform must not be null");
        this.pitch=pitch;
        this.startTime=startTime;
        this.duration=duration;
    }
    public Waveform getWaveform(){
        return waveform;
    }


    public double getPitch(){
        return pitch;
    }

    public double getStartTime(){
        return startTime;
    }

    public double getEndTime(){  // computed from start time and duration
        return startTime + duration;
    }
    public double getDuration(){
        return duration;
    }

    @Override
    public String toString() {
        return "Note [duration=" + duration + ", pitch=" + pitch + ", startTime=" + startTime + ", waveform=" + waveform
            + "]";
    }

}