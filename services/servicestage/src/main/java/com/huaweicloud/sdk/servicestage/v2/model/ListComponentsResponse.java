package com.huaweicloud.sdk.servicestage.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.ComponentView;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListComponentsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="components")
    
    private List<ComponentView> components = null;
    
    public ListComponentsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 组件个数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public ListComponentsResponse withComponents(List<ComponentView> components) {
        this.components = components;
        return this;
    }

    
    public ListComponentsResponse addComponentsItem(ComponentView componentsItem) {
        if(this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    public ListComponentsResponse withComponents(Consumer<List<ComponentView>> componentsSetter) {
        if(this.components == null) {
            this.components = new ArrayList<>();
        }
        componentsSetter.accept(this.components);
        return this;
    }

    /**
     * 组件列表。
     * @return components
     */
    public List<ComponentView> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentView> components) {
        this.components = components;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListComponentsResponse listComponentsResponse = (ListComponentsResponse) o;
        return Objects.equals(this.count, listComponentsResponse.count) &&
            Objects.equals(this.components, listComponentsResponse.components);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, components);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListComponentsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
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

