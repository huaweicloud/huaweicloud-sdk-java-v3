package com.huaweicloud.sdk.tms.v1.model;

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
public class CreateResourceTagResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_resources")

    private List<TagCreateResponseItem> failedResources = null;

    public CreateResourceTagResponse withFailedResources(List<TagCreateResponseItem> failedResources) {
        this.failedResources = failedResources;
        return this;
    }

    public CreateResourceTagResponse addFailedResourcesItem(TagCreateResponseItem failedResourcesItem) {
        if (this.failedResources == null) {
            this.failedResources = new ArrayList<>();
        }
        this.failedResources.add(failedResourcesItem);
        return this;
    }

    public CreateResourceTagResponse withFailedResources(Consumer<List<TagCreateResponseItem>> failedResourcesSetter) {
        if (this.failedResources == null) {
            this.failedResources = new ArrayList<>();
        }
        failedResourcesSetter.accept(this.failedResources);
        return this;
    }

    /**
     * 查询标签下的资源
     * @return failedResources
     */
    public List<TagCreateResponseItem> getFailedResources() {
        return failedResources;
    }

    public void setFailedResources(List<TagCreateResponseItem> failedResources) {
        this.failedResources = failedResources;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateResourceTagResponse createResourceTagResponse = (CreateResourceTagResponse) o;
        return Objects.equals(this.failedResources, createResourceTagResponse.failedResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failedResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResourceTagResponse {\n");
        sb.append("    failedResources: ").append(toIndentedString(failedResources)).append("\n");
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
