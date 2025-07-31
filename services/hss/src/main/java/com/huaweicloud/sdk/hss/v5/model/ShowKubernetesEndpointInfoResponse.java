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
public class ShowKubernetesEndpointInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

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
    @JsonProperty(value = "association_service")

    private Boolean associationService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_pod_list")

    private List<KubernetesEndpointPodInfo> endpointPodList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_port_list")

    private List<KubernetesEndpointPortInfo> endpointPortList = null;

    public ShowKubernetesEndpointInfoResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowKubernetesEndpointInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 端点名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowKubernetesEndpointInfoResponse withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 服务名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ShowKubernetesEndpointInfoResponse withNamespace(String namespace) {
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

    public ShowKubernetesEndpointInfoResponse withCreationTimestamp(Long creationTimestamp) {
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

    public ShowKubernetesEndpointInfoResponse withClusterName(String clusterName) {
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

    public ShowKubernetesEndpointInfoResponse withLabels(String labels) {
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

    public ShowKubernetesEndpointInfoResponse withAssociationService(Boolean associationService) {
        this.associationService = associationService;
        return this;
    }

    /**
     * 是否关联服务
     * @return associationService
     */
    public Boolean getAssociationService() {
        return associationService;
    }

    public void setAssociationService(Boolean associationService) {
        this.associationService = associationService;
    }

    public ShowKubernetesEndpointInfoResponse withEndpointPodList(List<KubernetesEndpointPodInfo> endpointPodList) {
        this.endpointPodList = endpointPodList;
        return this;
    }

    public ShowKubernetesEndpointInfoResponse addEndpointPodListItem(KubernetesEndpointPodInfo endpointPodListItem) {
        if (this.endpointPodList == null) {
            this.endpointPodList = new ArrayList<>();
        }
        this.endpointPodList.add(endpointPodListItem);
        return this;
    }

    public ShowKubernetesEndpointInfoResponse withEndpointPodList(
        Consumer<List<KubernetesEndpointPodInfo>> endpointPodListSetter) {
        if (this.endpointPodList == null) {
            this.endpointPodList = new ArrayList<>();
        }
        endpointPodListSetter.accept(this.endpointPodList);
        return this;
    }

    /**
     * 端点关联Pod映射
     * @return endpointPodList
     */
    public List<KubernetesEndpointPodInfo> getEndpointPodList() {
        return endpointPodList;
    }

    public void setEndpointPodList(List<KubernetesEndpointPodInfo> endpointPodList) {
        this.endpointPodList = endpointPodList;
    }

    public ShowKubernetesEndpointInfoResponse withEndpointPortList(List<KubernetesEndpointPortInfo> endpointPortList) {
        this.endpointPortList = endpointPortList;
        return this;
    }

    public ShowKubernetesEndpointInfoResponse addEndpointPortListItem(KubernetesEndpointPortInfo endpointPortListItem) {
        if (this.endpointPortList == null) {
            this.endpointPortList = new ArrayList<>();
        }
        this.endpointPortList.add(endpointPortListItem);
        return this;
    }

    public ShowKubernetesEndpointInfoResponse withEndpointPortList(
        Consumer<List<KubernetesEndpointPortInfo>> endpointPortListSetter) {
        if (this.endpointPortList == null) {
            this.endpointPortList = new ArrayList<>();
        }
        endpointPortListSetter.accept(this.endpointPortList);
        return this;
    }

    /**
     * 端点关联端口列表
     * @return endpointPortList
     */
    public List<KubernetesEndpointPortInfo> getEndpointPortList() {
        return endpointPortList;
    }

    public void setEndpointPortList(List<KubernetesEndpointPortInfo> endpointPortList) {
        this.endpointPortList = endpointPortList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKubernetesEndpointInfoResponse that = (ShowKubernetesEndpointInfoResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.associationService, that.associationService)
            && Objects.equals(this.endpointPodList, that.endpointPodList)
            && Objects.equals(this.endpointPortList, that.endpointPortList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            serviceName,
            namespace,
            creationTimestamp,
            clusterName,
            labels,
            associationService,
            endpointPodList,
            endpointPortList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKubernetesEndpointInfoResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    associationService: ").append(toIndentedString(associationService)).append("\n");
        sb.append("    endpointPodList: ").append(toIndentedString(endpointPodList)).append("\n");
        sb.append("    endpointPortList: ").append(toIndentedString(endpointPortList)).append("\n");
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
