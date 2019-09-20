import java.util.ArrayList;

public class Resume {
    // Personal Information
    private String name;
    private String email;
    private String linkeIn;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;

    // Education
    ArrayList<Education> education = new ArrayList<>();

    // Work Experience
    ArrayList<WorkExperience> workExperience = new ArrayList<>();

    // Skills
    private Skills tSkills = new Skills();                  // technical skills
    private Skills mSkills = new Skills();                  // management skills
    private Skills cSkills = new Skills();                  // certifications

    // Printing Resume information
    //  Printing personal information
    public String printPersonal() {
        StringBuilder sbrp = new StringBuilder();
        sbrp.append("RESUME:\n=======");
        sbrp.append("\nName:     ");
        sbrp.append(getName());
        sbrp.append("\nEmail:    ");
        sbrp.append(getEmail());
        sbrp.append("\nLinkedIn: ");
        sbrp.append(getLinkeIn());
        sbrp.append("\nPhone:    ");
        sbrp.append(getPhone());
        sbrp.append("\n\nAddress: ");
        sbrp.append(getAddress());
        sbrp.append("\nCity:    ");
        sbrp.append(getCity());
        sbrp.append("\nState:   ");
        sbrp.append(getState());
        sbrp.append("     Zip: ");
        sbrp.append(getZip());
        sbrp.append("\n");

        return sbrp.toString();
    }

    // Resume constructors
    public Resume() {
    }

    public Resume(String name, String email, String linkeIn, String address, String city,
                  String state, String zip, String phone, ArrayList<Education> education,
                  ArrayList<WorkExperience> workExperience, Skills tSkills, Skills mSkills) {
        this.name = name;
        this.email = email;
        this.linkeIn = linkeIn;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.education = education;
        this.workExperience = workExperience;
        this.tSkills = tSkills;
        this.mSkills = mSkills;
    }

    // Getters and Setters
    // Personal Information
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Education> getEducation() {
        return education;
    }
    public void setEducation(ArrayList<Education> education) {
        this.education = education;
    }

    public ArrayList<WorkExperience> getWorkExperience() {
        return workExperience;
    }
    public void setWorkExperience(ArrayList<WorkExperience> workExperience) {
        this.workExperience = workExperience;
    }

    // Skills
    public Skills getTSkills() {
        return tSkills;
    }
    public void setTSkills(Skills tSkills) {
        this.tSkills = tSkills;
    }

    public Skills getMSkills() {
        return mSkills;
    }
    public void setMSkills(Skills mSkills) {
        this.mSkills = mSkills;
    }

    public Skills getCSkills() {
        return cSkills;
    }
    public void setCSkills(Skills cSkills) {
        this.cSkills = cSkills;
    }

    public String getLinkeIn() {
        return linkeIn;
    }
    public void setLinkeIn(String linkeIn) {
        this.linkeIn = linkeIn;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() { return city; }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}