package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 企业路由器的连接ID。
 */
public class EnterpriseRouterAttachmentId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_attachment_id")

    private String enterpriseRouterAttachmentId;

    public EnterpriseRouterAttachmentId withEnterpriseRouterAttachmentId(String enterpriseRouterAttachmentId) {
        this.enterpriseRouterAttachmentId = enterpriseRouterAttachmentId;
        return this;
    }

    /**
     * 企业路由器的连接ID。
     * @return enterpriseRouterAttachmentId
     */
    public String getEnterpriseRouterAttachmentId() {
        return enterpriseRouterAttachmentId;
    }

    public void setEnterpriseRouterAttachmentId(String enterpriseRouterAttachmentId) {
        this.enterpriseRouterAttachmentId = enterpriseRouterAttachmentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnterpriseRouterAttachmentId that = (EnterpriseRouterAttachmentId) obj;
        return Objects.equals(this.enterpriseRouterAttachmentId, that.enterpriseRouterAttachmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseRouterAttachmentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseRouterAttachmentId {\n");
        sb.append("    enterpriseRouterAttachmentId: ")
            .append(toIndentedString(enterpriseRouterAttachmentId))
            .append("\n");
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
