package java_3_Essential.lesson_8.task_2_3_4;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +":" +
                " manufacturer = " + manufacturer +
                ", price = " + (int)price +
                ", serialNumber=" + serialNumber +
                ',';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        if (!manufacturer.equals(device.manufacturer)) return false;
        if (!serialNumber.equals(device.serialNumber)) return false;
        if (price != device.price) return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (manufacturer == null ? 0 : manufacturer.hashCode());
        result = 37 * result + (serialNumber == null ? 0 : serialNumber.hashCode());
        result = 37 * result + Float.floatToIntBits(price);
        return result;
    }
}
