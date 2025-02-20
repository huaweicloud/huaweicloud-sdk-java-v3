package com.huaweicloud.sdk.smnglobal.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListSubscriptionUserResponseHttpEndpointInfo
 */
public class ListSubscriptionUserResponseHttpEndpointInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header")

    private Map<String, String> header = null;

    public ListSubscriptionUserResponseHttpEndpointInfo withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 终端地址。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ListSubscriptionUserResponseHttpEndpointInfo withHeader(Map<String, String> header) {
        this.header = header;
        return this;
    }

    public ListSubscriptionUserResponseHttpEndpointInfo putHeaderItem(String key, String headerItem) {
        if (this.header == null) {
            this.header = new HashMap<>();
        }
        this.header.put(key, headerItem);
        return this;
    }

    public ListSubscriptionUserResponseHttpEndpointInfo withHeader(Consumer<Map<String, String>> headerSetter) {
        if (this.header == null) {
            this.header = new HashMap<>();
        }
        headerSetter.accept(this.header);
        return this;
    }

    /**
     * http协议订阅用户的自定义请求头。http协议订阅用户可以自定义请求头。
     * @return header
     */
    public Map<String, String> getHeader() {
        return header;
    }

    public void setHeader(Map<String, String> header) {
        this.header = header;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubscriptionUserResponseHttpEndpointInfo that = (ListSubscriptionUserResponseHttpEndpointInfo) obj;
        return Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.header, that.header);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, header);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionUserResponseHttpEndpointInfo {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
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
