package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 逻辑卷状态总览
 */
public class VolumeStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health")

    private Health health;

    public VolumeStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**： 逻辑卷状态 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public VolumeStatus withHealth(Health health) {
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
        VolumeStatus that = (VolumeStatus) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.health, that.health);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, health);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeStatus {\n");
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
