package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowScalingGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_group")

    private ScalingGroups scalingGroup;

    public ShowScalingGroupResponse withScalingGroup(ScalingGroups scalingGroup) {
        this.scalingGroup = scalingGroup;
        return this;
    }

    public ShowScalingGroupResponse withScalingGroup(Consumer<ScalingGroups> scalingGroupSetter) {
        if (this.scalingGroup == null) {
            this.scalingGroup = new ScalingGroups();
            scalingGroupSetter.accept(this.scalingGroup);
        }

        return this;
    }

    /**
     * Get scalingGroup
     * @return scalingGroup
     */
    public ScalingGroups getScalingGroup() {
        return scalingGroup;
    }

    public void setScalingGroup(ScalingGroups scalingGroup) {
        this.scalingGroup = scalingGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowScalingGroupResponse that = (ShowScalingGroupResponse) obj;
        return Objects.equals(this.scalingGroup, that.scalingGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScalingGroupResponse {\n");
        sb.append("    scalingGroup: ").append(toIndentedString(scalingGroup)).append("\n");
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
