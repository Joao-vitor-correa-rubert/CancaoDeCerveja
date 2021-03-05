package cancaodecerveja;
public class CancaoDeCerveja{
    public static void main(String[]args){
        int CervejaNum = 99;
        String mundo = "garrafas ";
        
        while (CervejaNum> 0){
            if(CervejaNum == 1){
                mundo = "garafa ";    
            }//fecha if
            System.out.println(CervejaNum + " " + mundo + "Sem cerveja na parede. " );
            System.out.println(CervejaNum + " " + mundo + "Sem cerveja. ");
            System.out.println("derrubar um.");
            System.out.println("passe por ai.");
            CervejaNum = CervejaNum -1;
                if(CervejaNum > 0){
                    System.out.println(CervejaNum + " " + mundo + "Sem cerveja na parede. ");
                }else{
                    System.out.println("não há mais garrafas de cerveja na parede. ");
                }//fim do else
        }// fecha while 
    }//fecha  main 
}//fecha class