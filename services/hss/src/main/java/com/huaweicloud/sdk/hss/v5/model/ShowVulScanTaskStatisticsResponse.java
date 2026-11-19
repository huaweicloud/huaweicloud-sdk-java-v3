package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVulScanTaskStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_task_count")

    private Integer scanTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_scan_task_count")

    private Integer runningScanTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_scan_task")

    private VulScanTaskStatisticsResponseInfoLastScanTask lastScanTask;

    public ShowVulScanTaskStatisticsResponse withScanTaskCount(Integer scanTaskCount) {
        this.scanTaskCount = scanTaskCount;
        return this;
    }

    /**
     * **参数解释**: 漏洞扫描任务总次数 **取值范围**: 最小值0，最大值2147483647 
     * @return scanTaskCount
     */
    public Integer getScanTaskCount() {
        return scanTaskCount;
    }

    public void setScanTaskCount(Integer scanTaskCount) {
        this.scanTaskCount = scanTaskCount;
    }

    public ShowVulScanTaskStatisticsResponse withRunningScanTaskCount(Integer runningScanTaskCount) {
        this.runningScanTaskCount = runningScanTaskCount;
        return this;
    }

    /**
     * **参数解释**: 进行中的漏洞扫描任务次数 **取值范围**: 最小值0，最大值2147483647 
     * @return runningScanTaskCount
     */
    public Integer getRunningScanTaskCount() {
        return runningScanTaskCount;
    }

    public void setRunningScanTaskCount(Integer runningScanTaskCount) {
        this.runningScanTaskCount = runningScanTaskCount;
    }

    public ShowVulScanTaskStatisticsResponse withLastScanTask(
        VulScanTaskStatisticsResponseInfoLastScanTask lastScanTask) {
        this.lastScanTask = lastScanTask;
        return this;
    }

    public ShowVulScanTaskStatisticsResponse withLastScanTask(
        Consumer<VulScanTaskStatisticsResponseInfoLastScanTask> lastScanTaskSetter) {
        if (this.lastScanTask == null) {
            this.lastScanTask = new VulScanTaskStatisticsResponseInfoLastScanTask();
            lastScanTaskSetter.accept(this.lastScanTask);
        }

        return this;
    }

    /**
     * Get lastScanTask
     * @return lastScanTask
     */
    public VulScanTaskStatisticsResponseInfoLastScanTask getLastScanTask() {
        return lastScanTask;
    }

    public void setLastScanTask(VulScanTaskStatisticsResponseInfoLastScanTask lastScanTask) {
        this.lastScanTask = lastScanTask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulScanTaskStatisticsResponse that = (ShowVulScanTaskStatisticsResponse) obj;
        return Objects.equals(this.scanTaskCount, that.scanTaskCount)
            && Objects.equals(this.runningScanTaskCount, that.runningScanTaskCount)
            && Objects.equals(this.lastScanTask, that.lastScanTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanTaskCount, runningScanTaskCount, lastScanTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulScanTaskStatisticsResponse {\n");
        sb.append("    scanTaskCount: ").append(toIndentedString(scanTaskCount)).append("\n");
        sb.append("    runningScanTaskCount: ").append(toIndentedString(runningScanTaskCount)).append("\n");
        sb.append("    lastScanTask: ").append(toIndentedString(lastScanTask)).append("\n");
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
