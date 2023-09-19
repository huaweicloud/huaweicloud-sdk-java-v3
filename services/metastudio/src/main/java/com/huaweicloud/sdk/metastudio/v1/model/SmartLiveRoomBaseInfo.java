package com.huaweicloud.sdk.metastudio.v1.model;

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

/**
 * SmartLiveRoomBaseInfo
 */
public class SmartLiveRoomBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_name")

    private String roomName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_description")

    private String roomDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_url")

    private String coverUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_infos")

    private List<ModelInfo> modelInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_job_start_time")

    private String lastJobStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_job_end_time")

    private String lastJobEndTime;

    /**
     * 当前直播状态 - WAITING：任务等待执行 - PROCESSING：任务执行中 - SUCCEED：任务处理成功 - FAILED：任务处理时变 - CANCELED：任务取消
     */
    public static final class LastJobStatusEnum {

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final LastJobStatusEnum WAITING = new LastJobStatusEnum("WAITING");

        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final LastJobStatusEnum PROCESSING = new LastJobStatusEnum("PROCESSING");

        /**
         * Enum SUCCEED for value: "SUCCEED"
         */
        public static final LastJobStatusEnum SUCCEED = new LastJobStatusEnum("SUCCEED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final LastJobStatusEnum FAILED = new LastJobStatusEnum("FAILED");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final LastJobStatusEnum CANCELED = new LastJobStatusEnum("CANCELED");

        private static final Map<String, LastJobStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LastJobStatusEnum> createStaticFields() {
            Map<String, LastJobStatusEnum> map = new HashMap<>();
            map.put("WAITING", WAITING);
            map.put("PROCESSING", PROCESSING);
            map.put("SUCCEED", SUCCEED);
            map.put("FAILED", FAILED);
            map.put("CANCELED", CANCELED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LastJobStatusEnum(String value) {
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
        public static LastJobStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LastJobStatusEnum(value));
        }

        public static LastJobStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LastJobStatusEnum) {
                return this.value.equals(((LastJobStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_job_status")

    private LastJobStatusEnum lastJobStatus;

    public SmartLiveRoomBaseInfo withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * 直播间ID
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public SmartLiveRoomBaseInfo withRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * 直播间名称
     * @return roomName
     */
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public SmartLiveRoomBaseInfo withRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
        return this;
    }

    /**
     * 直播间描述。
     * @return roomDescription
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public SmartLiveRoomBaseInfo withCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }

    /**
     * 直播间封面图URL
     * @return coverUrl
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public SmartLiveRoomBaseInfo withModelInfos(List<ModelInfo> modelInfos) {
        this.modelInfos = modelInfos;
        return this;
    }

    public SmartLiveRoomBaseInfo addModelInfosItem(ModelInfo modelInfosItem) {
        if (this.modelInfos == null) {
            this.modelInfos = new ArrayList<>();
        }
        this.modelInfos.add(modelInfosItem);
        return this;
    }

    public SmartLiveRoomBaseInfo withModelInfos(Consumer<List<ModelInfo>> modelInfosSetter) {
        if (this.modelInfos == null) {
            this.modelInfos = new ArrayList<>();
        }
        modelInfosSetter.accept(this.modelInfos);
        return this;
    }

    /**
     * 数字人模型信息
     * @return modelInfos
     */
    public List<ModelInfo> getModelInfos() {
        return modelInfos;
    }

    public void setModelInfos(List<ModelInfo> modelInfos) {
        this.modelInfos = modelInfos;
    }

    public SmartLiveRoomBaseInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public SmartLiveRoomBaseInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public SmartLiveRoomBaseInfo withLastJobStartTime(String lastJobStartTime) {
        this.lastJobStartTime = lastJobStartTime;
        return this;
    }

    /**
     * 开始直播时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return lastJobStartTime
     */
    public String getLastJobStartTime() {
        return lastJobStartTime;
    }

    public void setLastJobStartTime(String lastJobStartTime) {
        this.lastJobStartTime = lastJobStartTime;
    }

    public SmartLiveRoomBaseInfo withLastJobEndTime(String lastJobEndTime) {
        this.lastJobEndTime = lastJobEndTime;
        return this;
    }

    /**
     * 结束直播时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return lastJobEndTime
     */
    public String getLastJobEndTime() {
        return lastJobEndTime;
    }

    public void setLastJobEndTime(String lastJobEndTime) {
        this.lastJobEndTime = lastJobEndTime;
    }

    public SmartLiveRoomBaseInfo withLastJobStatus(LastJobStatusEnum lastJobStatus) {
        this.lastJobStatus = lastJobStatus;
        return this;
    }

    /**
     * 当前直播状态 - WAITING：任务等待执行 - PROCESSING：任务执行中 - SUCCEED：任务处理成功 - FAILED：任务处理时变 - CANCELED：任务取消
     * @return lastJobStatus
     */
    public LastJobStatusEnum getLastJobStatus() {
        return lastJobStatus;
    }

    public void setLastJobStatus(LastJobStatusEnum lastJobStatus) {
        this.lastJobStatus = lastJobStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartLiveRoomBaseInfo that = (SmartLiveRoomBaseInfo) obj;
        return Objects.equals(this.roomId, that.roomId) && Objects.equals(this.roomName, that.roomName)
            && Objects.equals(this.roomDescription, that.roomDescription)
            && Objects.equals(this.coverUrl, that.coverUrl) && Objects.equals(this.modelInfos, that.modelInfos)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.lastJobStartTime, that.lastJobStartTime)
            && Objects.equals(this.lastJobEndTime, that.lastJobEndTime)
            && Objects.equals(this.lastJobStatus, that.lastJobStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId,
            roomName,
            roomDescription,
            coverUrl,
            modelInfos,
            createTime,
            updateTime,
            lastJobStartTime,
            lastJobEndTime,
            lastJobStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartLiveRoomBaseInfo {\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    roomName: ").append(toIndentedString(roomName)).append("\n");
        sb.append("    roomDescription: ").append(toIndentedString(roomDescription)).append("\n");
        sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
        sb.append("    modelInfos: ").append(toIndentedString(modelInfos)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    lastJobStartTime: ").append(toIndentedString(lastJobStartTime)).append("\n");
        sb.append("    lastJobEndTime: ").append(toIndentedString(lastJobEndTime)).append("\n");
        sb.append("    lastJobStatus: ").append(toIndentedString(lastJobStatus)).append("\n");
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
