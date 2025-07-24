package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FaultHostInfo
 */
public class FaultHostInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault_date")

    private OffsetDateTime faultDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_fault_host")

    private Integer newFaultHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault_host")

    private List<String> faultHost = null;

    public FaultHostInfo withFaultDate(OffsetDateTime faultDate) {
        this.faultDate = faultDate;
        return this;
    }

    /**
     * 告警时间
     * @return faultDate
     */
    public OffsetDateTime getFaultDate() {
        return faultDate;
    }

    public void setFaultDate(OffsetDateTime faultDate) {
        this.faultDate = faultDate;
    }

    public FaultHostInfo withNewFaultHost(Integer newFaultHost) {
        this.newFaultHost = newFaultHost;
        return this;
    }

    /**
     * 新增故障机器数
     * @return newFaultHost
     */
    public Integer getNewFaultHost() {
        return newFaultHost;
    }

    public void setNewFaultHost(Integer newFaultHost) {
        this.newFaultHost = newFaultHost;
    }

    public FaultHostInfo withFaultHost(List<String> faultHost) {
        this.faultHost = faultHost;
        return this;
    }

    public FaultHostInfo addFaultHostItem(String faultHostItem) {
        if (this.faultHost == null) {
            this.faultHost = new ArrayList<>();
        }
        this.faultHost.add(faultHostItem);
        return this;
    }

    public FaultHostInfo withFaultHost(Consumer<List<String>> faultHostSetter) {
        if (this.faultHost == null) {
            this.faultHost = new ArrayList<>();
        }
        faultHostSetter.accept(this.faultHost);
        return this;
    }

    /**
     * 故障机器SN
     * @return faultHost
     */
    public List<String> getFaultHost() {
        return faultHost;
    }

    public void setFaultHost(List<String> faultHost) {
        this.faultHost = faultHost;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FaultHostInfo that = (FaultHostInfo) obj;
        return Objects.equals(this.faultDate, that.faultDate) && Objects.equals(this.newFaultHost, that.newFaultHost)
            && Objects.equals(this.faultHost, that.faultHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faultDate, newFaultHost, faultHost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaultHostInfo {\n");
        sb.append("    faultDate: ").append(toIndentedString(faultDate)).append("\n");
        sb.append("    newFaultHost: ").append(toIndentedString(newFaultHost)).append("\n");
        sb.append("    faultHost: ").append(toIndentedString(faultHost)).append("\n");
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
