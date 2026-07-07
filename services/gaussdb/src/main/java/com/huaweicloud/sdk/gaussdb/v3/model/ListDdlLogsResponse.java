package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ListDdlLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl_logs")

    private List<DdlLogInfo> ddlLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_status")

    private String switchStatus;

    public ListDdlLogsResponse withDdlLogs(List<DdlLogInfo> ddlLogs) {
        this.ddlLogs = ddlLogs;
        return this;
    }

    public ListDdlLogsResponse addDdlLogsItem(DdlLogInfo ddlLogsItem) {
        if (this.ddlLogs == null) {
            this.ddlLogs = new ArrayList<>();
        }
        this.ddlLogs.add(ddlLogsItem);
        return this;
    }

    public ListDdlLogsResponse withDdlLogs(Consumer<List<DdlLogInfo>> ddlLogsSetter) {
        if (this.ddlLogs == null) {
            this.ddlLogs = new ArrayList<>();
        }
        ddlLogsSetter.accept(this.ddlLogs);
        return this;
    }

    /**
     * **参数解释**：  DDL下载日志列表。  **取值范围**：  不涉及。 
     * @return ddlLogs
     */
    public List<DdlLogInfo> getDdlLogs() {
        return ddlLogs;
    }

    public void setDdlLogs(List<DdlLogInfo> ddlLogs) {
        this.ddlLogs = ddlLogs;
    }

    public ListDdlLogsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**：  总条数。  **取值范围**：  不涉及。 
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListDdlLogsResponse withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * **参数解释**：  日志保留天数。  **取值范围**：  不涉及。 
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public ListDdlLogsResponse withSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }

    /**
     * **参数解释**：  DDL日志下载开关状态。  **取值范围**：  - ON，开启。 - OFF，关闭。 
     * @return switchStatus
     */
    public String getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDdlLogsResponse that = (ListDdlLogsResponse) obj;
        return Objects.equals(this.ddlLogs, that.ddlLogs) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.keepDays, that.keepDays) && Objects.equals(this.switchStatus, that.switchStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ddlLogs, totalCount, keepDays, switchStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDdlLogsResponse {\n");
        sb.append("    ddlLogs: ").append(toIndentedString(ddlLogs)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
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
