package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StatisticStatusV2
 */
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed")

    private Integer fixed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solved")

    private Integer solved;

    public StatisticStatusV2 withUnresolved(Integer unresolved) {
        this.unresolved = unresolved;
        return this;
    }

    /**
     * **参数解释：** [待处理问题数。](tag:hws,hws_hk)[待处理和重新打开（需打开忽略审核开关）问题数。](tag:fcs,hcs,hcs_sm,hcs_site,hcs_sitesm) **取值范围：** 不涉及。
     * @return unresolved
     */
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

    /**
     * **参数解释：** 已解决和已修复问题数。 **取值范围：** 不涉及。
     * @return resolved
     */
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

    /**
     * **参数解释：** 已忽略问题数。 **取值范围：** 不涉及。
     * @return dismissed
     */
    public Integer getDismissed() {
        return dismissed;
    }

    public void setDismissed(Integer dismissed) {
        this.dismissed = dismissed;
    }

    public StatisticStatusV2 withFixed(Integer fixed) {
        this.fixed = fixed;
        return this;
    }

    /**
     * **参数解释：** 已修复问题数。 **取值范围：** 不涉及。
     * @return fixed
     */
    public Integer getFixed() {
        return fixed;
    }

    public void setFixed(Integer fixed) {
        this.fixed = fixed;
    }

    public StatisticStatusV2 withSolved(Integer solved) {
        this.solved = solved;
        return this;
    }

    /**
     * **参数解释：** 已解决问题数。 **取值范围：** 不涉及。
     * @return solved
     */
    public Integer getSolved() {
        return solved;
    }

    public void setSolved(Integer solved) {
        this.solved = solved;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatisticStatusV2 that = (StatisticStatusV2) obj;
        return Objects.equals(this.unresolved, that.unresolved) && Objects.equals(this.resolved, that.resolved)
            && Objects.equals(this.dismissed, that.dismissed) && Objects.equals(this.fixed, that.fixed)
            && Objects.equals(this.solved, that.solved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unresolved, resolved, dismissed, fixed, solved);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticStatusV2 {\n");
        sb.append("    unresolved: ").append(toIndentedString(unresolved)).append("\n");
        sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
        sb.append("    dismissed: ").append(toIndentedString(dismissed)).append("\n");
        sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
        sb.append("    solved: ").append(toIndentedString(solved)).append("\n");
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
