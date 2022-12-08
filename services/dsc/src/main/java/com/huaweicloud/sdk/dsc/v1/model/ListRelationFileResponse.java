package com.huaweicloud.sdk.dsc.v1.model;

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
public class ListRelationFileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_page")

    private Integer currentPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_list")

    private List<RelationSimpleInfo> fileList = null;

    public ListRelationFileResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 关系信息总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListRelationFileResponse withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /**
     * 当前页
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public ListRelationFileResponse withFileList(List<RelationSimpleInfo> fileList) {
        this.fileList = fileList;
        return this;
    }

    public ListRelationFileResponse addFileListItem(RelationSimpleInfo fileListItem) {
        if (this.fileList == null) {
            this.fileList = new ArrayList<>();
        }
        this.fileList.add(fileListItem);
        return this;
    }

    public ListRelationFileResponse withFileList(Consumer<List<RelationSimpleInfo>> fileListSetter) {
        if (this.fileList == null) {
            this.fileList = new ArrayList<>();
        }
        fileListSetter.accept(this.fileList);
        return this;
    }

    /**
     * 关系信息列表
     * @return fileList
     */
    public List<RelationSimpleInfo> getFileList() {
        return fileList;
    }

    public void setFileList(List<RelationSimpleInfo> fileList) {
        this.fileList = fileList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRelationFileResponse listRelationFileResponse = (ListRelationFileResponse) o;
        return Objects.equals(this.total, listRelationFileResponse.total)
            && Objects.equals(this.currentPage, listRelationFileResponse.currentPage)
            && Objects.equals(this.fileList, listRelationFileResponse.fileList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, currentPage, fileList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRelationFileResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    fileList: ").append(toIndentedString(fileList)).append("\n");
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
