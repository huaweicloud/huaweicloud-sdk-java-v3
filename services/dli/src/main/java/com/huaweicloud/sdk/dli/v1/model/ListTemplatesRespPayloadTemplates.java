package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class ListTemplatesRespPayloadTemplates {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    @JacksonXmlProperty(localName = "template_id")

    private Integer templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    @JacksonXmlProperty(localName = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_body")

    @JacksonXmlProperty(localName = "sql_body")

    private String sqlBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    @JacksonXmlProperty(localName = "job_type")

    private String jobType;

    public ListTemplatesRespPayloadTemplates withTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板ID。
     * @return templateId
     */
    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public ListTemplatesRespPayloadTemplates withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListTemplatesRespPayloadTemplates withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 模板描述。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ListTemplatesRespPayloadTemplates withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 模板创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListTemplatesRespPayloadTemplates withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 模板更新时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ListTemplatesRespPayloadTemplates withSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
        return this;
    }

    /**
     * Stream SQL语句, 至少包含source, query, sink三个部分。
     * @return sqlBody
     */
    public String getSqlBody() {
        return sqlBody;
    }

    public void setSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
    }

    public ListTemplatesRespPayloadTemplates withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业模板类型。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTemplatesRespPayloadTemplates listTemplatesRespPayloadTemplates = (ListTemplatesRespPayloadTemplates) o;
        return Objects.equals(this.templateId, listTemplatesRespPayloadTemplates.templateId)
            && Objects.equals(this.name, listTemplatesRespPayloadTemplates.name)
            && Objects.equals(this.desc, listTemplatesRespPayloadTemplates.desc)
            && Objects.equals(this.createTime, listTemplatesRespPayloadTemplates.createTime)
            && Objects.equals(this.updateTime, listTemplatesRespPayloadTemplates.updateTime)
            && Objects.equals(this.sqlBody, listTemplatesRespPayloadTemplates.sqlBody)
            && Objects.equals(this.jobType, listTemplatesRespPayloadTemplates.jobType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, name, desc, createTime, updateTime, sqlBody, jobType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplatesRespPayloadTemplates {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    sqlBody: ").append(toIndentedString(sqlBody)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
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
