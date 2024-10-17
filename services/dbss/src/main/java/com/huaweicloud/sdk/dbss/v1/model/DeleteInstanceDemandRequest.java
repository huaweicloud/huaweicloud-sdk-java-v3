package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeleteInstanceDemandRequest
 */
public class DeleteInstanceDemandRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_publicip")

    private Boolean deletePublicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_volume")

    private Boolean deleteVolume;

    public DeleteInstanceDemandRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。可在查询实例列表接口的ID字段获取。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeleteInstanceDemandRequest withDeletePublicip(Boolean deletePublicip) {
        this.deletePublicip = deletePublicip;
        return this;
    }

    /**
     * 是否删除弹性IP
     * @return deletePublicip
     */
    public Boolean getDeletePublicip() {
        return deletePublicip;
    }

    public void setDeletePublicip(Boolean deletePublicip) {
        this.deletePublicip = deletePublicip;
    }

    public DeleteInstanceDemandRequest withDeleteVolume(Boolean deleteVolume) {
        this.deleteVolume = deleteVolume;
        return this;
    }

    /**
     * 是否删除磁盘
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
        DeleteInstanceDemandRequest that = (DeleteInstanceDemandRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.deletePublicip, that.deletePublicip)
            && Objects.equals(this.deleteVolume, that.deleteVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deletePublicip, deleteVolume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteInstanceDemandRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
