package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 更新后端服务器组请求参数。 */
public class UpdatePoolOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_algorithm")

    private String lbAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_persistence")

    private UpdatePoolSessionPersistenceOption sessionPersistence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_start")

    private UpdatePoolSlowStartOption slowStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_deletion_protection_enable")

    private Boolean memberDeletionProtectionEnable;

    public UpdatePoolOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /** 后端云服务器组的管理状态，只支持更新为true。 [不支持该字段，请勿使用。](tag:dt,dt_test)
     * 
     * @return adminStateUp */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public UpdatePoolOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 后端云服务器组的描述信息。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePoolOption withLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
        return this;
    }

    /** 后端云服务器组的负载均衡算法。 取值： 1、ROUND_ROBIN：加权轮询算法。 2、LEAST_CONNECTIONS：加权最少连接算法。 3、SOURCE_IP：源IP算法。 4、QUIC_CID：连接ID算法。
     * 使用说明： - 当该字段的取值为SOURCE_IP时，后端云服务器组绑定的后端云服务器的weight字段无效。 - 只有pool的protocol为QUIC时，才支持QUIC_CID算法。
     * 
     * @return lbAlgorithm */
    public String getLbAlgorithm() {
        return lbAlgorithm;
    }

    public void setLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
    }

    public UpdatePoolOption withName(String name) {
        this.name = name;
        return this;
    }

    /** 后端云服务器组的名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdatePoolOption withSessionPersistence(UpdatePoolSessionPersistenceOption sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
        return this;
    }

    public UpdatePoolOption withSessionPersistence(
        Consumer<UpdatePoolSessionPersistenceOption> sessionPersistenceSetter) {
        if (this.sessionPersistence == null) {
            this.sessionPersistence = new UpdatePoolSessionPersistenceOption();
            sessionPersistenceSetter.accept(this.sessionPersistence);
        }

        return this;
    }

    /** Get sessionPersistence
     * 
     * @return sessionPersistence */
    public UpdatePoolSessionPersistenceOption getSessionPersistence() {
        return sessionPersistence;
    }

    public void setSessionPersistence(UpdatePoolSessionPersistenceOption sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
    }

    public UpdatePoolOption withSlowStart(UpdatePoolSlowStartOption slowStart) {
        this.slowStart = slowStart;
        return this;
    }

    public UpdatePoolOption withSlowStart(Consumer<UpdatePoolSlowStartOption> slowStartSetter) {
        if (this.slowStart == null) {
            this.slowStart = new UpdatePoolSlowStartOption();
            slowStartSetter.accept(this.slowStart);
        }

        return this;
    }

    /** Get slowStart
     * 
     * @return slowStart */
    public UpdatePoolSlowStartOption getSlowStart() {
        return slowStart;
    }

    public void setSlowStart(UpdatePoolSlowStartOption slowStart) {
        this.slowStart = slowStart;
    }

    public UpdatePoolOption withMemberDeletionProtectionEnable(Boolean memberDeletionProtectionEnable) {
        this.memberDeletionProtectionEnable = memberDeletionProtectionEnable;
        return this;
    }

    /** 是否开启删除保护。取值：false不开启，true开启。 > 退场时需要先关闭所有资源的删除保护开关。
     * 
     * @return memberDeletionProtectionEnable */
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
        UpdatePoolOption updatePoolOption = (UpdatePoolOption) o;
        return Objects.equals(this.adminStateUp, updatePoolOption.adminStateUp)
            && Objects.equals(this.description, updatePoolOption.description)
            && Objects.equals(this.lbAlgorithm, updatePoolOption.lbAlgorithm)
            && Objects.equals(this.name, updatePoolOption.name)
            && Objects.equals(this.sessionPersistence, updatePoolOption.sessionPersistence)
            && Objects.equals(this.slowStart, updatePoolOption.slowStart)
            && Objects.equals(this.memberDeletionProtectionEnable, updatePoolOption.memberDeletionProtectionEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            description,
            lbAlgorithm,
            name,
            sessionPersistence,
            slowStart,
            memberDeletionProtectionEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePoolOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sessionPersistence: ").append(toIndentedString(sessionPersistence)).append("\n");
        sb.append("    slowStart: ").append(toIndentedString(slowStart)).append("\n");
        sb.append("    memberDeletionProtectionEnable: ")
            .append(toIndentedString(memberDeletionProtectionEnable))
            .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
