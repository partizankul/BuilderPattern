package TryFactoryMethod;

public class ChatSite implements ISite{
    @Override
    public void price() {
        System.out.printf("1000");
    }

    @Override
    public void createTime() {
        System.out.println("Create this site 2 weeks");
    }
}
