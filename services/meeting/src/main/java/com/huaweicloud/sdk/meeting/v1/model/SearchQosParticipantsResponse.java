package com.huaweicloud.sdk.meeting.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.QosParticipantInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class SearchQosParticipantsResponse extends SdkResponse {



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
    
    private List<QosParticipantInfo> data = null;
    
    public SearchQosParticipantsResponse withCount(Integer count) {
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

    

    public SearchQosParticipantsResponse withLimit(Integer limit) {
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

    

    public SearchQosParticipantsResponse withOffset(Integer offset) {
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

    

    public SearchQosParticipantsResponse withData(List<QosParticipantInfo> data) {
        this.data = data;
        return this;
    }

    
    public SearchQosParticipantsResponse addDataItem(QosParticipantInfo dataItem) {
        if(this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public SearchQosParticipantsResponse withData(Consumer<List<QosParticipantInfo>> dataSetter) {
        if(this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * QoS会议与会者列表。
     * @return data
     */
    public List<QosParticipantInfo> getData() {
        return data;
    }

    public void setData(List<QosParticipantInfo> data) {
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
        SearchQosParticipantsResponse searchQosParticipantsResponse = (SearchQosParticipantsResponse) o;
        return Objects.equals(this.count, searchQosParticipantsResponse.count) &&
            Objects.equals(this.limit, searchQosParticipantsResponse.limit) &&
            Objects.equals(this.offset, searchQosParticipantsResponse.offset) &&
            Objects.equals(this.data, searchQosParticipantsResponse.data);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, limit, offset, data);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchQosParticipantsResponse {\n");
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

