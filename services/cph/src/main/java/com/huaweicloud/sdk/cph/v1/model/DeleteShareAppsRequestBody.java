package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteShareAppsRequestBody
 */
public class DeleteShareAppsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    public DeleteShareAppsRequestBody withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 所需删除的共享应用的合法包名。最大长度128字节。只支持包含大小写字母、数字、下划线、点，其中不允许以数字和下划线开头，点不能作为结尾且包名中至少有一个点。
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public DeleteShareAppsRequestBody withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public DeleteShareAppsRequestBody addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public DeleteShareAppsRequestBody withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * 云手机服务器ID列表。
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteShareAppsRequestBody that = (DeleteShareAppsRequestBody) obj;
        return Objects.equals(this.packageName, that.packageName) && Objects.equals(this.serverIds, that.serverIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageName, serverIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteShareAppsRequestBody {\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
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
