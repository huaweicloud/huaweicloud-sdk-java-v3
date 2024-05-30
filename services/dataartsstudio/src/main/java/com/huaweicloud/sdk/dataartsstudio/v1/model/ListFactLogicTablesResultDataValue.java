package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * value，统一的返回结果的外层数据结构。
 */
public class ListFactLogicTablesResultDataValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<FactLogicTableVO> records = null;

    public ListFactLogicTablesResultDataValue withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总量。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListFactLogicTablesResultDataValue withRecords(List<FactLogicTableVO> records) {
        this.records = records;
        return this;
    }

    public ListFactLogicTablesResultDataValue addRecordsItem(FactLogicTableVO recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListFactLogicTablesResultDataValue withRecords(Consumer<List<FactLogicTableVO>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * FactLogicTableVO信息。
     * @return records
     */
    public List<FactLogicTableVO> getRecords() {
        return records;
    }

    public void setRecords(List<FactLogicTableVO> records) {
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
        ListFactLogicTablesResultDataValue that = (ListFactLogicTablesResultDataValue) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactLogicTablesResultDataValue {\n");
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
