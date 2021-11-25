package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 修改路由body */
public class RouteBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cname")

    private String cname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    private List<RouteServerBody> servers = null;

    public RouteBody withCname(String cname) {
        this.cname = cname;
        return this;
    }

    /** cname后缀
     * 
     * @return cname */
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public RouteBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RouteBody withServers(List<RouteServerBody> servers) {
        this.servers = servers;
        return this;
    }

    public RouteBody addServersItem(RouteServerBody serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public RouteBody withServers(Consumer<List<RouteServerBody>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /** 路由信息
     * 
     * @return servers */
    public List<RouteServerBody> getServers() {
        return servers;
    }

    public void setServers(List<RouteServerBody> servers) {
        this.servers = servers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RouteBody routeBody = (RouteBody) o;
        return Objects.equals(this.cname, routeBody.cname) && Objects.equals(this.name, routeBody.name)
            && Objects.equals(this.servers, routeBody.servers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cname, name, servers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RouteBody {\n");
        sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
