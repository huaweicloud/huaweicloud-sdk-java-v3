package com.huaweicloud.sdk.vod.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.FileAddr;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateAssetByFileUploadResponse extends SdkResponse {



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
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target")
    
    private FileAddr target;

    public CreateAssetByFileUploadResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    


    /**
     * 媒体ID 
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    

    public CreateAssetByFileUploadResponse withVideoUploadUrl(String videoUploadUrl) {
        this.videoUploadUrl = videoUploadUrl;
        return this;
    }

    


    /**
     * 视频上传URL 
     * @return videoUploadUrl
     */
    public String getVideoUploadUrl() {
        return videoUploadUrl;
    }

    public void setVideoUploadUrl(String videoUploadUrl) {
        this.videoUploadUrl = videoUploadUrl;
    }

    

    public CreateAssetByFileUploadResponse withCoverUploadUrl(String coverUploadUrl) {
        this.coverUploadUrl = coverUploadUrl;
        return this;
    }

    


    /**
     * 封面上传地址 
     * @return coverUploadUrl
     */
    public String getCoverUploadUrl() {
        return coverUploadUrl;
    }

    public void setCoverUploadUrl(String coverUploadUrl) {
        this.coverUploadUrl = coverUploadUrl;
    }

    

    public CreateAssetByFileUploadResponse withSubtitleUploadUrls(List<String> subtitleUploadUrls) {
        this.subtitleUploadUrls = subtitleUploadUrls;
        return this;
    }

    
    public CreateAssetByFileUploadResponse addSubtitleUploadUrlsItem(String subtitleUploadUrlsItem) {
        if(this.subtitleUploadUrls == null) {
            this.subtitleUploadUrls = new ArrayList<>();
        }
        this.subtitleUploadUrls.add(subtitleUploadUrlsItem);
        return this;
    }

    public CreateAssetByFileUploadResponse withSubtitleUploadUrls(Consumer<List<String>> subtitleUploadUrlsSetter) {
        if(this.subtitleUploadUrls == null) {
            this.subtitleUploadUrls = new ArrayList<>();
        }
        subtitleUploadUrlsSetter.accept(this.subtitleUploadUrls);
        return this;
    }

    /**
     * 字幕文件上传url数组 
     * @return subtitleUploadUrls
     */
    public List<String> getSubtitleUploadUrls() {
        return subtitleUploadUrls;
    }

    public void setSubtitleUploadUrls(List<String> subtitleUploadUrls) {
        this.subtitleUploadUrls = subtitleUploadUrls;
    }

    

    public CreateAssetByFileUploadResponse withTarget(FileAddr target) {
        this.target = target;
        return this;
    }

    public CreateAssetByFileUploadResponse withTarget(Consumer<FileAddr> targetSetter) {
        if(this.target == null ){
            this.target = new FileAddr();
            targetSetter.accept(this.target);
        }
        
        return this;
    }


    /**
     * Get target
     * @return target
     */
    public FileAddr getTarget() {
        return target;
    }

    public void setTarget(FileAddr target) {
        this.target = target;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAssetByFileUploadResponse createAssetByFileUploadResponse = (CreateAssetByFileUploadResponse) o;
        return Objects.equals(this.assetId, createAssetByFileUploadResponse.assetId) &&
            Objects.equals(this.videoUploadUrl, createAssetByFileUploadResponse.videoUploadUrl) &&
            Objects.equals(this.coverUploadUrl, createAssetByFileUploadResponse.coverUploadUrl) &&
            Objects.equals(this.subtitleUploadUrls, createAssetByFileUploadResponse.subtitleUploadUrls) &&
            Objects.equals(this.target, createAssetByFileUploadResponse.target);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assetId, videoUploadUrl, coverUploadUrl, subtitleUploadUrls, target);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssetByFileUploadResponse {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    videoUploadUrl: ").append(toIndentedString(videoUploadUrl)).append("\n");
        sb.append("    coverUploadUrl: ").append(toIndentedString(coverUploadUrl)).append("\n");
        sb.append("    subtitleUploadUrls: ").append(toIndentedString(subtitleUploadUrls)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

