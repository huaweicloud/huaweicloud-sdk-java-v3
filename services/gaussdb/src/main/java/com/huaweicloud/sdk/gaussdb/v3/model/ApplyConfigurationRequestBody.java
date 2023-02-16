package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ApplyConfigurationRequestBody
 */
public class ApplyConfigurationRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_ids")
    
    
    private List<String> instanceIds = null;
    
    public ApplyConfigurationRequestBody withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    
    public ApplyConfigurationRequestBody addInstanceIdsItem(String instanceIdsItem) {
        if(this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public ApplyConfigurationRequestBody withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if(this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 实例ID列表。列表长度限制在10以内。
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplyConfigurationRequestBody applyConfigurationRequestBody = (ApplyConfigurationRequestBody) o;
        return Objects.equals(this.instanceIds, applyConfigurationRequestBody.instanceIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyConfigurationRequestBody {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
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

