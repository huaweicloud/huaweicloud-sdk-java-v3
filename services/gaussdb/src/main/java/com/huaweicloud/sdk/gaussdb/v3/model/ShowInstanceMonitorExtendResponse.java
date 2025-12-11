package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceMonitorExtendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_switch")

    private Boolean monitorSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Integer period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow")

    private Boolean allow;

    public ShowInstanceMonitorExtendResponse withMonitorSwitch(Boolean monitorSwitch) {
        this.monitorSwitch = monitorSwitch;
        return this;
    }

    /**
     * 实例秒级监控开关。  - true，表示开启。 - false，表示关闭。
     * @return monitorSwitch
     */
    public Boolean getMonitorSwitch() {
        return monitorSwitch;
    }

    public void setMonitorSwitch(Boolean monitorSwitch) {
        this.monitorSwitch = monitorSwitch;
    }

    public ShowInstanceMonitorExtendResponse withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 采集周期，仅在monitor_switch为true时返回。  - 1：采集周期为1s。 - 5：采集周期为5s。
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public ShowInstanceMonitorExtendResponse withAllow(Boolean allow) {
        this.allow = allow;
        return this;
    }

    /**
     * **参数解释**：  能否开启秒级监控。  **取值范围**： - true: 可以开启。 - false：不能开启，8vcpu以下规格不允许开启秒级监控。
     * @return allow
     */
    public Boolean getAllow() {
        return allow;
    }

    public void setAllow(Boolean allow) {
        this.allow = allow;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceMonitorExtendResponse that = (ShowInstanceMonitorExtendResponse) obj;
        return Objects.equals(this.monitorSwitch, that.monitorSwitch) && Objects.equals(this.period, that.period)
            && Objects.equals(this.allow, that.allow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monitorSwitch, period, allow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceMonitorExtendResponse {\n");
        sb.append("    monitorSwitch: ").append(toIndentedString(monitorSwitch)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
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
