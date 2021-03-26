package com.huaweicloud.sdk.as.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ScalingActivityLogV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListScalingActivityV2LogsResponse extends SdkResponse {



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
    @JsonProperty(value="scaling_activity_log")
    
    private List<ScalingActivityLogV2> scalingActivityLog = null;
    
    public ListScalingActivityV2LogsResponse withTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    


    /**
     * 总记录数。
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    

    public ListScalingActivityV2LogsResponse withStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    


    /**
     * 查询的其实行号。
     * @return startNumber
     */
    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    

    public ListScalingActivityV2LogsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListScalingActivityV2LogsResponse withScalingActivityLog(List<ScalingActivityLogV2> scalingActivityLog) {
        this.scalingActivityLog = scalingActivityLog;
        return this;
    }

    
    public ListScalingActivityV2LogsResponse addScalingActivityLogItem(ScalingActivityLogV2 scalingActivityLogItem) {
        this.scalingActivityLog.add(scalingActivityLogItem);
        return this;
    }

    public ListScalingActivityV2LogsResponse withScalingActivityLog(Consumer<List<ScalingActivityLogV2>> scalingActivityLogSetter) {
        if(this.scalingActivityLog == null ){
            this.scalingActivityLog = new ArrayList<>();
        }
        scalingActivityLogSetter.accept(this.scalingActivityLog);
        return this;
    }

    /**
     * 伸缩活动日志列表。
     * @return scalingActivityLog
     */
    public List<ScalingActivityLogV2> getScalingActivityLog() {
        return scalingActivityLog;
    }

    public void setScalingActivityLog(List<ScalingActivityLogV2> scalingActivityLog) {
        this.scalingActivityLog = scalingActivityLog;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScalingActivityV2LogsResponse listScalingActivityV2LogsResponse = (ListScalingActivityV2LogsResponse) o;
        return Objects.equals(this.totalNumber, listScalingActivityV2LogsResponse.totalNumber) &&
            Objects.equals(this.startNumber, listScalingActivityV2LogsResponse.startNumber) &&
            Objects.equals(this.limit, listScalingActivityV2LogsResponse.limit) &&
            Objects.equals(this.scalingActivityLog, listScalingActivityV2LogsResponse.scalingActivityLog);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalNumber, startNumber, limit, scalingActivityLog);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingActivityV2LogsResponse {\n");
        sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
        sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    scalingActivityLog: ").append(toIndentedString(scalingActivityLog)).append("\n");
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

