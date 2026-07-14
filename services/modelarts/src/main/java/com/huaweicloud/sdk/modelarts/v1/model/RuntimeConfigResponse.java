package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 服务运行配置。
 */
public class RuntimeConfigResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_invoke")

    private ServiceInvokeResponse serviceInvoke;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_limit")

    private ServiceLimitResponse serviceLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_secret")

    private ServiceSecretResponse serviceSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_task_limit")

    private ServerTaskLimit serverTaskLimit;

    public RuntimeConfigResponse withServiceInvoke(ServiceInvokeResponse serviceInvoke) {
        this.serviceInvoke = serviceInvoke;
        return this;
    }

    public RuntimeConfigResponse withServiceInvoke(Consumer<ServiceInvokeResponse> serviceInvokeSetter) {
        if (this.serviceInvoke == null) {
            this.serviceInvoke = new ServiceInvokeResponse();
            serviceInvokeSetter.accept(this.serviceInvoke);
        }

        return this;
    }

    /**
     * Get serviceInvoke
     * @return serviceInvoke
     */
    public ServiceInvokeResponse getServiceInvoke() {
        return serviceInvoke;
    }

    public void setServiceInvoke(ServiceInvokeResponse serviceInvoke) {
        this.serviceInvoke = serviceInvoke;
    }

    public RuntimeConfigResponse withServiceLimit(ServiceLimitResponse serviceLimit) {
        this.serviceLimit = serviceLimit;
        return this;
    }

    public RuntimeConfigResponse withServiceLimit(Consumer<ServiceLimitResponse> serviceLimitSetter) {
        if (this.serviceLimit == null) {
            this.serviceLimit = new ServiceLimitResponse();
            serviceLimitSetter.accept(this.serviceLimit);
        }

        return this;
    }

    /**
     * Get serviceLimit
     * @return serviceLimit
     */
    public ServiceLimitResponse getServiceLimit() {
        return serviceLimit;
    }

    public void setServiceLimit(ServiceLimitResponse serviceLimit) {
        this.serviceLimit = serviceLimit;
    }

    public RuntimeConfigResponse withServiceSecret(ServiceSecretResponse serviceSecret) {
        this.serviceSecret = serviceSecret;
        return this;
    }

    public RuntimeConfigResponse withServiceSecret(Consumer<ServiceSecretResponse> serviceSecretSetter) {
        if (this.serviceSecret == null) {
            this.serviceSecret = new ServiceSecretResponse();
            serviceSecretSetter.accept(this.serviceSecret);
        }

        return this;
    }

    /**
     * Get serviceSecret
     * @return serviceSecret
     */
    public ServiceSecretResponse getServiceSecret() {
        return serviceSecret;
    }

    public void setServiceSecret(ServiceSecretResponse serviceSecret) {
        this.serviceSecret = serviceSecret;
    }

    public RuntimeConfigResponse withServerTaskLimit(ServerTaskLimit serverTaskLimit) {
        this.serverTaskLimit = serverTaskLimit;
        return this;
    }

    public RuntimeConfigResponse withServerTaskLimit(Consumer<ServerTaskLimit> serverTaskLimitSetter) {
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
        RuntimeConfigResponse that = (RuntimeConfigResponse) obj;
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
        sb.append("class RuntimeConfigResponse {\n");
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
