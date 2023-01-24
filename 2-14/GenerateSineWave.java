
import java.util.List;
import java.util.ArrayList;

/**
 * 作成した波形データを描画するプログラム
 * @author kogure
 *
 */
public class GenerateSineWave {
    List<Double> drawDataListR;
    List<Double> drawDataListX;
    List<Double> drawDataListY;
    int frequency;
    int resolution;

    public static void main(String[] args) {
        GenerateSineWave gs = new GenerateSineWave();
        gs.init();
        gs.outputData();
    }
    /** サイン波形計算の sin()の引数（ラジアン角）のリストを生成する
    * @param waveCount 波形の繰り返し回数
    * @param resolution X軸方向野倉区の分割数（例えば200分割すると、末端を含めて201個のデータができる
    */
    public List<Double> generateRadianList(double waveCount, double resolution) {
        List<Double> results = new ArrayList<Double>();
        for (int i=0; i<=resolution; i++) {
            results.add( 2*Math.PI / resolution * waveCount * i);
        }
        return results;
    }

    /** a * sin(bx) のサイン波形を生成する
    * @param coefficient 係数b
    * @param max 係数a
        */
    public List<Double> generateSineWave(double coefficient, double max) {
        List<Double> results = new ArrayList<Double>();
        for (int i=0; i<drawDataListR.size(); i++) {
            double r = drawDataListR.get(i);
            double y = max * Math.sin(coefficient * r);
            results.add(y);
        }
        return results;
    }

    /** グラフ描画用のX軸時間情報を生成する
    　* @param waveCount 波形繰り返し回数
      * @param frequency 周波数 (1秒間に繰り返される回数)
    */
    public List<Double> generateTime(double waveCount, double frequency) {
        List<Double> results = new ArrayList<Double>();
        double timeByOneData = (double)waveCount / frequency / drawDataListR.size();
        for (int i=0; i<drawDataListR.size(); i++) {
            results.add(i * timeByOneData);
        }
        return results;
    }


    public void init() {
        int reso = 256;  //波形全体の分割数
        int freq = 880;  //周波数

        drawDataListR = generateRadianList(4, reso);
        drawDataListX = generateTime(4, freq);
        drawDataListY = generateSineWave(1.0, 1.0);
    }

    public void outputData() {
        for (int i=0; i<drawDataListX.size(); i++) {
            double x = drawDataListX.get(i);
            double y = drawDataListY.get(i);
            System.out.println(x+","+y);
        }
    }
}
