package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点重装场景Kubernetes节点配置
 */
public class ReinstallK8sOptionsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Map<String, String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taints")

    private List<Taint> taints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxPods")

    private Integer maxPods;

    public ReinstallK8sOptionsConfig withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public ReinstallK8sOptionsConfig putLabelsItem(String key, String labelsItem) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    public ReinstallK8sOptionsConfig withLabels(Consumer<Map<String, String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**： 格式为key/value键值对。 **约束限制**： 键值对个数不超过20条。 - Key：必须以字母或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符；另外可以使用DNS子域作为前缀，例如example.com/my-key，DNS子域最长253个字符。 - Value：可以为空或者非空字符串，非空字符串必须以字符或数字开头和结尾，可以包含字母、数字、连字符、下划线和点，最长63个字符。  示例： ``` \"k8sTags\": {   \"key\": \"value\" } ``` **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return labels
     */
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public ReinstallK8sOptionsConfig withTaints(List<Taint> taints) {
        this.taints = taints;
        return this;
    }

    public ReinstallK8sOptionsConfig addTaintsItem(Taint taintsItem) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        this.taints.add(taintsItem);
        return this;
    }

    public ReinstallK8sOptionsConfig withTaints(Consumer<List<Taint>> taintsSetter) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        taintsSetter.accept(this.taints);
        return this;
    }

    /**
     * 支持给创建出来的节点加Taints来设置反亲和性，taints配置不超过20条。每条Taints包含以下3个参数：  - Key：必须以字母或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符；另外可以使用DNS子域作为前缀。 - Value：必须以字符或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符。 - Effect：只可选NoSchedule，PreferNoSchedule或NoExecute。  示例：  ``` \"taints\": [{   \"key\": \"status\",   \"value\": \"unavailable\",   \"effect\": \"NoSchedule\" }, {   \"key\": \"looks\",   \"value\": \"bad\",   \"effect\": \"NoSchedule\" }] ``` 
     * @return taints
     */
    public List<Taint> getTaints() {
        return taints;
    }

    public void setTaints(List<Taint> taints) {
        this.taints = taints;
    }

    public ReinstallK8sOptionsConfig withMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
        return this;
    }

    /**
     * **参数解释**： 节点最大允许创建的实例数(Pod)，该数量包含系统默认实例。 该设置的目的为防止节点因管理过多实例而负载过重，请根据您的业务需要进行设置。 节点可以创建多少个Pod，受多个参数影响，具体请参见[节点可创建的最大Pod数量说明](maxPods.xml)。 **约束限制**： 不涉及 **取值范围**： 取值范围为16~256。 **默认取值**： 不涉及
     * minimum: 16
     * maximum: 256
     * @return maxPods
     */
    public Integer getMaxPods() {
        return maxPods;
    }

    public void setMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReinstallK8sOptionsConfig that = (ReinstallK8sOptionsConfig) obj;
        return Objects.equals(this.labels, that.labels) && Objects.equals(this.taints, that.taints)
            && Objects.equals(this.maxPods, that.maxPods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels, taints, maxPods);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallK8sOptionsConfig {\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
        sb.append("    maxPods: ").append(toIndentedString(maxPods)).append("\n");
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
