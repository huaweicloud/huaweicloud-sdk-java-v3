package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateAssetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_upload_url")

    private String videoUploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_upload_url")

    private String coverUploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtitle_upload_urls")

    private List<String> subtitleUploadUrls = null;

    public UpdateAssetResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 媒资ID。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public UpdateAssetResponse withVideoUploadUrl(String videoUploadUrl) {
        this.videoUploadUrl = videoUploadUrl;
        return this;
    }

    /**
     * 视频上传地址。  用于客户端上传不超过20MB的小视频文件（<=20MB）。该URL中携带了临时授权信息，当文件大于20MB时，需要采用分段方式上传。  > 您可以使用PUT请求向“**video_upload_url**”中上传视频文件。其中，“**Content-Type**”需要根据上传的视频文件类型进行设置，如下所示：视频文件：video/视频格式，如：“video/mp4”。
     * @return videoUploadUrl
     */
    public String getVideoUploadUrl() {
        return videoUploadUrl;
    }

    public void setVideoUploadUrl(String videoUploadUrl) {
        this.videoUploadUrl = videoUploadUrl;
    }

    public UpdateAssetResponse withCoverUploadUrl(String coverUploadUrl) {
        this.coverUploadUrl = coverUploadUrl;
        return this;
    }

    /**
     * 封面上传地址，用于上传封面文件。  > 您可以使用PUT请求向“**cover_upload_url**”中上传封面图片。其中，“**Content-Type**”需要根据上传的封面文件类型进行设置，如下所示：图片文件：image/图片格式，如：“image/png”。
     * @return coverUploadUrl
     */
    public String getCoverUploadUrl() {
        return coverUploadUrl;
    }

    public void setCoverUploadUrl(String coverUploadUrl) {
        this.coverUploadUrl = coverUploadUrl;
    }

    public UpdateAssetResponse withSubtitleUploadUrls(List<String> subtitleUploadUrls) {
        this.subtitleUploadUrls = subtitleUploadUrls;
        return this;
    }

    public UpdateAssetResponse addSubtitleUploadUrlsItem(String subtitleUploadUrlsItem) {
        if (this.subtitleUploadUrls == null) {
            this.subtitleUploadUrls = new ArrayList<>();
        }
        this.subtitleUploadUrls.add(subtitleUploadUrlsItem);
        return this;
    }

    public UpdateAssetResponse withSubtitleUploadUrls(Consumer<List<String>> subtitleUploadUrlsSetter) {
        if (this.subtitleUploadUrls == null) {
            this.subtitleUploadUrls = new ArrayList<>();
        }
        subtitleUploadUrlsSetter.accept(this.subtitleUploadUrls);
        return this;
    }

    /**
     * 字幕上传地址，用于上传字幕。  > 您可以使用PUT请求向“**subtitle_upload_urls**”中上传字幕文件。其中，“**Content-Type**”需要根据上传的字幕文件类型进行设置，如下所示：字幕文件：application/octet-stream。
     * @return subtitleUploadUrls
     */
    public List<String> getSubtitleUploadUrls() {
        return subtitleUploadUrls;
    }

    public void setSubtitleUploadUrls(List<String> subtitleUploadUrls) {
        this.subtitleUploadUrls = subtitleUploadUrls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAssetResponse that = (UpdateAssetResponse) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.videoUploadUrl, that.videoUploadUrl)
            && Objects.equals(this.coverUploadUrl, that.coverUploadUrl)
            && Objects.equals(this.subtitleUploadUrls, that.subtitleUploadUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, videoUploadUrl, coverUploadUrl, subtitleUploadUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAssetResponse {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    videoUploadUrl: ").append(toIndentedString(videoUploadUrl)).append("\n");
        sb.append("    coverUploadUrl: ").append(toIndentedString(coverUploadUrl)).append("\n");
        sb.append("    subtitleUploadUrls: ").append(toIndentedString(subtitleUploadUrls)).append("\n");
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
