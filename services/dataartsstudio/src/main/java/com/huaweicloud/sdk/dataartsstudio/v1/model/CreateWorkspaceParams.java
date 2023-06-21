package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IAM用户组信息
 */
public class CreateWorkspaceParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bad_record_location_name")

    private String badRecordLocationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_log_location_name")

    private String jobLogLocationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public CreateWorkspaceParams withBadRecordLocationName(String badRecordLocationName) {
        this.badRecordLocationName = badRecordLocationName;
        return this;
    }

    /**
     * DLI脏数据OBS路径
     * @return badRecordLocationName
     */
    public String getBadRecordLocationName() {
        return badRecordLocationName;
    }

    public void setBadRecordLocationName(String badRecordLocationName) {
        this.badRecordLocationName = badRecordLocationName;
    }

    public CreateWorkspaceParams withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 工作空间描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateWorkspaceParams withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 企业项目id，如果当前为公有云，且用户开启企业项目，则必选
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public CreateWorkspaceParams withJobLogLocationName(String jobLogLocationName) {
        this.jobLogLocationName = jobLogLocationName;
        return this;
    }

    /**
     * 作业日志OBS路径
     * @return jobLogLocationName
     */
    public String getJobLogLocationName() {
        return jobLogLocationName;
    }

    public void setJobLogLocationName(String jobLogLocationName) {
        this.jobLogLocationName = jobLogLocationName;
    }

    public CreateWorkspaceParams withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工作空间名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWorkspaceParams createWorkspaceParams = (CreateWorkspaceParams) o;
        return Objects.equals(this.badRecordLocationName, createWorkspaceParams.badRecordLocationName)
            && Objects.equals(this.description, createWorkspaceParams.description)
            && Objects.equals(this.epsId, createWorkspaceParams.epsId)
            && Objects.equals(this.jobLogLocationName, createWorkspaceParams.jobLogLocationName)
            && Objects.equals(this.name, createWorkspaceParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(badRecordLocationName, description, epsId, jobLogLocationName, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkspaceParams {\n");
        sb.append("    badRecordLocationName: ").append(toIndentedString(badRecordLocationName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    jobLogLocationName: ").append(toIndentedString(jobLogLocationName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
