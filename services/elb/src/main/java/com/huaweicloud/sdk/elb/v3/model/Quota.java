package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询配额限制去请求返回对象
 */
public class Quota  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificate")
    
    private Integer certificate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="healthmonitor")
    
    private Integer healthmonitor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7policy")
    
    private Integer l7policy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listener")
    
    private Integer listener;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer")
    
    private Integer loadbalancer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member")
    
    private Integer member;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pool")
    
    private Integer pool;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;

    public Quota withCertificate(Integer certificate) {
        this.certificate = certificate;
        return this;
    }

    


    /**
     * 证书配额。 -1表示无配额限制。
     * @return certificate
     */
    public Integer getCertificate() {
        return certificate;
    }

    public void setCertificate(Integer certificate) {
        this.certificate = certificate;
    }

    public Quota withHealthmonitor(Integer healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    


    /**
     * 健康检查配额。 -1表示无配额限制。
     * @return healthmonitor
     */
    public Integer getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(Integer healthmonitor) {
        this.healthmonitor = healthmonitor;
    }

    public Quota withL7policy(Integer l7policy) {
        this.l7policy = l7policy;
        return this;
    }

    


    /**
     * 转发策略配额。 -1表示无配额限制。
     * @return l7policy
     */
    public Integer getL7policy() {
        return l7policy;
    }

    public void setL7policy(Integer l7policy) {
        this.l7policy = l7policy;
    }

    public Quota withListener(Integer listener) {
        this.listener = listener;
        return this;
    }

    


    /**
     * 监听器配额。 -1表示无配额限制。
     * @return listener
     */
    public Integer getListener() {
        return listener;
    }

    public void setListener(Integer listener) {
        this.listener = listener;
    }

    public Quota withLoadbalancer(Integer loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    


    /**
     * 负载均衡器配额。 -1表示无配额限制。
     * @return loadbalancer
     */
    public Integer getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(Integer loadbalancer) {
        this.loadbalancer = loadbalancer;
    }

    public Quota withMember(Integer member) {
        this.member = member;
        return this;
    }

    


    /**
     * 后端云服务器配额。 -1表示无配额限制。
     * @return member
     */
    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    public Quota withPool(Integer pool) {
        this.pool = pool;
        return this;
    }

    


    /**
     * 后端云服务器组配额。 -1表示无配额限制。
     * @return pool
     */
    public Integer getPool() {
        return pool;
    }

    public void setPool(Integer pool) {
        this.pool = pool;
    }

    public Quota withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Quota quota = (Quota) o;
        return Objects.equals(this.certificate, quota.certificate) &&
            Objects.equals(this.healthmonitor, quota.healthmonitor) &&
            Objects.equals(this.l7policy, quota.l7policy) &&
            Objects.equals(this.listener, quota.listener) &&
            Objects.equals(this.loadbalancer, quota.loadbalancer) &&
            Objects.equals(this.member, quota.member) &&
            Objects.equals(this.pool, quota.pool) &&
            Objects.equals(this.projectId, quota.projectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(certificate, healthmonitor, l7policy, listener, loadbalancer, member, pool, projectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Quota {\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    healthmonitor: ").append(toIndentedString(healthmonitor)).append("\n");
        sb.append("    l7policy: ").append(toIndentedString(l7policy)).append("\n");
        sb.append("    listener: ").append(toIndentedString(listener)).append("\n");
        sb.append("    loadbalancer: ").append(toIndentedString(loadbalancer)).append("\n");
        sb.append("    member: ").append(toIndentedString(member)).append("\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

