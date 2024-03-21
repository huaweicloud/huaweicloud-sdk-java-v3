package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartDocumentRecognizerResult
 */
public class SmartDocumentRecognizerResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ocr_result")

    private SmartDocumentRecognizerOcrResult ocrResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_result")

    private SmartDocumentRecognizerKvResult kvResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_result")

    private SmartDocumentRecognizerTableResult tableResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_result")

    private SmartDocumentRecognizerLayoutResult layoutResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "form_result")

    private SmartDocumentRecognizerFormResult formResult;

    public SmartDocumentRecognizerResult withOcrResult(SmartDocumentRecognizerOcrResult ocrResult) {
        this.ocrResult = ocrResult;
        return this;
    }

    public SmartDocumentRecognizerResult withOcrResult(Consumer<SmartDocumentRecognizerOcrResult> ocrResultSetter) {
        if (this.ocrResult == null) {
            this.ocrResult = new SmartDocumentRecognizerOcrResult();
            ocrResultSetter.accept(this.ocrResult);
        }

        return this;
    }

    /**
     * Get ocrResult
     * @return ocrResult
     */
    public SmartDocumentRecognizerOcrResult getOcrResult() {
        return ocrResult;
    }

    public void setOcrResult(SmartDocumentRecognizerOcrResult ocrResult) {
        this.ocrResult = ocrResult;
    }

    public SmartDocumentRecognizerResult withKvResult(SmartDocumentRecognizerKvResult kvResult) {
        this.kvResult = kvResult;
        return this;
    }

    public SmartDocumentRecognizerResult withKvResult(Consumer<SmartDocumentRecognizerKvResult> kvResultSetter) {
        if (this.kvResult == null) {
            this.kvResult = new SmartDocumentRecognizerKvResult();
            kvResultSetter.accept(this.kvResult);
        }

        return this;
    }

    /**
     * Get kvResult
     * @return kvResult
     */
    public SmartDocumentRecognizerKvResult getKvResult() {
        return kvResult;
    }

    public void setKvResult(SmartDocumentRecognizerKvResult kvResult) {
        this.kvResult = kvResult;
    }

    public SmartDocumentRecognizerResult withTableResult(SmartDocumentRecognizerTableResult tableResult) {
        this.tableResult = tableResult;
        return this;
    }

    public SmartDocumentRecognizerResult withTableResult(
        Consumer<SmartDocumentRecognizerTableResult> tableResultSetter) {
        if (this.tableResult == null) {
            this.tableResult = new SmartDocumentRecognizerTableResult();
            tableResultSetter.accept(this.tableResult);
        }

        return this;
    }

    /**
     * Get tableResult
     * @return tableResult
     */
    public SmartDocumentRecognizerTableResult getTableResult() {
        return tableResult;
    }

    public void setTableResult(SmartDocumentRecognizerTableResult tableResult) {
        this.tableResult = tableResult;
    }

    public SmartDocumentRecognizerResult withLayoutResult(SmartDocumentRecognizerLayoutResult layoutResult) {
        this.layoutResult = layoutResult;
        return this;
    }

    public SmartDocumentRecognizerResult withLayoutResult(
        Consumer<SmartDocumentRecognizerLayoutResult> layoutResultSetter) {
        if (this.layoutResult == null) {
            this.layoutResult = new SmartDocumentRecognizerLayoutResult();
            layoutResultSetter.accept(this.layoutResult);
        }

        return this;
    }

    /**
     * Get layoutResult
     * @return layoutResult
     */
    public SmartDocumentRecognizerLayoutResult getLayoutResult() {
        return layoutResult;
    }

    public void setLayoutResult(SmartDocumentRecognizerLayoutResult layoutResult) {
        this.layoutResult = layoutResult;
    }

    public SmartDocumentRecognizerResult withFormResult(SmartDocumentRecognizerFormResult formResult) {
        this.formResult = formResult;
        return this;
    }

    public SmartDocumentRecognizerResult withFormResult(Consumer<SmartDocumentRecognizerFormResult> formResultSetter) {
        if (this.formResult == null) {
            this.formResult = new SmartDocumentRecognizerFormResult();
            formResultSetter.accept(this.formResult);
        }

        return this;
    }

    /**
     * Get formResult
     * @return formResult
     */
    public SmartDocumentRecognizerFormResult getFormResult() {
        return formResult;
    }

    public void setFormResult(SmartDocumentRecognizerFormResult formResult) {
        this.formResult = formResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerResult that = (SmartDocumentRecognizerResult) obj;
        return Objects.equals(this.ocrResult, that.ocrResult) && Objects.equals(this.kvResult, that.kvResult)
            && Objects.equals(this.tableResult, that.tableResult)
            && Objects.equals(this.layoutResult, that.layoutResult) && Objects.equals(this.formResult, that.formResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ocrResult, kvResult, tableResult, layoutResult, formResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerResult {\n");
        sb.append("    ocrResult: ").append(toIndentedString(ocrResult)).append("\n");
        sb.append("    kvResult: ").append(toIndentedString(kvResult)).append("\n");
        sb.append("    tableResult: ").append(toIndentedString(tableResult)).append("\n");
        sb.append("    layoutResult: ").append(toIndentedString(layoutResult)).append("\n");
        sb.append("    formResult: ").append(toIndentedString(formResult)).append("\n");
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
