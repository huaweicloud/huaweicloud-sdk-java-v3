package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.ServerId;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * This is a auto create Body Object
 */
public class DeleteServersRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_publicip")
    
    private Boolean deletePublicip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_volume")
    
    private Boolean deleteVolume;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="servers")
    
    private List<ServerId> servers = new ArrayList<>();
    
    public DeleteServersRequestBody withDeletePublicip(Boolean deletePublicip) {
        this.deletePublicip = deletePublicip;
        return this;
    }

    


    /**
     * 配置删除云服务器是否删除云服务器绑定的弹性IP。如果选择不删除，则系统仅做解绑定操作，保留弹性IP资源。 取值为true或false，默认为false。   - true：删除云服务器时会同时删除绑定在云服务器上的弹性IP。  - false：删除云服务器时，仅解绑定在云服务器上的弹性IP，不删除弹性IP
     * @return deletePublicip
     */
    public Boolean getDeletePublicip() {
        return deletePublicip;
    }

    public void setDeletePublicip(Boolean deletePublicip) {
        this.deletePublicip = deletePublicip;
    }

    public DeleteServersRequestBody withDeleteVolume(Boolean deleteVolume) {
        this.deleteVolume = deleteVolume;
        return this;
    }

    


    /**
     * 配置删除云服务器是否删除云服务器对应的数据盘，如果选择不删除，则系统仅做解绑定操作，保留云磁盘资源。 取值为false或true，默认为false。  - true：删除云服务器时会同时删除挂载在云服务器上的数据盘。 - false：删除云服务器时，仅卸载云服务器上挂载的数据盘，不删除该数据盘。
     * @return deleteVolume
     */
    public Boolean getDeleteVolume() {
        return deleteVolume;
    }

    public void setDeleteVolume(Boolean deleteVolume) {
        this.deleteVolume = deleteVolume;
    }

    public DeleteServersRequestBody withServers(List<ServerId> servers) {
        this.servers = servers;
        return this;
    }

    
    public DeleteServersRequestBody addServersItem(ServerId serversItem) {
        this.servers.add(serversItem);
        return this;
    }

    public DeleteServersRequestBody withServers(Consumer<List<ServerId>> serversSetter) {
        if(this.servers == null ){
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 所需要删除的云服务器列表。
     * @return servers
     */
    public List<ServerId> getServers() {
        return servers;
    }

    public void setServers(List<ServerId> servers) {
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
        DeleteServersRequestBody deleteServersRequestBody = (DeleteServersRequestBody) o;
        return Objects.equals(this.deletePublicip, deleteServersRequestBody.deletePublicip) &&
            Objects.equals(this.deleteVolume, deleteServersRequestBody.deleteVolume) &&
            Objects.equals(this.servers, deleteServersRequestBody.servers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deletePublicip, deleteVolume, servers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteServersRequestBody {\n");
            sb.append("    deletePublicip: ").append(toIndentedString(deletePublicip)).append("\n");
            sb.append("    deleteVolume: ").append(toIndentedString(deleteVolume)).append("\n");
            sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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

