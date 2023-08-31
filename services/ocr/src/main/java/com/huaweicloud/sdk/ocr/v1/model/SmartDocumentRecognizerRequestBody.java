package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmartDocumentRecognizerRequestBody
 */
public class SmartDocumentRecognizerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv")

    private Boolean kv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private Boolean table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout")

    private Boolean layout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_excel")

    private Boolean returnExcel;

    public SmartDocumentRecognizerRequestBody withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 与url二选一。图片或PDF格式，base64编码，要求base64编码后大小不超过10M。 图像尺寸不小于15×15像素，最长边不超过8192像素，支持JPG/PNG/BMP/TIFF格式。 PDF以144dpi的分辨率转为图像进行文档解析，需符合上述图像尺寸规定。若PDF有多页，当前仅对第1页进行识别。 
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public SmartDocumentRecognizerRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与data二选一。 图片或PDF的URL路径，目前仅支持华为云上OBS提供的匿名公开授权访问的URL以及公网URL。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SmartDocumentRecognizerRequestBody withKv(Boolean kv) {
        this.kv = kv;
        return this;
    }

    /**
     * 是否进行键值对（key-value）提取。若是，结果会以“kv_result”这一关键字返回。 
     * @return kv
     */
    public Boolean getKv() {
        return kv;
    }

    public void setKv(Boolean kv) {
        this.kv = kv;
    }

    public SmartDocumentRecognizerRequestBody withTable(Boolean table) {
        this.table = table;
        return this;
    }

    /**
     * 是否进行表格识别。此处表格特指逻辑表格，通常具有M行N列的形式，且第一行或第一列为表头。若是，结果会以“table_result”这一关键字返回。 
     * @return table
     */
    public Boolean getTable() {
        return table;
    }

    public void setTable(Boolean table) {
        this.table = table;
    }

    public SmartDocumentRecognizerRequestBody withLayout(Boolean layout) {
        this.layout = layout;
        return this;
    }

    /**
     * 是否进行版面分析。若是，结果会以“layout_result”这一关键字返回。 
     * @return layout
     */
    public Boolean getLayout() {
        return layout;
    }

    public void setLayout(Boolean layout) {
        this.layout = layout;
    }

    public SmartDocumentRecognizerRequestBody withReturnExcel(Boolean returnExcel) {
        this.returnExcel = returnExcel;
        return this;
    }

    /**
     * 仅当table为True时有效。是否返回表格转换Microsoft Excel的Base64编码字段。 
     * @return returnExcel
     */
    public Boolean getReturnExcel() {
        return returnExcel;
    }

    public void setReturnExcel(Boolean returnExcel) {
        this.returnExcel = returnExcel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerRequestBody that = (SmartDocumentRecognizerRequestBody) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.url, that.url)
            && Objects.equals(this.kv, that.kv) && Objects.equals(this.table, that.table)
            && Objects.equals(this.layout, that.layout) && Objects.equals(this.returnExcel, that.returnExcel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, url, kv, table, layout, returnExcel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerRequestBody {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    kv: ").append(toIndentedString(kv)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
        sb.append("    returnExcel: ").append(toIndentedString(returnExcel)).append("\n");
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
