package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowKubernetesServiceInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_timestamp")

    private Long creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_ip")

    private String clusterIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selector")

    private String selector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_affinity")

    private String sessionAffinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_port_list")

    private List<KubernetesServicePortInfo> servicePortList = null;

    public ShowKubernetesServiceInfoResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 服务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowKubernetesServiceInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 服务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowKubernetesServiceInfoResponse withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * 端点名称
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public ShowKubernetesServiceInfoResponse withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ShowKubernetesServiceInfoResponse withCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * 创建时间戳
     * minimum: 0
     * maximum: 9223372036854775807
     * @return creationTimestamp
     */
    public Long getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public ShowKubernetesServiceInfoResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ShowKubernetesServiceInfoResponse withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 标签
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public ShowKubernetesServiceInfoResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 服务类型（访问方式）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowKubernetesServiceInfoResponse withClusterIp(String clusterIp) {
        this.clusterIp = clusterIp;
        return this;
    }

    /**
     * 集群IP
     * @return clusterIp
     */
    public String getClusterIp() {
        return clusterIp;
    }

    public void setClusterIp(String clusterIp) {
        this.clusterIp = clusterIp;
    }

    public ShowKubernetesServiceInfoResponse withSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * 选择器
     * @return selector
     */
    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public ShowKubernetesServiceInfoResponse withSessionAffinity(String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
        return this;
    }

    /**
     * 会话亲和性
     * @return sessionAffinity
     */
    public String getSessionAffinity() {
        return sessionAffinity;
    }

    public void setSessionAffinity(String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
    }

    public ShowKubernetesServiceInfoResponse withServicePortList(List<KubernetesServicePortInfo> servicePortList) {
        this.servicePortList = servicePortList;
        return this;
    }

    public ShowKubernetesServiceInfoResponse addServicePortListItem(KubernetesServicePortInfo servicePortListItem) {
        if (this.servicePortList == null) {
            this.servicePortList = new ArrayList<>();
        }
        this.servicePortList.add(servicePortListItem);
        return this;
    }

    public ShowKubernetesServiceInfoResponse withServicePortList(
        Consumer<List<KubernetesServicePortInfo>> servicePortListSetter) {
        if (this.servicePortList == null) {
            this.servicePortList = new ArrayList<>();
        }
        servicePortListSetter.accept(this.servicePortList);
        return this;
    }

    /**
     * Service关联端口列表
     * @return servicePortList
     */
    public List<KubernetesServicePortInfo> getServicePortList() {
        return servicePortList;
    }

    public void setServicePortList(List<KubernetesServicePortInfo> servicePortList) {
        this.servicePortList = servicePortList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKubernetesServiceInfoResponse that = (ShowKubernetesServiceInfoResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.endpointName, that.endpointName) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.type, that.type) && Objects.equals(this.clusterIp, that.clusterIp)
            && Objects.equals(this.selector, that.selector)
            && Objects.equals(this.sessionAffinity, that.sessionAffinity)
            && Objects.equals(this.servicePortList, that.servicePortList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            endpointName,
            namespace,
            creationTimestamp,
            clusterName,
            labels,
            type,
            clusterIp,
            selector,
            sessionAffinity,
            servicePortList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKubernetesServiceInfoResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    clusterIp: ").append(toIndentedString(clusterIp)).append("\n");
        sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
        sb.append("    sessionAffinity: ").append(toIndentedString(sessionAffinity)).append("\n");
        sb.append("    servicePortList: ").append(toIndentedString(servicePortList)).append("\n");
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
