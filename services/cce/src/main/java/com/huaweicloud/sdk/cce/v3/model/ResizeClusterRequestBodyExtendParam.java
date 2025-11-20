package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 变更集群规格扩展字段 **约束限制**： 不涉及 
 */
public class ResizeClusterRequestBodyExtendParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decMasterFlavor")

    private String decMasterFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoPay")

    private String isAutoPay;

    public ResizeClusterRequestBodyExtendParam withDecMasterFlavor(String decMasterFlavor) {
        this.decMasterFlavor = decMasterFlavor;
        return this;
    }

    /**
     * **参数解释**： 专属云CCE集群可指定控制节点的规格 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return decMasterFlavor
     */
    public String getDecMasterFlavor() {
        return decMasterFlavor;
    }

    public void setDecMasterFlavor(String decMasterFlavor) {
        this.decMasterFlavor = decMasterFlavor;
    }

    public ResizeClusterRequestBodyExtendParam withIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * **参数解释**： 是否自动扣款 **约束限制**： 不涉及 **取值范围**： - “true”：自动扣款 - “false”：不自动扣款 > 包周期集群时生效，不填写此参数时默认不会自动扣款。  **默认取值**： 不涉及 
     * @return isAutoPay
     */
    public String getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeClusterRequestBodyExtendParam that = (ResizeClusterRequestBodyExtendParam) obj;
        return Objects.equals(this.decMasterFlavor, that.decMasterFlavor)
            && Objects.equals(this.isAutoPay, that.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decMasterFlavor, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeClusterRequestBodyExtendParam {\n");
        sb.append("    decMasterFlavor: ").append(toIndentedString(decMasterFlavor)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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
