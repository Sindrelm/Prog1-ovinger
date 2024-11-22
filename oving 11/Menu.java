public class Menu {
        public static void main(String[] args) {
            PropertyRegister propertyRegister = new PropertyRegister();
                    
            propertyRegister.addProperty(new Property("Gloppen", 1445, 77, 631, "", 1017.6, "Jens Olsen"));
            propertyRegister.addProperty(new Property("Gloppen", 1445, 77, 131, "Syningom", 661.3, "Nicolay Madsen"));
            propertyRegister.addProperty(new Property("Gloppen", 1445, 75, 19, "Fugletun", 650.6, "Evilyn Jensen"));
            propertyRegister.addProperty(new Property("Gloppen", 1445, 74, 188, "", 1457.2, "Karl Ove Bråten"));
            propertyRegister.addProperty(new Property("Gloppen", 1445, 69, 47, "Høiberg", 1339.4, "Elsa Indregård"));

            
            boolean run = true;
            while(run) {
                System.out.println("""
                    0. Exit
                    1. Print register
                    2. Get average area
                    3. Search for property
                    4. Add property
                    5. Get properties with gnr
                        """);
    
                int choice = 0;
                choice = Integer.parseInt(System.console().readLine());
    
                switch(choice){
                    case 0 -> run = false;
                    case 1 -> propertyRegister.printRegister();
                    case 2 -> System.out.println("Average area: " + propertyRegister.getAverageArea());
                    case 3 -> {
                        System.out.println("Enter muncipality number: ");
                        int muncipalityNumber = Integer.parseInt(System.console().readLine());
                        System.out.println("Enter gnr: ");
                        int gnr = Integer.parseInt(System.console().readLine());
                        System.out.println("Enter bnr: ");
                        int bnr = Integer.parseInt(System.console().readLine());
                        System.out.println(propertyRegister.search(muncipalityNumber, gnr, bnr));
                    }
                    case 4 -> {
                        System.out.println("Enter muncipality name: ");
                        String muncipalityName = System.console().readLine();
                        System.out.println("Enter muncipality number: ");
                        int muncipalityNumber = Integer.parseInt(System.console().readLine());
                        System.out.println("Enter gnr: ");
                        int gnr = Integer.parseInt(System.console().readLine());
                        System.out.println("Enter bnr: ");
                        int bnr = Integer.parseInt(System.console().readLine());
                        System.out.println("Enter lot name: ");
                        String lotName = System.console().readLine();
                        System.out.println("Enter lot size: ");
                        double lotSize = Double.parseDouble(System.console().readLine());
                        System.out.println("Enter name of owner: ");
                        String nameOfOwner = System.console().readLine();
                        propertyRegister.addProperty(new Property(muncipalityName, muncipalityNumber, gnr, bnr, lotName, lotSize, nameOfOwner));
                    }
                    case 5 -> {
                        System.out.println("Enter gnr: ");
                        int gnr = Integer.parseInt(System.console().readLine());
                        propertyRegister.getPropertiesWithGnr(gnr);
                    }
            }
        }
    }
}

