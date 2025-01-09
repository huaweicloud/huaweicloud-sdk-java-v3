package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量重建服务器的请求体。
 */
public class BatchReinstallServerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_access_agent")

    private Boolean updateAccessAgent;

    public BatchReinstallServerReq withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public BatchReinstallServerReq addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public BatchReinstallServerReq withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * 应用服务器id集合。
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    public BatchReinstallServerReq withUpdateAccessAgent(Boolean updateAccessAgent) {
        this.updateAccessAgent = updateAccessAgent;
        return this;
    }

    /**
     * 是否自动升级hda版本。
     * @return updateAccessAgent
     */
    public Boolean getUpdateAccessAgent() {
        return updateAccessAgent;
    }

    public void setUpdateAccessAgent(Boolean updateAccessAgent) {
        this.updateAccessAgent = updateAccessAgent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchReinstallServerReq that = (BatchReinstallServerReq) obj;
        return Objects.equals(this.serverIds, that.serverIds)
            && Objects.equals(this.updateAccessAgent, that.updateAccessAgent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverIds, updateAccessAgent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchReinstallServerReq {\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
        sb.append("    updateAccessAgent: ").append(toIndentedString(updateAccessAgent)).append("\n");
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
