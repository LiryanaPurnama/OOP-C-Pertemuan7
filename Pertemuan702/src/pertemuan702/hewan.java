package pertemuan702;

/**
 *
 * @author ASUS
 */
public class hewan {
   private String nama="";
   public String suara;
   
   protected void setNama(String nm){
       this.nama = nm;
   }
   
   public String getNama(){
       return this.nama;
   }
   
   public void setSuara(String su){
       this.suara = su;
   }
   
   public String getSuara(){
       return this.suara;
   }
}
