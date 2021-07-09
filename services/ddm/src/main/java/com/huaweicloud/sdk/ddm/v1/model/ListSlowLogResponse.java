package com.huaweicloud.sdk.ddm.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ddm.v1.model.SlowLogList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSlowLogResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="totalRecord")
    
    private Integer totalRecord;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slowLogList")
    
    private List<SlowLogList> slowLogList = null;
    
    public ListSlowLogResponse withTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    


    /**
     * DDM慢sql日志条数。
     * @return totalRecord
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    

    public ListSlowLogResponse withSlowLogList(List<SlowLogList> slowLogList) {
        this.slowLogList = slowLogList;
        return this;
    }

    
    public ListSlowLogResponse addSlowLogListItem(SlowLogList slowLogListItem) {
        if(this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        this.slowLogList.add(slowLogListItem);
        return this;
    }

    public ListSlowLogResponse withSlowLogList(Consumer<List<SlowLogList>> slowLogListSetter) {
        if(this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        slowLogListSetter.accept(this.slowLogList);
        return this;
    }

    /**
     * DDM慢sql日志信息列表的集合。
     * @return slowLogList
     */
    public List<SlowLogList> getSlowLogList() {
        return slowLogList;
    }

    public void setSlowLogList(List<SlowLogList> slowLogList) {
        this.slowLogList = slowLogList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSlowLogResponse listSlowLogResponse = (ListSlowLogResponse) o;
        return Objects.equals(this.totalRecord, listSlowLogResponse.totalRecord) &&
            Objects.equals(this.slowLogList, listSlowLogResponse.slowLogList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalRecord, slowLogList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlowLogResponse {\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
        sb.append("    slowLogList: ").append(toIndentedString(slowLogList)).append("\n");
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

