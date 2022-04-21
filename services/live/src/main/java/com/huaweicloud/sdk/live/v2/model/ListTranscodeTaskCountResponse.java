package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTranscodeTaskCountResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transcode_data_list")

    private List<TranscodeCountData> transcodeDataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListTranscodeTaskCountResponse withTranscodeDataList(List<TranscodeCountData> transcodeDataList) {
        this.transcodeDataList = transcodeDataList;
        return this;
    }

    public ListTranscodeTaskCountResponse addTranscodeDataListItem(TranscodeCountData transcodeDataListItem) {
        if (this.transcodeDataList == null) {
            this.transcodeDataList = new ArrayList<>();
        }
        this.transcodeDataList.add(transcodeDataListItem);
        return this;
    }

    public ListTranscodeTaskCountResponse withTranscodeDataList(
        Consumer<List<TranscodeCountData>> transcodeDataListSetter) {
        if (this.transcodeDataList == null) {
            this.transcodeDataList = new ArrayList<>();
        }
        transcodeDataListSetter.accept(this.transcodeDataList);
        return this;
    }

    /**
     * 时间戳及相应时间的数值。
     * @return transcodeDataList
     */
    public List<TranscodeCountData> getTranscodeDataList() {
        return transcodeDataList;
    }

    public void setTranscodeDataList(List<TranscodeCountData> transcodeDataList) {
        this.transcodeDataList = transcodeDataList;
    }

    public ListTranscodeTaskCountResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
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
        ListTranscodeTaskCountResponse listTranscodeTaskCountResponse = (ListTranscodeTaskCountResponse) o;
        return Objects.equals(this.transcodeDataList, listTranscodeTaskCountResponse.transcodeDataList)
            && Objects.equals(this.xRequestId, listTranscodeTaskCountResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transcodeDataList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTranscodeTaskCountResponse {\n");
        sb.append("    transcodeDataList: ").append(toIndentedString(transcodeDataList)).append("\n");
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
