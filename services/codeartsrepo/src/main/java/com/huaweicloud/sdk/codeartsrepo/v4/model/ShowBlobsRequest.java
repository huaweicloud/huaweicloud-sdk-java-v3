package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowBlobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blob_id")

    private String blobId;

    public ShowBlobsRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowBlobsRequest withBlobId(String blobId) {
        this.blobId = blobId;
        return this;
    }

    /**
     * **参数解释：** blob文件ID。通过[[查询某个仓库的文件信息](https://support.huaweicloud.com/api-codeartsrepo/ListFilesByQuery.html)](tag:hws)[[查询某个仓库的文件信息](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListFilesByQuery.html)](tag:hws_hk)[查询某个仓库的文件信息](tag:hcs,hcs_sm)接口查询某个仓库的文件信息获取。 **取值范围：** 不涉及。
     * @return blobId
     */
    public String getBlobId() {
        return blobId;
    }

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBlobsRequest that = (ShowBlobsRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.blobId, that.blobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, blobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBlobsRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
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
