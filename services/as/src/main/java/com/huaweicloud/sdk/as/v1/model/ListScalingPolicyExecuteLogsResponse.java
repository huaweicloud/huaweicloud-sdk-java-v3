package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ScalingPolicyExecuteLogList;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListScalingPolicyExecuteLogsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_number")
    
    private Integer totalNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_number")
    
    private Integer startNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_policy_execute_log")
    
    private List<ScalingPolicyExecuteLogList> scalingPolicyExecuteLog = null;
    
    public ListScalingPolicyExecuteLogsResponse withTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    


    /**
     * 总记录数。
     * minimum: 0
     * maximum: 32768
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public ListScalingPolicyExecuteLogsResponse withStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    


    /**
     * 查询的起始行号。
     * minimum: 0
     * maximum: 32768
     * @return startNumber
     */
    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    public ListScalingPolicyExecuteLogsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数。
     * minimum: 0
     * maximum: 32768
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListScalingPolicyExecuteLogsResponse withScalingPolicyExecuteLog(List<ScalingPolicyExecuteLogList> scalingPolicyExecuteLog) {
        this.scalingPolicyExecuteLog = scalingPolicyExecuteLog;
        return this;
    }

    
    public ListScalingPolicyExecuteLogsResponse addScalingPolicyExecuteLogItem(ScalingPolicyExecuteLogList scalingPolicyExecuteLogItem) {
        if (this.scalingPolicyExecuteLog == null) {
            this.scalingPolicyExecuteLog = new ArrayList<>();
        }
        this.scalingPolicyExecuteLog.add(scalingPolicyExecuteLogItem);
        return this;
    }

    public ListScalingPolicyExecuteLogsResponse withScalingPolicyExecuteLog(Consumer<List<ScalingPolicyExecuteLogList>> scalingPolicyExecuteLogSetter) {
        if(this.scalingPolicyExecuteLog == null ){
            this.scalingPolicyExecuteLog = new ArrayList<>();
        }
        scalingPolicyExecuteLogSetter.accept(this.scalingPolicyExecuteLog);
        return this;
    }

    /**
     * 伸缩策略执行日志列表。
     * @return scalingPolicyExecuteLog
     */
    public List<ScalingPolicyExecuteLogList> getScalingPolicyExecuteLog() {
        return scalingPolicyExecuteLog;
    }

    public void setScalingPolicyExecuteLog(List<ScalingPolicyExecuteLogList> scalingPolicyExecuteLog) {
        this.scalingPolicyExecuteLog = scalingPolicyExecuteLog;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScalingPolicyExecuteLogsResponse listScalingPolicyExecuteLogsResponse = (ListScalingPolicyExecuteLogsResponse) o;
        return Objects.equals(this.totalNumber, listScalingPolicyExecuteLogsResponse.totalNumber) &&
            Objects.equals(this.startNumber, listScalingPolicyExecuteLogsResponse.startNumber) &&
            Objects.equals(this.limit, listScalingPolicyExecuteLogsResponse.limit) &&
            Objects.equals(this.scalingPolicyExecuteLog, listScalingPolicyExecuteLogsResponse.scalingPolicyExecuteLog);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalNumber, startNumber, limit, scalingPolicyExecuteLog);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingPolicyExecuteLogsResponse {\n");
            sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
            sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    scalingPolicyExecuteLog: ").append(toIndentedString(scalingPolicyExecuteLog)).append("\n");
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

