package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 安全组诊断结果
 */
public class SecurityGroupResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private DiagnoseResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private List<SecurityGroupStatus> securityGroup = null;

    public SecurityGroupResult withResult(DiagnoseResult result) {
        this.result = result;
        return this;
    }

    /**
     * Get result
     * @return result
     */
    public DiagnoseResult getResult() {
        return result;
    }

    public void setResult(DiagnoseResult result) {
        this.result = result;
    }

    public SecurityGroupResult withSecurityGroup(List<SecurityGroupStatus> securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public SecurityGroupResult addSecurityGroupItem(SecurityGroupStatus securityGroupItem) {
        if (this.securityGroup == null) {
            this.securityGroup = new ArrayList<>();
        }
        this.securityGroup.add(securityGroupItem);
        return this;
    }

    public SecurityGroupResult withSecurityGroup(Consumer<List<SecurityGroupStatus>> securityGroupSetter) {
        if (this.securityGroup == null) {
            this.securityGroup = new ArrayList<>();
        }
        securityGroupSetter.accept(this.securityGroup);
        return this;
    }

    /**
     * kerberos信息
     * @return securityGroup
     */
    public List<SecurityGroupStatus> getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(List<SecurityGroupStatus> securityGroup) {
        this.securityGroup = securityGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityGroupResult that = (SecurityGroupResult) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.securityGroup, that.securityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, securityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityGroupResult {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
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
