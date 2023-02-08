import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

class Eschool {
    private String name;
    private int zipcode;
    private String address;
    private String tel;
    private double latitude;
    private double longitude;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setZipcode(int z) {
        zipcode = z;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setTel(String t) {
        tel = t;
    }

    public String getTel() {
        return tel;
    }

    public void setLatitude(double la) {
        latitude = la;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLongitude(double lo) {
        longitude = lo;
    }

    public double getLongitude() {
        return longitude;
    }
}

class Rp7 {
    static Eschool[] eslist = new Eschool[100];

    public static void main(String[] args) {
        int i = 0;
        try {
            File file = new File("shougakkou-utf.csv"); // input the csv file name
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) { // read a line from the file
                String str = sc.nextLine();
                String[] tmp = str.split(",", 6);
                if (tmp.length == 6) {
                    /*
                     * Please enable below two lines after creating constructor
                     * Eschool es = new Eschool(tmp[0], Integer.parseInt(tmp[1]),
                     * tmp[2], tmp[3], Double.parseDouble(tmp[4]), Double.parseDouble(tmp[5]));
                     */
                    Eschool es = new Eschool(); // delete this line after creating constructor
                    eslist[i] = es; // store the instance to the list
                    i++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.print(e);
        }
    }
}