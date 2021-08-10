package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** StatisticStatusV2 */
public class StatisticStatusV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unresolved")

    private Integer unresolved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved")

    private Integer resolved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dismissed")

    private Integer dismissed;

    public StatisticStatusV2 withUnresolved(Integer unresolved) {
        this.unresolved = unresolved;
        return this;
    }

    /** 未解决
     * 
     * @return unresolved */
    public Integer getUnresolved() {
        return unresolved;
    }

    public void setUnresolved(Integer unresolved) {
        this.unresolved = unresolved;
    }

    public StatisticStatusV2 withResolved(Integer resolved) {
        this.resolved = resolved;
        return this;
    }

    /** 已解决
     * 
     * @return resolved */
    public Integer getResolved() {
        return resolved;
    }

    public void setResolved(Integer resolved) {
        this.resolved = resolved;
    }

    public StatisticStatusV2 withDismissed(Integer dismissed) {
        this.dismissed = dismissed;
        return this;
    }

    /** 已忽略
     * 
     * @return dismissed */
    public Integer getDismissed() {
        return dismissed;
    }

    public void setDismissed(Integer dismissed) {
        this.dismissed = dismissed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatisticStatusV2 statisticStatusV2 = (StatisticStatusV2) o;
        return Objects.equals(this.unresolved, statisticStatusV2.unresolved)
            && Objects.equals(this.resolved, statisticStatusV2.resolved)
            && Objects.equals(this.dismissed, statisticStatusV2.dismissed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unresolved, resolved, dismissed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticStatusV2 {\n");
        sb.append("    unresolved: ").append(toIndentedString(unresolved)).append("\n");
        sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
        sb.append("    dismissed: ").append(toIndentedString(dismissed)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
