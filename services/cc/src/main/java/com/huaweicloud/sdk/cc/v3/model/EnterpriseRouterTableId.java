package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 企业路由器的路由表ID。
 */
public class EnterpriseRouterTableId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_table_id")

    private String enterpriseRouterTableId;

    public EnterpriseRouterTableId withEnterpriseRouterTableId(String enterpriseRouterTableId) {
        this.enterpriseRouterTableId = enterpriseRouterTableId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return enterpriseRouterTableId
     */
    public String getEnterpriseRouterTableId() {
        return enterpriseRouterTableId;
    }

    public void setEnterpriseRouterTableId(String enterpriseRouterTableId) {
        this.enterpriseRouterTableId = enterpriseRouterTableId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnterpriseRouterTableId that = (EnterpriseRouterTableId) obj;
        return Objects.equals(this.enterpriseRouterTableId, that.enterpriseRouterTableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseRouterTableId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseRouterTableId {\n");
        sb.append("    enterpriseRouterTableId: ").append(toIndentedString(enterpriseRouterTableId)).append("\n");
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
