package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CSE微服务详细信息，service_type为CSE时必填
 */
public class MicroServiceInfoCSEBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_id")

    private String engineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    public MicroServiceInfoCSEBase withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }

    /**
     * 微服务引擎编号
     * @return engineId
     */
    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public MicroServiceInfoCSEBase withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 微服务编号
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MicroServiceInfoCSEBase microServiceInfoCSEBase = (MicroServiceInfoCSEBase) o;
        return Objects.equals(this.engineId, microServiceInfoCSEBase.engineId)
            && Objects.equals(this.serviceId, microServiceInfoCSEBase.serviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineId, serviceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicroServiceInfoCSEBase {\n");
        sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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
