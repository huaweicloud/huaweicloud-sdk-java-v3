package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowAutoLaunchGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_launch_group_id")

    private String autoLaunchGroupId;

    public ShowAutoLaunchGroupRequest withAutoLaunchGroupId(String autoLaunchGroupId) {
        this.autoLaunchGroupId = autoLaunchGroupId;
        return this;
    }

    /**
     * 智能购买组id
     * @return autoLaunchGroupId
     */
    public String getAutoLaunchGroupId() {
        return autoLaunchGroupId;
    }

    public void setAutoLaunchGroupId(String autoLaunchGroupId) {
        this.autoLaunchGroupId = autoLaunchGroupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAutoLaunchGroupRequest showAutoLaunchGroupRequest = (ShowAutoLaunchGroupRequest) o;
        return Objects.equals(this.autoLaunchGroupId, showAutoLaunchGroupRequest.autoLaunchGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoLaunchGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoLaunchGroupRequest {\n");
        sb.append("    autoLaunchGroupId: ").append(toIndentedString(autoLaunchGroupId)).append("\n");
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
