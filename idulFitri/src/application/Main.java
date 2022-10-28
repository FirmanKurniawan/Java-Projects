package application;
	
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
//		Membuat TEks
		Text text1 = new Text(550, 150, "Selamat");
		Text text2 = new Text(630, 167, "Maaf Lahir dan Batin");
		Text text3 = new Text(490, 240, "AidilFitri");
		
//		menambahkan custom font dari lokal file
		text1.setFont(Font.loadFont("file:resources/fonts/Gadimon.ttf", 100));
		text1.setFill(Color.WHITE);
		text2.setFont(Font.font("Arial",12));
		text2.setFill(Color.WHITE);
		text3.setFont(Font.loadFont("file:resources/fonts/Gadimon.ttf", 100));
		text3.setFill(Color.WHITE);
		
//		Memanggil file Gambar
		
		Image FAMILY_1 =new Image("file:resources/image/backup/family1.png");
		Image FAMILY_2 =new Image("file:resources/image/backup/family2.png");
		Image FAMILY_3 =new Image("file:resources/image/backup/family3.png");
		Image FAMILY_4 =new Image("file:resources/image/backup/family4.png");
//		imageview node
		ImageView family1 = new ImageView(FAMILY_1);
		ImageView family2 = new ImageView(FAMILY_2);
		ImageView family3 = new ImageView(FAMILY_3);
		ImageView family4 = new ImageView(FAMILY_4);
		
		family1.setFitHeight(590);
		family1.setFitWidth(900);
		family2.setFitHeight(590);
		family2.setFitWidth(900);
		family3.setFitHeight(590);
		family3.setFitWidth(900);
		family4.setFitHeight(590);
		family4.setFitWidth(900);
		
//		buat grup keluarga
		Group keluarga = new Group(family1);
		
		keluarga.setTranslateX(230);
		keluarga.setTranslateY(150);
		
		Timeline t = new Timeline();
		t.setCycleCount(Timeline.INDEFINITE);
		
//		keyframe
		t.getKeyFrames().add(new KeyFrame(
				Duration.millis(400),
				(ActionEvent event) ->{
					keluarga.getChildren().setAll(family1);
				}
					));
		t.getKeyFrames().add(new KeyFrame(
				Duration.millis(900),
				(ActionEvent event) ->{
					keluarga.getChildren().setAll(family2);
				}
					));
		t.getKeyFrames().add(new KeyFrame(
				Duration.millis(1100),
				(ActionEvent event) ->{
					keluarga.getChildren().setAll(family3);
				}
					));
		t.getKeyFrames().add(new KeyFrame(
				Duration.millis(1500),
				(ActionEvent event) ->{
					keluarga.getChildren().setAll(family4);
				}
					));
		t.play();
		
		Image ketupat = new Image("file:resources/image/ketupatR.png");
		Image ketupat2 = new Image("file:resources/image/ketupatL.png");
		Image pattern = new Image("file:resources/image/pattern.png");
		
		ImageView imageView1 = new ImageView(ketupat);
		ImageView imageView2 = new ImageView(ketupat2);
		ImageView imageView3 = new ImageView(pattern);
		ImageView imageView4 = new ImageView(pattern);
		ImageView imageView5 = new ImageView(pattern);
		
//		mengatur koordinat gambar
		imageView1.setX(850);
		imageView2.setX(250);
		imageView3.setX(0);
		imageView4.setX(560);
		imageView5.setX(880);

		imageView1.setY(0);
		imageView2.setY(0);
		imageView3.setY(300);
		imageView4.setY(300);
		imageView5.setY(300);
		
//		mengatur panjang dan lebar gambar
		imageView1.setFitHeight(300);
		imageView2.setFitHeight(300);
		imageView3.setFitHeight(300);
		imageView3.setFitWidth(600);
		imageView4.setFitHeight(300);
		imageView4.setFitWidth(600);
		imageView5.setFitHeight(300);
		imageView5.setFitWidth(600);
		
		ColorAdjust c = new ColorAdjust();
		c.setHue(0.5);
//	menambahkan effect pada gambar
		imageView3.setEffect(c);
		imageView4.setEffect(c);
		imageView5.setEffect(c);
		
//		Membuat lingkaran
		Circle lingkaran = new Circle();
		
//		mengatur posisi dan ukuran lingkaran
		lingkaran.setCenterX(700);
		lingkaran.setCenterY(350);
		lingkaran.setRadius(450);
		
		lingkaran.setFill(Color.RED);
		lingkaran.setStrokeWidth(8.0);
		lingkaran.setStroke(Color.WHITE);
		
//		durasi
		Duration dur = Duration.seconds(2);
		TranslateTransition translate = new TranslateTransition(dur, imageView1);
		translate.setToY(-150f);
		translate.setCycleCount(translate.INDEFINITE);
		translate.setAutoReverse(true);
		translate.play();
		

		TranslateTransition translate2 = new TranslateTransition(dur, imageView2);
		translate2.setToY(-150f);
		translate2.setCycleCount(translate.INDEFINITE);
		translate2.setAutoReverse(true);
		translate2.play();
		
		
		Group group = new Group(  imageView3, imageView4, imageView5, lingkaran, text1, text2, text3,imageView1, imageView2, keluarga);
		Scene scene = new Scene(group, 1280, 720);
		
		scene.setFill(Color.rgb(6, 115, 94));
		primaryStage.setTitle("Idul Fitri 1443 Hijriyah");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
