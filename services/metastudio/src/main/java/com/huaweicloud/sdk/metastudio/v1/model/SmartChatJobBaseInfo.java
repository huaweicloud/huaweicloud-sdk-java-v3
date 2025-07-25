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
 * 数字人智能交互对话任务信息。
 */
public class SmartChatJobBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * 数字人智能交互对话任务的状态。 * WAITING: 等待 * PROCESSING: 处理中 * SUCCEED: 成功 * FAILED: 失败 * DELETING: 删除中
     */
    public static final class StateEnum {

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final StateEnum WAITING = new StateEnum("WAITING");

        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final StateEnum PROCESSING = new StateEnum("PROCESSING");

        /**
         * Enum SUCCEED for value: "SUCCEED"
         */
        public static final StateEnum SUCCEED = new StateEnum("SUCCEED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StateEnum FAILED = new StateEnum("FAILED");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final StateEnum CANCELED = new StateEnum("CANCELED");

        /**
         * Enum HEARTBEAT for value: "HEARTBEAT"
         */
        public static final StateEnum HEARTBEAT = new StateEnum("HEARTBEAT");

        /**
         * Enum IDLE for value: "IDLE"
         */
        public static final StateEnum IDLE = new StateEnum("IDLE");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StateEnum DELETING = new StateEnum("DELETING");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("WAITING", WAITING);
            map.put("PROCESSING", PROCESSING);
            map.put("SUCCEED", SUCCEED);
            map.put("FAILED", FAILED);
            map.put("CANCELED", CANCELED);
            map.put("HEARTBEAT", HEARTBEAT);
            map.put("IDLE", IDLE);
            map.put("DELETING", DELETING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Float duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private ErrorResponse errorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastupdate_time")

    private String lastupdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_subtitle_config")

    private SmartChatSubtitleConfig chatSubtitleConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_config")

    private SmartChatVideoConfig videoConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_config_list")

    private List<SmartChatVoiceConfig> voiceConfigList = null;

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
    @JsonProperty(value = "is_transparent")

    private Boolean isTransparent;

    /**
     * 默认语言，智能交互接口使用。默认值CN。 * CN：中文。 * EN：英文。 * ESP：西班牙语（仅海外站点支持） * por：葡萄牙语（仅海外站点支持） * Arabic：阿拉伯语（仅海外站点支持） * Thai：泰语（仅海外站点支持）
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
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_pool_mode")

    private Boolean isPoolMode;

    /**
     * 对话结束原因 * NORMAL：正常结束 * MUTE_TIMEOUT：静音超时
     */
    public static final class JobFinishReasonEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final JobFinishReasonEnum NORMAL = new JobFinishReasonEnum("NORMAL");

        /**
         * Enum MUTE_TIMEOUT for value: "MUTE_TIMEOUT"
         */
        public static final JobFinishReasonEnum MUTE_TIMEOUT = new JobFinishReasonEnum("MUTE_TIMEOUT");

        private static final Map<String, JobFinishReasonEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobFinishReasonEnum> createStaticFields() {
            Map<String, JobFinishReasonEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("MUTE_TIMEOUT", MUTE_TIMEOUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobFinishReasonEnum(String value) {
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
        public static JobFinishReasonEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobFinishReasonEnum(value));
        }

        public static JobFinishReasonEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobFinishReasonEnum) {
                return this.value.equals(((JobFinishReasonEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_finish_reason")

    private JobFinishReasonEnum jobFinishReason;

    public SmartChatJobBaseInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 数字人智能交互对话任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SmartChatJobBaseInfo withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 数字人智能交互对话任务的状态。 * WAITING: 等待 * PROCESSING: 处理中 * SUCCEED: 成功 * FAILED: 失败 * DELETING: 删除中
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public SmartChatJobBaseInfo withDuration(Float duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 数字人智能交互对话时长，单位秒。
     * minimum: 0
     * maximum: 2147483647
     * @return duration
     */
    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public SmartChatJobBaseInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 数字人智能交互对话任务开始时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SmartChatJobBaseInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 数字人智能交互对话任务结束时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SmartChatJobBaseInfo withErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public SmartChatJobBaseInfo withErrorInfo(Consumer<ErrorResponse> errorInfoSetter) {
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

    public SmartChatJobBaseInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 数字人智能交互对话任务创建时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public SmartChatJobBaseInfo withLastupdateTime(String lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
        return this;
    }

    /**
     * 数字人智能交互对话任务最后更新时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return lastupdateTime
     */
    public String getLastupdateTime() {
        return lastupdateTime;
    }

    public void setLastupdateTime(String lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
    }

    public SmartChatJobBaseInfo withChatSubtitleConfig(SmartChatSubtitleConfig chatSubtitleConfig) {
        this.chatSubtitleConfig = chatSubtitleConfig;
        return this;
    }

    public SmartChatJobBaseInfo withChatSubtitleConfig(Consumer<SmartChatSubtitleConfig> chatSubtitleConfigSetter) {
        if (this.chatSubtitleConfig == null) {
            this.chatSubtitleConfig = new SmartChatSubtitleConfig();
            chatSubtitleConfigSetter.accept(this.chatSubtitleConfig);
        }

        return this;
    }

    /**
     * Get chatSubtitleConfig
     * @return chatSubtitleConfig
     */
    public SmartChatSubtitleConfig getChatSubtitleConfig() {
        return chatSubtitleConfig;
    }

    public void setChatSubtitleConfig(SmartChatSubtitleConfig chatSubtitleConfig) {
        this.chatSubtitleConfig = chatSubtitleConfig;
    }

    public SmartChatJobBaseInfo withVideoConfig(SmartChatVideoConfig videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public SmartChatJobBaseInfo withVideoConfig(Consumer<SmartChatVideoConfig> videoConfigSetter) {
        if (this.videoConfig == null) {
            this.videoConfig = new SmartChatVideoConfig();
            videoConfigSetter.accept(this.videoConfig);
        }

        return this;
    }

    /**
     * Get videoConfig
     * @return videoConfig
     */
    public SmartChatVideoConfig getVideoConfig() {
        return videoConfig;
    }

    public void setVideoConfig(SmartChatVideoConfig videoConfig) {
        this.videoConfig = videoConfig;
    }

    public SmartChatJobBaseInfo withVoiceConfigList(List<SmartChatVoiceConfig> voiceConfigList) {
        this.voiceConfigList = voiceConfigList;
        return this;
    }

    public SmartChatJobBaseInfo addVoiceConfigListItem(SmartChatVoiceConfig voiceConfigListItem) {
        if (this.voiceConfigList == null) {
            this.voiceConfigList = new ArrayList<>();
        }
        this.voiceConfigList.add(voiceConfigListItem);
        return this;
    }

    public SmartChatJobBaseInfo withVoiceConfigList(Consumer<List<SmartChatVoiceConfig>> voiceConfigListSetter) {
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
    public List<SmartChatVoiceConfig> getVoiceConfigList() {
        return voiceConfigList;
    }

    public void setVoiceConfigList(List<SmartChatVoiceConfig> voiceConfigList) {
        this.voiceConfigList = voiceConfigList;
    }

    public SmartChatJobBaseInfo withChatVideoType(ChatVideoTypeEnum chatVideoType) {
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

    public SmartChatJobBaseInfo withIsTransparent(Boolean isTransparent) {
        this.isTransparent = isTransparent;
        return this;
    }

    /**
     * 是否透明背景
     * @return isTransparent
     */
    public Boolean getIsTransparent() {
        return isTransparent;
    }

    public void setIsTransparent(Boolean isTransparent) {
        this.isTransparent = isTransparent;
    }

    public SmartChatJobBaseInfo withDefaultLanguage(DefaultLanguageEnum defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }

    /**
     * 默认语言，智能交互接口使用。默认值CN。 * CN：中文。 * EN：英文。 * ESP：西班牙语（仅海外站点支持） * por：葡萄牙语（仅海外站点支持） * Arabic：阿拉伯语（仅海外站点支持） * Thai：泰语（仅海外站点支持）
     * @return defaultLanguage
     */
    public DefaultLanguageEnum getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(DefaultLanguageEnum defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    public SmartChatJobBaseInfo withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * clientId
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public SmartChatJobBaseInfo withIsPoolMode(Boolean isPoolMode) {
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

    public SmartChatJobBaseInfo withJobFinishReason(JobFinishReasonEnum jobFinishReason) {
        this.jobFinishReason = jobFinishReason;
        return this;
    }

    /**
     * 对话结束原因 * NORMAL：正常结束 * MUTE_TIMEOUT：静音超时
     * @return jobFinishReason
     */
    public JobFinishReasonEnum getJobFinishReason() {
        return jobFinishReason;
    }

    public void setJobFinishReason(JobFinishReasonEnum jobFinishReason) {
        this.jobFinishReason = jobFinishReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartChatJobBaseInfo that = (SmartChatJobBaseInfo) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.errorInfo, that.errorInfo)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastupdateTime, that.lastupdateTime)
            && Objects.equals(this.chatSubtitleConfig, that.chatSubtitleConfig)
            && Objects.equals(this.videoConfig, that.videoConfig)
            && Objects.equals(this.voiceConfigList, that.voiceConfigList)
            && Objects.equals(this.chatVideoType, that.chatVideoType)
            && Objects.equals(this.isTransparent, that.isTransparent)
            && Objects.equals(this.defaultLanguage, that.defaultLanguage)
            && Objects.equals(this.clientId, that.clientId) && Objects.equals(this.isPoolMode, that.isPoolMode)
            && Objects.equals(this.jobFinishReason, that.jobFinishReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            state,
            duration,
            startTime,
            endTime,
            errorInfo,
            createTime,
            lastupdateTime,
            chatSubtitleConfig,
            videoConfig,
            voiceConfigList,
            chatVideoType,
            isTransparent,
            defaultLanguage,
            clientId,
            isPoolMode,
            jobFinishReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartChatJobBaseInfo {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastupdateTime: ").append(toIndentedString(lastupdateTime)).append("\n");
        sb.append("    chatSubtitleConfig: ").append(toIndentedString(chatSubtitleConfig)).append("\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
        sb.append("    voiceConfigList: ").append(toIndentedString(voiceConfigList)).append("\n");
        sb.append("    chatVideoType: ").append(toIndentedString(chatVideoType)).append("\n");
        sb.append("    isTransparent: ").append(toIndentedString(isTransparent)).append("\n");
        sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    isPoolMode: ").append(toIndentedString(isPoolMode)).append("\n");
        sb.append("    jobFinishReason: ").append(toIndentedString(jobFinishReason)).append("\n");
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
