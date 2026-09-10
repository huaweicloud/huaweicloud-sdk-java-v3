package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 全量同步进度信息。
 */
public class SnapshotProgressInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_total")

    private Integer databaseTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_processed")

    private Integer databaseProcessed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_total")

    private Integer schemaTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_processed")

    private Integer schemaProcessed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_total")

    private Integer tableTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_processed")

    private Integer tableProcessed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_progress")

    private List<SnapshotTableProgressInfo> tableProgress = null;

    public SnapshotProgressInfo withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 全量同步整体进度。
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public SnapshotProgressInfo withDatabaseTotal(Integer databaseTotal) {
        this.databaseTotal = databaseTotal;
        return this;
    }

    /**
     * 全量同步的数据库总数，如果是分库分表，则是逻辑库的数量。
     * @return databaseTotal
     */
    public Integer getDatabaseTotal() {
        return databaseTotal;
    }

    public void setDatabaseTotal(Integer databaseTotal) {
        this.databaseTotal = databaseTotal;
    }

    public SnapshotProgressInfo withDatabaseProcessed(Integer databaseProcessed) {
        this.databaseProcessed = databaseProcessed;
        return this;
    }

    /**
     * 全量同步的数据库已读取数量，如果是分库分表，则是已读取的逻辑库数量。
     * @return databaseProcessed
     */
    public Integer getDatabaseProcessed() {
        return databaseProcessed;
    }

    public void setDatabaseProcessed(Integer databaseProcessed) {
        this.databaseProcessed = databaseProcessed;
    }

    public SnapshotProgressInfo withSchemaTotal(Integer schemaTotal) {
        this.schemaTotal = schemaTotal;
        return this;
    }

    /**
     * 全量同步的schema总数，如果是分库分表，则是schema的数量。
     * @return schemaTotal
     */
    public Integer getSchemaTotal() {
        return schemaTotal;
    }

    public void setSchemaTotal(Integer schemaTotal) {
        this.schemaTotal = schemaTotal;
    }

    public SnapshotProgressInfo withSchemaProcessed(Integer schemaProcessed) {
        this.schemaProcessed = schemaProcessed;
        return this;
    }

    /**
     * 全量同步的schema已读取数量，如果是分库分表，则是已读取的schema的数量。
     * @return schemaProcessed
     */
    public Integer getSchemaProcessed() {
        return schemaProcessed;
    }

    public void setSchemaProcessed(Integer schemaProcessed) {
        this.schemaProcessed = schemaProcessed;
    }

    public SnapshotProgressInfo withTableTotal(Integer tableTotal) {
        this.tableTotal = tableTotal;
        return this;
    }

    /**
     * 全量同步的表总数，如果是分库分表，则是逻辑表的数量。
     * @return tableTotal
     */
    public Integer getTableTotal() {
        return tableTotal;
    }

    public void setTableTotal(Integer tableTotal) {
        this.tableTotal = tableTotal;
    }

    public SnapshotProgressInfo withTableProcessed(Integer tableProcessed) {
        this.tableProcessed = tableProcessed;
        return this;
    }

    /**
     * 全量同步的表已读取数量，如果是分库分表，则是已读取的逻辑表的数量。
     * @return tableProcessed
     */
    public Integer getTableProcessed() {
        return tableProcessed;
    }

    public void setTableProcessed(Integer tableProcessed) {
        this.tableProcessed = tableProcessed;
    }

    public SnapshotProgressInfo withTableProgress(List<SnapshotTableProgressInfo> tableProgress) {
        this.tableProgress = tableProgress;
        return this;
    }

    public SnapshotProgressInfo addTableProgressItem(SnapshotTableProgressInfo tableProgressItem) {
        if (this.tableProgress == null) {
            this.tableProgress = new ArrayList<>();
        }
        this.tableProgress.add(tableProgressItem);
        return this;
    }

    public SnapshotProgressInfo withTableProgress(Consumer<List<SnapshotTableProgressInfo>> tableProgressSetter) {
        if (this.tableProgress == null) {
            this.tableProgress = new ArrayList<>();
        }
        tableProgressSetter.accept(this.tableProgress);
        return this;
    }

    /**
     * 表级别全量同步进度，如果是分库分表作业，则第一层为分库分表进度。
     * @return tableProgress
     */
    public List<SnapshotTableProgressInfo> getTableProgress() {
        return tableProgress;
    }

    public void setTableProgress(List<SnapshotTableProgressInfo> tableProgress) {
        this.tableProgress = tableProgress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnapshotProgressInfo that = (SnapshotProgressInfo) obj;
        return Objects.equals(this.progress, that.progress) && Objects.equals(this.databaseTotal, that.databaseTotal)
            && Objects.equals(this.databaseProcessed, that.databaseProcessed)
            && Objects.equals(this.schemaTotal, that.schemaTotal)
            && Objects.equals(this.schemaProcessed, that.schemaProcessed)
            && Objects.equals(this.tableTotal, that.tableTotal)
            && Objects.equals(this.tableProcessed, that.tableProcessed)
            && Objects.equals(this.tableProgress, that.tableProgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progress,
            databaseTotal,
            databaseProcessed,
            schemaTotal,
            schemaProcessed,
            tableTotal,
            tableProcessed,
            tableProgress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotProgressInfo {\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    databaseTotal: ").append(toIndentedString(databaseTotal)).append("\n");
        sb.append("    databaseProcessed: ").append(toIndentedString(databaseProcessed)).append("\n");
        sb.append("    schemaTotal: ").append(toIndentedString(schemaTotal)).append("\n");
        sb.append("    schemaProcessed: ").append(toIndentedString(schemaProcessed)).append("\n");
        sb.append("    tableTotal: ").append(toIndentedString(tableTotal)).append("\n");
        sb.append("    tableProcessed: ").append(toIndentedString(tableProcessed)).append("\n");
        sb.append("    tableProgress: ").append(toIndentedString(tableProgress)).append("\n");
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
