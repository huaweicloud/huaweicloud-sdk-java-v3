package com.huaweicloud.sdk.live.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v2.model.HistoryStreamInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListHistoryStreamsV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="history_stream_list")
    
    private List<HistoryStreamInfo> historyStreamList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-request-id")
    
    private String xRequestId;

    public ListHistoryStreamsV2Response withHistoryStreamList(List<HistoryStreamInfo> historyStreamList) {
        this.historyStreamList = historyStreamList;
        return this;
    }

    
    public ListHistoryStreamsV2Response addHistoryStreamListItem(HistoryStreamInfo historyStreamListItem) {
        if (this.historyStreamList == null) {
            this.historyStreamList = new ArrayList<>();
        }
        this.historyStreamList.add(historyStreamListItem);
        return this;
    }

    public ListHistoryStreamsV2Response withHistoryStreamList(Consumer<List<HistoryStreamInfo>> historyStreamListSetter) {
        if(this.historyStreamList == null ){
            this.historyStreamList = new ArrayList<>();
        }
        historyStreamListSetter.accept(this.historyStreamList);
        return this;
    }

    /**
     * 历史流信息列表。
     * @return historyStreamList
     */
    public List<HistoryStreamInfo> getHistoryStreamList() {
        return historyStreamList;
    }

    public void setHistoryStreamList(List<HistoryStreamInfo> historyStreamList) {
        this.historyStreamList = historyStreamList;
    }

    public ListHistoryStreamsV2Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总记录数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListHistoryStreamsV2Response withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    


    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHistoryStreamsV2Response listHistoryStreamsV2Response = (ListHistoryStreamsV2Response) o;
        return Objects.equals(this.historyStreamList, listHistoryStreamsV2Response.historyStreamList) &&
            Objects.equals(this.total, listHistoryStreamsV2Response.total) &&
            Objects.equals(this.xRequestId, listHistoryStreamsV2Response.xRequestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(historyStreamList, total, xRequestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryStreamsV2Response {\n");
        sb.append("    historyStreamList: ").append(toIndentedString(historyStreamList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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

