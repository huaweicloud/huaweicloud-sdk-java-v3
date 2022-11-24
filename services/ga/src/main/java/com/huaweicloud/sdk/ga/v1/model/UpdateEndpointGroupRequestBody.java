package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * update Endpoint Group request
 */
public class UpdateEndpointGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_group")

    private UpdateEndpointGroupOption endpointGroup;

    public UpdateEndpointGroupRequestBody withEndpointGroup(UpdateEndpointGroupOption endpointGroup) {
        this.endpointGroup = endpointGroup;
        return this;
    }

    public UpdateEndpointGroupRequestBody withEndpointGroup(Consumer<UpdateEndpointGroupOption> endpointGroupSetter) {
        if (this.endpointGroup == null) {
            this.endpointGroup = new UpdateEndpointGroupOption();
            endpointGroupSetter.accept(this.endpointGroup);
        }

        return this;
    }

    /**
     * Get endpointGroup
     * @return endpointGroup
     */
    public UpdateEndpointGroupOption getEndpointGroup() {
        return endpointGroup;
    }

    public void setEndpointGroup(UpdateEndpointGroupOption endpointGroup) {
        this.endpointGroup = endpointGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEndpointGroupRequestBody updateEndpointGroupRequestBody = (UpdateEndpointGroupRequestBody) o;
        return Objects.equals(this.endpointGroup, updateEndpointGroupRequestBody.endpointGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointGroupRequestBody {\n");
        sb.append("    endpointGroup: ").append(toIndentedString(endpointGroup)).append("\n");
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
