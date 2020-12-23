package com.huaweicloud.sdk.rds.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.SlowLog;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSlowlogStatisticsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pageNumber")
    
    private Integer pageNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pageRecord")
    
    private Integer pageRecord;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slowLogList")
    
    private List<SlowLog> slowLogList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="totalRecord")
    
    private Integer totalRecord;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startTime")
    
    private Long startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endTime")
    
    private Long endTime;

    public ListSlowlogStatisticsResponse withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    


    /**
     * 当前页码
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public ListSlowlogStatisticsResponse withPageRecord(Integer pageRecord) {
        this.pageRecord = pageRecord;
        return this;
    }

    


    /**
     * 每页条数
     * @return pageRecord
     */
    public Integer getPageRecord() {
        return pageRecord;
    }

    public void setPageRecord(Integer pageRecord) {
        this.pageRecord = pageRecord;
    }

    public ListSlowlogStatisticsResponse withSlowLogList(List<SlowLog> slowLogList) {
        this.slowLogList = slowLogList;
        return this;
    }

    
    public ListSlowlogStatisticsResponse addSlowLogListItem(SlowLog slowLogListItem) {
        if (this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        this.slowLogList.add(slowLogListItem);
        return this;
    }

    public ListSlowlogStatisticsResponse withSlowLogList(Consumer<List<SlowLog>> slowLogListSetter) {
        if(this.slowLogList == null ){
            this.slowLogList = new ArrayList<>();
        }
        slowLogListSetter.accept(this.slowLogList);
        return this;
    }

    /**
     * 慢日志列表
     * @return slowLogList
     */
    public List<SlowLog> getSlowLogList() {
        return slowLogList;
    }

    public void setSlowLogList(List<SlowLog> slowLogList) {
        this.slowLogList = slowLogList;
    }

    public ListSlowlogStatisticsResponse withTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    


    /**
     * 总条数
     * @return totalRecord
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public ListSlowlogStatisticsResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListSlowlogStatisticsResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSlowlogStatisticsResponse listSlowlogStatisticsResponse = (ListSlowlogStatisticsResponse) o;
        return Objects.equals(this.pageNumber, listSlowlogStatisticsResponse.pageNumber) &&
            Objects.equals(this.pageRecord, listSlowlogStatisticsResponse.pageRecord) &&
            Objects.equals(this.slowLogList, listSlowlogStatisticsResponse.slowLogList) &&
            Objects.equals(this.totalRecord, listSlowlogStatisticsResponse.totalRecord) &&
            Objects.equals(this.startTime, listSlowlogStatisticsResponse.startTime) &&
            Objects.equals(this.endTime, listSlowlogStatisticsResponse.endTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pageNumber, pageRecord, slowLogList, totalRecord, startTime, endTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlowlogStatisticsResponse {\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    pageRecord: ").append(toIndentedString(pageRecord)).append("\n");
        sb.append("    slowLogList: ").append(toIndentedString(slowLogList)).append("\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

