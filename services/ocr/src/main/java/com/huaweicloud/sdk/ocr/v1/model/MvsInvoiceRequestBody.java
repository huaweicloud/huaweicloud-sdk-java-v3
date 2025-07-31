package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class MvsInvoiceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_text_location")

    private Boolean returnTextLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_confidence")

    private Boolean returnConfidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public MvsInvoiceRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一。  图片的Base64编码，要求单个图片、PDF文件其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图片最小边不小于100px，最长边不超过8000px。支持JPEG、JPG、PNG、BMP、TIFF、PDF格式。多页PDF仅识别第一页。  图片文件Base64编码字符串，点击[这里](https://support.huaweicloud.com/ocr_faq/ocr_01_0032.html)查看详细获取方式。   
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public MvsInvoiceRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image二选一。  单个图片、PDF文件其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图片最小边不小于100px，最长边不超过8000px。支持JPEG、JPG、PNG、BMP、TIFF、PDF格式。多页PDF仅识别第一页。 图片的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 - url中不能存在中文字符，若存在，中文需要进行utf8编码。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MvsInvoiceRequestBody withReturnTextLocation(Boolean returnTextLocation) {
        this.returnTextLocation = returnTextLocation;
        return this;
    }

    /**
     * 如果为True，返回体中会包含text_location对象，内容是各字段的检测框四点坐标。如果是False或者没有这个key，则返回体中不包含text_location对象。 
     * @return returnTextLocation
     */
    public Boolean getReturnTextLocation() {
        return returnTextLocation;
    }

    public void setReturnTextLocation(Boolean returnTextLocation) {
        this.returnTextLocation = returnTextLocation;
    }

    public MvsInvoiceRequestBody withReturnConfidence(Boolean returnConfidence) {
        this.returnConfidence = returnConfidence;
        return this;
    }

    /**
     * 如果为True，返回体中会包含confidence对象，内容是各字段的置信度。如果是False或者没有这个key，则返回体中不包含confidence对象。 
     * @return returnConfidence
     */
    public Boolean getReturnConfidence() {
        return returnConfidence;
    }

    public void setReturnConfidence(Boolean returnConfidence) {
        this.returnConfidence = returnConfidence;
    }

    public MvsInvoiceRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 如果没有type字段则默认返回原机动车销售发票出参； 若存在type字段但是不属于 auto、new或者used三个枚举值，API返回AIS.0101入参错误； 如果type为auto，API自动判断发票类型，并在返回参数中添加type出参以指明发票类型； 如果type为new，API在检测出的类型为机动车发票时返回原版机动车发票出参并添加type出参（“机动车销售统一发票”或“电子发票（机动车销售统一发票）”），不一致时报错AIS.0104图像质量差； 如果type为used，API在检测出的类型为二手车时返回二手车发票出参，并添加type出参（“二手车销售统一发票”或“电子发票（二手车销售统一发票）”），不一致时报错AIS.0104图像质量差。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MvsInvoiceRequestBody that = (MvsInvoiceRequestBody) obj;
        return Objects.equals(this.image, that.image) && Objects.equals(this.url, that.url)
            && Objects.equals(this.returnTextLocation, that.returnTextLocation)
            && Objects.equals(this.returnConfidence, that.returnConfidence) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, url, returnTextLocation, returnConfidence, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MvsInvoiceRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    returnTextLocation: ").append(toIndentedString(returnTextLocation)).append("\n");
        sb.append("    returnConfidence: ").append(toIndentedString(returnConfidence)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
