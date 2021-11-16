package TryFactoryMethod;

public class VizitSite implements ISite{
    @Override
    public void price() {
        System.out.println("500$");
    }

    @Override
    public void createTime() {
        System.out.println("Create this site 1 week");
    }
}
