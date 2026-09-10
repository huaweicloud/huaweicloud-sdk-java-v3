package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表级别全量同步进度。
 */
public class SnapshotTableProgressInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records_read")

    private Long recordsRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_table")

    private Boolean logicTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_table_progress")

    private List<SnapshotTableProgressInfo> subTableProgress = null;

    public SnapshotTableProgressInfo withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 单表全量同步进度。
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public SnapshotTableProgressInfo withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名或者逻辑库名。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public SnapshotTableProgressInfo withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * 表名或者逻辑表名。
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public SnapshotTableProgressInfo withRecordsRead(Long recordsRead) {
        this.recordsRead = recordsRead;
        return this;
    }

    /**
     * 读取的表的数据条数。
     * @return recordsRead
     */
    public Long getRecordsRead() {
        return recordsRead;
    }

    public void setRecordsRead(Long recordsRead) {
        this.recordsRead = recordsRead;
    }

    public SnapshotTableProgressInfo withLogicTable(Boolean logicTable) {
        this.logicTable = logicTable;
        return this;
    }

    /**
     * 是否是逻辑表。
     * @return logicTable
     */
    public Boolean getLogicTable() {
        return logicTable;
    }

    public void setLogicTable(Boolean logicTable) {
        this.logicTable = logicTable;
    }

    public SnapshotTableProgressInfo withSubTableProgress(List<SnapshotTableProgressInfo> subTableProgress) {
        this.subTableProgress = subTableProgress;
        return this;
    }

    public SnapshotTableProgressInfo addSubTableProgressItem(SnapshotTableProgressInfo subTableProgressItem) {
        if (this.subTableProgress == null) {
            this.subTableProgress = new ArrayList<>();
        }
        this.subTableProgress.add(subTableProgressItem);
        return this;
    }

    public SnapshotTableProgressInfo withSubTableProgress(
        Consumer<List<SnapshotTableProgressInfo>> subTableProgressSetter) {
        if (this.subTableProgress == null) {
            this.subTableProgress = new ArrayList<>();
        }
        subTableProgressSetter.accept(this.subTableProgress);
        return this;
    }

    /**
     * 表级别全量同步进度，如果是分库分表作业，则这里为各个子表的同步进度。
     * @return subTableProgress
     */
    public List<SnapshotTableProgressInfo> getSubTableProgress() {
        return subTableProgress;
    }

    public void setSubTableProgress(List<SnapshotTableProgressInfo> subTableProgress) {
        this.subTableProgress = subTableProgress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnapshotTableProgressInfo that = (SnapshotTableProgressInfo) obj;
        return Objects.equals(this.progress, that.progress) && Objects.equals(this.database, that.database)
            && Objects.equals(this.table, that.table) && Objects.equals(this.recordsRead, that.recordsRead)
            && Objects.equals(this.logicTable, that.logicTable)
            && Objects.equals(this.subTableProgress, that.subTableProgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progress, database, table, recordsRead, logicTable, subTableProgress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotTableProgressInfo {\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    recordsRead: ").append(toIndentedString(recordsRead)).append("\n");
        sb.append("    logicTable: ").append(toIndentedString(logicTable)).append("\n");
        sb.append("    subTableProgress: ").append(toIndentedString(subTableProgress)).append("\n");
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
