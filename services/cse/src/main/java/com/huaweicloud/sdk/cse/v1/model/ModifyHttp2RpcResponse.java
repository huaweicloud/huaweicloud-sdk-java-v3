package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ModifyHttp2RpcResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gatewayId")

    private String gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pluginConfig")

    private Object pluginConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routeName")

    private String routeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routeDestinationName")

    private String routeDestinationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dubbo")

    private Dubbo dubbo;

    public ModifyHttp2RpcResponse withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * 网关的ID。
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public ModifyHttp2RpcResponse withPluginConfig(Object pluginConfig) {
        this.pluginConfig = pluginConfig;
        return this;
    }

    /**
     * 传递给插件的配置。
     * @return pluginConfig
     */
    public Object getPluginConfig() {
        return pluginConfig;
    }

    public void setPluginConfig(Object pluginConfig) {
        this.pluginConfig = pluginConfig;
    }

    public ModifyHttp2RpcResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModifyHttp2RpcResponse withRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }

    /**
     * 路由的名称。
     * @return routeName
     */
    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public ModifyHttp2RpcResponse withRouteDestinationName(String routeDestinationName) {
        this.routeDestinationName = routeDestinationName;
        return this;
    }

    /**
     * 目标路由的名称。
     * @return routeDestinationName
     */
    public String getRouteDestinationName() {
        return routeDestinationName;
    }

    public void setRouteDestinationName(String routeDestinationName) {
        this.routeDestinationName = routeDestinationName;
    }

    public ModifyHttp2RpcResponse withDubbo(Dubbo dubbo) {
        this.dubbo = dubbo;
        return this;
    }

    public ModifyHttp2RpcResponse withDubbo(Consumer<Dubbo> dubboSetter) {
        if (this.dubbo == null) {
            this.dubbo = new Dubbo();
            dubboSetter.accept(this.dubbo);
        }

        return this;
    }

    /**
     * Get dubbo
     * @return dubbo
     */
    public Dubbo getDubbo() {
        return dubbo;
    }

    public void setDubbo(Dubbo dubbo) {
        this.dubbo = dubbo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyHttp2RpcResponse that = (ModifyHttp2RpcResponse) obj;
        return Objects.equals(this.gatewayId, that.gatewayId) && Objects.equals(this.pluginConfig, that.pluginConfig)
            && Objects.equals(this.name, that.name) && Objects.equals(this.routeName, that.routeName)
            && Objects.equals(this.routeDestinationName, that.routeDestinationName)
            && Objects.equals(this.dubbo, that.dubbo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gatewayId, pluginConfig, name, routeName, routeDestinationName, dubbo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyHttp2RpcResponse {\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    pluginConfig: ").append(toIndentedString(pluginConfig)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    routeName: ").append(toIndentedString(routeName)).append("\n");
        sb.append("    routeDestinationName: ").append(toIndentedString(routeDestinationName)).append("\n");
        sb.append("    dubbo: ").append(toIndentedString(dubbo)).append("\n");
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
