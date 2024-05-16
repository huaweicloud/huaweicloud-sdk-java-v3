package com.huaweicloud.sdk.codeartsinspector.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchStartHostTasksResponseBodyResults
 */
public class BatchStartHostTasksResponseBodyResults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_id")

    private String scanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    public BatchStartHostTasksResponseBodyResults withScanId(String scanId) {
        this.scanId = scanId;
        return this;
    }

    /**
     * 扫描ID
     * @return scanId
     */
    public String getScanId() {
        return scanId;
    }

    public void setScanId(String scanId) {
        this.scanId = scanId;
    }

    public BatchStartHostTasksResponseBodyResults withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchStartHostTasksResponseBodyResults that = (BatchStartHostTasksResponseBodyResults) obj;
        return Objects.equals(this.scanId, that.scanId) && Objects.equals(this.hostId, that.hostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanId, hostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStartHostTasksResponseBodyResults {\n");
        sb.append("    scanId: ").append(toIndentedString(scanId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
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
