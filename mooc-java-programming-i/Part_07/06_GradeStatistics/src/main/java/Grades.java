import java.util.ArrayList;
public class Grades {
    private ArrayList<Integer> grades;

    public Grades() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double averageOfGrades(int threshold) {
        int sum = 0;
        int count = 0;
        for (int grade : this.grades) {
            if (grade >= threshold) {
                sum += grade;
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return 1.0 * sum / count;
    }

    public double averageOfGrades() {
        return averageOfGrades(0);
    }

    public double thresholdCount(int lower, int upper) {
        int count = 0;
        for (int grade : this.grades) {
            if (grade >= lower && grade <= upper) {
                count++;
            }
        }
        return count;
    }
    
    public double passPercentage() {
        return 100.0 * thresholdCount(50, 100) / this.grades.size();
    }


}
