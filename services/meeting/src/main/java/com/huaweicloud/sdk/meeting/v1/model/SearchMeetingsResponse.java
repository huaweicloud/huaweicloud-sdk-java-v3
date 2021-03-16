package com.huaweicloud.sdk.meeting.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.ConferenceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class SearchMeetingsResponse extends SdkResponse {



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
    
    private List<ConferenceInfo> data = null;
    
    public SearchMeetingsResponse withOffset(Integer offset) {
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

    

    public SearchMeetingsResponse withLimit(Integer limit) {
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

    

    public SearchMeetingsResponse withCount(Integer count) {
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

    

    public SearchMeetingsResponse withData(List<ConferenceInfo> data) {
        this.data = data;
        return this;
    }

    
    public SearchMeetingsResponse addDataItem(ConferenceInfo dataItem) {
        this.data.add(dataItem);
        return this;
    }

    public SearchMeetingsResponse withData(Consumer<List<ConferenceInfo>> dataSetter) {
        if(this.data == null ){
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 会议信息列表。
     * @return data
     */
    public List<ConferenceInfo> getData() {
        return data;
    }

    public void setData(List<ConferenceInfo> data) {
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
        SearchMeetingsResponse searchMeetingsResponse = (SearchMeetingsResponse) o;
        return Objects.equals(this.offset, searchMeetingsResponse.offset) &&
            Objects.equals(this.limit, searchMeetingsResponse.limit) &&
            Objects.equals(this.count, searchMeetingsResponse.count) &&
            Objects.equals(this.data, searchMeetingsResponse.data);
    }
    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, count, data);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchMeetingsResponse {\n");
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

