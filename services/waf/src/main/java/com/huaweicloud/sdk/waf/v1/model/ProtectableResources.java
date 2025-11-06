package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProtectableResources
 */
public class ProtectableResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_name")

    private String loadbalancerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private List<Listener> listeners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eips")

    private List<EipInfo> eips = null;

    public ProtectableResources withLoadbalancerName(String loadbalancerName) {
        this.loadbalancerName = loadbalancerName;
        return this;
    }

    /**
     * **参数解释：** 负载均衡器名称 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return loadbalancerName
     */
    public String getLoadbalancerName() {
        return loadbalancerName;
    }

    public void setLoadbalancerName(String loadbalancerName) {
        this.loadbalancerName = loadbalancerName;
    }

    public ProtectableResources withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * **参数解释：** 负载均衡器ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public ProtectableResources withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释：** 负载均衡器所属的账号ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ProtectableResources withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 负载均衡器所在的项目ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ProtectableResources withListeners(List<Listener> listeners) {
        this.listeners = listeners;
        return this;
    }

    public ProtectableResources addListenersItem(Listener listenersItem) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public ProtectableResources withListeners(Consumer<List<Listener>> listenersSetter) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * **参数解释：** 当前ELB所关联的监听器列表 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return listeners
     */
    public List<Listener> getListeners() {
        return listeners;
    }

    public void setListeners(List<Listener> listeners) {
        this.listeners = listeners;
    }

    public ProtectableResources withEips(List<EipInfo> eips) {
        this.eips = eips;
        return this;
    }

    public ProtectableResources addEipsItem(EipInfo eipsItem) {
        if (this.eips == null) {
            this.eips = new ArrayList<>();
        }
        this.eips.add(eipsItem);
        return this;
    }

    public ProtectableResources withEips(Consumer<List<EipInfo>> eipsSetter) {
        if (this.eips == null) {
            this.eips = new ArrayList<>();
        }
        eipsSetter.accept(this.eips);
        return this;
    }

    /**
     * **参数解释：** 负载均衡器绑定的EIP **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return eips
     */
    public List<EipInfo> getEips() {
        return eips;
    }

    public void setEips(List<EipInfo> eips) {
        this.eips = eips;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectableResources that = (ProtectableResources) obj;
        return Objects.equals(this.loadbalancerName, that.loadbalancerName)
            && Objects.equals(this.loadbalancerId, that.loadbalancerId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.listeners, that.listeners)
            && Objects.equals(this.eips, that.eips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancerName, loadbalancerId, domainId, projectId, listeners, eips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectableResources {\n");
        sb.append("    loadbalancerName: ").append(toIndentedString(loadbalancerName)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    eips: ").append(toIndentedString(eips)).append("\n");
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
