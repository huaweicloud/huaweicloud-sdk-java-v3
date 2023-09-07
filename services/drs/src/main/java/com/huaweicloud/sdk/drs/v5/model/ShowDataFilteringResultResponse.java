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
public class ShowDataFilteringResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Long successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    private Long failedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_object_filtering_result")

    private List<DbObjectFilteringResult> dbObjectFilteringResult = null;

    public ShowDataFilteringResultResponse withSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 数据过滤规则校验成功的数量
     * @return successCount
     */
    public Long getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Long successCount) {
        this.successCount = successCount;
    }

    public ShowDataFilteringResultResponse withFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * 数据过滤规则校验失败的数量
     * @return failedCount
     */
    public Long getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
    }

    public ShowDataFilteringResultResponse withDbObjectFilteringResult(
        List<DbObjectFilteringResult> dbObjectFilteringResult) {
        this.dbObjectFilteringResult = dbObjectFilteringResult;
        return this;
    }

    public ShowDataFilteringResultResponse addDbObjectFilteringResultItem(
        DbObjectFilteringResult dbObjectFilteringResultItem) {
        if (this.dbObjectFilteringResult == null) {
            this.dbObjectFilteringResult = new ArrayList<>();
        }
        this.dbObjectFilteringResult.add(dbObjectFilteringResultItem);
        return this;
    }

    public ShowDataFilteringResultResponse withDbObjectFilteringResult(
        Consumer<List<DbObjectFilteringResult>> dbObjectFilteringResultSetter) {
        if (this.dbObjectFilteringResult == null) {
            this.dbObjectFilteringResult = new ArrayList<>();
        }
        dbObjectFilteringResultSetter.accept(this.dbObjectFilteringResult);
        return this;
    }

    /**
     * 库表过滤规则校验结果
     * @return dbObjectFilteringResult
     */
    public List<DbObjectFilteringResult> getDbObjectFilteringResult() {
        return dbObjectFilteringResult;
    }

    public void setDbObjectFilteringResult(List<DbObjectFilteringResult> dbObjectFilteringResult) {
        this.dbObjectFilteringResult = dbObjectFilteringResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDataFilteringResultResponse that = (ShowDataFilteringResultResponse) obj;
        return Objects.equals(this.successCount, that.successCount)
            && Objects.equals(this.failedCount, that.failedCount)
            && Objects.equals(this.dbObjectFilteringResult, that.dbObjectFilteringResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successCount, failedCount, dbObjectFilteringResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataFilteringResultResponse {\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
        sb.append("    dbObjectFilteringResult: ").append(toIndentedString(dbObjectFilteringResult)).append("\n");
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
