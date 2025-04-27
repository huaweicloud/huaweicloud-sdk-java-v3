package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyNodeDataIpRequest
 */
public class ModifyNodeDataIpRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_ip")

    private String internalIp;

    public ModifyNodeDataIpRequest withInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    /**
     * **参数解释**：              内网IP地址。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认值**：  不涉及。 
     * @return internalIp
     */
    public String getInternalIp() {
        return internalIp;
    }

    public void setInternalIp(String internalIp) {
        this.internalIp = internalIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyNodeDataIpRequest that = (ModifyNodeDataIpRequest) obj;
        return Objects.equals(this.internalIp, that.internalIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internalIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyNodeDataIpRequest {\n");
        sb.append("    internalIp: ").append(toIndentedString(internalIp)).append("\n");
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
