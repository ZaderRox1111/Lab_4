package package_4;

public class Greatest
   {

      // Table characters
      private static final char THIN_LINE = '-';
      private static final char THICK_LINE = '=';
      private static final char PIPE = '|';
      private static final String PIPE_SPACE = "| ";
      private static final String SPACE_PIPE = " |";
      
      // Table values
      private static final int TWO_ENDLINES = 2;
      private static final int TABLE_WIDTH = 60;
      private static final int TITLE_WIDTH = 34;
      private static final int LEFT_COLUMN_WIDTH = 40;
      private static final int RIGHT_COLUMN_WIDTH = 17;
      
      // Precision
      private static final int PRECISION = 3;
      
      // Instantiating the conIO class
      private static Console_IO_Class conIO = new Console_IO_Class();
      
      public static void main(String[] args)
         {
            // TODO Auto-generated method stub

            // Declare variables
            double firstNum, secondNum, thirdNum, result;
            
            // Show title and thick line
             // Method: printString, printChars, printEndline
            conIO.printString("FIND THE GREATEST OF THREE NUMBERS");
            conIO.printEndline();
            conIO.printChars(TITLE_WIDTH, THICK_LINE);
            conIO.printEndlines(TWO_ENDLINES);
            
            // Get user input
             // Method: promptForDouble
            firstNum = conIO.promptForDouble("Enter first number: ");
            secondNum = conIO.promptForDouble("Enter second number: ");
            thirdNum = conIO.promptForDouble("Enter third number: ");
            conIO.printEndline();
            
            // Get greatest number
             // Method: getGreatest
            result = getGreatest(firstNum, secondNum, thirdNum);
            
            // Display results
             // Method: displayResult
            displayResult(firstNum, secondNum, thirdNum, result);
            
            // end main
            
         }

      public static double getGreatest( double first, double second, double third )
      {
         
         if (first > second && first > third) 
         {
            return first;
         }
         else if (second > first && second > third)
         {
            return second;
         }
         else
         {
            return third;
         }
         
      }
      
      public static void displayResult( double first, double second, double third, double result )
      {
         
         conIO.printChar(PIPE);
         conIO.printChars(TABLE_WIDTH -2, THICK_LINE);
         conIO.printChar(PIPE);
         conIO.printEndline();
         
         conIO.printString(PIPE_SPACE);
         conIO.printString("First Number", LEFT_COLUMN_WIDTH -1, "LEFT");
         conIO.printString(PIPE_SPACE);
         conIO.printDouble(first, PRECISION, RIGHT_COLUMN_WIDTH -2, "RIGHT");
         conIO.printString(SPACE_PIPE);
         conIO.printEndline();
         
         conIO.printChar(PIPE);
         conIO.printChars(LEFT_COLUMN_WIDTH, THIN_LINE);
         conIO.printChar(PIPE);
         conIO.printChars(RIGHT_COLUMN_WIDTH, THIN_LINE);
         conIO.printChar(PIPE);
         conIO.printEndline();
         
         conIO.printString(PIPE_SPACE);
         conIO.printString("Second Number", LEFT_COLUMN_WIDTH -1, "LEFT");
         conIO.printString(PIPE_SPACE);
         conIO.printDouble(second, PRECISION, RIGHT_COLUMN_WIDTH -2, "RIGHT");
         conIO.printString(SPACE_PIPE);
         conIO.printEndline();
         
         conIO.printChar(PIPE);
         conIO.printChars(LEFT_COLUMN_WIDTH, THIN_LINE);
         conIO.printChar(PIPE);
         conIO.printChars(RIGHT_COLUMN_WIDTH, THIN_LINE);
         conIO.printChar(PIPE);
         conIO.printEndline();
         
         conIO.printString(PIPE_SPACE);
         conIO.printString("Third Number", LEFT_COLUMN_WIDTH -1, "LEFT");
         conIO.printString(PIPE_SPACE);
         conIO.printDouble(third, PRECISION, RIGHT_COLUMN_WIDTH -2, "RIGHT");
         conIO.printString(SPACE_PIPE);
         conIO.printEndline();
         
         conIO.printChar(PIPE);
         conIO.printChars(TABLE_WIDTH -2, THICK_LINE);
         conIO.printChar(PIPE);
         conIO.printEndline();
         
         conIO.printString(PIPE_SPACE);
         conIO.printString("Result", LEFT_COLUMN_WIDTH -1, "LEFT");
         conIO.printString(PIPE_SPACE);
         conIO.printDouble(result, PRECISION, RIGHT_COLUMN_WIDTH -2, "RIGHT");
         conIO.printString(SPACE_PIPE);
         conIO.printEndline();
         
         conIO.printChar(PIPE);
         conIO.printChars(TABLE_WIDTH -2, THICK_LINE);
         conIO.printChar(PIPE);
         conIO.printEndline();
         
      }
      
   }
