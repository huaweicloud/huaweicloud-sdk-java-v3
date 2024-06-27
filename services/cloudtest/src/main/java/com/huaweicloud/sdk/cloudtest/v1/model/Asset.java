package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Asset
 */
public class Asset {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_num")

    private String creatorNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_name")

    private String updateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_num")

    private String updateNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public Asset withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Asset withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Asset withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get projectId
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Asset withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get createTime
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public Asset withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * Get creatorName
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Asset withCreatorNum(String creatorNum) {
        this.creatorNum = creatorNum;
        return this;
    }

    /**
     * Get creatorNum
     * @return creatorNum
     */
    public String getCreatorNum() {
        return creatorNum;
    }

    public void setCreatorNum(String creatorNum) {
        this.creatorNum = creatorNum;
    }

    public Asset withUpdateName(String updateName) {
        this.updateName = updateName;
        return this;
    }

    /**
     * Get updateName
     * @return updateName
     */
    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public Asset withUpdateNum(String updateNum) {
        this.updateNum = updateNum;
        return this;
    }

    /**
     * Get updateNum
     * @return updateNum
     */
    public String getUpdateNum() {
        return updateNum;
    }

    public void setUpdateNum(String updateNum) {
        this.updateNum = updateNum;
    }

    public Asset withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get updateTime
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Asset that = (Asset) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.creatorNum, that.creatorNum)
            && Objects.equals(this.updateName, that.updateName) && Objects.equals(this.updateNum, that.updateNum)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, projectId, createTime, creatorName, creatorNum, updateName, updateNum, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Asset {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    creatorNum: ").append(toIndentedString(creatorNum)).append("\n");
        sb.append("    updateName: ").append(toIndentedString(updateName)).append("\n");
        sb.append("    updateNum: ").append(toIndentedString(updateNum)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
