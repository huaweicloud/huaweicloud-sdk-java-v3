package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务器运行状态响应对象
 */
public class ServerStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private ServerState total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok")

    private Object ok;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warning")

    private Object warning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical")

    private Object critical;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health")

    private Object health;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unhealth")

    private Object unhealth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isolation")

    private Object isolation;

    public ServerStatus withTotal(ServerState total) {
        this.total = total;
        return this;
    }

    public ServerStatus withTotal(Consumer<ServerState> totalSetter) {
        if (this.total == null) {
            this.total = new ServerState();
            totalSetter.accept(this.total);
        }

        return this;
    }

    /**
     * Get total
     * @return total
     */
    public ServerState getTotal() {
        return total;
    }

    public void setTotal(ServerState total) {
        this.total = total;
    }

    public ServerStatus withOk(Object ok) {
        this.ok = ok;
        return this;
    }

    /**
     * 服务器运行OK状态所有对象
     * @return ok
     */
    public Object getOk() {
        return ok;
    }

    public void setOk(Object ok) {
        this.ok = ok;
    }

    public ServerStatus withWarning(Object warning) {
        this.warning = warning;
        return this;
    }

    /**
     * 服务器运行Warning状态所有对象
     * @return warning
     */
    public Object getWarning() {
        return warning;
    }

    public void setWarning(Object warning) {
        this.warning = warning;
    }

    public ServerStatus withCritical(Object critical) {
        this.critical = critical;
        return this;
    }

    /**
     * 服务器运行Critical状态所有对象
     * @return critical
     */
    public Object getCritical() {
        return critical;
    }

    public void setCritical(Object critical) {
        this.critical = critical;
    }

    public ServerStatus withHealth(Object health) {
        this.health = health;
        return this;
    }

    /**
     * 服务器运行Health状态所有对象
     * @return health
     */
    public Object getHealth() {
        return health;
    }

    public void setHealth(Object health) {
        this.health = health;
    }

    public ServerStatus withUnhealth(Object unhealth) {
        this.unhealth = unhealth;
        return this;
    }

    /**
     * 服务器运行UnHealth状态所有对象
     * @return unhealth
     */
    public Object getUnhealth() {
        return unhealth;
    }

    public void setUnhealth(Object unhealth) {
        this.unhealth = unhealth;
    }

    public ServerStatus withIsolation(Object isolation) {
        this.isolation = isolation;
        return this;
    }

    /**
     * 服务器运行Isolation状态所有对象
     * @return isolation
     */
    public Object getIsolation() {
        return isolation;
    }

    public void setIsolation(Object isolation) {
        this.isolation = isolation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerStatus that = (ServerStatus) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.ok, that.ok)
            && Objects.equals(this.warning, that.warning) && Objects.equals(this.critical, that.critical)
            && Objects.equals(this.health, that.health) && Objects.equals(this.unhealth, that.unhealth)
            && Objects.equals(this.isolation, that.isolation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, ok, warning, critical, health, unhealth, isolation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerStatus {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
        sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
        sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
        sb.append("    health: ").append(toIndentedString(health)).append("\n");
        sb.append("    unhealth: ").append(toIndentedString(unhealth)).append("\n");
        sb.append("    isolation: ").append(toIndentedString(isolation)).append("\n");
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
