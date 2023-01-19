package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EncCertInfo
 */
public class EncCertInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_serial_number")

    private String encSerialNumber;

    public EncCertInfo withEncSerialNumber(String encSerialNumber) {
        this.encSerialNumber = encSerialNumber;
        return this;
    }

    /**
     * 加密证书序列号。
     * @return encSerialNumber
     */
    public String getEncSerialNumber() {
        return encSerialNumber;
    }

    public void setEncSerialNumber(String encSerialNumber) {
        this.encSerialNumber = encSerialNumber;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EncCertInfo encCertInfo = (EncCertInfo) o;
        return Objects.equals(this.encSerialNumber, encCertInfo.encSerialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encSerialNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncCertInfo {\n");
        sb.append("    encSerialNumber: ").append(toIndentedString(encSerialNumber)).append("\n");
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
