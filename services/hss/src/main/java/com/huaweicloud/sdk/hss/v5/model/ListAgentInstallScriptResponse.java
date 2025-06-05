package com.huaweicloud.sdk.hss.v5.model;

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
public class ListAgentInstallScriptResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_script_list")

    private List<AgentInstallScriptResponseInfo> installScriptList = null;

    public ListAgentInstallScriptResponse withInstallScriptList(
        List<AgentInstallScriptResponseInfo> installScriptList) {
        this.installScriptList = installScriptList;
        return this;
    }

    public ListAgentInstallScriptResponse addInstallScriptListItem(
        AgentInstallScriptResponseInfo installScriptListItem) {
        if (this.installScriptList == null) {
            this.installScriptList = new ArrayList<>();
        }
        this.installScriptList.add(installScriptListItem);
        return this;
    }

    public ListAgentInstallScriptResponse withInstallScriptList(
        Consumer<List<AgentInstallScriptResponseInfo>> installScriptListSetter) {
        if (this.installScriptList == null) {
            this.installScriptList = new ArrayList<>();
        }
        installScriptListSetter.accept(this.installScriptList);
        return this;
    }

    /**
     * 安装脚本列表
     * @return installScriptList
     */
    public List<AgentInstallScriptResponseInfo> getInstallScriptList() {
        return installScriptList;
    }

    public void setInstallScriptList(List<AgentInstallScriptResponseInfo> installScriptList) {
        this.installScriptList = installScriptList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAgentInstallScriptResponse that = (ListAgentInstallScriptResponse) obj;
        return Objects.equals(this.installScriptList, that.installScriptList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(installScriptList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgentInstallScriptResponse {\n");
        sb.append("    installScriptList: ").append(toIndentedString(installScriptList)).append("\n");
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
