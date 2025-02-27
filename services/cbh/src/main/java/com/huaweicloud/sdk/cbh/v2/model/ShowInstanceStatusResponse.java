package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    public ShowInstanceStatusResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云堡垒机实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowInstanceStatusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 堡垒机实例状态。 - POWERING_ON：正在开启 - POWERING_OFF：正在关闭 - DELETE_WAITE：等待删除 - REBOOTING：重启中 - RESIZE：变更中 - UPGRADING：升级中 - FROZEN：冻结 - ACTIVE：运行
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowInstanceStatusResponse withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云堡垒机实例ID，使用UUID格式表示。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceStatusResponse that = (ShowInstanceStatusResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.serverId, that.serverId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, serverId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceStatusResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
