package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 背景图层元素的详情，即id为0时填写
 */
public class ImageWisedesignCombineBodyBackgroundattrs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backgroundtype")

    private String backgroundtype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public ImageWisedesignCombineBodyBackgroundattrs withBackgroundtype(String backgroundtype) {
        this.backgroundtype = backgroundtype;
        return this;
    }

    /**
     * 背景类型：color-颜色，image-背景图，transparent-透明，默认为transparent-透明
     * @return backgroundtype
     */
    public String getBackgroundtype() {
        return backgroundtype;
    }

    public void setBackgroundtype(String backgroundtype) {
        this.backgroundtype = backgroundtype;
    }

    public ImageWisedesignCombineBodyBackgroundattrs withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * RGB值 如#FFFFFF为白色
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ImageWisedesignCombineBodyBackgroundattrs withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 背景内容，base64编码，要求base64编码最长边最大3000px，支持JPG/PNG/BMP/JPEG格式
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ImageWisedesignCombineBodyBackgroundattrs withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image二选一  图片的URL路径，目前支持：  - 公网HTTP/HTTPS URL  - 华为云OBS提供的URL，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权。详请参见[[配置OBS服务的访问权限](https://support.huaweicloud.com/api-moderation/moderation_03_0020.html)](tag:hc)[[配置OBS服务的访问权限](https://support.huaweicloud.com/intl/zh-cn/api-moderation/moderation_03_0020.html)](tag:hk)。  > - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 > - 请保证被检测图片所在的存储服务稳定可靠，建议您使用华为云OBS存储。 > - lmage不支持跨区域OBS，OBS的区域需要和服务保持一致。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageWisedesignCombineBodyBackgroundattrs imageWisedesignCombineBodyBackgroundattrs =
            (ImageWisedesignCombineBodyBackgroundattrs) o;
        return Objects.equals(this.backgroundtype, imageWisedesignCombineBodyBackgroundattrs.backgroundtype)
            && Objects.equals(this.color, imageWisedesignCombineBodyBackgroundattrs.color)
            && Objects.equals(this.image, imageWisedesignCombineBodyBackgroundattrs.image)
            && Objects.equals(this.url, imageWisedesignCombineBodyBackgroundattrs.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backgroundtype, color, image, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageWisedesignCombineBodyBackgroundattrs {\n");
        sb.append("    backgroundtype: ").append(toIndentedString(backgroundtype)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
