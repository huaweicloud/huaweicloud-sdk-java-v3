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
     * 直播间类型。 * NORMAL: 普通直播间，直播间一直存在，可以反复开播 * TEMP: 临时直播间,直播任务结束后自动清理直播间。 * TEMPLATE: 直播间模板。
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

        /**
         * Enum TEMPLATE for value: "TEMPLATE"
         */
        public static final RoomTypeEnum TEMPLATE = new RoomTypeEnum("TEMPLATE");

        private static final Map<String, RoomTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoomTypeEnum> createStaticFields() {
            Map<String, RoomTypeEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("TEMP", TEMP);
            map.put("TEMPLATE", TEMPLATE);
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

    private List<LiveRoomInteractionRuleInfo> interactionRules = null;

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
    @JsonProperty(value = "stream_keys")

    private List<String> streamKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_model_asset_ids")

    private List<String> backupModelAssetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_event_callback_config")

    private LiveEventCallBackConfig liveEventCallbackConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtc_callback_config")

    private RTCLiveEventCallBackConfig rtcCallbackConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_config")

    private ReviewConfig reviewConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_config")

    private SharedConfig sharedConfig;

    /**
     * 横竖屏类型。默认值为：VERTICAL。 * LANDSCAPE：横屏。 * VERTICAL： 竖屏。
     */
    public static final class ViewModeEnum {

        /**
         * Enum LANDSCAPE for value: "LANDSCAPE"
         */
        public static final ViewModeEnum LANDSCAPE = new ViewModeEnum("LANDSCAPE");

        /**
         * Enum VERTICAL for value: "VERTICAL"
         */
        public static final ViewModeEnum VERTICAL = new ViewModeEnum("VERTICAL");

        private static final Map<String, ViewModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ViewModeEnum> createStaticFields() {
            Map<String, ViewModeEnum> map = new HashMap<>();
            map.put("LANDSCAPE", LANDSCAPE);
            map.put("VERTICAL", VERTICAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ViewModeEnum(String value) {
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
        public static ViewModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ViewModeEnum(value));
        }

        public static ViewModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ViewModeEnum) {
                return this.value.equals(((ViewModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_mode")

    private ViewModeEnum viewMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "co_streamer_config")

    private CoStreamerConfig coStreamerConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priv_data")

    private String privData;

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
     * 直播间类型。 * NORMAL: 普通直播间，直播间一直存在，可以反复开播 * TEMP: 临时直播间,直播任务结束后自动清理直播间。 * TEMPLATE: 直播间模板。
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

    public CreateSmartLiveRoomReq withInteractionRules(List<LiveRoomInteractionRuleInfo> interactionRules) {
        this.interactionRules = interactionRules;
        return this;
    }

    public CreateSmartLiveRoomReq addInteractionRulesItem(LiveRoomInteractionRuleInfo interactionRulesItem) {
        if (this.interactionRules == null) {
            this.interactionRules = new ArrayList<>();
        }
        this.interactionRules.add(interactionRulesItem);
        return this;
    }

    public CreateSmartLiveRoomReq withInteractionRules(
        Consumer<List<LiveRoomInteractionRuleInfo>> interactionRulesSetter) {
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
    public List<LiveRoomInteractionRuleInfo> getInteractionRules() {
        return interactionRules;
    }

    public void setInteractionRules(List<LiveRoomInteractionRuleInfo> interactionRules) {
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
     * RTMP视频推流第三方直播平台地址。
     * @return outputUrls
     */
    public List<String> getOutputUrls() {
        return outputUrls;
    }

    public void setOutputUrls(List<String> outputUrls) {
        this.outputUrls = outputUrls;
    }

    public CreateSmartLiveRoomReq withStreamKeys(List<String> streamKeys) {
        this.streamKeys = streamKeys;
        return this;
    }

    public CreateSmartLiveRoomReq addStreamKeysItem(String streamKeysItem) {
        if (this.streamKeys == null) {
            this.streamKeys = new ArrayList<>();
        }
        this.streamKeys.add(streamKeysItem);
        return this;
    }

    public CreateSmartLiveRoomReq withStreamKeys(Consumer<List<String>> streamKeysSetter) {
        if (this.streamKeys == null) {
            this.streamKeys = new ArrayList<>();
        }
        streamKeysSetter.accept(this.streamKeys);
        return this;
    }

    /**
     * RTMP视频推流第三方直播平台流秘钥，与推流地址对应。
     * @return streamKeys
     */
    public List<String> getStreamKeys() {
        return streamKeys;
    }

    public void setStreamKeys(List<String> streamKeys) {
        this.streamKeys = streamKeys;
    }

    public CreateSmartLiveRoomReq withBackupModelAssetIds(List<String> backupModelAssetIds) {
        this.backupModelAssetIds = backupModelAssetIds;
        return this;
    }

    public CreateSmartLiveRoomReq addBackupModelAssetIdsItem(String backupModelAssetIdsItem) {
        if (this.backupModelAssetIds == null) {
            this.backupModelAssetIds = new ArrayList<>();
        }
        this.backupModelAssetIds.add(backupModelAssetIdsItem);
        return this;
    }

    public CreateSmartLiveRoomReq withBackupModelAssetIds(Consumer<List<String>> backupModelAssetIdsSetter) {
        if (this.backupModelAssetIds == null) {
            this.backupModelAssetIds = new ArrayList<>();
        }
        backupModelAssetIdsSetter.accept(this.backupModelAssetIds);
        return this;
    }

    /**
     * 主播轮换时备选主播数字人资产ID（仅形象资产，不包含音色），可以从资产库中查询。
     * @return backupModelAssetIds
     */
    public List<String> getBackupModelAssetIds() {
        return backupModelAssetIds;
    }

    public void setBackupModelAssetIds(List<String> backupModelAssetIds) {
        this.backupModelAssetIds = backupModelAssetIds;
    }

    public CreateSmartLiveRoomReq withLiveEventCallbackConfig(LiveEventCallBackConfig liveEventCallbackConfig) {
        this.liveEventCallbackConfig = liveEventCallbackConfig;
        return this;
    }

    public CreateSmartLiveRoomReq withLiveEventCallbackConfig(
        Consumer<LiveEventCallBackConfig> liveEventCallbackConfigSetter) {
        if (this.liveEventCallbackConfig == null) {
            this.liveEventCallbackConfig = new LiveEventCallBackConfig();
            liveEventCallbackConfigSetter.accept(this.liveEventCallbackConfig);
        }

        return this;
    }

    /**
     * Get liveEventCallbackConfig
     * @return liveEventCallbackConfig
     */
    public LiveEventCallBackConfig getLiveEventCallbackConfig() {
        return liveEventCallbackConfig;
    }

    public void setLiveEventCallbackConfig(LiveEventCallBackConfig liveEventCallbackConfig) {
        this.liveEventCallbackConfig = liveEventCallbackConfig;
    }

    public CreateSmartLiveRoomReq withRtcCallbackConfig(RTCLiveEventCallBackConfig rtcCallbackConfig) {
        this.rtcCallbackConfig = rtcCallbackConfig;
        return this;
    }

    public CreateSmartLiveRoomReq withRtcCallbackConfig(Consumer<RTCLiveEventCallBackConfig> rtcCallbackConfigSetter) {
        if (this.rtcCallbackConfig == null) {
            this.rtcCallbackConfig = new RTCLiveEventCallBackConfig();
            rtcCallbackConfigSetter.accept(this.rtcCallbackConfig);
        }

        return this;
    }

    /**
     * Get rtcCallbackConfig
     * @return rtcCallbackConfig
     */
    public RTCLiveEventCallBackConfig getRtcCallbackConfig() {
        return rtcCallbackConfig;
    }

    public void setRtcCallbackConfig(RTCLiveEventCallBackConfig rtcCallbackConfig) {
        this.rtcCallbackConfig = rtcCallbackConfig;
    }

    public CreateSmartLiveRoomReq withReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
        return this;
    }

    public CreateSmartLiveRoomReq withReviewConfig(Consumer<ReviewConfig> reviewConfigSetter) {
        if (this.reviewConfig == null) {
            this.reviewConfig = new ReviewConfig();
            reviewConfigSetter.accept(this.reviewConfig);
        }

        return this;
    }

    /**
     * Get reviewConfig
     * @return reviewConfig
     */
    public ReviewConfig getReviewConfig() {
        return reviewConfig;
    }

    public void setReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
    }

    public CreateSmartLiveRoomReq withSharedConfig(SharedConfig sharedConfig) {
        this.sharedConfig = sharedConfig;
        return this;
    }

    public CreateSmartLiveRoomReq withSharedConfig(Consumer<SharedConfig> sharedConfigSetter) {
        if (this.sharedConfig == null) {
            this.sharedConfig = new SharedConfig();
            sharedConfigSetter.accept(this.sharedConfig);
        }

        return this;
    }

    /**
     * Get sharedConfig
     * @return sharedConfig
     */
    public SharedConfig getSharedConfig() {
        return sharedConfig;
    }

    public void setSharedConfig(SharedConfig sharedConfig) {
        this.sharedConfig = sharedConfig;
    }

    public CreateSmartLiveRoomReq withViewMode(ViewModeEnum viewMode) {
        this.viewMode = viewMode;
        return this;
    }

    /**
     * 横竖屏类型。默认值为：VERTICAL。 * LANDSCAPE：横屏。 * VERTICAL： 竖屏。
     * @return viewMode
     */
    public ViewModeEnum getViewMode() {
        return viewMode;
    }

    public void setViewMode(ViewModeEnum viewMode) {
        this.viewMode = viewMode;
    }

    public CreateSmartLiveRoomReq withCoStreamerConfig(CoStreamerConfig coStreamerConfig) {
        this.coStreamerConfig = coStreamerConfig;
        return this;
    }

    public CreateSmartLiveRoomReq withCoStreamerConfig(Consumer<CoStreamerConfig> coStreamerConfigSetter) {
        if (this.coStreamerConfig == null) {
            this.coStreamerConfig = new CoStreamerConfig();
            coStreamerConfigSetter.accept(this.coStreamerConfig);
        }

        return this;
    }

    /**
     * Get coStreamerConfig
     * @return coStreamerConfig
     */
    public CoStreamerConfig getCoStreamerConfig() {
        return coStreamerConfig;
    }

    public void setCoStreamerConfig(CoStreamerConfig coStreamerConfig) {
        this.coStreamerConfig = coStreamerConfig;
    }

    public CreateSmartLiveRoomReq withPrivData(String privData) {
        this.privData = privData;
        return this;
    }

    /**
     * 私有数据，用户填写，原样带回。
     * @return privData
     */
    public String getPrivData() {
        return privData;
    }

    public void setPrivData(String privData) {
        this.privData = privData;
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
            && Objects.equals(this.outputUrls, that.outputUrls) && Objects.equals(this.streamKeys, that.streamKeys)
            && Objects.equals(this.backupModelAssetIds, that.backupModelAssetIds)
            && Objects.equals(this.liveEventCallbackConfig, that.liveEventCallbackConfig)
            && Objects.equals(this.rtcCallbackConfig, that.rtcCallbackConfig)
            && Objects.equals(this.reviewConfig, that.reviewConfig)
            && Objects.equals(this.sharedConfig, that.sharedConfig) && Objects.equals(this.viewMode, that.viewMode)
            && Objects.equals(this.coStreamerConfig, that.coStreamerConfig)
            && Objects.equals(this.privData, that.privData);
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
            streamKeys,
            backupModelAssetIds,
            liveEventCallbackConfig,
            rtcCallbackConfig,
            reviewConfig,
            sharedConfig,
            viewMode,
            coStreamerConfig,
            privData);
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
        sb.append("    streamKeys: ").append(toIndentedString(streamKeys)).append("\n");
        sb.append("    backupModelAssetIds: ").append(toIndentedString(backupModelAssetIds)).append("\n");
        sb.append("    liveEventCallbackConfig: ").append(toIndentedString(liveEventCallbackConfig)).append("\n");
        sb.append("    rtcCallbackConfig: ").append(toIndentedString(rtcCallbackConfig)).append("\n");
        sb.append("    reviewConfig: ").append(toIndentedString(reviewConfig)).append("\n");
        sb.append("    sharedConfig: ").append(toIndentedString(sharedConfig)).append("\n");
        sb.append("    viewMode: ").append(toIndentedString(viewMode)).append("\n");
        sb.append("    coStreamerConfig: ").append(toIndentedString(coStreamerConfig)).append("\n");
        sb.append("    privData: ").append(toIndentedString(privData)).append("\n");
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
