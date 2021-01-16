package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UniversalDetail
 */
public class UniversalDetail  {



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

    public UniversalDetail withMaxLatency(Integer maxLatency) {
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

    public UniversalDetail withAvgLatency(Integer avgLatency) {
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

    public UniversalDetail withMaxInnerLatency(Integer maxInnerLatency) {
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

    public UniversalDetail withAvgInnerLatency(Integer avgInnerLatency) {
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

    public UniversalDetail withMaxBackendLatency(Integer maxBackendLatency) {
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

    public UniversalDetail withAvgBackendLatency(Integer avgBackendLatency) {
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

    public UniversalDetail withReqCount(Integer reqCount) {
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

    public UniversalDetail withReqCount2xx(Integer reqCount2xx) {
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

    public UniversalDetail withReqCount4xx(Integer reqCount4xx) {
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

    public UniversalDetail withReqCount5xx(Integer reqCount5xx) {
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

    public UniversalDetail withReqCountError(Integer reqCountError) {
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

    public UniversalDetail withOutputThroughput(Integer outputThroughput) {
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

    public UniversalDetail withInputThroughput(Integer inputThroughput) {
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

    public UniversalDetail withCurrentMinute(Long currentMinute) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UniversalDetail universalDetail = (UniversalDetail) o;
        return Objects.equals(this.maxLatency, universalDetail.maxLatency) &&
            Objects.equals(this.avgLatency, universalDetail.avgLatency) &&
            Objects.equals(this.maxInnerLatency, universalDetail.maxInnerLatency) &&
            Objects.equals(this.avgInnerLatency, universalDetail.avgInnerLatency) &&
            Objects.equals(this.maxBackendLatency, universalDetail.maxBackendLatency) &&
            Objects.equals(this.avgBackendLatency, universalDetail.avgBackendLatency) &&
            Objects.equals(this.reqCount, universalDetail.reqCount) &&
            Objects.equals(this.reqCount2xx, universalDetail.reqCount2xx) &&
            Objects.equals(this.reqCount4xx, universalDetail.reqCount4xx) &&
            Objects.equals(this.reqCount5xx, universalDetail.reqCount5xx) &&
            Objects.equals(this.reqCountError, universalDetail.reqCountError) &&
            Objects.equals(this.outputThroughput, universalDetail.outputThroughput) &&
            Objects.equals(this.inputThroughput, universalDetail.inputThroughput) &&
            Objects.equals(this.currentMinute, universalDetail.currentMinute);
    }
    @Override
    public int hashCode() {
        return Objects.hash(maxLatency, avgLatency, maxInnerLatency, avgInnerLatency, maxBackendLatency, avgBackendLatency, reqCount, reqCount2xx, reqCount4xx, reqCount5xx, reqCountError, outputThroughput, inputThroughput, currentMinute);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UniversalDetail {\n");
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

