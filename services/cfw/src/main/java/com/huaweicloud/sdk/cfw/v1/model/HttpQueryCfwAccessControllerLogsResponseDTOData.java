package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询访问控制日志返回数据
 */
public class HttpQueryCfwAccessControllerLogsResponseDTOData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<HttpQueryCfwAccessControllerLogsResponseDTODataRecords> records = null;

    public HttpQueryCfwAccessControllerLogsResponseDTOData withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询访问控制日志记录总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public HttpQueryCfwAccessControllerLogsResponseDTOData withLimit(Integer limit) {
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

    public HttpQueryCfwAccessControllerLogsResponseDTOData withRecords(
        List<HttpQueryCfwAccessControllerLogsResponseDTODataRecords> records) {
        this.records = records;
        return this;
    }

    public HttpQueryCfwAccessControllerLogsResponseDTOData addRecordsItem(
        HttpQueryCfwAccessControllerLogsResponseDTODataRecords recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public HttpQueryCfwAccessControllerLogsResponseDTOData withRecords(
        Consumer<List<HttpQueryCfwAccessControllerLogsResponseDTODataRecords>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 查询访问控制日志记录
     * @return records
     */
    public List<HttpQueryCfwAccessControllerLogsResponseDTODataRecords> getRecords() {
        return records;
    }

    public void setRecords(List<HttpQueryCfwAccessControllerLogsResponseDTODataRecords> records) {
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
        HttpQueryCfwAccessControllerLogsResponseDTOData that = (HttpQueryCfwAccessControllerLogsResponseDTOData) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, limit, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpQueryCfwAccessControllerLogsResponseDTOData {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
