package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MicroServiceInfoCSECreate
 */
public class MicroServiceInfoCSECreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_id")

    private String engineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public MicroServiceInfoCSECreate withEngineId(String engineId) {
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

    public MicroServiceInfoCSECreate withServiceId(String serviceId) {
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

    public MicroServiceInfoCSECreate withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 微服务版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MicroServiceInfoCSECreate microServiceInfoCSECreate = (MicroServiceInfoCSECreate) o;
        return Objects.equals(this.engineId, microServiceInfoCSECreate.engineId)
            && Objects.equals(this.serviceId, microServiceInfoCSECreate.serviceId)
            && Objects.equals(this.version, microServiceInfoCSECreate.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineId, serviceId, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicroServiceInfoCSECreate {\n");
        sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
