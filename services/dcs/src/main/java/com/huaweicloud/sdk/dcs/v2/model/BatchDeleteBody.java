package com.huaweicloud.sdk.dcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BatchDeleteBody
 */
public class BatchDeleteBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    
    private List<String> instances = null;
    
    public BatchDeleteBody withInstances(List<String> instances) {
        this.instances = instances;
        return this;
    }

    
    public BatchDeleteBody addInstancesItem(String instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public BatchDeleteBody withInstances(Consumer<List<String>> instancesSetter) {
        if(this.instances == null ){
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例的ID列表。  仅当URI中参数all_failure值为“false”或者其他值时，才需要配置该参数。 
     * @return instances
     */
    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteBody batchDeleteBody = (BatchDeleteBody) o;
        return Objects.equals(this.instances, batchDeleteBody.instances);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instances);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteBody {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

