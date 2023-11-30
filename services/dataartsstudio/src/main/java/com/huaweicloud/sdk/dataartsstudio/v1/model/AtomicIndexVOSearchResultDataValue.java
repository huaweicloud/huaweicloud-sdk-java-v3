package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AtomicIndexVOSearchResultDataValue
 */
public class AtomicIndexVOSearchResultDataValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<AtomicIndexVO> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public AtomicIndexVOSearchResultDataValue withRecords(List<AtomicIndexVO> records) {
        this.records = records;
        return this;
    }

    public AtomicIndexVOSearchResultDataValue addRecordsItem(AtomicIndexVO recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public AtomicIndexVOSearchResultDataValue withRecords(Consumer<List<AtomicIndexVO>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * AtomicIndexVO数组
     * @return records
     */
    public List<AtomicIndexVO> getRecords() {
        return records;
    }

    public void setRecords(List<AtomicIndexVO> records) {
        this.records = records;
    }

    public AtomicIndexVOSearchResultDataValue withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
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
        AtomicIndexVOSearchResultDataValue that = (AtomicIndexVOSearchResultDataValue) obj;
        return Objects.equals(this.records, that.records) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AtomicIndexVOSearchResultDataValue {\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
