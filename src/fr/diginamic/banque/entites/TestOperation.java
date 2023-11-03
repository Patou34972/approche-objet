package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[4];
        double montantTotal= 0.0;
        operations[0] = new Credit("03/11/2023", 100.0);
        operations[1] = new Debit("02/11/2023", 50.0);
        operations[2] = new Credit("03/12/2023", 200.0);
        operations[3] = new Debit("05/12/2022", 75.0);

        for (Operation operation : operations) {

            System.out.println("Montant de l'opération: " + operation.getMontant() + " Date de l'operation : " + operation.getDate());
            if (operation instanceof Debit) {
                 montantTotal -= operation.getMontant();
            } else if (operation instanceof Credit) {
                montantTotal += operation.getMontant();
            }
        }
        System.out.println("Montant global de toutes les opération: " + montantTotal);
    }
}
