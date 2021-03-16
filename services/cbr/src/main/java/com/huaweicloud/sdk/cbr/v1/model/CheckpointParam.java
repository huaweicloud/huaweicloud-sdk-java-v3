package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CheckpointParam
 */
public class CheckpointParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_trigger")
    
    private Boolean autoTrigger;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incremental")
    
    private Boolean incremental;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<String> resources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_details")
    
    private List<Resource> resourceDetails = null;
    
    public CheckpointParam withAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
        return this;
    }

    


    /**
     * 是否自动触发,true:自动触发，false：非自动触发。
     * @return autoTrigger
     */
    public Boolean getAutoTrigger() {
        return autoTrigger;
    }

    public void setAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
    }

    

    public CheckpointParam withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 备份描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CheckpointParam withIncremental(Boolean incremental) {
        this.incremental = incremental;
        return this;
    }

    


    /**
     * 是否增量备份，true:增量备份，false：非增量备份。
     * @return incremental
     */
    public Boolean getIncremental() {
        return incremental;
    }

    public void setIncremental(Boolean incremental) {
        this.incremental = incremental;
    }

    

    public CheckpointParam withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 备份名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CheckpointParam withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    
    public CheckpointParam addResourcesItem(String resourcesItem) {
        this.resources.add(resourcesItem);
        return this;
    }

    public CheckpointParam withResources(Consumer<List<String>> resourcesSetter) {
        if(this.resources == null ){
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 待备份的资源id列表:uuid
     * @return resources
     */
    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    

    public CheckpointParam withResourceDetails(List<Resource> resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }

    
    public CheckpointParam addResourceDetailsItem(Resource resourceDetailsItem) {
        this.resourceDetails.add(resourceDetailsItem);
        return this;
    }

    public CheckpointParam withResourceDetails(Consumer<List<Resource>> resourceDetailsSetter) {
        if(this.resourceDetails == null ){
            this.resourceDetails = new ArrayList<>();
        }
        resourceDetailsSetter.accept(this.resourceDetails);
        return this;
    }

    /**
     * 
     * @return resourceDetails
     */
    public List<Resource> getResourceDetails() {
        return resourceDetails;
    }

    public void setResourceDetails(List<Resource> resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckpointParam checkpointParam = (CheckpointParam) o;
        return Objects.equals(this.autoTrigger, checkpointParam.autoTrigger) &&
            Objects.equals(this.description, checkpointParam.description) &&
            Objects.equals(this.incremental, checkpointParam.incremental) &&
            Objects.equals(this.name, checkpointParam.name) &&
            Objects.equals(this.resources, checkpointParam.resources) &&
            Objects.equals(this.resourceDetails, checkpointParam.resourceDetails);
    }
    @Override
    public int hashCode() {
        return Objects.hash(autoTrigger, description, incremental, name, resources, resourceDetails);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointParam {\n");
        sb.append("    autoTrigger: ").append(toIndentedString(autoTrigger)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    incremental: ").append(toIndentedString(incremental)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    resourceDetails: ").append(toIndentedString(resourceDetails)).append("\n");
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

