package com.huaweicloud.sdk.elb.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.CreatePoolSessionPersistenceOption;
import com.huaweicloud.sdk.elb.v3.model.CreatePoolSlowStartOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建主机组请求
 */
public class CreatePoolOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lb_algorithm")
    
    private String lbAlgorithm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listener_id")
    
    private String listenerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer_id")
    
    private String loadbalancerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_persistence")
    
    private CreatePoolSessionPersistenceOption sessionPersistence = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slow_start")
    
    private CreatePoolSlowStartOption slowStart = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_deletion_protection_enable")
    
    private Boolean memberDeletionProtectionEnable = false;

    public CreatePoolOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 后端云服务器组的管理状态；该字段为预留字段，暂未启用。只支持更新为true。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreatePoolOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 后端云服务器组的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreatePoolOption withLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
        return this;
    }

    


    /**
     * 描述：后端云服务器组的负载均衡算法     取值：   1、ROUND_ROBIN：加权轮询算法；   2、LEAST_CONNECTIONS：加权最少连接算法；   3、SOURCE_IP：源IP算法；   4、QUIC_CID：连接ID算法；   约束：   1、当该字段的取值为SOURCE_IP时，后端云服务器组绑定的后端云服务器的weight字段无效。   2、只有pool的protocol为QUIC时，才支持QUIC_CID算法。
     * @return lbAlgorithm
     */
    public String getLbAlgorithm() {
        return lbAlgorithm;
    }

    public void setLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
    }

    public CreatePoolOption withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    


    /**
     * 后端云服务器组关联的监听器的ID。listener_id和loadbalancer_id中至少指定一个。
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public CreatePoolOption withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    


    /**
     * 后端云服务器组关联的负载均衡器ID。listener_id和loadbalancer_id中至少指定一个。
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public CreatePoolOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 后端云服务器组的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePoolOption withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 后端云服务器组所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreatePoolOption withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 描述：后端云服务器组的后端协议。   使用说明：支持TCP、UDP、HTTP和QUIC。 约束： 1、listener的protocol为UDP时，pool的protocol必须为UDP或QUIC；   2、listener的protocol为TCP时pool的protocol必须为TCP；   3、listener的protocol为HTTP或TERMINATED_HTTPS时，pool的protocol必须为HTTP。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public CreatePoolOption withSessionPersistence(CreatePoolSessionPersistenceOption sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
        return this;
    }

    public CreatePoolOption withSessionPersistence(Consumer<CreatePoolSessionPersistenceOption> sessionPersistenceSetter) {
        if(this.sessionPersistence == null ){
            this.sessionPersistence = new CreatePoolSessionPersistenceOption();
            sessionPersistenceSetter.accept(this.sessionPersistence);
        }
        
        return this;
    }


    /**
     * Get sessionPersistence
     * @return sessionPersistence
     */
    public CreatePoolSessionPersistenceOption getSessionPersistence() {
        return sessionPersistence;
    }

    public void setSessionPersistence(CreatePoolSessionPersistenceOption sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
    }

    public CreatePoolOption withSlowStart(CreatePoolSlowStartOption slowStart) {
        this.slowStart = slowStart;
        return this;
    }

    public CreatePoolOption withSlowStart(Consumer<CreatePoolSlowStartOption> slowStartSetter) {
        if(this.slowStart == null ){
            this.slowStart = new CreatePoolSlowStartOption();
            slowStartSetter.accept(this.slowStart);
        }
        
        return this;
    }


    /**
     * Get slowStart
     * @return slowStart
     */
    public CreatePoolSlowStartOption getSlowStart() {
        return slowStart;
    }

    public void setSlowStart(CreatePoolSlowStartOption slowStart) {
        this.slowStart = slowStart;
    }

    public CreatePoolOption withMemberDeletionProtectionEnable(Boolean memberDeletionProtectionEnable) {
        this.memberDeletionProtectionEnable = memberDeletionProtectionEnable;
        return this;
    }

    


    /**
     * 是否开启删除保护，默认不开启
     * @return memberDeletionProtectionEnable
     */
    public Boolean getMemberDeletionProtectionEnable() {
        return memberDeletionProtectionEnable;
    }

    public void setMemberDeletionProtectionEnable(Boolean memberDeletionProtectionEnable) {
        this.memberDeletionProtectionEnable = memberDeletionProtectionEnable;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePoolOption createPoolOption = (CreatePoolOption) o;
        return Objects.equals(this.adminStateUp, createPoolOption.adminStateUp) &&
            Objects.equals(this.description, createPoolOption.description) &&
            Objects.equals(this.lbAlgorithm, createPoolOption.lbAlgorithm) &&
            Objects.equals(this.listenerId, createPoolOption.listenerId) &&
            Objects.equals(this.loadbalancerId, createPoolOption.loadbalancerId) &&
            Objects.equals(this.name, createPoolOption.name) &&
            Objects.equals(this.projectId, createPoolOption.projectId) &&
            Objects.equals(this.protocol, createPoolOption.protocol) &&
            Objects.equals(this.sessionPersistence, createPoolOption.sessionPersistence) &&
            Objects.equals(this.slowStart, createPoolOption.slowStart) &&
            Objects.equals(this.memberDeletionProtectionEnable, createPoolOption.memberDeletionProtectionEnable);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, description, lbAlgorithm, listenerId, loadbalancerId, name, projectId, protocol, sessionPersistence, slowStart, memberDeletionProtectionEnable);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePoolOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    sessionPersistence: ").append(toIndentedString(sessionPersistence)).append("\n");
        sb.append("    slowStart: ").append(toIndentedString(slowStart)).append("\n");
        sb.append("    memberDeletionProtectionEnable: ").append(toIndentedString(memberDeletionProtectionEnable)).append("\n");
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

