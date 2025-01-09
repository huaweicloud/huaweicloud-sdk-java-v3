package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自动关闭显示器控制的选项。
 */
public class PoliciesClientAutocloseMonitorOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoclose_monitor_wait_time")

    private Integer autocloseMonitorWaitTime;

    public PoliciesClientAutocloseMonitorOptions withAutocloseMonitorWaitTime(Integer autocloseMonitorWaitTime) {
        this.autocloseMonitorWaitTime = autocloseMonitorWaitTime;
        return this;
    }

    /**
     * 自动关闭显示器等待时间。取值范围为[10-600000]。默认：300。
     * minimum: 10
     * maximum: 600000
     * @return autocloseMonitorWaitTime
     */
    public Integer getAutocloseMonitorWaitTime() {
        return autocloseMonitorWaitTime;
    }

    public void setAutocloseMonitorWaitTime(Integer autocloseMonitorWaitTime) {
        this.autocloseMonitorWaitTime = autocloseMonitorWaitTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesClientAutocloseMonitorOptions that = (PoliciesClientAutocloseMonitorOptions) obj;
        return Objects.equals(this.autocloseMonitorWaitTime, that.autocloseMonitorWaitTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autocloseMonitorWaitTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesClientAutocloseMonitorOptions {\n");
        sb.append("    autocloseMonitorWaitTime: ").append(toIndentedString(autocloseMonitorWaitTime)).append("\n");
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
