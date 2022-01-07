package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SalesPerson SP = new SalesPerson();
        SystemDeveloper SD = new SystemDeveloper();

        String[] bew = new String[1]; //NullPointerException if I don't initialize a first client.
        SP.setClients(bew); // ^
        SD.setCertificates(bew);
        SD.setLanguages(bew);

        SP.calculateSalary();
        SD.calculateSalary();

        System.out.println(SP.toString());
        System.out.println(SD.toString());

        SP.getSalary();
        SD.getSalary();

    }
}
