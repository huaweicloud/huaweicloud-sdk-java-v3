package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作空间信息
 */
public class WorkspaceDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bad_record_location_name")

    private String badRecordLocationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_log_location_name")

    private String jobLogLocationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public WorkspaceDto withBadRecordLocationName(String badRecordLocationName) {
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

    public WorkspaceDto withDescription(String description) {
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

    public WorkspaceDto withJobLogLocationName(String jobLogLocationName) {
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

    public WorkspaceDto withName(String name) {
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

    public WorkspaceDto withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 企业项目ID
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public WorkspaceDto withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 工作空间模式。0：简易模式；1：企业模式
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public WorkspaceDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 工作空间状态。0：正常；5：冻结
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkspaceDto that = (WorkspaceDto) obj;
        return Objects.equals(this.badRecordLocationName, that.badRecordLocationName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.jobLogLocationName, that.jobLogLocationName) && Objects.equals(this.name, that.name)
            && Objects.equals(this.epsId, that.epsId) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(badRecordLocationName, description, jobLogLocationName, name, epsId, mode, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkspaceDto {\n");
        sb.append("    badRecordLocationName: ").append(toIndentedString(badRecordLocationName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    jobLogLocationName: ").append(toIndentedString(jobLogLocationName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
