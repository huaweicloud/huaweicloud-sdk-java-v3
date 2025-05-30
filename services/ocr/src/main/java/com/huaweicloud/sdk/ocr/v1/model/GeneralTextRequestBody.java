package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class GeneralTextRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_direction")

    private Boolean detectDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quick_mode")

    private Boolean quickMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "character_mode")

    private Boolean characterMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_orientation_mode")

    private Boolean singleOrientationMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pdf_page_number")

    private Integer pdfPageNumber;

    public GeneralTextRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一。  图片的Base64编码，要求单个图片、PDF文件其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图片最小边不小于15px，最长边不超过30000px。图片分辨率不能大于1.6亿px。 支持JPEG、JPG、PNG、BMP、GIF、TIFF、WEBP、PCX、ICO、PSD、PDF格式。  图片文件Base64编码字符串，[点击[这里](https://support.huaweicloud.com/ocr_faq/ocr_01_0032.html)](tag:hc)[点击[这里](https://support.huaweicloud.com/intl/zh-cn/ocr_faq/ocr_01_0032.html)](tag:hk)查看详细获取方式。     
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public GeneralTextRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image二选一。  单个图片、PDF文件其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图片最小边不小于15px，最长边不超过30000px。图片分辨率不能大于1.6亿px。 支持JPEG、JPG、PNG、BMP、GIF、TIFF、WEBP、PCX、ICO、PSD、PDF格式。 图片的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，[详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。](tag:hc)[详情参见[配置OBS访问权限](https://support.huaweicloud.com/intl/zh-cn/api-ocr/ocr_03_0132.html)。](tag:hk)  > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 - url中不能存在中文字符，若存在，中文需要进行utf8编码。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GeneralTextRequestBody withDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    /**
     * 图片朝向检测开关，可选值包括： - true：打开检测图片朝向功能。 - false：关闭检测图片朝向功能。  > 说明： - 支持任意角度的图片朝向检测。未传入该参数时默认为false，即不检测图片朝向。 
     * @return detectDirection
     */
    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public void setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
    }

    public GeneralTextRequestBody withQuickMode(Boolean quickMode) {
        this.quickMode = quickMode;
        return this;
    }

    /**
     * 快速模式开关，针对单行文字图片（要求图片只包含一行文字，且文字区域占比超过50%），打开时可以更快返回识别。可选值包括： - true：打开快速识别模式。 - false：关闭快速识别模式。  > 说明： - 未传入该参数时默认为false，即关闭快速模式。 
     * @return quickMode
     */
    public Boolean getQuickMode() {
        return quickMode;
    }

    public void setQuickMode(Boolean quickMode) {
        this.quickMode = quickMode;
    }

    public GeneralTextRequestBody withCharacterMode(Boolean characterMode) {
        this.characterMode = characterMode;
        return this;
    }

    /**
     * 单字符模式开关。可选值包括： - true：打开单字符模式。 - false：关闭单字符模式。  未传入该参数时默认为false，即不返回单个文本行的单字符信息。 
     * @return characterMode
     */
    public Boolean getCharacterMode() {
        return characterMode;
    }

    public void setCharacterMode(Boolean characterMode) {
        this.characterMode = characterMode;
    }

    public GeneralTextRequestBody withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语种选择，取值范围可参考表1中英文列。未传入该参数时默认为中英文识别模式。 **表1* 语种选择说明 | 英文 |     中文     | | :--: | :----------: | | auto | 自动语种分类 | |  ms  |    马来语    | |  uk  |   乌克兰语   | |  hi  |    印地语    | |  ru  |     俄语     | |  vi  |    越南语    | |  id  |    印尼语    | |  th  |     泰语     | |  zh  |    中英文    | |  ar  |   阿拉伯语   | |  de  |     德语     | |  la  |    拉丁语    | |  fr  |     法语     | |  it  |   意大利语   | |  es  |   西班牙语   | |  pt  |   葡萄牙语   | |  ro  |  罗马尼亚语  | |  pl  |    波兰语    | |  am  |  阿姆哈拉语  | |  ja  |     日语     | |  ko  |     韩语     | |  tr  |   土耳其语   | |  no  |   挪威语     | |  da  |   丹麦语     | |  sv  |   瑞典语     | |  km  |   柬埔寨语   | |  he  |   希伯来语   | 
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public GeneralTextRequestBody withSingleOrientationMode(Boolean singleOrientationMode) {
        this.singleOrientationMode = singleOrientationMode;
        return this;
    }

    /**
     * 单朝向模式开关。可选值包括： - true：打开单朝向模式。 - false：关闭单朝向模式。 图片文字方向一致时，打开该开关可提升识别精度；图片文字方向不一致时，关闭该开关可支持多朝向文字识别。未传入该参数时默认为false，即默认图片中的文字朝向为多朝向。 
     * @return singleOrientationMode
     */
    public Boolean getSingleOrientationMode() {
        return singleOrientationMode;
    }

    public void setSingleOrientationMode(Boolean singleOrientationMode) {
        this.singleOrientationMode = singleOrientationMode;
    }

    public GeneralTextRequestBody withPdfPageNumber(Integer pdfPageNumber) {
        this.pdfPageNumber = pdfPageNumber;
        return this;
    }

    /**
     * 指定PDF页码识别。传入该参数时，则识别指定页码的内容。如果不传该参数，则默认识别第1页。 
     * @return pdfPageNumber
     */
    public Integer getPdfPageNumber() {
        return pdfPageNumber;
    }

    public void setPdfPageNumber(Integer pdfPageNumber) {
        this.pdfPageNumber = pdfPageNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeneralTextRequestBody that = (GeneralTextRequestBody) obj;
        return Objects.equals(this.image, that.image) && Objects.equals(this.url, that.url)
            && Objects.equals(this.detectDirection, that.detectDirection)
            && Objects.equals(this.quickMode, that.quickMode) && Objects.equals(this.characterMode, that.characterMode)
            && Objects.equals(this.language, that.language)
            && Objects.equals(this.singleOrientationMode, that.singleOrientationMode)
            && Objects.equals(this.pdfPageNumber, that.pdfPageNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image,
            url,
            detectDirection,
            quickMode,
            characterMode,
            language,
            singleOrientationMode,
            pdfPageNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralTextRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    detectDirection: ").append(toIndentedString(detectDirection)).append("\n");
        sb.append("    quickMode: ").append(toIndentedString(quickMode)).append("\n");
        sb.append("    characterMode: ").append(toIndentedString(characterMode)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    singleOrientationMode: ").append(toIndentedString(singleOrientationMode)).append("\n");
        sb.append("    pdfPageNumber: ").append(toIndentedString(pdfPageNumber)).append("\n");
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
