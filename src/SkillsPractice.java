import javax.swing.JOptionPane;

public class SkillsPractice {
public static void main(String[] args) {

SkillsPractice skills = new SkillsPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int dimes1 = Integer.parseInt(dimes);

int cents = dimes1*10;

JOptionPane.showMessageDialog(null, "You have "+cents+ " cents" );

String inches = JOptionPane.showInputDialog("How tall are you in inches?");
int inches1 = Integer.parseInt(inches);

if(inches1<36) {
	JOptionPane.showMessageDialog(null, "Eat your Wheaties!");
}



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
	for (int i = 0; i < 10; i++) {
	
	}







}

void skill3() { // Get a random number that is less than 20 and print it to the console 



// Get another random number that is less than 10 and print it to the console 



// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 



}

void skill4() { // In a pop-up, ask the user for the city they live in 
String city = JOptionPane.showInputDialog("What city do you live in?");


// If they answered "San Diego", tell them they live in Americ's Finest City
if(city  ("San Diego")) {
	
} else {
	JOptionPane.showMessageDialog(null, "You should move to San Diego.");
}



// Otherwise, tell them to move to San Diego



// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 



// If there is 1 car, use a pop-up to display the make/model of the car 



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



}

void skill5() {
String school = JOptionPane.showInputDialog("What school do you go to?");

JOptionPane.showConfirmDialog(null, school+" is a fantastic school!");


}
}