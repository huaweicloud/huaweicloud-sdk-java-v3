package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class TransportationLicenseRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_image_location")

    private Boolean returnImageLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_adjusted_image")

    private Boolean returnAdjustedImage;

    public TransportationLicenseRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一。  图片的Base64编码，要求单个图片其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图片最小边不小于15px，最长边不超过4096px，支持JPEG、JPG、PNG、BMP、TIFF格式。  图片文件Base64编码字符串，点击[这里](https://support.huaweicloud.com/ocr_faq/ocr_01_0032.html)查看详细获取方式。   
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public TransportationLicenseRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image二选一。  单个图片其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图片最小边不小于15px，最长边不超过4096px，支持JPEG、JPG、PNG、BMP、TIFF格式。 图片的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 - url中不能存在中文字符，若存在，中文需要进行utf8编码。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TransportationLicenseRequestBody withReturnImageLocation(Boolean returnImageLocation) {
        this.returnImageLocation = returnImageLocation;
        return this;
    }

    /**
     * 返回道路运输证在原图中的坐标位置的开关，默认false，取值范围包括：  - true: 开启返回坐标位置的功能。 - false: 关闭返回坐标位置的功能。 
     * @return returnImageLocation
     */
    public Boolean getReturnImageLocation() {
        return returnImageLocation;
    }

    public void setReturnImageLocation(Boolean returnImageLocation) {
        this.returnImageLocation = returnImageLocation;
    }

    public TransportationLicenseRequestBody withReturnAdjustedImage(Boolean returnAdjustedImage) {
        this.returnAdjustedImage = returnAdjustedImage;
        return this;
    }

    /**
     * 返回道路运输证（base64）的开关，默认false，取值范围包括：  - true: 开启道路运输证（base64）的功能。 - false: 关闭道路运输证（base64）的功能。 
     * @return returnAdjustedImage
     */
    public Boolean getReturnAdjustedImage() {
        return returnAdjustedImage;
    }

    public void setReturnAdjustedImage(Boolean returnAdjustedImage) {
        this.returnAdjustedImage = returnAdjustedImage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransportationLicenseRequestBody that = (TransportationLicenseRequestBody) obj;
        return Objects.equals(this.image, that.image) && Objects.equals(this.url, that.url)
            && Objects.equals(this.returnImageLocation, that.returnImageLocation)
            && Objects.equals(this.returnAdjustedImage, that.returnAdjustedImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, url, returnImageLocation, returnAdjustedImage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransportationLicenseRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    returnImageLocation: ").append(toIndentedString(returnImageLocation)).append("\n");
        sb.append("    returnAdjustedImage: ").append(toIndentedString(returnAdjustedImage)).append("\n");
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
