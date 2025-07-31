package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 安全组列表
 */
public class SecurityGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_name")

    private String securityGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_description")

    private String securityGroupDescription;

    public SecurityGroup withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public SecurityGroup withSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }

    /**
     * 安全组名称
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public SecurityGroup withSecurityGroupDescription(String securityGroupDescription) {
        this.securityGroupDescription = securityGroupDescription;
        return this;
    }

    /**
     * 安全组描述
     * @return securityGroupDescription
     */
    public String getSecurityGroupDescription() {
        return securityGroupDescription;
    }

    public void setSecurityGroupDescription(String securityGroupDescription) {
        this.securityGroupDescription = securityGroupDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityGroup that = (SecurityGroup) obj;
        return Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.securityGroupName, that.securityGroupName)
            && Objects.equals(this.securityGroupDescription, that.securityGroupDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroupId, securityGroupName, securityGroupDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityGroup {\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
        sb.append("    securityGroupDescription: ").append(toIndentedString(securityGroupDescription)).append("\n");
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
