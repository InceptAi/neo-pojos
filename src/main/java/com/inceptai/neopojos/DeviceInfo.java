package com.inceptai.neopojos;

public class DeviceInfo {
    private final String manufacturer;
    private final String model;
    private final String release;
    private final String sdk;
    private final String hardware;
    private final String product;

    public DeviceInfo(String manufacturer, String model, String release, String sdk, String hardware, String product) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.release = release;
        this.sdk = sdk;
        this.hardware = hardware;
        this.product = product;
    }

    public DeviceInfo() {
        this.manufacturer = Utils.EMPTY_STRING;
        this.model = Utils.EMPTY_STRING;
        this.release = Utils.EMPTY_STRING;
        this.sdk = Utils.EMPTY_STRING;
        this.hardware = Utils.EMPTY_STRING;
        this.product = Utils.EMPTY_STRING;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getRelease() {
        return release;
    }

    public String getSdk() {
        return sdk;
    }

    public String getHardware() {
        return hardware;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", release='" + release + '\'' +
                ", sdk='" + sdk + '\'' +
                ", hardware='" + hardware + '\'' +
                ", product='" + product + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeviceInfo)) return false;

        DeviceInfo that = (DeviceInfo) o;

        if (manufacturer != null ? !manufacturer.equals(that.manufacturer) : that.manufacturer != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (release != null ? !release.equals(that.release) : that.release != null) return false;
        if (sdk != null ? !sdk.equals(that.sdk) : that.sdk != null) return false;
        if (hardware != null ? !hardware.equals(that.hardware) : that.hardware != null) return false;
        return product != null ? product.equals(that.product) : that.product == null;
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (release != null ? release.hashCode() : 0);
        result = 31 * result + (sdk != null ? sdk.hashCode() : 0);
        result = 31 * result + (hardware != null ? hardware.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        return result;
    }
}
