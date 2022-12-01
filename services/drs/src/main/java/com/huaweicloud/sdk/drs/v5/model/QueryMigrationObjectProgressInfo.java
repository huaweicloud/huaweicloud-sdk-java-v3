package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 迁移中对象进度信息体。
 */
public class QueryMigrationObjectProgressInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_object_overview")

    private List<MigrationObjectOverviewInfo> migrationObjectOverview = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private LocalDate createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_start_time")

    private LocalDate fullStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_complete_time")

    private LocalDate fullCompleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incr_start_time")

    private LocalDate incrStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public QueryMigrationObjectProgressInfo withMigrationObjectOverview(
        List<MigrationObjectOverviewInfo> migrationObjectOverview) {
        this.migrationObjectOverview = migrationObjectOverview;
        return this;
    }

    public QueryMigrationObjectProgressInfo addMigrationObjectOverviewItem(
        MigrationObjectOverviewInfo migrationObjectOverviewItem) {
        if (this.migrationObjectOverview == null) {
            this.migrationObjectOverview = new ArrayList<>();
        }
        this.migrationObjectOverview.add(migrationObjectOverviewItem);
        return this;
    }

    public QueryMigrationObjectProgressInfo withMigrationObjectOverview(
        Consumer<List<MigrationObjectOverviewInfo>> migrationObjectOverviewSetter) {
        if (this.migrationObjectOverview == null) {
            this.migrationObjectOverview = new ArrayList<>();
        }
        migrationObjectOverviewSetter.accept(this.migrationObjectOverview);
        return this;
    }

    /**
     * 概览详情。
     * @return migrationObjectOverview
     */
    public List<MigrationObjectOverviewInfo> getMigrationObjectOverview() {
        return migrationObjectOverview;
    }

    public void setMigrationObjectOverview(List<MigrationObjectOverviewInfo> migrationObjectOverview) {
        this.migrationObjectOverview = migrationObjectOverview;
    }

    public QueryMigrationObjectProgressInfo withCreateTime(LocalDate createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 数据生成时间。
     * @return createTime
     */
    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public QueryMigrationObjectProgressInfo withFullStartTime(LocalDate fullStartTime) {
        this.fullStartTime = fullStartTime;
        return this;
    }

    /**
     * 全量开始时间。
     * @return fullStartTime
     */
    public LocalDate getFullStartTime() {
        return fullStartTime;
    }

    public void setFullStartTime(LocalDate fullStartTime) {
        this.fullStartTime = fullStartTime;
    }

    public QueryMigrationObjectProgressInfo withFullCompleteTime(LocalDate fullCompleteTime) {
        this.fullCompleteTime = fullCompleteTime;
        return this;
    }

    /**
     * 全量完成时间。
     * @return fullCompleteTime
     */
    public LocalDate getFullCompleteTime() {
        return fullCompleteTime;
    }

    public void setFullCompleteTime(LocalDate fullCompleteTime) {
        this.fullCompleteTime = fullCompleteTime;
    }

    public QueryMigrationObjectProgressInfo withIncrStartTime(LocalDate incrStartTime) {
        this.incrStartTime = incrStartTime;
        return this;
    }

    /**
     * 增量开始时间。
     * @return incrStartTime
     */
    public LocalDate getIncrStartTime() {
        return incrStartTime;
    }

    public void setIncrStartTime(LocalDate incrStartTime) {
        this.incrStartTime = incrStartTime;
    }

    public QueryMigrationObjectProgressInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryMigrationObjectProgressInfo queryMigrationObjectProgressInfo = (QueryMigrationObjectProgressInfo) o;
        return Objects.equals(this.migrationObjectOverview, queryMigrationObjectProgressInfo.migrationObjectOverview)
            && Objects.equals(this.createTime, queryMigrationObjectProgressInfo.createTime)
            && Objects.equals(this.fullStartTime, queryMigrationObjectProgressInfo.fullStartTime)
            && Objects.equals(this.fullCompleteTime, queryMigrationObjectProgressInfo.fullCompleteTime)
            && Objects.equals(this.incrStartTime, queryMigrationObjectProgressInfo.incrStartTime)
            && Objects.equals(this.endTime, queryMigrationObjectProgressInfo.endTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(migrationObjectOverview, createTime, fullStartTime, fullCompleteTime, incrStartTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryMigrationObjectProgressInfo {\n");
        sb.append("    migrationObjectOverview: ").append(toIndentedString(migrationObjectOverview)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    fullStartTime: ").append(toIndentedString(fullStartTime)).append("\n");
        sb.append("    fullCompleteTime: ").append(toIndentedString(fullCompleteTime)).append("\n");
        sb.append("    incrStartTime: ").append(toIndentedString(incrStartTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
