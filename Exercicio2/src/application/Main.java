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
        boolean retired = false;
        int employeeNumber = 0;
        double unemployedMonths = 0.0;
        try (Scanner sc = new Scanner(System.in)){
            do {
                System.out.println("Informe o nome do beneficiário:\n");
                String name = sc.nextLine();
                System.out.println("Informe a data de nascimento do beneficiário (dd/MM/yyyy):\n");
                Date bornDate = sdf.parse(sc.nextLine());
                System.out.println("Informe a categoria do beneficiário:\n");
                System.out.println("1 se for empregado;\n" +
                        "2 se for empregador;\n" +
                        "3 se for desempregado;\n" +
                        "4 caso não atenda a nenhuma das anteriores.");
                int categoryId = sc.nextInt();
                switch (categoryId){
                    case 1:
                        System.out.println("Aposentado? (S/N)");
                        sc.nextLine();
                        retired = sc.nextLine().equalsIgnoreCase("S") ? true : false;
                        break;
                    case 2:
                        System.out.println("Número de funcionários:");
                        employeeNumber = sc.nextInt();
                        break;
                    case 3:
                        System.out.println("Tempo em situação de desemprego (meses):");
                        unemployedMonths = sc.nextDouble();
                        break;
                }
                System.out.println("Informe a UF do beneficiário:\n");
                String state = sc.next();

                //Beneficiary beneficiary = new Beneficiary(name, bornDate, state, Category.getCategoryById(categoryId));

               /* System.out.println("Nome do beneficiário: " + beneficiary.getName()
                        + "\nData de nascimento: " + sdf.format(beneficiary.getBornDate())
                        + "\nCategoria: " + beneficiary.getCategory().getDescription());
                */
                System.out.println("Deseja informar um novo beneficiário? (S/N):\n");
                sc.nextLine();
                String s = sc.nextLine();
                stop = !s.equalsIgnoreCase("S");
            } while (stop != true);
        } catch (RuntimeException | ParseException ex){
            System.out.println(ex.getMessage());
        }

    }
}
