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
public class NovaListServersDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    private List<NovaServer> servers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers_links")

    private List<PageLink> serversLinks = null;

    public NovaListServersDetailsResponse withServers(List<NovaServer> servers) {
        this.servers = servers;
        return this;
    }

    public NovaListServersDetailsResponse addServersItem(NovaServer serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public NovaListServersDetailsResponse withServers(Consumer<List<NovaServer>> serversSetter) {
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
    public List<NovaServer> getServers() {
        return servers;
    }

    public void setServers(List<NovaServer> servers) {
        this.servers = servers;
    }

    public NovaListServersDetailsResponse withServersLinks(List<PageLink> serversLinks) {
        this.serversLinks = serversLinks;
        return this;
    }

    public NovaListServersDetailsResponse addServersLinksItem(PageLink serversLinksItem) {
        if (this.serversLinks == null) {
            this.serversLinks = new ArrayList<>();
        }
        this.serversLinks.add(serversLinksItem);
        return this;
    }

    public NovaListServersDetailsResponse withServersLinks(Consumer<List<PageLink>> serversLinksSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NovaListServersDetailsResponse that = (NovaListServersDetailsResponse) obj;
        return Objects.equals(this.servers, that.servers) && Objects.equals(this.serversLinks, that.serversLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servers, serversLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaListServersDetailsResponse {\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
        sb.append("    serversLinks: ").append(toIndentedString(serversLinks)).append("\n");
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
