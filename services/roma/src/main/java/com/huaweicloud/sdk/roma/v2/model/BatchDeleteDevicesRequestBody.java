package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BatchDeleteDevicesRequestBody
 */
public class BatchDeleteDevicesRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<Integer> resources = null;
    
    public BatchDeleteDevicesRequestBody withResources(List<Integer> resources) {
        this.resources = resources;
        return this;
    }

    
    public BatchDeleteDevicesRequestBody addResourcesItem(Integer resourcesItem) {
        this.resources.add(resourcesItem);
        return this;
    }

    public BatchDeleteDevicesRequestBody withResources(Consumer<List<Integer>> resourcesSetter) {
        if(this.resources == null ){
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 删除设备ID列表，自动向下取整
     * @return resources
     */
    public List<Integer> getResources() {
        return resources;
    }

    public void setResources(List<Integer> resources) {
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
        BatchDeleteDevicesRequestBody batchDeleteDevicesRequestBody = (BatchDeleteDevicesRequestBody) o;
        return Objects.equals(this.resources, batchDeleteDevicesRequestBody.resources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteDevicesRequestBody {\n");
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

