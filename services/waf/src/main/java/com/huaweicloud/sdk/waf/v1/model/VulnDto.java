package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 漏洞信息
 */
public class VulnDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerability_id")

    private String vulnerabilityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_ids")

    private List<String> ruleIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public VulnDto withVulnerabilityId(String vulnerabilityId) {
        this.vulnerabilityId = vulnerabilityId;
        return this;
    }

    /**
     * 漏洞编号
     * @return vulnerabilityId
     */
    public String getVulnerabilityId() {
        return vulnerabilityId;
    }

    public void setVulnerabilityId(String vulnerabilityId) {
        this.vulnerabilityId = vulnerabilityId;
    }

    public VulnDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 漏洞描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VulnDto withRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    public VulnDto addRuleIdsItem(String ruleIdsItem) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        this.ruleIds.add(ruleIdsItem);
        return this;
    }

    public VulnDto withRuleIds(Consumer<List<String>> ruleIdsSetter) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        ruleIdsSetter.accept(this.ruleIds);
        return this;
    }

    /**
     * 可防护的规则ID列表
     * @return ruleIds
     */
    public List<String> getRuleIds() {
        return ruleIds;
    }

    public void setRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
    }

    public VulnDto withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 漏洞情报创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulnDto that = (VulnDto) obj;
        return Objects.equals(this.vulnerabilityId, that.vulnerabilityId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.ruleIds, that.ruleIds)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulnerabilityId, description, ruleIds, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulnDto {\n");
        sb.append("    vulnerabilityId: ").append(toIndentedString(vulnerabilityId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
