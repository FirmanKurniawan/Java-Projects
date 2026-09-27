package id.akdev.jopencv;

import org.opencv.core.Core;
import org.opencv.core.Scalar;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

public class MainProgram{
    public static void main(String[] args){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat gambar = Imgcodecs.imread("images/gambar2.png");
        CascadeClassifier cc = new CascadeClassifier("xml/lbpcascade_frontalface.xml");

        MatOfRect faceDetection = new MatOfRect();
        cc.detectMultiScale(gambar, faceDetection);

        for(Rect rect: faceDetection.toArray()){
            Imgproc.rectangle(gambar, new Point(rect.x , rect.y),
                    new Point(rect.x + rect.width,rect.y + rect.height),
                    new Scalar(0, 255, 0), 2);
        }

        Imgcodecs.imwrite("images/gambarHasil.png", gambar);
        HighGui.imshow("Jumlah wajah terdeteksi : " + faceDetection.toArray().length + " wajah", gambar);
        HighGui.waitKey();
    }
}