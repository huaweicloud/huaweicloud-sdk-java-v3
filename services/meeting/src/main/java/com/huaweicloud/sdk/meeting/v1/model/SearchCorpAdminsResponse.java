package com.huaweicloud.sdk.meeting.v1.model;

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
public class SearchCorpAdminsResponse extends SdkResponse {

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

    private List<QueryCorpAdminResultDTO> data = null;

    public SearchCorpAdminsResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 页面起始页，从0开始
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchCorpAdminsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。 默认值：10。 
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchCorpAdminsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public SearchCorpAdminsResponse withData(List<QueryCorpAdminResultDTO> data) {
        this.data = data;
        return this;
    }

    public SearchCorpAdminsResponse addDataItem(QueryCorpAdminResultDTO dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public SearchCorpAdminsResponse withData(Consumer<List<QueryCorpAdminResultDTO>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 查询企业管理员返回的结果
     * @return data
     */
    public List<QueryCorpAdminResultDTO> getData() {
        return data;
    }

    public void setData(List<QueryCorpAdminResultDTO> data) {
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
        SearchCorpAdminsResponse searchCorpAdminsResponse = (SearchCorpAdminsResponse) o;
        return Objects.equals(this.offset, searchCorpAdminsResponse.offset)
            && Objects.equals(this.limit, searchCorpAdminsResponse.limit)
            && Objects.equals(this.count, searchCorpAdminsResponse.count)
            && Objects.equals(this.data, searchCorpAdminsResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, count, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCorpAdminsResponse {\n");
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
