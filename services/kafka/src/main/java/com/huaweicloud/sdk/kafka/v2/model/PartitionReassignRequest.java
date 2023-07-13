package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PartitionReassignRequest
 */
public class PartitionReassignRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reassignments")

    private List<PartitionReassignEntity> reassignments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "throttle")

    private Integer throttle;

    public PartitionReassignRequest withReassignments(List<PartitionReassignEntity> reassignments) {
        this.reassignments = reassignments;
        return this;
    }

    public PartitionReassignRequest addReassignmentsItem(PartitionReassignEntity reassignmentsItem) {
        if (this.reassignments == null) {
            this.reassignments = new ArrayList<>();
        }
        this.reassignments.add(reassignmentsItem);
        return this;
    }

    public PartitionReassignRequest withReassignments(Consumer<List<PartitionReassignEntity>> reassignmentsSetter) {
        if (this.reassignments == null) {
            this.reassignments = new ArrayList<>();
        }
        reassignmentsSetter.accept(this.reassignments);
        return this;
    }

    /**
     * 重平衡分配方案。
     * @return reassignments
     */
    public List<PartitionReassignEntity> getReassignments() {
        return reassignments;
    }

    public void setReassignments(List<PartitionReassignEntity> reassignments) {
        this.reassignments = reassignments;
    }

    public PartitionReassignRequest withThrottle(Integer throttle) {
        this.throttle = throttle;
        return this;
    }

    /**
     * 重平衡门限值。
     * @return throttle
     */
    public Integer getThrottle() {
        return throttle;
    }

    public void setThrottle(Integer throttle) {
        this.throttle = throttle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PartitionReassignRequest that = (PartitionReassignRequest) obj;
        return Objects.equals(this.reassignments, that.reassignments) && Objects.equals(this.throttle, that.throttle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reassignments, throttle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartitionReassignRequest {\n");
        sb.append("    reassignments: ").append(toIndentedString(reassignments)).append("\n");
        sb.append("    throttle: ").append(toIndentedString(throttle)).append("\n");
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
