package DA_UNIT.Week_5;

public class Week_5 {
        public static void main(String[] args) {
                // Section for the Base Person Class:
                // name , age
                Person Africa = new Person("Cyprian Ekwensi", 60);
                Africa.introduction();
                Africa.setFeatures("Chinua Achebe", 26, 1.87, 82, "male", "Nigeria");
                Africa.introduction();
                Africa.getinfo();

                // String name, int age, double height, int weight, String gender, String
                // country
                Person Europe = new Person("Jack Grealish", 30, 1.83, 79, "male", "England");
                Europe.getinfo();

                Person Asia = new Person("Uzumaki Himawari", 22, 1.58, 63, "female", "Japan");
                Asia.getinfo();

                Person SouthAmerica = new Person("Isabela Gomez", 19, 1.62, 70, "female", "Brazil");
                SouthAmerica.getinfo();

                Person NorthAmerica = new Person("Bruce Wayne", 39, 1.66, 80, "male", "America");
                NorthAmerica.getinfo();

                // Section For Doctor Class:
                // name, age, medicalField, employer, qualification, residency,
                // YearsOfExperience
                Doctor Surgeon = new Doctor("female", "Arabella Torres", 45, "Surgery", "Hospital", "M.D. and MCAT", true, 15);
                Surgeon.getinfo();

                Doctor Cardiologist = new Doctor("male", "Dernis Boyle", 35, "Cardiology", "Armed Services",
                                "M.D., MCAT and D.O.", true, 12);
                Cardiologist.getinfo();

                Doctor Dentist = new Doctor("male", "Sterling Archer", 30, "Orthodontics", "Private Practice",
                                "DAT, DDS and DMD", false, 7);
                Dentist.getinfo();

                Doctor Podiatrist = new Doctor("female", "Nalini Vishwakumar", 29, "Dermatology", "Community Health Clinic",
                                "MCAT, GRE and DPM", true, 9);
                Podiatrist.getinfo();

                Doctor Pharmacist = new Doctor("female", "Rainbow Johnson", 36, "Psychopharmacotherapy",
                                "Pharmaceutical company", "PCAT and Pharm.D.", false, 11);
                Pharmacist.getinfo();

                // Section for the SoftwareEngineer Class
                // String gender, String name, int age, String specialization, String role,
                // String company, String salary, String level
                SoftwareEngineer WebDeveloper = new SoftwareEngineer("female", "Maya Kricko", 27, "Web DevelopMent",
                                "Front-End Engineer", "Google", "$658,962", "L7", 10);
                WebDeveloper.getinfo();
                WebDeveloper.Value();

                Person MobileDeveloper = new SoftwareEngineer();
                ((SoftwareEngineer) MobileDeveloper).setFeatures("male", "Cristiano Ronaldo", 32, "Apple IOS",
                                "Mobile Developer", "Apple", "$258,962", "ICT 3", 5);
                ((SoftwareEngineer) MobileDeveloper).Bio();
                ((SoftwareEngineer) MobileDeveloper).getinfo();
                ((SoftwareEngineer) MobileDeveloper).Value();

                SoftwareEngineer CloudEngineer = new SoftwareEngineer("male", "Mike Ross", 45, "Azure Cloud",
                                "Cloud Architect", "Microsoft", "$872,650", "Partner", 15);
                CloudEngineer.getinfo();

                SoftwareEngineer TestingEngineer = new SoftwareEngineer("female", "Jasmine Neutron", 37, "Software Testing",
                                "QA Engineer", "Facebook", "$396,802", "E5", 7);
                TestingEngineer.getinfo();

                SoftwareEngineer AutomationEngineer = new SoftwareEngineer("male", "Jake Sully", 29, "AWS Cloud",
                                "DevOps Engineer", "Netflix", "$506,788", "Senior Software Engineer", 10);
                AutomationEngineer.getinfo();
                AutomationEngineer.testingsuper();
        }
}