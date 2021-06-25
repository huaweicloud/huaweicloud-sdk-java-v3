package com.huaweicloud.sdk.vod.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateAssetResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_id")
    
    private String assetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_upload_url")
    
    private String videoUploadUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cover_upload_url")
    
    private String coverUploadUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subtitle_upload_urls")
    
    private List<String> subtitleUploadUrls = null;
    
    public UpdateAssetResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    


    /**
     * 媒体ID<br/> 
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
     * 原始视频文件的下载url<br/> 
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
     * 封面文件（Cover0）的下载url<br/> 
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
        if(this.subtitleUploadUrls == null) {
            this.subtitleUploadUrls = new ArrayList<>();
        }
        this.subtitleUploadUrls.add(subtitleUploadUrlsItem);
        return this;
    }

    public UpdateAssetResponse withSubtitleUploadUrls(Consumer<List<String>> subtitleUploadUrlsSetter) {
        if(this.subtitleUploadUrls == null) {
            this.subtitleUploadUrls = new ArrayList<>();
        }
        subtitleUploadUrlsSetter.accept(this.subtitleUploadUrls);
        return this;
    }

    /**
     * 字幕文件上传url数组<br/> 
     * @return subtitleUploadUrls
     */
    public List<String> getSubtitleUploadUrls() {
        return subtitleUploadUrls;
    }

    public void setSubtitleUploadUrls(List<String> subtitleUploadUrls) {
        this.subtitleUploadUrls = subtitleUploadUrls;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAssetResponse updateAssetResponse = (UpdateAssetResponse) o;
        return Objects.equals(this.assetId, updateAssetResponse.assetId) &&
            Objects.equals(this.videoUploadUrl, updateAssetResponse.videoUploadUrl) &&
            Objects.equals(this.coverUploadUrl, updateAssetResponse.coverUploadUrl) &&
            Objects.equals(this.subtitleUploadUrls, updateAssetResponse.subtitleUploadUrls);
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

