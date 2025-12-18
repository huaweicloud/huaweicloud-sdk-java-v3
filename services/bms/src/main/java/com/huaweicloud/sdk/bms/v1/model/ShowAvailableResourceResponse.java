package com.huaweicloud.sdk.bms.v1.model;

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
public class ShowAvailableResourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_resource")

    private List<AvailableResourceResp> availableResource = null;

    public ShowAvailableResourceResponse withAvailableResource(List<AvailableResourceResp> availableResource) {
        this.availableResource = availableResource;
        return this;
    }

    public ShowAvailableResourceResponse addAvailableResourceItem(AvailableResourceResp availableResourceItem) {
        if (this.availableResource == null) {
            this.availableResource = new ArrayList<>();
        }
        this.availableResource.add(availableResourceItem);
        return this;
    }

    public ShowAvailableResourceResponse withAvailableResource(
        Consumer<List<AvailableResourceResp>> availableResourceSetter) {
        if (this.availableResource == null) {
            this.availableResource = new ArrayList<>();
        }
        availableResourceSetter.accept(this.availableResource);
        return this;
    }

    /**
     * Get availableResource
     * @return availableResource
     */
    public List<AvailableResourceResp> getAvailableResource() {
        return availableResource;
    }

    public void setAvailableResource(List<AvailableResourceResp> availableResource) {
        this.availableResource = availableResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAvailableResourceResponse that = (ShowAvailableResourceResponse) obj;
        return Objects.equals(this.availableResource, that.availableResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvailableResourceResponse {\n");
        sb.append("    availableResource: ").append(toIndentedString(availableResource)).append("\n");
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
