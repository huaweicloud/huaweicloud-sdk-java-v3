package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 被挂载的企业路由器的路由表ID。
 */
public class AttachedEnterpriseRouterTableId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_table_id")

    private String attachedErTableId;

    public AttachedEnterpriseRouterTableId withAttachedErTableId(String attachedErTableId) {
        this.attachedErTableId = attachedErTableId;
        return this;
    }

    /**
     * 被挂载的企业路由器的路由表ID。
     * @return attachedErTableId
     */
    public String getAttachedErTableId() {
        return attachedErTableId;
    }

    public void setAttachedErTableId(String attachedErTableId) {
        this.attachedErTableId = attachedErTableId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachedEnterpriseRouterTableId that = (AttachedEnterpriseRouterTableId) obj;
        return Objects.equals(this.attachedErTableId, that.attachedErTableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedErTableId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachedEnterpriseRouterTableId {\n");
        sb.append("    attachedErTableId: ").append(toIndentedString(attachedErTableId)).append("\n");
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
