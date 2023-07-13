package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 语法转换或者迁移的数据库对象。
 */
public class DatabaseObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "succeed_count")

    private Long succeedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    private Long failedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignored_count")

    private Long ignoredCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manual_count")

    private Long manualCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_rate")

    private String successRate;

    public DatabaseObject withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 对象类型。
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public DatabaseObject withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 该类型对象的总数。
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public DatabaseObject withSucceedCount(Long succeedCount) {
        this.succeedCount = succeedCount;
        return this;
    }

    /**
     * 成功的对象数量。
     * @return succeedCount
     */
    public Long getSucceedCount() {
        return succeedCount;
    }

    public void setSucceedCount(Long succeedCount) {
        this.succeedCount = succeedCount;
    }

    public DatabaseObject withFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * 失败的对象数量。
     * @return failedCount
     */
    public Long getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
    }

    public DatabaseObject withIgnoredCount(Long ignoredCount) {
        this.ignoredCount = ignoredCount;
        return this;
    }

    /**
     * 忽略的对象数量。
     * @return ignoredCount
     */
    public Long getIgnoredCount() {
        return ignoredCount;
    }

    public void setIgnoredCount(Long ignoredCount) {
        this.ignoredCount = ignoredCount;
    }

    public DatabaseObject withManualCount(Long manualCount) {
        this.manualCount = manualCount;
        return this;
    }

    /**
     * 手动操作的对象数量。
     * @return manualCount
     */
    public Long getManualCount() {
        return manualCount;
    }

    public void setManualCount(Long manualCount) {
        this.manualCount = manualCount;
    }

    public DatabaseObject withSuccessRate(String successRate) {
        this.successRate = successRate;
        return this;
    }

    /**
     * 成功率。
     * @return successRate
     */
    public String getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseObject that = (DatabaseObject) obj;
        return Objects.equals(this.objectType, that.objectType) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.succeedCount, that.succeedCount)
            && Objects.equals(this.failedCount, that.failedCount)
            && Objects.equals(this.ignoredCount, that.ignoredCount)
            && Objects.equals(this.manualCount, that.manualCount) && Objects.equals(this.successRate, that.successRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectType, totalCount, succeedCount, failedCount, ignoredCount, manualCount, successRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseObject {\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    succeedCount: ").append(toIndentedString(succeedCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
        sb.append("    ignoredCount: ").append(toIndentedString(ignoredCount)).append("\n");
        sb.append("    manualCount: ").append(toIndentedString(manualCount)).append("\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
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
