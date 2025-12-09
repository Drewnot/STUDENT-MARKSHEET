import java.util.Scanner;
public class loop_test {
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);

        //School details
        System.out.println("Enter School's Name");
        String school = input.nextLine();
        System.out.println("Enter Teacher's Name");
        String teacher = input.nextLine();
        System.out.println("Enter Grade's Name");
        String grade = input.nextLine();
        System.out.println("Enter School year");
        String year = input.nextLine();

        int student_number = 15;

        // Arrays to store values for each student
        String[] student_name = new String[student_number];
        double[] english_marks = new double[student_number];
        double[] maths_marks = new double[student_number];
        double[] history_marks = new double[student_number];
        double[] geography_marks = new double[student_number];
        double[] science_marks = new double[student_number];
        double[] programming_marks = new double[student_number];
        double[] student_total = new double[student_number];
        char[] student_grade = new char[student_number];
        double english_total = 0, maths_total = 0, history_total = 0, geography_total = 0, science_total = 0, programming_total = 0, class_total = 0;
        double english_average, maths_average, history_average, geography_average, science_average, programming_average, class_average;
        int F = 0, D = 0, C = 0, B = 0, A = 0;

        for (int i = 0; i < student_number; i++) {
            System.out.println("Enter Student's Name");
            student_name[i] = input.nextLine();

            System.out.println("Enter English Marks");
            english_marks[i] = input.nextDouble();
            english_total += english_marks[i];

            System.out.println("Enter Math Marks");
            maths_marks[i] = input.nextDouble();
            maths_total += maths_marks[i];

            System.out.println("Enter History Marks");
            history_marks[i] = input.nextDouble();
            history_total += history_marks[i];

            System.out.println("Enter Geography Marks");
            geography_marks[i] = input.nextDouble();
            geography_total += geography_marks[i];

            System.out.println("Enter Science Marks");
            science_marks[i] = input.nextDouble();
            science_total += science_marks[i];

            System.out.println("Enter Programming Marks");
            programming_marks[i] = input.nextDouble();
            programming_total += programming_marks[i];

            // Calculate totals
            student_total[i] = english_marks[i] + maths_marks[i] + history_marks[i] + science_marks[i] + geography_marks[i] + programming_marks[i];
            class_total += student_total[i];

            if (student_total[i] < 360.0) {
                student_grade[i] = 'F';
                F++;

            } else if (student_total[i] >= 360.0 && student_total[i] < 420.0) {
                student_grade[i] = 'D';
                D++;

            } else if (student_total[i] >= 420.0 && student_total[i] < 480.0) {
                student_grade[i] = 'C';
                C++;

            } else if (student_total[i] >= 480.0 && student_total[i] < 540.0) {
                student_grade[i] = 'B';
                B++;

            } else {
                student_grade[i] = 'A';
                A++;

            }
            // Consume the leftover newline character so nextLine() works in the next iteration
            input.nextLine();
        }
        english_average = english_total / student_number;
        maths_average = maths_total / student_number;
        history_average = history_total / student_number;
        geography_average = geography_total / student_number;
        science_average = science_total / student_number;
        programming_average = programming_total / student_number;
        class_average = class_total / student_number;

        
            final String separator1 = "------------------------------------------------------------------------------------------------";
            final String separator2 = "=================================================================================================";

            final String data_form = " %-18s %-9.2f %-9.2f %-9.2f %-11.2f %-13.2f %-6.2f %-10.2f %-7c %n";
            final String header_form = " %-18s %-9s %-9s %-9s %-10s %-9s %-12s %-8s %-7s %n";
            final String school_form = "%-35s %-11s %-16s %n";
            final String teacher_form = "%-39s %-9s %-16s %n";
            final String grade_form = "%-41s %-5s %-16s %n" ;
            final String year_form = "%-42s %-4s %-16s %n" ; // Added %n to ensure the separator starts on a new line
            final String Rank_form = " %-18s %-9s %-4s %-4d %-4s %-4d %-4s %-4d %-4s %-4d %-4s %-4d %n";

            //Output format
            System.out.println(separator1);
            System.out.printf(school_form, " ", "School Name: ", school);
            System.out.printf(teacher_form, " ", "Teacher: ", teacher);
            System.out.printf(grade_form, " ", "Grade: ", grade);
            System.out.printf(year_form, " ", "Year: ", year);
            System.out.println(separator2);
            System.out.printf(header_form, "Student Name","English","Maths","History","Geography","Science","Programming","Total","Rank");
            System.out.println(separator2);
            for (int i = 0; i < student_number; i++) {
                System.out.printf(data_form, student_name[i], english_marks[i], maths_marks[i], history_marks[i], geography_marks[i], science_marks[i], programming_marks[i], student_total[i], student_grade[i]);
            }
            System.out.println(separator1);

            System.out.printf(data_form," ", english_total, maths_total, history_total, geography_total, science_total, programming_total, class_total, ' ');
            System.out.println(separator1);
            
            System.out.printf(data_form," ", english_average, maths_average, history_average, geography_average, science_average, programming_average, class_average, ' ');
            System.out.println(separator2);
            System.out.printf(Rank_form," ", "Ranks", "A's:" ,A, "B's:",B, "C's:",C, "D's:",D, "F's:",F );
        
        }
    }
