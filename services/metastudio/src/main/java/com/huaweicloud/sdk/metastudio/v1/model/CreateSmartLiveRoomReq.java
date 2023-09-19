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
 * 创建直播间配置。
 */
public class CreateSmartLiveRoomReq {

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

    public CreateSmartLiveRoomReq withRoomName(String roomName) {
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

    public CreateSmartLiveRoomReq withRoomDescription(String roomDescription) {
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

    public CreateSmartLiveRoomReq withRoomType(RoomTypeEnum roomType) {
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

    public CreateSmartLiveRoomReq withSceneScripts(List<LiveVideoScriptInfo> sceneScripts) {
        this.sceneScripts = sceneScripts;
        return this;
    }

    public CreateSmartLiveRoomReq addSceneScriptsItem(LiveVideoScriptInfo sceneScriptsItem) {
        if (this.sceneScripts == null) {
            this.sceneScripts = new ArrayList<>();
        }
        this.sceneScripts.add(sceneScriptsItem);
        return this;
    }

    public CreateSmartLiveRoomReq withSceneScripts(Consumer<List<LiveVideoScriptInfo>> sceneScriptsSetter) {
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

    public CreateSmartLiveRoomReq withInteractionRules(List<InteractionRuleInfo> interactionRules) {
        this.interactionRules = interactionRules;
        return this;
    }

    public CreateSmartLiveRoomReq addInteractionRulesItem(InteractionRuleInfo interactionRulesItem) {
        if (this.interactionRules == null) {
            this.interactionRules = new ArrayList<>();
        }
        this.interactionRules.add(interactionRulesItem);
        return this;
    }

    public CreateSmartLiveRoomReq withInteractionRules(Consumer<List<InteractionRuleInfo>> interactionRulesSetter) {
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

    public CreateSmartLiveRoomReq withPlayPolicy(PlayPolicy playPolicy) {
        this.playPolicy = playPolicy;
        return this;
    }

    public CreateSmartLiveRoomReq withPlayPolicy(Consumer<PlayPolicy> playPolicySetter) {
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

    public CreateSmartLiveRoomReq withVideoConfig(VideoConfig videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public CreateSmartLiveRoomReq withVideoConfig(Consumer<VideoConfig> videoConfigSetter) {
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

    public CreateSmartLiveRoomReq withOutputUrls(List<String> outputUrls) {
        this.outputUrls = outputUrls;
        return this;
    }

    public CreateSmartLiveRoomReq addOutputUrlsItem(String outputUrlsItem) {
        if (this.outputUrls == null) {
            this.outputUrls = new ArrayList<>();
        }
        this.outputUrls.add(outputUrlsItem);
        return this;
    }

    public CreateSmartLiveRoomReq withOutputUrls(Consumer<List<String>> outputUrlsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSmartLiveRoomReq that = (CreateSmartLiveRoomReq) obj;
        return Objects.equals(this.roomName, that.roomName)
            && Objects.equals(this.roomDescription, that.roomDescription)
            && Objects.equals(this.roomType, that.roomType) && Objects.equals(this.sceneScripts, that.sceneScripts)
            && Objects.equals(this.interactionRules, that.interactionRules)
            && Objects.equals(this.playPolicy, that.playPolicy) && Objects.equals(this.videoConfig, that.videoConfig)
            && Objects.equals(this.outputUrls, that.outputUrls);
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
            outputUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSmartLiveRoomReq {\n");
        sb.append("    roomName: ").append(toIndentedString(roomName)).append("\n");
        sb.append("    roomDescription: ").append(toIndentedString(roomDescription)).append("\n");
        sb.append("    roomType: ").append(toIndentedString(roomType)).append("\n");
        sb.append("    sceneScripts: ").append(toIndentedString(sceneScripts)).append("\n");
        sb.append("    interactionRules: ").append(toIndentedString(interactionRules)).append("\n");
        sb.append("    playPolicy: ").append(toIndentedString(playPolicy)).append("\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
        sb.append("    outputUrls: ").append(toIndentedString(outputUrls)).append("\n");
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
