package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 被挂载的企业路由器的项目ID。
 */
public class AttachedEnterpriseRouterProjectId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_table_project_id")

    private String attachedErTableProjectId;

    public AttachedEnterpriseRouterProjectId withAttachedErTableProjectId(String attachedErTableProjectId) {
        this.attachedErTableProjectId = attachedErTableProjectId;
        return this;
    }

    /**
     * 被挂载的企业路由器的项目ID。
     * @return attachedErTableProjectId
     */
    public String getAttachedErTableProjectId() {
        return attachedErTableProjectId;
    }

    public void setAttachedErTableProjectId(String attachedErTableProjectId) {
        this.attachedErTableProjectId = attachedErTableProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachedEnterpriseRouterProjectId that = (AttachedEnterpriseRouterProjectId) obj;
        return Objects.equals(this.attachedErTableProjectId, that.attachedErTableProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedErTableProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachedEnterpriseRouterProjectId {\n");
        sb.append("    attachedErTableProjectId: ").append(toIndentedString(attachedErTableProjectId)).append("\n");
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
