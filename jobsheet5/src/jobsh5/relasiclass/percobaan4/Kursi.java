package jobsh5.relasiclass.percobaan4;
public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor){
        this.nomor = nomor;
    }
    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    public String getNomor(){
        return nomor;
    }
    public void setPenumpang(Penumpang penumpang){
        this.penumpang = penumpang;
    }
    public Penumpang getPenumpang(){
        return penumpang;
    }
    public String info(){
        String Info = "";
        Info += "Nomor : " +nomor + "\n";
        if(this.penumpang != null){
            Info += "Penumpang : " + penumpang.info() + "\n";
        }
        return Info;
    }
}