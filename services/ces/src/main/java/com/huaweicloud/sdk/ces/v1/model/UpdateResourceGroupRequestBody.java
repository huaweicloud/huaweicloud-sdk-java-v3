package com.huaweicloud.sdk.ces.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.CreateResourceGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新资源分组，请求参数。
 */
public class UpdateResourceGroupRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_name")
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<CreateResourceGroup> resources = null;
    
    public UpdateResourceGroupRequestBody withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    


    /**
     * 资源分组的名称；长度为1-128，只能包含0-9/a-z/A-Z/_/-或汉字；如：ResourceGroup-Test01。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    

    public UpdateResourceGroupRequestBody withResources(List<CreateResourceGroup> resources) {
        this.resources = resources;
        return this;
    }

    
    public UpdateResourceGroupRequestBody addResourcesItem(CreateResourceGroup resourcesItem) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public UpdateResourceGroupRequestBody withResources(Consumer<List<CreateResourceGroup>> resourcesSetter) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 更新资源分组选择一个或者多个资源。
     * @return resources
     */
    public List<CreateResourceGroup> getResources() {
        return resources;
    }

    public void setResources(List<CreateResourceGroup> resources) {
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
        UpdateResourceGroupRequestBody updateResourceGroupRequestBody = (UpdateResourceGroupRequestBody) o;
        return Objects.equals(this.groupName, updateResourceGroupRequestBody.groupName) &&
            Objects.equals(this.resources, updateResourceGroupRequestBody.resources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupName, resources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResourceGroupRequestBody {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

