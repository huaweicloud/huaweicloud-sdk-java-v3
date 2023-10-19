package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateRestoreTablesRequestBody
 */
public class CreateRestoreTablesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private String restoreTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_table_info")

    private String lastTableInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_tables")

    private List<CreateRestoreDatabaseTableInfo> restoreTables = null;

    public CreateRestoreTablesRequestBody withRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * 备份时间点，时间戳格式。
     * @return restoreTime
     */
    public String getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
    }

    public CreateRestoreTablesRequestBody withLastTableInfo(String lastTableInfo) {
        this.lastTableInfo = lastTableInfo;
        return this;
    }

    /**
     * 是否是最新库表。默认为false。 - true：是最新库表。 - false：是恢复时间点库表。
     * @return lastTableInfo
     */
    public String getLastTableInfo() {
        return lastTableInfo;
    }

    public void setLastTableInfo(String lastTableInfo) {
        this.lastTableInfo = lastTableInfo;
    }

    public CreateRestoreTablesRequestBody withRestoreTables(List<CreateRestoreDatabaseTableInfo> restoreTables) {
        this.restoreTables = restoreTables;
        return this;
    }

    public CreateRestoreTablesRequestBody addRestoreTablesItem(CreateRestoreDatabaseTableInfo restoreTablesItem) {
        if (this.restoreTables == null) {
            this.restoreTables = new ArrayList<>();
        }
        this.restoreTables.add(restoreTablesItem);
        return this;
    }

    public CreateRestoreTablesRequestBody withRestoreTables(
        Consumer<List<CreateRestoreDatabaseTableInfo>> restoreTablesSetter) {
        if (this.restoreTables == null) {
            this.restoreTables = new ArrayList<>();
        }
        restoreTablesSetter.accept(this.restoreTables);
        return this;
    }

    /**
     * 数据库信息。
     * @return restoreTables
     */
    public List<CreateRestoreDatabaseTableInfo> getRestoreTables() {
        return restoreTables;
    }

    public void setRestoreTables(List<CreateRestoreDatabaseTableInfo> restoreTables) {
        this.restoreTables = restoreTables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRestoreTablesRequestBody that = (CreateRestoreTablesRequestBody) obj;
        return Objects.equals(this.restoreTime, that.restoreTime)
            && Objects.equals(this.lastTableInfo, that.lastTableInfo)
            && Objects.equals(this.restoreTables, that.restoreTables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreTime, lastTableInfo, restoreTables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRestoreTablesRequestBody {\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
        sb.append("    lastTableInfo: ").append(toIndentedString(lastTableInfo)).append("\n");
        sb.append("    restoreTables: ").append(toIndentedString(restoreTables)).append("\n");
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
