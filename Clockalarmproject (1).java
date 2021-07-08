 class Clockalarm{
     int Hours,Minutes,Seconds;
    public void tick(){
        Seconds=Seconds+1;
        Minutes=Minutes+Seconds/60;
        Hours=Hours+Minutes/60;
        Seconds=Seconds%60;
        Minutes=Minutes%60;
        Hours=Hours%24;
    }
    public void show(){
        System.out.print(Hours+":"+Minutes+":"+Seconds);
        System.out.println();
    }
}
 class alarm extends Clockalarm{
    private int SetSeconds,SetMinutes,SetHours;
    public alarm(int a, int b, int c){
        SetHours=a;
        SetMinutes=b;
        SetSeconds=c;
    }
    public void tick(){
        Seconds=Seconds+1;
        Minutes=Minutes+Seconds/60;
        Hours=Hours+Minutes/60;
        Seconds=Seconds%60;
        Minutes=Minutes%60;
        Hours=Hours%24;
        if(Hours==SetHours&&Minutes==SetMinutes&&Seconds==SetSeconds){
            System.out.println("**************");//that mean alarm is working
            System.out.println(Hours+":"+Minutes+":"+Seconds+"       "+SetHours+":"+SetMinutes+":"+SetSeconds);

        }

    }
 }

public class Clockalarmproject{
    public static void main(String[]args){
        alarm A = new alarm(0,0,5);
        A.tick();
        A.tick();
        A.tick();
        A.tick();
        A.tick();
    
     
    }
}
