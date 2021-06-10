package com.huaweicloud.sdk.meeting.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.QosConferenceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class SearchQosOnlineMeetingsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data")
    
    private List<QosConferenceInfo> data = null;
    
    public SearchQosOnlineMeetingsResponse withCount(Integer count) {
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

    

    public SearchQosOnlineMeetingsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询条目数量。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public SearchQosOnlineMeetingsResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 查询偏移量。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public SearchQosOnlineMeetingsResponse withData(List<QosConferenceInfo> data) {
        this.data = data;
        return this;
    }

    
    public SearchQosOnlineMeetingsResponse addDataItem(QosConferenceInfo dataItem) {
        if(this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public SearchQosOnlineMeetingsResponse withData(Consumer<List<QosConferenceInfo>> dataSetter) {
        if(this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * QoS会议列表，按照会议开始时间降序排序。
     * @return data
     */
    public List<QosConferenceInfo> getData() {
        return data;
    }

    public void setData(List<QosConferenceInfo> data) {
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
        SearchQosOnlineMeetingsResponse searchQosOnlineMeetingsResponse = (SearchQosOnlineMeetingsResponse) o;
        return Objects.equals(this.count, searchQosOnlineMeetingsResponse.count) &&
            Objects.equals(this.limit, searchQosOnlineMeetingsResponse.limit) &&
            Objects.equals(this.offset, searchQosOnlineMeetingsResponse.offset) &&
            Objects.equals(this.data, searchQosOnlineMeetingsResponse.data);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, limit, offset, data);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchQosOnlineMeetingsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
