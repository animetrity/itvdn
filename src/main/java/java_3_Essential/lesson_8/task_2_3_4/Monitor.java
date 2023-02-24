package java_3_Essential.lesson_8.task_2_3_4;

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return super.toString() +
                " X=" + resolutionX +
                ", Y=" + resolutionY +
                '.';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor monitor = (Monitor) obj;
        if (!getSerialNumber().equals(monitor.getSerialNumber())) return false;
        if (!getManufacturer().equals(monitor.getManufacturer())) return false;
        if (resolutionX != monitor.resolutionX) return false;
        if (resolutionY != monitor.resolutionY) return false;
        if (getPrice() != monitor.getPrice()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getManufacturer() == null ? 0 : getManufacturer().hashCode());
        result = 37 * result + (getSerialNumber() == null ? 0 : getSerialNumber().hashCode());
        result = 37 * result + Float.floatToIntBits(getPrice());
        result = 37 * result + resolutionX;
        result = 37 * result + resolutionY;
        return result;
    }
}
