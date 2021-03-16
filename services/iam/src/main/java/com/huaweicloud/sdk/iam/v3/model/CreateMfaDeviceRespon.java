package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MFA设备密钥。
 */
public class CreateMfaDeviceRespon  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="serial_number")
    
    private String serialNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="base32_string_seed")
    
    private String base32StringSeed;

    public CreateMfaDeviceRespon withSerialNumber(String serialNumber) {
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

    

    public CreateMfaDeviceRespon withBase32StringSeed(String base32StringSeed) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMfaDeviceRespon createMfaDeviceRespon = (CreateMfaDeviceRespon) o;
        return Objects.equals(this.serialNumber, createMfaDeviceRespon.serialNumber) &&
            Objects.equals(this.base32StringSeed, createMfaDeviceRespon.base32StringSeed);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, base32StringSeed);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMfaDeviceRespon {\n");
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

