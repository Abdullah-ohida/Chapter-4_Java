import javax.swing.JOptionPane;

public class CreditLimit {
    public static void main(String[] args) {

        String acctNumber = JOptionPane.showInputDialog("Enter acct number?");
            while (acctNumber.length() != 10){
                String error = String.format("Account number must be 10 digit!");
                JOptionPane.showMessageDialog(null, error);
                acctNumber = JOptionPane.showInputDialog("Enter acct number?");
            }
        String message = String.format("Welcome, is this your account number?, %s!", acctNumber);
            JOptionPane.showMessageDialog(null, message);

        int balAtMonth= Integer.parseInt(JOptionPane.showInputDialog("Enter balance at the beginning of the month:"));

        int totalItemAtMonth = Integer.parseInt(JOptionPane.showInputDialog("Enter total of all items charged by the customer this month:"));

        int totalCreAtMonth = Integer.parseInt(JOptionPane.showInputDialog("Enter total of all credits applied to the customer’s account this month:"));

        int allCreLim = Integer.parseInt(JOptionPane.showInputDialog("Enter allowed credit limit:"));

        int newBalance = balAtMonth + totalItemAtMonth - totalCreAtMonth;
        if(allCreLim > newBalance){
             message = "Credit limit exceeded!";
            JOptionPane.showMessageDialog(null, message);
        } else{
             message = "Pay your debt Asap!";
            JOptionPane.showMessageDialog(null, message);
            }

    }

}

