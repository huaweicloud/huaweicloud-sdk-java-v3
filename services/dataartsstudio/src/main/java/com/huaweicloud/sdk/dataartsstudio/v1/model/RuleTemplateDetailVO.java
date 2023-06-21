package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RuleTemplateDetailVO
 */
public class RuleTemplateDetailVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private Long categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private String dimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_template")

    private Boolean systemTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_info")

    private String sqlInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_table_template")

    private String abnormalTableTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_description")

    private String resultDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    public RuleTemplateDetailVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RuleTemplateDetailVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RuleTemplateDetailVO withCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 目录ID
     * @return categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public RuleTemplateDetailVO withDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * Completeness:完整性,Uniqueness:唯一性,Timeliness:及时性,Validity:有效性,Accuracy:准确性,Consistency:一致性
     * @return dimension
     */
    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public RuleTemplateDetailVO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 规则类型，Field:字段级规则,Table:表级规则,Database:库级规则,Cross-field:跨字段级规则,Customize:自定义规则
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RuleTemplateDetailVO withSystemTemplate(Boolean systemTemplate) {
        this.systemTemplate = systemTemplate;
        return this;
    }

    /**
     * 是否为系统模板
     * @return systemTemplate
     */
    public Boolean getSystemTemplate() {
        return systemTemplate;
    }

    public void setSystemTemplate(Boolean systemTemplate) {
        this.systemTemplate = systemTemplate;
    }

    public RuleTemplateDetailVO withSqlInfo(String sqlInfo) {
        this.sqlInfo = sqlInfo;
        return this;
    }

    /**
     * 定义关系
     * @return sqlInfo
     */
    public String getSqlInfo() {
        return sqlInfo;
    }

    public void setSqlInfo(String sqlInfo) {
        this.sqlInfo = sqlInfo;
    }

    public RuleTemplateDetailVO withAbnormalTableTemplate(String abnormalTableTemplate) {
        this.abnormalTableTemplate = abnormalTableTemplate;
        return this;
    }

    /**
     * 异常表模板
     * @return abnormalTableTemplate
     */
    public String getAbnormalTableTemplate() {
        return abnormalTableTemplate;
    }

    public void setAbnormalTableTemplate(String abnormalTableTemplate) {
        this.abnormalTableTemplate = abnormalTableTemplate;
    }

    public RuleTemplateDetailVO withResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
        return this;
    }

    /**
     * 结果说明
     * @return resultDescription
     */
    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    public RuleTemplateDetailVO withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间,13位时间戳(精确到毫秒)
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public RuleTemplateDetailVO withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建者,System代表系统自带
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleTemplateDetailVO ruleTemplateDetailVO = (RuleTemplateDetailVO) o;
        return Objects.equals(this.id, ruleTemplateDetailVO.id) && Objects.equals(this.name, ruleTemplateDetailVO.name)
            && Objects.equals(this.categoryId, ruleTemplateDetailVO.categoryId)
            && Objects.equals(this.dimension, ruleTemplateDetailVO.dimension)
            && Objects.equals(this.type, ruleTemplateDetailVO.type)
            && Objects.equals(this.systemTemplate, ruleTemplateDetailVO.systemTemplate)
            && Objects.equals(this.sqlInfo, ruleTemplateDetailVO.sqlInfo)
            && Objects.equals(this.abnormalTableTemplate, ruleTemplateDetailVO.abnormalTableTemplate)
            && Objects.equals(this.resultDescription, ruleTemplateDetailVO.resultDescription)
            && Objects.equals(this.createTime, ruleTemplateDetailVO.createTime)
            && Objects.equals(this.creator, ruleTemplateDetailVO.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            categoryId,
            dimension,
            type,
            systemTemplate,
            sqlInfo,
            abnormalTableTemplate,
            resultDescription,
            createTime,
            creator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleTemplateDetailVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    systemTemplate: ").append(toIndentedString(systemTemplate)).append("\n");
        sb.append("    sqlInfo: ").append(toIndentedString(sqlInfo)).append("\n");
        sb.append("    abnormalTableTemplate: ").append(toIndentedString(abnormalTableTemplate)).append("\n");
        sb.append("    resultDescription: ").append(toIndentedString(resultDescription)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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
