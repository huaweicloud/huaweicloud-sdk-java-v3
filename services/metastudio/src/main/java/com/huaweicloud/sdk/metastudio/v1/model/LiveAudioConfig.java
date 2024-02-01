package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 直播音频配置
 */
public class LiveAudioConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_url")

    private String audioUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtitle_url")

    private String subtitleUrl;

    public LiveAudioConfig withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 插入音频资产的资产id，外部资产信息无需填写
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public LiveAudioConfig withAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }

    /**
     * 音频URL。仅支持MP3格式，大小<100MB。输出会自动转化为单声道16KHZ采样。
     * @return audioUrl
     */
    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public LiveAudioConfig withSubtitleUrl(String subtitleUrl) {
        this.subtitleUrl = subtitleUrl;
        return this;
    }

    /**
     * 音频对应的字幕文件URL。仅SRT格式，大小<1MB。
     * @return subtitleUrl
     */
    public String getSubtitleUrl() {
        return subtitleUrl;
    }

    public void setSubtitleUrl(String subtitleUrl) {
        this.subtitleUrl = subtitleUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveAudioConfig that = (LiveAudioConfig) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.audioUrl, that.audioUrl)
            && Objects.equals(this.subtitleUrl, that.subtitleUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, audioUrl, subtitleUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveAudioConfig {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
        sb.append("    subtitleUrl: ").append(toIndentedString(subtitleUrl)).append("\n");
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
