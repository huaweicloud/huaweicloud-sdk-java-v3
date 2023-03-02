package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This is a auto crerate Body Object
 */
public class ImageWisedesignCropReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_base64")

    private String imageBase64;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    public ImageWisedesignCropReq withImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }

    /**
     * 图像数据，base64编码，要求base64编码最长边最大4000px，支持JPG/PNG/BMP/JPEG格式
     * @return imageBase64
     */
    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public ImageWisedesignCropReq withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 与image_base64二选一  图片的URL路径，目前支持：   - >-   公网HTTP/HTTPS URL   - >-   华为云OBS提供的URL，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权。详请参见[[配置OBS服务的访问权限](https://support.huaweicloud.com/api-moderation/moderation_03_0020.html)](tag:hc)[[配置OBS服务的访问权限](https://support.huaweicloud.com/intl/zh-cn/api-moderation/moderation_03_0020.html)](tag:hk)。   > - >-   接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。  > - >-   请保证被检测图片所在的存储服务稳定可靠，建议您使用华为云OBS存储。  > - >-   lmage不支持跨区域OBS，OBS的区域需要和服务保持一致。 
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageWisedesignCropReq imageWisedesignCropReq = (ImageWisedesignCropReq) o;
        return Objects.equals(this.imageBase64, imageWisedesignCropReq.imageBase64)
            && Objects.equals(this.imageUrl, imageWisedesignCropReq.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageBase64, imageUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageWisedesignCropReq {\n");
        sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
