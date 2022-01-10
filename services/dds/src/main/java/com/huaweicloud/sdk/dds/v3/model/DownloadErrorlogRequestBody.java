package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** DownloadErrorlogRequestBody */
public class DownloadErrorlogRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name_list")

    private List<String> fileNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id_list")

    private List<String> nodeIdList = null;

    public DownloadErrorlogRequestBody withFileNameList(List<String> fileNameList) {
        this.fileNameList = fileNameList;
        return this;
    }

    public DownloadErrorlogRequestBody addFileNameListItem(String fileNameListItem) {
        if (this.fileNameList == null) {
            this.fileNameList = new ArrayList<>();
        }
        this.fileNameList.add(fileNameListItem);
        return this;
    }

    public DownloadErrorlogRequestBody withFileNameList(Consumer<List<String>> fileNameListSetter) {
        if (this.fileNameList == null) {
            this.fileNameList = new ArrayList<>();
        }
        fileNameListSetter.accept(this.fileNameList);
        return this;
    }

    /** - 需要下载的文件的文件名列表。
     * 
     * @return fileNameList */
    public List<String> getFileNameList() {
        return fileNameList;
    }

    public void setFileNameList(List<String> fileNameList) {
        this.fileNameList = fileNameList;
    }

    public DownloadErrorlogRequestBody withNodeIdList(List<String> nodeIdList) {
        this.nodeIdList = nodeIdList;
        return this;
    }

    public DownloadErrorlogRequestBody addNodeIdListItem(String nodeIdListItem) {
        if (this.nodeIdList == null) {
            this.nodeIdList = new ArrayList<>();
        }
        this.nodeIdList.add(nodeIdListItem);
        return this;
    }

    public DownloadErrorlogRequestBody withNodeIdList(Consumer<List<String>> nodeIdListSetter) {
        if (this.nodeIdList == null) {
            this.nodeIdList = new ArrayList<>();
        }
        nodeIdListSetter.accept(this.nodeIdList);
        return this;
    }

    /** 节点ID列表，取空值，表示查询实例下所有允许查询的节点。使用请参考《DDS API参考》的“查询实例列表和详情”响应消息表“nodes 数据结构说明”的“id”。允许查询的节点如下： -
     * 集群下面的mongos、shard、config节点 - 副本集、单节点下面的所有节点
     * 
     * @return nodeIdList */
    public List<String> getNodeIdList() {
        return nodeIdList;
    }

    public void setNodeIdList(List<String> nodeIdList) {
        this.nodeIdList = nodeIdList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadErrorlogRequestBody downloadErrorlogRequestBody = (DownloadErrorlogRequestBody) o;
        return Objects.equals(this.fileNameList, downloadErrorlogRequestBody.fileNameList)
            && Objects.equals(this.nodeIdList, downloadErrorlogRequestBody.nodeIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileNameList, nodeIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadErrorlogRequestBody {\n");
        sb.append("    fileNameList: ").append(toIndentedString(fileNameList)).append("\n");
        sb.append("    nodeIdList: ").append(toIndentedString(nodeIdList)).append("\n");
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
