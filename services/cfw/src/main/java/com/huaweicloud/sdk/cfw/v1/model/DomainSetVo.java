package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DomainSetVo
 */
public class DomainSetVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_id")

    private String setId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_count")

    private Integer refCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_set_type")

    private Integer domainSetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_status")

    private Integer configStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<UseRuleVO> rules = null;

    public DomainSetVo withSetId(String setId) {
        this.setId = setId;
        return this;
    }

    /**
     * 域名组id
     * @return setId
     */
    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public DomainSetVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 域名组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DomainSetVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 域名组描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DomainSetVo withRefCount(Integer refCount) {
        this.refCount = refCount;
        return this;
    }

    /**
     * 域名组被规则引用次数
     * @return refCount
     */
    public Integer getRefCount() {
        return refCount;
    }

    public void setRefCount(Integer refCount) {
        this.refCount = refCount;
    }

    public DomainSetVo withDomainSetType(Integer domainSetType) {
        this.domainSetType = domainSetType;
        return this;
    }

    /**
     * 域名组类型，0表示应用域名组，1表示网络域名组
     * @return domainSetType
     */
    public Integer getDomainSetType() {
        return domainSetType;
    }

    public void setDomainSetType(Integer domainSetType) {
        this.domainSetType = domainSetType;
    }

    public DomainSetVo withConfigStatus(Integer configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    /**
     * 配置状态，-1表示未配置态，0表示配置失败，1表示配置成功，2表示配置中，3表示正常，4表示配置异常
     * @return configStatus
     */
    public Integer getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(Integer configStatus) {
        this.configStatus = configStatus;
    }

    public DomainSetVo withRules(List<UseRuleVO> rules) {
        this.rules = rules;
        return this;
    }

    public DomainSetVo addRulesItem(UseRuleVO rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public DomainSetVo withRules(Consumer<List<UseRuleVO>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 使用规则id列表
     * @return rules
     */
    public List<UseRuleVO> getRules() {
        return rules;
    }

    public void setRules(List<UseRuleVO> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainSetVo that = (DomainSetVo) obj;
        return Objects.equals(this.setId, that.setId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.refCount, that.refCount)
            && Objects.equals(this.domainSetType, that.domainSetType)
            && Objects.equals(this.configStatus, that.configStatus) && Objects.equals(this.rules, that.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setId, name, description, refCount, domainSetType, configStatus, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainSetVo {\n");
        sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    refCount: ").append(toIndentedString(refCount)).append("\n");
        sb.append("    domainSetType: ").append(toIndentedString(domainSetType)).append("\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
