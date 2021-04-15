package com.huaweicloud.sdk.live.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v1.model.OnlineInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListLiveStreamsOnlineResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_page")
    
    private Long totalPage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_num")
    
    private Long totalNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Long offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Long limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="streams")
    
    private List<OnlineInfo> streams = null;
    
    public ListLiveStreamsOnlineResponse withTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    


    /**
     * 总条页数
     * @return totalPage
     */
    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    

    public ListLiveStreamsOnlineResponse withTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    


    /**
     * 总条目数
     * @return totalNum
     */
    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    

    public ListLiveStreamsOnlineResponse withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移量
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    

    public ListLiveStreamsOnlineResponse withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页条目数
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    

    public ListLiveStreamsOnlineResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求唯一标识
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    

    public ListLiveStreamsOnlineResponse withStreams(List<OnlineInfo> streams) {
        this.streams = streams;
        return this;
    }

    
    public ListLiveStreamsOnlineResponse addStreamsItem(OnlineInfo streamsItem) {
        if(this.streams == null) {
            this.streams = new ArrayList<>();
        }
        this.streams.add(streamsItem);
        return this;
    }

    public ListLiveStreamsOnlineResponse withStreams(Consumer<List<OnlineInfo>> streamsSetter) {
        if(this.streams == null) {
            this.streams = new ArrayList<>();
        }
        streamsSetter.accept(this.streams);
        return this;
    }

    /**
     * 推流统计
     * @return streams
     */
    public List<OnlineInfo> getStreams() {
        return streams;
    }

    public void setStreams(List<OnlineInfo> streams) {
        this.streams = streams;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLiveStreamsOnlineResponse listLiveStreamsOnlineResponse = (ListLiveStreamsOnlineResponse) o;
        return Objects.equals(this.totalPage, listLiveStreamsOnlineResponse.totalPage) &&
            Objects.equals(this.totalNum, listLiveStreamsOnlineResponse.totalNum) &&
            Objects.equals(this.offset, listLiveStreamsOnlineResponse.offset) &&
            Objects.equals(this.limit, listLiveStreamsOnlineResponse.limit) &&
            Objects.equals(this.requestId, listLiveStreamsOnlineResponse.requestId) &&
            Objects.equals(this.streams, listLiveStreamsOnlineResponse.streams);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalPage, totalNum, offset, limit, requestId, streams);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLiveStreamsOnlineResponse {\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
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

