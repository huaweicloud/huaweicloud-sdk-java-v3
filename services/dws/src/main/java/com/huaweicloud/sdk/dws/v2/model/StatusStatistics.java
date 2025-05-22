package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 资源统计信息。 **取值范围**： 不涉及。
 */
public class StatusStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active")

    private Long active;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public StatusStatistics withActive(Long active) {
        this.active = active;
        return this;
    }

    /**
     * **参数解释**： 活跃资源。 **取值范围**： 不涉及。
     * @return active
     */
    public Long getActive() {
        return active;
    }

    public void setActive(Long active) {
        this.active = active;
    }

    public StatusStatistics withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 总资源。 **取值范围**： 不涉及。
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
        StatusStatistics that = (StatusStatistics) obj;
        return Objects.equals(this.active, that.active) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusStatistics {\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
