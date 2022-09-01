package com.huaweicloud.sdk.gsl.v3.model;

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
public class ListSimPoolsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pools")

    @JacksonXmlProperty(localName = "pools")

    private List<SimPoolVO> pools = null;

    public ListSimPoolsResponse withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListSimPoolsResponse withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 页码
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListSimPoolsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 当前查询条件的流量池总数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListSimPoolsResponse withPools(List<SimPoolVO> pools) {
        this.pools = pools;
        return this;
    }

    public ListSimPoolsResponse addPoolsItem(SimPoolVO poolsItem) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public ListSimPoolsResponse withPools(Consumer<List<SimPoolVO>> poolsSetter) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * 当前页的流量池记录列表
     * @return pools
     */
    public List<SimPoolVO> getPools() {
        return pools;
    }

    public void setPools(List<SimPoolVO> pools) {
        this.pools = pools;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSimPoolsResponse listSimPoolsResponse = (ListSimPoolsResponse) o;
        return Objects.equals(this.limit, listSimPoolsResponse.limit)
            && Objects.equals(this.offset, listSimPoolsResponse.offset)
            && Objects.equals(this.count, listSimPoolsResponse.count)
            && Objects.equals(this.pools, listSimPoolsResponse.pools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, count, pools);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSimPoolsResponse {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
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
