package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 服务运行配置。 **约束限制：** 不涉及。
 */
public class RuntimeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_invoke")

    private ServiceInvoke serviceInvoke;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_limit")

    private ServiceLimit serviceLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_secret")

    private ServiceSecret serviceSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_task_limit")

    private ServerTaskLimit serverTaskLimit;

    public RuntimeConfig withServiceInvoke(ServiceInvoke serviceInvoke) {
        this.serviceInvoke = serviceInvoke;
        return this;
    }

    public RuntimeConfig withServiceInvoke(Consumer<ServiceInvoke> serviceInvokeSetter) {
        if (this.serviceInvoke == null) {
            this.serviceInvoke = new ServiceInvoke();
            serviceInvokeSetter.accept(this.serviceInvoke);
        }

        return this;
    }

    /**
     * Get serviceInvoke
     * @return serviceInvoke
     */
    public ServiceInvoke getServiceInvoke() {
        return serviceInvoke;
    }

    public void setServiceInvoke(ServiceInvoke serviceInvoke) {
        this.serviceInvoke = serviceInvoke;
    }

    public RuntimeConfig withServiceLimit(ServiceLimit serviceLimit) {
        this.serviceLimit = serviceLimit;
        return this;
    }

    public RuntimeConfig withServiceLimit(Consumer<ServiceLimit> serviceLimitSetter) {
        if (this.serviceLimit == null) {
            this.serviceLimit = new ServiceLimit();
            serviceLimitSetter.accept(this.serviceLimit);
        }

        return this;
    }

    /**
     * Get serviceLimit
     * @return serviceLimit
     */
    public ServiceLimit getServiceLimit() {
        return serviceLimit;
    }

    public void setServiceLimit(ServiceLimit serviceLimit) {
        this.serviceLimit = serviceLimit;
    }

    public RuntimeConfig withServiceSecret(ServiceSecret serviceSecret) {
        this.serviceSecret = serviceSecret;
        return this;
    }

    public RuntimeConfig withServiceSecret(Consumer<ServiceSecret> serviceSecretSetter) {
        if (this.serviceSecret == null) {
            this.serviceSecret = new ServiceSecret();
            serviceSecretSetter.accept(this.serviceSecret);
        }

        return this;
    }

    /**
     * Get serviceSecret
     * @return serviceSecret
     */
    public ServiceSecret getServiceSecret() {
        return serviceSecret;
    }

    public void setServiceSecret(ServiceSecret serviceSecret) {
        this.serviceSecret = serviceSecret;
    }

    public RuntimeConfig withServerTaskLimit(ServerTaskLimit serverTaskLimit) {
        this.serverTaskLimit = serverTaskLimit;
        return this;
    }

    public RuntimeConfig withServerTaskLimit(Consumer<ServerTaskLimit> serverTaskLimitSetter) {
        if (this.serverTaskLimit == null) {
            this.serverTaskLimit = new ServerTaskLimit();
            serverTaskLimitSetter.accept(this.serverTaskLimit);
        }

        return this;
    }

    /**
     * Get serverTaskLimit
     * @return serverTaskLimit
     */
    public ServerTaskLimit getServerTaskLimit() {
        return serverTaskLimit;
    }

    public void setServerTaskLimit(ServerTaskLimit serverTaskLimit) {
        this.serverTaskLimit = serverTaskLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuntimeConfig that = (RuntimeConfig) obj;
        return Objects.equals(this.serviceInvoke, that.serviceInvoke)
            && Objects.equals(this.serviceLimit, that.serviceLimit)
            && Objects.equals(this.serviceSecret, that.serviceSecret)
            && Objects.equals(this.serverTaskLimit, that.serverTaskLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceInvoke, serviceLimit, serviceSecret, serverTaskLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeConfig {\n");
        sb.append("    serviceInvoke: ").append(toIndentedString(serviceInvoke)).append("\n");
        sb.append("    serviceLimit: ").append(toIndentedString(serviceLimit)).append("\n");
        sb.append("    serviceSecret: ").append(toIndentedString(serviceSecret)).append("\n");
        sb.append("    serverTaskLimit: ").append(toIndentedString(serverTaskLimit)).append("\n");
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
