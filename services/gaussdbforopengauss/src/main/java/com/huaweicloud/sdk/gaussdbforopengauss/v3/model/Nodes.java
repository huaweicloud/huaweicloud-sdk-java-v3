package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.Components;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 节点信息
 */
public class Nodes  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="components")
    
    private List<Components> components = null;
    
    public Nodes withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 节点ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Nodes withComponents(List<Components> components) {
        this.components = components;
        return this;
    }

    
    public Nodes addComponentsItem(Components componentsItem) {
        if(this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    public Nodes withComponents(Consumer<List<Components>> componentsSetter) {
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
    public List<Components> getComponents() {
        return components;
    }

    public void setComponents(List<Components> components) {
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
        Nodes nodes = (Nodes) o;
        return Objects.equals(this.id, nodes.id) &&
            Objects.equals(this.components, nodes.components);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, components);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Nodes {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

