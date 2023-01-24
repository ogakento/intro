
import java.io.File;
import java.io.FileNotFoundException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFileFormat;
import java.io.ByteArrayInputStream;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * 作成した波形データをwavに変換するプログラム
 * @author kogure
 *
 */
public class GenerateWaveFile {
    int frequency;
    int samplingRate = 44100;
    String title;

    public static void main(String[] args) {
        GenerateWaveFile gwf = new GenerateWaveFile();
        gwf.outputWave(args);
    }

    public void outputWave(String[] args) {
        Scanner sc = null;

        if (args.length != 2) {
            System.err.println("java GenerateWaveFile frequency output_wav_file");
            System.exit(0);
        }

        int frequency = Integer.parseInt(args[0]);
        String wavFile = args[1];

        GenerateSquareWave gs = new GenerateSquareWave();
        // 3秒のデータを作る
        //   周波数frequencyということは、波形の繰り返し回数は、
        //   1秒で　frequency回なんだから、3*frequencyで求められる
        //　　データのサンプル数がどうなるかについては、
        //   サンプリングレートが samplingRate であるので、
        //   1秒で samplingRate個データがあるということになる。
        //   つまり3秒のデータを作るということは、分割数は3*samplingRateということになる

        gs.drawDataListR = gs.generateRadianList(3*frequency, 3*samplingRate);
        // グラフ描画はしないのでX軸方法のデータはいらない
        gs.drawDataListY = gs.generateSineWave(1.0, 1.0);
        byte[] waveData = new byte[gs.drawDataListR.size()];
        for (int i=0; i<gs.drawDataListY.size(); i++) {
            waveData[i] = (byte)(40*gs.drawDataListY.get(i));
        }
        try{
            // サンプリングレート、bit数、チャンネル数、符号付きか、ビッグエンディアンか
            AudioFormat frmt = new AudioFormat(samplingRate, 8, 1, true, true);
            AudioInputStream ais = new AudioInputStream(
                new ByteArrayInputStream(waveData),
                frmt,
                waveData.length
            );
            AudioSystem.write(
                ais,
                AudioFileFormat.Type.WAVE,
                new File(wavFile)
            );
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
