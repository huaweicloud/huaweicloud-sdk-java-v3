package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ExecutionPlanSummary
 */
public class ExecutionPlanSummary  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_add")
    
    
    private Integer resourceAdd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_update")
    
    
    private Integer resourceUpdate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_delete")
    
    
    private Integer resourceDelete;

    public ExecutionPlanSummary withResourceAdd(Integer resourceAdd) {
        this.resourceAdd = resourceAdd;
        return this;
    }

    


    /**
     * 新增资源数
     * @return resourceAdd
     */
    public Integer getResourceAdd() {
        return resourceAdd;
    }

    public void setResourceAdd(Integer resourceAdd) {
        this.resourceAdd = resourceAdd;
    }

    

    public ExecutionPlanSummary withResourceUpdate(Integer resourceUpdate) {
        this.resourceUpdate = resourceUpdate;
        return this;
    }

    


    /**
     * 更新资源数
     * @return resourceUpdate
     */
    public Integer getResourceUpdate() {
        return resourceUpdate;
    }

    public void setResourceUpdate(Integer resourceUpdate) {
        this.resourceUpdate = resourceUpdate;
    }

    

    public ExecutionPlanSummary withResourceDelete(Integer resourceDelete) {
        this.resourceDelete = resourceDelete;
        return this;
    }

    


    /**
     * 删除资源数
     * @return resourceDelete
     */
    public Integer getResourceDelete() {
        return resourceDelete;
    }

    public void setResourceDelete(Integer resourceDelete) {
        this.resourceDelete = resourceDelete;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecutionPlanSummary executionPlanSummary = (ExecutionPlanSummary) o;
        return Objects.equals(this.resourceAdd, executionPlanSummary.resourceAdd) &&
            Objects.equals(this.resourceUpdate, executionPlanSummary.resourceUpdate) &&
            Objects.equals(this.resourceDelete, executionPlanSummary.resourceDelete);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceAdd, resourceUpdate, resourceDelete);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionPlanSummary {\n");
        sb.append("    resourceAdd: ").append(toIndentedString(resourceAdd)).append("\n");
        sb.append("    resourceUpdate: ").append(toIndentedString(resourceUpdate)).append("\n");
        sb.append("    resourceDelete: ").append(toIndentedString(resourceDelete)).append("\n");
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

