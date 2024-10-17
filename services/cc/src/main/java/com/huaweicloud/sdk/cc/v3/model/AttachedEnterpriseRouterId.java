package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 被挂载的企业路由器ID。
 */
public class AttachedEnterpriseRouterId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_id")

    private String attachedErId;

    public AttachedEnterpriseRouterId withAttachedErId(String attachedErId) {
        this.attachedErId = attachedErId;
        return this;
    }

    /**
     * 被挂载的企业路由器ID。
     * @return attachedErId
     */
    public String getAttachedErId() {
        return attachedErId;
    }

    public void setAttachedErId(String attachedErId) {
        this.attachedErId = attachedErId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachedEnterpriseRouterId that = (AttachedEnterpriseRouterId) obj;
        return Objects.equals(this.attachedErId, that.attachedErId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedErId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachedEnterpriseRouterId {\n");
        sb.append("    attachedErId: ").append(toIndentedString(attachedErId)).append("\n");
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
