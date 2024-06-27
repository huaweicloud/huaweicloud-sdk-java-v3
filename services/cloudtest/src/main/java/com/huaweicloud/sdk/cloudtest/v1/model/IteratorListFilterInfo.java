package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 过滤条件
 */
public class IteratorListFilterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pi_sprints")

    private List<IssueListPiFilterInfo> piSprints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date_start")

    private OffsetDateTime planEndDateStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date_end")

    private OffsetDateTime planEndDateEnd;

    public IteratorListFilterInfo withPiSprints(List<IssueListPiFilterInfo> piSprints) {
        this.piSprints = piSprints;
        return this;
    }

    public IteratorListFilterInfo addPiSprintsItem(IssueListPiFilterInfo piSprintsItem) {
        if (this.piSprints == null) {
            this.piSprints = new ArrayList<>();
        }
        this.piSprints.add(piSprintsItem);
        return this;
    }

    public IteratorListFilterInfo withPiSprints(Consumer<List<IssueListPiFilterInfo>> piSprintsSetter) {
        if (this.piSprints == null) {
            this.piSprints = new ArrayList<>();
        }
        piSprintsSetter.accept(this.piSprints);
        return this;
    }

    /**
     * pi过滤条件
     * @return piSprints
     */
    public List<IssueListPiFilterInfo> getPiSprints() {
        return piSprints;
    }

    public void setPiSprints(List<IssueListPiFilterInfo> piSprints) {
        this.piSprints = piSprints;
    }

    public IteratorListFilterInfo withPlanEndDateStart(OffsetDateTime planEndDateStart) {
        this.planEndDateStart = planEndDateStart;
        return this;
    }

    /**
     * 计划结束间过滤开始时间点
     * @return planEndDateStart
     */
    public OffsetDateTime getPlanEndDateStart() {
        return planEndDateStart;
    }

    public void setPlanEndDateStart(OffsetDateTime planEndDateStart) {
        this.planEndDateStart = planEndDateStart;
    }

    public IteratorListFilterInfo withPlanEndDateEnd(OffsetDateTime planEndDateEnd) {
        this.planEndDateEnd = planEndDateEnd;
        return this;
    }

    /**
     * 计划结束时间过滤结束时间点
     * @return planEndDateEnd
     */
    public OffsetDateTime getPlanEndDateEnd() {
        return planEndDateEnd;
    }

    public void setPlanEndDateEnd(OffsetDateTime planEndDateEnd) {
        this.planEndDateEnd = planEndDateEnd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IteratorListFilterInfo that = (IteratorListFilterInfo) obj;
        return Objects.equals(this.piSprints, that.piSprints)
            && Objects.equals(this.planEndDateStart, that.planEndDateStart)
            && Objects.equals(this.planEndDateEnd, that.planEndDateEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(piSprints, planEndDateStart, planEndDateEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IteratorListFilterInfo {\n");
        sb.append("    piSprints: ").append(toIndentedString(piSprints)).append("\n");
        sb.append("    planEndDateStart: ").append(toIndentedString(planEndDateStart)).append("\n");
        sb.append("    planEndDateEnd: ").append(toIndentedString(planEndDateEnd)).append("\n");
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
