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
     * **参数解释**： 直播间类型。 **约束限制**： 不涉及。 **取值范围**： * NORMAL：普通直播间，直播间一直存在，可以反复开播 * TEMP：临时直播间，直播任务结束后自动清理直播间。 * TEMPLATE：直播间模板。
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
    @JsonProperty(value = "interaction_config")

    private LiveRoomInteractionConfig interactionConfig;

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

    private LiveRoomEventCallBackConfig liveEventCallbackConfig;

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
     * **参数解释**： 横竖屏类型。 **约束限制**： 用户无需填写，通过video_config中分辨率判断 **取值范围**： * LANDSCAPE：横屏。 * VERTICAL： 竖屏。
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_live_platform_info")

    private PlatformLiveDetailInfo relationLivePlatformInfo;

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
    @JsonProperty(value = "thumbnail")

    private String thumbnail;

    /**
     * 直播间配置状态。 - ENABLE: 直播间正常可用。 - DISABLE： 直播间不可用。不可用原因在error_info中说明。 - BLOCKED：直播间被冻结。冻结原因在error_info中说明。
     */
    public static final class RoomStateEnum {

        /**
         * Enum ENABLE for value: "ENABLE"
         */
        public static final RoomStateEnum ENABLE = new RoomStateEnum("ENABLE");

        /**
         * Enum DISABLE for value: "DISABLE"
         */
        public static final RoomStateEnum DISABLE = new RoomStateEnum("DISABLE");

        /**
         * Enum BLOCKED for value: "BLOCKED"
         */
        public static final RoomStateEnum BLOCKED = new RoomStateEnum("BLOCKED");

        private static final Map<String, RoomStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoomStateEnum> createStaticFields() {
            Map<String, RoomStateEnum> map = new HashMap<>();
            map.put("ENABLE", ENABLE);
            map.put("DISABLE", DISABLE);
            map.put("BLOCKED", BLOCKED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoomStateEnum(String value) {
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
        public static RoomStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RoomStateEnum(value));
        }

        public static RoomStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoomStateEnum) {
                return this.value.equals(((RoomStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_state")

    private RoomStateEnum roomState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private ErrorResponse errorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public UpdateSmartLiveRoomResponse withRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * **参数解释**： 直播间名称。 **约束限制**： 不涉及。 **取值范围**： 字符长度1-256位。 **默认取值**： 不涉及。
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
     * **参数解释**： 直播间描述。 **约束限制**： 不涉及。 **取值范围**： 字符长度0-1024位。 **默认取值**： 不涉及。
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
     * **参数解释**： 直播间类型。 **约束限制**： 不涉及。 **取值范围**： * NORMAL：普通直播间，直播间一直存在，可以反复开播 * TEMP：临时直播间，直播任务结束后自动清理直播间。 * TEMPLATE：直播间模板。
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

    public UpdateSmartLiveRoomResponse withInteractionConfig(LiveRoomInteractionConfig interactionConfig) {
        this.interactionConfig = interactionConfig;
        return this;
    }

    public UpdateSmartLiveRoomResponse withInteractionConfig(
        Consumer<LiveRoomInteractionConfig> interactionConfigSetter) {
        if (this.interactionConfig == null) {
            this.interactionConfig = new LiveRoomInteractionConfig();
            interactionConfigSetter.accept(this.interactionConfig);
        }

        return this;
    }

    /**
     * Get interactionConfig
     * @return interactionConfig
     */
    public LiveRoomInteractionConfig getInteractionConfig() {
        return interactionConfig;
    }

    public void setInteractionConfig(LiveRoomInteractionConfig interactionConfig) {
        this.interactionConfig = interactionConfig;
    }

    public UpdateSmartLiveRoomResponse withInteractionRules(List<LiveRoomInteractionRuleInfo> interactionRules) {
        this.interactionRules = interactionRules;
        return this;
    }

    public UpdateSmartLiveRoomResponse addInteractionRulesItem(LiveRoomInteractionRuleInfo interactionRulesItem) {
        if (this.interactionRules == null) {
            this.interactionRules = new ArrayList<>();
        }
        this.interactionRules.add(interactionRulesItem);
        return this;
    }

    public UpdateSmartLiveRoomResponse withInteractionRules(
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
     * **参数解释**： RTMP视频推流第三方直播平台地址。 > 直播过程中刷新地址，需要调用COMMAND命令REFRESH_OUTPUT_URL。  **约束限制**： 不涉及 **取值范围**： 当前仅支持一条RTMP出流地址。 **默认取值**： 不涉及。
     * @return outputUrls
     */
    public List<String> getOutputUrls() {
        return outputUrls;
    }

    public void setOutputUrls(List<String> outputUrls) {
        this.outputUrls = outputUrls;
    }

    public UpdateSmartLiveRoomResponse withStreamKeys(List<String> streamKeys) {
        this.streamKeys = streamKeys;
        return this;
    }

    public UpdateSmartLiveRoomResponse addStreamKeysItem(String streamKeysItem) {
        if (this.streamKeys == null) {
            this.streamKeys = new ArrayList<>();
        }
        this.streamKeys.add(streamKeysItem);
        return this;
    }

    public UpdateSmartLiveRoomResponse withStreamKeys(Consumer<List<String>> streamKeysSetter) {
        if (this.streamKeys == null) {
            this.streamKeys = new ArrayList<>();
        }
        streamKeysSetter.accept(this.streamKeys);
        return this;
    }

    /**
     * **参数解释**： RTMP视频推流第三方直播平台流密钥，与推流地址对应。 > 直播过程中刷新地址，需要调用COMMAND命令REFRESH_OUTPUT_URL。  **约束限制**： 不涉及 **取值范围**： 当前仅支持一条RTMP出流地址。 **默认取值**： 不涉及。
     * @return streamKeys
     */
    public List<String> getStreamKeys() {
        return streamKeys;
    }

    public void setStreamKeys(List<String> streamKeys) {
        this.streamKeys = streamKeys;
    }

    public UpdateSmartLiveRoomResponse withBackupModelAssetIds(List<String> backupModelAssetIds) {
        this.backupModelAssetIds = backupModelAssetIds;
        return this;
    }

    public UpdateSmartLiveRoomResponse addBackupModelAssetIdsItem(String backupModelAssetIdsItem) {
        if (this.backupModelAssetIds == null) {
            this.backupModelAssetIds = new ArrayList<>();
        }
        this.backupModelAssetIds.add(backupModelAssetIdsItem);
        return this;
    }

    public UpdateSmartLiveRoomResponse withBackupModelAssetIds(Consumer<List<String>> backupModelAssetIdsSetter) {
        if (this.backupModelAssetIds == null) {
            this.backupModelAssetIds = new ArrayList<>();
        }
        backupModelAssetIdsSetter.accept(this.backupModelAssetIds);
        return this;
    }

    /**
     * **参数解释**： 主播轮换时备选主播数字人资产ID（仅形象资产，不包含声音）。  **约束限制**： 不涉及 **取值范围**： 当前最大支持5个备选主播。 数字人资产ID，字符长度0-64位。 **默认取值**： 不涉及
     * @return backupModelAssetIds
     */
    public List<String> getBackupModelAssetIds() {
        return backupModelAssetIds;
    }

    public void setBackupModelAssetIds(List<String> backupModelAssetIds) {
        this.backupModelAssetIds = backupModelAssetIds;
    }

    public UpdateSmartLiveRoomResponse withLiveEventCallbackConfig(
        LiveRoomEventCallBackConfig liveEventCallbackConfig) {
        this.liveEventCallbackConfig = liveEventCallbackConfig;
        return this;
    }

    public UpdateSmartLiveRoomResponse withLiveEventCallbackConfig(
        Consumer<LiveRoomEventCallBackConfig> liveEventCallbackConfigSetter) {
        if (this.liveEventCallbackConfig == null) {
            this.liveEventCallbackConfig = new LiveRoomEventCallBackConfig();
            liveEventCallbackConfigSetter.accept(this.liveEventCallbackConfig);
        }

        return this;
    }

    /**
     * Get liveEventCallbackConfig
     * @return liveEventCallbackConfig
     */
    public LiveRoomEventCallBackConfig getLiveEventCallbackConfig() {
        return liveEventCallbackConfig;
    }

    public void setLiveEventCallbackConfig(LiveRoomEventCallBackConfig liveEventCallbackConfig) {
        this.liveEventCallbackConfig = liveEventCallbackConfig;
    }

    public UpdateSmartLiveRoomResponse withRtcCallbackConfig(RTCLiveEventCallBackConfig rtcCallbackConfig) {
        this.rtcCallbackConfig = rtcCallbackConfig;
        return this;
    }

    public UpdateSmartLiveRoomResponse withRtcCallbackConfig(
        Consumer<RTCLiveEventCallBackConfig> rtcCallbackConfigSetter) {
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

    public UpdateSmartLiveRoomResponse withReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
        return this;
    }

    public UpdateSmartLiveRoomResponse withReviewConfig(Consumer<ReviewConfig> reviewConfigSetter) {
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

    public UpdateSmartLiveRoomResponse withSharedConfig(SharedConfig sharedConfig) {
        this.sharedConfig = sharedConfig;
        return this;
    }

    public UpdateSmartLiveRoomResponse withSharedConfig(Consumer<SharedConfig> sharedConfigSetter) {
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

    public UpdateSmartLiveRoomResponse withViewMode(ViewModeEnum viewMode) {
        this.viewMode = viewMode;
        return this;
    }

    /**
     * **参数解释**： 横竖屏类型。 **约束限制**： 用户无需填写，通过video_config中分辨率判断 **取值范围**： * LANDSCAPE：横屏。 * VERTICAL： 竖屏。
     * @return viewMode
     */
    public ViewModeEnum getViewMode() {
        return viewMode;
    }

    public void setViewMode(ViewModeEnum viewMode) {
        this.viewMode = viewMode;
    }

    public UpdateSmartLiveRoomResponse withCoStreamerConfig(CoStreamerConfig coStreamerConfig) {
        this.coStreamerConfig = coStreamerConfig;
        return this;
    }

    public UpdateSmartLiveRoomResponse withCoStreamerConfig(Consumer<CoStreamerConfig> coStreamerConfigSetter) {
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

    public UpdateSmartLiveRoomResponse withPrivData(String privData) {
        this.privData = privData;
        return this;
    }

    /**
     * **参数解释**： 匹配值私有数据，用户填写，原样带回。 **约束限制**： 不涉及 **取值范围**： 字符长度0-8192 **默认取值**： 不涉及。
     * @return privData
     */
    public String getPrivData() {
        return privData;
    }

    public void setPrivData(String privData) {
        this.privData = privData;
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

    public UpdateSmartLiveRoomResponse withRelationLivePlatformInfo(PlatformLiveDetailInfo relationLivePlatformInfo) {
        this.relationLivePlatformInfo = relationLivePlatformInfo;
        return this;
    }

    public UpdateSmartLiveRoomResponse withRelationLivePlatformInfo(
        Consumer<PlatformLiveDetailInfo> relationLivePlatformInfoSetter) {
        if (this.relationLivePlatformInfo == null) {
            this.relationLivePlatformInfo = new PlatformLiveDetailInfo();
            relationLivePlatformInfoSetter.accept(this.relationLivePlatformInfo);
        }

        return this;
    }

    /**
     * Get relationLivePlatformInfo
     * @return relationLivePlatformInfo
     */
    public PlatformLiveDetailInfo getRelationLivePlatformInfo() {
        return relationLivePlatformInfo;
    }

    public void setRelationLivePlatformInfo(PlatformLiveDetailInfo relationLivePlatformInfo) {
        this.relationLivePlatformInfo = relationLivePlatformInfo;
    }

    public UpdateSmartLiveRoomResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 直播间创建时间，格式遵循：RFC 3339 如“2021-01-10T08:43:17Z”。
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
     * 直播间更新时间，格式遵循：RFC 3339 如“2021-01-10T08:43:17Z”。
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

    public UpdateSmartLiveRoomResponse withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * 直播间封面图新URL
     * @return thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public UpdateSmartLiveRoomResponse withRoomState(RoomStateEnum roomState) {
        this.roomState = roomState;
        return this;
    }

    /**
     * 直播间配置状态。 - ENABLE: 直播间正常可用。 - DISABLE： 直播间不可用。不可用原因在error_info中说明。 - BLOCKED：直播间被冻结。冻结原因在error_info中说明。
     * @return roomState
     */
    public RoomStateEnum getRoomState() {
        return roomState;
    }

    public void setRoomState(RoomStateEnum roomState) {
        this.roomState = roomState;
    }

    public UpdateSmartLiveRoomResponse withErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public UpdateSmartLiveRoomResponse withErrorInfo(Consumer<ErrorResponse> errorInfoSetter) {
        if (this.errorInfo == null) {
            this.errorInfo = new ErrorResponse();
            errorInfoSetter.accept(this.errorInfo);
        }

        return this;
    }

    /**
     * Get errorInfo
     * @return errorInfo
     */
    public ErrorResponse getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
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
            && Objects.equals(this.interactionConfig, that.interactionConfig)
            && Objects.equals(this.interactionRules, that.interactionRules)
            && Objects.equals(this.playPolicy, that.playPolicy) && Objects.equals(this.videoConfig, that.videoConfig)
            && Objects.equals(this.outputUrls, that.outputUrls) && Objects.equals(this.streamKeys, that.streamKeys)
            && Objects.equals(this.backupModelAssetIds, that.backupModelAssetIds)
            && Objects.equals(this.liveEventCallbackConfig, that.liveEventCallbackConfig)
            && Objects.equals(this.rtcCallbackConfig, that.rtcCallbackConfig)
            && Objects.equals(this.reviewConfig, that.reviewConfig)
            && Objects.equals(this.sharedConfig, that.sharedConfig) && Objects.equals(this.viewMode, that.viewMode)
            && Objects.equals(this.coStreamerConfig, that.coStreamerConfig)
            && Objects.equals(this.privData, that.privData) && Objects.equals(this.roomId, that.roomId)
            && Objects.equals(this.relationLivePlatformInfo, that.relationLivePlatformInfo)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.coverUrl, that.coverUrl) && Objects.equals(this.thumbnail, that.thumbnail)
            && Objects.equals(this.roomState, that.roomState) && Objects.equals(this.errorInfo, that.errorInfo)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomName,
            roomDescription,
            roomType,
            sceneScripts,
            interactionConfig,
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
            privData,
            roomId,
            relationLivePlatformInfo,
            createTime,
            updateTime,
            coverUrl,
            thumbnail,
            roomState,
            errorInfo,
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
        sb.append("    interactionConfig: ").append(toIndentedString(interactionConfig)).append("\n");
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
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    relationLivePlatformInfo: ").append(toIndentedString(relationLivePlatformInfo)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    roomState: ").append(toIndentedString(roomState)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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
