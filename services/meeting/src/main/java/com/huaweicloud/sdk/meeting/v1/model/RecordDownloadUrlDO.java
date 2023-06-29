package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 单个录制文件下载链接信息。
 */
public class RecordDownloadUrlDO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileType")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public RecordDownloadUrlDO withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 下载鉴权token，下载文件时，使用该token鉴权。（一小时内有效，使用后立即失效）。
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public RecordDownloadUrlDO withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文件类型。 * Aux：辅流（会议中的共享画面；分辨率为720p） * Hd：高清（会议中的视频画面；分辨率和会议中视频画面的分辨率一致，1080p或者720p） * Sd：标清（会议中视频画面和共享画面的合成画面，视频画面是大画面，共享画面是小画面，共享画面布局在右下方；分辨率为4CIF） > 单个MP4文件大小不超过1GB。 
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public RecordDownloadUrlDO withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 文件下载url，最大1000个字符。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecordDownloadUrlDO that = (RecordDownloadUrlDO) obj;
        return Objects.equals(this.token, that.token) && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, fileType, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordDownloadUrlDO {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
