package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UpdateApplicationEndpointRequestBody
 */
public class UpdateApplicationEndpointRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    @JacksonXmlProperty(localName = "enabled")

    private String enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    @JacksonXmlProperty(localName = "user_data")

    private String userData;

    public UpdateApplicationEndpointRequestBody withEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 设备是否可用，值为true或false字符串。
     * @return enabled
     */
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public UpdateApplicationEndpointRequestBody withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 用户自定义数据，最大长度支持UTF-8编码后2048字节。
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateApplicationEndpointRequestBody updateApplicationEndpointRequestBody =
            (UpdateApplicationEndpointRequestBody) o;
        return Objects.equals(this.enabled, updateApplicationEndpointRequestBody.enabled)
            && Objects.equals(this.userData, updateApplicationEndpointRequestBody.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, userData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateApplicationEndpointRequestBody {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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
