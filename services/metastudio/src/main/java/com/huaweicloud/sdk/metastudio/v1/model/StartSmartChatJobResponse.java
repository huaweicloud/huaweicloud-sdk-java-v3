package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StartSmartChatJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtc_room_info")

    private RTCRoomInfoList rtcRoomInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_subtitle_config")

    private SmartChatSubtitleConfig chatSubtitleConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_config")

    private SmartChatVideoConfig videoConfig;

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
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_access_address")

    private String chatAccessAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_transparent")

    private Boolean isTransparent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public StartSmartChatJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 智能交互对话任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public StartSmartChatJobResponse withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public StartSmartChatJobResponse withRtcRoomInfo(RTCRoomInfoList rtcRoomInfo) {
        this.rtcRoomInfo = rtcRoomInfo;
        return this;
    }

    public StartSmartChatJobResponse withRtcRoomInfo(Consumer<RTCRoomInfoList> rtcRoomInfoSetter) {
        if (this.rtcRoomInfo == null) {
            this.rtcRoomInfo = new RTCRoomInfoList();
            rtcRoomInfoSetter.accept(this.rtcRoomInfo);
        }

        return this;
    }

    /**
     * Get rtcRoomInfo
     * @return rtcRoomInfo
     */
    public RTCRoomInfoList getRtcRoomInfo() {
        return rtcRoomInfo;
    }

    public void setRtcRoomInfo(RTCRoomInfoList rtcRoomInfo) {
        this.rtcRoomInfo = rtcRoomInfo;
    }

    public StartSmartChatJobResponse withChatSubtitleConfig(SmartChatSubtitleConfig chatSubtitleConfig) {
        this.chatSubtitleConfig = chatSubtitleConfig;
        return this;
    }

    public StartSmartChatJobResponse withChatSubtitleConfig(
        Consumer<SmartChatSubtitleConfig> chatSubtitleConfigSetter) {
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

    public StartSmartChatJobResponse withVideoConfig(SmartChatVideoConfig videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public StartSmartChatJobResponse withVideoConfig(Consumer<SmartChatVideoConfig> videoConfigSetter) {
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

    public StartSmartChatJobResponse withChatVideoType(ChatVideoTypeEnum chatVideoType) {
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

    public StartSmartChatJobResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 算力所在region。 * cn-north-4: 北京4 * cn-southwest-2: 贵阳1
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public StartSmartChatJobResponse withChatAccessAddress(String chatAccessAddress) {
        this.chatAccessAddress = chatAccessAddress;
        return this;
    }

    /**
     * 智能交互接入地址。
     * @return chatAccessAddress
     */
    public String getChatAccessAddress() {
        return chatAccessAddress;
    }

    public void setChatAccessAddress(String chatAccessAddress) {
        this.chatAccessAddress = chatAccessAddress;
    }

    public StartSmartChatJobResponse withIsTransparent(Boolean isTransparent) {
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

    public StartSmartChatJobResponse withXRequestId(String xRequestId) {
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
        StartSmartChatJobResponse that = (StartSmartChatJobResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.language, that.language)
            && Objects.equals(this.rtcRoomInfo, that.rtcRoomInfo)
            && Objects.equals(this.chatSubtitleConfig, that.chatSubtitleConfig)
            && Objects.equals(this.videoConfig, that.videoConfig)
            && Objects.equals(this.chatVideoType, that.chatVideoType) && Objects.equals(this.region, that.region)
            && Objects.equals(this.chatAccessAddress, that.chatAccessAddress)
            && Objects.equals(this.isTransparent, that.isTransparent)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            language,
            rtcRoomInfo,
            chatSubtitleConfig,
            videoConfig,
            chatVideoType,
            region,
            chatAccessAddress,
            isTransparent,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartSmartChatJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    rtcRoomInfo: ").append(toIndentedString(rtcRoomInfo)).append("\n");
        sb.append("    chatSubtitleConfig: ").append(toIndentedString(chatSubtitleConfig)).append("\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
        sb.append("    chatVideoType: ").append(toIndentedString(chatVideoType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    chatAccessAddress: ").append(toIndentedString(chatAccessAddress)).append("\n");
        sb.append("    isTransparent: ").append(toIndentedString(isTransparent)).append("\n");
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
