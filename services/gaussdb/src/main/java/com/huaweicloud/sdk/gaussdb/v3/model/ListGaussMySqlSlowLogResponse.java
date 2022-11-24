package com.huaweicloud.sdk.gaussdb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlSlowLogList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListGaussMySqlSlowLogResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slow_log_list")
    
    
    private List<MysqlSlowLogList> slowLogList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="long_query_time")
    
    
    private String longQueryTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_record")
    
    
    private Integer totalRecord;

    public ListGaussMySqlSlowLogResponse withSlowLogList(List<MysqlSlowLogList> slowLogList) {
        this.slowLogList = slowLogList;
        return this;
    }

    
    public ListGaussMySqlSlowLogResponse addSlowLogListItem(MysqlSlowLogList slowLogListItem) {
        if(this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        this.slowLogList.add(slowLogListItem);
        return this;
    }

    public ListGaussMySqlSlowLogResponse withSlowLogList(Consumer<List<MysqlSlowLogList>> slowLogListSetter) {
        if(this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        slowLogListSetter.accept(this.slowLogList);
        return this;
    }

    /**
     * 错误日志具体信息。
     * @return slowLogList
     */
    public List<MysqlSlowLogList> getSlowLogList() {
        return slowLogList;
    }

    public void setSlowLogList(List<MysqlSlowLogList> slowLogList) {
        this.slowLogList = slowLogList;
    }

    

    public ListGaussMySqlSlowLogResponse withLongQueryTime(String longQueryTime) {
        this.longQueryTime = longQueryTime;
        return this;
    }

    


    /**
     * 慢日志阈值。
     * @return longQueryTime
     */
    public String getLongQueryTime() {
        return longQueryTime;
    }

    public void setLongQueryTime(String longQueryTime) {
        this.longQueryTime = longQueryTime;
    }

    

    public ListGaussMySqlSlowLogResponse withTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    


    /**
     * 总记录数。
     * @return totalRecord
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGaussMySqlSlowLogResponse listGaussMySqlSlowLogResponse = (ListGaussMySqlSlowLogResponse) o;
        return Objects.equals(this.slowLogList, listGaussMySqlSlowLogResponse.slowLogList) &&
            Objects.equals(this.longQueryTime, listGaussMySqlSlowLogResponse.longQueryTime) &&
            Objects.equals(this.totalRecord, listGaussMySqlSlowLogResponse.totalRecord);
    }
    @Override
    public int hashCode() {
        return Objects.hash(slowLogList, longQueryTime, totalRecord);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGaussMySqlSlowLogResponse {\n");
        sb.append("    slowLogList: ").append(toIndentedString(slowLogList)).append("\n");
        sb.append("    longQueryTime: ").append(toIndentedString(longQueryTime)).append("\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
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

