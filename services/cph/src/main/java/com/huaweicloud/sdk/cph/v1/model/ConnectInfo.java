package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云手机信息。
 */
public class ConnectInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_id")

    private String phoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_info")

    private ConnectInfoAccessInfo accessInfo;

    public ConnectInfo withPhoneId(String phoneId) {
        this.phoneId = phoneId;
        return this;
    }

    /**
     * 云手机的唯一标识。
     * @return phoneId
     */
    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public ConnectInfo withAccessInfo(ConnectInfoAccessInfo accessInfo) {
        this.accessInfo = accessInfo;
        return this;
    }

    public ConnectInfo withAccessInfo(Consumer<ConnectInfoAccessInfo> accessInfoSetter) {
        if (this.accessInfo == null) {
            this.accessInfo = new ConnectInfoAccessInfo();
            accessInfoSetter.accept(this.accessInfo);
        }

        return this;
    }

    /**
     * Get accessInfo
     * @return accessInfo
     */
    public ConnectInfoAccessInfo getAccessInfo() {
        return accessInfo;
    }

    public void setAccessInfo(ConnectInfoAccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectInfo that = (ConnectInfo) obj;
        return Objects.equals(this.phoneId, that.phoneId) && Objects.equals(this.accessInfo, that.accessInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneId, accessInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectInfo {\n");
        sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
        sb.append("    accessInfo: ").append(toIndentedString(accessInfo)).append("\n");
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
