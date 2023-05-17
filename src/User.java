// Pembuatan model user
class User {
    private String nama;
    private int tanggalLahir;
    private String tempatLahir;
    private char goldar;
    private String jenisKelaStringmin;
    private String alamatString;
    private String tanggalKadaluarsaDate;
    private char jenisSIMchar;
    private String kotaPenerbitString;

    User(String nama, int tanggalLahir, String tempatString) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tempatLahir = tempatString;
    };

    public String getAlamatString() {
        return alamatString;
    }

    public char getGoldar() {
        return goldar;
    }

    public String getJenisKelaStringmin() {
        return jenisKelaStringmin;
    }

    public char getJenisSIMchar() {
        return jenisSIMchar;
    }

    public String getKotaPenerbitString() {
        return kotaPenerbitString;
    }

    public String getNama() {
        return nama;
    }

    public String getTanggalKadaluarsaDate() {
        return tanggalKadaluarsaDate;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setAlamatString(String alamatString) {
        this.alamatString = alamatString;
    }

    public void setGoldar(char goldar) {
        this.goldar = goldar;
    }

    public void setJenisKelaStringmin(String jenisKelaStringmin) {
        this.jenisKelaStringmin = jenisKelaStringmin;
    }

    public void setJenisSIMchar(char jenisSIMchar) {
        this.jenisSIMchar = jenisSIMchar;
    }

    public void setKotaPenerbitString(String kotaPenerbitString) {
        this.kotaPenerbitString = kotaPenerbitString;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalKadaluarsaDate(String tanggalKadaluarsaDate) {
        this.tanggalKadaluarsaDate = tanggalKadaluarsaDate;
    }

    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

}
