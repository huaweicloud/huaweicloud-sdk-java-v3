package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAiGuardOverviewSummaryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    public ListAiGuardOverviewSummaryRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * **参数解释：** 开始时间戳（毫秒），必填。时间范围不超过1个月 **约束限制：** 必填 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ListAiGuardOverviewSummaryRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * **参数解释：** 结束时间戳（毫秒），必填。时间范围不超过1个月 **约束限制：** 必填 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAiGuardOverviewSummaryRequest that = (ListAiGuardOverviewSummaryRequest) obj;
        return Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAiGuardOverviewSummaryRequest {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
