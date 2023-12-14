package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class DeleteBaremetalBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    private List<ServersList> servers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_publicip")

    private Boolean deletePublicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_volume")

    private Boolean deleteVolume;

    public DeleteBaremetalBody withServers(List<ServersList> servers) {
        this.servers = servers;
        return this;
    }

    public DeleteBaremetalBody addServersItem(ServersList serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public DeleteBaremetalBody withServers(Consumer<List<ServersList>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 所需要删除的裸金属服务器列表。
     * @return servers
     */
    public List<ServersList> getServers() {
        return servers;
    }

    public void setServers(List<ServersList> servers) {
        this.servers = servers;
    }

    public DeleteBaremetalBody withDeletePublicip(Boolean deletePublicip) {
        this.deletePublicip = deletePublicip;
        return this;
    }

    /**
     * 删除裸金属服务器时是否删除裸金属服务器绑定的弹性公网IP。如果选择不删除，则系统仅做解绑定操作，保留弹性公网IP资源。 取值为true或false，默认为false。  true：删除裸金属服务器时会同时删除绑定在裸金属服务器上的弹性公网IP。 false：删除裸金属服务器时，仅解绑定在裸金属服务器上的弹性公网IP，不删除弹性公网IP。
     * @return deletePublicip
     */
    public Boolean getDeletePublicip() {
        return deletePublicip;
    }

    public void setDeletePublicip(Boolean deletePublicip) {
        this.deletePublicip = deletePublicip;
    }

    public DeleteBaremetalBody withDeleteVolume(Boolean deleteVolume) {
        this.deleteVolume = deleteVolume;
        return this;
    }

    /**
     * 删除裸金属服务器时是否删除裸金属服务器对应的数据盘。如果选择不删除，则系统仅做解绑定操作，保留数据盘资源。 取值为false或true，默认为false。  true：删除裸金属服务器时会同时删除挂载在裸金属服务器上的数据盘。 false：删除裸金属服务器时，仅卸载裸金属服务器上挂载的数据盘，不删除该数据盘。
     * @return deleteVolume
     */
    public Boolean getDeleteVolume() {
        return deleteVolume;
    }

    public void setDeleteVolume(Boolean deleteVolume) {
        this.deleteVolume = deleteVolume;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteBaremetalBody that = (DeleteBaremetalBody) obj;
        return Objects.equals(this.servers, that.servers) && Objects.equals(this.deletePublicip, that.deletePublicip)
            && Objects.equals(this.deleteVolume, that.deleteVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servers, deletePublicip, deleteVolume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBaremetalBody {\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
        sb.append("    deletePublicip: ").append(toIndentedString(deletePublicip)).append("\n");
        sb.append("    deleteVolume: ").append(toIndentedString(deleteVolume)).append("\n");
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
