public class Master extends Human{
    private String patronymic; //отчество
    private String nameDepartment; //название кафедры
    private int numberSubordinates; //сколько человек в подчинении
    private int numberInvestigations; //количество исследований

    public String getPatronymic() {
        return patronymic;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public int getNumberSubordinates() {
        return numberSubordinates;
    }

    public int getNumberInvestigations() {
        return numberInvestigations;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }
    public void setNumberSubordinates(int numberSubordinates) {
        this.numberSubordinates = numberSubordinates;
    }

    public void setNumberInvestigations(int numberInvestigations) {
        this.numberInvestigations = numberInvestigations;
    }
    public Master
            (
            String lastName, String firstName, String patronymic,
            int age, String nameDepartment,
            int numberSubordinates, int numberInvestigations
            )
        {
            super(lastName, firstName, age);
            setPatronymic(patronymic);
            setNameDepartment(nameDepartment);
            setNumberInvestigations(numberInvestigations);
            setNumberSubordinates(numberSubordinates);
            System.out.println("MConstructor:\t" + Integer.toHexString(hashCode()));
        }

       public String toString()
       {
           return super.toString()  + " " + patronymic + " " + getAge() +  " " + nameDepartment + " " + numberSubordinates + " " + numberInvestigations;
       }
}
