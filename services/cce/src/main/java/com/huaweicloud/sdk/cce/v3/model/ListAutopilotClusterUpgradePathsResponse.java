package com.huaweicloud.sdk.cce.v3.model;

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
public class ListAutopilotClusterUpgradePathsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgradePaths")

    private List<UpgradePath> upgradePaths = null;

    public ListAutopilotClusterUpgradePathsResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ListAutopilotClusterUpgradePathsResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 资源类型
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ListAutopilotClusterUpgradePathsResponse withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListAutopilotClusterUpgradePathsResponse withMetadata(Consumer<Metadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public ListAutopilotClusterUpgradePathsResponse withUpgradePaths(List<UpgradePath> upgradePaths) {
        this.upgradePaths = upgradePaths;
        return this;
    }

    public ListAutopilotClusterUpgradePathsResponse addUpgradePathsItem(UpgradePath upgradePathsItem) {
        if (this.upgradePaths == null) {
            this.upgradePaths = new ArrayList<>();
        }
        this.upgradePaths.add(upgradePathsItem);
        return this;
    }

    public ListAutopilotClusterUpgradePathsResponse withUpgradePaths(Consumer<List<UpgradePath>> upgradePathsSetter) {
        if (this.upgradePaths == null) {
            this.upgradePaths = new ArrayList<>();
        }
        upgradePathsSetter.accept(this.upgradePaths);
        return this;
    }

    /**
     * 升级路径集合
     * @return upgradePaths
     */
    public List<UpgradePath> getUpgradePaths() {
        return upgradePaths;
    }

    public void setUpgradePaths(List<UpgradePath> upgradePaths) {
        this.upgradePaths = upgradePaths;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAutopilotClusterUpgradePathsResponse that = (ListAutopilotClusterUpgradePathsResponse) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.upgradePaths, that.upgradePaths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, upgradePaths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAutopilotClusterUpgradePathsResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    upgradePaths: ").append(toIndentedString(upgradePaths)).append("\n");
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
