package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：负载均衡相关各类资源的配额信息。仅返回资源的总配额，不包括剩余可用配额。
 */
public class Quota {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer")

    private Integer loadbalancer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private Integer certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener")

    private Integer listener;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policy")

    private Integer l7policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_per_policy")

    private Integer conditionPerPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool")

    private Integer pool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor")

    private Integer healthmonitor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member")

    private Integer member;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members_per_pool")

    private Integer membersPerPool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners_per_pool")

    private Integer listenersPerPool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup")

    private Integer ipgroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup_bindings")

    private Integer ipgroupBindings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup_max_length")

    private Integer ipgroupMaxLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_policy")

    private Integer securityPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners_per_loadbalancer")

    private Integer listenersPerLoadbalancer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroups_per_listener")

    private Integer ipgroupsPerListener;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pools_per_l7policy")

    private Integer poolsPerL7policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policies_per_listener")

    private Integer l7policiesPerListener;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_instance_members_per_pool")

    private Integer freeInstanceMembersPerPool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_instance_listeners_per_loadbalancer")

    private Integer freeInstanceListenersPerLoadbalancer;

    public Quota withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：项目ID。获取方式请参见[获取项目ID](elb_fl_0008.xml)。  **取值范围**：长度为32个字符，由小写字母和数字组成。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Quota withLoadbalancer(Integer loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    /**
     * **参数解释**：负载均衡器配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return loadbalancer
     */
    public Integer getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(Integer loadbalancer) {
        this.loadbalancer = loadbalancer;
    }

    public Quota withCertificate(Integer certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * **参数解释**：证书配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return certificate
     */
    public Integer getCertificate() {
        return certificate;
    }

    public void setCertificate(Integer certificate) {
        this.certificate = certificate;
    }

    public Quota withListener(Integer listener) {
        this.listener = listener;
        return this;
    }

    /**
     * **参数解释**：监听器配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return listener
     */
    public Integer getListener() {
        return listener;
    }

    public void setListener(Integer listener) {
        this.listener = listener;
    }

    public Quota withL7policy(Integer l7policy) {
        this.l7policy = l7policy;
        return this;
    }

    /**
     * **参数解释**：转发策略配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return l7policy
     */
    public Integer getL7policy() {
        return l7policy;
    }

    public void setL7policy(Integer l7policy) {
        this.l7policy = l7policy;
    }

    public Quota withConditionPerPolicy(Integer conditionPerPolicy) {
        this.conditionPerPolicy = conditionPerPolicy;
        return this;
    }

    /**
     * **参数解释**：单个转发策略下所有转发规则的condition总数配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return conditionPerPolicy
     */
    public Integer getConditionPerPolicy() {
        return conditionPerPolicy;
    }

    public void setConditionPerPolicy(Integer conditionPerPolicy) {
        this.conditionPerPolicy = conditionPerPolicy;
    }

    public Quota withPool(Integer pool) {
        this.pool = pool;
        return this;
    }

    /**
     * **参数解释**：后端服务器组配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return pool
     */
    public Integer getPool() {
        return pool;
    }

    public void setPool(Integer pool) {
        this.pool = pool;
    }

    public Quota withHealthmonitor(Integer healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    /**
     * **参数解释**：健康检查配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return healthmonitor
     */
    public Integer getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(Integer healthmonitor) {
        this.healthmonitor = healthmonitor;
    }

    public Quota withMember(Integer member) {
        this.member = member;
        return this;
    }

    /**
     * **参数解释**：后端服务器配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return member
     */
    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    public Quota withMembersPerPool(Integer membersPerPool) {
        this.membersPerPool = membersPerPool;
        return this;
    }

    /**
     * **参数解释**：单个pool下的member的配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return membersPerPool
     */
    public Integer getMembersPerPool() {
        return membersPerPool;
    }

    public void setMembersPerPool(Integer membersPerPool) {
        this.membersPerPool = membersPerPool;
    }

    public Quota withListenersPerPool(Integer listenersPerPool) {
        this.listenersPerPool = listenersPerPool;
        return this;
    }

    /**
     * **参数解释**：单个pool关联的监听器配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return listenersPerPool
     */
    public Integer getListenersPerPool() {
        return listenersPerPool;
    }

    public void setListenersPerPool(Integer listenersPerPool) {
        this.listenersPerPool = listenersPerPool;
    }

    public Quota withIpgroup(Integer ipgroup) {
        this.ipgroup = ipgroup;
        return this;
    }

    /**
     * **参数解释**：IP地址组配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。  [不支持该字段，请勿使用。](tag:hcso_dt)
     * @return ipgroup
     */
    public Integer getIpgroup() {
        return ipgroup;
    }

    public void setIpgroup(Integer ipgroup) {
        this.ipgroup = ipgroup;
    }

    public Quota withIpgroupBindings(Integer ipgroupBindings) {
        this.ipgroupBindings = ipgroupBindings;
        return this;
    }

    /**
     * **参数解释**：单个IP地址组可以关联的监听器数量配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。  [不支持该字段，请勿使用。](tag:hcso_dt)
     * @return ipgroupBindings
     */
    public Integer getIpgroupBindings() {
        return ipgroupBindings;
    }

    public void setIpgroupBindings(Integer ipgroupBindings) {
        this.ipgroupBindings = ipgroupBindings;
    }

    public Quota withIpgroupMaxLength(Integer ipgroupMaxLength) {
        this.ipgroupMaxLength = ipgroupMaxLength;
        return this;
    }

    /**
     * **参数解释**：单个监听器下关联的所有IP地址组的ip列表中的IP总数不能超过ipgroup_max_length。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。  [不支持该字段，请勿使用。](tag:hcso_dt)
     * @return ipgroupMaxLength
     */
    public Integer getIpgroupMaxLength() {
        return ipgroupMaxLength;
    }

    public void setIpgroupMaxLength(Integer ipgroupMaxLength) {
        this.ipgroupMaxLength = ipgroupMaxLength;
    }

    public Quota withSecurityPolicy(Integer securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }

    /**
     * **参数解释**：自定义安全策略配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。  [不支持该字段，请勿使用。](tag:hcso_dt)
     * @return securityPolicy
     */
    public Integer getSecurityPolicy() {
        return securityPolicy;
    }

    public void setSecurityPolicy(Integer securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    public Quota withListenersPerLoadbalancer(Integer listenersPerLoadbalancer) {
        this.listenersPerLoadbalancer = listenersPerLoadbalancer;
        return this;
    }

    /**
     * **参数解释**：单个LB实例下的监听器配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。  > 当前单个LB下监听器配额实际未限制，但建议不要超过默认配额。
     * @return listenersPerLoadbalancer
     */
    public Integer getListenersPerLoadbalancer() {
        return listenersPerLoadbalancer;
    }

    public void setListenersPerLoadbalancer(Integer listenersPerLoadbalancer) {
        this.listenersPerLoadbalancer = listenersPerLoadbalancer;
    }

    public Quota withIpgroupsPerListener(Integer ipgroupsPerListener) {
        this.ipgroupsPerListener = ipgroupsPerListener;
        return this;
    }

    /**
     * **参数解释**：单个监听器下的IP地址组配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return ipgroupsPerListener
     */
    public Integer getIpgroupsPerListener() {
        return ipgroupsPerListener;
    }

    public void setIpgroupsPerListener(Integer ipgroupsPerListener) {
        this.ipgroupsPerListener = ipgroupsPerListener;
    }

    public Quota withPoolsPerL7policy(Integer poolsPerL7policy) {
        this.poolsPerL7policy = poolsPerL7policy;
        return this;
    }

    /**
     * **参数解释**：单个转发策略下的后端服务器组配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return poolsPerL7policy
     */
    public Integer getPoolsPerL7policy() {
        return poolsPerL7policy;
    }

    public void setPoolsPerL7policy(Integer poolsPerL7policy) {
        this.poolsPerL7policy = poolsPerL7policy;
    }

    public Quota withL7policiesPerListener(Integer l7policiesPerListener) {
        this.l7policiesPerListener = l7policiesPerListener;
        return this;
    }

    /**
     * **参数解释**：单个监听器下的转发策略配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return l7policiesPerListener
     */
    public Integer getL7policiesPerListener() {
        return l7policiesPerListener;
    }

    public void setL7policiesPerListener(Integer l7policiesPerListener) {
        this.l7policiesPerListener = l7policiesPerListener;
    }

    public Quota withFreeInstanceMembersPerPool(Integer freeInstanceMembersPerPool) {
        this.freeInstanceMembersPerPool = freeInstanceMembersPerPool;
        return this;
    }

    /**
     * **参数解释**：单个pool实例下的免费member配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return freeInstanceMembersPerPool
     */
    public Integer getFreeInstanceMembersPerPool() {
        return freeInstanceMembersPerPool;
    }

    public void setFreeInstanceMembersPerPool(Integer freeInstanceMembersPerPool) {
        this.freeInstanceMembersPerPool = freeInstanceMembersPerPool;
    }

    public Quota withFreeInstanceListenersPerLoadbalancer(Integer freeInstanceListenersPerLoadbalancer) {
        this.freeInstanceListenersPerLoadbalancer = freeInstanceListenersPerLoadbalancer;
        return this;
    }

    /**
     * **参数解释**：单个LB实例下的免费监听器配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return freeInstanceListenersPerLoadbalancer
     */
    public Integer getFreeInstanceListenersPerLoadbalancer() {
        return freeInstanceListenersPerLoadbalancer;
    }

    public void setFreeInstanceListenersPerLoadbalancer(Integer freeInstanceListenersPerLoadbalancer) {
        this.freeInstanceListenersPerLoadbalancer = freeInstanceListenersPerLoadbalancer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Quota that = (Quota) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.loadbalancer, that.loadbalancer)
            && Objects.equals(this.certificate, that.certificate) && Objects.equals(this.listener, that.listener)
            && Objects.equals(this.l7policy, that.l7policy)
            && Objects.equals(this.conditionPerPolicy, that.conditionPerPolicy) && Objects.equals(this.pool, that.pool)
            && Objects.equals(this.healthmonitor, that.healthmonitor) && Objects.equals(this.member, that.member)
            && Objects.equals(this.membersPerPool, that.membersPerPool)
            && Objects.equals(this.listenersPerPool, that.listenersPerPool)
            && Objects.equals(this.ipgroup, that.ipgroup) && Objects.equals(this.ipgroupBindings, that.ipgroupBindings)
            && Objects.equals(this.ipgroupMaxLength, that.ipgroupMaxLength)
            && Objects.equals(this.securityPolicy, that.securityPolicy)
            && Objects.equals(this.listenersPerLoadbalancer, that.listenersPerLoadbalancer)
            && Objects.equals(this.ipgroupsPerListener, that.ipgroupsPerListener)
            && Objects.equals(this.poolsPerL7policy, that.poolsPerL7policy)
            && Objects.equals(this.l7policiesPerListener, that.l7policiesPerListener)
            && Objects.equals(this.freeInstanceMembersPerPool, that.freeInstanceMembersPerPool)
            && Objects.equals(this.freeInstanceListenersPerLoadbalancer, that.freeInstanceListenersPerLoadbalancer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            loadbalancer,
            certificate,
            listener,
            l7policy,
            conditionPerPolicy,
            pool,
            healthmonitor,
            member,
            membersPerPool,
            listenersPerPool,
            ipgroup,
            ipgroupBindings,
            ipgroupMaxLength,
            securityPolicy,
            listenersPerLoadbalancer,
            ipgroupsPerListener,
            poolsPerL7policy,
            l7policiesPerListener,
            freeInstanceMembersPerPool,
            freeInstanceListenersPerLoadbalancer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Quota {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    loadbalancer: ").append(toIndentedString(loadbalancer)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    listener: ").append(toIndentedString(listener)).append("\n");
        sb.append("    l7policy: ").append(toIndentedString(l7policy)).append("\n");
        sb.append("    conditionPerPolicy: ").append(toIndentedString(conditionPerPolicy)).append("\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
        sb.append("    healthmonitor: ").append(toIndentedString(healthmonitor)).append("\n");
        sb.append("    member: ").append(toIndentedString(member)).append("\n");
        sb.append("    membersPerPool: ").append(toIndentedString(membersPerPool)).append("\n");
        sb.append("    listenersPerPool: ").append(toIndentedString(listenersPerPool)).append("\n");
        sb.append("    ipgroup: ").append(toIndentedString(ipgroup)).append("\n");
        sb.append("    ipgroupBindings: ").append(toIndentedString(ipgroupBindings)).append("\n");
        sb.append("    ipgroupMaxLength: ").append(toIndentedString(ipgroupMaxLength)).append("\n");
        sb.append("    securityPolicy: ").append(toIndentedString(securityPolicy)).append("\n");
        sb.append("    listenersPerLoadbalancer: ").append(toIndentedString(listenersPerLoadbalancer)).append("\n");
        sb.append("    ipgroupsPerListener: ").append(toIndentedString(ipgroupsPerListener)).append("\n");
        sb.append("    poolsPerL7policy: ").append(toIndentedString(poolsPerL7policy)).append("\n");
        sb.append("    l7policiesPerListener: ").append(toIndentedString(l7policiesPerListener)).append("\n");
        sb.append("    freeInstanceMembersPerPool: ").append(toIndentedString(freeInstanceMembersPerPool)).append("\n");
        sb.append("    freeInstanceListenersPerLoadbalancer: ")
            .append(toIndentedString(freeInstanceListenersPerLoadbalancer))
            .append("\n");
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
