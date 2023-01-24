import java.io.File;
import java.lang.Exception;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;

public class WaveAnalyze {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("java WaveAnalyze wave_file");
            System.exit(0);
        }
        try {
            File waveFile = new File(args[0]);
            AudioInputStream ais
                = AudioSystem.getAudioInputStream(waveFile);
            AudioFormat frmt = ais.getFormat();
            System.out.println("bigEndian: " + frmt.isBigEndian());
            System.out.println("channenls: " + frmt.getChannels());
            System.out.println("encoding:  " + frmt.getEncoding());
            System.out.println("frameRate:  " + frmt.getFrameRate());

            System.out.println("frameSize:  " + frmt.getFrameSize());
            System.out.println("sampleRate:  " + frmt.getSampleRate());
            System.out.println("sampleSizeInBits:  " + frmt.getSampleSizeInBits());
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
