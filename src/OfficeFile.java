public class OfficeFile {
    private String description;
    private String type;
    private int secrecy;

    public String getDescription() {
        return description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSecrecy() {
        return secrecy;
    }

    private void setSecrecy(int secrecy) {
            this.secrecy = secrecy;
    }
}