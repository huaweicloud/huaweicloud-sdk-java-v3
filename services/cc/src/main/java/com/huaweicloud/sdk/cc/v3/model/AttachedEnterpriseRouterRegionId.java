package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ER路由器的regionID。
 */
public class AttachedEnterpriseRouterRegionId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_table_region_id")

    private String attachedErTableRegionId;

    public AttachedEnterpriseRouterRegionId withAttachedErTableRegionId(String attachedErTableRegionId) {
        this.attachedErTableRegionId = attachedErTableRegionId;
        return this;
    }

    /**
     * ER路由器的regionID。
     * @return attachedErTableRegionId
     */
    public String getAttachedErTableRegionId() {
        return attachedErTableRegionId;
    }

    public void setAttachedErTableRegionId(String attachedErTableRegionId) {
        this.attachedErTableRegionId = attachedErTableRegionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachedEnterpriseRouterRegionId that = (AttachedEnterpriseRouterRegionId) obj;
        return Objects.equals(this.attachedErTableRegionId, that.attachedErTableRegionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedErTableRegionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachedEnterpriseRouterRegionId {\n");
        sb.append("    attachedErTableRegionId: ").append(toIndentedString(attachedErTableRegionId)).append("\n");
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
