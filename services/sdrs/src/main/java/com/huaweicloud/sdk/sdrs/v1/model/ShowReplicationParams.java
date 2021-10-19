package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 查询复制对数据结构 */
public class ShowReplicationParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_ids")

    private String volumeIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment")

    private List<ReplicationAttachment> attachment = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_model")

    private String replicationModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_detail")

    private String failureDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_metadata")

    private ReplicationRecordMetadata recordMetadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault_level")

    private String faultLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority_station")

    private String priorityStation;

    /** 数据同步状态。active：表示数据已同步完成。inactive：表示数据未同步。copying：表示数据正在同步。active-stopped：表示数据已停止同步。 */
    public static final class ReplicationStatusEnum {

        /** Enum ACTIVE for value: "active" */
        public static final ReplicationStatusEnum ACTIVE = new ReplicationStatusEnum("active");

        /** Enum INACTIVE for value: "inactive" */
        public static final ReplicationStatusEnum INACTIVE = new ReplicationStatusEnum("inactive");

        /** Enum COPYING for value: "copying" */
        public static final ReplicationStatusEnum COPYING = new ReplicationStatusEnum("copying");

        /** Enum ACTIVE_STOPPED for value: "active-stopped" */
        public static final ReplicationStatusEnum ACTIVE_STOPPED = new ReplicationStatusEnum("active-stopped");

        private static final Map<String, ReplicationStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplicationStatusEnum> createStaticFields() {
            Map<String, ReplicationStatusEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("inactive", INACTIVE);
            map.put("copying", COPYING);
            map.put("active-stopped", ACTIVE_STOPPED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplicationStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReplicationStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ReplicationStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ReplicationStatusEnum(value);
            }
            return result;
        }

        public static ReplicationStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ReplicationStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplicationStatusEnum) {
                return this.value.equals(((ReplicationStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_status")

    private ReplicationStatusEnum replicationStatus;

    public ShowReplicationParams withId(String id) {
        this.id = id;
        return this;
    }

    /** 复制对的ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowReplicationParams withName(String name) {
        this.name = name;
        return this;
    }

    /** 复制对的名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowReplicationParams withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 复制对的描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowReplicationParams withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 复制对的状态。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowReplicationParams withVolumeIds(String volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    /** 复制对使用的云硬盘ID。
     * 
     * @return volumeIds */
    public String getVolumeIds() {
        return volumeIds;
    }

    public void setVolumeIds(String volumeIds) {
        this.volumeIds = volumeIds;
    }

    public ShowReplicationParams withAttachment(List<ReplicationAttachment> attachment) {
        this.attachment = attachment;
        return this;
    }

    public ShowReplicationParams addAttachmentItem(ReplicationAttachment attachmentItem) {
        if (this.attachment == null) {
            this.attachment = new ArrayList<>();
        }
        this.attachment.add(attachmentItem);
        return this;
    }

    public ShowReplicationParams withAttachment(Consumer<List<ReplicationAttachment>> attachmentSetter) {
        if (this.attachment == null) {
            this.attachment = new ArrayList<>();
        }
        attachmentSetter.accept(this.attachment);
        return this;
    }

    /** 挂载点。
     * 
     * @return attachment */
    public List<ReplicationAttachment> getAttachment() {
        return attachment;
    }

    public void setAttachment(List<ReplicationAttachment> attachment) {
        this.attachment = attachment;
    }

    public ShowReplicationParams withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 创建时间。默认格式为：\"yyyy-MM-ddTHH:mm:ss.SSSZ\"，例如：\"2019-04-01T12:00:00.000Z\"
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowReplicationParams withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** 更新时间。默认格式为：\"yyyy-MM-ddTHH:mm:ss.SSSZ\"，例如：\"2019-04-01T12:00:00.000Z\"
     * 
     * @return updatedAt */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowReplicationParams withReplicationModel(String replicationModel) {
        this.replicationModel = replicationModel;
        return this;
    }

    /** 复制对的复制类型。默认值为“hypermetro”，表示同步复制。
     * 
     * @return replicationModel */
    public String getReplicationModel() {
        return replicationModel;
    }

    public void setReplicationModel(String replicationModel) {
        this.replicationModel = replicationModel;
    }

    public ShowReplicationParams withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /** 复制对的同步进度。单位：百分比（%）。
     * 
     * @return progress */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ShowReplicationParams withFailureDetail(String failureDetail) {
        this.failureDetail = failureDetail;
        return this;
    }

    /** 仅在复制对的状态“status”为“error”时，返回的错误码。
     * 
     * @return failureDetail */
    public String getFailureDetail() {
        return failureDetail;
    }

    public void setFailureDetail(String failureDetail) {
        this.failureDetail = failureDetail;
    }

    public ShowReplicationParams withRecordMetadata(ReplicationRecordMetadata recordMetadata) {
        this.recordMetadata = recordMetadata;
        return this;
    }

    public ShowReplicationParams withRecordMetadata(Consumer<ReplicationRecordMetadata> recordMetadataSetter) {
        if (this.recordMetadata == null) {
            this.recordMetadata = new ReplicationRecordMetadata();
            recordMetadataSetter.accept(this.recordMetadata);
        }

        return this;
    }

    /** Get recordMetadata
     * 
     * @return recordMetadata */
    public ReplicationRecordMetadata getRecordMetadata() {
        return recordMetadata;
    }

    public void setRecordMetadata(ReplicationRecordMetadata recordMetadata) {
        this.recordMetadata = recordMetadata;
    }

    public ShowReplicationParams withFaultLevel(String faultLevel) {
        this.faultLevel = faultLevel;
        return this;
    }

    /** 复制对的故障等级。0：表示无故障。2：表示当前生产站点的云硬盘无读写数据权限，此时建议执行故障切换操作。5：表示复制链路已断，不能执行故障切换操作，需联系技术支持工程师。
     * 
     * @return faultLevel */
    public String getFaultLevel() {
        return faultLevel;
    }

    public void setFaultLevel(String faultLevel) {
        this.faultLevel = faultLevel;
    }

    public ShowReplicationParams withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /** 保护组的ID。
     * 
     * @return serverGroupId */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public ShowReplicationParams withPriorityStation(String priorityStation) {
        this.priorityStation = priorityStation;
        return this;
    }

    /** 标识复制对所在保护组的当前生产站点可用区。source：表示当前生产站点可用区为保护组source_availability_zone的值。target：表示当前生产站点可用区为保护组target_availability_zone的值。
     * 
     * @return priorityStation */
    public String getPriorityStation() {
        return priorityStation;
    }

    public void setPriorityStation(String priorityStation) {
        this.priorityStation = priorityStation;
    }

    public ShowReplicationParams withReplicationStatus(ReplicationStatusEnum replicationStatus) {
        this.replicationStatus = replicationStatus;
        return this;
    }

    /** 数据同步状态。active：表示数据已同步完成。inactive：表示数据未同步。copying：表示数据正在同步。active-stopped：表示数据已停止同步。
     * 
     * @return replicationStatus */
    public ReplicationStatusEnum getReplicationStatus() {
        return replicationStatus;
    }

    public void setReplicationStatus(ReplicationStatusEnum replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowReplicationParams showReplicationParams = (ShowReplicationParams) o;
        return Objects.equals(this.id, showReplicationParams.id)
            && Objects.equals(this.name, showReplicationParams.name)
            && Objects.equals(this.description, showReplicationParams.description)
            && Objects.equals(this.status, showReplicationParams.status)
            && Objects.equals(this.volumeIds, showReplicationParams.volumeIds)
            && Objects.equals(this.attachment, showReplicationParams.attachment)
            && Objects.equals(this.createdAt, showReplicationParams.createdAt)
            && Objects.equals(this.updatedAt, showReplicationParams.updatedAt)
            && Objects.equals(this.replicationModel, showReplicationParams.replicationModel)
            && Objects.equals(this.progress, showReplicationParams.progress)
            && Objects.equals(this.failureDetail, showReplicationParams.failureDetail)
            && Objects.equals(this.recordMetadata, showReplicationParams.recordMetadata)
            && Objects.equals(this.faultLevel, showReplicationParams.faultLevel)
            && Objects.equals(this.serverGroupId, showReplicationParams.serverGroupId)
            && Objects.equals(this.priorityStation, showReplicationParams.priorityStation)
            && Objects.equals(this.replicationStatus, showReplicationParams.replicationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            status,
            volumeIds,
            attachment,
            createdAt,
            updatedAt,
            replicationModel,
            progress,
            failureDetail,
            recordMetadata,
            faultLevel,
            serverGroupId,
            priorityStation,
            replicationStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReplicationParams {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    volumeIds: ").append(toIndentedString(volumeIds)).append("\n");
        sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    replicationModel: ").append(toIndentedString(replicationModel)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    failureDetail: ").append(toIndentedString(failureDetail)).append("\n");
        sb.append("    recordMetadata: ").append(toIndentedString(recordMetadata)).append("\n");
        sb.append("    faultLevel: ").append(toIndentedString(faultLevel)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    priorityStation: ").append(toIndentedString(priorityStation)).append("\n");
        sb.append("    replicationStatus: ").append(toIndentedString(replicationStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
