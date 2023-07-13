package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询结果元数据信息，包括分页信息等。
 */
public class MetaDataSeries {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nextToken")

    private Integer nextToken;

    public MetaDataSeries withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 当前返回结果条数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public MetaDataSeries withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 下一个开始的标记，用于分页，null表示无更多数据。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public MetaDataSeries withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总条数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public MetaDataSeries withNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * 偏移量。
     * @return nextToken
     */
    public Integer getNextToken() {
        return nextToken;
    }

    public void setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaDataSeries that = (MetaDataSeries) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.total, that.total) && Objects.equals(this.nextToken, that.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, offset, total, nextToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaDataSeries {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
