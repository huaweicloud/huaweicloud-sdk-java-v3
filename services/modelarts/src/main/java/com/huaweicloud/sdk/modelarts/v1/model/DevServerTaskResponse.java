package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DevServerTask详情
 */
public class DevServerTaskResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_server")

    private Map<String, String> cloudServer = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    public DevServerTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：task的ID。 **取值范围**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DevServerTaskResponse withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * **参数解释**：devserver机器ID。 **取值范围**：不涉及。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public DevServerTaskResponse withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * **参数解释**：devserver机器名称。 **取值范围**：不涉及。
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public DevServerTaskResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：task状态。 **取值范围**：- PROCESSING  -SUCCESS  - FAILED  - SKIPPED
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DevServerTaskResponse withCloudServer(Map<String, String> cloudServer) {
        this.cloudServer = cloudServer;
        return this;
    }

    public DevServerTaskResponse putCloudServerItem(String key, String cloudServerItem) {
        if (this.cloudServer == null) {
            this.cloudServer = new HashMap<>();
        }
        this.cloudServer.put(key, cloudServerItem);
        return this;
    }

    public DevServerTaskResponse withCloudServer(Consumer<Map<String, String>> cloudServerSetter) {
        if (this.cloudServer == null) {
            this.cloudServer = new HashMap<>();
        }
        cloudServerSetter.accept(this.cloudServer);
        return this;
    }

    /**
     * **参数解释**：底层ECS/BMS/HPS ID。
     * @return cloudServer
     */
    public Map<String, String> getCloudServer() {
        return cloudServer;
    }

    public void setCloudServer(Map<String, String> cloudServer) {
        this.cloudServer = cloudServer;
    }

    public DevServerTaskResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**：输出信息。 **取值范围**：不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DevServerTaskResponse withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释**：创建时间。 **取值范围**：不涉及。
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public DevServerTaskResponse withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释**：更新时间。 **取值范围**：不涉及。
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DevServerTaskResponse that = (DevServerTaskResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.serverName, that.serverName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.cloudServer, that.cloudServer) && Objects.equals(this.message, that.message)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serverId, serverName, status, cloudServer, message, createAt, updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevServerTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cloudServer: ").append(toIndentedString(cloudServer)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
