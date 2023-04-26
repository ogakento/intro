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

    public Eschool(String name, int zipcode, String address, String tel, double latitude, double longitude) {
        this.name = name;
        this.zipcode = zipcode;
        this.address = address;
        this.tel = tel;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return " " + name + ": 〒" + zipcode + " " + address + " TEL: " + tel + " " + latitude + "," + longitude;
    }
}

class Rp7 {
    static Eschool[] eslist = new Eschool[100];
    
    public static void main(String[] args){
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the zipcode: ");
        int zip = scan.nextInt();

        try {
            File file = new File("shougakkou-utf.csv");  // input the csv file name
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){                       // read a line from the file
                String str = sc.nextLine();               
                String[] tmp = str.split(",", 6);          
                if (tmp.length == 6){                      

			       Eschool es = new Eschool(tmp[0], Integer.parseInt(tmp[1]),
			       tmp[2], tmp[3], Double.parseDouble(tmp[4]), Double.parseDouble(tmp[5]));

				    eslist[i] = es;                       // store the instance to the list
                    i ++;

                    //System.out.println(es);

                    if (zip == es.getZipcode()) {
                        System.out.println(tmp[0]);
                        break;
                    } else if(!(sc.hasNextLine())){
                        System.out.println("No such zipcode");
                    }
                }
            }
        } catch (FileNotFoundException e){
            System.err.print(e);
        }
    }
}