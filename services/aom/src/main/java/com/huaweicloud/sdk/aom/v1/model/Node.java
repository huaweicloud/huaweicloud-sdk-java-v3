package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.Metadata;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 任务节点定义。
 */
public class Node  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_node")
    

    private String parentNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ignore_error")
    

    private Boolean ignoreError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    

    private Metadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_name")
    

    private String taskName;

    public Node withParentNode(String parentNode) {
        this.parentNode = parentNode;
        return this;
    }

    


    /**
     * 父亲节点的名称。
     * @return parentNode
     */
    public String getParentNode() {
        return parentNode;
    }

    public void setParentNode(String parentNode) {
        this.parentNode = parentNode;
    }

    

    public Node withCategory(String category) {
        this.category = category;
        return this;
    }

    


    /**
     * 节点类型。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    

    public Node withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 节点描述,节点上任务的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public Node withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 节点id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Node withIgnoreError(Boolean ignoreError) {
        this.ignoreError = ignoreError;
        return this;
    }

    


    /**
     * 是否忽略错误
     * @return ignoreError
     */
    public Boolean getIgnoreError() {
        return ignoreError;
    }

    public void setIgnoreError(Boolean ignoreError) {
        this.ignoreError = ignoreError;
    }

    

    public Node withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Node withMetadata(Consumer<Metadata> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    

    public Node withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 节点名称,比如是Node。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Node withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    


    /**
     * 任务名称，节点上任务的名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Node node = (Node) o;
        return Objects.equals(this.parentNode, node.parentNode) &&
            Objects.equals(this.category, node.category) &&
            Objects.equals(this.description, node.description) &&
            Objects.equals(this.id, node.id) &&
            Objects.equals(this.ignoreError, node.ignoreError) &&
            Objects.equals(this.metadata, node.metadata) &&
            Objects.equals(this.name, node.name) &&
            Objects.equals(this.taskName, node.taskName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(parentNode, category, description, id, ignoreError, metadata, name, taskName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Node {\n");
        sb.append("    parentNode: ").append(toIndentedString(parentNode)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ignoreError: ").append(toIndentedString(ignoreError)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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

