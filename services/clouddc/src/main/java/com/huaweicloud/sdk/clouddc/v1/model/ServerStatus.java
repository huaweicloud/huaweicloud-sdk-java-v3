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

    private ServerState ok;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warning")

    private ServerState warning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unknown")

    private ServerState unknown;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical")

    private ServerState critical;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health")

    private ServerState health;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unhealth")

    private ServerState unhealth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isolation")

    private ServerState isolation;

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

    public ServerStatus withOk(ServerState ok) {
        this.ok = ok;
        return this;
    }

    public ServerStatus withOk(Consumer<ServerState> okSetter) {
        if (this.ok == null) {
            this.ok = new ServerState();
            okSetter.accept(this.ok);
        }

        return this;
    }

    /**
     * Get ok
     * @return ok
     */
    public ServerState getOk() {
        return ok;
    }

    public void setOk(ServerState ok) {
        this.ok = ok;
    }

    public ServerStatus withWarning(ServerState warning) {
        this.warning = warning;
        return this;
    }

    public ServerStatus withWarning(Consumer<ServerState> warningSetter) {
        if (this.warning == null) {
            this.warning = new ServerState();
            warningSetter.accept(this.warning);
        }

        return this;
    }

    /**
     * Get warning
     * @return warning
     */
    public ServerState getWarning() {
        return warning;
    }

    public void setWarning(ServerState warning) {
        this.warning = warning;
    }

    public ServerStatus withUnknown(ServerState unknown) {
        this.unknown = unknown;
        return this;
    }

    public ServerStatus withUnknown(Consumer<ServerState> unknownSetter) {
        if (this.unknown == null) {
            this.unknown = new ServerState();
            unknownSetter.accept(this.unknown);
        }

        return this;
    }

    /**
     * Get unknown
     * @return unknown
     */
    public ServerState getUnknown() {
        return unknown;
    }

    public void setUnknown(ServerState unknown) {
        this.unknown = unknown;
    }

    public ServerStatus withCritical(ServerState critical) {
        this.critical = critical;
        return this;
    }

    public ServerStatus withCritical(Consumer<ServerState> criticalSetter) {
        if (this.critical == null) {
            this.critical = new ServerState();
            criticalSetter.accept(this.critical);
        }

        return this;
    }

    /**
     * Get critical
     * @return critical
     */
    public ServerState getCritical() {
        return critical;
    }

    public void setCritical(ServerState critical) {
        this.critical = critical;
    }

    public ServerStatus withHealth(ServerState health) {
        this.health = health;
        return this;
    }

    public ServerStatus withHealth(Consumer<ServerState> healthSetter) {
        if (this.health == null) {
            this.health = new ServerState();
            healthSetter.accept(this.health);
        }

        return this;
    }

    /**
     * Get health
     * @return health
     */
    public ServerState getHealth() {
        return health;
    }

    public void setHealth(ServerState health) {
        this.health = health;
    }

    public ServerStatus withUnhealth(ServerState unhealth) {
        this.unhealth = unhealth;
        return this;
    }

    public ServerStatus withUnhealth(Consumer<ServerState> unhealthSetter) {
        if (this.unhealth == null) {
            this.unhealth = new ServerState();
            unhealthSetter.accept(this.unhealth);
        }

        return this;
    }

    /**
     * Get unhealth
     * @return unhealth
     */
    public ServerState getUnhealth() {
        return unhealth;
    }

    public void setUnhealth(ServerState unhealth) {
        this.unhealth = unhealth;
    }

    public ServerStatus withIsolation(ServerState isolation) {
        this.isolation = isolation;
        return this;
    }

    public ServerStatus withIsolation(Consumer<ServerState> isolationSetter) {
        if (this.isolation == null) {
            this.isolation = new ServerState();
            isolationSetter.accept(this.isolation);
        }

        return this;
    }

    /**
     * Get isolation
     * @return isolation
     */
    public ServerState getIsolation() {
        return isolation;
    }

    public void setIsolation(ServerState isolation) {
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
            && Objects.equals(this.warning, that.warning) && Objects.equals(this.unknown, that.unknown)
            && Objects.equals(this.critical, that.critical) && Objects.equals(this.health, that.health)
            && Objects.equals(this.unhealth, that.unhealth) && Objects.equals(this.isolation, that.isolation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, ok, warning, unknown, critical, health, unhealth, isolation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerStatus {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
        sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
        sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
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
