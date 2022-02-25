package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 批量删除member请求参数。 */
public class BatchDeleteMembersOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    public BatchDeleteMembersOption withId(String id) {
        this.id = id;
        return this;
    }

    /** 需要删除的后端服务器ID。 使用说明： - 若传入id则不能传其他参数，否则报错。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchDeleteMembersOption withAddress(String address) {
        this.address = address;
        return this;
    }

    /** 后端服务器IP地址。 使用说明： - address和protocol_port必须同时传入。 - 不能同时传入ID字段
     * 
     * @return address */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BatchDeleteMembersOption withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /** 后端服务器端口。 使用说明： - address和protocol_port必须同时传入。 - 不能同时传入ID字段
     * 
     * @return protocolPort */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteMembersOption batchDeleteMembersOption = (BatchDeleteMembersOption) o;
        return Objects.equals(this.id, batchDeleteMembersOption.id)
            && Objects.equals(this.address, batchDeleteMembersOption.address)
            && Objects.equals(this.protocolPort, batchDeleteMembersOption.protocolPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, protocolPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteMembersOption {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
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
