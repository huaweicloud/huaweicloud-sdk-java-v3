package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.ResourceDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 企业的资源信息
 */
public class AddCorpResDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource")
    
    private List<ResourceDTO> resource = null;
    
    public AddCorpResDTO withResource(List<ResourceDTO> resource) {
        this.resource = resource;
        return this;
    }

    
    public AddCorpResDTO addResourceItem(ResourceDTO resourceItem) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        this.resource.add(resourceItem);
        return this;
    }

    public AddCorpResDTO withResource(Consumer<List<ResourceDTO>> resourceSetter) {
        if(this.resource == null ){
            this.resource = new ArrayList<>();
        }
        resourceSetter.accept(this.resource);
        return this;
    }

    /**
     * 企业待添加的资源列表
     * @return resource
     */
    public List<ResourceDTO> getResource() {
        return resource;
    }

    public void setResource(List<ResourceDTO> resource) {
        this.resource = resource;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddCorpResDTO addCorpResDTO = (AddCorpResDTO) o;
        return Objects.equals(this.resource, addCorpResDTO.resource);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resource);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddCorpResDTO {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

