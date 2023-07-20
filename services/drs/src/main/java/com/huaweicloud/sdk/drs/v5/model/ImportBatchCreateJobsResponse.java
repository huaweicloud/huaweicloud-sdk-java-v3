package com.huaweicloud.sdk.drs.v5.model;

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
public class ImportBatchCreateJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "async_job_id")

    private String asyncJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_error_messages")

    private List<ImportErrorMessageResp> importErrorMessages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public ImportBatchCreateJobsResponse withAsyncJobId(String asyncJobId) {
        this.asyncJobId = asyncJobId;
        return this;
    }

    /**
     * 批量导入任务id。
     * @return asyncJobId
     */
    public String getAsyncJobId() {
        return asyncJobId;
    }

    public void setAsyncJobId(String asyncJobId) {
        this.asyncJobId = asyncJobId;
    }

    public ImportBatchCreateJobsResponse withImportErrorMessages(List<ImportErrorMessageResp> importErrorMessages) {
        this.importErrorMessages = importErrorMessages;
        return this;
    }

    public ImportBatchCreateJobsResponse addImportErrorMessagesItem(ImportErrorMessageResp importErrorMessagesItem) {
        if (this.importErrorMessages == null) {
            this.importErrorMessages = new ArrayList<>();
        }
        this.importErrorMessages.add(importErrorMessagesItem);
        return this;
    }

    public ImportBatchCreateJobsResponse withImportErrorMessages(
        Consumer<List<ImportErrorMessageResp>> importErrorMessagesSetter) {
        if (this.importErrorMessages == null) {
            this.importErrorMessages = new ArrayList<>();
        }
        importErrorMessagesSetter.accept(this.importErrorMessages);
        return this;
    }

    /**
     * 导入失败的错误信息。
     * @return importErrorMessages
     */
    public List<ImportErrorMessageResp> getImportErrorMessages() {
        return importErrorMessages;
    }

    public void setImportErrorMessages(List<ImportErrorMessageResp> importErrorMessages) {
        this.importErrorMessages = importErrorMessages;
    }

    public ImportBatchCreateJobsResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ImportBatchCreateJobsResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportBatchCreateJobsResponse that = (ImportBatchCreateJobsResponse) obj;
        return Objects.equals(this.asyncJobId, that.asyncJobId)
            && Objects.equals(this.importErrorMessages, that.importErrorMessages)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asyncJobId, importErrorMessages, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportBatchCreateJobsResponse {\n");
        sb.append("    asyncJobId: ").append(toIndentedString(asyncJobId)).append("\n");
        sb.append("    importErrorMessages: ").append(toIndentedString(importErrorMessages)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
