/*This is a simple console program that provides the grade and its interpretation of any given examination numerical marks.You can contribute
so that we can make a GUI app for this program that will also be able to calculate the GPA */




#include <iostream>


#include <string>

using namespace std;

int main()
{

	string name;
	int num_marks;   //num_marks refers to numerical marks

	cout << "Please Enter your name : ";
	getline(cin,name); // Fullname
cout << "Welcome " << name << ", This is a simple C++ program that provides the Grade and " << endl << "interpretation of "
<< "any given examination numerical marks.Press Zero to Exit." << endl;
cout << endl;

// Seting Up a loop

do{cout << "Please enter Examination score : ";
	cin >> num_marks;

	//Using nested if statement

	if (( num_marks >= 70) && ( num_marks <= 100 ))
	{
		cout << "\n GRADE: " << "A" << "\n INTERPRETATION: " << "Excellent";
	};
	 if((num_marks >= 65) && ( num_marks <= 69))
	{
		cout << "\n GRADE: " << "A-" << "\n INTERPRETATION: " << "Very Good";
	};
 if((num_marks >= 60) && ( num_marks <= 64))
	{
		cout << "\n GRADE: " << "B+" << "\n INTERPRETATION: " << "Good";
	};

 if((num_marks >= 55) && ( num_marks <= 59))
	{
		cout << "\n GRADE: " << "B" << "\n INTERPRETATION: " << "Above Average";
	};
 if((num_marks >= 50) && ( num_marks <= 54))
	{
		cout << "\n GRADE: " << "B-" << "\n INTERPRETATION: " << "Average";
	};
		 if((num_marks >= 45) && ( num_marks <= 49))
	{
		cout << "\n GRADE: " << "C+" << "\n INTERPRETATION: " << "Pass";
	};
 if((num_marks >= 40) && ( num_marks <= 44))
	{
		cout << "\n GRADE: " << "C" << "\n INTERPRETATION: " << "Pass";
	};
		 if((num_marks >= 30) && ( num_marks <= 39))
	{
		cout << "\n GRADE: " << "D" << "\n INTERPRETATION: " << "Fail";
	};
		if ( num_marks < 30 )
		{
			cout << "\n GRADE: " << "F" << "\n INTERPRETATION: " << "Fail";
		};
    cout << endl;
} while(num_marks > 0);
	   cout << "Thank you," << name << " for using this program :) " << endl;
	   return 0;
	   
	   // Send your Emails for comments,questions and any suggestions. www.oasiswebsoft.com iraindolf@yahoo.com and www.facebook.com/oasisweb..Thank you.

}