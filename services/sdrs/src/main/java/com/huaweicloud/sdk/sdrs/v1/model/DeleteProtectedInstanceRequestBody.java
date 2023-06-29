package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 删除保护实例请求体
 */
public class DeleteProtectedInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_target_server")

    private Boolean deleteTargetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_target_eip")

    private Boolean deleteTargetEip;

    public DeleteProtectedInstanceRequestBody withDeleteTargetServer(Boolean deleteTargetServer) {
        this.deleteTargetServer = deleteTargetServer;
        return this;
    }

    /**
     * 是否删除容灾站点服务器，默认值为false。
     * @return deleteTargetServer
     */
    public Boolean getDeleteTargetServer() {
        return deleteTargetServer;
    }

    public void setDeleteTargetServer(Boolean deleteTargetServer) {
        this.deleteTargetServer = deleteTargetServer;
    }

    public DeleteProtectedInstanceRequestBody withDeleteTargetEip(Boolean deleteTargetEip) {
        this.deleteTargetEip = deleteTargetEip;
        return this;
    }

    /**
     * 是否删除容灾站点弹性IP，默认值为false。
     * @return deleteTargetEip
     */
    public Boolean getDeleteTargetEip() {
        return deleteTargetEip;
    }

    public void setDeleteTargetEip(Boolean deleteTargetEip) {
        this.deleteTargetEip = deleteTargetEip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteProtectedInstanceRequestBody that = (DeleteProtectedInstanceRequestBody) obj;
        return Objects.equals(this.deleteTargetServer, that.deleteTargetServer)
            && Objects.equals(this.deleteTargetEip, that.deleteTargetEip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteTargetServer, deleteTargetEip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteProtectedInstanceRequestBody {\n");
        sb.append("    deleteTargetServer: ").append(toIndentedString(deleteTargetServer)).append("\n");
        sb.append("    deleteTargetEip: ").append(toIndentedString(deleteTargetEip)).append("\n");
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
