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
 * OpExtendInfoRemoveResources
 */
public class OpExtendInfoRemoveResources  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fail_count")
    
    private Integer failCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<Resource> resources = null;
    
    public OpExtendInfoRemoveResources withFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }

    


    /**
     * 删除失败的资源ID列表
     * @return failCount
     */
    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public OpExtendInfoRemoveResources withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 删除的备份数量
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public OpExtendInfoRemoveResources withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    
    public OpExtendInfoRemoveResources addResourcesItem(Resource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public OpExtendInfoRemoveResources withResources(Consumer<List<Resource>> resourcesSetter) {
        if(this.resources == null ){
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 
     * @return resources
     */
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
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
        OpExtendInfoRemoveResources opExtendInfoRemoveResources = (OpExtendInfoRemoveResources) o;
        return Objects.equals(this.failCount, opExtendInfoRemoveResources.failCount) &&
            Objects.equals(this.totalCount, opExtendInfoRemoveResources.totalCount) &&
            Objects.equals(this.resources, opExtendInfoRemoveResources.resources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(failCount, totalCount, resources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpExtendInfoRemoveResources {\n");
        sb.append("    failCount: ").append(toIndentedString(failCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

