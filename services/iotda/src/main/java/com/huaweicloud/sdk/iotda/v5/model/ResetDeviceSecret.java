package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResetDeviceSecret
 */
public class ResetDeviceSecret  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secret")
    
    private String secret;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="force_disconnect")
    
    private Boolean forceDisconnect = false;

    public ResetDeviceSecret withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    


    /**
     * 设备密钥，设置该字段时平台将设备密钥重置为指定值，若不设置则由平台自动生成。
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public ResetDeviceSecret withForceDisconnect(Boolean forceDisconnect) {
        this.forceDisconnect = forceDisconnect;
        return this;
    }

    


    /**
     * 是否强制断开设备的连接，当前仅限长连接。
     * @return forceDisconnect
     */
    public Boolean getForceDisconnect() {
        return forceDisconnect;
    }

    public void setForceDisconnect(Boolean forceDisconnect) {
        this.forceDisconnect = forceDisconnect;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetDeviceSecret resetDeviceSecret = (ResetDeviceSecret) o;
        return Objects.equals(this.secret, resetDeviceSecret.secret) &&
            Objects.equals(this.forceDisconnect, resetDeviceSecret.forceDisconnect);
    }
    @Override
    public int hashCode() {
        return Objects.hash(secret, forceDisconnect);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetDeviceSecret {\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
        sb.append("    forceDisconnect: ").append(toIndentedString(forceDisconnect)).append("\n");
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

