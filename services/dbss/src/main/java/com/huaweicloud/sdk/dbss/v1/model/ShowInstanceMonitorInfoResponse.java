package com.huaweicloud.sdk.dbss.v1.model;

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
public class ShowInstanceMonitorInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_infos")

    private DiskInfo diskInfos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_infos")

    private List<SystemInfo> systemInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_infos")

    private List<TrafficInfo> trafficInfos = null;

    public ShowInstanceMonitorInfoResponse withDiskInfos(DiskInfo diskInfos) {
        this.diskInfos = diskInfos;
        return this;
    }

    public ShowInstanceMonitorInfoResponse withDiskInfos(Consumer<DiskInfo> diskInfosSetter) {
        if (this.diskInfos == null) {
            this.diskInfos = new DiskInfo();
            diskInfosSetter.accept(this.diskInfos);
        }

        return this;
    }

    /**
     * Get diskInfos
     * @return diskInfos
     */
    public DiskInfo getDiskInfos() {
        return diskInfos;
    }

    public void setDiskInfos(DiskInfo diskInfos) {
        this.diskInfos = diskInfos;
    }

    public ShowInstanceMonitorInfoResponse withSystemInfos(List<SystemInfo> systemInfos) {
        this.systemInfos = systemInfos;
        return this;
    }

    public ShowInstanceMonitorInfoResponse addSystemInfosItem(SystemInfo systemInfosItem) {
        if (this.systemInfos == null) {
            this.systemInfos = new ArrayList<>();
        }
        this.systemInfos.add(systemInfosItem);
        return this;
    }

    public ShowInstanceMonitorInfoResponse withSystemInfos(Consumer<List<SystemInfo>> systemInfosSetter) {
        if (this.systemInfos == null) {
            this.systemInfos = new ArrayList<>();
        }
        systemInfosSetter.accept(this.systemInfos);
        return this;
    }

    /**
     * 系统信息
     * @return systemInfos
     */
    public List<SystemInfo> getSystemInfos() {
        return systemInfos;
    }

    public void setSystemInfos(List<SystemInfo> systemInfos) {
        this.systemInfos = systemInfos;
    }

    public ShowInstanceMonitorInfoResponse withTrafficInfos(List<TrafficInfo> trafficInfos) {
        this.trafficInfos = trafficInfos;
        return this;
    }

    public ShowInstanceMonitorInfoResponse addTrafficInfosItem(TrafficInfo trafficInfosItem) {
        if (this.trafficInfos == null) {
            this.trafficInfos = new ArrayList<>();
        }
        this.trafficInfos.add(trafficInfosItem);
        return this;
    }

    public ShowInstanceMonitorInfoResponse withTrafficInfos(Consumer<List<TrafficInfo>> trafficInfosSetter) {
        if (this.trafficInfos == null) {
            this.trafficInfos = new ArrayList<>();
        }
        trafficInfosSetter.accept(this.trafficInfos);
        return this;
    }

    /**
     * 流量统计
     * @return trafficInfos
     */
    public List<TrafficInfo> getTrafficInfos() {
        return trafficInfos;
    }

    public void setTrafficInfos(List<TrafficInfo> trafficInfos) {
        this.trafficInfos = trafficInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceMonitorInfoResponse that = (ShowInstanceMonitorInfoResponse) obj;
        return Objects.equals(this.diskInfos, that.diskInfos) && Objects.equals(this.systemInfos, that.systemInfos)
            && Objects.equals(this.trafficInfos, that.trafficInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diskInfos, systemInfos, trafficInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceMonitorInfoResponse {\n");
        sb.append("    diskInfos: ").append(toIndentedString(diskInfos)).append("\n");
        sb.append("    systemInfos: ").append(toIndentedString(systemInfos)).append("\n");
        sb.append("    trafficInfos: ").append(toIndentedString(trafficInfos)).append("\n");
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
