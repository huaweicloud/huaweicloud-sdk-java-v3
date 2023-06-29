package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SwitchToMasterDisasterRecoveryBody
 */
public class SwitchToMasterDisasterRecoveryBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force")

    private Boolean force;

    public SwitchToMasterDisasterRecoveryBody withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * 是否强制备实例升主。 若为True，则强制备实例升主，用于在主实例异常的状态下，快速恢复服务的场景：允许备实例强制升为特殊主实例，独立提供读写服务。 默认为False，用于正常状态下备实例平缓升主。
     * @return force
     */
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchToMasterDisasterRecoveryBody that = (SwitchToMasterDisasterRecoveryBody) obj;
        return Objects.equals(this.force, that.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash(force);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchToMasterDisasterRecoveryBody {\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
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
