package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * create Endpoint Group request
 */
public class CreateEndpointGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_group")

    private CreateEndpointGroupOption endpointGroup;

    public CreateEndpointGroupRequestBody withEndpointGroup(CreateEndpointGroupOption endpointGroup) {
        this.endpointGroup = endpointGroup;
        return this;
    }

    public CreateEndpointGroupRequestBody withEndpointGroup(Consumer<CreateEndpointGroupOption> endpointGroupSetter) {
        if (this.endpointGroup == null) {
            this.endpointGroup = new CreateEndpointGroupOption();
            endpointGroupSetter.accept(this.endpointGroup);
        }

        return this;
    }

    /**
     * Get endpointGroup
     * @return endpointGroup
     */
    public CreateEndpointGroupOption getEndpointGroup() {
        return endpointGroup;
    }

    public void setEndpointGroup(CreateEndpointGroupOption endpointGroup) {
        this.endpointGroup = endpointGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEndpointGroupRequestBody that = (CreateEndpointGroupRequestBody) obj;
        return Objects.equals(this.endpointGroup, that.endpointGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEndpointGroupRequestBody {\n");
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
