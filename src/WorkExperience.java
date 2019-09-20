import java.util.ArrayList;

public class WorkExperience {
    private String jobCompany;
    private String jobCompanyAddress;
    private String jobTitle;
    private String jobDescription;
    private String jobManager;
    private boolean canContact;
    private String jobManagerPhone;
    private ArrayList<String> jobDuties = new ArrayList<>();

    // Methods
    public void putString(String inp) {
        jobDuties.add(inp);
    }

    public String printWorkExperience() {
        StringBuilder sbWe = new StringBuilder();

        sbWe.append("Company Information:");
        sbWe.append("\n--------------------");
        sbWe.append("\nCompany:    ");
        sbWe.append(getJobCompany());
        sbWe.append("\nLocation:   ");
        sbWe.append(getJobCompanyAddress());
        sbWe.append("\n\nJob Information:");
        sbWe.append("\n----------------");
        sbWe.append("\nJob Title:  ");
        sbWe.append(getJobTitle());
        sbWe.append("\nManager:    ");
        sbWe.append(getJobManager());
        if (isCanContact()) {
            for (int j = 0; j < (40 - (getJobManager().length() + 9)); j++) {
                sbWe.append(" ");
            }
            sbWe.append("Phone: ");
            sbWe.append(getJobManagerPhone());
        }
        sbWe.append("\n\nJob Description:");
        sbWe.append("\n----------------\n");
        sbWe.append(getJobDescription());
        sbWe.append("\n\nJob Duties:");
        sbWe.append("\n-----------\n");
        for (String jobDuty : getJobDuties()) {
            sbWe.append("  * ");
            sbWe.append(jobDuty);
            sbWe.append("\n");
        }

        return sbWe.toString();
    }

    // Constructors
    public WorkExperience() {
    }

    public WorkExperience(String jobCompany, String jobCompanyAddress, String jobTitle,
                          String jobDescription, String jobManager, boolean canContact,
                          String jobManagerPhone, ArrayList<String> jobDuties) {
        this.jobCompany = jobCompany;
        this.jobCompanyAddress = jobCompanyAddress;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.jobManager = jobManager;
        this.canContact = canContact;
        this.jobManagerPhone = jobManagerPhone;
        this.jobDuties = jobDuties;
    }

    // Getters and Setters
    public String getJobCompany() {
        return jobCompany;
    }
    public void setJobCompany(String jobCompany) {
        this.jobCompany = jobCompany;
    }

    public String getJobCompanyAddress() {
        return jobCompanyAddress;
    }
    public void setJobCompanyAddress(String jobCompanyAddress) {
        this.jobCompanyAddress = jobCompanyAddress;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobManager() {
        return jobManager;
    }
    public void setJobManager(String jobManager) {
        this.jobManager = jobManager;
    }

    public boolean isCanContact() {
        return canContact;
    }
    public void setCanContact(boolean canContact) {
        this.canContact = canContact;
    }

    public String getJobManagerPhone() {
        return jobManagerPhone;
    }
    public void setJobManagerPhone(String jobManagerPhone) {
        this.jobManagerPhone = jobManagerPhone;
    }

    public ArrayList<String> getJobDuties() {
        return jobDuties;
    }
    public void setJobDuties(ArrayList<String> jobDuties) {
        this.jobDuties = jobDuties;
    }

}