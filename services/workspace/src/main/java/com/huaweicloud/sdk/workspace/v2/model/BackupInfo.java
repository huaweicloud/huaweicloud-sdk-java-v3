package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 备份信息。
 */
public class BackupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_custom")

    private String addressCustom;

    public BackupInfo withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级，数字越小，优先级越高，取值1-255。
     * minimum: 1
     * maximum: 255
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public BackupInfo withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 接入备份地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BackupInfo withAddressCustom(String addressCustom) {
        this.addressCustom = addressCustom;
        return this;
    }

    /**
     * 租户自定义接入备份地址。
     * @return addressCustom
     */
    public String getAddressCustom() {
        return addressCustom;
    }

    public void setAddressCustom(String addressCustom) {
        this.addressCustom = addressCustom;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupInfo that = (BackupInfo) obj;
        return Objects.equals(this.priority, that.priority) && Objects.equals(this.address, that.address)
            && Objects.equals(this.addressCustom, that.addressCustom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, address, addressCustom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupInfo {\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    addressCustom: ").append(toIndentedString(addressCustom)).append("\n");
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
