package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：后端服务器检测任务各检查项的检测结果。
 */
public class MemberCheckJobResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private MemberCheckJobResultGroup config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl")

    private MemberCheckJobResultGroup acl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private MemberCheckJobResultGroup securityGroup;

    public MemberCheckJobResult withConfig(MemberCheckJobResultGroup config) {
        this.config = config;
        return this;
    }

    public MemberCheckJobResult withConfig(Consumer<MemberCheckJobResultGroup> configSetter) {
        if (this.config == null) {
            this.config = new MemberCheckJobResultGroup();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public MemberCheckJobResultGroup getConfig() {
        return config;
    }

    public void setConfig(MemberCheckJobResultGroup config) {
        this.config = config;
    }

    public MemberCheckJobResult withAcl(MemberCheckJobResultGroup acl) {
        this.acl = acl;
        return this;
    }

    public MemberCheckJobResult withAcl(Consumer<MemberCheckJobResultGroup> aclSetter) {
        if (this.acl == null) {
            this.acl = new MemberCheckJobResultGroup();
            aclSetter.accept(this.acl);
        }

        return this;
    }

    /**
     * Get acl
     * @return acl
     */
    public MemberCheckJobResultGroup getAcl() {
        return acl;
    }

    public void setAcl(MemberCheckJobResultGroup acl) {
        this.acl = acl;
    }

    public MemberCheckJobResult withSecurityGroup(MemberCheckJobResultGroup securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public MemberCheckJobResult withSecurityGroup(Consumer<MemberCheckJobResultGroup> securityGroupSetter) {
        if (this.securityGroup == null) {
            this.securityGroup = new MemberCheckJobResultGroup();
            securityGroupSetter.accept(this.securityGroup);
        }

        return this;
    }

    /**
     * Get securityGroup
     * @return securityGroup
     */
    public MemberCheckJobResultGroup getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(MemberCheckJobResultGroup securityGroup) {
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
        MemberCheckJobResult that = (MemberCheckJobResult) obj;
        return Objects.equals(this.config, that.config) && Objects.equals(this.acl, that.acl)
            && Objects.equals(this.securityGroup, that.securityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(config, acl, securityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberCheckJobResult {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
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
