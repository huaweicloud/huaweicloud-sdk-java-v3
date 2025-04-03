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
 * 数字人直播任务请求。
 */
public class StartSmartLiveReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_config")

    private VideoConfig videoConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_policy")

    private PlayPolicy playPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_urls")

    private List<String> outputUrls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_keys")

    private List<String> streamKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interaction_callback_url")

    private String interactionCallbackUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_event_callback_config")

    private LiveEventCallBackConfig liveEventCallbackConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtc_callback_config")

    private RTCLiveEventCallBackConfig rtcCallbackConfig;

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
    @JsonProperty(value = "job_run_config")

    private LiveJobRunConfig jobRunConfig;

    public StartSmartLiveReq withVideoConfig(VideoConfig videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public StartSmartLiveReq withVideoConfig(Consumer<VideoConfig> videoConfigSetter) {
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

    public StartSmartLiveReq withPlayPolicy(PlayPolicy playPolicy) {
        this.playPolicy = playPolicy;
        return this;
    }

    public StartSmartLiveReq withPlayPolicy(Consumer<PlayPolicy> playPolicySetter) {
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

    public StartSmartLiveReq withOutputUrls(List<String> outputUrls) {
        this.outputUrls = outputUrls;
        return this;
    }

    public StartSmartLiveReq addOutputUrlsItem(String outputUrlsItem) {
        if (this.outputUrls == null) {
            this.outputUrls = new ArrayList<>();
        }
        this.outputUrls.add(outputUrlsItem);
        return this;
    }

    public StartSmartLiveReq withOutputUrls(Consumer<List<String>> outputUrlsSetter) {
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

    public StartSmartLiveReq withStreamKeys(List<String> streamKeys) {
        this.streamKeys = streamKeys;
        return this;
    }

    public StartSmartLiveReq addStreamKeysItem(String streamKeysItem) {
        if (this.streamKeys == null) {
            this.streamKeys = new ArrayList<>();
        }
        this.streamKeys.add(streamKeysItem);
        return this;
    }

    public StartSmartLiveReq withStreamKeys(Consumer<List<String>> streamKeysSetter) {
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

    public StartSmartLiveReq withInteractionCallbackUrl(String interactionCallbackUrl) {
        this.interactionCallbackUrl = interactionCallbackUrl;
        return this;
    }

    /**
     * **参数解释**： 互动回调URL，含鉴权信息。 互动规则trigger.reply_mode配置为CALLBACK时填写 **约束限制**： 不涉及 **取值范围**： 字符长度0-2048位 **默认取值**： 不涉及。
     * @return interactionCallbackUrl
     */
    public String getInteractionCallbackUrl() {
        return interactionCallbackUrl;
    }

    public void setInteractionCallbackUrl(String interactionCallbackUrl) {
        this.interactionCallbackUrl = interactionCallbackUrl;
    }

    public StartSmartLiveReq withLiveEventCallbackConfig(LiveEventCallBackConfig liveEventCallbackConfig) {
        this.liveEventCallbackConfig = liveEventCallbackConfig;
        return this;
    }

    public StartSmartLiveReq withLiveEventCallbackConfig(
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

    public StartSmartLiveReq withRtcCallbackConfig(RTCLiveEventCallBackConfig rtcCallbackConfig) {
        this.rtcCallbackConfig = rtcCallbackConfig;
        return this;
    }

    public StartSmartLiveReq withRtcCallbackConfig(Consumer<RTCLiveEventCallBackConfig> rtcCallbackConfigSetter) {
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

    public StartSmartLiveReq withViewMode(ViewModeEnum viewMode) {
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

    public StartSmartLiveReq withCoStreamerConfig(CoStreamerConfig coStreamerConfig) {
        this.coStreamerConfig = coStreamerConfig;
        return this;
    }

    public StartSmartLiveReq withCoStreamerConfig(Consumer<CoStreamerConfig> coStreamerConfigSetter) {
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

    public StartSmartLiveReq withJobRunConfig(LiveJobRunConfig jobRunConfig) {
        this.jobRunConfig = jobRunConfig;
        return this;
    }

    public StartSmartLiveReq withJobRunConfig(Consumer<LiveJobRunConfig> jobRunConfigSetter) {
        if (this.jobRunConfig == null) {
            this.jobRunConfig = new LiveJobRunConfig();
            jobRunConfigSetter.accept(this.jobRunConfig);
        }

        return this;
    }

    /**
     * Get jobRunConfig
     * @return jobRunConfig
     */
    public LiveJobRunConfig getJobRunConfig() {
        return jobRunConfig;
    }

    public void setJobRunConfig(LiveJobRunConfig jobRunConfig) {
        this.jobRunConfig = jobRunConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartSmartLiveReq that = (StartSmartLiveReq) obj;
        return Objects.equals(this.videoConfig, that.videoConfig) && Objects.equals(this.playPolicy, that.playPolicy)
            && Objects.equals(this.outputUrls, that.outputUrls) && Objects.equals(this.streamKeys, that.streamKeys)
            && Objects.equals(this.interactionCallbackUrl, that.interactionCallbackUrl)
            && Objects.equals(this.liveEventCallbackConfig, that.liveEventCallbackConfig)
            && Objects.equals(this.rtcCallbackConfig, that.rtcCallbackConfig)
            && Objects.equals(this.viewMode, that.viewMode)
            && Objects.equals(this.coStreamerConfig, that.coStreamerConfig)
            && Objects.equals(this.jobRunConfig, that.jobRunConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoConfig,
            playPolicy,
            outputUrls,
            streamKeys,
            interactionCallbackUrl,
            liveEventCallbackConfig,
            rtcCallbackConfig,
            viewMode,
            coStreamerConfig,
            jobRunConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartSmartLiveReq {\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
        sb.append("    playPolicy: ").append(toIndentedString(playPolicy)).append("\n");
        sb.append("    outputUrls: ").append(toIndentedString(outputUrls)).append("\n");
        sb.append("    streamKeys: ").append(toIndentedString(streamKeys)).append("\n");
        sb.append("    interactionCallbackUrl: ").append(toIndentedString(interactionCallbackUrl)).append("\n");
        sb.append("    liveEventCallbackConfig: ").append(toIndentedString(liveEventCallbackConfig)).append("\n");
        sb.append("    rtcCallbackConfig: ").append(toIndentedString(rtcCallbackConfig)).append("\n");
        sb.append("    viewMode: ").append(toIndentedString(viewMode)).append("\n");
        sb.append("    coStreamerConfig: ").append(toIndentedString(coStreamerConfig)).append("\n");
        sb.append("    jobRunConfig: ").append(toIndentedString(jobRunConfig)).append("\n");
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
