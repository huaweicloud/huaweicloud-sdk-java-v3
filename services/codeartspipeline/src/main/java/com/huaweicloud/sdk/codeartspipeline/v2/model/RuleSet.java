package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RuleSet
 */
public class RuleSet {

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
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_time")

    private Long operateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_valid")

    private Boolean isValid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_public")

    private Boolean isPublic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_legacy")

    private Boolean isLegacy;

    public RuleSet withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 规则模板实例ID。 **取值范围**： 不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RuleSet withName(String name) {
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

    public RuleSet withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 规则实例类型。 **取值范围**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RuleSet withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 规则实例版本。 **取值范围**： 不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public RuleSet withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * **参数解释**： 规则实例最近操作人。 **取值范围**： 不涉及。 
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public RuleSet withOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    /**
     * **参数解释**： 规则实例最近操作时间。 **取值范围**： 不涉及。 
     * @return operateTime
     */
    public Long getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
    }

    public RuleSet withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * **参数解释**： 规则实例是否生效。 **取值范围**： - true：规则生效。 - false：规则不生效。 
     * @return isValid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public RuleSet withLevel(String level) {
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

    public RuleSet withIsPublic(Boolean isPublic) {
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

    public RuleSet withIsLegacy(Boolean isLegacy) {
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
        RuleSet that = (RuleSet) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.operateTime, that.operateTime)
            && Objects.equals(this.isValid, that.isValid) && Objects.equals(this.level, that.level)
            && Objects.equals(this.isPublic, that.isPublic) && Objects.equals(this.isLegacy, that.isLegacy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, version, operator, operateTime, isValid, level, isPublic, isLegacy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleSet {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
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
