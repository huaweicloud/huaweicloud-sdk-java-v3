package com.huaweicloud.sdk.vod.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.BaseInfo;
import com.huaweicloud.sdk.vod.v1.model.ReviewInfo;
import com.huaweicloud.sdk.vod.v1.model.ThumbnailInfo;
import com.huaweicloud.sdk.vod.v1.model.TranscodeInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowAssetDetailResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_id")
    
    private String assetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="base_info")
    
    private BaseInfo baseInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="transcode_info")
    
    private TranscodeInfo transcodeInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="thumbnail_info")
    
    private ThumbnailInfo thumbnailInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="review_info")
    
    private ReviewInfo reviewInfo;

    public ShowAssetDetailResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    


    /**
     * 媒资ID
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    

    public ShowAssetDetailResponse withBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public ShowAssetDetailResponse withBaseInfo(Consumer<BaseInfo> baseInfoSetter) {
        if(this.baseInfo == null ){
            this.baseInfo = new BaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }
        
        return this;
    }


    /**
     * Get baseInfo
     * @return baseInfo
     */
    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    

    public ShowAssetDetailResponse withTranscodeInfo(TranscodeInfo transcodeInfo) {
        this.transcodeInfo = transcodeInfo;
        return this;
    }

    public ShowAssetDetailResponse withTranscodeInfo(Consumer<TranscodeInfo> transcodeInfoSetter) {
        if(this.transcodeInfo == null ){
            this.transcodeInfo = new TranscodeInfo();
            transcodeInfoSetter.accept(this.transcodeInfo);
        }
        
        return this;
    }


    /**
     * Get transcodeInfo
     * @return transcodeInfo
     */
    public TranscodeInfo getTranscodeInfo() {
        return transcodeInfo;
    }

    public void setTranscodeInfo(TranscodeInfo transcodeInfo) {
        this.transcodeInfo = transcodeInfo;
    }

    

    public ShowAssetDetailResponse withThumbnailInfo(ThumbnailInfo thumbnailInfo) {
        this.thumbnailInfo = thumbnailInfo;
        return this;
    }

    public ShowAssetDetailResponse withThumbnailInfo(Consumer<ThumbnailInfo> thumbnailInfoSetter) {
        if(this.thumbnailInfo == null ){
            this.thumbnailInfo = new ThumbnailInfo();
            thumbnailInfoSetter.accept(this.thumbnailInfo);
        }
        
        return this;
    }


    /**
     * Get thumbnailInfo
     * @return thumbnailInfo
     */
    public ThumbnailInfo getThumbnailInfo() {
        return thumbnailInfo;
    }

    public void setThumbnailInfo(ThumbnailInfo thumbnailInfo) {
        this.thumbnailInfo = thumbnailInfo;
    }

    

    public ShowAssetDetailResponse withReviewInfo(ReviewInfo reviewInfo) {
        this.reviewInfo = reviewInfo;
        return this;
    }

    public ShowAssetDetailResponse withReviewInfo(Consumer<ReviewInfo> reviewInfoSetter) {
        if(this.reviewInfo == null ){
            this.reviewInfo = new ReviewInfo();
            reviewInfoSetter.accept(this.reviewInfo);
        }
        
        return this;
    }


    /**
     * Get reviewInfo
     * @return reviewInfo
     */
    public ReviewInfo getReviewInfo() {
        return reviewInfo;
    }

    public void setReviewInfo(ReviewInfo reviewInfo) {
        this.reviewInfo = reviewInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAssetDetailResponse showAssetDetailResponse = (ShowAssetDetailResponse) o;
        return Objects.equals(this.assetId, showAssetDetailResponse.assetId) &&
            Objects.equals(this.baseInfo, showAssetDetailResponse.baseInfo) &&
            Objects.equals(this.transcodeInfo, showAssetDetailResponse.transcodeInfo) &&
            Objects.equals(this.thumbnailInfo, showAssetDetailResponse.thumbnailInfo) &&
            Objects.equals(this.reviewInfo, showAssetDetailResponse.reviewInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assetId, baseInfo, transcodeInfo, thumbnailInfo, reviewInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssetDetailResponse {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    transcodeInfo: ").append(toIndentedString(transcodeInfo)).append("\n");
        sb.append("    thumbnailInfo: ").append(toIndentedString(thumbnailInfo)).append("\n");
        sb.append("    reviewInfo: ").append(toIndentedString(reviewInfo)).append("\n");
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

