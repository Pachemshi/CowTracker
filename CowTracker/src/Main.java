import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Cow> cowList = new ArrayList<Cow>();
        Scanner scan = new Scanner(System.in);
        String option = "";
        do {
            inicialMenu();
            option = scan.next().toUpperCase();
            switch (option) {

                case "1":
                    Cow one = new Cow("","","","");
                    System.out.println("|-------------------------|");
                    System.out.print(" Cow Name: ");
                    one.setName(scan.next().trim());
                    System.out.print(" Age: ");
                    one.setAge(scan.nextByte());
                    System.out.print(" Breed: ");
                    one.setBreed(scan.next().trim());
                    System.out.println("|---------Pedigree--------|");
                    System.out.print(" Siren: ");
                    one.setSiren(scan.next().trim());
                    System.out.print(" Dam: ");
                    one.setDam(scan.next().trim());
                    one.setRecordMods();
                    cowList.add(one);
                    break;
                case "2":
                    System.out.println("|-------------------------|");
                    System.out.print(" Cow number: ");
                    int cowChoose = scan.nextInt();
                    setRegister(cowList.get(cowChoose));
                    break;
                case "3":
                    System.out.println("|---------<Herd>----------|");
                    for (int i = 0; i < cowList.size(); i++) {
                        System.out.println(" Cow [" + i + "] - " + cowList.get(i).getName());
                    }
                    System.out.println("\n|---<Enter to continue>---|");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case "4":
                    System.out.println("|-------------------------|");
                    System.out.print(" Cow: ");
                    int choice = scan.nextInt();
                    //System.out.println("\033\143");
                    System.out.println("-------General Info--------");
                    System.out.println("Name: "+ cowList.get(choice).getName());
                    System.out.println("Breed: "+ cowList.get(choice).getBreed());
                    System.out.println("Cow Id: "+ cowList.get(choice).getId());
                    System.out.println("----------Pedigree---------");
                    System.out.println("Siren: "+ cowList.get(choice).getSiren());
                    System.out.println("Dam: "+ cowList.get(choice).getDam());
                    System.out.println("--Production Information---");
                    System.out.println("Age: "+ cowList.get(choice).getAge());
                    System.out.println("Bred: "+ cowList.get(choice).getBred());
                    System.out.println("Births: "+ cowList.get(choice).getBirths());
                    System.out.println("Weight: "+ cowList.get(choice).getWeight());
                    System.out.println("Score: "+ cowList.get(choice).getScore());
                    System.out.println("Milk Prod: "+ cowList.get(choice).getMilkProduction());
                    System.out.println("---------------------------");
                    System.out.println("Modified: "+ cowList.get(choice).getMod());
                    System.out.println("---< Enter to continue >---");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case "X":
                    break;
                default:
                    System.out.println("Error! Invalid value...");
                    break;
            }
        }while(!option.equals("X"));
    }

    static void inicialMenu() {

            System.out.println("|-------------------------|");
            System.out.println("|-----Cow Tracker 1.0-----|");
            System.out.println("|------Initial Menu-------|");
            System.out.println("[1] Register new cow ");
            System.out.println("[2] Set register info");
            System.out.println("[3] See herd");
            System.out.println("[4] Cow record");
            System.out.println("[X] Exit");
            System.out.println("|-------------------------|");
    }

    static void setRegister(Cow cowChoose) {

        Scanner scan = new Scanner(System.in);
        String option;
        do {
            //System.out.println("\033\143");
            System.out.println("|---- General Settings ---|");
            System.out.println("|-Cow: "+ cowChoose.getName());
            System.out.println("|-------------------------|");
            System.out.println("[0] set Name");
            System.out.println("[1] set Breed");
            System.out.println("[2] set Pedigree");
            System.out.println("[3] set Age");
            System.out.println("[4] set Bred");
            System.out.println("[5] set Births");
            System.out.println("[6] set Weight");
            System.out.println("[7] set Score");
            System.out.println("[8] set Milk production");
            System.out.println("[9] set Cow Id");
            System.out.println("[X] Exit");
            System.out.println("|-------------------------|");

            option = scan.next().toUpperCase();
            switch (option) {
                case "0":
                    System.out.println("|-------------------------|");
                    System.out.print(" Set record name: ");
                    cowChoose.setName(scan.next().trim());
                    System.out.println("|-------------------------|");
                    cowChoose.setRecordMods();
                    break;
                case "1":
                    System.out.println("|-------------------------|");
                    System.out.print(" Set cow breed: ");
                    cowChoose.setBreed(scan.next().trim());
                    System.out.println("|-------------------------|");
                    cowChoose.setRecordMods();
                    break;
                case "2":
                    System.out.println("|---------Pedigree--------|");
                    System.out.print(" Set siren: ");
                    cowChoose.setSiren(scan.next().trim());
                    System.out.print(" Set dam: ");
                    cowChoose.setDam(scan.next().trim());
                    System.out.println("|-------------------------|");
                    cowChoose.setRecordMods();
                    break;
                case "3":
                    System.out.println("|-------------------------|");
                    System.out.print(" Set Age: ");
                    cowChoose.setAge(scan.nextByte());
                    System.out.println("|-------------------------|");
                    cowChoose.setRecordMods();
                    break;
                case "4":
                    System.out.println("|-------------------------|");
                    System.out.println(" Bred status [true/false] ");
                    cowChoose.setBred(scan.hasNextBoolean());
                    System.out.println("|-------------------------|");
                    cowChoose.setRecordMods();
                    break;
                case "5":
                    System.out.println("|-------------------------|");
                    System.out.print(" Set number of births: ");
                    cowChoose.setBirths(scan.nextByte());
                    System.out.println("|-------------------------|");
                    cowChoose.setRecordMods();
                    break;
                case "6":
                    System.out.println("|-------------------------|");
                    System.out.print(" Set weight: ");
                    cowChoose.setWeight(scan.nextInt());
                    System.out.println("|-------------------------|");
                    cowChoose.setRecordMods();
                    break;
                case "7":
                    System.out.println("|-------------------------|");
                    System.out.print(" Set Score: ");
                    cowChoose.setScore(scan.nextDouble());
                    System.out.println("|-------------------------|");
                    cowChoose.setRecordMods();
                    break;
                case "8":
                    System.out.println("|-------------------------|");
                    System.out.print(" Set milk production: ");
                    cowChoose.setMilkProduction(scan.nextInt());
                    System.out.println("|-------------------------|");
                    cowChoose.setRecordMods();
                    break;
                case "9":
                    System.out.println("|-------------------------|");
                    System.out.print(" Set cow ID: ");
                    cowChoose.setId(scan.next().trim());
                    System.out.println("|-------------------------|");
                    cowChoose.setRecordMods();
                    break;
                case "X":
                    break;
                default:
                    System.out.println("|-------------------------|");
                    System.out.println("Invalid!");
                    break;
            }
        }while(!option.equals("X"));
    }
}