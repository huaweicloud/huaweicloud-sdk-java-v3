package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ListDocumentInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<DocumentInfo> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListDocumentInfoResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 与第一条数据的偏移量
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDocumentInfoResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 页面大小
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDocumentInfoResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数量
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListDocumentInfoResponse withData(List<DocumentInfo> data) {
        this.data = data;
        return this;
    }

    public ListDocumentInfoResponse addDataItem(DocumentInfo dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListDocumentInfoResponse withData(Consumer<List<DocumentInfo>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 文档信息
     * @return data
     */
    public List<DocumentInfo> getData() {
        return data;
    }

    public void setData(List<DocumentInfo> data) {
        this.data = data;
    }

    public ListDocumentInfoResponse withXRequestId(String xRequestId) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDocumentInfoResponse that = (ListDocumentInfoResponse) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.count, that.count) && Objects.equals(this.data, that.data)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, count, data, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDocumentInfoResponse {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
