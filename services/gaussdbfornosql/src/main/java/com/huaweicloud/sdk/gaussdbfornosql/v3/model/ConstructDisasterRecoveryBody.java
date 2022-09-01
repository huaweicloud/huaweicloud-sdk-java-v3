package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConstructDisasterRecoveryBody
 */
public class ConstructDisasterRecoveryBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    @JacksonXmlProperty(localName = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    @JacksonXmlProperty(localName = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_role")

    @JacksonXmlProperty(localName = "instance_role")

    private String instanceRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_instance")

    @JacksonXmlProperty(localName = "disaster_recovery_instance")

    private ConstructDisasterRecoveryInstance disasterRecoveryInstance;

    public ConstructDisasterRecoveryBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 容灾ID。 对容灾角色为主的实例下发搭建容灾接口时不传该参数，接口成功响应后返回生成的容灾ID。 对容灾角色为备的实例下发建容灾接口时必传该参数，且必须与上述生成的容灾ID保持一致。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConstructDisasterRecoveryBody withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 搭建容灾关系的别名。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ConstructDisasterRecoveryBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 建立容灾关系所需要的容灾密码，搭建同一容灾关系的两次调用容灾密码必须保持一致。 容灾密码为容灾集群内部数据通信所用，不能用于客户端连接使用。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ConstructDisasterRecoveryBody withInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
        return this;
    }

    /**
     * 指定当前实例的容灾角色。取值为master或slave，表示在容灾关系中角色为主或备。
     * @return instanceRole
     */
    public String getInstanceRole() {
        return instanceRole;
    }

    public void setInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
    }

    public ConstructDisasterRecoveryBody withDisasterRecoveryInstance(
        ConstructDisasterRecoveryInstance disasterRecoveryInstance) {
        this.disasterRecoveryInstance = disasterRecoveryInstance;
        return this;
    }

    public ConstructDisasterRecoveryBody withDisasterRecoveryInstance(
        Consumer<ConstructDisasterRecoveryInstance> disasterRecoveryInstanceSetter) {
        if (this.disasterRecoveryInstance == null) {
            this.disasterRecoveryInstance = new ConstructDisasterRecoveryInstance();
            disasterRecoveryInstanceSetter.accept(this.disasterRecoveryInstance);
        }

        return this;
    }

    /**
     * Get disasterRecoveryInstance
     * @return disasterRecoveryInstance
     */
    public ConstructDisasterRecoveryInstance getDisasterRecoveryInstance() {
        return disasterRecoveryInstance;
    }

    public void setDisasterRecoveryInstance(ConstructDisasterRecoveryInstance disasterRecoveryInstance) {
        this.disasterRecoveryInstance = disasterRecoveryInstance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConstructDisasterRecoveryBody constructDisasterRecoveryBody = (ConstructDisasterRecoveryBody) o;
        return Objects.equals(this.id, constructDisasterRecoveryBody.id)
            && Objects.equals(this.alias, constructDisasterRecoveryBody.alias)
            && Objects.equals(this.password, constructDisasterRecoveryBody.password)
            && Objects.equals(this.instanceRole, constructDisasterRecoveryBody.instanceRole)
            && Objects.equals(this.disasterRecoveryInstance, constructDisasterRecoveryBody.disasterRecoveryInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alias, password, instanceRole, disasterRecoveryInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConstructDisasterRecoveryBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    instanceRole: ").append(toIndentedString(instanceRole)).append("\n");
        sb.append("    disasterRecoveryInstance: ").append(toIndentedString(disasterRecoveryInstance)).append("\n");
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
