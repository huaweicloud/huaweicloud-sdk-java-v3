package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CSE微服务详细信息
 */
public class MicroServiceInfoCSE {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_id")

    private String engineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_address")

    private String registerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cse_app_id")

    private String cseAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public MicroServiceInfoCSE withEngineId(String engineId) {
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

    public MicroServiceInfoCSE withServiceId(String serviceId) {
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

    public MicroServiceInfoCSE withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 微服务引擎名称
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public MicroServiceInfoCSE withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 微服务名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public MicroServiceInfoCSE withRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
        return this;
    }

    /**
     * 注册中心地址
     * @return registerAddress
     */
    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public MicroServiceInfoCSE withCseAppId(String cseAppId) {
        this.cseAppId = cseAppId;
        return this;
    }

    /**
     * 微服务所属的应用
     * @return cseAppId
     */
    public String getCseAppId() {
        return cseAppId;
    }

    public void setCseAppId(String cseAppId) {
        this.cseAppId = cseAppId;
    }

    public MicroServiceInfoCSE withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 微服务的版本，已废弃，通过后端服务器组中的版本承载。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MicroServiceInfoCSE that = (MicroServiceInfoCSE) obj;
        return Objects.equals(this.engineId, that.engineId) && Objects.equals(this.serviceId, that.serviceId)
            && Objects.equals(this.engineName, that.engineName) && Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.registerAddress, that.registerAddress)
            && Objects.equals(this.cseAppId, that.cseAppId) && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineId, serviceId, engineName, serviceName, registerAddress, cseAppId, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicroServiceInfoCSE {\n");
        sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    registerAddress: ").append(toIndentedString(registerAddress)).append("\n");
        sb.append("    cseAppId: ").append(toIndentedString(cseAppId)).append("\n");
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
