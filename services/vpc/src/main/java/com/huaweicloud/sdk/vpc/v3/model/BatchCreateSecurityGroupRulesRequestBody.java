package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class BatchCreateSecurityGroupRulesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_rules")

    private List<BatchCreateSecurityGroupRulesOption> securityGroupRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_duplicate")

    private Boolean ignoreDuplicate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    public BatchCreateSecurityGroupRulesRequestBody withSecurityGroupRules(
        List<BatchCreateSecurityGroupRulesOption> securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
        return this;
    }

    public BatchCreateSecurityGroupRulesRequestBody addSecurityGroupRulesItem(
        BatchCreateSecurityGroupRulesOption securityGroupRulesItem) {
        if (this.securityGroupRules == null) {
            this.securityGroupRules = new ArrayList<>();
        }
        this.securityGroupRules.add(securityGroupRulesItem);
        return this;
    }

    public BatchCreateSecurityGroupRulesRequestBody withSecurityGroupRules(
        Consumer<List<BatchCreateSecurityGroupRulesOption>> securityGroupRulesSetter) {
        if (this.securityGroupRules == null) {
            this.securityGroupRules = new ArrayList<>();
        }
        securityGroupRulesSetter.accept(this.securityGroupRules);
        return this;
    }

    /**
     * 待创建的安全组规则列表
     * @return securityGroupRules
     */
    public List<BatchCreateSecurityGroupRulesOption> getSecurityGroupRules() {
        return securityGroupRules;
    }

    public void setSecurityGroupRules(List<BatchCreateSecurityGroupRulesOption> securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
    }

    public BatchCreateSecurityGroupRulesRequestBody withIgnoreDuplicate(Boolean ignoreDuplicate) {
        this.ignoreDuplicate = ignoreDuplicate;
        return this;
    }

    /**
     * 创建时是否忽略重复的安全组规则 默认为false
     * @return ignoreDuplicate
     */
    public Boolean getIgnoreDuplicate() {
        return ignoreDuplicate;
    }

    public void setIgnoreDuplicate(Boolean ignoreDuplicate) {
        this.ignoreDuplicate = ignoreDuplicate;
    }

    public BatchCreateSecurityGroupRulesRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 功能说明：是否只预检此次请求 取值范围： -true：发送检查请求，不会创建安全组规则。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回响应码202。 -false（默认值）：发送正常请求，并直接创建安全组规则。
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateSecurityGroupRulesRequestBody that = (BatchCreateSecurityGroupRulesRequestBody) obj;
        return Objects.equals(this.securityGroupRules, that.securityGroupRules)
            && Objects.equals(this.ignoreDuplicate, that.ignoreDuplicate) && Objects.equals(this.dryRun, that.dryRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroupRules, ignoreDuplicate, dryRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateSecurityGroupRulesRequestBody {\n");
        sb.append("    securityGroupRules: ").append(toIndentedString(securityGroupRules)).append("\n");
        sb.append("    ignoreDuplicate: ").append(toIndentedString(ignoreDuplicate)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
