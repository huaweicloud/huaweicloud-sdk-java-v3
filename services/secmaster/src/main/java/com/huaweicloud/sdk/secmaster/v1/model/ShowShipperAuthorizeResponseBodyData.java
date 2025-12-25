package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果数据
 */
public class ShowShipperAuthorizeResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ShowShipperAuthorizeResponseBodyDataData> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ShowShipperAuthorizeResponseBodyData withData(List<ShowShipperAuthorizeResponseBodyDataData> data) {
        this.data = data;
        return this;
    }

    public ShowShipperAuthorizeResponseBodyData addDataItem(ShowShipperAuthorizeResponseBodyDataData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ShowShipperAuthorizeResponseBodyData withData(
        Consumer<List<ShowShipperAuthorizeResponseBodyDataData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 结果数据
     * @return data
     */
    public List<ShowShipperAuthorizeResponseBodyDataData> getData() {
        return data;
    }

    public void setData(List<ShowShipperAuthorizeResponseBodyDataData> data) {
        this.data = data;
    }

    public ShowShipperAuthorizeResponseBodyData withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的记录数
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowShipperAuthorizeResponseBodyData withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 当前页的起始偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowShipperAuthorizeResponseBodyData withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总记录数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowShipperAuthorizeResponseBodyData that = (ShowShipperAuthorizeResponseBodyData) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, limit, offset, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowShipperAuthorizeResponseBodyData {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
