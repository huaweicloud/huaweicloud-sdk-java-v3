package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ChangeSecurityGroupReq
 */
public class ChangeSecurityGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_ids")

    private String securityGroupIds;

    public ChangeSecurityGroupReq withSecurityGroupIds(String securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * 期望安全组的ID。
     * @return securityGroupIds
     */
    public String getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(String securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeSecurityGroupReq changeSecurityGroupReq = (ChangeSecurityGroupReq) o;
        return Objects.equals(this.securityGroupIds, changeSecurityGroupReq.securityGroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroupIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeSecurityGroupReq {\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
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
