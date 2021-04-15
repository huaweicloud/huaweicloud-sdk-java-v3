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
 * 可以通过 annotations[\&quot;cluster.install.addons/install\&quot;] 来指定创建集群时需要安装的插件，格式形如 [{\\\&quot;addonTemplateName\\\&quot;:\\\&quot;autoscaler\\\&quot;,\\\&quot;version\\\&quot;:\\\&quot;1.15.3\\\&quot;,\\\&quot;values\\\&quot;:{\\\&quot;flavor\\\&quot;:{\\\&quot;description\\\&quot;:\\\&quot;Has only one instance\\\&quot;,\\\&quot;name\\\&quot;:\\\&quot;Single\\\&quot;,\\\&quot;replicas\\\&quot;:1,\\\&quot;resources\\\&quot;:[{\\\&quot;limitsCpu\\\&quot;:\\\&quot;100m\\\&quot;,\\\&quot;limitsMem\\\&quot;:\\\&quot;300Mi\\\&quot;,\\\&quot;name\\\&quot;:\\\&quot;autoscaler\\\&quot;,\\\&quot;requestsCpu\\\&quot;:\\\&quot;100m\\\&quot;,\\\&quot;requestsMem\\\&quot;:\\\&quot;300Mi\\\&quot;}]},\\\&quot;custom\\\&quot;:{\\\&quot;coresTotal\\\&quot;:32000,\\\&quot;maxEmptyBulkDeleteFlag\\\&quot;:10,\\\&quot;maxNodesTotal\\\&quot;:1000,\\\&quot;memoryTotal\\\&quot;:128000,\\\&quot;scaleDownDelayAfterAdd\\\&quot;:10,\\\&quot;scaleDownDelayAfterDelete\\\&quot;:10,\\\&quot;scaleDownDelayAfterFailure\\\&quot;:3,\\\&quot;scaleDownEnabled\\\&quot;:false,\\\&quot;scaleDownUnneededTime\\\&quot;:10,\\\&quot;scaleDownUtilizationThreshold\\\&quot;:0.5,\\\&quot;scaleUpCpuUtilizationThreshold\\\&quot;:1,\\\&quot;scaleUpMemUtilizationThreshold\\\&quot;:1,\\\&quot;scaleUpUnscheduledPodEnabled\\\&quot;:true,\\\&quot;scaleUpUtilizationEnabled\\\&quot;:true,\\\&quot;tenant_id\\\&quot;:\\\&quot;47eb1d64cbeb45cfa01ae20af4f4b563\\\&quot;,\\\&quot;unremovableNodeRecheckTimeout\\\&quot;:5}}}]
 */
public class ClusterMetadata  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="annotations")
    
    private Map<String, String> annotations = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creationTimestamp")
    
    private String creationTimestamp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="labels")
    
    private Map<String, String> labels = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="uid")
    
    private String uid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updateTimestamp")
    
    private String updateTimestamp;

    public ClusterMetadata withAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    

    public ClusterMetadata putAnnotationsItem(String key, String annotationsItem) {
        if(this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    public ClusterMetadata withAnnotations(Consumer<Map<String, String>> annotationsSetter) {
        if(this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        annotationsSetter.accept(this.annotations);
        return this;
    }
    /**
     * 集群注解，由key/value组成：  ``` \"annotations\": {    \"key1\" : \"value1\",    \"key2\" : \"value2\" } ```  > Annotations不用于标识和选择对象。Annotations中的元数据可以是small 或large，structured 或unstructured，并且可以包括标签不允许使用的字符。 > 该字段不会被数据库保存，当前仅用于指定集群待安装插件。
     * @return annotations
     */
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    

    public ClusterMetadata withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    


    /**
     * 集群创建时间
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    

    public ClusterMetadata withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    

    public ClusterMetadata putLabelsItem(String key, String labelsItem) {
        if(this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    public ClusterMetadata withLabels(Consumer<Map<String, String>> labelsSetter) {
        if(this.labels == null) {
            this.labels = new HashMap<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }
    /**
     * 集群标签，key/value对格式。  >  该字段值由系统自动生成，用于升级时前端识别集群支持的特性开关，用户指定无效。
     * @return labels
     */
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    

    public ClusterMetadata withName(String name) {
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

    

    public ClusterMetadata withUid(String uid) {
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

    

    public ClusterMetadata withUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    


    /**
     * 集群更新时间
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
        ClusterMetadata clusterMetadata = (ClusterMetadata) o;
        return Objects.equals(this.annotations, clusterMetadata.annotations) &&
            Objects.equals(this.creationTimestamp, clusterMetadata.creationTimestamp) &&
            Objects.equals(this.labels, clusterMetadata.labels) &&
            Objects.equals(this.name, clusterMetadata.name) &&
            Objects.equals(this.uid, clusterMetadata.uid) &&
            Objects.equals(this.updateTimestamp, clusterMetadata.updateTimestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(annotations, creationTimestamp, labels, name, uid, updateTimestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterMetadata {\n");
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

