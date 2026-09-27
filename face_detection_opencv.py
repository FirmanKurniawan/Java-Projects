import javax.swing.*;

import face.util.VideoPanel;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.objdetect.Objdetect;
import org.opencv.videoio.VideoCapture;

//Download file haarcascade_frontalface_alt.xml and save in folder OpenCV
//This is file feature extract of face

public class FaceDetection {

  public static void main(String[] args) {

    System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

    JFrame cameraFrame = new JFrame("camera");
    cameraFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    cameraFrame.setSize(740, 580);
    cameraFrame.setBounds(0, 0, cameraFrame.getWidth(), cameraFrame.getHeight());
    VideoPanel videoPanel = new VideoPanel();
    cameraFrame.setContentPane(videoPanel);
    cameraFrame.setVisible(true);

    CascadeClassifier faceCascade = new CascadeClassifier();
    faceCascade.load("OpenCV/haarcascades/haarcascade_frontalface_alt.xml");
    VideoCapture capture = new VideoCapture();
    try {
      capture.open(0);
      if (capture.isOpened()) {
        Mat image = new Mat();
        while(true) {
          capture.read(image);
          if (!image.empty()) {
            detectAndDisplay(image, faceCascade);
            videoPanel.setImageWithMat(image);
            cameraFrame.repaint();
          } else {
            break;
          }
        }
      }
    } finally {
      capture.release();
    }
  }

  public static void detectAndDisplay(Mat frame, CascadeClassifier faceCascade)
  {
    MatOfRect faces = new MatOfRect();
    Mat grayFrame = new Mat();

    // convert the frame in gray scale
    Imgproc.cvtColor(frame, grayFrame, Imgproc.COLOR_BGR2GRAY);
    // equalize the frame histogram to improve the result
    Imgproc.equalizeHist(grayFrame, grayFrame);

    // compute minimum face size (20% of the frame height, in our case)
    int absoluteFaceSize = 0;
    int height = grayFrame.rows();
    if (Math.round(height * 0.2f) > 0) {
      absoluteFaceSize = Math.round(height * 0.2f);
    }

    // detect faces
    faceCascade.detectMultiScale(grayFrame, faces, 1.1, 2, 0 | Objdetect.CASCADE_SCALE_IMAGE,
        new Size(absoluteFaceSize, absoluteFaceSize), new Size());

    // each rectangle in faces is a face: draw them!
    Rect[] facesArray = faces.toArray();
    for (int i = 0; i < facesArray.length; i++)
      Imgproc.rectangle(frame, facesArray[i].tl(), facesArray[i].br(), new Scalar(0, 255, 0), 3);
  }

}
