package se.lexicon;

public class SystemDeveloper extends Employee {

    private String[] certificates;
    private String[] languages;

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public void calculateSalary(){
        setSalary(getSalary() + (1000 * certificates.length) + (1500 * languages.length));
    }

    public String toString(){
        return "certificates: " + certificates + "\n languages: " + languages;
    }
}
