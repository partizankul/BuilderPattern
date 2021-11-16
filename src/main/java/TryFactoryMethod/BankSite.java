package TryFactoryMethod;

public class BankSite implements ISite{
    @Override
    public void price() {
        System.out.println("5000");
    }

    @Override
    public void createTime() {
        System.out.println("Create this site 4 weeks");
    }
}
