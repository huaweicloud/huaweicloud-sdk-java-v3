package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AttackTrendRespBody
 */
public class AttackTrendRespBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny_count")

    private Long denyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permit_count")

    private Long permitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    public AttackTrendRespBody withDenyCount(Long denyCount) {
        this.denyCount = denyCount;
        return this;
    }

    /**
     * **参数解释**： 阻断次数 **取值范围**： 不涉及
     * @return denyCount
     */
    public Long getDenyCount() {
        return denyCount;
    }

    public void setDenyCount(Long denyCount) {
        this.denyCount = denyCount;
    }

    public AttackTrendRespBody withPermitCount(Long permitCount) {
        this.permitCount = permitCount;
        return this;
    }

    /**
     * **参数解释**： 放行次数 **取值范围**： 不涉及
     * @return permitCount
     */
    public Long getPermitCount() {
        return permitCount;
    }

    public void setPermitCount(Long permitCount) {
        this.permitCount = permitCount;
    }

    public AttackTrendRespBody withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * **参数解释**： 聚合时间 **取值范围**： 不涉及
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttackTrendRespBody that = (AttackTrendRespBody) obj;
        return Objects.equals(this.denyCount, that.denyCount) && Objects.equals(this.permitCount, that.permitCount)
            && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denyCount, permitCount, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttackTrendRespBody {\n");
        sb.append("    denyCount: ").append(toIndentedString(denyCount)).append("\n");
        sb.append("    permitCount: ").append(toIndentedString(permitCount)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
