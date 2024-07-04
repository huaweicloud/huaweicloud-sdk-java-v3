package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VideoGroupInfoDto
 */
public class VideoGroupInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_group_id")

    private String videoGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_group_name")

    private String videoGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_type")

    private String accessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_at")

    private Long modifyAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_video_source")

    private Integer numVideoSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_status")

    private GroupStatusDto groupStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_batch_task")

    private Integer numBatchTask;

    public VideoGroupInfoDto withVideoGroupId(String videoGroupId) {
        this.videoGroupId = videoGroupId;
        return this;
    }

    /**
     * 视频源所在分组id
     * @return videoGroupId
     */
    public String getVideoGroupId() {
        return videoGroupId;
    }

    public void setVideoGroupId(String videoGroupId) {
        this.videoGroupId = videoGroupId;
    }

    public VideoGroupInfoDto withVideoGroupName(String videoGroupName) {
        this.videoGroupName = videoGroupName;
        return this;
    }

    /**
     * 视频源所在分组名称
     * @return videoGroupName
     */
    public String getVideoGroupName() {
        return videoGroupName;
    }

    public void setVideoGroupName(String videoGroupName) {
        this.videoGroupName = videoGroupName;
    }

    public VideoGroupInfoDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 视频源所在分组描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VideoGroupInfoDto withAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }

    /**
     * 接入方式（cloud、edge）
     * @return accessType
     */
    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public VideoGroupInfoDto withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public VideoGroupInfoDto withModifyAt(Long modifyAt) {
        this.modifyAt = modifyAt;
        return this;
    }

    /**
     * 修改时间
     * @return modifyAt
     */
    public Long getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(Long modifyAt) {
        this.modifyAt = modifyAt;
    }

    public VideoGroupInfoDto withNumVideoSource(Integer numVideoSource) {
        this.numVideoSource = numVideoSource;
        return this;
    }

    /**
     * 视频源数量
     * @return numVideoSource
     */
    public Integer getNumVideoSource() {
        return numVideoSource;
    }

    public void setNumVideoSource(Integer numVideoSource) {
        this.numVideoSource = numVideoSource;
    }

    public VideoGroupInfoDto withGroupStatus(GroupStatusDto groupStatus) {
        this.groupStatus = groupStatus;
        return this;
    }

    public VideoGroupInfoDto withGroupStatus(Consumer<GroupStatusDto> groupStatusSetter) {
        if (this.groupStatus == null) {
            this.groupStatus = new GroupStatusDto();
            groupStatusSetter.accept(this.groupStatus);
        }

        return this;
    }

    /**
     * Get groupStatus
     * @return groupStatus
     */
    public GroupStatusDto getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(GroupStatusDto groupStatus) {
        this.groupStatus = groupStatus;
    }

    public VideoGroupInfoDto withNumBatchTask(Integer numBatchTask) {
        this.numBatchTask = numBatchTask;
        return this;
    }

    /**
     * 已配置批量作业数量
     * @return numBatchTask
     */
    public Integer getNumBatchTask() {
        return numBatchTask;
    }

    public void setNumBatchTask(Integer numBatchTask) {
        this.numBatchTask = numBatchTask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoGroupInfoDto that = (VideoGroupInfoDto) obj;
        return Objects.equals(this.videoGroupId, that.videoGroupId)
            && Objects.equals(this.videoGroupName, that.videoGroupName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.accessType, that.accessType)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.modifyAt, that.modifyAt)
            && Objects.equals(this.numVideoSource, that.numVideoSource)
            && Objects.equals(this.groupStatus, that.groupStatus)
            && Objects.equals(this.numBatchTask, that.numBatchTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoGroupId,
            videoGroupName,
            description,
            accessType,
            createAt,
            modifyAt,
            numVideoSource,
            groupStatus,
            numBatchTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoGroupInfoDto {\n");
        sb.append("    videoGroupId: ").append(toIndentedString(videoGroupId)).append("\n");
        sb.append("    videoGroupName: ").append(toIndentedString(videoGroupName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    modifyAt: ").append(toIndentedString(modifyAt)).append("\n");
        sb.append("    numVideoSource: ").append(toIndentedString(numVideoSource)).append("\n");
        sb.append("    groupStatus: ").append(toIndentedString(groupStatus)).append("\n");
        sb.append("    numBatchTask: ").append(toIndentedString(numBatchTask)).append("\n");
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
