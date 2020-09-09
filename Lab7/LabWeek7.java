import javax.swing.*;

public class LabWeek7
{
    public LabWeek7()
    {
        String str1 = null;
        String str2 = "I love Java";
        String str3 = ((str1!=null)? str1 : "") + str2;
        
        System.out.println(((str1!=null)? str1 : "") +str2);
    }
    public void Testing()
    {
    String inputStr;
    int age;
    inputStr = JOptionPane.showInputDialog(null,
    "Your Age (between 0 and 130):");
    age = Integer.parseInt(inputStr);
    while (age < 0 || age > 130) {
        JOptionPane.showMessageDialog(null,
        "An invalid age was entered. Please try again.");
        inputStr = JOptionPane.showInputDialog(null,
        "Your Age (between 0 and 130):");
        age = Integer.parseInt(inputStr);
    }
    
    String[] fruit = new String[] { "Orange" , "Apple" , "Pear" , "Stawberry"};
        
        for (String oooo : fruit){
            System.out.println(oooo);
        }
}
public void play()
{
    boolean keepPlaying = true ;
    int selection;
    while (keepPlaying){

    selection = JOptionPane.showConfirmDialog(null,
    "Play Another Game?",
    "Confirmation",
    JOptionPane.YES_NO_OPTION);
    keepPlaying = (selection == JOptionPane.YES_OPTION);
    }
}

public void nestedLoop(){
    int price;

    for (int width = 11; width <=20; width++){
        for (int length = 5; length <=25; length+=5){
            price = width * length * 19; 
            System.out.print (" " + price);
}
System.out.println("");
}
}
public void measureTime(){
    java.util.Date startTime = java.util.Date();
    for (int i = 0 ;i<=200000;i++){
        for(int j = 0; j<200000;j++){
        }
        } 
//code you want to measure the execution time
    java.util.Date endTime = new java.Date();
    long elapsedTimeInMilliSec =
    endTime.getTime() - startTime.getTime();
    
    System.out.println("Measure Time: " +elapsedTimeInMilliSec);
}
    
}
