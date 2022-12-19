package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 委托告警返回对象
 */
public class BatchOrderAlertResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_ids")

    private List<String> errorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_ids")

    private List<String> successIds = null;

    public BatchOrderAlertResult withErrorIds(List<String> errorIds) {
        this.errorIds = errorIds;
        return this;
    }

    public BatchOrderAlertResult addErrorIdsItem(String errorIdsItem) {
        if (this.errorIds == null) {
            this.errorIds = new ArrayList<>();
        }
        this.errorIds.add(errorIdsItem);
        return this;
    }

    public BatchOrderAlertResult withErrorIds(Consumer<List<String>> errorIdsSetter) {
        if (this.errorIds == null) {
            this.errorIds = new ArrayList<>();
        }
        errorIdsSetter.accept(this.errorIds);
        return this;
    }

    /**
     * 失败id
     * @return errorIds
     */
    public List<String> getErrorIds() {
        return errorIds;
    }

    public void setErrorIds(List<String> errorIds) {
        this.errorIds = errorIds;
    }

    public BatchOrderAlertResult withSuccessIds(List<String> successIds) {
        this.successIds = successIds;
        return this;
    }

    public BatchOrderAlertResult addSuccessIdsItem(String successIdsItem) {
        if (this.successIds == null) {
            this.successIds = new ArrayList<>();
        }
        this.successIds.add(successIdsItem);
        return this;
    }

    public BatchOrderAlertResult withSuccessIds(Consumer<List<String>> successIdsSetter) {
        if (this.successIds == null) {
            this.successIds = new ArrayList<>();
        }
        successIdsSetter.accept(this.successIds);
        return this;
    }

    /**
     * 成功败id
     * @return successIds
     */
    public List<String> getSuccessIds() {
        return successIds;
    }

    public void setSuccessIds(List<String> successIds) {
        this.successIds = successIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchOrderAlertResult batchOrderAlertResult = (BatchOrderAlertResult) o;
        return Objects.equals(this.errorIds, batchOrderAlertResult.errorIds)
            && Objects.equals(this.successIds, batchOrderAlertResult.successIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorIds, successIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchOrderAlertResult {\n");
        sb.append("    errorIds: ").append(toIndentedString(errorIds)).append("\n");
        sb.append("    successIds: ").append(toIndentedString(successIds)).append("\n");
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
