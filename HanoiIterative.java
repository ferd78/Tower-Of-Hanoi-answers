
import java.util.*;
public class HanoiIterative {


        private int nDisks;

        public HanoiIterative(int nDisks){
            this.nDisks=nDisks;
        }

        public void execute(){
            int n=nDisks;
            int limit = (int)Math.pow(2,n)-1;
            for(int i=0;i<limit;i++){
                int disk = disk(i); //
                int source = ( movements(i,disk)*direction(disk,n))%3;
                int destination = (source + direction(disk,n))%3;
                move(disk,source,destination);
            }
        }
        private int disk(int i) {
            int C, x= i+1;
            for(C=0;x%2==0;C++){
                x/=2;
            }
            return C;
        }
        private int movements(int i, int d) {
            while(d--!=0)
                i/=2;
            return (i+1)/2;
        }
        private int direction(int d,int n) {
            return 2 - (n + d)%2;
        }
        private void move(int disk, int source, int destination) {
            System.out.println("Move Disk " + (disk+1)+ " from Tower " + (source+1) + " to Tower " + (destination+1));
        }

    }

