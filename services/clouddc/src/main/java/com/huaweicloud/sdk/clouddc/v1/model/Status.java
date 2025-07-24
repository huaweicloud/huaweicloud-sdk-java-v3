package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 硬件状态总览
 */
public class Status {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private State state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health")

    private Health health;

    public Status withState(State state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Status withHealth(Health health) {
        this.health = health;
        return this;
    }

    /**
     * Get health
     * @return health
     */
    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Status that = (Status) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.health, that.health);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, health);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Status {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    health: ").append(toIndentedString(health)).append("\n");
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
