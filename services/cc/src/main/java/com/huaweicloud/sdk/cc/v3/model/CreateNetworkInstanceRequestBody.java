package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建网络实例的请求体。
 */
public class CreateNetworkInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_instance")

    private CreateNetworkInstance networkInstance;

    public CreateNetworkInstanceRequestBody withNetworkInstance(CreateNetworkInstance networkInstance) {
        this.networkInstance = networkInstance;
        return this;
    }

    public CreateNetworkInstanceRequestBody withNetworkInstance(Consumer<CreateNetworkInstance> networkInstanceSetter) {
        if (this.networkInstance == null) {
            this.networkInstance = new CreateNetworkInstance();
            networkInstanceSetter.accept(this.networkInstance);
        }

        return this;
    }

    /**
     * Get networkInstance
     * @return networkInstance
     */
    public CreateNetworkInstance getNetworkInstance() {
        return networkInstance;
    }

    public void setNetworkInstance(CreateNetworkInstance networkInstance) {
        this.networkInstance = networkInstance;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNetworkInstanceRequestBody that = (CreateNetworkInstanceRequestBody) obj;
        return Objects.equals(this.networkInstance, that.networkInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNetworkInstanceRequestBody {\n");
        sb.append("    networkInstance: ").append(toIndentedString(networkInstance)).append("\n");
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
