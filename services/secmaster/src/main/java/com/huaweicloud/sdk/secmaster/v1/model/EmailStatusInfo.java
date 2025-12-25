package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 邮箱状态信息
 */
public class EmailStatusInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confirm_status")

    private String confirmStatus;

    public EmailStatusInfo withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 邮箱地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmailStatusInfo withConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
        return this;
    }

    /**
     * 邮箱状态，FINISH表示已通过校验；其他状态需要校验
     * @return confirmStatus
     */
    public String getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmailStatusInfo that = (EmailStatusInfo) obj;
        return Objects.equals(this.address, that.address) && Objects.equals(this.confirmStatus, that.confirmStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, confirmStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmailStatusInfo {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    confirmStatus: ").append(toIndentedString(confirmStatus)).append("\n");
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
