package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListUpgradePathsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_infos")

    private List<VersionInfosResult> versionInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_edges")

    private List<UpgradePathsResult> versionEdges = null;

    public ListUpgradePathsResponse withVersionInfos(List<VersionInfosResult> versionInfos) {
        this.versionInfos = versionInfos;
        return this;
    }

    public ListUpgradePathsResponse addVersionInfosItem(VersionInfosResult versionInfosItem) {
        if (this.versionInfos == null) {
            this.versionInfos = new ArrayList<>();
        }
        this.versionInfos.add(versionInfosItem);
        return this;
    }

    public ListUpgradePathsResponse withVersionInfos(Consumer<List<VersionInfosResult>> versionInfosSetter) {
        if (this.versionInfos == null) {
            this.versionInfos = new ArrayList<>();
        }
        versionInfosSetter.accept(this.versionInfos);
        return this;
    }

    /**
     * **参数解释**: 版本信息详情 
     * @return versionInfos
     */
    public List<VersionInfosResult> getVersionInfos() {
        return versionInfos;
    }

    public void setVersionInfos(List<VersionInfosResult> versionInfos) {
        this.versionInfos = versionInfos;
    }

    public ListUpgradePathsResponse withVersionEdges(List<UpgradePathsResult> versionEdges) {
        this.versionEdges = versionEdges;
        return this;
    }

    public ListUpgradePathsResponse addVersionEdgesItem(UpgradePathsResult versionEdgesItem) {
        if (this.versionEdges == null) {
            this.versionEdges = new ArrayList<>();
        }
        this.versionEdges.add(versionEdgesItem);
        return this;
    }

    public ListUpgradePathsResponse withVersionEdges(Consumer<List<UpgradePathsResult>> versionEdgesSetter) {
        if (this.versionEdges == null) {
            this.versionEdges = new ArrayList<>();
        }
        versionEdgesSetter.accept(this.versionEdges);
        return this;
    }

    /**
     * **参数解释**: 支持的升级路径列表 
     * @return versionEdges
     */
    public List<UpgradePathsResult> getVersionEdges() {
        return versionEdges;
    }

    public void setVersionEdges(List<UpgradePathsResult> versionEdges) {
        this.versionEdges = versionEdges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUpgradePathsResponse that = (ListUpgradePathsResponse) obj;
        return Objects.equals(this.versionInfos, that.versionInfos)
            && Objects.equals(this.versionEdges, that.versionEdges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionInfos, versionEdges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUpgradePathsResponse {\n");
        sb.append("    versionInfos: ").append(toIndentedString(versionInfos)).append("\n");
        sb.append("    versionEdges: ").append(toIndentedString(versionEdges)).append("\n");
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
