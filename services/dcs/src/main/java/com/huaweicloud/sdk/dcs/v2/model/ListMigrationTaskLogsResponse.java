package com.huaweicloud.sdk.dcs.v2.model;

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
public class ListMigrationTaskLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_num")

    private Integer logNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_logs")

    private List<MigrationLog> migrationLogs = null;

    public ListMigrationTaskLogsResponse withLogNum(Integer logNum) {
        this.logNum = logNum;
        return this;
    }

    /**
     * 日志条数
     * @return logNum
     */
    public Integer getLogNum() {
        return logNum;
    }

    public void setLogNum(Integer logNum) {
        this.logNum = logNum;
    }

    public ListMigrationTaskLogsResponse withMigrationLogs(List<MigrationLog> migrationLogs) {
        this.migrationLogs = migrationLogs;
        return this;
    }

    public ListMigrationTaskLogsResponse addMigrationLogsItem(MigrationLog migrationLogsItem) {
        if (this.migrationLogs == null) {
            this.migrationLogs = new ArrayList<>();
        }
        this.migrationLogs.add(migrationLogsItem);
        return this;
    }

    public ListMigrationTaskLogsResponse withMigrationLogs(Consumer<List<MigrationLog>> migrationLogsSetter) {
        if (this.migrationLogs == null) {
            this.migrationLogs = new ArrayList<>();
        }
        migrationLogsSetter.accept(this.migrationLogs);
        return this;
    }

    /**
     * 日志列表
     * @return migrationLogs
     */
    public List<MigrationLog> getMigrationLogs() {
        return migrationLogs;
    }

    public void setMigrationLogs(List<MigrationLog> migrationLogs) {
        this.migrationLogs = migrationLogs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMigrationTaskLogsResponse that = (ListMigrationTaskLogsResponse) obj;
        return Objects.equals(this.logNum, that.logNum) && Objects.equals(this.migrationLogs, that.migrationLogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logNum, migrationLogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMigrationTaskLogsResponse {\n");
        sb.append("    logNum: ").append(toIndentedString(logNum)).append("\n");
        sb.append("    migrationLogs: ").append(toIndentedString(migrationLogs)).append("\n");
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
