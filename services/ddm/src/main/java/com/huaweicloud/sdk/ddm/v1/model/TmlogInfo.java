package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TmlogInfo
 */
public class TmlogInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_list")

    private List<String> fileList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tmlog_size")

    private BigDecimal tmlogSize;

    public TmlogInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public TmlogInfo withFileList(List<String> fileList) {
        this.fileList = fileList;
        return this;
    }

    public TmlogInfo addFileListItem(String fileListItem) {
        if (this.fileList == null) {
            this.fileList = new ArrayList<>();
        }
        this.fileList.add(fileListItem);
        return this;
    }

    public TmlogInfo withFileList(Consumer<List<String>> fileListSetter) {
        if (this.fileList == null) {
            this.fileList = new ArrayList<>();
        }
        fileListSetter.accept(this.fileList);
        return this;
    }

    /**
     * 压缩文件列表
     * @return fileList
     */
    public List<String> getFileList() {
        return fileList;
    }

    public void setFileList(List<String> fileList) {
        this.fileList = fileList;
    }

    public TmlogInfo withTmlogSize(BigDecimal tmlogSize) {
        this.tmlogSize = tmlogSize;
        return this;
    }

    /**
     * TMLOG文件大小单位（MB）。
     * minimum: 1
     * maximum: 9.223372036854775E+18
     * @return tmlogSize
     */
    public BigDecimal getTmlogSize() {
        return tmlogSize;
    }

    public void setTmlogSize(BigDecimal tmlogSize) {
        this.tmlogSize = tmlogSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TmlogInfo that = (TmlogInfo) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.fileList, that.fileList)
            && Objects.equals(this.tmlogSize, that.tmlogSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, fileList, tmlogSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TmlogInfo {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    fileList: ").append(toIndentedString(fileList)).append("\n");
        sb.append("    tmlogSize: ").append(toIndentedString(tmlogSize)).append("\n");
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
