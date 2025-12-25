package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量操作资产返回对象
 */
public class BatchOperateResourceResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_ids")

    private List<String> errorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_ids")

    private List<String> successIds = null;

    public BatchOperateResourceResult withErrorIds(List<String> errorIds) {
        this.errorIds = errorIds;
        return this;
    }

    public BatchOperateResourceResult addErrorIdsItem(String errorIdsItem) {
        if (this.errorIds == null) {
            this.errorIds = new ArrayList<>();
        }
        this.errorIds.add(errorIdsItem);
        return this;
    }

    public BatchOperateResourceResult withErrorIds(Consumer<List<String>> errorIdsSetter) {
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

    public BatchOperateResourceResult withSuccessIds(List<String> successIds) {
        this.successIds = successIds;
        return this;
    }

    public BatchOperateResourceResult addSuccessIdsItem(String successIdsItem) {
        if (this.successIds == null) {
            this.successIds = new ArrayList<>();
        }
        this.successIds.add(successIdsItem);
        return this;
    }

    public BatchOperateResourceResult withSuccessIds(Consumer<List<String>> successIdsSetter) {
        if (this.successIds == null) {
            this.successIds = new ArrayList<>();
        }
        successIdsSetter.accept(this.successIds);
        return this;
    }

    /**
     * 成功id
     * @return successIds
     */
    public List<String> getSuccessIds() {
        return successIds;
    }

    public void setSuccessIds(List<String> successIds) {
        this.successIds = successIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchOperateResourceResult that = (BatchOperateResourceResult) obj;
        return Objects.equals(this.errorIds, that.errorIds) && Objects.equals(this.successIds, that.successIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorIds, successIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchOperateResourceResult {\n");
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
