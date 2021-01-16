package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 应用请求上行吞吐量TOP_n统计信息
 */
public class AppInputThroughputDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input_throughput")
    
    private Integer inputThroughput;

    public AppInputThroughputDetail withAppId(String appId) {
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

    public AppInputThroughputDetail withAppName(String appName) {
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

    public AppInputThroughputDetail withInputThroughput(Integer inputThroughput) {
        this.inputThroughput = inputThroughput;
        return this;
    }

    


    /**
     * 下行吞吐量汇总
     * @return inputThroughput
     */
    public Integer getInputThroughput() {
        return inputThroughput;
    }

    public void setInputThroughput(Integer inputThroughput) {
        this.inputThroughput = inputThroughput;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppInputThroughputDetail appInputThroughputDetail = (AppInputThroughputDetail) o;
        return Objects.equals(this.appId, appInputThroughputDetail.appId) &&
            Objects.equals(this.appName, appInputThroughputDetail.appName) &&
            Objects.equals(this.inputThroughput, appInputThroughputDetail.inputThroughput);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, appName, inputThroughput);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppInputThroughputDetail {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    inputThroughput: ").append(toIndentedString(inputThroughput)).append("\n");
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

