import java.util.ArrayList;

/**
 * Put duplicate code into a separate method
 */

public class Skills {

    private ArrayList<String> skills = new ArrayList<>();

    // Helper methods
    public void putString(String str) {
        skills.add(str);
    }

    public StringBuilder formatColumns(int i, StringBuilder sb, Skills s) {
        sb.append("\n   * ");
        sb.append(s.getSkills().get(i));
        for (int j = 0; j < (40 - (s.getSkills().get(i).length() + 5)); j++) {
            sb.append(" ");
        }
        sb.append("   * ");
        sb.append(s.getSkills().get(i + 1));
        sb.append("\n");

        return sb;
    }

    public String printSkills(String header, Skills sk) {
        StringBuilder sbts = new StringBuilder();
        sbts.append(header);
        sbts.append("\n==================");
        if ((sk.getSkills().size()) % 2 == 0) {
            for (int i = 0; i < sk.getSkills().size(); i = i + 2) {
                sbts = formatColumns(i, sbts, sk);
            }
        }
        else {
            for (int i = 0; i < sk.getSkills().size() - 1; i = i + 2) {
                sbts = formatColumns(i, sbts, sk);
            }
            sbts.append("   * ");
            sbts.append(sk.getSkills().get(sk.getSkills().size()-1));       // Problem child, remember to subtract 1
            sbts.append("\n");
        }
        sbts.append("\n");

        return sbts.toString();
    }

    public String printCertifications(Skills sk) {
        StringBuilder sbc = new StringBuilder();
        sbc.append("Certifications:\n");
        sbc.append("---------------\n");

        for (int i = 0; i < sk.getSkills().size(); i++) {
            sbc.append("  * ");
            sbc.append(sk.getSkills().get(i));
            sbc.append(("\n"));
        }
        sbc.append(("\n"));

        return sbc.toString();
    }

    // Constructors
    public Skills() {
    }
    public Skills(ArrayList<String> skills) {
        this.skills = skills;
    }

    // Getters and setters
    public ArrayList<String> getSkills() {
        return skills;
    }
    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}