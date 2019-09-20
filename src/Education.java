/**
 * Included a year graduated.
 */
public class Education {
    private String universityName;
    private String universityAddress;
    private Double gradePointAverage;
    private Boolean graduated;
    private String degree;
    private String yearGraduated;

    // Methods
    public String printEducation() {
        StringBuilder sbEd = new StringBuilder();
        sbEd.append("University: ");
        sbEd.append(getUniversityName());
        sbEd.append("\nLocation:   ");
        sbEd.append(getUniversityAddress());
        sbEd.append("\nDegree:     ");
        if (getGraduated()) {
            sbEd.append(getDegree());
            sbEd.append(", ");
            sbEd.append(getYearGraduated());                    // Added year graduated
        }
        else {
            sbEd.append("Pending");
        }
        sbEd.append("\n");

        return sbEd.toString();
    }


    // Constructors
    public Education() {
    }

    public Education(String universityName, String universityAddress, Double gradePointAverage, Boolean graduated, String degree, String other) {
        this.universityName = universityName;
        this.universityAddress = universityAddress;
        this.gradePointAverage = gradePointAverage;
        this.graduated = graduated;
        this.degree = degree;
        this.yearGraduated = yearGraduated;
    }

    // Getters and Setters
    public String getUniversityName() {
        return universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }
    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    public Double getGradePointAverage() {
        return gradePointAverage;
    }
    public void setGradePointAverage(Double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    public Boolean getGraduated() {
        return graduated;
    }
    public void setGraduated(Boolean graduated) {
        this.graduated = graduated;
    }

    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getYearGraduated() {
        return yearGraduated;
    }
    public void setYearGraduated(String yearGraduated) {
        this.yearGraduated = yearGraduated;
    }
}