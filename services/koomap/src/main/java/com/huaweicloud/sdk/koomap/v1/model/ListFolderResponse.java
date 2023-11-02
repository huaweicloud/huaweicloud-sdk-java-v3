package com.huaweicloud.sdk.koomap.v1.model;

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
public class ListFolderResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folders")

    private List<FolderVo> folders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListFolderResponse withFolders(List<FolderVo> folders) {
        this.folders = folders;
        return this;
    }

    public ListFolderResponse addFoldersItem(FolderVo foldersItem) {
        if (this.folders == null) {
            this.folders = new ArrayList<>();
        }
        this.folders.add(foldersItem);
        return this;
    }

    public ListFolderResponse withFolders(Consumer<List<FolderVo>> foldersSetter) {
        if (this.folders == null) {
            this.folders = new ArrayList<>();
        }
        foldersSetter.accept(this.folders);
        return this;
    }

    /**
     * 文件夹列表。
     * @return folders
     */
    public List<FolderVo> getFolders() {
        return folders;
    }

    public void setFolders(List<FolderVo> folders) {
        this.folders = folders;
    }

    public ListFolderResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListFolderResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFolderResponse that = (ListFolderResponse) obj;
        return Objects.equals(this.folders, that.folders) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folders, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFolderResponse {\n");
        sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
