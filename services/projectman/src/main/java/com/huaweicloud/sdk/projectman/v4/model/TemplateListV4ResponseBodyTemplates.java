package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TemplateListV4ResponseBodyTemplates
 */
public class TemplateListV4ResponseBodyTemplates {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private Integer trackerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_field_config")

    private String issueFieldConfig;

    public TemplateListV4ResponseBodyTemplates withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 模板id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TemplateListV4ResponseBodyTemplates withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public TemplateListV4ResponseBodyTemplates withTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * 工作项类型id
     * @return trackerId
     */
    public Integer getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }

    public TemplateListV4ResponseBodyTemplates withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 工作项详情模板描述内容
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateListV4ResponseBodyTemplates withIssueFieldConfig(String issueFieldConfig) {
        this.issueFieldConfig = issueFieldConfig;
        return this;
    }

    /**
     * 模板配置
     * @return issueFieldConfig
     */
    public String getIssueFieldConfig() {
        return issueFieldConfig;
    }

    public void setIssueFieldConfig(String issueFieldConfig) {
        this.issueFieldConfig = issueFieldConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateListV4ResponseBodyTemplates templateListV4ResponseBodyTemplates =
            (TemplateListV4ResponseBodyTemplates) o;
        return Objects.equals(this.id, templateListV4ResponseBodyTemplates.id)
            && Objects.equals(this.projectId, templateListV4ResponseBodyTemplates.projectId)
            && Objects.equals(this.trackerId, templateListV4ResponseBodyTemplates.trackerId)
            && Objects.equals(this.description, templateListV4ResponseBodyTemplates.description)
            && Objects.equals(this.issueFieldConfig, templateListV4ResponseBodyTemplates.issueFieldConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, trackerId, description, issueFieldConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateListV4ResponseBodyTemplates {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    issueFieldConfig: ").append(toIndentedString(issueFieldConfig)).append("\n");
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
