package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateReinstallCmdRequestBody
 */
public class CreateReinstallCmdRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_secret")

    private String deviceSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_code")

    private String verifyCode;

    public CreateReinstallCmdRequestBody withDeviceSecret(String deviceSecret) {
        this.deviceSecret = deviceSecret;
        return this;
    }

    /**
     * 边缘节点设备密钥，如果不输入则平台随机生成
     * @return deviceSecret
     */
    public String getDeviceSecret() {
        return deviceSecret;
    }

    public void setDeviceSecret(String deviceSecret) {
        this.deviceSecret = deviceSecret;
    }

    public CreateReinstallCmdRequestBody withVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }

    /**
     * 边缘节点注册使用的验证码，如果不输入则平台随机生成。
     * @return verifyCode
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateReinstallCmdRequestBody that = (CreateReinstallCmdRequestBody) obj;
        return Objects.equals(this.deviceSecret, that.deviceSecret) && Objects.equals(this.verifyCode, that.verifyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceSecret, verifyCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReinstallCmdRequestBody {\n");
        sb.append("    deviceSecret: ").append(toIndentedString(deviceSecret)).append("\n");
        sb.append("    verifyCode: ").append(toIndentedString(verifyCode)).append("\n");
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
