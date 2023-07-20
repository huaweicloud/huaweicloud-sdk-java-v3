package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导入失败详情响应体。
 */
public class ImportErrorMessageResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sheet_name")

    private String sheetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_rum")

    private String rowRum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public ImportErrorMessageResp withSheetName(String sheetName) {
        this.sheetName = sheetName;
        return this;
    }

    /**
     * sheet名称。
     * @return sheetName
     */
    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public ImportErrorMessageResp withRowRum(String rowRum) {
        this.rowRum = rowRum;
        return this;
    }

    /**
     * 行号。
     * @return rowRum
     */
    public String getRowRum() {
        return rowRum;
    }

    public void setRowRum(String rowRum) {
        this.rowRum = rowRum;
    }

    public ImportErrorMessageResp withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 字段值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ImportErrorMessageResp withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportErrorMessageResp that = (ImportErrorMessageResp) obj;
        return Objects.equals(this.sheetName, that.sheetName) && Objects.equals(this.rowRum, that.rowRum)
            && Objects.equals(this.value, that.value) && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sheetName, rowRum, value, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportErrorMessageResp {\n");
        sb.append("    sheetName: ").append(toIndentedString(sheetName)).append("\n");
        sb.append("    rowRum: ").append(toIndentedString(rowRum)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
