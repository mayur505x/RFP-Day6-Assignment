import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        StopWatch sw=new StopWatch();

        System.out.print("Press '1' to Start Time: ");
        scan.nextInt();
        sw.start();
        System.out.println("------------------------------");

        System.out.print("Press '2' to Stop Time: ");
        scan.nextInt();
        sw.stop();
        System.out.println("==============================");

        long l=sw.ElapsedTime();
        System.out.println("Total Time Elapsed is: "+(l/1000)+" sec");
        System.out.println("==============================");
    }
        public long startTimer=0;
        public long stopTimer=0;
        public long elapsed;

    //to start timer
    public void start() {
    
        startTimer=System.currentTimeMillis();
        System.out.println("Start Time is: "+startTimer);
    }

    // to stop timer
    public void stop() {
  
        stopTimer=System.currentTimeMillis();
        System.out.println("Stop Time is: "+stopTimer);
    }

    //to calculate elapsed time
    public long ElapsedTime() {
	
        elapsed=stopTimer-startTimer;
        return elapsed;
    }

}
