package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 开源治理策略列表详情
 */
public class SimpleOpenSourceRuleSetVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_valid")

    private Boolean isValid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_public")

    private Boolean isPublic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_legacy")

    private Boolean isLegacy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_time")

    private Long operateTime;

    public SimpleOpenSourceRuleSetVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 开源治理策略ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SimpleOpenSourceRuleSetVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 开源治理策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleOpenSourceRuleSetVO withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 开源治理策略级别（tenant-租户级，project-项目级）
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public SimpleOpenSourceRuleSetVO withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * 是否可用
     * @return isValid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public SimpleOpenSourceRuleSetVO withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SimpleOpenSourceRuleSetVO withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作人
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public SimpleOpenSourceRuleSetVO withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    /**
     * 是否系统策略
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public SimpleOpenSourceRuleSetVO withIsLegacy(Boolean isLegacy) {
        this.isLegacy = isLegacy;
        return this;
    }

    /**
     * 是否老版
     * @return isLegacy
     */
    public Boolean getIsLegacy() {
        return isLegacy;
    }

    public void setIsLegacy(Boolean isLegacy) {
        this.isLegacy = isLegacy;
    }

    public SimpleOpenSourceRuleSetVO withOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    /**
     * 操作时间
     * @return operateTime
     */
    public Long getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleOpenSourceRuleSetVO that = (SimpleOpenSourceRuleSetVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.level, that.level) && Objects.equals(this.isValid, that.isValid)
            && Objects.equals(this.version, that.version) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.isPublic, that.isPublic) && Objects.equals(this.isLegacy, that.isLegacy)
            && Objects.equals(this.operateTime, that.operateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, isValid, version, operator, isPublic, isLegacy, operateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleOpenSourceRuleSetVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
        sb.append("    isLegacy: ").append(toIndentedString(isLegacy)).append("\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
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
