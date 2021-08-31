package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.GetJobEntitiesInstanceInfoDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * GetJobEntitiesObjectDetail
 */
public class GetJobEntitiesObjectDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance")
    
    
    private GetJobEntitiesInstanceInfoDetail instance;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_ids")
    
    
    private List<String> resourceIds = null;
    
    public GetJobEntitiesObjectDetail withInstance(GetJobEntitiesInstanceInfoDetail instance) {
        this.instance = instance;
        return this;
    }

    public GetJobEntitiesObjectDetail withInstance(Consumer<GetJobEntitiesInstanceInfoDetail> instanceSetter) {
        if(this.instance == null ){
            this.instance = new GetJobEntitiesInstanceInfoDetail();
            instanceSetter.accept(this.instance);
        }
        
        return this;
    }


    /**
     * Get instance
     * @return instance
     */
    public GetJobEntitiesInstanceInfoDetail getInstance() {
        return instance;
    }

    public void setInstance(GetJobEntitiesInstanceInfoDetail instance) {
        this.instance = instance;
    }

    

    public GetJobEntitiesObjectDetail withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    
    public GetJobEntitiesObjectDetail addResourceIdsItem(String resourceIdsItem) {
        if(this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public GetJobEntitiesObjectDetail withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if(this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 任务涉及到的资源ID。
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetJobEntitiesObjectDetail getJobEntitiesObjectDetail = (GetJobEntitiesObjectDetail) o;
        return Objects.equals(this.instance, getJobEntitiesObjectDetail.instance) &&
            Objects.equals(this.resourceIds, getJobEntitiesObjectDetail.resourceIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instance, resourceIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetJobEntitiesObjectDetail {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
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

