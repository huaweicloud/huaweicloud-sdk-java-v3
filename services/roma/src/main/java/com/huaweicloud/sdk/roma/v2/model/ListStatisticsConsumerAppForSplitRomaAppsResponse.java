package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.RomaAppDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListStatisticsConsumerAppForSplitRomaAppsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private Integer startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private Integer endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_apps")
    
    private List<RomaAppDetail> romaApps = null;
    
    public ListStatisticsConsumerAppForSplitRomaAppsResponse withCode(String code) {
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

    public ListStatisticsConsumerAppForSplitRomaAppsResponse withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 统计起始时间UTC的时间戳
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public ListStatisticsConsumerAppForSplitRomaAppsResponse withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 统计结束时间UTC的时间戳
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public ListStatisticsConsumerAppForSplitRomaAppsResponse withRomaApps(List<RomaAppDetail> romaApps) {
        this.romaApps = romaApps;
        return this;
    }

    
    public ListStatisticsConsumerAppForSplitRomaAppsResponse addRomaAppsItem(RomaAppDetail romaAppsItem) {
        if (this.romaApps == null) {
            this.romaApps = new ArrayList<>();
        }
        this.romaApps.add(romaAppsItem);
        return this;
    }

    public ListStatisticsConsumerAppForSplitRomaAppsResponse withRomaApps(Consumer<List<RomaAppDetail>> romaAppsSetter) {
        if(this.romaApps == null ){
            this.romaApps = new ArrayList<>();
        }
        romaAppsSetter.accept(this.romaApps);
        return this;
    }

    /**
     * 集成应用维度统计信息列表
     * @return romaApps
     */
    public List<RomaAppDetail> getRomaApps() {
        return romaApps;
    }

    public void setRomaApps(List<RomaAppDetail> romaApps) {
        this.romaApps = romaApps;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStatisticsConsumerAppForSplitRomaAppsResponse listStatisticsConsumerAppForSplitRomaAppsResponse = (ListStatisticsConsumerAppForSplitRomaAppsResponse) o;
        return Objects.equals(this.code, listStatisticsConsumerAppForSplitRomaAppsResponse.code) &&
            Objects.equals(this.startTime, listStatisticsConsumerAppForSplitRomaAppsResponse.startTime) &&
            Objects.equals(this.endTime, listStatisticsConsumerAppForSplitRomaAppsResponse.endTime) &&
            Objects.equals(this.romaApps, listStatisticsConsumerAppForSplitRomaAppsResponse.romaApps);
    }
    @Override
    public int hashCode() {
        return Objects.hash(code, startTime, endTime, romaApps);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatisticsConsumerAppForSplitRomaAppsResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    romaApps: ").append(toIndentedString(romaApps)).append("\n");
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

