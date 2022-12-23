import javax.swing.* ;
 
class WindowTest{
	public static void main(String[] args) {
		new TestWindow("テストウィンドウ",1400,1400);
	}
}
 
class TestWindow extends JFrame{
	public TestWindow(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//閉じるボタンの処理
		setSize(width,height);//ウィンドウサイズ
		setLocationRelativeTo(null);//画面中央に配置
		setResizable(false);//リサイズ禁止
		setVisible(true);//ウィンドウ表示
	}
}