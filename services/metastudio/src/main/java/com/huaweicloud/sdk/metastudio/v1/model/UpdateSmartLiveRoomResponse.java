package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateSmartLiveRoomResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_name")

    private String roomName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_description")

    private String roomDescription;

    /**
     * 直播间类型。 * NORMAL: 普通直播间，直播间一直存在，可以反复开播 * TEMP: 临时直播间,直播任务结束后自动清理直播间。
     */
    public static final class RoomTypeEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final RoomTypeEnum NORMAL = new RoomTypeEnum("NORMAL");

        /**
         * Enum TEMP for value: "TEMP"
         */
        public static final RoomTypeEnum TEMP = new RoomTypeEnum("TEMP");

        private static final Map<String, RoomTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoomTypeEnum> createStaticFields() {
            Map<String, RoomTypeEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("TEMP", TEMP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoomTypeEnum(String value) {
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
        public static RoomTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RoomTypeEnum(value));
        }

        public static RoomTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoomTypeEnum) {
                return this.value.equals(((RoomTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_type")

    private RoomTypeEnum roomType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_scripts")

    private List<LiveVideoScriptInfo> sceneScripts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interaction_rules")

    private List<InteractionRuleInfo> interactionRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_policy")

    private PlayPolicy playPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_config")

    private VideoConfig videoConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_urls")

    private List<String> outputUrls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_url")

    private String coverUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public UpdateSmartLiveRoomResponse withRoomName(String roomName) {
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

    public UpdateSmartLiveRoomResponse withRoomDescription(String roomDescription) {
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

    public UpdateSmartLiveRoomResponse withRoomType(RoomTypeEnum roomType) {
        this.roomType = roomType;
        return this;
    }

    /**
     * 直播间类型。 * NORMAL: 普通直播间，直播间一直存在，可以反复开播 * TEMP: 临时直播间,直播任务结束后自动清理直播间。
     * @return roomType
     */
    public RoomTypeEnum getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomTypeEnum roomType) {
        this.roomType = roomType;
    }

    public UpdateSmartLiveRoomResponse withSceneScripts(List<LiveVideoScriptInfo> sceneScripts) {
        this.sceneScripts = sceneScripts;
        return this;
    }

    public UpdateSmartLiveRoomResponse addSceneScriptsItem(LiveVideoScriptInfo sceneScriptsItem) {
        if (this.sceneScripts == null) {
            this.sceneScripts = new ArrayList<>();
        }
        this.sceneScripts.add(sceneScriptsItem);
        return this;
    }

    public UpdateSmartLiveRoomResponse withSceneScripts(Consumer<List<LiveVideoScriptInfo>> sceneScriptsSetter) {
        if (this.sceneScripts == null) {
            this.sceneScripts = new ArrayList<>();
        }
        sceneScriptsSetter.accept(this.sceneScripts);
        return this;
    }

    /**
     * 默认直播剧本列表。
     * @return sceneScripts
     */
    public List<LiveVideoScriptInfo> getSceneScripts() {
        return sceneScripts;
    }

    public void setSceneScripts(List<LiveVideoScriptInfo> sceneScripts) {
        this.sceneScripts = sceneScripts;
    }

    public UpdateSmartLiveRoomResponse withInteractionRules(List<InteractionRuleInfo> interactionRules) {
        this.interactionRules = interactionRules;
        return this;
    }

    public UpdateSmartLiveRoomResponse addInteractionRulesItem(InteractionRuleInfo interactionRulesItem) {
        if (this.interactionRules == null) {
            this.interactionRules = new ArrayList<>();
        }
        this.interactionRules.add(interactionRulesItem);
        return this;
    }

    public UpdateSmartLiveRoomResponse withInteractionRules(
        Consumer<List<InteractionRuleInfo>> interactionRulesSetter) {
        if (this.interactionRules == null) {
            this.interactionRules = new ArrayList<>();
        }
        interactionRulesSetter.accept(this.interactionRules);
        return this;
    }

    /**
     * 互动规则列表
     * @return interactionRules
     */
    public List<InteractionRuleInfo> getInteractionRules() {
        return interactionRules;
    }

    public void setInteractionRules(List<InteractionRuleInfo> interactionRules) {
        this.interactionRules = interactionRules;
    }

    public UpdateSmartLiveRoomResponse withPlayPolicy(PlayPolicy playPolicy) {
        this.playPolicy = playPolicy;
        return this;
    }

    public UpdateSmartLiveRoomResponse withPlayPolicy(Consumer<PlayPolicy> playPolicySetter) {
        if (this.playPolicy == null) {
            this.playPolicy = new PlayPolicy();
            playPolicySetter.accept(this.playPolicy);
        }

        return this;
    }

    /**
     * Get playPolicy
     * @return playPolicy
     */
    public PlayPolicy getPlayPolicy() {
        return playPolicy;
    }

    public void setPlayPolicy(PlayPolicy playPolicy) {
        this.playPolicy = playPolicy;
    }

    public UpdateSmartLiveRoomResponse withVideoConfig(VideoConfig videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public UpdateSmartLiveRoomResponse withVideoConfig(Consumer<VideoConfig> videoConfigSetter) {
        if (this.videoConfig == null) {
            this.videoConfig = new VideoConfig();
            videoConfigSetter.accept(this.videoConfig);
        }

        return this;
    }

    /**
     * Get videoConfig
     * @return videoConfig
     */
    public VideoConfig getVideoConfig() {
        return videoConfig;
    }

    public void setVideoConfig(VideoConfig videoConfig) {
        this.videoConfig = videoConfig;
    }

    public UpdateSmartLiveRoomResponse withOutputUrls(List<String> outputUrls) {
        this.outputUrls = outputUrls;
        return this;
    }

    public UpdateSmartLiveRoomResponse addOutputUrlsItem(String outputUrlsItem) {
        if (this.outputUrls == null) {
            this.outputUrls = new ArrayList<>();
        }
        this.outputUrls.add(outputUrlsItem);
        return this;
    }

    public UpdateSmartLiveRoomResponse withOutputUrls(Consumer<List<String>> outputUrlsSetter) {
        if (this.outputUrls == null) {
            this.outputUrls = new ArrayList<>();
        }
        outputUrlsSetter.accept(this.outputUrls);
        return this;
    }

    /**
     * 视频推流第三方直播平台地址。
     * @return outputUrls
     */
    public List<String> getOutputUrls() {
        return outputUrls;
    }

    public void setOutputUrls(List<String> outputUrls) {
        this.outputUrls = outputUrls;
    }

    public UpdateSmartLiveRoomResponse withRoomId(String roomId) {
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

    public UpdateSmartLiveRoomResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 直播间创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public UpdateSmartLiveRoomResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 直播间更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateSmartLiveRoomResponse withCoverUrl(String coverUrl) {
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

    public UpdateSmartLiveRoomResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSmartLiveRoomResponse that = (UpdateSmartLiveRoomResponse) obj;
        return Objects.equals(this.roomName, that.roomName)
            && Objects.equals(this.roomDescription, that.roomDescription)
            && Objects.equals(this.roomType, that.roomType) && Objects.equals(this.sceneScripts, that.sceneScripts)
            && Objects.equals(this.interactionRules, that.interactionRules)
            && Objects.equals(this.playPolicy, that.playPolicy) && Objects.equals(this.videoConfig, that.videoConfig)
            && Objects.equals(this.outputUrls, that.outputUrls) && Objects.equals(this.roomId, that.roomId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.coverUrl, that.coverUrl) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomName,
            roomDescription,
            roomType,
            sceneScripts,
            interactionRules,
            playPolicy,
            videoConfig,
            outputUrls,
            roomId,
            createTime,
            updateTime,
            coverUrl,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSmartLiveRoomResponse {\n");
        sb.append("    roomName: ").append(toIndentedString(roomName)).append("\n");
        sb.append("    roomDescription: ").append(toIndentedString(roomDescription)).append("\n");
        sb.append("    roomType: ").append(toIndentedString(roomType)).append("\n");
        sb.append("    sceneScripts: ").append(toIndentedString(sceneScripts)).append("\n");
        sb.append("    interactionRules: ").append(toIndentedString(interactionRules)).append("\n");
        sb.append("    playPolicy: ").append(toIndentedString(playPolicy)).append("\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
        sb.append("    outputUrls: ").append(toIndentedString(outputUrls)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
