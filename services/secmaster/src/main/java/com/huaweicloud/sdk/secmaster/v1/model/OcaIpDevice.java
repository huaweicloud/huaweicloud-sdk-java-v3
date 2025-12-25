package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设备信息
 */
public class OcaIpDevice {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private OcaIpVendor vendor;

    public OcaIpDevice withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 设备类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OcaIpDevice withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 设备型号
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public OcaIpDevice withVendor(OcaIpVendor vendor) {
        this.vendor = vendor;
        return this;
    }

    public OcaIpDevice withVendor(Consumer<OcaIpVendor> vendorSetter) {
        if (this.vendor == null) {
            this.vendor = new OcaIpVendor();
            vendorSetter.accept(this.vendor);
        }

        return this;
    }

    /**
     * Get vendor
     * @return vendor
     */
    public OcaIpVendor getVendor() {
        return vendor;
    }

    public void setVendor(OcaIpVendor vendor) {
        this.vendor = vendor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OcaIpDevice that = (OcaIpDevice) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.model, that.model)
            && Objects.equals(this.vendor, that.vendor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, model, vendor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OcaIpDevice {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
