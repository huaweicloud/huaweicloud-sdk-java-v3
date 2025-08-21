package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 流量日志统计 **取值范围**： 不涉及
 */
public class ListFlowStatisticRespData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<FlowDetailsVO> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public ListFlowStatisticRespData withRecords(List<FlowDetailsVO> records) {
        this.records = records;
        return this;
    }

    public ListFlowStatisticRespData addRecordsItem(FlowDetailsVO recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListFlowStatisticRespData withRecords(Consumer<List<FlowDetailsVO>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释**： 统计记录 **取值范围**： 不涉及
     * @return records
     */
    public List<FlowDetailsVO> getRecords() {
        return records;
    }

    public void setRecords(List<FlowDetailsVO> records) {
        this.records = records;
    }

    public ListFlowStatisticRespData withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 总数 **取值范围**： 不涉及
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
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
        ListFlowStatisticRespData that = (ListFlowStatisticRespData) obj;
        return Objects.equals(this.records, that.records) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlowStatisticRespData {\n");
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
