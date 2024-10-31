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
    @JsonProperty(value = "single_orientation_mode")

    private Boolean singleOrientationMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "form")

    private Boolean form;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formula")

    private Boolean formula;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_map")

    private String kvMap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pdf_page_number")

    private Integer pdfPageNumber;

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
     * 与data二选一。 图片或PDF的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 - url中不能存在中文字符，若存在，中文需要进行utf8编码。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SmartDocumentRecognizerRequestBody withSingleOrientationMode(Boolean singleOrientationMode) {
        this.singleOrientationMode = singleOrientationMode;
        return this;
    }

    /**
     * 单朝向模式开关。可选值包括： - true：打开单朝向模式 - false：关闭单朝向模式  图片文字方向一致时，打开该开关可提升识别精度；图片文字方向不一致时，关闭该开关可支持多朝向文字识别。未传入该参数时默认为true，既默认图片中的字段为单朝向。 
     * @return singleOrientationMode
     */
    public Boolean getSingleOrientationMode() {
        return singleOrientationMode;
    }

    public void setSingleOrientationMode(Boolean singleOrientationMode) {
        this.singleOrientationMode = singleOrientationMode;
    }

    public SmartDocumentRecognizerRequestBody withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语种选择，未传入该参数时默认为中英文识别模式。参考[华为云通用文字支持语种](https://support.huaweicloud.com/api-ocr/ocr_03_0042.html)。 
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

    public SmartDocumentRecognizerRequestBody withForm(Boolean form) {
        this.form = form;
        return this;
    }

    /**
     * 是否进行有线表单识别。有线表单指关键信息以有线单元格形式进行呈现，例如户口本、机动车发票等。若是，结果会以\"form_result\"这一关键字返回。 
     * @return form
     */
    public Boolean getForm() {
        return form;
    }

    public void setForm(Boolean form) {
        this.form = form;
    }

    public SmartDocumentRecognizerRequestBody withFormula(Boolean formula) {
        this.formula = formula;
        return this;
    }

    /**
     * 是否进行公式识别，识别结果为latex序列。若是，结果会以“formula_result”这一关键字返回。  - 开启公式识别后会降低响应速度。 - 当前仅支持3行以内公式识别，不支持3行以上的多行公式。 
     * @return formula
     */
    public Boolean getFormula() {
        return formula;
    }

    public void setFormula(Boolean formula) {
        this.formula = formula;
    }

    public SmartDocumentRecognizerRequestBody withKvMap(String kvMap) {
        this.kvMap = kvMap;
        return this;
    }

    /**
     * 需要传入字典的json序列化后字符串，用于对kv_result中的特定key值进行归一化映射。例如，kv_result中包含{\"名称\"：\"小明\"}的键值对，若传入{\"名称\"：\"姓名\"}的kv_map，则返回结果为{“姓名”：“小明”}。  > 参数传入示例： - \"kv_map\":\"{\\\"名称\\\":\\\"姓名\\\"}\" 
     * @return kvMap
     */
    public String getKvMap() {
        return kvMap;
    }

    public void setKvMap(String kvMap) {
        this.kvMap = kvMap;
    }

    public SmartDocumentRecognizerRequestBody withPdfPageNumber(Integer pdfPageNumber) {
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
        SmartDocumentRecognizerRequestBody that = (SmartDocumentRecognizerRequestBody) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.url, that.url)
            && Objects.equals(this.singleOrientationMode, that.singleOrientationMode)
            && Objects.equals(this.language, that.language) && Objects.equals(this.kv, that.kv)
            && Objects.equals(this.table, that.table) && Objects.equals(this.layout, that.layout)
            && Objects.equals(this.returnExcel, that.returnExcel) && Objects.equals(this.form, that.form)
            && Objects.equals(this.formula, that.formula) && Objects.equals(this.kvMap, that.kvMap)
            && Objects.equals(this.pdfPageNumber, that.pdfPageNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data,
            url,
            singleOrientationMode,
            language,
            kv,
            table,
            layout,
            returnExcel,
            form,
            formula,
            kvMap,
            pdfPageNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerRequestBody {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    singleOrientationMode: ").append(toIndentedString(singleOrientationMode)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    kv: ").append(toIndentedString(kv)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
        sb.append("    returnExcel: ").append(toIndentedString(returnExcel)).append("\n");
        sb.append("    form: ").append(toIndentedString(form)).append("\n");
        sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
        sb.append("    kvMap: ").append(toIndentedString(kvMap)).append("\n");
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
