package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 输出视频资产信息配置。
 */
public class OutputAssetConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_preview_video")

    private Boolean isPreviewVideo;

    public OutputAssetConfig withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 输出视频资产名称。
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public OutputAssetConfig withIsPreviewVideo(Boolean isPreviewVideo) {
        this.isPreviewVideo = isPreviewVideo;
        return this;
    }

    /**
     * 是否是预览视频。如果是预览视频不存资产库。 > * 分身数字人视频制作不支持预览。
     * @return isPreviewVideo
     */
    public Boolean getIsPreviewVideo() {
        return isPreviewVideo;
    }

    public void setIsPreviewVideo(Boolean isPreviewVideo) {
        this.isPreviewVideo = isPreviewVideo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OutputAssetConfig that = (OutputAssetConfig) obj;
        return Objects.equals(this.assetName, that.assetName)
            && Objects.equals(this.isPreviewVideo, that.isPreviewVideo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetName, isPreviewVideo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputAssetConfig {\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    isPreviewVideo: ").append(toIndentedString(isPreviewVideo)).append("\n");
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
