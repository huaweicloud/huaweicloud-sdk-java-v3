package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.AppAvgBackendLatencyDetail;
import com.huaweicloud.sdk.roma.v2.model.AppAvgLatencyDetail;
import com.huaweicloud.sdk.roma.v2.model.AppInputThroughputDetail;
import com.huaweicloud.sdk.roma.v2.model.AppOutputThroughputDetail;
import com.huaweicloud.sdk.roma.v2.model.AppReqCountDetail;
import com.huaweicloud.sdk.roma.v2.model.AppReqCountErrorDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAppUsagesTopNResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="msg")
    
    private String msg;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private Long startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private Long endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_req_count")
    
    private List<AppReqCountDetail> appReqCount = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_req_count_error")
    
    private List<AppReqCountErrorDetail> appReqCountError = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_input_throughput")
    
    private List<AppInputThroughputDetail> appInputThroughput = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_output_throughput")
    
    private List<AppOutputThroughputDetail> appOutputThroughput = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_avg_latency")
    
    private List<AppAvgLatencyDetail> appAvgLatency = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_avg_backend_latency")
    
    private List<AppAvgBackendLatencyDetail> appAvgBackendLatency = null;
    
    public ListAppUsagesTopNResponse withCode(String code) {
        this.code = code;
        return this;
    }

    


    /**
     * 响应码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListAppUsagesTopNResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    


    /**
     * 返回消息
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ListAppUsagesTopNResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 统计起始时间UTC的时间戳
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListAppUsagesTopNResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 统计结束时间UTC的时间戳
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListAppUsagesTopNResponse withAppReqCount(List<AppReqCountDetail> appReqCount) {
        this.appReqCount = appReqCount;
        return this;
    }

    
    public ListAppUsagesTopNResponse addAppReqCountItem(AppReqCountDetail appReqCountItem) {
        if (this.appReqCount == null) {
            this.appReqCount = new ArrayList<>();
        }
        this.appReqCount.add(appReqCountItem);
        return this;
    }

    public ListAppUsagesTopNResponse withAppReqCount(Consumer<List<AppReqCountDetail>> appReqCountSetter) {
        if(this.appReqCount == null ){
            this.appReqCount = new ArrayList<>();
        }
        appReqCountSetter.accept(this.appReqCount);
        return this;
    }

    /**
     * 应用请求次数TOP_n统计信息列表
     * @return appReqCount
     */
    public List<AppReqCountDetail> getAppReqCount() {
        return appReqCount;
    }

    public void setAppReqCount(List<AppReqCountDetail> appReqCount) {
        this.appReqCount = appReqCount;
    }

    public ListAppUsagesTopNResponse withAppReqCountError(List<AppReqCountErrorDetail> appReqCountError) {
        this.appReqCountError = appReqCountError;
        return this;
    }

    
    public ListAppUsagesTopNResponse addAppReqCountErrorItem(AppReqCountErrorDetail appReqCountErrorItem) {
        if (this.appReqCountError == null) {
            this.appReqCountError = new ArrayList<>();
        }
        this.appReqCountError.add(appReqCountErrorItem);
        return this;
    }

    public ListAppUsagesTopNResponse withAppReqCountError(Consumer<List<AppReqCountErrorDetail>> appReqCountErrorSetter) {
        if(this.appReqCountError == null ){
            this.appReqCountError = new ArrayList<>();
        }
        appReqCountErrorSetter.accept(this.appReqCountError);
        return this;
    }

    /**
     * 应用请求错误次数TOP_n统计信息列表
     * @return appReqCountError
     */
    public List<AppReqCountErrorDetail> getAppReqCountError() {
        return appReqCountError;
    }

    public void setAppReqCountError(List<AppReqCountErrorDetail> appReqCountError) {
        this.appReqCountError = appReqCountError;
    }

    public ListAppUsagesTopNResponse withAppInputThroughput(List<AppInputThroughputDetail> appInputThroughput) {
        this.appInputThroughput = appInputThroughput;
        return this;
    }

    
    public ListAppUsagesTopNResponse addAppInputThroughputItem(AppInputThroughputDetail appInputThroughputItem) {
        if (this.appInputThroughput == null) {
            this.appInputThroughput = new ArrayList<>();
        }
        this.appInputThroughput.add(appInputThroughputItem);
        return this;
    }

    public ListAppUsagesTopNResponse withAppInputThroughput(Consumer<List<AppInputThroughputDetail>> appInputThroughputSetter) {
        if(this.appInputThroughput == null ){
            this.appInputThroughput = new ArrayList<>();
        }
        appInputThroughputSetter.accept(this.appInputThroughput);
        return this;
    }

    /**
     * 应用请求上行吞吐量TOP_n统计信息列表
     * @return appInputThroughput
     */
    public List<AppInputThroughputDetail> getAppInputThroughput() {
        return appInputThroughput;
    }

    public void setAppInputThroughput(List<AppInputThroughputDetail> appInputThroughput) {
        this.appInputThroughput = appInputThroughput;
    }

    public ListAppUsagesTopNResponse withAppOutputThroughput(List<AppOutputThroughputDetail> appOutputThroughput) {
        this.appOutputThroughput = appOutputThroughput;
        return this;
    }

    
    public ListAppUsagesTopNResponse addAppOutputThroughputItem(AppOutputThroughputDetail appOutputThroughputItem) {
        if (this.appOutputThroughput == null) {
            this.appOutputThroughput = new ArrayList<>();
        }
        this.appOutputThroughput.add(appOutputThroughputItem);
        return this;
    }

    public ListAppUsagesTopNResponse withAppOutputThroughput(Consumer<List<AppOutputThroughputDetail>> appOutputThroughputSetter) {
        if(this.appOutputThroughput == null ){
            this.appOutputThroughput = new ArrayList<>();
        }
        appOutputThroughputSetter.accept(this.appOutputThroughput);
        return this;
    }

    /**
     * 应用请求下行吞吐量TOP_n统计信息列表
     * @return appOutputThroughput
     */
    public List<AppOutputThroughputDetail> getAppOutputThroughput() {
        return appOutputThroughput;
    }

    public void setAppOutputThroughput(List<AppOutputThroughputDetail> appOutputThroughput) {
        this.appOutputThroughput = appOutputThroughput;
    }

    public ListAppUsagesTopNResponse withAppAvgLatency(List<AppAvgLatencyDetail> appAvgLatency) {
        this.appAvgLatency = appAvgLatency;
        return this;
    }

    
    public ListAppUsagesTopNResponse addAppAvgLatencyItem(AppAvgLatencyDetail appAvgLatencyItem) {
        if (this.appAvgLatency == null) {
            this.appAvgLatency = new ArrayList<>();
        }
        this.appAvgLatency.add(appAvgLatencyItem);
        return this;
    }

    public ListAppUsagesTopNResponse withAppAvgLatency(Consumer<List<AppAvgLatencyDetail>> appAvgLatencySetter) {
        if(this.appAvgLatency == null ){
            this.appAvgLatency = new ArrayList<>();
        }
        appAvgLatencySetter.accept(this.appAvgLatency);
        return this;
    }

    /**
     * 应用平均时延时间TOP_n统计信息列表
     * @return appAvgLatency
     */
    public List<AppAvgLatencyDetail> getAppAvgLatency() {
        return appAvgLatency;
    }

    public void setAppAvgLatency(List<AppAvgLatencyDetail> appAvgLatency) {
        this.appAvgLatency = appAvgLatency;
    }

    public ListAppUsagesTopNResponse withAppAvgBackendLatency(List<AppAvgBackendLatencyDetail> appAvgBackendLatency) {
        this.appAvgBackendLatency = appAvgBackendLatency;
        return this;
    }

    
    public ListAppUsagesTopNResponse addAppAvgBackendLatencyItem(AppAvgBackendLatencyDetail appAvgBackendLatencyItem) {
        if (this.appAvgBackendLatency == null) {
            this.appAvgBackendLatency = new ArrayList<>();
        }
        this.appAvgBackendLatency.add(appAvgBackendLatencyItem);
        return this;
    }

    public ListAppUsagesTopNResponse withAppAvgBackendLatency(Consumer<List<AppAvgBackendLatencyDetail>> appAvgBackendLatencySetter) {
        if(this.appAvgBackendLatency == null ){
            this.appAvgBackendLatency = new ArrayList<>();
        }
        appAvgBackendLatencySetter.accept(this.appAvgBackendLatency);
        return this;
    }

    /**
     * 应用请求平均后端时延时间TOP_n统计信息列表
     * @return appAvgBackendLatency
     */
    public List<AppAvgBackendLatencyDetail> getAppAvgBackendLatency() {
        return appAvgBackendLatency;
    }

    public void setAppAvgBackendLatency(List<AppAvgBackendLatencyDetail> appAvgBackendLatency) {
        this.appAvgBackendLatency = appAvgBackendLatency;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAppUsagesTopNResponse listAppUsagesTopNResponse = (ListAppUsagesTopNResponse) o;
        return Objects.equals(this.code, listAppUsagesTopNResponse.code) &&
            Objects.equals(this.msg, listAppUsagesTopNResponse.msg) &&
            Objects.equals(this.startTime, listAppUsagesTopNResponse.startTime) &&
            Objects.equals(this.endTime, listAppUsagesTopNResponse.endTime) &&
            Objects.equals(this.appReqCount, listAppUsagesTopNResponse.appReqCount) &&
            Objects.equals(this.appReqCountError, listAppUsagesTopNResponse.appReqCountError) &&
            Objects.equals(this.appInputThroughput, listAppUsagesTopNResponse.appInputThroughput) &&
            Objects.equals(this.appOutputThroughput, listAppUsagesTopNResponse.appOutputThroughput) &&
            Objects.equals(this.appAvgLatency, listAppUsagesTopNResponse.appAvgLatency) &&
            Objects.equals(this.appAvgBackendLatency, listAppUsagesTopNResponse.appAvgBackendLatency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(code, msg, startTime, endTime, appReqCount, appReqCountError, appInputThroughput, appOutputThroughput, appAvgLatency, appAvgBackendLatency);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppUsagesTopNResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    appReqCount: ").append(toIndentedString(appReqCount)).append("\n");
        sb.append("    appReqCountError: ").append(toIndentedString(appReqCountError)).append("\n");
        sb.append("    appInputThroughput: ").append(toIndentedString(appInputThroughput)).append("\n");
        sb.append("    appOutputThroughput: ").append(toIndentedString(appOutputThroughput)).append("\n");
        sb.append("    appAvgLatency: ").append(toIndentedString(appAvgLatency)).append("\n");
        sb.append("    appAvgBackendLatency: ").append(toIndentedString(appAvgBackendLatency)).append("\n");
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

