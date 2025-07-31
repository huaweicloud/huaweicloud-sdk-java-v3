package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 下发任务的列表，三种参数选择其中一种即可，有多个参数则优先级顺序为all_hosts，server_group，host_ids
 */
public class CreateGlobalAssetScanTaskRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ids")

    private List<String> hostIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group")

    private List<String> serverGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_hosts")

    private Boolean allHosts;

    public CreateGlobalAssetScanTaskRequestInfo withHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }

    public CreateGlobalAssetScanTaskRequestInfo addHostIdsItem(String hostIdsItem) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        this.hostIds.add(hostIdsItem);
        return this;
    }

    public CreateGlobalAssetScanTaskRequestInfo withHostIds(Consumer<List<String>> hostIdsSetter) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        hostIdsSetter.accept(this.hostIds);
        return this;
    }

    /**
     * 下发任务的主机列表
     * @return hostIds
     */
    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    public CreateGlobalAssetScanTaskRequestInfo withServerGroup(List<String> serverGroup) {
        this.serverGroup = serverGroup;
        return this;
    }

    public CreateGlobalAssetScanTaskRequestInfo addServerGroupItem(String serverGroupItem) {
        if (this.serverGroup == null) {
            this.serverGroup = new ArrayList<>();
        }
        this.serverGroup.add(serverGroupItem);
        return this;
    }

    public CreateGlobalAssetScanTaskRequestInfo withServerGroup(Consumer<List<String>> serverGroupSetter) {
        if (this.serverGroup == null) {
            this.serverGroup = new ArrayList<>();
        }
        serverGroupSetter.accept(this.serverGroup);
        return this;
    }

    /**
     * 下发任务的主机组列表
     * @return serverGroup
     */
    public List<String> getServerGroup() {
        return serverGroup;
    }

    public void setServerGroup(List<String> serverGroup) {
        this.serverGroup = serverGroup;
    }

    public CreateGlobalAssetScanTaskRequestInfo withAllHosts(Boolean allHosts) {
        this.allHosts = allHosts;
        return this;
    }

    /**
     * 下发全部主机的扫描
     * @return allHosts
     */
    public Boolean getAllHosts() {
        return allHosts;
    }

    public void setAllHosts(Boolean allHosts) {
        this.allHosts = allHosts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateGlobalAssetScanTaskRequestInfo that = (CreateGlobalAssetScanTaskRequestInfo) obj;
        return Objects.equals(this.hostIds, that.hostIds) && Objects.equals(this.serverGroup, that.serverGroup)
            && Objects.equals(this.allHosts, that.allHosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostIds, serverGroup, allHosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGlobalAssetScanTaskRequestInfo {\n");
        sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
        sb.append("    serverGroup: ").append(toIndentedString(serverGroup)).append("\n");
        sb.append("    allHosts: ").append(toIndentedString(allHosts)).append("\n");
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
