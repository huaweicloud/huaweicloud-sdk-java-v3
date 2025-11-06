package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释** 查询告警历史返回的总条数。 
 */
public class MetaDataForAlarmHistoryResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public MetaDataForAlarmHistoryResp withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释** 查询告警历史返回的总条数。 **取值范围**： 不涉及。 
     * minimum: 0
     * maximum: 99999999
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
        MetaDataForAlarmHistoryResp that = (MetaDataForAlarmHistoryResp) obj;
        return Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaDataForAlarmHistoryResp {\n");
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
