package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.HealthMonitor;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateHealthMonitorResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="healthmonitor")
    
    private HealthMonitor healthmonitor = null;

    public UpdateHealthMonitorResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID。  注：自动生成 。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateHealthMonitorResponse withHealthmonitor(HealthMonitor healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public UpdateHealthMonitorResponse withHealthmonitor(Consumer<HealthMonitor> healthmonitorSetter) {
        if(this.healthmonitor == null ){
            this.healthmonitor = new HealthMonitor();
            healthmonitorSetter.accept(this.healthmonitor);
        }
        
        return this;
    }


    /**
     * Get healthmonitor
     * @return healthmonitor
     */
    public HealthMonitor getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(HealthMonitor healthmonitor) {
        this.healthmonitor = healthmonitor;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateHealthMonitorResponse updateHealthMonitorResponse = (UpdateHealthMonitorResponse) o;
        return Objects.equals(this.requestId, updateHealthMonitorResponse.requestId) &&
            Objects.equals(this.healthmonitor, updateHealthMonitorResponse.healthmonitor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, healthmonitor);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHealthMonitorResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    healthmonitor: ").append(toIndentedString(healthmonitor)).append("\n");
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

