package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UCSConstraintStatus
 */
public class UCSConstraintStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "violations")

    private List<UCSStatusViolation> violations = null;

    public UCSConstraintStatus withViolations(List<UCSStatusViolation> violations) {
        this.violations = violations;
        return this;
    }

    public UCSConstraintStatus addViolationsItem(UCSStatusViolation violationsItem) {
        if (this.violations == null) {
            this.violations = new ArrayList<>();
        }
        this.violations.add(violationsItem);
        return this;
    }

    public UCSConstraintStatus withViolations(Consumer<List<UCSStatusViolation>> violationsSetter) {
        if (this.violations == null) {
            this.violations = new ArrayList<>();
        }
        violationsSetter.accept(this.violations);
        return this;
    }

    /**
     * Get violations
     * @return violations
     */
    public List<UCSStatusViolation> getViolations() {
        return violations;
    }

    public void setViolations(List<UCSStatusViolation> violations) {
        this.violations = violations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UCSConstraintStatus that = (UCSConstraintStatus) obj;
        return Objects.equals(this.violations, that.violations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(violations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UCSConstraintStatus {\n");
        sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
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
