package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 修改设备信息对象。 */
public class UpdateDevice {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_info")

    private Object extensionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_info")

    private AuthInfoWithoutSecret authInfo;

    public UpdateDevice withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /** **参数说明**：设备名称。 **取值范围**：长度不超过256，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合，建议不少于4个字符。
     * 
     * @return deviceName */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public UpdateDevice withDescription(String description) {
        this.description = description;
        return this;
    }

    /** **参数说明**：设备的描述信息。 **取值范围**：长度不超过2048，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateDevice withExtensionInfo(Object extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }

    /** **参数说明**：设备扩展信息。用户可以自定义任何想要的扩展信息，修改子设备信息时不会下发给网关。
     * 
     * @return extensionInfo */
    public Object getExtensionInfo() {
        return extensionInfo;
    }

    public void setExtensionInfo(Object extensionInfo) {
        this.extensionInfo = extensionInfo;
    }

    public UpdateDevice withAuthInfo(AuthInfoWithoutSecret authInfo) {
        this.authInfo = authInfo;
        return this;
    }

    public UpdateDevice withAuthInfo(Consumer<AuthInfoWithoutSecret> authInfoSetter) {
        if (this.authInfo == null) {
            this.authInfo = new AuthInfoWithoutSecret();
            authInfoSetter.accept(this.authInfo);
        }

        return this;
    }

    /** Get authInfo
     * 
     * @return authInfo */
    public AuthInfoWithoutSecret getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(AuthInfoWithoutSecret authInfo) {
        this.authInfo = authInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDevice updateDevice = (UpdateDevice) o;
        return Objects.equals(this.deviceName, updateDevice.deviceName)
            && Objects.equals(this.description, updateDevice.description)
            && Objects.equals(this.extensionInfo, updateDevice.extensionInfo)
            && Objects.equals(this.authInfo, updateDevice.authInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceName, description, extensionInfo, authInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDevice {\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    extensionInfo: ").append(toIndentedString(extensionInfo)).append("\n");
        sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
