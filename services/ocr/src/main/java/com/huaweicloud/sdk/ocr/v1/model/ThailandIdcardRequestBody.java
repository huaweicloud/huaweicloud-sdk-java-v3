package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ThailandIdcardRequestBody */
public class ThailandIdcardRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "side")

    private String side;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_portrait_image")

    private Boolean returnPortraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_portrait_location")

    private Boolean returnPortraitLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_idcard_type")

    private Boolean returnIdcardType;

    public ThailandIdcardRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /** 与url二选一 图像数据，base64编码，要求base64编码后大小不超过10MB。图片最小边不小于15px，最长边不超过4096px，支持JPEG、JPG、PNG、BMP、TIFF格式。
     * 
     * @return image */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ThailandIdcardRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /** 与image二选一 图片的URL路径，目前支持： - 公网http/https url -
     * OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/intl/zh-cn/api-ocr/ocr_03_0132.html)。
     * > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ThailandIdcardRequestBody withSide(String side) {
        this.side = side;
        return this;
    }

    /** - front：身份证正面 - back：身份证背面 如果参数值为空或无该参数，系统自动识别，建议填写，准确率更高。
     * 
     * @return side */
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public ThailandIdcardRequestBody withReturnPortraitImage(Boolean returnPortraitImage) {
        this.returnPortraitImage = returnPortraitImage;
        return this;
    }

    /** 是否返回头像内容开关，可选值如下所示： - true：返回身份证头像照片的 base64 编码 - false：不返回身份证头像照片的 base64 编码 未传入该参数时默认为false，即不返回身份证头像照片的
     * base64 编码。
     * 
     * @return returnPortraitImage */
    public Boolean getReturnPortraitImage() {
        return returnPortraitImage;
    }

    public void setReturnPortraitImage(Boolean returnPortraitImage) {
        this.returnPortraitImage = returnPortraitImage;
    }

    public ThailandIdcardRequestBody withReturnPortraitLocation(Boolean returnPortraitLocation) {
        this.returnPortraitLocation = returnPortraitLocation;
        return this;
    }

    /** 是否返回头像坐标的开关，可选值如下所示： - true：返回身份证头像的位置 - false：不返回身份证头像的位置
     * 
     * @return returnPortraitLocation */
    public Boolean getReturnPortraitLocation() {
        return returnPortraitLocation;
    }

    public void setReturnPortraitLocation(Boolean returnPortraitLocation) {
        this.returnPortraitLocation = returnPortraitLocation;
    }

    public ThailandIdcardRequestBody withReturnIdcardType(Boolean returnIdcardType) {
        this.returnIdcardType = returnIdcardType;
        return this;
    }

    /** 是否返回身份证类型的开关，可选值如下所示： - true：返回身份证的类型，类型包括身份证原件以及身份证复印件 - false：不返回身份证的类型
     * 
     * @return returnIdcardType */
    public Boolean getReturnIdcardType() {
        return returnIdcardType;
    }

    public void setReturnIdcardType(Boolean returnIdcardType) {
        this.returnIdcardType = returnIdcardType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThailandIdcardRequestBody thailandIdcardRequestBody = (ThailandIdcardRequestBody) o;
        return Objects.equals(this.image, thailandIdcardRequestBody.image)
            && Objects.equals(this.url, thailandIdcardRequestBody.url)
            && Objects.equals(this.side, thailandIdcardRequestBody.side)
            && Objects.equals(this.returnPortraitImage, thailandIdcardRequestBody.returnPortraitImage)
            && Objects.equals(this.returnPortraitLocation, thailandIdcardRequestBody.returnPortraitLocation)
            && Objects.equals(this.returnIdcardType, thailandIdcardRequestBody.returnIdcardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, url, side, returnPortraitImage, returnPortraitLocation, returnIdcardType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThailandIdcardRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    returnPortraitImage: ").append(toIndentedString(returnPortraitImage)).append("\n");
        sb.append("    returnPortraitLocation: ").append(toIndentedString(returnPortraitLocation)).append("\n");
        sb.append("    returnIdcardType: ").append(toIndentedString(returnIdcardType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
