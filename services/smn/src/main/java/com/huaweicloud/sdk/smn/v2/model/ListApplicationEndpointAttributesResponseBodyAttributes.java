package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ListApplicationEndpointAttributesResponseBodyAttributes
 */
public class ListApplicationEndpointAttributesResponseBodyAttributes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    @JacksonXmlProperty(localName = "enabled")

    private String enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    @JacksonXmlProperty(localName = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    @JacksonXmlProperty(localName = "user_data")

    private String userData;

    public ListApplicationEndpointAttributesResponseBodyAttributes withEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 设备是否可用。
     * @return enabled
     */
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public ListApplicationEndpointAttributesResponseBodyAttributes withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 设备token。
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ListApplicationEndpointAttributesResponseBodyAttributes withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 用户数据。
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
        ListApplicationEndpointAttributesResponseBodyAttributes listApplicationEndpointAttributesResponseBodyAttributes =
            (ListApplicationEndpointAttributesResponseBodyAttributes) o;
        return Objects.equals(this.enabled, listApplicationEndpointAttributesResponseBodyAttributes.enabled)
            && Objects.equals(this.token, listApplicationEndpointAttributesResponseBodyAttributes.token)
            && Objects.equals(this.userData, listApplicationEndpointAttributesResponseBodyAttributes.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, token, userData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationEndpointAttributesResponseBodyAttributes {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
