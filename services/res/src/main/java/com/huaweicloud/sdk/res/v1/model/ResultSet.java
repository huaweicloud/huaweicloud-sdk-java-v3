package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ResultSet
 */
public class ResultSet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability")

    @JacksonXmlProperty(localName = "availability")

    private Integer availability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    @JacksonXmlProperty(localName = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    @JacksonXmlProperty(localName = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rec_id")

    @JacksonXmlProperty(localName = "rec_id")

    private String recId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rec_type")

    @JacksonXmlProperty(localName = "rec_type")

    private String recType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_id")

    @JacksonXmlProperty(localName = "scene_id")

    private String sceneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    @JacksonXmlProperty(localName = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    @JacksonXmlProperty(localName = "workspace_id")

    private String workspaceId;

    public ResultSet withAvailability(Integer availability) {
        this.availability = availability;
        return this;
    }

    /**
     * 可用性
     * @return availability
     */
    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    public ResultSet withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 类别
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ResultSet withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业编号
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ResultSet withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public ResultSet withRecId(String recId) {
        this.recId = recId;
        return this;
    }

    /**
     * rec编号
     * @return recId
     */
    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId;
    }

    public ResultSet withRecType(String recType) {
        this.recType = recType;
        return this;
    }

    /**
     * rec类型
     * @return recType
     */
    public String getRecType() {
        return recType;
    }

    public void setRecType(String recType) {
        this.recType = recType;
    }

    public ResultSet withSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }

    /**
     * 场景编号
     * @return sceneId
     */
    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public ResultSet withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ResultSet withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间编号
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResultSet resultSet = (ResultSet) o;
        return Objects.equals(this.availability, resultSet.availability)
            && Objects.equals(this.category, resultSet.category) && Objects.equals(this.jobId, resultSet.jobId)
            && Objects.equals(this.jobType, resultSet.jobType) && Objects.equals(this.recId, resultSet.recId)
            && Objects.equals(this.recType, resultSet.recType) && Objects.equals(this.sceneId, resultSet.sceneId)
            && Objects.equals(this.tableName, resultSet.tableName)
            && Objects.equals(this.workspaceId, resultSet.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availability, category, jobId, jobType, recId, recType, sceneId, tableName, workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultSet {\n");
        sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    recId: ").append(toIndentedString(recId)).append("\n");
        sb.append("    recType: ").append(toIndentedString(recType)).append("\n");
        sb.append("    sceneId: ").append(toIndentedString(sceneId)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
