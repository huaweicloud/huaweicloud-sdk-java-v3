package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListRecordContentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_contents")

    private List<RecordContentInfoV2> recordContents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListRecordContentsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 查询结果的总元素数量 minimum: 0 maximum: 10240
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListRecordContentsResponse withRecordContents(List<RecordContentInfoV2> recordContents) {
        this.recordContents = recordContents;
        return this;
    }

    public ListRecordContentsResponse addRecordContentsItem(RecordContentInfoV2 recordContentsItem) {
        if (this.recordContents == null) {
            this.recordContents = new ArrayList<>();
        }
        this.recordContents.add(recordContentsItem);
        return this;
    }

    public ListRecordContentsResponse withRecordContents(Consumer<List<RecordContentInfoV2>> recordContentsSetter) {
        if (this.recordContents == null) {
            this.recordContents = new ArrayList<>();
        }
        recordContentsSetter.accept(this.recordContents);
        return this;
    }

    /** 录制内容数组
     * 
     * @return recordContents */
    public List<RecordContentInfoV2> getRecordContents() {
        return recordContents;
    }

    public void setRecordContents(List<RecordContentInfoV2> recordContents) {
        this.recordContents = recordContents;
    }

    public ListRecordContentsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /** Get xRequestId
     * 
     * @return xRequestId */
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
        ListRecordContentsResponse listRecordContentsResponse = (ListRecordContentsResponse) o;
        return Objects.equals(this.total, listRecordContentsResponse.total)
            && Objects.equals(this.recordContents, listRecordContentsResponse.recordContents)
            && Objects.equals(this.xRequestId, listRecordContentsResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, recordContents, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordContentsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    recordContents: ").append(toIndentedString(recordContents)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
