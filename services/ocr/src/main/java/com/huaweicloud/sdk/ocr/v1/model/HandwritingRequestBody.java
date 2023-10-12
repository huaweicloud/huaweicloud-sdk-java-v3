package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class HandwritingRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quick_mode")

    private Boolean quickMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "char_set")

    private String charSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_direction")

    private Boolean detectDirection;

    public HandwritingRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一  图像数据，base64编码，要求base64编码后大小不超过10MB。图片最小边不小于8px，最长边不超过8192px，支持JPEG、JPG、PNG、BMP、TIFF格式。  图片文件Base64编码字符串，点击[这里](https://support.huaweicloud.com/ocr_faq/ocr_01_0032.html)查看详细获取方式。   
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public HandwritingRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image二选一 图片的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 - url中不能存在中文字符，若存在，中文需要进行utf8编码。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HandwritingRequestBody withQuickMode(Boolean quickMode) {
        this.quickMode = quickMode;
        return this;
    }

    /**
     * 快速模式开关，针对单行文字图片（要求图片只包含一行文字，且文字区域占比超过50%），打开时可以更快返回识别内容。可选值包括： - true：打开快速模式； - false：关闭快速模式。  > 说明： - 未传入该参数时默认为false，即关闭快速模式 
     * @return quickMode
     */
    public Boolean getQuickMode() {
        return quickMode;
    }

    public void setQuickMode(Boolean quickMode) {
        this.quickMode = quickMode;
    }

    public HandwritingRequestBody withCharSet(String charSet) {
        this.charSet = charSet;
        return this;
    }

    /**
     * 字符集设置，用户可以根据实际需要限定输出字符集范围。可选值如下所示。  - \"digit\": 数字模式；  - \"letter\": 大小写字母模式；  - \"digit_letter\": 数字+字母模式；  - \"general\": 数字+字母+中文模式；  > 说明： - 未传入该参数时，默认为“general”模式。 
     * @return charSet
     */
    public String getCharSet() {
        return charSet;
    }

    public void setCharSet(String charSet) {
        this.charSet = charSet;
    }

    public HandwritingRequestBody withDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    /**
     * 校正图片的倾斜角度开关，可选值如下所示。 - true：校正图片的倾斜角度； - false：不校正图片的倾斜角度。  > 说明： - 支持任意角度的校正，未传入该参数时默认为“false”。 
     * @return detectDirection
     */
    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public void setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HandwritingRequestBody that = (HandwritingRequestBody) obj;
        return Objects.equals(this.image, that.image) && Objects.equals(this.url, that.url)
            && Objects.equals(this.quickMode, that.quickMode) && Objects.equals(this.charSet, that.charSet)
            && Objects.equals(this.detectDirection, that.detectDirection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, url, quickMode, charSet, detectDirection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HandwritingRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    quickMode: ").append(toIndentedString(quickMode)).append("\n");
        sb.append("    charSet: ").append(toIndentedString(charSet)).append("\n");
        sb.append("    detectDirection: ").append(toIndentedString(detectDirection)).append("\n");
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
