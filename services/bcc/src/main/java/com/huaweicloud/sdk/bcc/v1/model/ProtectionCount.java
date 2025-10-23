package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 未保护资源统计
 */
public class ProtectionCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ungraded")

    private Integer ungraded;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graded")

    private GradedCount graded;

    public ProtectionCount withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ProtectionCount withUngraded(Integer ungraded) {
        this.ungraded = ungraded;
        return this;
    }

    /**
     * 未定级资源总数
     * minimum: 0
     * maximum: 2147483647
     * @return ungraded
     */
    public Integer getUngraded() {
        return ungraded;
    }

    public void setUngraded(Integer ungraded) {
        this.ungraded = ungraded;
    }

    public ProtectionCount withGraded(GradedCount graded) {
        this.graded = graded;
        return this;
    }

    public ProtectionCount withGraded(Consumer<GradedCount> gradedSetter) {
        if (this.graded == null) {
            this.graded = new GradedCount();
            gradedSetter.accept(this.graded);
        }

        return this;
    }

    /**
     * Get graded
     * @return graded
     */
    public GradedCount getGraded() {
        return graded;
    }

    public void setGraded(GradedCount graded) {
        this.graded = graded;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectionCount that = (ProtectionCount) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.ungraded, that.ungraded)
            && Objects.equals(this.graded, that.graded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, ungraded, graded);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectionCount {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    ungraded: ").append(toIndentedString(ungraded)).append("\n");
        sb.append("    graded: ").append(toIndentedString(graded)).append("\n");
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
