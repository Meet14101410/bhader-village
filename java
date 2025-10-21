public class BhaderVillageAmreli {

    // Class to represent the Village structure
    private static class Village {
        String name;
        String district;
        String taluka;
        int population;
        String pincode;
        double areaHectares;

        public Village(String name, String district, String taluka, int population, String pincode, double areaHectares) {
            this.name = name;
            this.district = district;
            this.taluka = taluka;
            this.population = population;
            this.pincode = pincode;
            this.areaHectares = areaHectares;
        }

        public void displayDetails() {
            System.out.println("=== 🇮🇳 Bhader Village Data (Amreli) ===");
            System.out.println("Village Name: " + name);
            System.out.println("District: " + district);
            System.out.println("Taluka: " + taluka);
            System.out.println("Population (2011 Census): " + population);
            System.out.println("Pincode: " + pincode);
            System.out.println("Area (Hectares): " + areaHectares);
            System.out.println("=======================================");
        }
    }

    public static void main(String[] args) {
        // Create a new Village object
        Village bhader = new Village(
            "Bhader", 
            "Amreli", 
            "Dhari", 
            3924, 
            "365645", 
            2633.69
        );
        
        // Display the details
        bhader.displayDetails();
    }
}
