import java.util.Scanner;

/**
 * This class is responsible for entering information for a resume:
 * The resume will include
 *      A general personal information section
 *      A work experience section
 *      An educations section
 *      A skills section
 *
 *  Once all this information has bee filled in, the program will print
 *  out a formatted resume.
 *
 *  Changes for the Bonus app:
 *      Included the ability to re-enter personal information
 *      Included a year of graduation for the education section
 *      Duplicated code in the Skills class was put into a separate method
 *      Created a Certifications section
 *
 */

public class RoboResumeBonus {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        String input;
        boolean tmpBool;                // used in some of the questions below
        Resume yourResume = null;

        // Start of the Robo Resume questions
        System.out.println("Would you like to create a resume? (Y|N)");
        input = keybd.nextLine();
        if (input.equalsIgnoreCase("y")) {
            yourResume = new Resume();
        }
        else {
            System.out.println("Please return to this fabulous app when your are ready.");
            System.exit(0);
        }

        // Enter your personal/specific information
        boolean personalInfo = true;
        while (personalInfo) {
            System.out.print("What is your full name: ");
            input = keybd.nextLine();
            yourResume.setName(input);

            System.out.print("What is your email address: ");
            input = keybd.nextLine();
            yourResume.setEmail(input);

            System.out.print("What is your linkedIn accout address: ");
            input = keybd.nextLine();
            yourResume.setLinkeIn(input);

            System.out.print("What is your current address: ");
            input = keybd.nextLine();
            yourResume.setAddress(input);

            System.out.print("What is your city of residence: ");
            input = keybd.nextLine();
            yourResume.setCity(input);

            System.out.print("What is your state: ");
            input = keybd.nextLine();
            yourResume.setState(input);

            System.out.print("What is your zip: ");
            input = keybd.nextLine();
            yourResume.setZip(input);

            System.out.print("What is your phone number: ");
            input = keybd.nextLine();
            yourResume.setPhone(input);

            System.out.println("Your personal information will be printed out.");
            System.out.println("Please check the information that you entered to make sure it is correct.");
            System.out.println("If there are issues, you will have a chance to re-enter your information.");
            System.out.println("Here is what you entered:\n");
            System.out.println(yourResume.printPersonal());
            System.out.println("\nIs everything correct? (Y|N)");
            input = keybd.nextLine();
            if (input.equalsIgnoreCase("y")) {
                System.out.println("Great!  Entering your work experience is next.");
                personalInfo = false;
            }
            else {
                System.out.println("Do you want to re-enter your personal date? (Y|N)");
                System.out.println("\tNOTE: if you enter \"N\", you will exit the program.");
                input = keybd.nextLine();
                if (input.equalsIgnoreCase("n")) {
                    System.out.println("Good-bye.");
                    System.exit(0);
                }
            }
            System.out.println("This ends the personal information section");
        }


        // Enter your work experience
        System.out.println("Do you have any work experience: (Y|N)");
        input = keybd.nextLine();
        if (input.equalsIgnoreCase("y")) {
            boolean continueWork = true;

            while (continueWork) {
                WorkExperience wk = new WorkExperience();

                System.out.println("What is the name of the company that you worked for:");
                input = keybd.nextLine();
                wk.setJobCompany(input);

                System.out.println("What is the address of the company that you worked for:");
                input = keybd.nextLine();
                wk.setJobCompanyAddress(input);

                System.out.println("What was the job title:");
                input = keybd.nextLine();
                wk.setJobTitle(input);

                System.out.println("Who was your manager for this job:");
                input = keybd.nextLine();
                wk.setJobManager(input);

                System.out.println("Can we contact this manager? (Y|N)");
                input = keybd.nextLine();
                if (input.equalsIgnoreCase("y")) {
                    wk.setCanContact(true);
                    System.out.println("Please enter your manager's phone number:");
                    input = keybd.nextLine();
                    wk.setJobManagerPhone(input);
                }

                System.out.println("Please enter a brief description of the job you worked on:");
                input = keybd.nextLine();
                wk.setJobDescription(input);

                System.out.println("Please enter some of the duties and responsibilities for this job:");
                boolean continueDuties = true;
                while (continueDuties) {
                    System.out.println("Please enter a skill that you would like to enter: ");
                    input = keybd.nextLine();

                    wk.putString(input);

                    System.out.println("\nDo you want to enter any more job duties? (Y|N)");
                    input = keybd.nextLine();
                    if (input.equalsIgnoreCase("n")) {
                        continueDuties = false;
                        yourResume.workExperience.add(wk);
                    }

                }
                System.out.println("Do you have any more jobs to enter? (Y|N)");
                input = keybd.nextLine();
                if (input.equalsIgnoreCase("n")) {
                    continueWork = false;
                }
            }
            System.out.println("This ends the job work experience section");
        }


        // Enter your educational experience
        System.out.println("Did you attend a college or university:(Y|N)");
        input = keybd.nextLine();
        if (input.equalsIgnoreCase("y")) {
            boolean continueEd = true;

            while (continueEd) {
                Education ed = new Education();

                System.out.println("What is the name of the university or college you attended: ");
                input = keybd.nextLine();
                ed.setUniversityName(input);

                System.out.println("What is the address of the university or college you attended: ");
                input = keybd.nextLine();
                ed.setUniversityAddress(input);

                System.out.println("Did you graduate: (Y|N)");
                input = keybd.nextLine();
                if (input.equalsIgnoreCase("y")) {
                    tmpBool = true;
                } else {
                    tmpBool = false;
                }
                ed.setGraduated(tmpBool);

                if (tmpBool) {
                    System.out.println("What is the grade point average you achieved while attending university or college?");
                    input = keybd.nextLine();
                    ed.setGradePointAverage(Double.parseDouble(input));

                    System.out.println("What degree did you earn when you graduated university or college?");
                    input = keybd.nextLine();
                    ed.setDegree(input);

                    System.out.println("What year did you graduate?");
                    input = keybd.nextLine();
                    ed.setYearGraduated(input);
                }

                yourResume.education.add(ed);

                System.out.println("Did your attend any other colleges or universities? (Y|N)");
                input = keybd.nextLine();
                if (input.equalsIgnoreCase("n")) {
                    continueEd = false;
                }
            }
            System.out.println("This ends the educational section");
        }


        // Skills section
        //      Technical Skills
        System.out.println("You will be asked to enter technical and managerial skills separately");
        System.out.println("Do you have any technical skills that you would like to enter: (Y|N)");
        input = keybd.nextLine();
        if (input.equalsIgnoreCase("y")) {
            boolean continueSkills = true;
            Skills tmpSkills = new Skills();
            while (continueSkills) {
                System.out.println("Please enter a skill: ");
                input = keybd.nextLine();

                tmpSkills.putString(input);

                System.out.println("Do you want to enter any more skills? (Y|N)");
                input = keybd.nextLine();
                if (input.equalsIgnoreCase("n")) {
                    continueSkills = false;
                    yourResume.setTSkills(tmpSkills);
                }
            }
        }


        //      Managerial Skills
        System.out.println("Do you have any management skills that you would like to enter: (Y|N)");
        input = keybd.nextLine();
        if (input.equalsIgnoreCase("y")) {
            boolean continueSkills = true;
            Skills tmpSkills = new Skills();
            while (continueSkills) {
                System.out.println("Please enter a skill: ");
                input = keybd.nextLine();

                tmpSkills.putString(input);

                System.out.println("Do you want to enter any more skills? (Y|N)");
                input = keybd.nextLine();
                if (input.equalsIgnoreCase("n")) {
                    continueSkills = false;
                    yourResume.setMSkills(tmpSkills);
                }
            }
        }


        //      Certifications
        System.out.println("Do you have any certifications that you would like to enter: (Y|N)");
        input = keybd.nextLine();
        if (input.equalsIgnoreCase("y")) {
            boolean continueCerts = true;
            Skills certSkills = new Skills();
            while (continueCerts) {
                System.out.println("Please enter a certification: ");
                input = keybd.nextLine();

                certSkills.putString(input);

                System.out.println("Do you want to enter any more certifications? (Y|N)");
                input = keybd.nextLine();
                if (input.equalsIgnoreCase("n")) {
                    continueCerts = false;
                    yourResume.setCSkills(certSkills);
                }
            }
        }

        // Printing out information
        System.out.println();
        System.out.println(yourResume.printPersonal());

        // Printing out Work Experience information
        System.out.println("Work Experience:");
        System.out.println("================");
        for (int i = 0; i < yourResume.getWorkExperience().size(); i++) {
            System.out.println(yourResume.getWorkExperience().get(i).printWorkExperience());
        }

        // Printing out Educational information
        System.out.println("Educational Experience:");
        System.out.println("=======================");
        for (int i = 0; i < yourResume.getEducation().size(); i++) {
            System.out.println(yourResume.getEducation().get(i).printEducation());
        }

        // Printing out Skill Set information
        System.out.println(yourResume.getTSkills().printSkills("Technical Skills: ", yourResume.getTSkills()));

        System.out.println(yourResume.getMSkills().printSkills("Managerial Skills: ", yourResume.getMSkills()));

        System.out.println(yourResume.getMSkills().printCertifications(yourResume.getCSkills()));
    }
}

