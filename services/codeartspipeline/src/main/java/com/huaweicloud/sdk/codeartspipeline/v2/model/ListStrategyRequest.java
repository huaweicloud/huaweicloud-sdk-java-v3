package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListStrategyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_tenant_rule_set")

    private Boolean includeTenantRuleSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_valid")

    private Boolean isValid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_project_id")

    private String cloudProjectId;

    public ListStrategyRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListStrategyRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，offset大于等于0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListStrategyRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListStrategyRequest withIncludeTenantRuleSet(Boolean includeTenantRuleSet) {
        this.includeTenantRuleSet = includeTenantRuleSet;
        return this;
    }

    /**
     * 是否包含租户级规则
     * @return includeTenantRuleSet
     */
    public Boolean getIncludeTenantRuleSet() {
        return includeTenantRuleSet;
    }

    public void setIncludeTenantRuleSet(Boolean includeTenantRuleSet) {
        this.includeTenantRuleSet = includeTenantRuleSet;
    }

    public ListStrategyRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称，用于模糊查询
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListStrategyRequest withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * 是否有效
     * @return isValid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public ListStrategyRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 策略类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListStrategyRequest withCloudProjectId(String cloudProjectId) {
        this.cloudProjectId = cloudProjectId;
        return this;
    }

    /**
     * 项目ID
     * @return cloudProjectId
     */
    public String getCloudProjectId() {
        return cloudProjectId;
    }

    public void setCloudProjectId(String cloudProjectId) {
        this.cloudProjectId = cloudProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStrategyRequest that = (ListStrategyRequest) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.includeTenantRuleSet, that.includeTenantRuleSet)
            && Objects.equals(this.name, that.name) && Objects.equals(this.isValid, that.isValid)
            && Objects.equals(this.type, that.type) && Objects.equals(this.cloudProjectId, that.cloudProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, offset, limit, includeTenantRuleSet, name, isValid, type, cloudProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStrategyRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    includeTenantRuleSet: ").append(toIndentedString(includeTenantRuleSet)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cloudProjectId: ").append(toIndentedString(cloudProjectId)).append("\n");
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
