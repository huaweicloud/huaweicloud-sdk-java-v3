package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListWaitEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private WaitEventResult rows;

    public ListWaitEventResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: 等待事件的总数量。 **取值范围**: 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListWaitEventResponse withRows(WaitEventResult rows) {
        this.rows = rows;
        return this;
    }

    public ListWaitEventResponse withRows(Consumer<WaitEventResult> rowsSetter) {
        if (this.rows == null) {
            this.rows = new WaitEventResult();
            rowsSetter.accept(this.rows);
        }

        return this;
    }

    /**
     * Get rows
     * @return rows
     */
    public WaitEventResult getRows() {
        return rows;
    }

    public void setRows(WaitEventResult rows) {
        this.rows = rows;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWaitEventResponse that = (ListWaitEventResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.rows, that.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, rows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWaitEventResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
