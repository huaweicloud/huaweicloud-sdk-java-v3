package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 反参全部信息
 */
public class RmAuthTokenRespData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private RmAuthTokenRespDataResource resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_token")

    private String deviceToken;

    public RmAuthTokenRespData withResource(RmAuthTokenRespDataResource resource) {
        this.resource = resource;
        return this;
    }

    public RmAuthTokenRespData withResource(Consumer<RmAuthTokenRespDataResource> resourceSetter) {
        if (this.resource == null) {
            this.resource = new RmAuthTokenRespDataResource();
            resourceSetter.accept(this.resource);
        }

        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    public RmAuthTokenRespDataResource getResource() {
        return resource;
    }

    public void setResource(RmAuthTokenRespDataResource resource) {
        this.resource = resource;
    }

    public RmAuthTokenRespData withDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }

    /**
     * 设备鉴权token
     * @return deviceToken
     */
    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RmAuthTokenRespData that = (RmAuthTokenRespData) obj;
        return Objects.equals(this.resource, that.resource) && Objects.equals(this.deviceToken, that.deviceToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, deviceToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RmAuthTokenRespData {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
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
