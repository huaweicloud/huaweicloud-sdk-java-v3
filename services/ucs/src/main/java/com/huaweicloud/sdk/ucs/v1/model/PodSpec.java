package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PodSpec 是 Kubernetes 中描述 Pod 的核心数据结构
 */
public class PodSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<Object> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containers")

    private List<Object> containers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restartPolicy")

    private String restartPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminationGracePeriodSeconds")

    private Integer terminationGracePeriodSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activeDeadlineSeconds")

    private Integer activeDeadlineSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnsPolicy")

    private String dnsPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeSelector")

    private Map<String, String> nodeSelector = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceAccountName")

    private String serviceAccountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceAccount")

    private String serviceAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "automountServiceAccountToken")

    private Boolean automountServiceAccountToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeName")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securityContext")

    private Object securityContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedulerName")

    private String schedulerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tolerations")

    private List<Toleration> tolerations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableServiceLinks")

    private Boolean enableServiceLinks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preemptionPolicy")

    private String preemptionPolicy;

    public PodSpec withVolumes(List<Object> volumes) {
        this.volumes = volumes;
        return this;
    }

    public PodSpec addVolumesItem(Object volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public PodSpec withVolumes(Consumer<List<Object>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 定义 Pod 可以挂载的存储卷列表
     * @return volumes
     */
    public List<Object> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Object> volumes) {
        this.volumes = volumes;
    }

    public PodSpec withContainers(List<Object> containers) {
        this.containers = containers;
        return this;
    }

    public PodSpec addContainersItem(Object containersItem) {
        if (this.containers == null) {
            this.containers = new ArrayList<>();
        }
        this.containers.add(containersItem);
        return this;
    }

    public PodSpec withContainers(Consumer<List<Object>> containersSetter) {
        if (this.containers == null) {
            this.containers = new ArrayList<>();
        }
        containersSetter.accept(this.containers);
        return this;
    }

    /**
     * Pod中的主要容器列表
     * @return containers
     */
    public List<Object> getContainers() {
        return containers;
    }

    public void setContainers(List<Object> containers) {
        this.containers = containers;
    }

    public PodSpec withRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    /**
     * 容器失败后的重启策略
     * @return restartPolicy
     */
    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public PodSpec withTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }

    /**
     * 容器终止前的优雅退出时间
     * @return terminationGracePeriodSeconds
     */
    public Integer getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    public PodSpec withActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }

    /**
     * Pod在节点上的最大存活时间
     * @return activeDeadlineSeconds
     */
    public Integer getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    public PodSpec withDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        return this;
    }

    /**
     * DNS策略
     * @return dnsPolicy
     */
    public String getDnsPolicy() {
        return dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    public PodSpec withNodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    public PodSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
        if (this.nodeSelector == null) {
            this.nodeSelector = new HashMap<>();
        }
        this.nodeSelector.put(key, nodeSelectorItem);
        return this;
    }

    public PodSpec withNodeSelector(Consumer<Map<String, String>> nodeSelectorSetter) {
        if (this.nodeSelector == null) {
            this.nodeSelector = new HashMap<>();
        }
        nodeSelectorSetter.accept(this.nodeSelector);
        return this;
    }

    /**
     * 节点选择器，用于指定Pod可以调度到哪些节点
     * @return nodeSelector
     */
    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public PodSpec withServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
        return this;
    }

    /**
     * 运行此Pod所使用的ServiceAccount名称
     * @return serviceAccountName
     */
    public String getServiceAccountName() {
        return serviceAccountName;
    }

    public void setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    public PodSpec withServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }

    /**
     * 提供向后兼容的旧版ServiceAccount字段
     * @return serviceAccount
     */
    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public PodSpec withAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
        return this;
    }

    /**
     * 是否自动挂载ServiceAccount的令牌
     * @return automountServiceAccountToken
     */
    public Boolean getAutomountServiceAccountToken() {
        return automountServiceAccountToken;
    }

    public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
    }

    public PodSpec withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 指定Pod应该调度到的节点
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public PodSpec withSecurityContext(Object securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    /**
     * Pod级别的安全上下文
     * @return securityContext
     */
    public Object getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(Object securityContext) {
        this.securityContext = securityContext;
    }

    public PodSpec withSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    /**
     * 指定使用的调度器
     * @return schedulerName
     */
    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public PodSpec withTolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }

    public PodSpec addTolerationsItem(Toleration tolerationsItem) {
        if (this.tolerations == null) {
            this.tolerations = new ArrayList<>();
        }
        this.tolerations.add(tolerationsItem);
        return this;
    }

    public PodSpec withTolerations(Consumer<List<Toleration>> tolerationsSetter) {
        if (this.tolerations == null) {
            this.tolerations = new ArrayList<>();
        }
        tolerationsSetter.accept(this.tolerations);
        return this;
    }

    /**
     * 容器容忍的污点列表
     * @return tolerations
     */
    public List<Toleration> getTolerations() {
        return tolerations;
    }

    public void setTolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
    }

    public PodSpec withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Pod 的优先级
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public PodSpec withEnableServiceLinks(Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
        return this;
    }

    /**
     * 服务信息是否注入到Pod的环境变量中
     * @return enableServiceLinks
     */
    public Boolean getEnableServiceLinks() {
        return enableServiceLinks;
    }

    public void setEnableServiceLinks(Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
    }

    public PodSpec withPreemptionPolicy(String preemptionPolicy) {
        this.preemptionPolicy = preemptionPolicy;
        return this;
    }

    /**
     * 抢占优先级策略
     * @return preemptionPolicy
     */
    public String getPreemptionPolicy() {
        return preemptionPolicy;
    }

    public void setPreemptionPolicy(String preemptionPolicy) {
        this.preemptionPolicy = preemptionPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PodSpec that = (PodSpec) obj;
        return Objects.equals(this.volumes, that.volumes) && Objects.equals(this.containers, that.containers)
            && Objects.equals(this.restartPolicy, that.restartPolicy)
            && Objects.equals(this.terminationGracePeriodSeconds, that.terminationGracePeriodSeconds)
            && Objects.equals(this.activeDeadlineSeconds, that.activeDeadlineSeconds)
            && Objects.equals(this.dnsPolicy, that.dnsPolicy) && Objects.equals(this.nodeSelector, that.nodeSelector)
            && Objects.equals(this.serviceAccountName, that.serviceAccountName)
            && Objects.equals(this.serviceAccount, that.serviceAccount)
            && Objects.equals(this.automountServiceAccountToken, that.automountServiceAccountToken)
            && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.securityContext, that.securityContext)
            && Objects.equals(this.schedulerName, that.schedulerName)
            && Objects.equals(this.tolerations, that.tolerations) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.enableServiceLinks, that.enableServiceLinks)
            && Objects.equals(this.preemptionPolicy, that.preemptionPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumes,
            containers,
            restartPolicy,
            terminationGracePeriodSeconds,
            activeDeadlineSeconds,
            dnsPolicy,
            nodeSelector,
            serviceAccountName,
            serviceAccount,
            automountServiceAccountToken,
            nodeName,
            securityContext,
            schedulerName,
            tolerations,
            priority,
            enableServiceLinks,
            preemptionPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PodSpec {\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
        sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
        sb.append("    terminationGracePeriodSeconds: ")
            .append(toIndentedString(terminationGracePeriodSeconds))
            .append("\n");
        sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
        sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
        sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
        sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
        sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
        sb.append("    automountServiceAccountToken: ")
            .append(toIndentedString(automountServiceAccountToken))
            .append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
        sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
        sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    enableServiceLinks: ").append(toIndentedString(enableServiceLinks)).append("\n");
        sb.append("    preemptionPolicy: ").append(toIndentedString(preemptionPolicy)).append("\n");
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
