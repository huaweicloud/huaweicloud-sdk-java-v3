package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueryDiagnosisResultResultList
 */
public class QueryDiagnosisResultResultList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multi_language")

    private Boolean isMultiLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_name")

    private String moduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    public QueryDiagnosisResultResultList withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 内容key。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public QueryDiagnosisResultResultList withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 结果值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public QueryDiagnosisResultResultList withIsMultiLanguage(Boolean isMultiLanguage) {
        this.isMultiLanguage = isMultiLanguage;
        return this;
    }

    /**
     * 结果值是否需要国际化。
     * @return isMultiLanguage
     */
    public Boolean getIsMultiLanguage() {
        return isMultiLanguage;
    }

    public void setIsMultiLanguage(Boolean isMultiLanguage) {
        this.isMultiLanguage = isMultiLanguage;
    }

    public QueryDiagnosisResultResultList withModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * 模块名称。
     * @return moduleName
     */
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public QueryDiagnosisResultResultList withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 等级。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryDiagnosisResultResultList that = (QueryDiagnosisResultResultList) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value)
            && Objects.equals(this.isMultiLanguage, that.isMultiLanguage)
            && Objects.equals(this.moduleName, that.moduleName) && Objects.equals(this.level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, isMultiLanguage, moduleName, level);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDiagnosisResultResultList {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    isMultiLanguage: ").append(toIndentedString(isMultiLanguage)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
