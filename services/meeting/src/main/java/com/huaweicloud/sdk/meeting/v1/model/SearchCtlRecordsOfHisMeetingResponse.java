package com.huaweicloud.sdk.meeting.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.ConfCtlRecordInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class SearchCtlRecordsOfHisMeetingResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data")
    
    private List<ConfCtlRecordInfo> data = null;
    
    public SearchCtlRecordsOfHisMeetingResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 第几条。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchCtlRecordsOfHisMeetingResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页的记录数。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchCtlRecordsOfHisMeetingResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 总记录数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public SearchCtlRecordsOfHisMeetingResponse withData(List<ConfCtlRecordInfo> data) {
        this.data = data;
        return this;
    }

    
    public SearchCtlRecordsOfHisMeetingResponse addDataItem(ConfCtlRecordInfo dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public SearchCtlRecordsOfHisMeetingResponse withData(Consumer<List<ConfCtlRecordInfo>> dataSetter) {
        if(this.data == null ){
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 会控操作列表。
     * @return data
     */
    public List<ConfCtlRecordInfo> getData() {
        return data;
    }

    public void setData(List<ConfCtlRecordInfo> data) {
        this.data = data;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchCtlRecordsOfHisMeetingResponse searchCtlRecordsOfHisMeetingResponse = (SearchCtlRecordsOfHisMeetingResponse) o;
        return Objects.equals(this.offset, searchCtlRecordsOfHisMeetingResponse.offset) &&
            Objects.equals(this.limit, searchCtlRecordsOfHisMeetingResponse.limit) &&
            Objects.equals(this.count, searchCtlRecordsOfHisMeetingResponse.count) &&
            Objects.equals(this.data, searchCtlRecordsOfHisMeetingResponse.data);
    }
    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, count, data);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCtlRecordsOfHisMeetingResponse {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

