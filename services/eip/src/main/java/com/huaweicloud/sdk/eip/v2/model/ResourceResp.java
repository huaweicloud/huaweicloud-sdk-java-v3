package com.huaweicloud.sdk.eip.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.QuotaShowResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResourceResp
 */
public class ResourceResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<QuotaShowResp> resources = new ArrayList<>();
    
    public ResourceResp withResources(List<QuotaShowResp> resources) {
        this.resources = resources;
        return this;
    }

    
    public ResourceResp addResourcesItem(QuotaShowResp resourcesItem) {
        this.resources.add(resourcesItem);
        return this;
    }

    public ResourceResp withResources(Consumer<List<QuotaShowResp>> resourcesSetter) {
        if(this.resources == null ){
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源配额对象
     * @return resources
     */
    public List<QuotaShowResp> getResources() {
        return resources;
    }

    public void setResources(List<QuotaShowResp> resources) {
        this.resources = resources;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceResp resourceResp = (ResourceResp) o;
        return Objects.equals(this.resources, resourceResp.resources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceResp {\n");
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

