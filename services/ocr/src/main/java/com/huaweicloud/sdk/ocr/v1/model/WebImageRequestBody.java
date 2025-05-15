package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class WebImageRequestBody {

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
    @JsonProperty(value = "extract_type")

    private List<String> extractType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_font")

    private Boolean detectFont;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_text_direction")

    private Boolean detectTextDirection;

    public WebImageRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一。  图片的Base64编码，要求单个图片其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图片最小边不小于15px，最长边不超过30000px，支持JPEG、JPG、PNG、BMP、TIFF、GIF、WEBP格式。  图片文件Base64编码字符串，[点击[这里](https://support.huaweicloud.com/ocr_faq/ocr_01_0032.html)](tag:hc)[点击[这里](https://support.huaweicloud.com/intl/zh-cn/ocr_faq/ocr_01_0032.html)](tag:hk)查看详细获取方式。 
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public WebImageRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image二选一。  单个图片其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图片最小边不小于15px，最长边不超过30000px，支持JPEG、JPG、PNG、BMP、TIFF、GIF、WEBP格式。 图片的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，[详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。](tag:hc)[详情参见[配置OBS访问权限](https://support.huaweicloud.com/intl/zh-cn/api-ocr/ocr_03_0132.html)。](tag:hk)  > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 - url中不能存在中文字符，若存在，中文需要进行utf8编码。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WebImageRequestBody withDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    /**
     * 图片朝向检测开关，可选值包括： - true：检测图片朝向; - false：不检测图片朝向。  > 说明： - 支持任意角度的图片朝向检测。未传入该参数时默认为false，即不检测图片朝向。 
     * @return detectDirection
     */
    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public void setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
    }

    public WebImageRequestBody withExtractType(List<String> extractType) {
        this.extractType = extractType;
        return this;
    }

    public WebImageRequestBody addExtractTypeItem(String extractTypeItem) {
        if (this.extractType == null) {
            this.extractType = new ArrayList<>();
        }
        this.extractType.add(extractTypeItem);
        return this;
    }

    public WebImageRequestBody withExtractType(Consumer<List<String>> extractTypeSetter) {
        if (this.extractType == null) {
            this.extractType = new ArrayList<>();
        }
        extractTypeSetter.accept(this.extractType);
        return this;
    }

    /**
     * 结构化数据提取参数列表，目前只支持联系人信息、图像宽高，其入参值分别为\"contact_info\"，\"image_size\"，若该字段为空列表或缺失该字段，默认不提取。 
     * @return extractType
     */
    public List<String> getExtractType() {
        return extractType;
    }

    public void setExtractType(List<String> extractType) {
        this.extractType = extractType;
    }

    public WebImageRequestBody withDetectFont(Boolean detectFont) {
        this.detectFont = detectFont;
        return this;
    }

    /**
     * 为Boolean类型，若不传该字段，默认不检测切片字体，为True时，将检测切片的字体类型，并返回最相似的5种字体名称。 
     * @return detectFont
     */
    public Boolean getDetectFont() {
        return detectFont;
    }

    public void setDetectFont(Boolean detectFont) {
        this.detectFont = detectFont;
    }

    public WebImageRequestBody withDetectTextDirection(Boolean detectTextDirection) {
        this.detectTextDirection = detectTextDirection;
        return this;
    }

    /**
     * 为Boolean类型，若不传该字段，默认为True，即检测每个字段的文字方向。为False时，则不检测文字方向。若图片中所有文字方向均是水平朝上时，建议将该值设为False，即不检测文字方向。 
     * @return detectTextDirection
     */
    public Boolean getDetectTextDirection() {
        return detectTextDirection;
    }

    public void setDetectTextDirection(Boolean detectTextDirection) {
        this.detectTextDirection = detectTextDirection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebImageRequestBody that = (WebImageRequestBody) obj;
        return Objects.equals(this.image, that.image) && Objects.equals(this.url, that.url)
            && Objects.equals(this.detectDirection, that.detectDirection)
            && Objects.equals(this.extractType, that.extractType) && Objects.equals(this.detectFont, that.detectFont)
            && Objects.equals(this.detectTextDirection, that.detectTextDirection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, url, detectDirection, extractType, detectFont, detectTextDirection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebImageRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    detectDirection: ").append(toIndentedString(detectDirection)).append("\n");
        sb.append("    extractType: ").append(toIndentedString(extractType)).append("\n");
        sb.append("    detectFont: ").append(toIndentedString(detectFont)).append("\n");
        sb.append("    detectTextDirection: ").append(toIndentedString(detectTextDirection)).append("\n");
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
