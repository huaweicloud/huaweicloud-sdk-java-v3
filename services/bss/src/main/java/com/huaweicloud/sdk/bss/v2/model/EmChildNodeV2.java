package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * EmChildNodeV2
 */
public class EmChildNodeV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="relation_id")
    
    private String relationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="child_nodes")
    
    private List<EmChildNodeV2> childNodes = null;
    
    public EmChildNodeV2 withRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }

    


    /**
     * 实体关系ID。
     * @return relationId
     */
    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public EmChildNodeV2 withId(String id) {
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

    public EmChildNodeV2 withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 节点名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmChildNodeV2 withChildNodes(List<EmChildNodeV2> childNodes) {
        this.childNodes = childNodes;
        return this;
    }

    
    public EmChildNodeV2 addChildNodesItem(EmChildNodeV2 childNodesItem) {
        if (this.childNodes == null) {
            this.childNodes = new ArrayList<>();
        }
        this.childNodes.add(childNodesItem);
        return this;
    }

    public EmChildNodeV2 withChildNodes(Consumer<List<EmChildNodeV2>> childNodesSetter) {
        if(this.childNodes == null ){
            this.childNodes = new ArrayList<>();
        }
        childNodesSetter.accept(this.childNodes);
        return this;
    }

    /**
     * 子节点列表。
     * @return childNodes
     */
    public List<EmChildNodeV2> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<EmChildNodeV2> childNodes) {
        this.childNodes = childNodes;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmChildNodeV2 emChildNodeV2 = (EmChildNodeV2) o;
        return Objects.equals(this.relationId, emChildNodeV2.relationId) &&
            Objects.equals(this.id, emChildNodeV2.id) &&
            Objects.equals(this.name, emChildNodeV2.name) &&
            Objects.equals(this.childNodes, emChildNodeV2.childNodes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(relationId, id, name, childNodes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmChildNodeV2 {\n");
        sb.append("    relationId: ").append(toIndentedString(relationId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    childNodes: ").append(toIndentedString(childNodes)).append("\n");
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

