package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新网络实例的请求体。
 */
public class UpdateNetworkInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_instance")

    private UpdateNetworkInstance networkInstance;

    public UpdateNetworkInstanceRequestBody withNetworkInstance(UpdateNetworkInstance networkInstance) {
        this.networkInstance = networkInstance;
        return this;
    }

    public UpdateNetworkInstanceRequestBody withNetworkInstance(Consumer<UpdateNetworkInstance> networkInstanceSetter) {
        if (this.networkInstance == null) {
            this.networkInstance = new UpdateNetworkInstance();
            networkInstanceSetter.accept(this.networkInstance);
        }

        return this;
    }

    /**
     * Get networkInstance
     * @return networkInstance
     */
    public UpdateNetworkInstance getNetworkInstance() {
        return networkInstance;
    }

    public void setNetworkInstance(UpdateNetworkInstance networkInstance) {
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
        UpdateNetworkInstanceRequestBody that = (UpdateNetworkInstanceRequestBody) obj;
        return Objects.equals(this.networkInstance, that.networkInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNetworkInstanceRequestBody {\n");
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
