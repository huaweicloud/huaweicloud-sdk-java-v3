package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCloudServersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    private List<CloudServer> servers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers_links")

    private List<PageLink> serversLinks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListCloudServersResponse withServers(List<CloudServer> servers) {
        this.servers = servers;
        return this;
    }

    public ListCloudServersResponse addServersItem(CloudServer serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public ListCloudServersResponse withServers(Consumer<List<CloudServer>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 查询云服务器信息列表。
     * @return servers
     */
    public List<CloudServer> getServers() {
        return servers;
    }

    public void setServers(List<CloudServer> servers) {
        this.servers = servers;
    }

    public ListCloudServersResponse withServersLinks(List<PageLink> serversLinks) {
        this.serversLinks = serversLinks;
        return this;
    }

    public ListCloudServersResponse addServersLinksItem(PageLink serversLinksItem) {
        if (this.serversLinks == null) {
            this.serversLinks = new ArrayList<>();
        }
        this.serversLinks.add(serversLinksItem);
        return this;
    }

    public ListCloudServersResponse withServersLinks(Consumer<List<PageLink>> serversLinksSetter) {
        if (this.serversLinks == null) {
            this.serversLinks = new ArrayList<>();
        }
        serversLinksSetter.accept(this.serversLinks);
        return this;
    }

    /**
     * 分页查询时，查询下一页数据链接。
     * @return serversLinks
     */
    public List<PageLink> getServersLinks() {
        return serversLinks;
    }

    public void setServersLinks(List<PageLink> serversLinks) {
        this.serversLinks = serversLinks;
    }

    public ListCloudServersResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get requestId
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloudServersResponse that = (ListCloudServersResponse) obj;
        return Objects.equals(this.servers, that.servers) && Objects.equals(this.serversLinks, that.serversLinks)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servers, serversLinks, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudServersResponse {\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
        sb.append("    serversLinks: ").append(toIndentedString(serversLinks)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
