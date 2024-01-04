package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WorkFlowStatus
 */
public class WorkFlowStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private WorkFlowPhase phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pointStatuses")

    private List<PointStatus> pointStatuses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lineStatuses")

    private List<LineStatus> lineStatuses = null;

    public WorkFlowStatus withPhase(WorkFlowPhase phase) {
        this.phase = phase;
        return this;
    }

    /**
     * Get phase
     * @return phase
     */
    public WorkFlowPhase getPhase() {
        return phase;
    }

    public void setPhase(WorkFlowPhase phase) {
        this.phase = phase;
    }

    public WorkFlowStatus withPointStatuses(List<PointStatus> pointStatuses) {
        this.pointStatuses = pointStatuses;
        return this;
    }

    public WorkFlowStatus addPointStatusesItem(PointStatus pointStatusesItem) {
        if (this.pointStatuses == null) {
            this.pointStatuses = new ArrayList<>();
        }
        this.pointStatuses.add(pointStatusesItem);
        return this;
    }

    public WorkFlowStatus withPointStatuses(Consumer<List<PointStatus>> pointStatusesSetter) {
        if (this.pointStatuses == null) {
            this.pointStatuses = new ArrayList<>();
        }
        pointStatusesSetter.accept(this.pointStatuses);
        return this;
    }

    /**
     * 升级流程中的各个任务项的执行状态
     * @return pointStatuses
     */
    public List<PointStatus> getPointStatuses() {
        return pointStatuses;
    }

    public void setPointStatuses(List<PointStatus> pointStatuses) {
        this.pointStatuses = pointStatuses;
    }

    public WorkFlowStatus withLineStatuses(List<LineStatus> lineStatuses) {
        this.lineStatuses = lineStatuses;
        return this;
    }

    public WorkFlowStatus addLineStatusesItem(LineStatus lineStatusesItem) {
        if (this.lineStatuses == null) {
            this.lineStatuses = new ArrayList<>();
        }
        this.lineStatuses.add(lineStatusesItem);
        return this;
    }

    public WorkFlowStatus withLineStatuses(Consumer<List<LineStatus>> lineStatusesSetter) {
        if (this.lineStatuses == null) {
            this.lineStatuses = new ArrayList<>();
        }
        lineStatusesSetter.accept(this.lineStatuses);
        return this;
    }

    /**
     * 表示该升级流程的任务执行线路
     * @return lineStatuses
     */
    public List<LineStatus> getLineStatuses() {
        return lineStatuses;
    }

    public void setLineStatuses(List<LineStatus> lineStatuses) {
        this.lineStatuses = lineStatuses;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkFlowStatus that = (WorkFlowStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.pointStatuses, that.pointStatuses)
            && Objects.equals(this.lineStatuses, that.lineStatuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, pointStatuses, lineStatuses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkFlowStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    pointStatuses: ").append(toIndentedString(pointStatuses)).append("\n");
        sb.append("    lineStatuses: ").append(toIndentedString(lineStatuses)).append("\n");
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
