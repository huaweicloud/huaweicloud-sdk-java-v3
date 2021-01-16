package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 应用请求平均后端时延时间TOP_n统计信息列表
 */
public class AppAvgBackendLatencyDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="avg_backend_latency")
    
    private Integer avgBackendLatency;

    public AppAvgBackendLatencyDetail withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 调用应用编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public AppAvgBackendLatencyDetail withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AppAvgBackendLatencyDetail withAvgBackendLatency(Integer avgBackendLatency) {
        this.avgBackendLatency = avgBackendLatency;
        return this;
    }

    


    /**
     * 平均后端时延时间
     * @return avgBackendLatency
     */
    public Integer getAvgBackendLatency() {
        return avgBackendLatency;
    }

    public void setAvgBackendLatency(Integer avgBackendLatency) {
        this.avgBackendLatency = avgBackendLatency;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppAvgBackendLatencyDetail appAvgBackendLatencyDetail = (AppAvgBackendLatencyDetail) o;
        return Objects.equals(this.appId, appAvgBackendLatencyDetail.appId) &&
            Objects.equals(this.appName, appAvgBackendLatencyDetail.appName) &&
            Objects.equals(this.avgBackendLatency, appAvgBackendLatencyDetail.avgBackendLatency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, appName, avgBackendLatency);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppAvgBackendLatencyDetail {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    avgBackendLatency: ").append(toIndentedString(avgBackendLatency)).append("\n");
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

