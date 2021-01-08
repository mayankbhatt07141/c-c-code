public class Carrom {

    public int collision=3,x=3,y=1,N=4;

    public void getCordinate(){
    //hitting coin and coin will strike first time
        while((x!=N)&&(y!=N)){
            x++;
            y++;
        }
        if((x==N)&&(y==N)){
           System.out.println(x+" "+y);
            return;
        }
        collision--;

        //coin will strike again 
        while(collision>0){
            if(x==N&&y<N){
                collision--;
                // System.out.println(x +" "+y );
                while(y!=N&&x>0){
                    x--;
                    y++;
                    // System.out.println(x +" "+y ); 
                }
            }

           else if(y==N&&x<N){
                collision--;
                while(x!=0){
                    x--;
                    y--;
                }
            }

            else if(x==0&&y>0){
                collision--;
                while(y!=0){
                    x++;
                    y--;
                }
            }

            else if(y==0&&x>0){
                collision--;
                while(x!=0){
                    x--;
                    y++;
                }
            }

            if((x==0&&y==0)&&(x==N&&y==0)&&(x==N&&y==N)&&(x==0&&y==N)){
               System.out.println(x +" "+y );
               return;
            }

        }
        System.out.println(x +" "+y );


    }
    public static void main(String[] args) {
        Carrom Raja=new Carrom();
        Raja.getCordinate();
}

}
