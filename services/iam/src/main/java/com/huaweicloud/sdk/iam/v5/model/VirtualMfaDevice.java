package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MFA设备。
 */
public class VirtualMfaDevice {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base32_string_seed")

    private String base32StringSeed;

    public VirtualMfaDevice withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * MFA设备序列号。
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public VirtualMfaDevice withBase32StringSeed(String base32StringSeed) {
        this.base32StringSeed = base32StringSeed;
        return this;
    }

    /**
     * 密钥信息，用于第三方生成图片验证码。
     * @return base32StringSeed
     */
    public String getBase32StringSeed() {
        return base32StringSeed;
    }

    public void setBase32StringSeed(String base32StringSeed) {
        this.base32StringSeed = base32StringSeed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VirtualMfaDevice that = (VirtualMfaDevice) obj;
        return Objects.equals(this.serialNumber, that.serialNumber)
            && Objects.equals(this.base32StringSeed, that.base32StringSeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, base32StringSeed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualMfaDevice {\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    base32StringSeed: ").append(toIndentedString(base32StringSeed)).append("\n");
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
