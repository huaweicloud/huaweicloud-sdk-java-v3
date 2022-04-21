package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 容灾演练虚拟机数据结构
 */
public class DrillServerParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_instance")

    private String protectedInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drill_server_id")

    private String drillServerId;

    public DrillServerParams withProtectedInstance(String protectedInstance) {
        this.protectedInstance = protectedInstance;
        return this;
    }

    /**
     * 演练云服务器对应的保护实例ID。
     * @return protectedInstance
     */
    public String getProtectedInstance() {
        return protectedInstance;
    }

    public void setProtectedInstance(String protectedInstance) {
        this.protectedInstance = protectedInstance;
    }

    public DrillServerParams withDrillServerId(String drillServerId) {
        this.drillServerId = drillServerId;
        return this;
    }

    /**
     * 演练云服务器ID。
     * @return drillServerId
     */
    public String getDrillServerId() {
        return drillServerId;
    }

    public void setDrillServerId(String drillServerId) {
        this.drillServerId = drillServerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DrillServerParams drillServerParams = (DrillServerParams) o;
        return Objects.equals(this.protectedInstance, drillServerParams.protectedInstance)
            && Objects.equals(this.drillServerId, drillServerParams.drillServerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectedInstance, drillServerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DrillServerParams {\n");
        sb.append("    protectedInstance: ").append(toIndentedString(protectedInstance)).append("\n");
        sb.append("    drillServerId: ").append(toIndentedString(drillServerId)).append("\n");
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
