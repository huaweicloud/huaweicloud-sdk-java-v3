package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class FinancialStatementRequestBody {

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
    @JsonProperty(value = "return_excel")

    private Boolean returnExcel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_table_location")

    private Boolean returnTableLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_image_size")

    private Boolean returnImageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_rectification_matrix")

    private Boolean returnRectificationMatrix;

    public FinancialStatementRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一  图像数据，base64编码，要求base64编码后大小不超过10MB。图片最小边不小于15px，最长边不超过8192px，支持JPEG、JPG、PNG、BMP、TIFF格式。  图片文件Base64编码字符串，点击[这里](https://support.huaweicloud.com/ocr_faq/ocr_01_0032.html)查看详细获取方式。   
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public FinancialStatementRequestBody withUrl(String url) {
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

    public FinancialStatementRequestBody withReturnTextLocation(Boolean returnTextLocation) {
        this.returnTextLocation = returnTextLocation;
        return this;
    }

    /**
     * 返回文本块坐标及单元格坐标信息，可选值包括： - true：返回文本块和单元格坐标; - false：不返回。  > 说明： - 未传入该参数时默认为false，即不返回。 
     * @return returnTextLocation
     */
    public Boolean getReturnTextLocation() {
        return returnTextLocation;
    }

    public void setReturnTextLocation(Boolean returnTextLocation) {
        this.returnTextLocation = returnTextLocation;
    }

    public FinancialStatementRequestBody withReturnConfidence(Boolean returnConfidence) {
        this.returnConfidence = returnConfidence;
        return this;
    }

    /**
     * 返回字段识别置信度，小数点后四位。可选值包括： - true：返回字段置信度; - false：不返回。  > 说明： - 未传入该参数时默认为false，即不返回字段置信度。 
     * @return returnConfidence
     */
    public Boolean getReturnConfidence() {
        return returnConfidence;
    }

    public void setReturnConfidence(Boolean returnConfidence) {
        this.returnConfidence = returnConfidence;
    }

    public FinancialStatementRequestBody withReturnExcel(Boolean returnExcel) {
        this.returnExcel = returnExcel;
        return this;
    }

    /**
     * 是否返回表格转换Microsoft Excel的base64编码字段。可选值包括： - true：返回’excel’字段，表示xlsx格式的表格识别结果的base64编码; - false：不返回。  > 说明： - 对返回的Excel编码，可用Python函数 base64.b64decode解码后保存为xlsx文件。 
     * @return returnExcel
     */
    public Boolean getReturnExcel() {
        return returnExcel;
    }

    public void setReturnExcel(Boolean returnExcel) {
        this.returnExcel = returnExcel;
    }

    public FinancialStatementRequestBody withReturnTableLocation(Boolean returnTableLocation) {
        this.returnTableLocation = returnTableLocation;
        return this;
    }

    /**
     * 返回表格坐标，可选值包括： - true：返回表格坐标; - false：不返回。  > 说明： - 未传入该参数时默认为false，即不返回。 
     * @return returnTableLocation
     */
    public Boolean getReturnTableLocation() {
        return returnTableLocation;
    }

    public void setReturnTableLocation(Boolean returnTableLocation) {
        this.returnTableLocation = returnTableLocation;
    }

    public FinancialStatementRequestBody withReturnImageSize(Boolean returnImageSize) {
        this.returnImageSize = returnImageSize;
        return this;
    }

    /**
     * 返回矫正后的图像大小，可选值包括： - true：返回矫正图像大小; - false：不返回。  > 说明： - 未传入该参数时默认为false，即不返回。 
     * @return returnImageSize
     */
    public Boolean getReturnImageSize() {
        return returnImageSize;
    }

    public void setReturnImageSize(Boolean returnImageSize) {
        this.returnImageSize = returnImageSize;
    }

    public FinancialStatementRequestBody withReturnRectificationMatrix(Boolean returnRectificationMatrix) {
        this.returnRectificationMatrix = returnRectificationMatrix;
        return this;
    }

    /**
     * 透视变换矩阵，可选值包括： - true：返回透视变换矩阵; - false：不返回。  > 说明： - 未传入该参数时默认为false，即不返回透视变换矩阵。 
     * @return returnRectificationMatrix
     */
    public Boolean getReturnRectificationMatrix() {
        return returnRectificationMatrix;
    }

    public void setReturnRectificationMatrix(Boolean returnRectificationMatrix) {
        this.returnRectificationMatrix = returnRectificationMatrix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FinancialStatementRequestBody that = (FinancialStatementRequestBody) obj;
        return Objects.equals(this.image, that.image) && Objects.equals(this.url, that.url)
            && Objects.equals(this.returnTextLocation, that.returnTextLocation)
            && Objects.equals(this.returnConfidence, that.returnConfidence)
            && Objects.equals(this.returnExcel, that.returnExcel)
            && Objects.equals(this.returnTableLocation, that.returnTableLocation)
            && Objects.equals(this.returnImageSize, that.returnImageSize)
            && Objects.equals(this.returnRectificationMatrix, that.returnRectificationMatrix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image,
            url,
            returnTextLocation,
            returnConfidence,
            returnExcel,
            returnTableLocation,
            returnImageSize,
            returnRectificationMatrix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FinancialStatementRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    returnTextLocation: ").append(toIndentedString(returnTextLocation)).append("\n");
        sb.append("    returnConfidence: ").append(toIndentedString(returnConfidence)).append("\n");
        sb.append("    returnExcel: ").append(toIndentedString(returnExcel)).append("\n");
        sb.append("    returnTableLocation: ").append(toIndentedString(returnTableLocation)).append("\n");
        sb.append("    returnImageSize: ").append(toIndentedString(returnImageSize)).append("\n");
        sb.append("    returnRectificationMatrix: ").append(toIndentedString(returnRectificationMatrix)).append("\n");
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
