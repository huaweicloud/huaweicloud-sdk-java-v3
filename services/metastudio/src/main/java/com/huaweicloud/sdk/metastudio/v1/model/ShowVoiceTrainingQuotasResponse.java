package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ShowVoiceTrainingQuotasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_available_nums")

    private ResourceAvailableNums resourceAvailableNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<VoiceTrainingResource> resources = null;

    public ShowVoiceTrainingQuotasResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 声音模型训练资源总条数。
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowVoiceTrainingQuotasResponse withResourceAvailableNums(ResourceAvailableNums resourceAvailableNums) {
        this.resourceAvailableNums = resourceAvailableNums;
        return this;
    }

    public ShowVoiceTrainingQuotasResponse withResourceAvailableNums(
        Consumer<ResourceAvailableNums> resourceAvailableNumsSetter) {
        if (this.resourceAvailableNums == null) {
            this.resourceAvailableNums = new ResourceAvailableNums();
            resourceAvailableNumsSetter.accept(this.resourceAvailableNums);
        }

        return this;
    }

    /**
     * Get resourceAvailableNums
     * @return resourceAvailableNums
     */
    public ResourceAvailableNums getResourceAvailableNums() {
        return resourceAvailableNums;
    }

    public void setResourceAvailableNums(ResourceAvailableNums resourceAvailableNums) {
        this.resourceAvailableNums = resourceAvailableNums;
    }

    public ShowVoiceTrainingQuotasResponse withResources(List<VoiceTrainingResource> resources) {
        this.resources = resources;
        return this;
    }

    public ShowVoiceTrainingQuotasResponse addResourcesItem(VoiceTrainingResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ShowVoiceTrainingQuotasResponse withResources(Consumer<List<VoiceTrainingResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 声音模型训练资源列表。
     * @return resources
     */
    public List<VoiceTrainingResource> getResources() {
        return resources;
    }

    public void setResources(List<VoiceTrainingResource> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVoiceTrainingQuotasResponse that = (ShowVoiceTrainingQuotasResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.resourceAvailableNums, that.resourceAvailableNums)
            && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, resourceAvailableNums, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVoiceTrainingQuotasResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    resourceAvailableNums: ").append(toIndentedString(resourceAvailableNums)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
