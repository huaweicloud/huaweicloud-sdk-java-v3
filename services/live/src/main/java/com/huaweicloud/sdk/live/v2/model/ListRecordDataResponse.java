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
public class ListRecordDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_data_list")

    private List<RecordData> recordDataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListRecordDataResponse withRecordDataList(List<RecordData> recordDataList) {
        this.recordDataList = recordDataList;
        return this;
    }

    public ListRecordDataResponse addRecordDataListItem(RecordData recordDataListItem) {
        if (this.recordDataList == null) {
            this.recordDataList = new ArrayList<>();
        }
        this.recordDataList.add(recordDataListItem);
        return this;
    }

    public ListRecordDataResponse withRecordDataList(Consumer<List<RecordData>> recordDataListSetter) {
        if (this.recordDataList == null) {
            this.recordDataList = new ArrayList<>();
        }
        recordDataListSetter.accept(this.recordDataList);
        return this;
    }

    /**
     * 采样数据列表。 
     * @return recordDataList
     */
    public List<RecordData> getRecordDataList() {
        return recordDataList;
    }

    public void setRecordDataList(List<RecordData> recordDataList) {
        this.recordDataList = recordDataList;
    }

    public ListRecordDataResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
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
        ListRecordDataResponse listRecordDataResponse = (ListRecordDataResponse) o;
        return Objects.equals(this.recordDataList, listRecordDataResponse.recordDataList)
            && Objects.equals(this.xRequestId, listRecordDataResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordDataList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordDataResponse {\n");
        sb.append("    recordDataList: ").append(toIndentedString(recordDataList)).append("\n");
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
