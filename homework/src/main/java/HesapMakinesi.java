
public class HesapMakinesi {
    
    public void toplama(int a, int b){
        int toplam=a+b;
        System.out.println("toplam:" +toplam );
    }
 
    public void bolme(int a,int b){
        if (b==0) {
            System.out.println("bölen 0 olamaz");
        }
        else{
            double bolme=a/b;
            System.out.println("bölüm:"+bolme);
    }}
    
}
