package com.huaweicloud.sdk.ddm.v1.model;

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
public class DownloadSchemaMetadataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compressed_databases_info")

    private String compressedDatabasesInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_nodes")

    private List<DnInstanceInfo> dataNodes = null;

    public DownloadSchemaMetadataResponse withCompressedDatabasesInfo(String compressedDatabasesInfo) {
        this.compressedDatabasesInfo = compressedDatabasesInfo;
        return this;
    }

    /**
     * 逻辑库信息。
     * @return compressedDatabasesInfo
     */
    public String getCompressedDatabasesInfo() {
        return compressedDatabasesInfo;
    }

    public void setCompressedDatabasesInfo(String compressedDatabasesInfo) {
        this.compressedDatabasesInfo = compressedDatabasesInfo;
    }

    public DownloadSchemaMetadataResponse withDataNodes(List<DnInstanceInfo> dataNodes) {
        this.dataNodes = dataNodes;
        return this;
    }

    public DownloadSchemaMetadataResponse addDataNodesItem(DnInstanceInfo dataNodesItem) {
        if (this.dataNodes == null) {
            this.dataNodes = new ArrayList<>();
        }
        this.dataNodes.add(dataNodesItem);
        return this;
    }

    public DownloadSchemaMetadataResponse withDataNodes(Consumer<List<DnInstanceInfo>> dataNodesSetter) {
        if (this.dataNodes == null) {
            this.dataNodes = new ArrayList<>();
        }
        dataNodesSetter.accept(this.dataNodes);
        return this;
    }

    /**
     * 关联的后端DN信息。
     * @return dataNodes
     */
    public List<DnInstanceInfo> getDataNodes() {
        return dataNodes;
    }

    public void setDataNodes(List<DnInstanceInfo> dataNodes) {
        this.dataNodes = dataNodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadSchemaMetadataResponse that = (DownloadSchemaMetadataResponse) obj;
        return Objects.equals(this.compressedDatabasesInfo, that.compressedDatabasesInfo)
            && Objects.equals(this.dataNodes, that.dataNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compressedDatabasesInfo, dataNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadSchemaMetadataResponse {\n");
        sb.append("    compressedDatabasesInfo: ").append(toIndentedString(compressedDatabasesInfo)).append("\n");
        sb.append("    dataNodes: ").append(toIndentedString(dataNodes)).append("\n");
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
