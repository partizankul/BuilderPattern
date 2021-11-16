package TryFactoryMethod;

public class CreateSite {
    public static void main(String[] args) {
        SiteSelect siteSelect = new SiteSelect();
        System.out.println("vizit");
        ISite iSite = siteSelect.getSite(TypeSite.VIZIT);
        iSite.price();
        iSite.createTime();
        System.out.println("bank");
        iSite = siteSelect.getSite(TypeSite.BANK);
        iSite.price();
        iSite.createTime();


    }
}
