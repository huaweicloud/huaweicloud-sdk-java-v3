package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEncodeServersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encode_servers")

    @JacksonXmlProperty(localName = "encode_servers")

    private List<Object> encodeServers = null;

    public ListEncodeServersResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListEncodeServersResponse withEncodeServers(List<Object> encodeServers) {
        this.encodeServers = encodeServers;
        return this;
    }

    public ListEncodeServersResponse addEncodeServersItem(Object encodeServersItem) {
        if (this.encodeServers == null) {
            this.encodeServers = new ArrayList<>();
        }
        this.encodeServers.add(encodeServersItem);
        return this;
    }

    public ListEncodeServersResponse withEncodeServers(Consumer<List<Object>> encodeServersSetter) {
        if (this.encodeServers == null) {
            this.encodeServers = new ArrayList<>();
        }
        encodeServersSetter.accept(this.encodeServers);
        return this;
    }

    /**
     * 编码服务信息
     * @return encodeServers
     */
    public List<Object> getEncodeServers() {
        return encodeServers;
    }

    public void setEncodeServers(List<Object> encodeServers) {
        this.encodeServers = encodeServers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEncodeServersResponse listEncodeServersResponse = (ListEncodeServersResponse) o;
        return Objects.equals(this.requestId, listEncodeServersResponse.requestId)
            && Objects.equals(this.encodeServers, listEncodeServersResponse.encodeServers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, encodeServers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEncodeServersResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    encodeServers: ").append(toIndentedString(encodeServers)).append("\n");
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
