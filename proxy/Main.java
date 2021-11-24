package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ProxyImage> folder = new ArrayList<>();

        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary

        image1.showData();
        image2.showData();

        System.out.println("Foldering....");

        folder.add(new ProxyImage("Proxy_Image_123"));
        folder.add(new ProxyImage("Image_in_Folder_2"));
        


        for(int i = 0; i < folder.size(); i++) {
            System.out.println(folder.get(i).showData());
            folder.get(i).displayImage();
        }
    }
}
