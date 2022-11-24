package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量停止边缘实例对象
 */
public class BatchStop {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    private List<BaseId> servers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public BatchStop withServers(List<BaseId> servers) {
        this.servers = servers;
        return this;
    }

    public BatchStop addServersItem(BaseId serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public BatchStop withServers(Consumer<List<BaseId>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 待停止的边缘实例列表。
     * @return servers
     */
    public List<BaseId> getServers() {
        return servers;
    }

    public void setServers(List<BaseId> servers) {
        this.servers = servers;
    }

    public BatchStop withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 关机类型，默认为SOFT。  取值范围： - SOFT：普通关机。 - HARD：强制关机。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchStop batchStop = (BatchStop) o;
        return Objects.equals(this.servers, batchStop.servers) && Objects.equals(this.type, batchStop.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servers, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStop {\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
