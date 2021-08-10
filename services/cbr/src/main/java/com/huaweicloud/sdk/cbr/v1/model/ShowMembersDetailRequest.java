package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowMembersDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_project_id")

    private String destProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    public ShowMembersDetailRequest withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /** 备份id
     * 
     * @return backupId */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public ShowMembersDetailRequest withDestProjectId(String destProjectId) {
        this.destProjectId = destProjectId;
        return this;
    }

    /** 接受备份共享的项目id
     * 
     * @return destProjectId */
    public String getDestProjectId() {
        return destProjectId;
    }

    public void setDestProjectId(String destProjectId) {
        this.destProjectId = destProjectId;
    }

    public ShowMembersDetailRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /** 接受的共享备份副本注册的镜像id
     * 
     * @return imageId */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ShowMembersDetailRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 备份共享状态
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowMembersDetailRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /** 目标端接受共享备份的存储库id，仅支持uuid
     * 
     * @return vaultId */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public ShowMembersDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的条目数量，正整数
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowMembersDetailRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 上一次查询最后一条的id，仅支持uuid
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ShowMembersDetailRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移值，正整数
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowMembersDetailRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /** sort的内容为一组由逗号分隔的属性及可选排序方向组成，形如<key1>[:<direction>],<key2>[:<direction>],其中direction的取值为asc (升序) 或 desc
     * (降序),如没有传入direction参数，默认为降序，sort内容的长度限制为255个字符。
     * 
     * @return sort */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMembersDetailRequest showMembersDetailRequest = (ShowMembersDetailRequest) o;
        return Objects.equals(this.backupId, showMembersDetailRequest.backupId)
            && Objects.equals(this.destProjectId, showMembersDetailRequest.destProjectId)
            && Objects.equals(this.imageId, showMembersDetailRequest.imageId)
            && Objects.equals(this.status, showMembersDetailRequest.status)
            && Objects.equals(this.vaultId, showMembersDetailRequest.vaultId)
            && Objects.equals(this.limit, showMembersDetailRequest.limit)
            && Objects.equals(this.marker, showMembersDetailRequest.marker)
            && Objects.equals(this.offset, showMembersDetailRequest.offset)
            && Objects.equals(this.sort, showMembersDetailRequest.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupId, destProjectId, imageId, status, vaultId, limit, marker, offset, sort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMembersDetailRequest {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    destProjectId: ").append(toIndentedString(destProjectId)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
