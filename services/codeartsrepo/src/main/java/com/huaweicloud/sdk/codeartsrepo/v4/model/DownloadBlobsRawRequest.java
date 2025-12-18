package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.progress.ProgressListener;
import com.huaweicloud.sdk.core.progress.ProgressRequest;

import java.util.Objects;

/**
 * Request Object
 */
public class DownloadBlobsRawRequest implements ProgressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blob_id")

    private String blobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    private ProgressListener progressListener;

    private long progressInterval;

    @Override
    public void setProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    @Override
    public ProgressListener getProgressListener() {
        return progressListener;
    }

    @Override
    public void setProgressInterval(long progressInterval) {
        this.progressInterval = progressInterval;
    }

    @Override
    public long getProgressInterval() {
        return progressInterval;
    }

    public DownloadBlobsRawRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[[查询用户所有仓库](https://support.huaweicloud.com/eu/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_eu)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
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

    public DownloadBlobsRawRequest withBlobId(String blobId) {
        this.blobId = blobId;
        return this;
    }

    /**
     * **参数解释：** blob文件ID。通过[[查询某个仓库的文件信息](https://support.huaweicloud.com/api-codeartsrepo/ListFilesByQuery.html)](tag:hws)[[查询某个仓库的文件信息](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListFilesByQuery.html)](tag:hws_hk)[[查询某个仓库的文件信息](https://support.huaweicloud.com/eu/api-codeartsrepo/ListFilesByQuery.html)](tag:hws_eu)[查询某个仓库的文件信息](tag:hcs,hcs_sm)接口查询某个仓库的文件信息获取。 **取值范围：** 不涉及。
     * @return blobId
     */
    public String getBlobId() {
        return blobId;
    }

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    public DownloadBlobsRawRequest withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释：** 下载文件名。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public DownloadBlobsRawRequest withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释：** 文件路径。 **取值范围：** 字符串长度不少于1，不超过10000。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadBlobsRawRequest that = (DownloadBlobsRawRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.blobId, that.blobId)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.filePath, that.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, blobId, fileName, filePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadBlobsRawRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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
