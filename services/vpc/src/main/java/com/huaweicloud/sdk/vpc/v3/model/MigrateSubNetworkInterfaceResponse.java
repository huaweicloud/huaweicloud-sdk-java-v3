package com.huaweicloud.sdk.vpc.v3.model;

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
public class MigrateSubNetworkInterfaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_network_interfaces")

    @JacksonXmlProperty(localName = "sub_network_interfaces")

    private List<SubNetworkInterface> subNetworkInterfaces = null;

    public MigrateSubNetworkInterfaceResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public MigrateSubNetworkInterfaceResponse withSubNetworkInterfaces(List<SubNetworkInterface> subNetworkInterfaces) {
        this.subNetworkInterfaces = subNetworkInterfaces;
        return this;
    }

    public MigrateSubNetworkInterfaceResponse addSubNetworkInterfacesItem(
        SubNetworkInterface subNetworkInterfacesItem) {
        if (this.subNetworkInterfaces == null) {
            this.subNetworkInterfaces = new ArrayList<>();
        }
        this.subNetworkInterfaces.add(subNetworkInterfacesItem);
        return this;
    }

    public MigrateSubNetworkInterfaceResponse withSubNetworkInterfaces(
        Consumer<List<SubNetworkInterface>> subNetworkInterfacesSetter) {
        if (this.subNetworkInterfaces == null) {
            this.subNetworkInterfaces = new ArrayList<>();
        }
        subNetworkInterfacesSetter.accept(this.subNetworkInterfaces);
        return this;
    }

    /**
     * 批量迁移辅助弹性网卡的响应体
     * @return subNetworkInterfaces
     */
    public List<SubNetworkInterface> getSubNetworkInterfaces() {
        return subNetworkInterfaces;
    }

    public void setSubNetworkInterfaces(List<SubNetworkInterface> subNetworkInterfaces) {
        this.subNetworkInterfaces = subNetworkInterfaces;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrateSubNetworkInterfaceResponse migrateSubNetworkInterfaceResponse = (MigrateSubNetworkInterfaceResponse) o;
        return Objects.equals(this.requestId, migrateSubNetworkInterfaceResponse.requestId)
            && Objects.equals(this.subNetworkInterfaces, migrateSubNetworkInterfaceResponse.subNetworkInterfaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, subNetworkInterfaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateSubNetworkInterfaceResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    subNetworkInterfaces: ").append(toIndentedString(subNetworkInterfaces)).append("\n");
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
