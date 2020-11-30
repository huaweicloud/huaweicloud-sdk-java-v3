package com.huaweicloud.sdk.live.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v2.model.TranscodeData;
import com.huaweicloud.sdk.live.v2.model.TranscodeSummary;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListTranscodeDataResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="transcode_data_list")
    
    private List<TranscodeData> transcodeDataList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="summary_list")
    
    private List<TranscodeSummary> summaryList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-request-id")
    
    private String xRequestId;

    public ListTranscodeDataResponse withTranscodeDataList(List<TranscodeData> transcodeDataList) {
        this.transcodeDataList = transcodeDataList;
        return this;
    }

    
    public ListTranscodeDataResponse addTranscodeDataListItem(TranscodeData transcodeDataListItem) {
        if (this.transcodeDataList == null) {
            this.transcodeDataList = new ArrayList<>();
        }
        this.transcodeDataList.add(transcodeDataListItem);
        return this;
    }

    public ListTranscodeDataResponse withTranscodeDataList(Consumer<List<TranscodeData>> transcodeDataListSetter) {
        if(this.transcodeDataList == null ){
            this.transcodeDataList = new ArrayList<>();
        }
        transcodeDataListSetter.accept(this.transcodeDataList);
        return this;
    }

    /**
     * 采样数据列表。
     * @return transcodeDataList
     */
    public List<TranscodeData> getTranscodeDataList() {
        return transcodeDataList;
    }

    public void setTranscodeDataList(List<TranscodeData> transcodeDataList) {
        this.transcodeDataList = transcodeDataList;
    }

    public ListTranscodeDataResponse withSummaryList(List<TranscodeSummary> summaryList) {
        this.summaryList = summaryList;
        return this;
    }

    
    public ListTranscodeDataResponse addSummaryListItem(TranscodeSummary summaryListItem) {
        if (this.summaryList == null) {
            this.summaryList = new ArrayList<>();
        }
        this.summaryList.add(summaryListItem);
        return this;
    }

    public ListTranscodeDataResponse withSummaryList(Consumer<List<TranscodeSummary>> summaryListSetter) {
        if(this.summaryList == null ){
            this.summaryList = new ArrayList<>();
        }
        summaryListSetter.accept(this.summaryList);
        return this;
    }

    /**
     * 指定时间区间内各转码规格转码时长总和。
     * @return summaryList
     */
    public List<TranscodeSummary> getSummaryList() {
        return summaryList;
    }

    public void setSummaryList(List<TranscodeSummary> summaryList) {
        this.summaryList = summaryList;
    }

    public ListTranscodeDataResponse withXRequestId(String xRequestId) {
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
        ListTranscodeDataResponse listTranscodeDataResponse = (ListTranscodeDataResponse) o;
        return Objects.equals(this.transcodeDataList, listTranscodeDataResponse.transcodeDataList) &&
            Objects.equals(this.summaryList, listTranscodeDataResponse.summaryList) &&
            Objects.equals(this.xRequestId, listTranscodeDataResponse.xRequestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(transcodeDataList, summaryList, xRequestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTranscodeDataResponse {\n");
        sb.append("    transcodeDataList: ").append(toIndentedString(transcodeDataList)).append("\n");
        sb.append("    summaryList: ").append(toIndentedString(summaryList)).append("\n");
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

