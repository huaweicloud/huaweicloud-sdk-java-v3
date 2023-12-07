package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListControlViolationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_violations")

    private List<ControlViolation> controlViolations = null;

    public ListControlViolationsResponse withControlViolations(List<ControlViolation> controlViolations) {
        this.controlViolations = controlViolations;
        return this;
    }

    public ListControlViolationsResponse addControlViolationsItem(ControlViolation controlViolationsItem) {
        if (this.controlViolations == null) {
            this.controlViolations = new ArrayList<>();
        }
        this.controlViolations.add(controlViolationsItem);
        return this;
    }

    public ListControlViolationsResponse withControlViolations(
        Consumer<List<ControlViolation>> controlViolationsSetter) {
        if (this.controlViolations == null) {
            this.controlViolations = new ArrayList<>();
        }
        controlViolationsSetter.accept(this.controlViolations);
        return this;
    }

    /**
     * 控制策略合规性。
     * @return controlViolations
     */
    public List<ControlViolation> getControlViolations() {
        return controlViolations;
    }

    public void setControlViolations(List<ControlViolation> controlViolations) {
        this.controlViolations = controlViolations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListControlViolationsResponse that = (ListControlViolationsResponse) obj;
        return Objects.equals(this.controlViolations, that.controlViolations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(controlViolations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListControlViolationsResponse {\n");
        sb.append("    controlViolations: ").append(toIndentedString(controlViolations)).append("\n");
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
