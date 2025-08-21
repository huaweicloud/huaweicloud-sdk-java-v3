package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ListNetworkDiagnosisJobAlarmResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_job_alarms")

    private List<AlarmDetail> networkJobAlarms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListNetworkDiagnosisJobAlarmResponse withNetworkJobAlarms(List<AlarmDetail> networkJobAlarms) {
        this.networkJobAlarms = networkJobAlarms;
        return this;
    }

    public ListNetworkDiagnosisJobAlarmResponse addNetworkJobAlarmsItem(AlarmDetail networkJobAlarmsItem) {
        if (this.networkJobAlarms == null) {
            this.networkJobAlarms = new ArrayList<>();
        }
        this.networkJobAlarms.add(networkJobAlarmsItem);
        return this;
    }

    public ListNetworkDiagnosisJobAlarmResponse withNetworkJobAlarms(
        Consumer<List<AlarmDetail>> networkJobAlarmsSetter) {
        if (this.networkJobAlarms == null) {
            this.networkJobAlarms = new ArrayList<>();
        }
        networkJobAlarmsSetter.accept(this.networkJobAlarms);
        return this;
    }

    /**
     * **参数解释**：网络诊断作业告警列表。
     * @return networkJobAlarms
     */
    public List<AlarmDetail> getNetworkJobAlarms() {
        return networkJobAlarms;
    }

    public void setNetworkJobAlarms(List<AlarmDetail> networkJobAlarms) {
        this.networkJobAlarms = networkJobAlarms;
    }

    public ListNetworkDiagnosisJobAlarmResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：网络诊断作业告警总数。 **取值范围**：不涉及。
     * minimum: 0
     * maximum: 1000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListNetworkDiagnosisJobAlarmResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNetworkDiagnosisJobAlarmResponse that = (ListNetworkDiagnosisJobAlarmResponse) obj;
        return Objects.equals(this.networkJobAlarms, that.networkJobAlarms) && Objects.equals(this.total, that.total)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkJobAlarms, total, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNetworkDiagnosisJobAlarmResponse {\n");
        sb.append("    networkJobAlarms: ").append(toIndentedString(networkJobAlarms)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
