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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nicMultiqueue")

    private String nicMultiqueue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nicThreshold")

    private String nicThreshold;

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
     * 格式为key/value键值对。键值对个数不超过20条。 - Key：必须以字母或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符；另外可以使用DNS子域作为前缀，例如example.com/my-key，DNS子域最长253个字符。 - Value：可以为空或者非空字符串，非空字符串必须以字符或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符。  示例： ``` \"k8sTags\": {   \"key\": \"value\" } ``` 
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
     * 节点最大允许创建的实例数(Pod)，该数量包含系统默认实例，取值范围为16~256。 该设置的目的为防止节点因管理过多实例而负载过重，请根据您的业务需要进行设置。 
     * @return maxPods
     */
    public Integer getMaxPods() {
        return maxPods;
    }

    public void setMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
    }

    public ReinstallK8sOptionsConfig withNicMultiqueue(String nicMultiqueue) {
        this.nicMultiqueue = nicMultiqueue;
        return this;
    }

    /**
     * - 弹性网卡队列数配置，默认配置示例如下： ``` \"[{\\\"queue\\\":4}]\" ``` 包含如下字段： - queue: 弹性网卡队列数。 - 仅在turbo集群的BMS节点时，该字段才可配置。 - 当前支持可配置队列数以及弹性网卡数：{\"1\":128, \"2\":92, \"4\":92, \"8\":32, \"16\":16,\"28\":9}, 既1弹性网卡队列可绑定128张弹性网卡，2队列弹性网卡可绑定92张，以此类推。 - 弹性网卡队列数越多，性能越强，但可绑定弹性网卡数越少，请根据您的需求进行配置（创建后不可修改）。 
     * @return nicMultiqueue
     */
    public String getNicMultiqueue() {
        return nicMultiqueue;
    }

    public void setNicMultiqueue(String nicMultiqueue) {
        this.nicMultiqueue = nicMultiqueue;
    }

    public ReinstallK8sOptionsConfig withNicThreshold(String nicThreshold) {
        this.nicThreshold = nicThreshold;
        return this;
    }

    /**
     * - 弹性网卡预绑定比例配置，默认配置示例如下： ``` \"0.3:0.6\" ```   - 第一位小数：预绑定低水位，弹性网卡预绑定的最低比例（最小预绑定弹性网卡数 = ⌊节点的总弹性网卡数 * 预绑定低水位⌋）   - 第二位小数：预绑定高水位，弹性网卡预绑定的最高比例（最大预绑定弹性网卡数 = ⌊节点的总弹性网卡数 * 预绑定高水位⌋）   - BMS节点上绑定的弹性网卡数：Pod正在使用的弹性网卡数 + 最小预绑定弹性网卡数 < BMS节点上绑定的弹性网卡数 < Pod正在使用的弹性网卡数 + 最大预绑定弹性网卡数   - BMS节点上当预绑定弹性网卡数 < 最小预绑定弹性网卡数时：会绑定弹性网卡，使得预绑定弹性网卡数 = 最小预绑定弹性网卡数   - BMS节点上当预绑定弹性网卡数 > 最大预绑定弹性网卡数时：会定时解绑弹性网卡（约2分钟一次），直到预绑定弹性网卡数 = 最大预绑定弹性网卡数   - 取值范围：[0.0, 1.0]; 一位小数; 低水位 <= 高水位 - 仅在turbo集群的BMS节点时，该字段才可配置。 - 弹性网卡预绑定能加快工作负载的创建，但会占用IP，请根据您的需求进行配置。 
     * @return nicThreshold
     */
    public String getNicThreshold() {
        return nicThreshold;
    }

    public void setNicThreshold(String nicThreshold) {
        this.nicThreshold = nicThreshold;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReinstallK8sOptionsConfig reinstallK8sOptionsConfig = (ReinstallK8sOptionsConfig) o;
        return Objects.equals(this.labels, reinstallK8sOptionsConfig.labels)
            && Objects.equals(this.taints, reinstallK8sOptionsConfig.taints)
            && Objects.equals(this.maxPods, reinstallK8sOptionsConfig.maxPods)
            && Objects.equals(this.nicMultiqueue, reinstallK8sOptionsConfig.nicMultiqueue)
            && Objects.equals(this.nicThreshold, reinstallK8sOptionsConfig.nicThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels, taints, maxPods, nicMultiqueue, nicThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallK8sOptionsConfig {\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
        sb.append("    maxPods: ").append(toIndentedString(maxPods)).append("\n");
        sb.append("    nicMultiqueue: ").append(toIndentedString(nicMultiqueue)).append("\n");
        sb.append("    nicThreshold: ").append(toIndentedString(nicThreshold)).append("\n");
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
