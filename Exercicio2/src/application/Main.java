package application;

import entities.Beneficiary;
import enums.Category;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean stop = false;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try (Scanner sc = new Scanner(System.in)){
            do {
                System.out.println("Informe o nome do beneficiário:\n");
                String name = sc.nextLine();
                System.out.println("Informe a data de nascimento do beneficiário (dd/MM/yyyy):\n");
                Date bornDate = sdf.parse(sc.nextLine());
                System.out.println("Informe a categoria do beneficiário:\n");
                System.out.println("1 se for empregado;\n" +
                        "2 se for empregador;\n" +
                        "3 se for desempregado;");
                int categoryId = sc.nextInt();
                System.out.println("Informe a UF do beneficiário:\n");
                String state = sc.next();

                Beneficiary beneficiary = new Beneficiary(name, bornDate, state, Category.getCategoryById(categoryId));

                System.out.println("Nome do beneficiário: " + beneficiary.getName()
                        + "\nData de nascimento: " + sdf.format(beneficiary.getBornDate())
                        + "\nCategoria: " + beneficiary.getCategory().getDescription());

                System.out.println("Deseja informar um novo beneficiário? (S/N):\n");
                sc.nextLine();
                String s = sc.nextLine();
                if(s.equalsIgnoreCase("S")){
                    stop = false;
                } else {
                    stop = true;
                }
            } while (stop != true);
        } catch (RuntimeException | ParseException ex){
            System.out.println(ex.getMessage());
        }


    }
}
