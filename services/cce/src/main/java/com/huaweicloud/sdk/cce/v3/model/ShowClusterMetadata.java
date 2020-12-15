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
 * ShowClusterMetadata
 */
public class ShowClusterMetadata  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="annotations")
    
    private Map<String, String> annotations = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creationTimestamp")
    
    private String creationTimestamp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="labels")
    
    private String labels;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="uid")
    
    private String uid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updateTimestamp")
    
    private String updateTimestamp;

    public ShowClusterMetadata withAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    

    public ShowClusterMetadata putAnnotationsItem(String key, String annotationsItem) {
         if (this.annotations == null) {
            this.annotations = new HashMap<>();
         }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    public ShowClusterMetadata withAnnotations(Consumer<Map<String, String>> annotationsSetter) {
        if(this.annotations == null ){
            this.annotations = new HashMap<>();
        }
        annotationsSetter.accept(this.annotations);
        return this;
    }
    /**
     * 集群注解。此字段与创建时的annotations无必然关系，查询时根据查询参数返回集群相关信息存入该字段中。  当查询参数detail设置为true时，该注解包含集群下节点总数(totalNodesNumber)、正常节点数(activeNodesNumber)、CPU总量(totalNodesCPU)、内存总量(totalNodesMemory)和已安装插件名称(installedAddonInstances)。
     * @return annotations
     */
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public ShowClusterMetadata withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    


    /**
     * 集群创建时间，集群创建成功后自动生成，填写无效
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public ShowClusterMetadata withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    


    /**
     * 集群标签，key/value对格式。  该字段值由系统自动生成，用于升级时前端识别集群支持的特性开关，用户指定无效，与创建时的labels无必然关系。
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public ShowClusterMetadata withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 集群名称。  命名规则：以小写字母开头，由小写字母、数字、中划线(-)组成，长度范围4-128位，且不能以中划线(-)结尾。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowClusterMetadata withUid(String uid) {
        this.uid = uid;
        return this;
    }

    


    /**
     * 资源唯一标识，创建成功后自动生成，填写无效
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ShowClusterMetadata withUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    


    /**
     * 集群更新时间，集群创建成功后自动生成，填写无效
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
        ShowClusterMetadata showClusterMetadata = (ShowClusterMetadata) o;
        return Objects.equals(this.annotations, showClusterMetadata.annotations) &&
            Objects.equals(this.creationTimestamp, showClusterMetadata.creationTimestamp) &&
            Objects.equals(this.labels, showClusterMetadata.labels) &&
            Objects.equals(this.name, showClusterMetadata.name) &&
            Objects.equals(this.uid, showClusterMetadata.uid) &&
            Objects.equals(this.updateTimestamp, showClusterMetadata.updateTimestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(annotations, creationTimestamp, labels, name, uid, updateTimestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterMetadata {\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

