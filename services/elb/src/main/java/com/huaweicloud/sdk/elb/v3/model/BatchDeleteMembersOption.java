package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchDeleteMembersOption
 */
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

    /**
     * **参数解释**：需要删除的后端服务器ID。  **约束限制**： - 若传入id则不能传其他参数，否则报错。  **取值范围**：不涉及  **默认取值**：不涉及  > 此处并非ECS服务器的ID，而是ELB为绑定的后端服务器自动生成的member ID。
     * @return id
     */
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

    /**
     * **参数解释**：后端服务器IP地址。  **约束限制**： - address和protocol_port必须同时传入。 - 不能同时传入ID字段。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return address
     */
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

    /**
     * **参数解释**：后端服务器端口。  **约束限制**： - address和protocol_port必须同时传入。 - 不能同时传入ID字段。 - 可以传0，用于删除端口透传pool下的member。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteMembersOption that = (BatchDeleteMembersOption) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.address, that.address)
            && Objects.equals(this.protocolPort, that.protocolPort);
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
