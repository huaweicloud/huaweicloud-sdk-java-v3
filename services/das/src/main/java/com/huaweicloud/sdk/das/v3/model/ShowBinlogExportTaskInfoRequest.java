package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowBinlogExportTaskInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_task_id")

    private Long exportTaskId;

    public ShowBinlogExportTaskInfoRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 连接ID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public ShowBinlogExportTaskInfoRequest withExportTaskId(Long exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }

    /**
     * 导出任务ID
     * @return exportTaskId
     */
    public Long getExportTaskId() {
        return exportTaskId;
    }

    public void setExportTaskId(Long exportTaskId) {
        this.exportTaskId = exportTaskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBinlogExportTaskInfoRequest that = (ShowBinlogExportTaskInfoRequest) obj;
        return Objects.equals(this.connectionId, that.connectionId)
            && Objects.equals(this.exportTaskId, that.exportTaskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId, exportTaskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBinlogExportTaskInfoRequest {\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    exportTaskId: ").append(toIndentedString(exportTaskId)).append("\n");
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
