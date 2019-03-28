public class Cars {
    private String color;
    private String headlight;
    private int noOfWheel;

    public Cars(String color, String headlight, int noOfWheel, boolean isNew) {
        this.color = color;
        this.headlight = headlight;
        this.noOfWheel = noOfWheel;
        this.isNew = isNew;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHeadlight() {
        return headlight;
    }

    public void setHeadlight(String headlight) {
        this.headlight = headlight;
    }

    public int getNoOfWheel() {
        return noOfWheel;
    }

    public void setNoOfWheel(int noOfWheel) {
        this.noOfWheel = noOfWheel;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    private boolean isNew;

}
