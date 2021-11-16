package TryFactoryMethod;

public class SiteSelect {
    public ISite getSite(TypeSite typeSite) {
        ISite iSite = null;
        switch (typeSite) {
            case VIZIT:
                iSite = new VizitSite();
                break;
            case CHAT:
                iSite = new ChatSite();
                break;
            case BANK:
                iSite = new BankSite();
                break;
        } return iSite;
    }
}
