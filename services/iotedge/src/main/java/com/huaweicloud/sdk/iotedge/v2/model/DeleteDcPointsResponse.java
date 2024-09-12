package com.huaweicloud.sdk.iotedge.v2.model;

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
public class DeleteDcPointsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<String> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure")

    private List<DeleteDcPointsFailedDetail> failure = null;

    public DeleteDcPointsResponse withSuccess(List<String> success) {
        this.success = success;
        return this;
    }

    public DeleteDcPointsResponse addSuccessItem(String successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public DeleteDcPointsResponse withSuccess(Consumer<List<String>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * Get success
     * @return success
     */
    public List<String> getSuccess() {
        return success;
    }

    public void setSuccess(List<String> success) {
        this.success = success;
    }

    public DeleteDcPointsResponse withFailure(List<DeleteDcPointsFailedDetail> failure) {
        this.failure = failure;
        return this;
    }

    public DeleteDcPointsResponse addFailureItem(DeleteDcPointsFailedDetail failureItem) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        this.failure.add(failureItem);
        return this;
    }

    public DeleteDcPointsResponse withFailure(Consumer<List<DeleteDcPointsFailedDetail>> failureSetter) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        failureSetter.accept(this.failure);
        return this;
    }

    /**
     * 删除失败的点位和详情
     * @return failure
     */
    public List<DeleteDcPointsFailedDetail> getFailure() {
        return failure;
    }

    public void setFailure(List<DeleteDcPointsFailedDetail> failure) {
        this.failure = failure;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDcPointsResponse that = (DeleteDcPointsResponse) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.failure, that.failure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, failure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDcPointsResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
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
