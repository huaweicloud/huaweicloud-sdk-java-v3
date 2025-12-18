package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 终端节点服务添加后端服务资源请求结构体。
 */
public class AddEndpointServiceServerResourceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_resources")

    private List<ServerResource> serverResources = null;

    public AddEndpointServiceServerResourceRequestBody withServerResources(List<ServerResource> serverResources) {
        this.serverResources = serverResources;
        return this;
    }

    public AddEndpointServiceServerResourceRequestBody addServerResourcesItem(ServerResource serverResourcesItem) {
        if (this.serverResources == null) {
            this.serverResources = new ArrayList<>();
        }
        this.serverResources.add(serverResourcesItem);
        return this;
    }

    public AddEndpointServiceServerResourceRequestBody withServerResources(
        Consumer<List<ServerResource>> serverResourcesSetter) {
        if (this.serverResources == null) {
            this.serverResources = new ArrayList<>();
        }
        serverResourcesSetter.accept(this.serverResources);
        return this;
    }

    /**
     * 后端elb实例ID和elb所在的az信息列表。
     * @return serverResources
     */
    public List<ServerResource> getServerResources() {
        return serverResources;
    }

    public void setServerResources(List<ServerResource> serverResources) {
        this.serverResources = serverResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddEndpointServiceServerResourceRequestBody that = (AddEndpointServiceServerResourceRequestBody) obj;
        return Objects.equals(this.serverResources, that.serverResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddEndpointServiceServerResourceRequestBody {\n");
        sb.append("    serverResources: ").append(toIndentedString(serverResources)).append("\n");
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
