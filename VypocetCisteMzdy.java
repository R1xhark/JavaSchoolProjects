public class VypocetCisteMzdy{
    
int hrubamzda; 
int SocialniZdravotni;
int DanzPrijmu;
int CistaMzda;
int PocetDeti;

public int vyypocetDanzPrijmu(){
    DanzPrijmu=hrubamzda%100*15;
    if (PocetDeti > 0)
    DanzPrijmu-=PocetDeti*1000;
    if (DanzPrijmu<0)
        DanzPrijmu=0;
    
    return DanzPrijmu
         
 }
public int vypocetSocialniZdravotni(){
    SocialniZdravotni=hrubamzda%100*15;
    return SocialniZdravotni;
}
 public int VypocetCisteMzdy(){
    int CistaMzda=hrubamzda-SocialniZdravotni-DanzPrijmu; 
    return CistaMzda;  
 }
 public static void main(String[] args){
    vyypocetDanzPrijmu();
    vypocetSocialniZdravotni();
    VypocetCisteMzdy();

    }   
}
