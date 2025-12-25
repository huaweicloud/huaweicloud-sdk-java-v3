package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Dictionary
 */
public class Dictionary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_time")

    private String publishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_field")

    private Object extensionField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    public Dictionary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Dictionary withVersion(String version) {
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

    public Dictionary withDictId(String dictId) {
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

    public Dictionary withDictKey(String dictKey) {
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

    public Dictionary withDictCode(String dictCode) {
        this.dictCode = dictCode;
        return this;
    }

    /**
     * 字典code
     * @return dictCode
     */
    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public Dictionary withDictVal(String dictVal) {
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

    public Dictionary withDictPkey(String dictPkey) {
        this.dictPkey = dictPkey;
        return this;
    }

    /**
     * 字典关联的父key
     * @return dictPkey
     */
    public String getDictPkey() {
        return dictPkey;
    }

    public void setDictPkey(String dictPkey) {
        this.dictPkey = dictPkey;
    }

    public Dictionary withDictPcode(String dictPcode) {
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

    public Dictionary withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Dictionary withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Dictionary withPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * 发布时间
     * @return publishTime
     */
    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public Dictionary withScope(String scope) {
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

    public Dictionary withDescription(String description) {
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

    public Dictionary withExtensionField(Object extensionField) {
        this.extensionField = extensionField;
        return this;
    }

    /**
     * 额外字段
     * @return extensionField
     */
    public Object getExtensionField() {
        return extensionField;
    }

    public void setExtensionField(Object extensionField) {
        this.extensionField = extensionField;
    }

    public Dictionary withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目ID，用于明确项目归属，配置后可通过该ID查询项目下资产，可以通过调用API获取，也可以从控制台获取。[获取项目ID](secmaster_03_0014.xml) **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Dictionary withLanguage(String language) {
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
        Dictionary that = (Dictionary) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.version, that.version)
            && Objects.equals(this.dictId, that.dictId) && Objects.equals(this.dictKey, that.dictKey)
            && Objects.equals(this.dictCode, that.dictCode) && Objects.equals(this.dictVal, that.dictVal)
            && Objects.equals(this.dictPkey, that.dictPkey) && Objects.equals(this.dictPcode, that.dictPcode)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.publishTime, that.publishTime) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.extensionField, that.extensionField)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            version,
            dictId,
            dictKey,
            dictCode,
            dictVal,
            dictPkey,
            dictPcode,
            createTime,
            updateTime,
            publishTime,
            scope,
            description,
            extensionField,
            projectId,
            language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dictionary {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    dictId: ").append(toIndentedString(dictId)).append("\n");
        sb.append("    dictKey: ").append(toIndentedString(dictKey)).append("\n");
        sb.append("    dictCode: ").append(toIndentedString(dictCode)).append("\n");
        sb.append("    dictVal: ").append(toIndentedString(dictVal)).append("\n");
        sb.append("    dictPkey: ").append(toIndentedString(dictPkey)).append("\n");
        sb.append("    dictPcode: ").append(toIndentedString(dictPcode)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    extensionField: ").append(toIndentedString(extensionField)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
