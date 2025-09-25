package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListAssetResourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<AssetResourceRsp> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Resource-Mappings")

    private String xResourceMappings;

    public ListAssetResourceResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 总数。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListAssetResourceResponse withResources(List<AssetResourceRsp> resources) {
        this.resources = resources;
        return this;
    }

    public ListAssetResourceResponse addResourcesItem(AssetResourceRsp resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListAssetResourceResponse withResources(Consumer<List<AssetResourceRsp>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * **参数解释**： 模型列表。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return resources
     */
    public List<AssetResourceRsp> getResources() {
        return resources;
    }

    public void setResources(List<AssetResourceRsp> resources) {
        this.resources = resources;
    }

    public ListAssetResourceResponse withXResourceMappings(String xResourceMappings) {
        this.xResourceMappings = xResourceMappings;
        return this;
    }

    /**
     * Get xResourceMappings
     * @return xResourceMappings
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Resource-Mappings")
    public String getXResourceMappings() {
        return xResourceMappings;
    }

    public void setXResourceMappings(String xResourceMappings) {
        this.xResourceMappings = xResourceMappings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAssetResourceResponse that = (ListAssetResourceResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.xResourceMappings, that.xResourceMappings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, resources, xResourceMappings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetResourceResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    xResourceMappings: ").append(toIndentedString(xResourceMappings)).append("\n");
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
