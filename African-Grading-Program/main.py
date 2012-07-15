## Importing Standard Libraries ##
import sys

class African_Grading_Program():
    ## Begin License ##
    print ""
    print ""
    print "African Grading Program (Python Version)  Copyright (C) 2012  Cody Dostal"
    print "This program comes with ABSOLUTELY NO WARRANTY; for details, go to http://www.gnu.org/licenses/gpl-3.0.html."
    print "This is free software, and you are welcome to redistribute it"
    print "under certain conditions; go to http://www.gnu.org/licenses/gpl-3.0.html for details."
    ## End License ##
    
    ## Two empty lines ##
    print ""
    print ""
    
    print "Please enter your full name:"
    name = raw_input()
    print "Welcome " + name + ", this is a basic Python program based off of Raindolf Owusu's C++ version."
    print "This program asks for a numerical percentile grade, and returns the letter grade, and an"
    print "interpretation of the grade."
    print "At any time, type any number greater than 100, less than 0 to quit."
    print ""
    while True:
        print "Please enter your numerical examination score: "
        num_marks = int(input())
        
        if 70 <= num_marks <= 100:
            print "Your grade is an A, and it is interpreted as an excellent score."
            
        elif 65 <= num_marks <= 69:
            print "Your grade is an A-, and it is interpreted as a very good score."
            
        elif 60 <= num_marks <= 64:
            print "Your grade is a B+, and it is interpreted as a good score."
            
        elif 55 <= num_marks <= 59:
            print "Your grade is a B, and it is interpreted as an above average score."
            
        elif 50 <= num_marks <= 54:
            print "Your grade is a B-, and it is interpreted as an average score."
            
        elif 45 <= num_marks <= 49:
            print "Your grade is a C+, and it is interpreted as a passing grade."
            
        elif 40 <= num_marks <= 44:
            print "Your grade is a C, and it is interpreted as a passing grade."
            
        elif 30 <= num_marks <= 39:
            print "Your grade is a D, and it is interpreted as a failing grade."
            
        elif 0 <= num_marks <= 29:
            print "Your grade is an F, and it is interpreted as a failing grade."
            
        else:
            print ""
            print ""
            print "Thank you for using the Python version of Raindolf Owusu's African Grading Program."
            print "This python version was written by Cody Dostal. The original C++ version was written by Raindolf Owusu."
            print "If you have found any bugs, please email me at dostalcody@gmail.com"
            print "You may view the license for this program at http://www.gnu.org/licenses/gpl-3.0.html"
            sys.exit()
