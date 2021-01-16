package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 应用请求平均时延时间TOP_n统计信息列表
 */
public class AppAvgLatencyDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="avg_latency")
    
    private Integer avgLatency;

    public AppAvgLatencyDetail withAppId(String appId) {
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

    public AppAvgLatencyDetail withAppName(String appName) {
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

    public AppAvgLatencyDetail withAvgLatency(Integer avgLatency) {
        this.avgLatency = avgLatency;
        return this;
    }

    


    /**
     * 平均时延时间
     * @return avgLatency
     */
    public Integer getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(Integer avgLatency) {
        this.avgLatency = avgLatency;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppAvgLatencyDetail appAvgLatencyDetail = (AppAvgLatencyDetail) o;
        return Objects.equals(this.appId, appAvgLatencyDetail.appId) &&
            Objects.equals(this.appName, appAvgLatencyDetail.appName) &&
            Objects.equals(this.avgLatency, appAvgLatencyDetail.avgLatency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, appName, avgLatency);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppAvgLatencyDetail {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    avgLatency: ").append(toIndentedString(avgLatency)).append("\n");
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

