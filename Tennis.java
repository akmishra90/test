import java.util.Scanner;
class Main
{
    public static void main(String a[])
    {
        Scanner takeInput = new Scanner(System.in);
        int win=0,lose=0;
        int testcase = takeInput.nextInt();
        boolean Result = false;
        while(testcase--!=0)
        {   boolean execute=false;
            String matchscore = takeInput.next();
            for(int i =0;i<matchscore.length();i++)
            {
                
                if(win == lose && lose == 10 && !execute)
                {
                    win =9;
                    lose =9;
                    execute = true;
                }
                if(matchscore.charAt(i)=='1')
                {
                    win++;
                    System.out.println(i+"."+win);
                    if(win==11)
                    {
                        System.out.println("WIN");
                        break;
                    }
                }
                else
                {
                    lose++;
                    if(lose==11)
                    {
                        System.out.println("LOSE");
                        break;
                    }
                }
            }
        }
    }
}
