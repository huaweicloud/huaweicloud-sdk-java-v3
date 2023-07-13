package com.huaweicloud.sdk.osm.v2.model;

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
public class ListTransportHistoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_ops_list")

    private List<FileOperateLog> fileOpsList = null;

    public ListTransportHistoriesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListTransportHistoriesResponse withFileOpsList(List<FileOperateLog> fileOpsList) {
        this.fileOpsList = fileOpsList;
        return this;
    }

    public ListTransportHistoriesResponse addFileOpsListItem(FileOperateLog fileOpsListItem) {
        if (this.fileOpsList == null) {
            this.fileOpsList = new ArrayList<>();
        }
        this.fileOpsList.add(fileOpsListItem);
        return this;
    }

    public ListTransportHistoriesResponse withFileOpsList(Consumer<List<FileOperateLog>> fileOpsListSetter) {
        if (this.fileOpsList == null) {
            this.fileOpsList = new ArrayList<>();
        }
        fileOpsListSetter.accept(this.fileOpsList);
        return this;
    }

    /**
     * 文件记录列表
     * @return fileOpsList
     */
    public List<FileOperateLog> getFileOpsList() {
        return fileOpsList;
    }

    public void setFileOpsList(List<FileOperateLog> fileOpsList) {
        this.fileOpsList = fileOpsList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTransportHistoriesResponse that = (ListTransportHistoriesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.fileOpsList, that.fileOpsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, fileOpsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransportHistoriesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    fileOpsList: ").append(toIndentedString(fileOpsList)).append("\n");
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
