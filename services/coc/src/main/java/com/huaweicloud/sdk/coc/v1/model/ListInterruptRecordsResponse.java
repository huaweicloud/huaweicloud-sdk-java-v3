package com.huaweicloud.sdk.coc.v1.model;

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
public class ListInterruptRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interrupt_record_list")

    private List<InterruptRecord> interruptRecordList = null;

    public ListInterruptRecordsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 999
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListInterruptRecordsResponse withInterruptRecordList(List<InterruptRecord> interruptRecordList) {
        this.interruptRecordList = interruptRecordList;
        return this;
    }

    public ListInterruptRecordsResponse addInterruptRecordListItem(InterruptRecord interruptRecordListItem) {
        if (this.interruptRecordList == null) {
            this.interruptRecordList = new ArrayList<>();
        }
        this.interruptRecordList.add(interruptRecordListItem);
        return this;
    }

    public ListInterruptRecordsResponse withInterruptRecordList(
        Consumer<List<InterruptRecord>> interruptRecordListSetter) {
        if (this.interruptRecordList == null) {
            this.interruptRecordList = new ArrayList<>();
        }
        interruptRecordListSetter.accept(this.interruptRecordList);
        return this;
    }

    /**
     * 列表信息
     * @return interruptRecordList
     */
    public List<InterruptRecord> getInterruptRecordList() {
        return interruptRecordList;
    }

    public void setInterruptRecordList(List<InterruptRecord> interruptRecordList) {
        this.interruptRecordList = interruptRecordList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInterruptRecordsResponse that = (ListInterruptRecordsResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.interruptRecordList, that.interruptRecordList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, interruptRecordList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInterruptRecordsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    interruptRecordList: ").append(toIndentedString(interruptRecordList)).append("\n");
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
