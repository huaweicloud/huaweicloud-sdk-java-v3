package com.huaweicloud.sdk.csms.v1.model;

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
public class BatchImportSecretsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_list")

    private List<ErrorInfo> errorList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Integer success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private Integer failed;

    public BatchImportSecretsResponse withErrorList(List<ErrorInfo> errorList) {
        this.errorList = errorList;
        return this;
    }

    public BatchImportSecretsResponse addErrorListItem(ErrorInfo errorListItem) {
        if (this.errorList == null) {
            this.errorList = new ArrayList<>();
        }
        this.errorList.add(errorListItem);
        return this;
    }

    public BatchImportSecretsResponse withErrorList(Consumer<List<ErrorInfo>> errorListSetter) {
        if (this.errorList == null) {
            this.errorList = new ArrayList<>();
        }
        errorListSetter.accept(this.errorList);
        return this;
    }

    /**
     * 失败描述
     * @return errorList
     */
    public List<ErrorInfo> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<ErrorInfo> errorList) {
        this.errorList = errorList;
    }

    public BatchImportSecretsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总条数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public BatchImportSecretsResponse withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * 成功条数
     * @return success
     */
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public BatchImportSecretsResponse withFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
     * 失败条数
     * @return failed
     */
    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchImportSecretsResponse that = (BatchImportSecretsResponse) obj;
        return Objects.equals(this.errorList, that.errorList) && Objects.equals(this.total, that.total)
            && Objects.equals(this.success, that.success) && Objects.equals(this.failed, that.failed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorList, total, success, failed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchImportSecretsResponse {\n");
        sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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
