package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 超节点缩容请求
 */
public class ServerScaleDownRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_flavor")

    private String resourceFlavor;

    public ServerScaleDownRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 超节点ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServerScaleDownRequest withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 规格信息
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ServerScaleDownRequest withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public ServerScaleDownRequest addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public ServerScaleDownRequest withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * 缩容节点id
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    public ServerScaleDownRequest withResourceFlavor(String resourceFlavor) {
        this.resourceFlavor = resourceFlavor;
        return this;
    }

    /**
     * 资源规格信息
     * @return resourceFlavor
     */
    public String getResourceFlavor() {
        return resourceFlavor;
    }

    public void setResourceFlavor(String resourceFlavor) {
        this.resourceFlavor = resourceFlavor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerScaleDownRequest that = (ServerScaleDownRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.serverIds, that.serverIds)
            && Objects.equals(this.resourceFlavor, that.resourceFlavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flavor, serverIds, resourceFlavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerScaleDownRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
        sb.append("    resourceFlavor: ").append(toIndentedString(resourceFlavor)).append("\n");
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
