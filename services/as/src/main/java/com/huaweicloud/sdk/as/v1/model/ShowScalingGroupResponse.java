package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ScalingGroups;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ShowScalingGroupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group")
    
    private ScalingGroups scalingGroup = null;

    public ShowScalingGroupResponse withScalingGroup(ScalingGroups scalingGroup) {
        this.scalingGroup = scalingGroup;
        return this;
    }

    public ShowScalingGroupResponse withScalingGroup(Consumer<ScalingGroups> scalingGroupSetter) {
        if(this.scalingGroup == null ){
            this.scalingGroup = new ScalingGroups();
        }
        scalingGroupSetter.accept(this.scalingGroup);
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowScalingGroupResponse showScalingGroupResponse = (ShowScalingGroupResponse) o;
        return Objects.equals(this.scalingGroup, showScalingGroupResponse.scalingGroup);
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

