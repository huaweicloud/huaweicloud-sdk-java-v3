package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAsyncTtsJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_file_url")

    private String audioFileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_info_file_url")

    private String audioInfoFileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_srt_file_url")

    private String audioSrtFileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_action_file_url")

    private String audioActionFileUrl;

    public ShowAsyncTtsJobResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 音频文件是否已生成完成。该标记为PROCESSING时，应该每隔3秒再次调用本接口获取音频文件(WAITING 等待中,PROCESSING 处理中,SUCCEED 成功,FAILED 失败)。当存在该字段时，会返回以下文件的下载链接。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowAsyncTtsJobResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 返回码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShowAsyncTtsJobResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 异常信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowAsyncTtsJobResponse withAudioFileUrl(String audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
        return this;
    }

    /**
     * 音频文件下载链接，有效期为1个小时。
     * @return audioFileUrl
     */
    public String getAudioFileUrl() {
        return audioFileUrl;
    }

    public void setAudioFileUrl(String audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
    }

    public ShowAsyncTtsJobResponse withAudioInfoFileUrl(String audioInfoFileUrl) {
        this.audioInfoFileUrl = audioInfoFileUrl;
        return this;
    }

    /**
     * 音频信息文件下载链接，有效期为1个小时。
     * @return audioInfoFileUrl
     */
    public String getAudioInfoFileUrl() {
        return audioInfoFileUrl;
    }

    public void setAudioInfoFileUrl(String audioInfoFileUrl) {
        this.audioInfoFileUrl = audioInfoFileUrl;
    }

    public ShowAsyncTtsJobResponse withAudioSrtFileUrl(String audioSrtFileUrl) {
        this.audioSrtFileUrl = audioSrtFileUrl;
        return this;
    }

    /**
     * 字幕文件下载链接，有效期为1个小时。
     * @return audioSrtFileUrl
     */
    public String getAudioSrtFileUrl() {
        return audioSrtFileUrl;
    }

    public void setAudioSrtFileUrl(String audioSrtFileUrl) {
        this.audioSrtFileUrl = audioSrtFileUrl;
    }

    public ShowAsyncTtsJobResponse withAudioActionFileUrl(String audioActionFileUrl) {
        this.audioActionFileUrl = audioActionFileUrl;
        return this;
    }

    /**
     * 动作信息文件下载链接，有效期为1个小时。
     * @return audioActionFileUrl
     */
    public String getAudioActionFileUrl() {
        return audioActionFileUrl;
    }

    public void setAudioActionFileUrl(String audioActionFileUrl) {
        this.audioActionFileUrl = audioActionFileUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAsyncTtsJobResponse that = (ShowAsyncTtsJobResponse) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.code, that.code)
            && Objects.equals(this.message, that.message) && Objects.equals(this.audioFileUrl, that.audioFileUrl)
            && Objects.equals(this.audioInfoFileUrl, that.audioInfoFileUrl)
            && Objects.equals(this.audioSrtFileUrl, that.audioSrtFileUrl)
            && Objects.equals(this.audioActionFileUrl, that.audioActionFileUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, code, message, audioFileUrl, audioInfoFileUrl, audioSrtFileUrl, audioActionFileUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAsyncTtsJobResponse {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    audioFileUrl: ").append(toIndentedString(audioFileUrl)).append("\n");
        sb.append("    audioInfoFileUrl: ").append(toIndentedString(audioInfoFileUrl)).append("\n");
        sb.append("    audioSrtFileUrl: ").append(toIndentedString(audioSrtFileUrl)).append("\n");
        sb.append("    audioActionFileUrl: ").append(toIndentedString(audioActionFileUrl)).append("\n");
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
