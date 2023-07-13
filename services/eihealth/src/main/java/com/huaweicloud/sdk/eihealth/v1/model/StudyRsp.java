package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * study详情返回体
 */
public class StudyRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_name")

    private String eihealthProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_job")

    private StudyJobRsp latestJob;

    public StudyRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * study名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudyRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * study id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StudyRsp withEihealthProjectName(String eihealthProjectName) {
        this.eihealthProjectName = eihealthProjectName;
        return this;
    }

    /**
     * 医疗项目名称
     * @return eihealthProjectName
     */
    public String getEihealthProjectName() {
        return eihealthProjectName;
    }

    public void setEihealthProjectName(String eihealthProjectName) {
        this.eihealthProjectName = eihealthProjectName;
    }

    public StudyRsp withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 医疗项目id
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public StudyRsp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * study描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StudyRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * study创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public StudyRsp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * study更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public StudyRsp withLatestJob(StudyJobRsp latestJob) {
        this.latestJob = latestJob;
        return this;
    }

    public StudyRsp withLatestJob(Consumer<StudyJobRsp> latestJobSetter) {
        if (this.latestJob == null) {
            this.latestJob = new StudyJobRsp();
            latestJobSetter.accept(this.latestJob);
        }

        return this;
    }

    /**
     * Get latestJob
     * @return latestJob
     */
    public StudyJobRsp getLatestJob() {
        return latestJob;
    }

    public void setLatestJob(StudyJobRsp latestJob) {
        this.latestJob = latestJob;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StudyRsp that = (StudyRsp) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.eihealthProjectName, that.eihealthProjectName)
            && Objects.equals(this.eihealthProjectId, that.eihealthProjectId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.latestJob, that.latestJob);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, id, eihealthProjectName, eihealthProjectId, description, createTime, updateTime, latestJob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StudyRsp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    eihealthProjectName: ").append(toIndentedString(eihealthProjectName)).append("\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    latestJob: ").append(toIndentedString(latestJob)).append("\n");
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
