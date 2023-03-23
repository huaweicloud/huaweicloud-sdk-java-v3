package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建模板信息。
 */
public class FlinkTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Long templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    public FlinkTemplate withTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板ID
     * @return templateId
     */
    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public FlinkTemplate withName(String name) {
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

    public FlinkTemplate withDesc(String desc) {
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

    public FlinkTemplate withCreateTime(Long createTime) {
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

    public FlinkTemplate withJobType(String jobType) {
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
        FlinkTemplate flinkTemplate = (FlinkTemplate) o;
        return Objects.equals(this.templateId, flinkTemplate.templateId)
            && Objects.equals(this.name, flinkTemplate.name) && Objects.equals(this.desc, flinkTemplate.desc)
            && Objects.equals(this.createTime, flinkTemplate.createTime)
            && Objects.equals(this.jobType, flinkTemplate.jobType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, name, desc, createTime, jobType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkTemplate {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
