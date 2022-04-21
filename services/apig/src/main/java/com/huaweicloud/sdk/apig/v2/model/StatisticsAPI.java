package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * StatisticsAPI
 */
public class StatisticsAPI {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_latency")

    private Integer maxLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_latency")

    private Float avgLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_count")

    private Integer reqCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_count2xx")

    private Integer reqCount2xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_count4xx")

    private Integer reqCount4xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_count5xx")

    private Integer reqCount5xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_count_error")

    private Integer reqCountError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_inner_latency")

    private Integer maxInnerLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_inner_latency")

    private Float avgInnerLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_backend_latency")

    private Integer maxBackendLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_backend_latency")

    private Float avgBackendLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_throughput")

    private Long outputThroughput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_throughput")

    private Long inputThroughput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_minute")

    private Long currentMinute;

    /**
     * 统计周期
     */
    public static final class CycleEnum {

        /**
         * Enum MINUTE for value: "MINUTE"
         */
        public static final CycleEnum MINUTE = new CycleEnum("MINUTE");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final CycleEnum HOUR = new CycleEnum("HOUR");

        /**
         * Enum DAY for value: "DAY"
         */
        public static final CycleEnum DAY = new CycleEnum("DAY");

        private static final Map<String, CycleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CycleEnum> createStaticFields() {
            Map<String, CycleEnum> map = new HashMap<>();
            map.put("MINUTE", MINUTE);
            map.put("HOUR", HOUR);
            map.put("DAY", DAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CycleEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CycleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CycleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CycleEnum(value);
            }
            return result;
        }

        public static CycleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CycleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CycleEnum) {
                return this.value.equals(((CycleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle")

    private CycleEnum cycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_time")

    private OffsetDateTime reqTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_time")

    private OffsetDateTime registerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public StatisticsAPI withMaxLatency(Integer maxLatency) {
        this.maxLatency = maxLatency;
        return this;
    }

    /**
     * 最大延时  单位：ms
     * @return maxLatency
     */
    public Integer getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(Integer maxLatency) {
        this.maxLatency = maxLatency;
    }

    public StatisticsAPI withAvgLatency(Float avgLatency) {
        this.avgLatency = avgLatency;
        return this;
    }

    /**
     * 平均延时  单位：ms
     * @return avgLatency
     */
    public Float getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(Float avgLatency) {
        this.avgLatency = avgLatency;
    }

    public StatisticsAPI withReqCount(Integer reqCount) {
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

    public StatisticsAPI withReqCount2xx(Integer reqCount2xx) {
        this.reqCount2xx = reqCount2xx;
        return this;
    }

    /**
     * 2xx响应码总次数
     * @return reqCount2xx
     */
    public Integer getReqCount2xx() {
        return reqCount2xx;
    }

    public void setReqCount2xx(Integer reqCount2xx) {
        this.reqCount2xx = reqCount2xx;
    }

    public StatisticsAPI withReqCount4xx(Integer reqCount4xx) {
        this.reqCount4xx = reqCount4xx;
        return this;
    }

    /**
     * 4xx响应码总次数
     * @return reqCount4xx
     */
    public Integer getReqCount4xx() {
        return reqCount4xx;
    }

    public void setReqCount4xx(Integer reqCount4xx) {
        this.reqCount4xx = reqCount4xx;
    }

    public StatisticsAPI withReqCount5xx(Integer reqCount5xx) {
        this.reqCount5xx = reqCount5xx;
        return this;
    }

    /**
     * 5xx响应码总次数
     * @return reqCount5xx
     */
    public Integer getReqCount5xx() {
        return reqCount5xx;
    }

    public void setReqCount5xx(Integer reqCount5xx) {
        this.reqCount5xx = reqCount5xx;
    }

    public StatisticsAPI withReqCountError(Integer reqCountError) {
        this.reqCountError = reqCountError;
        return this;
    }

    /**
     * 错误次数
     * @return reqCountError
     */
    public Integer getReqCountError() {
        return reqCountError;
    }

    public void setReqCountError(Integer reqCountError) {
        this.reqCountError = reqCountError;
    }

    public StatisticsAPI withMaxInnerLatency(Integer maxInnerLatency) {
        this.maxInnerLatency = maxInnerLatency;
        return this;
    }

    /**
     * 最大网关内部延时  单位：ms
     * @return maxInnerLatency
     */
    public Integer getMaxInnerLatency() {
        return maxInnerLatency;
    }

    public void setMaxInnerLatency(Integer maxInnerLatency) {
        this.maxInnerLatency = maxInnerLatency;
    }

    public StatisticsAPI withAvgInnerLatency(Float avgInnerLatency) {
        this.avgInnerLatency = avgInnerLatency;
        return this;
    }

    /**
     * 平均网关内部延时  单位：ms
     * @return avgInnerLatency
     */
    public Float getAvgInnerLatency() {
        return avgInnerLatency;
    }

    public void setAvgInnerLatency(Float avgInnerLatency) {
        this.avgInnerLatency = avgInnerLatency;
    }

    public StatisticsAPI withMaxBackendLatency(Integer maxBackendLatency) {
        this.maxBackendLatency = maxBackendLatency;
        return this;
    }

    /**
     * 最大后端延时
     * @return maxBackendLatency
     */
    public Integer getMaxBackendLatency() {
        return maxBackendLatency;
    }

    public void setMaxBackendLatency(Integer maxBackendLatency) {
        this.maxBackendLatency = maxBackendLatency;
    }

    public StatisticsAPI withAvgBackendLatency(Float avgBackendLatency) {
        this.avgBackendLatency = avgBackendLatency;
        return this;
    }

    /**
     * 平均后端延时
     * @return avgBackendLatency
     */
    public Float getAvgBackendLatency() {
        return avgBackendLatency;
    }

    public void setAvgBackendLatency(Float avgBackendLatency) {
        this.avgBackendLatency = avgBackendLatency;
    }

    public StatisticsAPI withOutputThroughput(Long outputThroughput) {
        this.outputThroughput = outputThroughput;
        return this;
    }

    /**
     * 下行吞吐量（byte）
     * @return outputThroughput
     */
    public Long getOutputThroughput() {
        return outputThroughput;
    }

    public void setOutputThroughput(Long outputThroughput) {
        this.outputThroughput = outputThroughput;
    }

    public StatisticsAPI withInputThroughput(Long inputThroughput) {
        this.inputThroughput = inputThroughput;
        return this;
    }

    /**
     * 上行吞吐量（byte）
     * @return inputThroughput
     */
    public Long getInputThroughput() {
        return inputThroughput;
    }

    public void setInputThroughput(Long inputThroughput) {
        this.inputThroughput = inputThroughput;
    }

    public StatisticsAPI withCurrentMinute(Long currentMinute) {
        this.currentMinute = currentMinute;
        return this;
    }

    /**
     * API访问的UTC时间戳
     * @return currentMinute
     */
    public Long getCurrentMinute() {
        return currentMinute;
    }

    public void setCurrentMinute(Long currentMinute) {
        this.currentMinute = currentMinute;
    }

    public StatisticsAPI withCycle(CycleEnum cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * 统计周期
     * @return cycle
     */
    public CycleEnum getCycle() {
        return cycle;
    }

    public void setCycle(CycleEnum cycle) {
        this.cycle = cycle;
    }

    public StatisticsAPI withApiId(String apiId) {
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

    public StatisticsAPI withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * API分组编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public StatisticsAPI withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * API拥有者
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public StatisticsAPI withReqTime(OffsetDateTime reqTime) {
        this.reqTime = reqTime;
        return this;
    }

    /**
     * API请求时间
     * @return reqTime
     */
    public OffsetDateTime getReqTime() {
        return reqTime;
    }

    public void setReqTime(OffsetDateTime reqTime) {
        this.reqTime = reqTime;
    }

    public StatisticsAPI withRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    /**
     * 记录时间
     * @return registerTime
     */
    public OffsetDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
    }

    public StatisticsAPI withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
        StatisticsAPI statisticsAPI = (StatisticsAPI) o;
        return Objects.equals(this.maxLatency, statisticsAPI.maxLatency)
            && Objects.equals(this.avgLatency, statisticsAPI.avgLatency)
            && Objects.equals(this.reqCount, statisticsAPI.reqCount)
            && Objects.equals(this.reqCount2xx, statisticsAPI.reqCount2xx)
            && Objects.equals(this.reqCount4xx, statisticsAPI.reqCount4xx)
            && Objects.equals(this.reqCount5xx, statisticsAPI.reqCount5xx)
            && Objects.equals(this.reqCountError, statisticsAPI.reqCountError)
            && Objects.equals(this.maxInnerLatency, statisticsAPI.maxInnerLatency)
            && Objects.equals(this.avgInnerLatency, statisticsAPI.avgInnerLatency)
            && Objects.equals(this.maxBackendLatency, statisticsAPI.maxBackendLatency)
            && Objects.equals(this.avgBackendLatency, statisticsAPI.avgBackendLatency)
            && Objects.equals(this.outputThroughput, statisticsAPI.outputThroughput)
            && Objects.equals(this.inputThroughput, statisticsAPI.inputThroughput)
            && Objects.equals(this.currentMinute, statisticsAPI.currentMinute)
            && Objects.equals(this.cycle, statisticsAPI.cycle) && Objects.equals(this.apiId, statisticsAPI.apiId)
            && Objects.equals(this.groupId, statisticsAPI.groupId)
            && Objects.equals(this.provider, statisticsAPI.provider)
            && Objects.equals(this.reqTime, statisticsAPI.reqTime)
            && Objects.equals(this.registerTime, statisticsAPI.registerTime)
            && Objects.equals(this.status, statisticsAPI.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxLatency,
            avgLatency,
            reqCount,
            reqCount2xx,
            reqCount4xx,
            reqCount5xx,
            reqCountError,
            maxInnerLatency,
            avgInnerLatency,
            maxBackendLatency,
            avgBackendLatency,
            outputThroughput,
            inputThroughput,
            currentMinute,
            cycle,
            apiId,
            groupId,
            provider,
            reqTime,
            registerTime,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticsAPI {\n");
        sb.append("    maxLatency: ").append(toIndentedString(maxLatency)).append("\n");
        sb.append("    avgLatency: ").append(toIndentedString(avgLatency)).append("\n");
        sb.append("    reqCount: ").append(toIndentedString(reqCount)).append("\n");
        sb.append("    reqCount2xx: ").append(toIndentedString(reqCount2xx)).append("\n");
        sb.append("    reqCount4xx: ").append(toIndentedString(reqCount4xx)).append("\n");
        sb.append("    reqCount5xx: ").append(toIndentedString(reqCount5xx)).append("\n");
        sb.append("    reqCountError: ").append(toIndentedString(reqCountError)).append("\n");
        sb.append("    maxInnerLatency: ").append(toIndentedString(maxInnerLatency)).append("\n");
        sb.append("    avgInnerLatency: ").append(toIndentedString(avgInnerLatency)).append("\n");
        sb.append("    maxBackendLatency: ").append(toIndentedString(maxBackendLatency)).append("\n");
        sb.append("    avgBackendLatency: ").append(toIndentedString(avgBackendLatency)).append("\n");
        sb.append("    outputThroughput: ").append(toIndentedString(outputThroughput)).append("\n");
        sb.append("    inputThroughput: ").append(toIndentedString(inputThroughput)).append("\n");
        sb.append("    currentMinute: ").append(toIndentedString(currentMinute)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    reqTime: ").append(toIndentedString(reqTime)).append("\n");
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
