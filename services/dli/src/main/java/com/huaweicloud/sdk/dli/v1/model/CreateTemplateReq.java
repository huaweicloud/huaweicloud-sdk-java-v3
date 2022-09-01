package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 新建模板
 */
public class CreateTemplateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    @JacksonXmlProperty(localName = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_body")

    @JacksonXmlProperty(localName = "sql_body")

    private String sqlBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    @JacksonXmlProperty(localName = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<JobsTags> tags = null;

    public CreateTemplateReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模块名称，长度限制：0-57个字符 。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateTemplateReq withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 模板描述，长度限制：0-2048个字符。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CreateTemplateReq withSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
        return this;
    }

    /**
     * Stream SQL语句，至少包含source，query，sink三个部分, 长度限制：0-2048个字符。
     * @return sqlBody
     */
    public String getSqlBody() {
        return sqlBody;
    }

    public void setSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
    }

    public CreateTemplateReq withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Flink作业模板类型。默认值为\"flink_sql_job\"，若填写则只能为\"flink_sql_job\"或者\"flink_opensource_sql_job\"。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public CreateTemplateReq withTags(List<JobsTags> tags) {
        this.tags = tags;
        return this;
    }

    public CreateTemplateReq addTagsItem(JobsTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateTemplateReq withTags(Consumer<List<JobsTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * Flink作业模板的标签。具体请参考表tags。
     * @return tags
     */
    public List<JobsTags> getTags() {
        return tags;
    }

    public void setTags(List<JobsTags> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTemplateReq createTemplateReq = (CreateTemplateReq) o;
        return Objects.equals(this.name, createTemplateReq.name) && Objects.equals(this.desc, createTemplateReq.desc)
            && Objects.equals(this.sqlBody, createTemplateReq.sqlBody)
            && Objects.equals(this.jobType, createTemplateReq.jobType)
            && Objects.equals(this.tags, createTemplateReq.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, desc, sqlBody, jobType, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemplateReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    sqlBody: ").append(toIndentedString(sqlBody)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
