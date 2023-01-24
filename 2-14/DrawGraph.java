
import java.io.File;
import java.io.FileNotFoundException;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * 作成した波形データを描画するプログラム
 * @author kogure
 *
 */
public class DrawGraph extends Application {
    List<Double> drawDataListX;
    List<Double> drawDataListY;
    int frequency;
    int resolution;
    String title;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox        root    = new HBox();
        init();
        Node drawNode = createLineChart() ;
        root.getChildren().add(drawNode);            // 折れ線グラフの追加
        Scene       scene   = new Scene( root , 900 , 300 );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public void init() {
        List<String> list = getParameters().getRaw();
        Scanner sc = null;

        if (list.size() != 2) {
            System.err.println("java DrawGraph \"title\" csv_file");
            System.exit(0);
        }
        //グラフタイトルはコマンドライン引数1個目
        title = list.get(0);

        //
        try {
            File file = new File(list.get(1));
            sc = new Scanner(file);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            System.exit(0);
        }

        drawDataListX = new ArrayList<Double>();
        drawDataListY = new ArrayList<Double>();
        if (sc == null) return;
        while(sc.hasNext()) {
            String line = sc.next();
            String[] data = line.split(",");
            drawDataListX.add(Double.parseDouble(data[0]));
            drawDataListY.add(Double.parseDouble(data[1]));
        }
    }

    /**
     * 折れ線グラフで波形表示
     * @return
     */
    @SuppressWarnings("unchecked")
    public Node createLineChart() {
        // 折れ線グラフ
        NumberAxis                  xAxis   = new NumberAxis();
        NumberAxis                  yAxis   = new NumberAxis();
        LineChart<Number, Number>   chart   = new LineChart<Number, Number>( xAxis , yAxis );
        chart.setMinWidth( 900 );

        // データを作成
        Series< Number , Number > series    = new Series<Number, Number>();
        series.setName( "チャンネル１"  );
        for( int i=0 ; i<drawDataListX.size() ; i++ ) {
            XYChart.Data<Number,Number> newData = new XYChart.Data<Number, Number>( drawDataListX.get(i) , drawDataListY.get(i));
            series.getData().add(newData);
        }

        // データを登録
        chart.getData().addAll( series );

        // タイトルを登録
        chart.setTitle( title );

        // 見た目を調整
        chart.setCreateSymbols(false);                                                      // シンボルを消去
        series.getNode().lookup(".chart-series-line").setStyle("-fx-stroke-width: 1px;");  // 線を細く

        return chart;
    }
}
