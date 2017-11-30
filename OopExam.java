import java.util.Random;
import java.util.*;

public class OopExam {

private int playerScore = 0;
private int dealerScore = 0;
private int hiden = 0;
private boolean check1 = true;
private boolean check2 = true;


public void start()
{
String decission = "";

int pick = 0;

Scanner sc = new Scanner(System.in);

init();

while(true)
{

if(playerScore >= 22)
{
System.out.println("DEALER WIN");

return;



}

System.out.println("Would you like to \"hit\" or \"stay\"?");

decission = sc.nextLine();


if(decission.equals("hit"))
{
pick = pickcard();

System.out.println("You drew a "+pick+".");

playerScore = playerScore + pick;

System.out.println("Your total is "+playerScore);

}

else
{
System.out.println("Okay, dealer's turn.");

break;

}


}


System.out.println("His hidden card was a "+hiden+".");

System.out.println("His Total Was "+dealerScore);

while(true)
{
if(dealerScore >= 22)
{
System.out.println("YOU WIN");

return;


}

while(makeDecission(dealerScore))
{

if(dealerScore >= 22)
{
System.out.println("YOU WIN");

return;


}

System.out.println("Dealer chooses to hit.");

pick = pickcard();

System.out.println("He Drew a "+pick);

dealerScore = dealerScore + pick;

System.out.println("His Total is "+dealerScore);


}

 

if(dealerScore >= 22)
{
System.out.println("YOU WIN");
return;


}

System.out.println("Dealer Stays");




System.out.println("Dealer total is "+dealerScore);
System.out.println("Your total is "+playerScore);

if(dealerScore >= 22)
{
System.out.println("YOU WIN");
return;


}

if(playerScore >= 22)
{

System.out.println("DEALER WINS");
return;


}

if(dealerScore > playerScore)
{
System.out.println("DEALER WINS");
return;


}
else if(dealerScore < playerScore)
{

System.out.println("YOU WIN");
return;


}

else
{
System.out.println("DEALER WINS");
return;


}


}


}


public boolean makeDecission(int x)
{
if( x>= 16)
{
return false;


}

else
return true;

}


public int pickcard()
{
Random r = new Random();
int pickCard = 0;

while(true)
{
pickCard = r.nextInt() % 12;

if(pickCard >=2 && pickCard <= 11)
{

break;


}


}

return pickCard;


}

public void init()
{
int pick1 = 0;
int pick2 = 0;


System.out.println("Welcome To Mehedy's BlackJack Program!");

pick1 = pickcard();
pick2 = pickcard();

System.out.println("You get a "+pick1+" and a "+pick2);
playerScore = pick1 + pick2;

System.out.println("Your Tottal is "+playerScore);

pick1 = pickcard();
pick2 = pickcard();

System.out.println("The dealer has a "+pick1+" showing, and a hidden card.");

dealerScore = pick1 + pick2;

hiden = pick2;


System.out.println("His total is hidden, too.");

}


public static void main(String[] args)
{


OopExam ob1 = new OopExam();

ob1.start();

}

}