package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CambodianIdCardRequestBody
 */
public class CambodianIdCardRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_portrait_image")

    private Boolean returnPortraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_portrait_location")

    private Boolean returnPortraitLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_idcard_type")

    private Boolean returnIdcardType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_border_integrity")

    private Boolean detectBorderIntegrity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_blocking_within_border")

    private Boolean detectBlockingWithinBorder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_blur")

    private Boolean detectBlur;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_glare")

    private Boolean detectGlare;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_adjusted_image")

    private Boolean returnAdjustedImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_tampering")

    private Boolean detectTampering;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_reproduce")

    private Boolean detectReproduce;

    public CambodianIdCardRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一。图像数据，base64编码。图片尺寸不小于15像素，最长边不超过8192像素，支持JPG/PNG/BMP/TIF格式。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CambodianIdCardRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image二选一。  要求图片Base64编码后大小不超过10MB。 图片尺寸不小于15像素，最长边不超过8192像素，支持JPG/PNG/BMP/TIF格式。 图片的url路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/intl/zh-cn/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 - url中不能存在中文字符，若存在，中文需要进行utf8编码。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CambodianIdCardRequestBody withReturnPortraitImage(Boolean returnPortraitImage) {
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

    public CambodianIdCardRequestBody withReturnPortraitLocation(Boolean returnPortraitLocation) {
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

    public CambodianIdCardRequestBody withReturnIdcardType(Boolean returnIdcardType) {
        this.returnIdcardType = returnIdcardType;
        return this;
    }

    /**
     * 是否返回身份证类型的开关，可选值如下所示： - true:返回身份证的类型，类型包括身份证原件以及身份证复印件 - false：不返回身份证的类型 
     * @return returnIdcardType
     */
    public Boolean getReturnIdcardType() {
        return returnIdcardType;
    }

    public void setReturnIdcardType(Boolean returnIdcardType) {
        this.returnIdcardType = returnIdcardType;
    }

    public CambodianIdCardRequestBody withDetectBorderIntegrity(Boolean detectBorderIntegrity) {
        this.detectBorderIntegrity = detectBorderIntegrity;
        return this;
    }

    /**
     * 返回身份证边框完整性的告警结果的开关，可选值如下所示 - true：打开身份证图像边框完整性告警功能  - false：关闭身份证图像边框完整性告警功能 
     * @return detectBorderIntegrity
     */
    public Boolean getDetectBorderIntegrity() {
        return detectBorderIntegrity;
    }

    public void setDetectBorderIntegrity(Boolean detectBorderIntegrity) {
        this.detectBorderIntegrity = detectBorderIntegrity;
    }

    public CambodianIdCardRequestBody withDetectBlockingWithinBorder(Boolean detectBlockingWithinBorder) {
        this.detectBlockingWithinBorder = detectBlockingWithinBorder;
        return this;
    }

    /**
     * 返回身份证内部是否有被遮挡的告警结果的开关，可选值如下所示 - true：打开身份证内部是否有被遮挡的告警功能  - false：关闭身份证内部是否有被遮挡的告警功能 
     * @return detectBlockingWithinBorder
     */
    public Boolean getDetectBlockingWithinBorder() {
        return detectBlockingWithinBorder;
    }

    public void setDetectBlockingWithinBorder(Boolean detectBlockingWithinBorder) {
        this.detectBlockingWithinBorder = detectBlockingWithinBorder;
    }

    public CambodianIdCardRequestBody withDetectBlur(Boolean detectBlur) {
        this.detectBlur = detectBlur;
        return this;
    }

    /**
     * 返回身份证模糊告警结果的开关，可选值如下所示 - true:打开身份证是否模糊的告警功能 - false：关闭身份证是否模糊的告警功能 
     * @return detectBlur
     */
    public Boolean getDetectBlur() {
        return detectBlur;
    }

    public void setDetectBlur(Boolean detectBlur) {
        this.detectBlur = detectBlur;
    }

    public CambodianIdCardRequestBody withDetectGlare(Boolean detectGlare) {
        this.detectGlare = detectGlare;
        return this;
    }

    /**
     * 返回身份证是否反光的告警结果的开关，可选值如下所示 - true：打开身份证是否反光的告警功能  - false：关闭身份证是否反光的告警功能 
     * @return detectGlare
     */
    public Boolean getDetectGlare() {
        return detectGlare;
    }

    public void setDetectGlare(Boolean detectGlare) {
        this.detectGlare = detectGlare;
    }

    public CambodianIdCardRequestBody withReturnAdjustedImage(Boolean returnAdjustedImage) {
        this.returnAdjustedImage = returnAdjustedImage;
        return this;
    }

    /**
     * 返回身份证四点原图的base64编码 - true: 返回身份证原图的base64编码  - false：不返回身份证原图的base64编码 
     * @return returnAdjustedImage
     */
    public Boolean getReturnAdjustedImage() {
        return returnAdjustedImage;
    }

    public void setReturnAdjustedImage(Boolean returnAdjustedImage) {
        this.returnAdjustedImage = returnAdjustedImage;
    }

    public CambodianIdCardRequestBody withDetectTampering(Boolean detectTampering) {
        this.detectTampering = detectTampering;
        return this;
    }

    /**
     * 返回身份证人像是否被篡改的告警结果的开关，可选值如下所示 - true:  打开身份证人像是否被篡改的告警功能  - false：关闭身份证人像被篡改的告警功能 不支持精细化的P图 
     * @return detectTampering
     */
    public Boolean getDetectTampering() {
        return detectTampering;
    }

    public void setDetectTampering(Boolean detectTampering) {
        this.detectTampering = detectTampering;
    }

    public CambodianIdCardRequestBody withDetectReproduce(Boolean detectReproduce) {
        this.detectReproduce = detectReproduce;
        return this;
    }

    /**
     * 返回判断身份证图像是否经过翻拍告警的开关，可选值如下所示 - true:打开判断身份证图像是否经过翻拍告警的功能  - false:关闭判断身份证图像是否经过翻拍告警的功能 
     * @return detectReproduce
     */
    public Boolean getDetectReproduce() {
        return detectReproduce;
    }

    public void setDetectReproduce(Boolean detectReproduce) {
        this.detectReproduce = detectReproduce;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CambodianIdCardRequestBody that = (CambodianIdCardRequestBody) obj;
        return Objects.equals(this.image, that.image) && Objects.equals(this.url, that.url)
            && Objects.equals(this.returnPortraitImage, that.returnPortraitImage)
            && Objects.equals(this.returnPortraitLocation, that.returnPortraitLocation)
            && Objects.equals(this.returnIdcardType, that.returnIdcardType)
            && Objects.equals(this.detectBorderIntegrity, that.detectBorderIntegrity)
            && Objects.equals(this.detectBlockingWithinBorder, that.detectBlockingWithinBorder)
            && Objects.equals(this.detectBlur, that.detectBlur) && Objects.equals(this.detectGlare, that.detectGlare)
            && Objects.equals(this.returnAdjustedImage, that.returnAdjustedImage)
            && Objects.equals(this.detectTampering, that.detectTampering)
            && Objects.equals(this.detectReproduce, that.detectReproduce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image,
            url,
            returnPortraitImage,
            returnPortraitLocation,
            returnIdcardType,
            detectBorderIntegrity,
            detectBlockingWithinBorder,
            detectBlur,
            detectGlare,
            returnAdjustedImage,
            detectTampering,
            detectReproduce);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CambodianIdCardRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    returnPortraitImage: ").append(toIndentedString(returnPortraitImage)).append("\n");
        sb.append("    returnPortraitLocation: ").append(toIndentedString(returnPortraitLocation)).append("\n");
        sb.append("    returnIdcardType: ").append(toIndentedString(returnIdcardType)).append("\n");
        sb.append("    detectBorderIntegrity: ").append(toIndentedString(detectBorderIntegrity)).append("\n");
        sb.append("    detectBlockingWithinBorder: ").append(toIndentedString(detectBlockingWithinBorder)).append("\n");
        sb.append("    detectBlur: ").append(toIndentedString(detectBlur)).append("\n");
        sb.append("    detectGlare: ").append(toIndentedString(detectGlare)).append("\n");
        sb.append("    returnAdjustedImage: ").append(toIndentedString(returnAdjustedImage)).append("\n");
        sb.append("    detectTampering: ").append(toIndentedString(detectTampering)).append("\n");
        sb.append("    detectReproduce: ").append(toIndentedString(detectReproduce)).append("\n");
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
