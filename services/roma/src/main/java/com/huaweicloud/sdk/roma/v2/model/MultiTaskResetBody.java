package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MultiTaskResetBody
 */
public class MultiTaskResetBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_from")

    private Long dateFrom;

    public MultiTaskResetBody withDateFrom(Long dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    /**
     * 任务重置开始时间，UTC时间戳，允许为空
     * minimum: 1
     * maximum: -8446744073709551617
     * @return dateFrom
     */
    public Long getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Long dateFrom) {
        this.dateFrom = dateFrom;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiTaskResetBody multiTaskResetBody = (MultiTaskResetBody) o;
        return Objects.equals(this.dateFrom, multiTaskResetBody.dateFrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateFrom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiTaskResetBody {\n");
        sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
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
