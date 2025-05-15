package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class BankReceiptRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_orientation_mode")

    private Boolean singleOrientationMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "erase_seal")

    private Boolean eraseSeal;

    public BankReceiptRequestBody withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 该参数与url二选一。  图片的Base64编码，要求单个图片、PDF文件其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图像尺寸不小于15×15像素，最长边不超过8192像素，支持JPG/PNG/BMP/TIFF/PDF格式。 PDF以144dpi的分辨率转为图像进行识别，需符合上述图像尺寸规定。若PDF有多页，当前仅对第1页进行识别。 
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BankReceiptRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与data二选一。  单个图片、PDF文件其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图像尺寸不小于15×15像素，最长边不超过8192像素，支持JPG/PNG/BMP/TIFF/PDF格式。 图片的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 - url中不能存在中文字符，若存在，中文需要进行utf8编码。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BankReceiptRequestBody withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 指定PDF页码识别。传入该参数时，则识别指定页码的内容。如果不传该参数，则默认识别第1页，该参数仅在文件为PDF格式时有效。 
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public BankReceiptRequestBody withSingleOrientationMode(Boolean singleOrientationMode) {
        this.singleOrientationMode = singleOrientationMode;
        return this;
    }

    /**
     * 单朝向模式开关。可选值包括： - true：打开单朝向模式。 - false：关闭单朝向模式。  图片文字方向一致时，打开该开关可提升识别精度；图片文字方向不一致时，关闭该开关可支持多朝向文字识别。未传入该参数时默认为\"true\"，既默认图片中的文字方向为单朝向。 
     * @return singleOrientationMode
     */
    public Boolean getSingleOrientationMode() {
        return singleOrientationMode;
    }

    public void setSingleOrientationMode(Boolean singleOrientationMode) {
        this.singleOrientationMode = singleOrientationMode;
    }

    public BankReceiptRequestBody withEraseSeal(Boolean eraseSeal) {
        this.eraseSeal = eraseSeal;
        return this;
    }

    /**
     * 是否打开印章擦除功能。可选值包括： - true：打开印章擦除功能。 - false：关闭印章擦除功能。  开启后，可提升印章遮挡区域的文字识别精度。 
     * @return eraseSeal
     */
    public Boolean getEraseSeal() {
        return eraseSeal;
    }

    public void setEraseSeal(Boolean eraseSeal) {
        this.eraseSeal = eraseSeal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BankReceiptRequestBody that = (BankReceiptRequestBody) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.url, that.url)
            && Objects.equals(this.pageNum, that.pageNum)
            && Objects.equals(this.singleOrientationMode, that.singleOrientationMode)
            && Objects.equals(this.eraseSeal, that.eraseSeal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, url, pageNum, singleOrientationMode, eraseSeal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BankReceiptRequestBody {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    singleOrientationMode: ").append(toIndentedString(singleOrientationMode)).append("\n");
        sb.append("    eraseSeal: ").append(toIndentedString(eraseSeal)).append("\n");
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
