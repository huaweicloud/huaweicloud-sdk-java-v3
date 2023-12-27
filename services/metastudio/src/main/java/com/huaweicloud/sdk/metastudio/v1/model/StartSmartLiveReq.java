package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
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
     * RTMP视频推流第三方直播平台地址。
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
     * RTMP视频推流第三方直播平台流秘钥，与推流地址对应。
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
     * 互动回调URL，含鉴权信息。
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
            && Objects.equals(this.liveEventCallbackConfig, that.liveEventCallbackConfig);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(videoConfig, playPolicy, outputUrls, streamKeys, interactionCallbackUrl, liveEventCallbackConfig);
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
