package com.huaweicloud.sdk.projectman.v4.model;

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
public class BatchDeleteSnapshotsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_count")

    private Integer failureCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_details")

    private List<FailureDetail> failureDetails = null;

    public BatchDeleteSnapshotsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 响应信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BatchDeleteSnapshotsResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 响应码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BatchDeleteSnapshotsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数量。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public BatchDeleteSnapshotsResponse withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 成功数量。
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public BatchDeleteSnapshotsResponse withFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
        return this;
    }

    /**
     * 失败数量。
     * @return failureCount
     */
    public Integer getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }

    public BatchDeleteSnapshotsResponse withFailureDetails(List<FailureDetail> failureDetails) {
        this.failureDetails = failureDetails;
        return this;
    }

    public BatchDeleteSnapshotsResponse addFailureDetailsItem(FailureDetail failureDetailsItem) {
        if (this.failureDetails == null) {
            this.failureDetails = new ArrayList<>();
        }
        this.failureDetails.add(failureDetailsItem);
        return this;
    }

    public BatchDeleteSnapshotsResponse withFailureDetails(Consumer<List<FailureDetail>> failureDetailsSetter) {
        if (this.failureDetails == null) {
            this.failureDetails = new ArrayList<>();
        }
        failureDetailsSetter.accept(this.failureDetails);
        return this;
    }

    /**
     * 失败详情列表。
     * @return failureDetails
     */
    public List<FailureDetail> getFailureDetails() {
        return failureDetails;
    }

    public void setFailureDetails(List<FailureDetail> failureDetails) {
        this.failureDetails = failureDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteSnapshotsResponse that = (BatchDeleteSnapshotsResponse) obj;
        return Objects.equals(this.message, that.message) && Objects.equals(this.code, that.code)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.successCount, that.successCount)
            && Objects.equals(this.failureCount, that.failureCount)
            && Objects.equals(this.failureDetails, that.failureDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, code, totalCount, successCount, failureCount, failureDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteSnapshotsResponse {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
        sb.append("    failureDetails: ").append(toIndentedString(failureDetails)).append("\n");
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
