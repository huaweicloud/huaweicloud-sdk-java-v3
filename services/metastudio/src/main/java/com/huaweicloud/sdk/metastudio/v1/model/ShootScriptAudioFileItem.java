package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShootScriptAudioFileItem
 */
public class ShootScriptAudioFileItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence_no")

    private Integer sequenceNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_file_upload_url")

    private String audioFileUploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_file_download_url")

    private String audioFileDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_id")

    private Integer audioId;

    public ShootScriptAudioFileItem withSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
        return this;
    }

    /**
     * 剧本序号。
     * minimum: 0
     * maximum: 2147483647
     * @return sequenceNo
     */
    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public ShootScriptAudioFileItem withAudioFileUploadUrl(String audioFileUploadUrl) {
        this.audioFileUploadUrl = audioFileUploadUrl;
        return this;
    }

    /**
     * 语音驱动音频文件上传URL。创建和更新脚本时返回。单个文件最大100M。支持上传MP3/WAV/M4A文件。
     * @return audioFileUploadUrl
     */
    public String getAudioFileUploadUrl() {
        return audioFileUploadUrl;
    }

    public void setAudioFileUploadUrl(String audioFileUploadUrl) {
        this.audioFileUploadUrl = audioFileUploadUrl;
    }

    public ShootScriptAudioFileItem withAudioFileDownloadUrl(String audioFileDownloadUrl) {
        this.audioFileDownloadUrl = audioFileDownloadUrl;
        return this;
    }

    /**
     * 语音驱动音频文件下载URL。查询脚本详情时返回。
     * @return audioFileDownloadUrl
     */
    public String getAudioFileDownloadUrl() {
        return audioFileDownloadUrl;
    }

    public void setAudioFileDownloadUrl(String audioFileDownloadUrl) {
        this.audioFileDownloadUrl = audioFileDownloadUrl;
    }

    public ShootScriptAudioFileItem withAudioId(Integer audioId) {
        this.audioId = audioId;
        return this;
    }

    /**
     * audio id
     * minimum: 0
     * maximum: 10000
     * @return audioId
     */
    public Integer getAudioId() {
        return audioId;
    }

    public void setAudioId(Integer audioId) {
        this.audioId = audioId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShootScriptAudioFileItem that = (ShootScriptAudioFileItem) obj;
        return Objects.equals(this.sequenceNo, that.sequenceNo)
            && Objects.equals(this.audioFileUploadUrl, that.audioFileUploadUrl)
            && Objects.equals(this.audioFileDownloadUrl, that.audioFileDownloadUrl)
            && Objects.equals(this.audioId, that.audioId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequenceNo, audioFileUploadUrl, audioFileDownloadUrl, audioId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShootScriptAudioFileItem {\n");
        sb.append("    sequenceNo: ").append(toIndentedString(sequenceNo)).append("\n");
        sb.append("    audioFileUploadUrl: ").append(toIndentedString(audioFileUploadUrl)).append("\n");
        sb.append("    audioFileDownloadUrl: ").append(toIndentedString(audioFileDownloadUrl)).append("\n");
        sb.append("    audioId: ").append(toIndentedString(audioId)).append("\n");
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
