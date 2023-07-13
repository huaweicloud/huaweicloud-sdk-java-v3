package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAutoLaunchGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_launch_group")

    private ShowAutoLaunchGroupResp autoLaunchGroup;

    public ShowAutoLaunchGroupResponse withAutoLaunchGroup(ShowAutoLaunchGroupResp autoLaunchGroup) {
        this.autoLaunchGroup = autoLaunchGroup;
        return this;
    }

    public ShowAutoLaunchGroupResponse withAutoLaunchGroup(Consumer<ShowAutoLaunchGroupResp> autoLaunchGroupSetter) {
        if (this.autoLaunchGroup == null) {
            this.autoLaunchGroup = new ShowAutoLaunchGroupResp();
            autoLaunchGroupSetter.accept(this.autoLaunchGroup);
        }

        return this;
    }

    /**
     * Get autoLaunchGroup
     * @return autoLaunchGroup
     */
    public ShowAutoLaunchGroupResp getAutoLaunchGroup() {
        return autoLaunchGroup;
    }

    public void setAutoLaunchGroup(ShowAutoLaunchGroupResp autoLaunchGroup) {
        this.autoLaunchGroup = autoLaunchGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutoLaunchGroupResponse that = (ShowAutoLaunchGroupResponse) obj;
        return Objects.equals(this.autoLaunchGroup, that.autoLaunchGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoLaunchGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoLaunchGroupResponse {\n");
        sb.append("    autoLaunchGroup: ").append(toIndentedString(autoLaunchGroup)).append("\n");
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
