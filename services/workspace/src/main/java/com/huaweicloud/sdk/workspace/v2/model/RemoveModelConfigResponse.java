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
public class RemoveModelConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted_count")

    private Integer deletedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    private Integer failedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_details")

    private List<ModelConfigFailedItem> failedDetails = null;

    public RemoveModelConfigResponse withDeletedCount(Integer deletedCount) {
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

    public RemoveModelConfigResponse withFailedCount(Integer failedCount) {
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

    public RemoveModelConfigResponse withFailedDetails(List<ModelConfigFailedItem> failedDetails) {
        this.failedDetails = failedDetails;
        return this;
    }

    public RemoveModelConfigResponse addFailedDetailsItem(ModelConfigFailedItem failedDetailsItem) {
        if (this.failedDetails == null) {
            this.failedDetails = new ArrayList<>();
        }
        this.failedDetails.add(failedDetailsItem);
        return this;
    }

    public RemoveModelConfigResponse withFailedDetails(Consumer<List<ModelConfigFailedItem>> failedDetailsSetter) {
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
    public List<ModelConfigFailedItem> getFailedDetails() {
        return failedDetails;
    }

    public void setFailedDetails(List<ModelConfigFailedItem> failedDetails) {
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
        RemoveModelConfigResponse that = (RemoveModelConfigResponse) obj;
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
        sb.append("class RemoveModelConfigResponse {\n");
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
