package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class IdCardRequestBody {

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
    @JsonProperty(value = "return_verification")

    private Boolean returnVerification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_text_location")

    private Boolean returnTextLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_reproduce")

    private Boolean detectReproduce;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_copy")

    private Boolean detectCopy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_portrait_location")

    private Boolean returnPortraitLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_portrait_image")

    private Boolean returnPortraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_adjusted_image")

    private Boolean returnAdjustedImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_tampering")

    private Boolean detectTampering;

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
    @JsonProperty(value = "detect_interim")

    private Boolean detectInterim;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_glare")

    private Boolean detectGlare;

    public IdCardRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一。  图片的Base64编码，要求单个图片其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图片最小边不小于15px，最长边不超过8192px。支持JPEG、JPG、PNG、BMP、TIFF格式。  图片文件Base64编码字符串，点击[这里](https://support.huaweicloud.com/ocr_faq/ocr_01_0032.html)查看详细获取方式。   
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public IdCardRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image二选一。  单个图片其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图片最小边不小于15px，最长边不超过8192px。支持JPEG、JPG、PNG、BMP、TIFF格式。 图片的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 - url中不能存在中文字符，若存在，中文需要进行utf8编码。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public IdCardRequestBody withSide(String side) {
        this.side = side;
        return this;
    }

    /**
     *  - front：身份证人像面。 - back：身份证国徽面。 - double_side：身份证双面信息 > 说明： 如果参数值为空或无该参数，系统自动识别，建议填写，准确率更高。 
     * @return side
     */
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public IdCardRequestBody withReturnVerification(Boolean returnVerification) {
        this.returnVerification = returnVerification;
        return this;
    }

    /**
     * 返回校验身份证号等信息的开关，默认false，可选值如下所示：  - true：返回校验信息  - false：不返回校验信息 
     * @return returnVerification
     */
    public Boolean getReturnVerification() {
        return returnVerification;
    }

    public void setReturnVerification(Boolean returnVerification) {
        this.returnVerification = returnVerification;
    }

    public IdCardRequestBody withReturnTextLocation(Boolean returnTextLocation) {
        this.returnTextLocation = returnTextLocation;
        return this;
    }

    /**
     * 识别到的文字块的区域位置信息。可选值包括：  - true：返回各个文字块区域  - false：不返回各个文字块区域  如果无该参数，系统默认不返回文字块区域。如果输入参数不是Boolean类型，则会报非法参数错误。 
     * @return returnTextLocation
     */
    public Boolean getReturnTextLocation() {
        return returnTextLocation;
    }

    public void setReturnTextLocation(Boolean returnTextLocation) {
        this.returnTextLocation = returnTextLocation;
    }

    public IdCardRequestBody withDetectReproduce(Boolean detectReproduce) {
        this.detectReproduce = detectReproduce;
        return this;
    }

    /**
     * 返回判断身份证图像是否经过翻拍的开关，默认false，可选值如下所示：  - true ：开启判断身份证图像是否经过翻拍功能  - false：关闭判断身份证图像是否经过翻拍功能 
     * @return detectReproduce
     */
    public Boolean getDetectReproduce() {
        return detectReproduce;
    }

    public void setDetectReproduce(Boolean detectReproduce) {
        this.detectReproduce = detectReproduce;
    }

    public IdCardRequestBody withDetectCopy(Boolean detectCopy) {
        this.detectCopy = detectCopy;
        return this;
    }

    /**
     * 返回判断身份证图像是否是黑白复印件的开关，默认false，可选值如下所示：  - true ：开启判断身份证图像是否是复印件功能  - false : 关闭身份证图像是否是复印件功能 
     * @return detectCopy
     */
    public Boolean getDetectCopy() {
        return detectCopy;
    }

    public void setDetectCopy(Boolean detectCopy) {
        this.detectCopy = detectCopy;
    }

    public IdCardRequestBody withReturnPortraitLocation(Boolean returnPortraitLocation) {
        this.returnPortraitLocation = returnPortraitLocation;
        return this;
    }

    /**
     * 返回头像位置信息的开关，默认false，可选值如下所示：  - true ：开启返回头像位置信息的功能 - false : 关闭返回头像位置信息的功能 
     * @return returnPortraitLocation
     */
    public Boolean getReturnPortraitLocation() {
        return returnPortraitLocation;
    }

    public void setReturnPortraitLocation(Boolean returnPortraitLocation) {
        this.returnPortraitLocation = returnPortraitLocation;
    }

    public IdCardRequestBody withReturnPortraitImage(Boolean returnPortraitImage) {
        this.returnPortraitImage = returnPortraitImage;
        return this;
    }

    /**
     * 返回头像图片信息（base64码）的开关，默认false，可选值如下所示：  - true ：开启头像图片信息（base64码）的功能 - false : 关闭头像图片信息（base64码）的功能 
     * @return returnPortraitImage
     */
    public Boolean getReturnPortraitImage() {
        return returnPortraitImage;
    }

    public void setReturnPortraitImage(Boolean returnPortraitImage) {
        this.returnPortraitImage = returnPortraitImage;
    }

    public IdCardRequestBody withReturnAdjustedImage(Boolean returnAdjustedImage) {
        this.returnAdjustedImage = returnAdjustedImage;
        return this;
    }

    /**
     * 返回身份证卡面（base64码）的开关，默认false，可选值如下所示：  - true ：开启身份证卡面（base64码）的功能 - false : 关闭身份证卡面（base64码）的功能 
     * @return returnAdjustedImage
     */
    public Boolean getReturnAdjustedImage() {
        return returnAdjustedImage;
    }

    public void setReturnAdjustedImage(Boolean returnAdjustedImage) {
        this.returnAdjustedImage = returnAdjustedImage;
    }

    public IdCardRequestBody withDetectTampering(Boolean detectTampering) {
        this.detectTampering = detectTampering;
        return this;
    }

    /**
     * 身份证图像PS告警功能开关，默认false，可选值如下：  - true ：开启身份证图像PS告警功能 - false : 关闭身份证图像告警功能 
     * @return detectTampering
     */
    public Boolean getDetectTampering() {
        return detectTampering;
    }

    public void setDetectTampering(Boolean detectTampering) {
        this.detectTampering = detectTampering;
    }

    public IdCardRequestBody withDetectBorderIntegrity(Boolean detectBorderIntegrity) {
        this.detectBorderIntegrity = detectBorderIntegrity;
        return this;
    }

    /**
     * 身份证图像边框完整性告警功能开关，默认false，可选值如下：  - true ：打开身份证图像边框完整性告警功能 - false : 关闭身份证图像边框完整性告警功能 
     * @return detectBorderIntegrity
     */
    public Boolean getDetectBorderIntegrity() {
        return detectBorderIntegrity;
    }

    public void setDetectBorderIntegrity(Boolean detectBorderIntegrity) {
        this.detectBorderIntegrity = detectBorderIntegrity;
    }

    public IdCardRequestBody withDetectBlockingWithinBorder(Boolean detectBlockingWithinBorder) {
        this.detectBlockingWithinBorder = detectBlockingWithinBorder;
        return this;
    }

    /**
     * 身份证图像边框内部是否有异物遮挡的告警功能开关，默认false，可选值如下：  - true ：开启身份证边框内部异物遮挡告警功能 - false : 关闭身份证边框内部异物遮挡告警功能 
     * @return detectBlockingWithinBorder
     */
    public Boolean getDetectBlockingWithinBorder() {
        return detectBlockingWithinBorder;
    }

    public void setDetectBlockingWithinBorder(Boolean detectBlockingWithinBorder) {
        this.detectBlockingWithinBorder = detectBlockingWithinBorder;
    }

    public IdCardRequestBody withDetectBlur(Boolean detectBlur) {
        this.detectBlur = detectBlur;
        return this;
    }

    /**
     * 身份证图像模糊告警功能的开关，默认false，可选值如下：  - true ：开启身份证图像模糊告警功能 - false : 关闭身份证图像模糊告警功能 
     * @return detectBlur
     */
    public Boolean getDetectBlur() {
        return detectBlur;
    }

    public void setDetectBlur(Boolean detectBlur) {
        this.detectBlur = detectBlur;
    }

    public IdCardRequestBody withDetectInterim(Boolean detectInterim) {
        this.detectInterim = detectInterim;
        return this;
    }

    /**
     * 临时身份证告警功能开关，默认false，可选值如下：  - true ：开启临时身份证告警功能 - false : 关闭临时身份证告警功能 
     * @return detectInterim
     */
    public Boolean getDetectInterim() {
        return detectInterim;
    }

    public void setDetectInterim(Boolean detectInterim) {
        this.detectInterim = detectInterim;
    }

    public IdCardRequestBody withDetectGlare(Boolean detectGlare) {
        this.detectGlare = detectGlare;
        return this;
    }

    /**
     * 身份证反光告警功能开关，默认false，可选值如下：  - true ：开启身份证反光告警功能  - false : 关闭身份证反光告警功能 
     * @return detectGlare
     */
    public Boolean getDetectGlare() {
        return detectGlare;
    }

    public void setDetectGlare(Boolean detectGlare) {
        this.detectGlare = detectGlare;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdCardRequestBody that = (IdCardRequestBody) obj;
        return Objects.equals(this.image, that.image) && Objects.equals(this.url, that.url)
            && Objects.equals(this.side, that.side) && Objects.equals(this.returnVerification, that.returnVerification)
            && Objects.equals(this.returnTextLocation, that.returnTextLocation)
            && Objects.equals(this.detectReproduce, that.detectReproduce)
            && Objects.equals(this.detectCopy, that.detectCopy)
            && Objects.equals(this.returnPortraitLocation, that.returnPortraitLocation)
            && Objects.equals(this.returnPortraitImage, that.returnPortraitImage)
            && Objects.equals(this.returnAdjustedImage, that.returnAdjustedImage)
            && Objects.equals(this.detectTampering, that.detectTampering)
            && Objects.equals(this.detectBorderIntegrity, that.detectBorderIntegrity)
            && Objects.equals(this.detectBlockingWithinBorder, that.detectBlockingWithinBorder)
            && Objects.equals(this.detectBlur, that.detectBlur)
            && Objects.equals(this.detectInterim, that.detectInterim)
            && Objects.equals(this.detectGlare, that.detectGlare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image,
            url,
            side,
            returnVerification,
            returnTextLocation,
            detectReproduce,
            detectCopy,
            returnPortraitLocation,
            returnPortraitImage,
            returnAdjustedImage,
            detectTampering,
            detectBorderIntegrity,
            detectBlockingWithinBorder,
            detectBlur,
            detectInterim,
            detectGlare);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdCardRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    returnVerification: ").append(toIndentedString(returnVerification)).append("\n");
        sb.append("    returnTextLocation: ").append(toIndentedString(returnTextLocation)).append("\n");
        sb.append("    detectReproduce: ").append(toIndentedString(detectReproduce)).append("\n");
        sb.append("    detectCopy: ").append(toIndentedString(detectCopy)).append("\n");
        sb.append("    returnPortraitLocation: ").append(toIndentedString(returnPortraitLocation)).append("\n");
        sb.append("    returnPortraitImage: ").append(toIndentedString(returnPortraitImage)).append("\n");
        sb.append("    returnAdjustedImage: ").append(toIndentedString(returnAdjustedImage)).append("\n");
        sb.append("    detectTampering: ").append(toIndentedString(detectTampering)).append("\n");
        sb.append("    detectBorderIntegrity: ").append(toIndentedString(detectBorderIntegrity)).append("\n");
        sb.append("    detectBlockingWithinBorder: ").append(toIndentedString(detectBlockingWithinBorder)).append("\n");
        sb.append("    detectBlur: ").append(toIndentedString(detectBlur)).append("\n");
        sb.append("    detectInterim: ").append(toIndentedString(detectInterim)).append("\n");
        sb.append("    detectGlare: ").append(toIndentedString(detectGlare)).append("\n");
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
