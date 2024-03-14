package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartChatRoomBaseInfo
 */
public class SmartChatRoomBaseInfo {

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
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_url")

    private String coverUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_infos")

    private ModelInfo modelInfos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_config")

    private VoiceConfig voiceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrency")

    private Integer concurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public SmartChatRoomBaseInfo withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * 智能交互对话ID
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public SmartChatRoomBaseInfo withRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * 智能交互对话名称
     * @return roomName
     */
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public SmartChatRoomBaseInfo withRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
        return this;
    }

    /**
     * 智能交互对话描述。
     * @return roomDescription
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public SmartChatRoomBaseInfo withRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }

    /**
     * 机器人ID。
     * @return robotId
     */
    public String getRobotId() {
        return robotId;
    }

    public void setRobotId(String robotId) {
        this.robotId = robotId;
    }

    public SmartChatRoomBaseInfo withCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }

    /**
     * 对话封面图URL
     * @return coverUrl
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public SmartChatRoomBaseInfo withModelInfos(ModelInfo modelInfos) {
        this.modelInfos = modelInfos;
        return this;
    }

    public SmartChatRoomBaseInfo withModelInfos(Consumer<ModelInfo> modelInfosSetter) {
        if (this.modelInfos == null) {
            this.modelInfos = new ModelInfo();
            modelInfosSetter.accept(this.modelInfos);
        }

        return this;
    }

    /**
     * Get modelInfos
     * @return modelInfos
     */
    public ModelInfo getModelInfos() {
        return modelInfos;
    }

    public void setModelInfos(ModelInfo modelInfos) {
        this.modelInfos = modelInfos;
    }

    public SmartChatRoomBaseInfo withVoiceConfig(VoiceConfig voiceConfig) {
        this.voiceConfig = voiceConfig;
        return this;
    }

    public SmartChatRoomBaseInfo withVoiceConfig(Consumer<VoiceConfig> voiceConfigSetter) {
        if (this.voiceConfig == null) {
            this.voiceConfig = new VoiceConfig();
            voiceConfigSetter.accept(this.voiceConfig);
        }

        return this;
    }

    /**
     * Get voiceConfig
     * @return voiceConfig
     */
    public VoiceConfig getVoiceConfig() {
        return voiceConfig;
    }

    public void setVoiceConfig(VoiceConfig voiceConfig) {
        this.voiceConfig = voiceConfig;
    }

    public SmartChatRoomBaseInfo withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    /**
     * 并发路数。
     * minimum: 0
     * maximum: 1024
     * @return concurrency
     */
    public Integer getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    public SmartChatRoomBaseInfo withCreateTime(String createTime) {
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

    public SmartChatRoomBaseInfo withUpdateTime(String updateTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartChatRoomBaseInfo that = (SmartChatRoomBaseInfo) obj;
        return Objects.equals(this.roomId, that.roomId) && Objects.equals(this.roomName, that.roomName)
            && Objects.equals(this.roomDescription, that.roomDescription) && Objects.equals(this.robotId, that.robotId)
            && Objects.equals(this.coverUrl, that.coverUrl) && Objects.equals(this.modelInfos, that.modelInfos)
            && Objects.equals(this.voiceConfig, that.voiceConfig) && Objects.equals(this.concurrency, that.concurrency)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId,
            roomName,
            roomDescription,
            robotId,
            coverUrl,
            modelInfos,
            voiceConfig,
            concurrency,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartChatRoomBaseInfo {\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    roomName: ").append(toIndentedString(roomName)).append("\n");
        sb.append("    roomDescription: ").append(toIndentedString(roomDescription)).append("\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
        sb.append("    modelInfos: ").append(toIndentedString(modelInfos)).append("\n");
        sb.append("    voiceConfig: ").append(toIndentedString(voiceConfig)).append("\n");
        sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
