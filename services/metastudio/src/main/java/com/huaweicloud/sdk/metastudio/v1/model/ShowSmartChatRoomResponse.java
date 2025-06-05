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
public class ShowSmartChatRoomResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_name")

    private String roomName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_description")

    private String roomDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_config")

    private VideoConfig videoConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_asset_id")

    private String modelAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_config")

    private VoiceConfig voiceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_config_list")

    private List<ChatVoiceConfig> voiceConfigList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrency")

    private Integer concurrency;

    /**
     * 默认语言，智能交互接口使用。默认值CN。 * CN：简体中文。 * EN：英语。 * ESP：西班牙语（仅海外站点支持） * por：葡萄牙语（仅海外站点支持） * Arabic：阿拉伯语（仅海外站点支持） * Thai：泰语（仅海外站点支持）
     */
    public static final class DefaultLanguageEnum {

        /**
         * Enum CN for value: "CN"
         */
        public static final DefaultLanguageEnum CN = new DefaultLanguageEnum("CN");

        /**
         * Enum EN for value: "EN"
         */
        public static final DefaultLanguageEnum EN = new DefaultLanguageEnum("EN");

        /**
         * Enum ESP for value: "ESP"
         */
        public static final DefaultLanguageEnum ESP = new DefaultLanguageEnum("ESP");

        /**
         * Enum POR for value: "por"
         */
        public static final DefaultLanguageEnum POR = new DefaultLanguageEnum("por");

        /**
         * Enum ARABIC for value: "Arabic"
         */
        public static final DefaultLanguageEnum ARABIC = new DefaultLanguageEnum("Arabic");

        /**
         * Enum THAI for value: "Thai"
         */
        public static final DefaultLanguageEnum THAI = new DefaultLanguageEnum("Thai");

        private static final Map<String, DefaultLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DefaultLanguageEnum> createStaticFields() {
            Map<String, DefaultLanguageEnum> map = new HashMap<>();
            map.put("CN", CN);
            map.put("EN", EN);
            map.put("ESP", ESP);
            map.put("por", POR);
            map.put("Arabic", ARABIC);
            map.put("Thai", THAI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DefaultLanguageEnum(String value) {
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
        public static DefaultLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DefaultLanguageEnum(value));
        }

        public static DefaultLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DefaultLanguageEnum) {
                return this.value.equals(((DefaultLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_language")

    private DefaultLanguageEnum defaultLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_config")

    private BackgroundConfigInfo backgroundConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layer_config")

    private List<LayerConfig> layerConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_config")

    private ReviewConfig reviewConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_subtitle_config")

    private ChatSubtitleConfig chatSubtitleConfig;

    /**
     * 智能交互对话端配置。 * COMPUTER: 电脑端 * MOBILE: 手机端 * HUB: 大屏
     */
    public static final class ChatVideoTypeEnum {

        /**
         * Enum COMPUTER for value: "COMPUTER"
         */
        public static final ChatVideoTypeEnum COMPUTER = new ChatVideoTypeEnum("COMPUTER");

        /**
         * Enum MOBILE for value: "MOBILE"
         */
        public static final ChatVideoTypeEnum MOBILE = new ChatVideoTypeEnum("MOBILE");

        /**
         * Enum HUB for value: "HUB"
         */
        public static final ChatVideoTypeEnum HUB = new ChatVideoTypeEnum("HUB");

        private static final Map<String, ChatVideoTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChatVideoTypeEnum> createStaticFields() {
            Map<String, ChatVideoTypeEnum> map = new HashMap<>();
            map.put("COMPUTER", COMPUTER);
            map.put("MOBILE", MOBILE);
            map.put("HUB", HUB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChatVideoTypeEnum(String value) {
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
        public static ChatVideoTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChatVideoTypeEnum(value));
        }

        public static ChatVideoTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChatVideoTypeEnum) {
                return this.value.equals(((ChatVideoTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_video_type")

    private ChatVideoTypeEnum chatVideoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exit_mute_threshold")

    private Integer exitMuteThreshold;

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
    @JsonProperty(value = "is_pool_mode")

    private Boolean isPoolMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_resource_config")

    private List<ChatResourceConfigInfo> chatResourceConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowSmartChatRoomResponse withRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * 对话名称
     * @return roomName
     */
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public ShowSmartChatRoomResponse withRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
        return this;
    }

    /**
     * 对话描述。
     * @return roomDescription
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public ShowSmartChatRoomResponse withVideoConfig(VideoConfig videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public ShowSmartChatRoomResponse withVideoConfig(Consumer<VideoConfig> videoConfigSetter) {
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

    public ShowSmartChatRoomResponse withModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
        return this;
    }

    /**
     * 数字人模型资产ID。
     * @return modelAssetId
     */
    public String getModelAssetId() {
        return modelAssetId;
    }

    public void setModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
    }

    public ShowSmartChatRoomResponse withVoiceConfig(VoiceConfig voiceConfig) {
        this.voiceConfig = voiceConfig;
        return this;
    }

    public ShowSmartChatRoomResponse withVoiceConfig(Consumer<VoiceConfig> voiceConfigSetter) {
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

    public ShowSmartChatRoomResponse withVoiceConfigList(List<ChatVoiceConfig> voiceConfigList) {
        this.voiceConfigList = voiceConfigList;
        return this;
    }

    public ShowSmartChatRoomResponse addVoiceConfigListItem(ChatVoiceConfig voiceConfigListItem) {
        if (this.voiceConfigList == null) {
            this.voiceConfigList = new ArrayList<>();
        }
        this.voiceConfigList.add(voiceConfigListItem);
        return this;
    }

    public ShowSmartChatRoomResponse withVoiceConfigList(Consumer<List<ChatVoiceConfig>> voiceConfigListSetter) {
        if (this.voiceConfigList == null) {
            this.voiceConfigList = new ArrayList<>();
        }
        voiceConfigListSetter.accept(this.voiceConfigList);
        return this;
    }

    /**
     * 语音配置参数列表。
     * @return voiceConfigList
     */
    public List<ChatVoiceConfig> getVoiceConfigList() {
        return voiceConfigList;
    }

    public void setVoiceConfigList(List<ChatVoiceConfig> voiceConfigList) {
        this.voiceConfigList = voiceConfigList;
    }

    public ShowSmartChatRoomResponse withRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }

    /**
     * 机器人ID。获取方法请参考[创建应用](CreateRobot.xml)。
     * @return robotId
     */
    public String getRobotId() {
        return robotId;
    }

    public void setRobotId(String robotId) {
        this.robotId = robotId;
    }

    public ShowSmartChatRoomResponse withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    /**
     * **参数解释**： 并发路数。 **约束限制**： 默认没有并发路数，如果不配置并发数量，则无法启动智能交互对话任务。
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

    public ShowSmartChatRoomResponse withDefaultLanguage(DefaultLanguageEnum defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }

    /**
     * 默认语言，智能交互接口使用。默认值CN。 * CN：简体中文。 * EN：英语。 * ESP：西班牙语（仅海外站点支持） * por：葡萄牙语（仅海外站点支持） * Arabic：阿拉伯语（仅海外站点支持） * Thai：泰语（仅海外站点支持）
     * @return defaultLanguage
     */
    public DefaultLanguageEnum getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(DefaultLanguageEnum defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    public ShowSmartChatRoomResponse withBackgroundConfig(BackgroundConfigInfo backgroundConfig) {
        this.backgroundConfig = backgroundConfig;
        return this;
    }

    public ShowSmartChatRoomResponse withBackgroundConfig(Consumer<BackgroundConfigInfo> backgroundConfigSetter) {
        if (this.backgroundConfig == null) {
            this.backgroundConfig = new BackgroundConfigInfo();
            backgroundConfigSetter.accept(this.backgroundConfig);
        }

        return this;
    }

    /**
     * Get backgroundConfig
     * @return backgroundConfig
     */
    public BackgroundConfigInfo getBackgroundConfig() {
        return backgroundConfig;
    }

    public void setBackgroundConfig(BackgroundConfigInfo backgroundConfig) {
        this.backgroundConfig = backgroundConfig;
    }

    public ShowSmartChatRoomResponse withLayerConfig(List<LayerConfig> layerConfig) {
        this.layerConfig = layerConfig;
        return this;
    }

    public ShowSmartChatRoomResponse addLayerConfigItem(LayerConfig layerConfigItem) {
        if (this.layerConfig == null) {
            this.layerConfig = new ArrayList<>();
        }
        this.layerConfig.add(layerConfigItem);
        return this;
    }

    public ShowSmartChatRoomResponse withLayerConfig(Consumer<List<LayerConfig>> layerConfigSetter) {
        if (this.layerConfig == null) {
            this.layerConfig = new ArrayList<>();
        }
        layerConfigSetter.accept(this.layerConfig);
        return this;
    }

    /**
     * 图层配置。
     * @return layerConfig
     */
    public List<LayerConfig> getLayerConfig() {
        return layerConfig;
    }

    public void setLayerConfig(List<LayerConfig> layerConfig) {
        this.layerConfig = layerConfig;
    }

    public ShowSmartChatRoomResponse withReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
        return this;
    }

    public ShowSmartChatRoomResponse withReviewConfig(Consumer<ReviewConfig> reviewConfigSetter) {
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

    public ShowSmartChatRoomResponse withChatSubtitleConfig(ChatSubtitleConfig chatSubtitleConfig) {
        this.chatSubtitleConfig = chatSubtitleConfig;
        return this;
    }

    public ShowSmartChatRoomResponse withChatSubtitleConfig(Consumer<ChatSubtitleConfig> chatSubtitleConfigSetter) {
        if (this.chatSubtitleConfig == null) {
            this.chatSubtitleConfig = new ChatSubtitleConfig();
            chatSubtitleConfigSetter.accept(this.chatSubtitleConfig);
        }

        return this;
    }

    /**
     * Get chatSubtitleConfig
     * @return chatSubtitleConfig
     */
    public ChatSubtitleConfig getChatSubtitleConfig() {
        return chatSubtitleConfig;
    }

    public void setChatSubtitleConfig(ChatSubtitleConfig chatSubtitleConfig) {
        this.chatSubtitleConfig = chatSubtitleConfig;
    }

    public ShowSmartChatRoomResponse withChatVideoType(ChatVideoTypeEnum chatVideoType) {
        this.chatVideoType = chatVideoType;
        return this;
    }

    /**
     * 智能交互对话端配置。 * COMPUTER: 电脑端 * MOBILE: 手机端 * HUB: 大屏
     * @return chatVideoType
     */
    public ChatVideoTypeEnum getChatVideoType() {
        return chatVideoType;
    }

    public void setChatVideoType(ChatVideoTypeEnum chatVideoType) {
        this.chatVideoType = chatVideoType;
    }

    public ShowSmartChatRoomResponse withExitMuteThreshold(Integer exitMuteThreshold) {
        this.exitMuteThreshold = exitMuteThreshold;
        return this;
    }

    /**
     * **参数解释**： 静默退出时长。
     * minimum: 0
     * maximum: 1440
     * @return exitMuteThreshold
     */
    public Integer getExitMuteThreshold() {
        return exitMuteThreshold;
    }

    public void setExitMuteThreshold(Integer exitMuteThreshold) {
        this.exitMuteThreshold = exitMuteThreshold;
    }

    public ShowSmartChatRoomResponse withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * 对话ID。
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public ShowSmartChatRoomResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 智能交互对话创建时间，格式遵循：RFC 3339 如“2021-01-10T08:43:17Z”。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowSmartChatRoomResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 智能交互对话更新时间，格式遵循：RFC 3339 如“2021-01-10T08:43:17Z”。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowSmartChatRoomResponse withCoverUrl(String coverUrl) {
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

    public ShowSmartChatRoomResponse withIsPoolMode(Boolean isPoolMode) {
        this.isPoolMode = isPoolMode;
        return this;
    }

    /**
     * 是否是资源池模式
     * @return isPoolMode
     */
    public Boolean getIsPoolMode() {
        return isPoolMode;
    }

    public void setIsPoolMode(Boolean isPoolMode) {
        this.isPoolMode = isPoolMode;
    }

    public ShowSmartChatRoomResponse withChatResourceConfig(List<ChatResourceConfigInfo> chatResourceConfig) {
        this.chatResourceConfig = chatResourceConfig;
        return this;
    }

    public ShowSmartChatRoomResponse addChatResourceConfigItem(ChatResourceConfigInfo chatResourceConfigItem) {
        if (this.chatResourceConfig == null) {
            this.chatResourceConfig = new ArrayList<>();
        }
        this.chatResourceConfig.add(chatResourceConfigItem);
        return this;
    }

    public ShowSmartChatRoomResponse withChatResourceConfig(
        Consumer<List<ChatResourceConfigInfo>> chatResourceConfigSetter) {
        if (this.chatResourceConfig == null) {
            this.chatResourceConfig = new ArrayList<>();
        }
        chatResourceConfigSetter.accept(this.chatResourceConfig);
        return this;
    }

    /**
     * 资源配置。
     * @return chatResourceConfig
     */
    public List<ChatResourceConfigInfo> getChatResourceConfig() {
        return chatResourceConfig;
    }

    public void setChatResourceConfig(List<ChatResourceConfigInfo> chatResourceConfig) {
        this.chatResourceConfig = chatResourceConfig;
    }

    public ShowSmartChatRoomResponse withXRequestId(String xRequestId) {
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
        ShowSmartChatRoomResponse that = (ShowSmartChatRoomResponse) obj;
        return Objects.equals(this.roomName, that.roomName)
            && Objects.equals(this.roomDescription, that.roomDescription)
            && Objects.equals(this.videoConfig, that.videoConfig)
            && Objects.equals(this.modelAssetId, that.modelAssetId)
            && Objects.equals(this.voiceConfig, that.voiceConfig)
            && Objects.equals(this.voiceConfigList, that.voiceConfigList) && Objects.equals(this.robotId, that.robotId)
            && Objects.equals(this.concurrency, that.concurrency)
            && Objects.equals(this.defaultLanguage, that.defaultLanguage)
            && Objects.equals(this.backgroundConfig, that.backgroundConfig)
            && Objects.equals(this.layerConfig, that.layerConfig)
            && Objects.equals(this.reviewConfig, that.reviewConfig)
            && Objects.equals(this.chatSubtitleConfig, that.chatSubtitleConfig)
            && Objects.equals(this.chatVideoType, that.chatVideoType)
            && Objects.equals(this.exitMuteThreshold, that.exitMuteThreshold)
            && Objects.equals(this.roomId, that.roomId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.coverUrl, that.coverUrl)
            && Objects.equals(this.isPoolMode, that.isPoolMode)
            && Objects.equals(this.chatResourceConfig, that.chatResourceConfig)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomName,
            roomDescription,
            videoConfig,
            modelAssetId,
            voiceConfig,
            voiceConfigList,
            robotId,
            concurrency,
            defaultLanguage,
            backgroundConfig,
            layerConfig,
            reviewConfig,
            chatSubtitleConfig,
            chatVideoType,
            exitMuteThreshold,
            roomId,
            createTime,
            updateTime,
            coverUrl,
            isPoolMode,
            chatResourceConfig,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSmartChatRoomResponse {\n");
        sb.append("    roomName: ").append(toIndentedString(roomName)).append("\n");
        sb.append("    roomDescription: ").append(toIndentedString(roomDescription)).append("\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
        sb.append("    modelAssetId: ").append(toIndentedString(modelAssetId)).append("\n");
        sb.append("    voiceConfig: ").append(toIndentedString(voiceConfig)).append("\n");
        sb.append("    voiceConfigList: ").append(toIndentedString(voiceConfigList)).append("\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
        sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
        sb.append("    backgroundConfig: ").append(toIndentedString(backgroundConfig)).append("\n");
        sb.append("    layerConfig: ").append(toIndentedString(layerConfig)).append("\n");
        sb.append("    reviewConfig: ").append(toIndentedString(reviewConfig)).append("\n");
        sb.append("    chatSubtitleConfig: ").append(toIndentedString(chatSubtitleConfig)).append("\n");
        sb.append("    chatVideoType: ").append(toIndentedString(chatVideoType)).append("\n");
        sb.append("    exitMuteThreshold: ").append(toIndentedString(exitMuteThreshold)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
        sb.append("    isPoolMode: ").append(toIndentedString(isPoolMode)).append("\n");
        sb.append("    chatResourceConfig: ").append(toIndentedString(chatResourceConfig)).append("\n");
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
