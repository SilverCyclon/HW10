package com.mycompany.alrajaab10;

//https://github.com/SilverCyclon/HW10.git <<repository URL

public class Alrajaab10 {

    public interface GarmentFactory {

        Top createTop();

        Pants createPants();

        Shoes createShoes();
    }

    public static class ProfessionalGarmentFactory implements GarmentFactory {

        public Top createTop() {
            return new ProfessionalTop();
        }

        public Pants createPants() {
            return new ProfessionalPants();
        }

        public Shoes createShoes() {
            return new ProfessionalShoes();
        }
    }

    public static class CasualGarmentFactory implements GarmentFactory {

        public Top createTop() {
            return new CasualTop();
        }

        public Pants createPants() {
            return new CasualPants();
        }

        public Shoes createShoes() {
            return new CasualShoes();
        }
    }

    public static class PartyGarmentFactory implements GarmentFactory {

        public Top createTop() {
            return new PartyTop();
        }

        public Pants createPants() {
            return new PartyPants();
        }

        public Shoes createShoes() {
            return new PartyShoes();
        }
    }

    public interface Top {

        String getDescription();
    }

    public interface Pants {

        String getDescription();
    }

    public interface Shoes {

        String getDescription();
    }

    public static class ProfessionalTop implements Top {

        public String getDescription() {
            return "Professional Top";
        }
    }

    public static class ProfessionalPants implements Pants {

        public String getDescription() {
            return "Professional Pants";
        }
    }

    public static class ProfessionalShoes implements Shoes {

        public String getDescription() {
            return "Professional Shoes";
        }
    }

    public static class CasualTop implements Top {

        public String getDescription() {
            return "Casual Top";
        }
    }

    public static class CasualPants implements Pants {

        public String getDescription() {
            return "Casual Pants";
        }
    }

    public static class CasualShoes implements Shoes {

        public String getDescription() {
            return "Casual Shoes";
        }
    }

    public static class PartyTop implements Top {

        public String getDescription() {
            return "Party Top";
        }
    }

    public static class PartyPants implements Pants {

        public String getDescription() {
            return "Party Pants";
        }
    }

    public static class PartyShoes implements Shoes {

        public String getDescription() {
            return "Party Shoes";
        }
    }

    public static void main(String[] args) {

        GarmentFactory professionalFactory = new ProfessionalGarmentFactory();
        GarmentFactory casualFactory = new CasualGarmentFactory();
        GarmentFactory partyFactory = new PartyGarmentFactory();

        Top top = professionalFactory.createTop();
        Pants pants = professionalFactory.createPants();
        Shoes shoes = professionalFactory.createShoes();

        System.out.println(top.getDescription());
        System.out.println(pants.getDescription());
        System.out.println(shoes.getDescription());

        top = casualFactory.createTop();
        pants = casualFactory.createPants();
        shoes = casualFactory.createShoes();

        System.out.println(top.getDescription());
        System.out.println(pants.getDescription());
        System.out.println(shoes.getDescription());

        top = partyFactory.createTop();
        pants = partyFactory.createPants();
        shoes = partyFactory.createShoes();
        
        System.out.println(top.getDescription());
        System.out.println(pants.getDescription());
        System.out.println(shoes.getDescription());

    }
    
}