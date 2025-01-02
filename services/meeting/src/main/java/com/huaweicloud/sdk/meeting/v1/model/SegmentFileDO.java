package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 录制切片文件
 */
public class SegmentFileDO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordType")

    private String recordType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beginTime")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileSize")

    private Long fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha256")

    private String sha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playUrl")

    private String playUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downloadUrl")

    private String downloadUrl;

    public SegmentFileDO withRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * 会议录制类型，取值范围见数据结构RecordType：AUDIO 纯音频录制，SPEAKER_VIDEO 演讲者视图，SHARE_VIDEO共享屏幕，SPEAKER_SHARE_VIDEO 含演讲者视图的共享屏幕
     * @return recordType
     */
    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public SegmentFileDO withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 录制文件开始时间 
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public SegmentFileDO withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 录制文件结束时间 
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public SegmentFileDO withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 录制文件时长(秒)
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public SegmentFileDO withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件大小(字节数)
     * @return fileSize
     */
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public SegmentFileDO withSha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }

    /**
     * 文件hash校验码(SHA256)，64个字符
     * @return sha256
     */
    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public SegmentFileDO withPlayUrl(String playUrl) {
        this.playUrl = playUrl;
        return this;
    }

    /**
     * 录制文件播放地址，有效期1小时
     * @return playUrl
     */
    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public SegmentFileDO withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * 录制文件下载地址，有效期1小时
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SegmentFileDO that = (SegmentFileDO) obj;
        return Objects.equals(this.recordType, that.recordType) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.sha256, that.sha256)
            && Objects.equals(this.playUrl, that.playUrl) && Objects.equals(this.downloadUrl, that.downloadUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordType, beginTime, endTime, duration, fileSize, sha256, playUrl, downloadUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SegmentFileDO {\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
        sb.append("    playUrl: ").append(toIndentedString(playUrl)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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
