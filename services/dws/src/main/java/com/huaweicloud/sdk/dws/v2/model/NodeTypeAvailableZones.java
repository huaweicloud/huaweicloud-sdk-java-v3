package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 规格支持的可用区及状态信息。 **取值范围**： 不涉及。
 */
public class NodeTypeAvailableZones {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public NodeTypeAvailableZones withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**： 可用区ID。 **取值范围**： 不涉及。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public NodeTypeAvailableZones withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 规格可用状态。 **取值范围**： - normal：可用 - sellout：售罄 - abandon：不可用
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeTypeAvailableZones that = (NodeTypeAvailableZones) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeTypeAvailableZones {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
