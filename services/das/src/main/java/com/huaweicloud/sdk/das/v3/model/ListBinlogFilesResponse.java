package com.huaweicloud.sdk.das.v3.model;

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
public class ListBinlogFilesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_list")

    private List<BinlogFileInfo> fileList = null;

    public ListBinlogFilesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListBinlogFilesResponse withFileList(List<BinlogFileInfo> fileList) {
        this.fileList = fileList;
        return this;
    }

    public ListBinlogFilesResponse addFileListItem(BinlogFileInfo fileListItem) {
        if (this.fileList == null) {
            this.fileList = new ArrayList<>();
        }
        this.fileList.add(fileListItem);
        return this;
    }

    public ListBinlogFilesResponse withFileList(Consumer<List<BinlogFileInfo>> fileListSetter) {
        if (this.fileList == null) {
            this.fileList = new ArrayList<>();
        }
        fileListSetter.accept(this.fileList);
        return this;
    }

    /**
     * binlog文件列表
     * @return fileList
     */
    public List<BinlogFileInfo> getFileList() {
        return fileList;
    }

    public void setFileList(List<BinlogFileInfo> fileList) {
        this.fileList = fileList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBinlogFilesResponse that = (ListBinlogFilesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.fileList, that.fileList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, fileList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBinlogFilesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
