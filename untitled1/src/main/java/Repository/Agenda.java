package Repository;

public class Agenda {
    private String addContact;
    private String ListContact;
    private String CountContact;
    private String ListCategory;

    public String getAddContact() {
        return addContact;
    }

    public String getListContact() {
        return ListContact;
    }

    public String getCountContact() {
        return CountContact;
    }

    public String getListCategory() {
        return ListCategory;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "addContact='" + addContact + '\'' +
                ", ListContact='" + ListContact + '\'' +
                ", CountContact='" + CountContact + '\'' +
                ", ListCategory='" + ListCategory + '\'' +
                '}';
    }
}
