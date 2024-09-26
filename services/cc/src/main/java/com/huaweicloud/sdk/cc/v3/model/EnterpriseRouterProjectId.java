package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 企业路由器的项目ID。
 */
public class EnterpriseRouterProjectId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_project_id")

    private String enterpriseRouterProjectId;

    public EnterpriseRouterProjectId withEnterpriseRouterProjectId(String enterpriseRouterProjectId) {
        this.enterpriseRouterProjectId = enterpriseRouterProjectId;
        return this;
    }

    /**
     * 企业路由器的项目ID。
     * @return enterpriseRouterProjectId
     */
    public String getEnterpriseRouterProjectId() {
        return enterpriseRouterProjectId;
    }

    public void setEnterpriseRouterProjectId(String enterpriseRouterProjectId) {
        this.enterpriseRouterProjectId = enterpriseRouterProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnterpriseRouterProjectId that = (EnterpriseRouterProjectId) obj;
        return Objects.equals(this.enterpriseRouterProjectId, that.enterpriseRouterProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseRouterProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseRouterProjectId {\n");
        sb.append("    enterpriseRouterProjectId: ").append(toIndentedString(enterpriseRouterProjectId)).append("\n");
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
