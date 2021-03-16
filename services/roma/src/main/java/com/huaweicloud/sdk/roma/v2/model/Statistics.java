package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Statistics
 */
public class Statistics  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_latency")
    
    private Integer maxLatency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="avg_latency")
    
    private Integer avgLatency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_inner_latency")
    
    private Integer maxInnerLatency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="avg_inner_latency")
    
    private Integer avgInnerLatency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_backend_latency")
    
    private Integer maxBackendLatency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="avg_backend_latency")
    
    private Integer avgBackendLatency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_count")
    
    private Integer reqCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_count2xx")
    
    private Integer reqCount2xx;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_count4xx")
    
    private Integer reqCount4xx;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_count5xx")
    
    private Integer reqCount5xx;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_count_error")
    
    private Integer reqCountError;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_throughput")
    
    private Integer outputThroughput;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input_throughput")
    
    private Integer inputThroughput;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="current_minute")
    
    private Long currentMinute;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_time")
    
    private String reqTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cycle")
    
    private String cycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_app_id")
    
    private String romaAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_id")
    
    private String apiId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider")
    
    private String provider;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="register_time")
    
    private String registerTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

    public Statistics withMaxLatency(Integer maxLatency) {
        this.maxLatency = maxLatency;
        return this;
    }

    


    /**
     * 最大时延时间
     * @return maxLatency
     */
    public Integer getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(Integer maxLatency) {
        this.maxLatency = maxLatency;
    }

    

    public Statistics withAvgLatency(Integer avgLatency) {
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

    

    public Statistics withMaxInnerLatency(Integer maxInnerLatency) {
        this.maxInnerLatency = maxInnerLatency;
        return this;
    }

    


    /**
     * 最大内部时延时间
     * @return maxInnerLatency
     */
    public Integer getMaxInnerLatency() {
        return maxInnerLatency;
    }

    public void setMaxInnerLatency(Integer maxInnerLatency) {
        this.maxInnerLatency = maxInnerLatency;
    }

    

    public Statistics withAvgInnerLatency(Integer avgInnerLatency) {
        this.avgInnerLatency = avgInnerLatency;
        return this;
    }

    


    /**
     * 平均内部时延时间
     * @return avgInnerLatency
     */
    public Integer getAvgInnerLatency() {
        return avgInnerLatency;
    }

    public void setAvgInnerLatency(Integer avgInnerLatency) {
        this.avgInnerLatency = avgInnerLatency;
    }

    

    public Statistics withMaxBackendLatency(Integer maxBackendLatency) {
        this.maxBackendLatency = maxBackendLatency;
        return this;
    }

    


    /**
     * 最大后端时延时间
     * @return maxBackendLatency
     */
    public Integer getMaxBackendLatency() {
        return maxBackendLatency;
    }

    public void setMaxBackendLatency(Integer maxBackendLatency) {
        this.maxBackendLatency = maxBackendLatency;
    }

    

    public Statistics withAvgBackendLatency(Integer avgBackendLatency) {
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

    

    public Statistics withReqCount(Integer reqCount) {
        this.reqCount = reqCount;
        return this;
    }

    


    /**
     * 请求总次数
     * @return reqCount
     */
    public Integer getReqCount() {
        return reqCount;
    }

    public void setReqCount(Integer reqCount) {
        this.reqCount = reqCount;
    }

    

    public Statistics withReqCount2xx(Integer reqCount2xx) {
        this.reqCount2xx = reqCount2xx;
        return this;
    }

    


    /**
     * 请求为2xx响应码总次数
     * @return reqCount2xx
     */
    public Integer getReqCount2xx() {
        return reqCount2xx;
    }

    public void setReqCount2xx(Integer reqCount2xx) {
        this.reqCount2xx = reqCount2xx;
    }

    

    public Statistics withReqCount4xx(Integer reqCount4xx) {
        this.reqCount4xx = reqCount4xx;
        return this;
    }

    


    /**
     * 请求为4xx响应码总次数
     * @return reqCount4xx
     */
    public Integer getReqCount4xx() {
        return reqCount4xx;
    }

    public void setReqCount4xx(Integer reqCount4xx) {
        this.reqCount4xx = reqCount4xx;
    }

    

    public Statistics withReqCount5xx(Integer reqCount5xx) {
        this.reqCount5xx = reqCount5xx;
        return this;
    }

    


    /**
     * 请求为5xx响应码总次数
     * @return reqCount5xx
     */
    public Integer getReqCount5xx() {
        return reqCount5xx;
    }

    public void setReqCount5xx(Integer reqCount5xx) {
        this.reqCount5xx = reqCount5xx;
    }

    

    public Statistics withReqCountError(Integer reqCountError) {
        this.reqCountError = reqCountError;
        return this;
    }

    


    /**
     * 请求错误总次数
     * @return reqCountError
     */
    public Integer getReqCountError() {
        return reqCountError;
    }

    public void setReqCountError(Integer reqCountError) {
        this.reqCountError = reqCountError;
    }

    

    public Statistics withOutputThroughput(Integer outputThroughput) {
        this.outputThroughput = outputThroughput;
        return this;
    }

    


    /**
     * 下行吞吐量汇总
     * @return outputThroughput
     */
    public Integer getOutputThroughput() {
        return outputThroughput;
    }

    public void setOutputThroughput(Integer outputThroughput) {
        this.outputThroughput = outputThroughput;
    }

    

    public Statistics withInputThroughput(Integer inputThroughput) {
        this.inputThroughput = inputThroughput;
        return this;
    }

    


    /**
     * 上行吞吐量汇总
     * @return inputThroughput
     */
    public Integer getInputThroughput() {
        return inputThroughput;
    }

    public void setInputThroughput(Integer inputThroughput) {
        this.inputThroughput = inputThroughput;
    }

    

    public Statistics withCurrentMinute(Long currentMinute) {
        this.currentMinute = currentMinute;
        return this;
    }

    


    /**
     * 当前时间的UTC格式的时间戳
     * @return currentMinute
     */
    public Long getCurrentMinute() {
        return currentMinute;
    }

    public void setCurrentMinute(Long currentMinute) {
        this.currentMinute = currentMinute;
    }

    

    public Statistics withReqTime(String reqTime) {
        this.reqTime = reqTime;
        return this;
    }

    


    /**
     * 请求时间
     * @return reqTime
     */
    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    

    public Statistics withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    


    /**
     * 查询统计周期
     * @return cycle
     */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    

    public Statistics withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    


    /**
     * 集成应用编号
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    

    public Statistics withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    


    /**
     * API编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    

    public Statistics withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 分组编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public Statistics withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    


    /**
     * 项目编号
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    

    public Statistics withRegisterTime(String registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    


    /**
     * 注册时间
     * @return registerTime
     */
    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    

    public Statistics withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Statistics statistics = (Statistics) o;
        return Objects.equals(this.maxLatency, statistics.maxLatency) &&
            Objects.equals(this.avgLatency, statistics.avgLatency) &&
            Objects.equals(this.maxInnerLatency, statistics.maxInnerLatency) &&
            Objects.equals(this.avgInnerLatency, statistics.avgInnerLatency) &&
            Objects.equals(this.maxBackendLatency, statistics.maxBackendLatency) &&
            Objects.equals(this.avgBackendLatency, statistics.avgBackendLatency) &&
            Objects.equals(this.reqCount, statistics.reqCount) &&
            Objects.equals(this.reqCount2xx, statistics.reqCount2xx) &&
            Objects.equals(this.reqCount4xx, statistics.reqCount4xx) &&
            Objects.equals(this.reqCount5xx, statistics.reqCount5xx) &&
            Objects.equals(this.reqCountError, statistics.reqCountError) &&
            Objects.equals(this.outputThroughput, statistics.outputThroughput) &&
            Objects.equals(this.inputThroughput, statistics.inputThroughput) &&
            Objects.equals(this.currentMinute, statistics.currentMinute) &&
            Objects.equals(this.reqTime, statistics.reqTime) &&
            Objects.equals(this.cycle, statistics.cycle) &&
            Objects.equals(this.romaAppId, statistics.romaAppId) &&
            Objects.equals(this.apiId, statistics.apiId) &&
            Objects.equals(this.groupId, statistics.groupId) &&
            Objects.equals(this.provider, statistics.provider) &&
            Objects.equals(this.registerTime, statistics.registerTime) &&
            Objects.equals(this.status, statistics.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(maxLatency, avgLatency, maxInnerLatency, avgInnerLatency, maxBackendLatency, avgBackendLatency, reqCount, reqCount2xx, reqCount4xx, reqCount5xx, reqCountError, outputThroughput, inputThroughput, currentMinute, reqTime, cycle, romaAppId, apiId, groupId, provider, registerTime, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Statistics {\n");
        sb.append("    maxLatency: ").append(toIndentedString(maxLatency)).append("\n");
        sb.append("    avgLatency: ").append(toIndentedString(avgLatency)).append("\n");
        sb.append("    maxInnerLatency: ").append(toIndentedString(maxInnerLatency)).append("\n");
        sb.append("    avgInnerLatency: ").append(toIndentedString(avgInnerLatency)).append("\n");
        sb.append("    maxBackendLatency: ").append(toIndentedString(maxBackendLatency)).append("\n");
        sb.append("    avgBackendLatency: ").append(toIndentedString(avgBackendLatency)).append("\n");
        sb.append("    reqCount: ").append(toIndentedString(reqCount)).append("\n");
        sb.append("    reqCount2xx: ").append(toIndentedString(reqCount2xx)).append("\n");
        sb.append("    reqCount4xx: ").append(toIndentedString(reqCount4xx)).append("\n");
        sb.append("    reqCount5xx: ").append(toIndentedString(reqCount5xx)).append("\n");
        sb.append("    reqCountError: ").append(toIndentedString(reqCountError)).append("\n");
        sb.append("    outputThroughput: ").append(toIndentedString(outputThroughput)).append("\n");
        sb.append("    inputThroughput: ").append(toIndentedString(inputThroughput)).append("\n");
        sb.append("    currentMinute: ").append(toIndentedString(currentMinute)).append("\n");
        sb.append("    reqTime: ").append(toIndentedString(reqTime)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

