package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteShareFilesRequestBody
 */
public class DeleteShareFilesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_paths")

    private List<String> filePaths = null;

    public DeleteShareFilesRequestBody withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public DeleteShareFilesRequestBody addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public DeleteShareFilesRequestBody withServerIds(Consumer<List<String>> serverIdsSetter) {
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

    public DeleteShareFilesRequestBody withFilePaths(List<String> filePaths) {
        this.filePaths = filePaths;
        return this;
    }

    public DeleteShareFilesRequestBody addFilePathsItem(String filePathsItem) {
        if (this.filePaths == null) {
            this.filePaths = new ArrayList<>();
        }
        this.filePaths.add(filePathsItem);
        return this;
    }

    public DeleteShareFilesRequestBody withFilePaths(Consumer<List<String>> filePathsSetter) {
        if (this.filePaths == null) {
            this.filePaths = new ArrayList<>();
        }
        filePathsSetter.accept(this.filePaths);
        return this;
    }

    /**
     * 所需删除的共享存储文件绝对路径。以/开头，最大长度4096字节，目前只支持大小写字母、数字、点（.）、斜线（/）、中划线（-）、空格、下划线（_）、等号（=），不支持中文。路径中不能包含.. 上层目录路径，防止跨目录攻击。
     * @return filePaths
     */
    public List<String> getFilePaths() {
        return filePaths;
    }

    public void setFilePaths(List<String> filePaths) {
        this.filePaths = filePaths;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteShareFilesRequestBody that = (DeleteShareFilesRequestBody) obj;
        return Objects.equals(this.serverIds, that.serverIds) && Objects.equals(this.filePaths, that.filePaths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverIds, filePaths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteShareFilesRequestBody {\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
        sb.append("    filePaths: ").append(toIndentedString(filePaths)).append("\n");
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
