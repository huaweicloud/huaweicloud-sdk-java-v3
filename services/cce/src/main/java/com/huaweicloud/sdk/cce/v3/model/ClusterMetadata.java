package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 可以通过 annotations[\&quot;cluster.install.addons/install\&quot;] 来指定创建集群时需要安装的插件，格式形如 &#x60;&#x60;&#x60; [   {     \&quot;addonTemplateName\&quot;: \&quot;autoscaler\&quot;,     \&quot;version\&quot;: \&quot;1.15.3\&quot;,     \&quot;values\&quot;: {       \&quot;flavor\&quot;: {         \&quot;description\&quot;: \&quot;Has only one instance\&quot;,         \&quot;name\&quot;: \&quot;Single\&quot;,         \&quot;replicas\&quot;: 1,         \&quot;resources\&quot;: [           {             \&quot;limitsCpu\&quot;: \&quot;100m\&quot;,             \&quot;limitsMem\&quot;: \&quot;300Mi\&quot;,             \&quot;name\&quot;: \&quot;autoscaler\&quot;,             \&quot;requestsCpu\&quot;: \&quot;100m\&quot;,             \&quot;requestsMem\&quot;: \&quot;300Mi\&quot;           }         ]       },       \&quot;custom\&quot;: {         \&quot;coresTotal\&quot;: 32000,         \&quot;maxEmptyBulkDeleteFlag\&quot;: 10,         \&quot;maxNodesTotal\&quot;: 1000,         \&quot;memoryTotal\&quot;: 128000,         \&quot;scaleDownDelayAfterAdd\&quot;: 10,         \&quot;scaleDownDelayAfterDelete\&quot;: 10,         \&quot;scaleDownDelayAfterFailure\&quot;: 3,         \&quot;scaleDownEnabled\&quot;: false,         \&quot;scaleDownUnneededTime\&quot;: 10,         \&quot;scaleDownUtilizationThreshold\&quot;: 0.5,         \&quot;scaleUpCpuUtilizationThreshold\&quot;: 1,         \&quot;scaleUpMemUtilizationThreshold\&quot;: 1,         \&quot;scaleUpUnscheduledPodEnabled\&quot;: true,         \&quot;scaleUpUtilizationEnabled\&quot;: true,         \&quot;tenant_id\&quot;: \&quot;47eb1d64cbeb45cfa01ae20af4f4b563\&quot;,         \&quot;unremovableNodeRecheckTimeout\&quot;: 5       }     }   } ] &#x60;&#x60;&#x60;
 */
public class ClusterMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private Map<String, String> annotations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Map<String, String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTimestamp")

    private String updateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

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
     * 集群ID，资源唯一标识，创建成功后自动生成，填写无效。在创建包周期集群时，响应体不返回集群ID。
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ClusterMetadata withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 集群显示名，用于在 CCE 界面显示，该名称创建后可修改。  命名规则：以小写字母开头，由小写字母、数字、中划线(-)组成，长度范围4-128位，且不能以中划线(-)结尾。  显示名和其他集群的名称、显示名不可以重复。  在创建集群、更新集群请求体中，集群显示名alias未指定或取值为空，表示与集群名称name一致。在查询集群等响应体中，集群显示名alias将必然返回，未配置时将返回集群名称name。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ClusterMetadata withAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    public ClusterMetadata putAnnotationsItem(String key, String annotationsItem) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    public ClusterMetadata withAnnotations(Consumer<Map<String, String>> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        annotationsSetter.accept(this.annotations);
        return this;
    }

    /**
     * **参数解释：** 集群注解，由key/value组成：  ``` \"annotations\": {    \"key1\" : \"value1\",    \"key2\" : \"value2\" } ``` **约束限制：** 该字段不会被数据库保存，当前仅用于指定集群待安装插件。 **取值范围：** 不涉及 **默认取值：** 不涉及  >    - Annotations不用于标识和选择对象。Annotations中的元数据可以是small或large，structured或unstructured，并且可以包括标签不允许使用的字符。 >    - 可通过加入\"cluster.install.addons.external/install\": \"[{\\\\\"addonTemplateName\\\\\":\\\\\"icagent\\\\\"}]\"的键值对在创建集群时安装ICAgent。 
     * @return annotations
     */
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public ClusterMetadata withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public ClusterMetadata putLabelsItem(String key, String labelsItem) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    public ClusterMetadata withLabels(Consumer<Map<String, String>> labelsSetter) {
        if (this.labels == null) {
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

    public ClusterMetadata withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * **参数解释：** 集群创建时间。 **约束限制：** 创建集群时自动记录，不支持传入。 **取值范围：** 不涉及 **默认取值：** 不涉及 
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public ClusterMetadata withUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * **参数解释：** 集群更新时间。 **约束限制：** 更新集群时自动记录，不支持传入。 **取值范围：** 不涉及 **默认取值：** 不涉及 
     * @return updateTimestamp
     */
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public ClusterMetadata withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * **参数解释：** 集群时区。[IANA Time Zone Database](https://www.iana.org/time-zones)中收录的时区名称, 例如：\"Asia/Shanghai\"。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及 
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterMetadata that = (ClusterMetadata) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.uid, that.uid)
            && Objects.equals(this.alias, that.alias) && Objects.equals(this.annotations, that.annotations)
            && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.updateTimestamp, that.updateTimestamp)
            && Objects.equals(this.timezone, that.timezone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, uid, alias, annotations, labels, creationTimestamp, updateTimestamp, timezone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
