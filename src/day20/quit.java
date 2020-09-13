package day20;

/**
 * @ClassName quit
 * @Deacription:
 * @Author zzx
 * @Date 2020/9/5 15:49
 **/

public class quit {
    public int mySqrt(int x) {
        int l=0;
        int r=x;
        int ans=0;
        while(l<=r){

            int index=(l+r)/2;
            if(index*index == x){
                return index;
            }
            if(index*index > x){

                r=index-1;
            }else{
                ans=index;
                l=index+1;
            }
        }
        return ans;


    }

    public static void main(String[] args) {
        quit quit = new quit();
        System.out.println(quit.mySqrt(9));
    }

}
