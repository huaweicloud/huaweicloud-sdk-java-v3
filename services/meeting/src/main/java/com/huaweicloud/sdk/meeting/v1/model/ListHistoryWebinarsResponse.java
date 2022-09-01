package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListHistoryWebinarsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    @JacksonXmlProperty(localName = "data")

    private List<OpenWebinarHistoryInfo> data = null;

    public ListHistoryWebinarsResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListHistoryWebinarsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询个数。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListHistoryWebinarsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总记录数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListHistoryWebinarsResponse withData(List<OpenWebinarHistoryInfo> data) {
        this.data = data;
        return this;
    }

    public ListHistoryWebinarsResponse addDataItem(OpenWebinarHistoryInfo dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListHistoryWebinarsResponse withData(Consumer<List<OpenWebinarHistoryInfo>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * Get data
     * @return data
     */
    public List<OpenWebinarHistoryInfo> getData() {
        return data;
    }

    public void setData(List<OpenWebinarHistoryInfo> data) {
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
        ListHistoryWebinarsResponse listHistoryWebinarsResponse = (ListHistoryWebinarsResponse) o;
        return Objects.equals(this.offset, listHistoryWebinarsResponse.offset)
            && Objects.equals(this.limit, listHistoryWebinarsResponse.limit)
            && Objects.equals(this.count, listHistoryWebinarsResponse.count)
            && Objects.equals(this.data, listHistoryWebinarsResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, count, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryWebinarsResponse {\n");
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
