package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.ResourceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Resource
 */
public class Resource  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenantId")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceInfos")
    
    private List<ResourceInfo> resourceInfos = null;
    
    public Resource withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 租户Id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Resource withResourceInfos(List<ResourceInfo> resourceInfos) {
        this.resourceInfos = resourceInfos;
        return this;
    }

    
    public Resource addResourceInfosItem(ResourceInfo resourceInfosItem) {
        if (this.resourceInfos == null) {
            this.resourceInfos = new ArrayList<>();
        }
        this.resourceInfos.add(resourceInfosItem);
        return this;
    }

    public Resource withResourceInfos(Consumer<List<ResourceInfo>> resourceInfosSetter) {
        if(this.resourceInfos == null ){
            this.resourceInfos = new ArrayList<>();
        }
        resourceInfosSetter.accept(this.resourceInfos);
        return this;
    }

    /**
     * 资源信息列表
     * @return resourceInfos
     */
    public List<ResourceInfo> getResourceInfos() {
        return resourceInfos;
    }

    public void setResourceInfos(List<ResourceInfo> resourceInfos) {
        this.resourceInfos = resourceInfos;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resource resource = (Resource) o;
        return Objects.equals(this.tenantId, resource.tenantId) &&
            Objects.equals(this.resourceInfos, resource.resourceInfos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tenantId, resourceInfos);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resource {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    resourceInfos: ").append(toIndentedString(resourceInfos)).append("\n");
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

