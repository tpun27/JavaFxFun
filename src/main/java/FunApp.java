import java.io.FileInputStream;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FunApp extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    URL imageUrl = getClass().getClassLoader().getResource("fun2.png");
    Image image = new Image(new FileInputStream(imageUrl.getFile()));
    ImageView imageView = new ImageView(image);

    URL fileUrl = getClass().getClassLoader().getResource("BoardInfo.fxml");
    AnchorPane root = FXMLLoader.load(fileUrl);
    GridPane gridPane = (GridPane) root.getChildren().get(0);
//    for (int i = 0; i < gridPane.getChildren().size(); i++) {
//      Pane pane = (Pane) gridPane.getChildren().get(i);
//    }
    gridPane.add(imageView, 7,6);
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
  }
}
