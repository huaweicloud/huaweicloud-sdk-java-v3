package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * MainlandTravelPermitRequestBody
 */
public class MainlandTravelPermitRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    @JacksonXmlProperty(localName = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    @JacksonXmlProperty(localName = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_portrait_image")

    @JacksonXmlProperty(localName = "return_portrait_image")

    private Boolean returnPortraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_portrait_location")

    @JacksonXmlProperty(localName = "return_portrait_location")

    private Boolean returnPortraitLocation;

    public MainlandTravelPermitRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一。 图像数据，base64编码，图片尺寸不小于15×15像素，最长边不超过8192像素，支持JPG/PNG/BMP/TIFF格式。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public MainlandTravelPermitRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image二选一。  图片的url路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/intl/en-us/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MainlandTravelPermitRequestBody withReturnPortraitImage(Boolean returnPortraitImage) {
        this.returnPortraitImage = returnPortraitImage;
        return this;
    }

    /**
     * 是否返回头像内容开关，可选值如下所示： - true: 返回身份证头像照片的 base64 编码 - false: 不返回身份证头像照片的 base64 编码 未传入该参数时默认为“false”，即不返回身份证头像照片的 base64 编码。 
     * @return returnPortraitImage
     */
    public Boolean getReturnPortraitImage() {
        return returnPortraitImage;
    }

    public void setReturnPortraitImage(Boolean returnPortraitImage) {
        this.returnPortraitImage = returnPortraitImage;
    }

    public MainlandTravelPermitRequestBody withReturnPortraitLocation(Boolean returnPortraitLocation) {
        this.returnPortraitLocation = returnPortraitLocation;
        return this;
    }

    /**
     * 是否返回头像坐标的开关，可选值如下所示： - true: 返回身份证头像的位置坐标 - false: 不返回身份证头像的位置坐标 未传入该参数时默认为“false”，即不返回身份证的头像坐标。 
     * @return returnPortraitLocation
     */
    public Boolean getReturnPortraitLocation() {
        return returnPortraitLocation;
    }

    public void setReturnPortraitLocation(Boolean returnPortraitLocation) {
        this.returnPortraitLocation = returnPortraitLocation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MainlandTravelPermitRequestBody mainlandTravelPermitRequestBody = (MainlandTravelPermitRequestBody) o;
        return Objects.equals(this.image, mainlandTravelPermitRequestBody.image)
            && Objects.equals(this.url, mainlandTravelPermitRequestBody.url)
            && Objects.equals(this.returnPortraitImage, mainlandTravelPermitRequestBody.returnPortraitImage)
            && Objects.equals(this.returnPortraitLocation, mainlandTravelPermitRequestBody.returnPortraitLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, url, returnPortraitImage, returnPortraitLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MainlandTravelPermitRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    returnPortraitImage: ").append(toIndentedString(returnPortraitImage)).append("\n");
        sb.append("    returnPortraitLocation: ").append(toIndentedString(returnPortraitLocation)).append("\n");
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
