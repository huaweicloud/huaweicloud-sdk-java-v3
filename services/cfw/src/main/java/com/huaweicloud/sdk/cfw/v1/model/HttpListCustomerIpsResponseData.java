package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HttpListCustomerIpsResponseData
 */
public class HttpListCustomerIpsResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<CustomerIpsListVO> records = null;

    public HttpListCustomerIpsResponseData withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数，范围为1-1024
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public HttpListCustomerIpsResponseData withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public HttpListCustomerIpsResponseData withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询获得自定义ips规则列表总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public HttpListCustomerIpsResponseData withRecords(List<CustomerIpsListVO> records) {
        this.records = records;
        return this;
    }

    public HttpListCustomerIpsResponseData addRecordsItem(CustomerIpsListVO recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public HttpListCustomerIpsResponseData withRecords(Consumer<List<CustomerIpsListVO>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 自定义ips规则记录
     * @return records
     */
    public List<CustomerIpsListVO> getRecords() {
        return records;
    }

    public void setRecords(List<CustomerIpsListVO> records) {
        this.records = records;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpListCustomerIpsResponseData that = (HttpListCustomerIpsResponseData) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.total, that.total) && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, total, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpListCustomerIpsResponseData {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
