package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询黑白名单返回值
 */
public class BlackWhiteListResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<BlackWhiteListResponseDataRecords> records = null;

    public BlackWhiteListResponseData withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public BlackWhiteListResponseData withOffset(Integer offset) {
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

    public BlackWhiteListResponseData withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public BlackWhiteListResponseData withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询的总条数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public BlackWhiteListResponseData withRecords(List<BlackWhiteListResponseDataRecords> records) {
        this.records = records;
        return this;
    }

    public BlackWhiteListResponseData addRecordsItem(BlackWhiteListResponseDataRecords recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public BlackWhiteListResponseData withRecords(Consumer<List<BlackWhiteListResponseDataRecords>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 黑白名单记录
     * @return records
     */
    public List<BlackWhiteListResponseDataRecords> getRecords() {
        return records;
    }

    public void setRecords(List<BlackWhiteListResponseDataRecords> records) {
        this.records = records;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlackWhiteListResponseData blackWhiteListResponseData = (BlackWhiteListResponseData) o;
        return Objects.equals(this.objectId, blackWhiteListResponseData.objectId)
            && Objects.equals(this.offset, blackWhiteListResponseData.offset)
            && Objects.equals(this.limit, blackWhiteListResponseData.limit)
            && Objects.equals(this.total, blackWhiteListResponseData.total)
            && Objects.equals(this.records, blackWhiteListResponseData.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, offset, limit, total, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BlackWhiteListResponseData {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
