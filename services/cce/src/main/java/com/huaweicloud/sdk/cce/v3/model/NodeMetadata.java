package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class NodeMetadata  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="uid")
    
    private String uid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="labels")
    
    private Map<String, String> labels = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="annotations")
    
    private Map<String, String> annotations = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creationTimestamp")
    
    private String creationTimestamp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updateTimestamp")
    
    private String updateTimestamp;

    public NodeMetadata withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 节点名称 > 命名规则：以小写字母开头，由小写字母、数字、中划线(-)组成，长度范围1-56位，且不能以中划线(-)结尾。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public NodeMetadata withUid(String uid) {
        this.uid = uid;
        return this;
    }

    


    /**
     * 节点ID，资源唯一标识，创建成功后自动生成，填写无效
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    

    public NodeMetadata withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    

    public NodeMetadata putLabelsItem(String key, String labelsItem) {
        if(this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    public NodeMetadata withLabels(Consumer<Map<String, String>> labelsSetter) {
        if(this.labels == null) {
            this.labels = new HashMap<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }
    /**
     * CCE自有节点标签，非Kubernetes原生labels。  标签可用于选择对象并查找满足某些条件的对象集合，格式为key/value键值对。  示例：  ``` \"labels\": {   \"key\" : \"value\" } ```
     * @return labels
     */
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    

    public NodeMetadata withAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    

    public NodeMetadata putAnnotationsItem(String key, String annotationsItem) {
        if(this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    public NodeMetadata withAnnotations(Consumer<Map<String, String>> annotationsSetter) {
        if(this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        annotationsSetter.accept(this.annotations);
        return this;
    }
    /**
     * CCE自有节点注解，非Kubernetes原生annotations，格式为key/value键值对。   示例：  ```  \"annotations\": {   \"key1\" : \"value1\",   \"key2\" : \"value2\" }  ```   > Annotations不用于标识和选择对象。Annotations中的元数据可以是small 或large，structured 或unstructured，并且可以包括标签不允许使用的字符。 
     * @return annotations
     */
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    

    public NodeMetadata withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    


    /**
     * 创建时间，创建成功后自动生成，填写无效
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    

    public NodeMetadata withUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    


    /**
     * 更新时间，创建成功后自动生成，填写无效
     * @return updateTimestamp
     */
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeMetadata nodeMetadata = (NodeMetadata) o;
        return Objects.equals(this.name, nodeMetadata.name) &&
            Objects.equals(this.uid, nodeMetadata.uid) &&
            Objects.equals(this.labels, nodeMetadata.labels) &&
            Objects.equals(this.annotations, nodeMetadata.annotations) &&
            Objects.equals(this.creationTimestamp, nodeMetadata.creationTimestamp) &&
            Objects.equals(this.updateTimestamp, nodeMetadata.updateTimestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, uid, labels, annotations, creationTimestamp, updateTimestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
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

