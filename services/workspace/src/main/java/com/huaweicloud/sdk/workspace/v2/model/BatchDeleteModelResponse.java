package com.huaweicloud.sdk.workspace.v2.model;

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
public class BatchDeleteModelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted_count")

    private Integer deletedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    private Integer failedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_details")

    private List<ModelBatchDeleteRespFailedDetails> failedDetails = null;

    public BatchDeleteModelResponse withDeletedCount(Integer deletedCount) {
        this.deletedCount = deletedCount;
        return this;
    }

    /**
     * 删除数量。
     * @return deletedCount
     */
    public Integer getDeletedCount() {
        return deletedCount;
    }

    public void setDeletedCount(Integer deletedCount) {
        this.deletedCount = deletedCount;
    }

    public BatchDeleteModelResponse withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * 失败数量。
     * @return failedCount
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    public BatchDeleteModelResponse withFailedDetails(List<ModelBatchDeleteRespFailedDetails> failedDetails) {
        this.failedDetails = failedDetails;
        return this;
    }

    public BatchDeleteModelResponse addFailedDetailsItem(ModelBatchDeleteRespFailedDetails failedDetailsItem) {
        if (this.failedDetails == null) {
            this.failedDetails = new ArrayList<>();
        }
        this.failedDetails.add(failedDetailsItem);
        return this;
    }

    public BatchDeleteModelResponse withFailedDetails(
        Consumer<List<ModelBatchDeleteRespFailedDetails>> failedDetailsSetter) {
        if (this.failedDetails == null) {
            this.failedDetails = new ArrayList<>();
        }
        failedDetailsSetter.accept(this.failedDetails);
        return this;
    }

    /**
     * 失败详情列表。
     * @return failedDetails
     */
    public List<ModelBatchDeleteRespFailedDetails> getFailedDetails() {
        return failedDetails;
    }

    public void setFailedDetails(List<ModelBatchDeleteRespFailedDetails> failedDetails) {
        this.failedDetails = failedDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteModelResponse that = (BatchDeleteModelResponse) obj;
        return Objects.equals(this.deletedCount, that.deletedCount)
            && Objects.equals(this.failedCount, that.failedCount)
            && Objects.equals(this.failedDetails, that.failedDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deletedCount, failedCount, failedDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteModelResponse {\n");
        sb.append("    deletedCount: ").append(toIndentedString(deletedCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
        sb.append("    failedDetails: ").append(toIndentedString(failedDetails)).append("\n");
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
