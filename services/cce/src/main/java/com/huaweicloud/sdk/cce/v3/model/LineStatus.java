package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LineStatus
 */
public class LineStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startPoint")

    private TaskType startPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endPoint")

    private TaskType endPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical")

    private String critical;

    public LineStatus withStartPoint(TaskType startPoint) {
        this.startPoint = startPoint;
        return this;
    }

    /**
     * Get startPoint
     * @return startPoint
     */
    public TaskType getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(TaskType startPoint) {
        this.startPoint = startPoint;
    }

    public LineStatus withEndPoint(TaskType endPoint) {
        this.endPoint = endPoint;
        return this;
    }

    /**
     * Get endPoint
     * @return endPoint
     */
    public TaskType getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(TaskType endPoint) {
        this.endPoint = endPoint;
    }

    public LineStatus withCritical(String critical) {
        this.critical = critical;
        return this;
    }

    /**
     * 表示是否为关键线路（关键线路未执行无法取消升级流程）
     * @return critical
     */
    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineStatus that = (LineStatus) obj;
        return Objects.equals(this.startPoint, that.startPoint) && Objects.equals(this.endPoint, that.endPoint)
            && Objects.equals(this.critical, that.critical);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startPoint, endPoint, critical);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineStatus {\n");
        sb.append("    startPoint: ").append(toIndentedString(startPoint)).append("\n");
        sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
        sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
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
