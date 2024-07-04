package com.huaweicloud.sdk.vias.v2.model;

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
public class UpdateBatchTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    private Integer failedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "succeed_count")

    private Integer succeedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_list")

    private List<String> errorList = null;

    public UpdateBatchTaskResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 作业总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public UpdateBatchTaskResponse withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * 失败作业数量
     * @return failedCount
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    public UpdateBatchTaskResponse withSucceedCount(Integer succeedCount) {
        this.succeedCount = succeedCount;
        return this;
    }

    /**
     * 成功作业数量
     * @return succeedCount
     */
    public Integer getSucceedCount() {
        return succeedCount;
    }

    public void setSucceedCount(Integer succeedCount) {
        this.succeedCount = succeedCount;
    }

    public UpdateBatchTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 批量作业id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateBatchTaskResponse withErrorList(List<String> errorList) {
        this.errorList = errorList;
        return this;
    }

    public UpdateBatchTaskResponse addErrorListItem(String errorListItem) {
        if (this.errorList == null) {
            this.errorList = new ArrayList<>();
        }
        this.errorList.add(errorListItem);
        return this;
    }

    public UpdateBatchTaskResponse withErrorList(Consumer<List<String>> errorListSetter) {
        if (this.errorList == null) {
            this.errorList = new ArrayList<>();
        }
        errorListSetter.accept(this.errorList);
        return this;
    }

    /**
     * 错误信息列表
     * @return errorList
     */
    public List<String> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBatchTaskResponse that = (UpdateBatchTaskResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.failedCount, that.failedCount)
            && Objects.equals(this.succeedCount, that.succeedCount) && Objects.equals(this.id, that.id)
            && Objects.equals(this.errorList, that.errorList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, failedCount, succeedCount, id, errorList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBatchTaskResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
        sb.append("    succeedCount: ").append(toIndentedString(succeedCount)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
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
