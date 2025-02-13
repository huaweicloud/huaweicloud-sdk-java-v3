package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class SealRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_seal_image")

    private Boolean returnSealImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_erased_seal_image")

    private Boolean returnErasedSealImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pdf_page_number")

    private Integer pdfPageNumber;

    public SealRequestBody withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 该参数与url二选一。 图片的Base64编码，要求Base64编码后大小不超过10MB。 图片最短边不小于15px，最长边不超过8192px。支持JPEG、JPG、PNG、BMP、GIF、TIFF、WEBP、PCX、ICO、PSD、PDF格式。 图片Base64编码示例如/9j/4AAQSkZJRgABAg...，带有多余前缀会产生The image format is not supported报错。 
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public SealRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与data二选一  要求Base64编码后大小不超过10MB。 图片最短边不小于15px，最长边不超过8192px。支持JPEG、JPG、PNG、BMP、GIF、TIFF、WEBP、PCX、ICO、PSD、PDF格式。 图片的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 - url中不能存在中文字符，若存在，中文需要进行utf8编码。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SealRequestBody withReturnSealImage(Boolean returnSealImage) {
        this.returnSealImage = returnSealImage;
        return this;
    }

    /**
     * 是否返回提取的印章base64编码图片，可选值如下所示： - true：返回提取的印章图片base64编码 - false：不返回提取的印章图片base64编码  如果无该参数，系统默认不返回印章擦除后的图片。如果输入参数不是Boolean类型，则会报非法参数错误。 
     * @return returnSealImage
     */
    public Boolean getReturnSealImage() {
        return returnSealImage;
    }

    public void setReturnSealImage(Boolean returnSealImage) {
        this.returnSealImage = returnSealImage;
    }

    public SealRequestBody withReturnErasedSealImage(Boolean returnErasedSealImage) {
        this.returnErasedSealImage = returnErasedSealImage;
        return this;
    }

    /**
     * 是否返回印章擦除后的base64编码图片，可选值包括： - true：返回印章擦除后的图片base64编码 - false：不返回印章擦除后的图片base64编码  如果无该参数，系统默认不返回印章擦除后的图片。如果输入参数不是Boolean类型，则会报非法参数错误。 
     * @return returnErasedSealImage
     */
    public Boolean getReturnErasedSealImage() {
        return returnErasedSealImage;
    }

    public void setReturnErasedSealImage(Boolean returnErasedSealImage) {
        this.returnErasedSealImage = returnErasedSealImage;
    }

    public SealRequestBody withPdfPageNumber(Integer pdfPageNumber) {
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
        SealRequestBody that = (SealRequestBody) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.url, that.url)
            && Objects.equals(this.returnSealImage, that.returnSealImage)
            && Objects.equals(this.returnErasedSealImage, that.returnErasedSealImage)
            && Objects.equals(this.pdfPageNumber, that.pdfPageNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, url, returnSealImage, returnErasedSealImage, pdfPageNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SealRequestBody {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    returnSealImage: ").append(toIndentedString(returnSealImage)).append("\n");
        sb.append("    returnErasedSealImage: ").append(toIndentedString(returnErasedSealImage)).append("\n");
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
