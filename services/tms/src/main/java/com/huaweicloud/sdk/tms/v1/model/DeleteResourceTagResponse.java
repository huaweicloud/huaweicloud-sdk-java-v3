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
public class DeleteResourceTagResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_resources")

    private List<TagDeleteResponseItem> failedResources = null;

    public DeleteResourceTagResponse withFailedResources(List<TagDeleteResponseItem> failedResources) {
        this.failedResources = failedResources;
        return this;
    }

    public DeleteResourceTagResponse addFailedResourcesItem(TagDeleteResponseItem failedResourcesItem) {
        if (this.failedResources == null) {
            this.failedResources = new ArrayList<>();
        }
        this.failedResources.add(failedResourcesItem);
        return this;
    }

    public DeleteResourceTagResponse withFailedResources(Consumer<List<TagDeleteResponseItem>> failedResourcesSetter) {
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
    public List<TagDeleteResponseItem> getFailedResources() {
        return failedResources;
    }

    public void setFailedResources(List<TagDeleteResponseItem> failedResources) {
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
        DeleteResourceTagResponse deleteResourceTagResponse = (DeleteResourceTagResponse) o;
        return Objects.equals(this.failedResources, deleteResourceTagResponse.failedResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failedResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteResourceTagResponse {\n");
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
