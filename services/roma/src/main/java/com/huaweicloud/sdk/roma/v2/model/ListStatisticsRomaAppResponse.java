package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.Statistics;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListStatisticsRomaAppResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private Long startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private Long endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="list")
    
    private List<Statistics> list = null;
    
    public ListStatisticsRomaAppResponse withCode(String code) {
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

    public ListStatisticsRomaAppResponse withStartTime(Long startTime) {
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

    public ListStatisticsRomaAppResponse withEndTime(Long endTime) {
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

    public ListStatisticsRomaAppResponse withList(List<Statistics> list) {
        this.list = list;
        return this;
    }

    
    public ListStatisticsRomaAppResponse addListItem(Statistics listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ListStatisticsRomaAppResponse withList(Consumer<List<Statistics>> listSetter) {
        if(this.list == null ){
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * APP维度下不同周期指标列表
     * @return list
     */
    public List<Statistics> getList() {
        return list;
    }

    public void setList(List<Statistics> list) {
        this.list = list;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStatisticsRomaAppResponse listStatisticsRomaAppResponse = (ListStatisticsRomaAppResponse) o;
        return Objects.equals(this.code, listStatisticsRomaAppResponse.code) &&
            Objects.equals(this.startTime, listStatisticsRomaAppResponse.startTime) &&
            Objects.equals(this.endTime, listStatisticsRomaAppResponse.endTime) &&
            Objects.equals(this.list, listStatisticsRomaAppResponse.list);
    }
    @Override
    public int hashCode() {
        return Objects.hash(code, startTime, endTime, list);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatisticsRomaAppResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

