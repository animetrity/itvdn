package main.java.java_3_Essential.lesson_8.task_2_3_4;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() +
                " speed = " + speed +
                ", mac = '" + mac + '\'' +
                '.';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EthernetAdapter ethernetAdapter = (EthernetAdapter) obj;
        if (!mac.equals(ethernetAdapter.mac)) return false;
        if (!getSerialNumber().equals(ethernetAdapter.getSerialNumber())) return false;
        if (!getManufacturer().equals(ethernetAdapter.getManufacturer())) return false;
        if (speed != ethernetAdapter.speed) return false;
        if (getPrice() != ethernetAdapter.getPrice()) return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getManufacturer() == null ? 0 : getManufacturer().hashCode());
        result = 37 * result + (getSerialNumber() == null ? 0 : getSerialNumber().hashCode());
        result = 37 * result + Float.floatToIntBits(getPrice());
        result = 37 * result + (mac == null ? 0 : mac.hashCode());
        result = 37 * result + speed;
        return result;
    }
}
