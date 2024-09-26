package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 中心网络企业路由器的站点编码。
 */
public class EnterpriseRouterSiteCode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_site_code")

    private String enterpriseRouterSiteCode;

    public EnterpriseRouterSiteCode withEnterpriseRouterSiteCode(String enterpriseRouterSiteCode) {
        this.enterpriseRouterSiteCode = enterpriseRouterSiteCode;
        return this;
    }

    /**
     * 中心网络企业路由器的站点编码。
     * @return enterpriseRouterSiteCode
     */
    public String getEnterpriseRouterSiteCode() {
        return enterpriseRouterSiteCode;
    }

    public void setEnterpriseRouterSiteCode(String enterpriseRouterSiteCode) {
        this.enterpriseRouterSiteCode = enterpriseRouterSiteCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnterpriseRouterSiteCode that = (EnterpriseRouterSiteCode) obj;
        return Objects.equals(this.enterpriseRouterSiteCode, that.enterpriseRouterSiteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseRouterSiteCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseRouterSiteCode {\n");
        sb.append("    enterpriseRouterSiteCode: ").append(toIndentedString(enterpriseRouterSiteCode)).append("\n");
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
