package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceMonitorExtendResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="monitor_switch")
    

    private Boolean monitorSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    

    private Integer period;

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
     * 采集周期，仅在monitor_switch为true时返回。 - 1：采集周期为1s。 - 5：采集周期为5s。
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceMonitorExtendResponse showInstanceMonitorExtendResponse = (ShowInstanceMonitorExtendResponse) o;
        return Objects.equals(this.monitorSwitch, showInstanceMonitorExtendResponse.monitorSwitch) &&
            Objects.equals(this.period, showInstanceMonitorExtendResponse.period);
    }
    @Override
    public int hashCode() {
        return Objects.hash(monitorSwitch, period);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceMonitorExtendResponse {\n");
        sb.append("    monitorSwitch: ").append(toIndentedString(monitorSwitch)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

