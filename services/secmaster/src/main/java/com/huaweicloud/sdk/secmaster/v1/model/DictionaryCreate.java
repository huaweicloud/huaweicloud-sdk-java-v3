package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DictionaryCreate
 */
public class DictionaryCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_id")

    private String dictId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_key")

    private String dictKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_code")

    private String dictCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_val")

    private String dictVal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_pkey")

    private String dictPkey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_pcode")

    private String dictPcode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_field")

    private Object extendField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    public DictionaryCreate withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DictionaryCreate withDictId(String dictId) {
        this.dictId = dictId;
        return this;
    }

    /**
     * 字典id
     * @return dictId
     */
    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public DictionaryCreate withDictKey(String dictKey) {
        this.dictKey = dictKey;
        return this;
    }

    /**
     * 字典key
     * @return dictKey
     */
    public String getDictKey() {
        return dictKey;
    }

    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    public DictionaryCreate withDictCode(String dictCode) {
        this.dictCode = dictCode;
        return this;
    }

    /**
     * 字典code码
     * @return dictCode
     */
    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public DictionaryCreate withDictVal(String dictVal) {
        this.dictVal = dictVal;
        return this;
    }

    /**
     * 字典值
     * @return dictVal
     */
    public String getDictVal() {
        return dictVal;
    }

    public void setDictVal(String dictVal) {
        this.dictVal = dictVal;
    }

    public DictionaryCreate withDictPkey(String dictPkey) {
        this.dictPkey = dictPkey;
        return this;
    }

    /**
     * 字典key
     * @return dictPkey
     */
    public String getDictPkey() {
        return dictPkey;
    }

    public void setDictPkey(String dictPkey) {
        this.dictPkey = dictPkey;
    }

    public DictionaryCreate withDictPcode(String dictPcode) {
        this.dictPcode = dictPcode;
        return this;
    }

    /**
     * 字典关联的父code
     * @return dictPcode
     */
    public String getDictPcode() {
        return dictPcode;
    }

    public void setDictPcode(String dictPcode) {
        this.dictPcode = dictPcode;
    }

    public DictionaryCreate withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 字典所属领域
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public DictionaryCreate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 字典描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DictionaryCreate withExtendField(Object extendField) {
        this.extendField = extendField;
        return this;
    }

    /**
     * 额外字段
     * @return extendField
     */
    public Object getExtendField() {
        return extendField;
    }

    public void setExtendField(Object extendField) {
        this.extendField = extendField;
    }

    public DictionaryCreate withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 用户当前语言环境
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DictionaryCreate that = (DictionaryCreate) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.dictId, that.dictId)
            && Objects.equals(this.dictKey, that.dictKey) && Objects.equals(this.dictCode, that.dictCode)
            && Objects.equals(this.dictVal, that.dictVal) && Objects.equals(this.dictPkey, that.dictPkey)
            && Objects.equals(this.dictPcode, that.dictPcode) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.description, that.description) && Objects.equals(this.extendField, that.extendField)
            && Objects.equals(this.language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            dictId,
            dictKey,
            dictCode,
            dictVal,
            dictPkey,
            dictPcode,
            scope,
            description,
            extendField,
            language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DictionaryCreate {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    dictId: ").append(toIndentedString(dictId)).append("\n");
        sb.append("    dictKey: ").append(toIndentedString(dictKey)).append("\n");
        sb.append("    dictCode: ").append(toIndentedString(dictCode)).append("\n");
        sb.append("    dictVal: ").append(toIndentedString(dictVal)).append("\n");
        sb.append("    dictPkey: ").append(toIndentedString(dictPkey)).append("\n");
        sb.append("    dictPcode: ").append(toIndentedString(dictPcode)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    extendField: ").append(toIndentedString(extendField)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
