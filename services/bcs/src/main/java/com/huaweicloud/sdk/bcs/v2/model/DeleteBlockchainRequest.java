package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteBlockchainRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockchain_id")

    private String blockchainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete_storage")

    private Boolean isDeleteStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete_obs")

    private Boolean isDeleteObs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete_resource")

    private Boolean isDeleteResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete_ief")

    private Boolean isDeleteIef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete_lightpeer")

    private String isDeleteLightpeer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief_nodes_id")

    private String iefNodesId;

    public DeleteBlockchainRequest withBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    /**
     * bcs 服务id
     * @return blockchainId
     */
    public String getBlockchainId() {
        return blockchainId;
    }

    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    public DeleteBlockchainRequest withIsDeleteStorage(Boolean isDeleteStorage) {
        this.isDeleteStorage = isDeleteStorage;
        return this;
    }

    /**
     * 是否删除存储，IEF模式下不用填写
     * @return isDeleteStorage
     */
    public Boolean getIsDeleteStorage() {
        return isDeleteStorage;
    }

    public void setIsDeleteStorage(Boolean isDeleteStorage) {
        this.isDeleteStorage = isDeleteStorage;
    }

    public DeleteBlockchainRequest withIsDeleteObs(Boolean isDeleteObs) {
        this.isDeleteObs = isDeleteObs;
        return this;
    }

    /**
     * 是否删除obs，IEF模式下不用填写
     * @return isDeleteObs
     */
    public Boolean getIsDeleteObs() {
        return isDeleteObs;
    }

    public void setIsDeleteObs(Boolean isDeleteObs) {
        this.isDeleteObs = isDeleteObs;
    }

    public DeleteBlockchainRequest withIsDeleteResource(Boolean isDeleteResource) {
        this.isDeleteResource = isDeleteResource;
        return this;
    }

    /**
     * 是否删除底层CCE资源，IEF模式下不用填写
     * @return isDeleteResource
     */
    public Boolean getIsDeleteResource() {
        return isDeleteResource;
    }

    public void setIsDeleteResource(Boolean isDeleteResource) {
        this.isDeleteResource = isDeleteResource;
    }

    public DeleteBlockchainRequest withIsDeleteIef(Boolean isDeleteIef) {
        this.isDeleteIef = isDeleteIef;
        return this;
    }

    /**
     * 是否删除底层依赖的IEF边缘节点资源，CCE模式下不用填写，IEF模式下必填
     * @return isDeleteIef
     */
    public Boolean getIsDeleteIef() {
        return isDeleteIef;
    }

    public void setIsDeleteIef(Boolean isDeleteIef) {
        this.isDeleteIef = isDeleteIef;
    }

    public DeleteBlockchainRequest withIsDeleteLightpeer(String isDeleteLightpeer) {
        this.isDeleteLightpeer = isDeleteLightpeer;
        return this;
    }

    /**
     * CCE模式下选填：是否删除LightPeer轻节点插件使用的IEF边缘节点资源，若需要删除，则填写对应的IEF编译节点名称，否则无需填写。例如：is_delete_lightpeer=ief_node_name_1,ief_node_name_2
     * @return isDeleteLightpeer
     */
    public String getIsDeleteLightpeer() {
        return isDeleteLightpeer;
    }

    public void setIsDeleteLightpeer(String isDeleteLightpeer) {
        this.isDeleteLightpeer = isDeleteLightpeer;
    }

    public DeleteBlockchainRequest withIefNodesId(String iefNodesId) {
        this.iefNodesId = iefNodesId;
        return this;
    }

    /**
     * IEF模式下选填：若需要删除IEF边缘集群所使用的IEF边缘节点资源，则填写IEF节点的id，否则无需填写。例如：ief_nodes_id=1356f6f0-c448-4ec2-926f-c13b026369d9，0cdacbf9-2002-41e9-8123-2fa13e8d1449
     * @return iefNodesId
     */
    public String getIefNodesId() {
        return iefNodesId;
    }

    public void setIefNodesId(String iefNodesId) {
        this.iefNodesId = iefNodesId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteBlockchainRequest deleteBlockchainRequest = (DeleteBlockchainRequest) o;
        return Objects.equals(this.blockchainId, deleteBlockchainRequest.blockchainId)
            && Objects.equals(this.isDeleteStorage, deleteBlockchainRequest.isDeleteStorage)
            && Objects.equals(this.isDeleteObs, deleteBlockchainRequest.isDeleteObs)
            && Objects.equals(this.isDeleteResource, deleteBlockchainRequest.isDeleteResource)
            && Objects.equals(this.isDeleteIef, deleteBlockchainRequest.isDeleteIef)
            && Objects.equals(this.isDeleteLightpeer, deleteBlockchainRequest.isDeleteLightpeer)
            && Objects.equals(this.iefNodesId, deleteBlockchainRequest.iefNodesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockchainId,
            isDeleteStorage,
            isDeleteObs,
            isDeleteResource,
            isDeleteIef,
            isDeleteLightpeer,
            iefNodesId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBlockchainRequest {\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
        sb.append("    isDeleteStorage: ").append(toIndentedString(isDeleteStorage)).append("\n");
        sb.append("    isDeleteObs: ").append(toIndentedString(isDeleteObs)).append("\n");
        sb.append("    isDeleteResource: ").append(toIndentedString(isDeleteResource)).append("\n");
        sb.append("    isDeleteIef: ").append(toIndentedString(isDeleteIef)).append("\n");
        sb.append("    isDeleteLightpeer: ").append(toIndentedString(isDeleteLightpeer)).append("\n");
        sb.append("    iefNodesId: ").append(toIndentedString(iefNodesId)).append("\n");
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
