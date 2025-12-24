public class Portal {
    private static int counter = 1;
    private int id;
    private String portalName;
    private String url;

    public Portal(String portalName, String url) {
        this.id = counter++;
        this.portalName = portalName;
        this.url = url;
    }

    public void printPortal() {
        System.out.println("ID: " + id + ", Name: " + portalName + ", URL: " + url);
    }

    public int getId() {
        return id;
    }

    public String getPortalName() {
        return portalName;
    }

    public String getUrl() {
        return url;
    }

    public void setPortalName(String portalName) {
        this.portalName = portalName;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}