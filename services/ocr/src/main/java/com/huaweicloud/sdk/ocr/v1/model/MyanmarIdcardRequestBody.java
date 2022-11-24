package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MyanmarIdcardRequestBody
 */
public class MyanmarIdcardRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "convert_unicode")

    private Boolean convertUnicode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_confidence")

    private Boolean returnConfidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_portrait_image")

    private Boolean returnPortraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_portrait_location")

    private Boolean returnPortraitLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_idcard_type")

    private Boolean returnIdcardType;

    public MyanmarIdcardRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一  图像数据，base64编码，要求base64编码后大小不超过10MB。图片最小边不小于15px，最长边不超过4096px，支持JPEG、JPG、PNG、BMP、TIFF格式。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public MyanmarIdcardRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image二选一 图片的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/intl/zh-cn/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MyanmarIdcardRequestBody withConvertUnicode(Boolean convertUnicode) {
        this.convertUnicode = convertUnicode;
        return this;
    }

    /**
     * - true：输出为unicode格式 - false：输出为zawgyi格式 如果参数值为空或无该参数，默认输出为zawgyi格式。 
     * @return convertUnicode
     */
    public Boolean getConvertUnicode() {
        return convertUnicode;
    }

    public void setConvertUnicode(Boolean convertUnicode) {
        this.convertUnicode = convertUnicode;
    }

    public MyanmarIdcardRequestBody withReturnConfidence(Boolean returnConfidence) {
        this.returnConfidence = returnConfidence;
        return this;
    }

    /**
     * 是否返回置信度的开关，可选值如下所示。 - true：返回置信度 - false：不返回置信度 如果无该参数，系统默认不返回置信度。如果输入参数不是Boolean类型，则会报非法参数错误。 
     * @return returnConfidence
     */
    public Boolean getReturnConfidence() {
        return returnConfidence;
    }

    public void setReturnConfidence(Boolean returnConfidence) {
        this.returnConfidence = returnConfidence;
    }

    public MyanmarIdcardRequestBody withReturnPortraitImage(Boolean returnPortraitImage) {
        this.returnPortraitImage = returnPortraitImage;
        return this;
    }

    /**
     * 是否返回头像内容开关，可选值如下所示： - true：返回身份证头像照片的 base64 编码 - false：不返回身份证头像照片的 base64 编码 
     * @return returnPortraitImage
     */
    public Boolean getReturnPortraitImage() {
        return returnPortraitImage;
    }

    public void setReturnPortraitImage(Boolean returnPortraitImage) {
        this.returnPortraitImage = returnPortraitImage;
    }

    public MyanmarIdcardRequestBody withReturnPortraitLocation(Boolean returnPortraitLocation) {
        this.returnPortraitLocation = returnPortraitLocation;
        return this;
    }

    /**
     * 是否返回头像坐标的开关，可选值如下所示： - true：返回身份证头像的位置 - false：不返回身份证头像的位置 
     * @return returnPortraitLocation
     */
    public Boolean getReturnPortraitLocation() {
        return returnPortraitLocation;
    }

    public void setReturnPortraitLocation(Boolean returnPortraitLocation) {
        this.returnPortraitLocation = returnPortraitLocation;
    }

    public MyanmarIdcardRequestBody withReturnIdcardType(Boolean returnIdcardType) {
        this.returnIdcardType = returnIdcardType;
        return this;
    }

    /**
     * 是否返回身份证类型的开关，可选值如下所示： - true：返回身份证的类型，类型包括身份证原件以及身份证复印件 - false：不返回身份证的类型 未传入该参数时默认为false，即不返回身份证头像照片的 base64 编码。 
     * @return returnIdcardType
     */
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
        MyanmarIdcardRequestBody myanmarIdcardRequestBody = (MyanmarIdcardRequestBody) o;
        return Objects.equals(this.image, myanmarIdcardRequestBody.image)
            && Objects.equals(this.url, myanmarIdcardRequestBody.url)
            && Objects.equals(this.convertUnicode, myanmarIdcardRequestBody.convertUnicode)
            && Objects.equals(this.returnConfidence, myanmarIdcardRequestBody.returnConfidence)
            && Objects.equals(this.returnPortraitImage, myanmarIdcardRequestBody.returnPortraitImage)
            && Objects.equals(this.returnPortraitLocation, myanmarIdcardRequestBody.returnPortraitLocation)
            && Objects.equals(this.returnIdcardType, myanmarIdcardRequestBody.returnIdcardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image,
            url,
            convertUnicode,
            returnConfidence,
            returnPortraitImage,
            returnPortraitLocation,
            returnIdcardType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MyanmarIdcardRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    convertUnicode: ").append(toIndentedString(convertUnicode)).append("\n");
        sb.append("    returnConfidence: ").append(toIndentedString(returnConfidence)).append("\n");
        sb.append("    returnPortraitImage: ").append(toIndentedString(returnPortraitImage)).append("\n");
        sb.append("    returnPortraitLocation: ").append(toIndentedString(returnPortraitLocation)).append("\n");
        sb.append("    returnIdcardType: ").append(toIndentedString(returnIdcardType)).append("\n");
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
