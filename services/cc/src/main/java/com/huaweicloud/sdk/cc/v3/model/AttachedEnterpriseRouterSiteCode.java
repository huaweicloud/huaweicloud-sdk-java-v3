package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 被挂载的企业路由器的站点编码。
 */
public class AttachedEnterpriseRouterSiteCode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_table_site_code")

    private String attachedErTableSiteCode;

    public AttachedEnterpriseRouterSiteCode withAttachedErTableSiteCode(String attachedErTableSiteCode) {
        this.attachedErTableSiteCode = attachedErTableSiteCode;
        return this;
    }

    /**
     * 被挂载的企业路由器的站点编码。
     * @return attachedErTableSiteCode
     */
    public String getAttachedErTableSiteCode() {
        return attachedErTableSiteCode;
    }

    public void setAttachedErTableSiteCode(String attachedErTableSiteCode) {
        this.attachedErTableSiteCode = attachedErTableSiteCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachedEnterpriseRouterSiteCode that = (AttachedEnterpriseRouterSiteCode) obj;
        return Objects.equals(this.attachedErTableSiteCode, that.attachedErTableSiteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedErTableSiteCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachedEnterpriseRouterSiteCode {\n");
        sb.append("    attachedErTableSiteCode: ").append(toIndentedString(attachedErTableSiteCode)).append("\n");
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
