package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.ResourceCreate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VaultAddResourceReq
 */
public class VaultAddResourceReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<ResourceCreate> resources = null;
    
    public VaultAddResourceReq withResources(List<ResourceCreate> resources) {
        this.resources = resources;
        return this;
    }

    
    public VaultAddResourceReq addResourcesItem(ResourceCreate resourcesItem) {
        this.resources.add(resourcesItem);
        return this;
    }

    public VaultAddResourceReq withResources(Consumer<List<ResourceCreate>> resourcesSetter) {
        if(this.resources == null ){
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源列表
     * @return resources
     */
    public List<ResourceCreate> getResources() {
        return resources;
    }

    public void setResources(List<ResourceCreate> resources) {
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
        VaultAddResourceReq vaultAddResourceReq = (VaultAddResourceReq) o;
        return Objects.equals(this.resources, vaultAddResourceReq.resources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultAddResourceReq {\n");
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

