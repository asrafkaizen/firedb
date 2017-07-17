package my.com.ydkmm.firedbtest;

/**
 * Created by asrafkaizen on 7/17/2017.
 */

public class UserPOJO {

    public String nama;
    public String emel;
    public String fon;

    public UserPOJO() {
    }

    public UserPOJO(String nama, String emel, String fon) {
        this.nama = nama;
        this.emel = emel;
        this.fon = fon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmel() {
        return emel;
    }

    public void setEmel(String emel) {
        this.emel = emel;
    }

    public String getFon() {
        return fon;
    }

    public void setFon(String fon) {
        this.fon = fon;
    }
}
