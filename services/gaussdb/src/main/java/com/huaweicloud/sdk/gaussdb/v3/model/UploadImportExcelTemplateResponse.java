package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UploadImportExcelTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processed_rows")

    private Integer processedRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_tables")

    private List<ErrorTable> errorTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_tables")

    private List<SuccessTable> successTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_count")

    private Integer errorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    public UploadImportExcelTemplateResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * **参数解释**：  Excel导入返回状态。  **取值范围**：  - true: 导入成功。 - false： 导入失败。
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public UploadImportExcelTemplateResponse withProcessedRows(Integer processedRows) {
        this.processedRows = processedRows;
        return this;
    }

    /**
     * **参数解释**：  已处理的行数。   **取值范围**：  不涉及。
     * @return processedRows
     */
    public Integer getProcessedRows() {
        return processedRows;
    }

    public void setProcessedRows(Integer processedRows) {
        this.processedRows = processedRows;
    }

    public UploadImportExcelTemplateResponse withErrorTables(List<ErrorTable> errorTables) {
        this.errorTables = errorTables;
        return this;
    }

    public UploadImportExcelTemplateResponse addErrorTablesItem(ErrorTable errorTablesItem) {
        if (this.errorTables == null) {
            this.errorTables = new ArrayList<>();
        }
        this.errorTables.add(errorTablesItem);
        return this;
    }

    public UploadImportExcelTemplateResponse withErrorTables(Consumer<List<ErrorTable>> errorTablesSetter) {
        if (this.errorTables == null) {
            this.errorTables = new ArrayList<>();
        }
        errorTablesSetter.accept(this.errorTables);
        return this;
    }

    /**
     * **参数解释**：  导入失败返回的错误列表。 
     * @return errorTables
     */
    public List<ErrorTable> getErrorTables() {
        return errorTables;
    }

    public void setErrorTables(List<ErrorTable> errorTables) {
        this.errorTables = errorTables;
    }

    public UploadImportExcelTemplateResponse withSuccessTables(List<SuccessTable> successTables) {
        this.successTables = successTables;
        return this;
    }

    public UploadImportExcelTemplateResponse addSuccessTablesItem(SuccessTable successTablesItem) {
        if (this.successTables == null) {
            this.successTables = new ArrayList<>();
        }
        this.successTables.add(successTablesItem);
        return this;
    }

    public UploadImportExcelTemplateResponse withSuccessTables(Consumer<List<SuccessTable>> successTablesSetter) {
        if (this.successTables == null) {
            this.successTables = new ArrayList<>();
        }
        successTablesSetter.accept(this.successTables);
        return this;
    }

    /**
     * **参数解释**：  Excel导入验证成功的列表。 
     * @return successTables
     */
    public List<SuccessTable> getSuccessTables() {
        return successTables;
    }

    public void setSuccessTables(List<SuccessTable> successTables) {
        this.successTables = successTables;
    }

    public UploadImportExcelTemplateResponse withErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * **参数解释**：  Excel导入验证失败的行数。   **取值范围**：  不涉及。
     * @return errorCount
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public UploadImportExcelTemplateResponse withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * **参数解释**：  Excel导入验证成功的行数。   **取值范围**：  不涉及。
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadImportExcelTemplateResponse that = (UploadImportExcelTemplateResponse) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.processedRows, that.processedRows)
            && Objects.equals(this.errorTables, that.errorTables)
            && Objects.equals(this.successTables, that.successTables)
            && Objects.equals(this.errorCount, that.errorCount) && Objects.equals(this.successCount, that.successCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, processedRows, errorTables, successTables, errorCount, successCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadImportExcelTemplateResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    processedRows: ").append(toIndentedString(processedRows)).append("\n");
        sb.append("    errorTables: ").append(toIndentedString(errorTables)).append("\n");
        sb.append("    successTables: ").append(toIndentedString(successTables)).append("\n");
        sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
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
