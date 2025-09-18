package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProjectStrategyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updater")

    private String updater;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_valid")

    private Boolean isValid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_instances")

    private List<RuleInstance> ruleInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_public")

    private Boolean isPublic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_legacy")

    private Boolean isLegacy;

    public ShowProjectStrategyResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 规则模板实例ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowProjectStrategyResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 规则模板实例名称。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowProjectStrategyResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 规则模板类型。 **取值范围**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowProjectStrategyResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 规则模板策略。 **取值范围**： 不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowProjectStrategyResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释**： 策略创建人。 **取值范围**： 不涉及。 
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ShowProjectStrategyResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 策略创建时间。 **取值范围**： 不涉及。 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowProjectStrategyResponse withUpdater(String updater) {
        this.updater = updater;
        return this;
    }

    /**
     * **参数解释**： 策略最近更新人。 **取值范围**： 不涉及。 
     * @return updater
     */
    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public ShowProjectStrategyResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 策略最近更新时间。 **取值范围**： 不涉及。 
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowProjectStrategyResponse withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * **参数解释**： 策略是否生效。 **取值范围**： - true：策略生效。 - false：策略不生效。 
     * @return isValid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public ShowProjectStrategyResponse withRuleInstances(List<RuleInstance> ruleInstances) {
        this.ruleInstances = ruleInstances;
        return this;
    }

    public ShowProjectStrategyResponse addRuleInstancesItem(RuleInstance ruleInstancesItem) {
        if (this.ruleInstances == null) {
            this.ruleInstances = new ArrayList<>();
        }
        this.ruleInstances.add(ruleInstancesItem);
        return this;
    }

    public ShowProjectStrategyResponse withRuleInstances(Consumer<List<RuleInstance>> ruleInstancesSetter) {
        if (this.ruleInstances == null) {
            this.ruleInstances = new ArrayList<>();
        }
        ruleInstancesSetter.accept(this.ruleInstances);
        return this;
    }

    /**
     * **参数解释**： 规则实例集合。 **取值范围**： 不涉及。 
     * @return ruleInstances
     */
    public List<RuleInstance> getRuleInstances() {
        return ruleInstances;
    }

    public void setRuleInstances(List<RuleInstance> ruleInstances) {
        this.ruleInstances = ruleInstances;
    }

    public ShowProjectStrategyResponse withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释**： 规则实例生效级别。 **取值范围**： 不涉及。 
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ShowProjectStrategyResponse withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    /**
     * **参数解释**： 规则实例是否系统级。 **取值范围**： - true：规则实例是系统级。 - false：规则实例不是系统级。 
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public ShowProjectStrategyResponse withIsLegacy(Boolean isLegacy) {
        this.isLegacy = isLegacy;
        return this;
    }

    /**
     * **参数解释**： 规则实例是1.0的数据。 **取值范围**： - true：规则实例是1.0的数据。 - false：规则实例是1.0的数据。 
     * @return isLegacy
     */
    public Boolean getIsLegacy() {
        return isLegacy;
    }

    public void setIsLegacy(Boolean isLegacy) {
        this.isLegacy = isLegacy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectStrategyResponse that = (ShowProjectStrategyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updater, that.updater) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.isValid, that.isValid) && Objects.equals(this.ruleInstances, that.ruleInstances)
            && Objects.equals(this.level, that.level) && Objects.equals(this.isPublic, that.isPublic)
            && Objects.equals(this.isLegacy, that.isLegacy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            type,
            version,
            creator,
            createTime,
            updater,
            updateTime,
            isValid,
            ruleInstances,
            level,
            isPublic,
            isLegacy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectStrategyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
        sb.append("    ruleInstances: ").append(toIndentedString(ruleInstances)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
        sb.append("    isLegacy: ").append(toIndentedString(isLegacy)).append("\n");
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
