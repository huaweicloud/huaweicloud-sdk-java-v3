package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This is a auto crerate Body Object
 */
public class ImageSuperResolutionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale")

    private Integer scale;

    public ImageSuperResolutionReq withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 图像数据，base64编码，输入图像范围200px ~ 1080px，支持JPG/PNG/BMP/JPEG/WEBP格式
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ImageSuperResolutionReq withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image_base64二选一  图片的URL路径，目前支持：  - 公网HTTP/HTTPS URL  - 华为云OBS提供的URL，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权。详请参见[[配置OBS服务的访问权限](https://support.huaweicloud.com/api-moderation/moderation_03_0020.html)](tag:hc)[[配置OBS服务的访问权限](https://support.huaweicloud.com/intl/zh-cn/api-moderation/moderation_03_0020.html)](tag:hk)。  > - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 > - 请保证被检测图片所在的存储服务稳定可靠，建议您使用华为云OBS存储。 > - lmage不支持跨区域OBS，OBS的区域需要和服务保持一致。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageSuperResolutionReq withScale(Integer scale) {
        this.scale = scale;
        return this;
    }

    /**
     * 图片放大倍数，目前支持2、3、4，默认为2
     * @return scale
     */
    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageSuperResolutionReq imageSuperResolutionReq = (ImageSuperResolutionReq) o;
        return Objects.equals(this.image, imageSuperResolutionReq.image)
            && Objects.equals(this.url, imageSuperResolutionReq.url)
            && Objects.equals(this.scale, imageSuperResolutionReq.scale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, url, scale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageSuperResolutionReq {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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
