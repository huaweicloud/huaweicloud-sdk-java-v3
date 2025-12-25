package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecurityGroup
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
     * **参数解释** 云原生网络模型中安全组的唯一标识，用于关联具体安全组到策略 **约束限制** 安全组需与集群处于同一VPC网络，否则关联失败 **取值范围** 字符长度1-64位，支持字母、数字、短横线（-）、下划线（_） **默认取值** 无 
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
     * **参数解释** 安全组的名称，用于辅助标识安全组，仅作展示用途 **约束限制** 若传入该参数，需与security_group_id对应的安全组名称一致，否则可能导致展示异常（不影响功能） **取值范围** 字符长度1-64位，支持中文、英文、数字、短横线（-）、下划线（_） **默认取值** 无，默认使用安全组ID对应的系统名称 
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
     * **参数解释** 安全组的描述信息，用于记录安全组的用途、权限范围等备注 **约束限制** 描述内容不能包含HTML标签等特殊字符 **取值范围** 字符长度0-256位，支持中文、英文、数字、常用标点符号及空格 **默认取值** 无，不修改安全组描述（若原有描述为空则保持为空） 
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
