package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListClusterUpgradeFeatureGatesResponse extends SdkResponse {

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
    @JsonProperty(value = "upgradeFeatureGates")

    private Map<String, String> upgradeFeatureGates = null;

    public ListClusterUpgradeFeatureGatesResponse withApiVersion(String apiVersion) {
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

    public ListClusterUpgradeFeatureGatesResponse withKind(String kind) {
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

    public ListClusterUpgradeFeatureGatesResponse withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListClusterUpgradeFeatureGatesResponse withMetadata(Consumer<Metadata> metadataSetter) {
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

    public ListClusterUpgradeFeatureGatesResponse withUpgradeFeatureGates(Map<String, String> upgradeFeatureGates) {
        this.upgradeFeatureGates = upgradeFeatureGates;
        return this;
    }

    public ListClusterUpgradeFeatureGatesResponse putUpgradeFeatureGatesItem(String key,
        String upgradeFeatureGatesItem) {
        if (this.upgradeFeatureGates == null) {
            this.upgradeFeatureGates = new HashMap<>();
        }
        this.upgradeFeatureGates.put(key, upgradeFeatureGatesItem);
        return this;
    }

    public ListClusterUpgradeFeatureGatesResponse withUpgradeFeatureGates(
        Consumer<Map<String, String>> upgradeFeatureGatesSetter) {
        if (this.upgradeFeatureGates == null) {
            this.upgradeFeatureGates = new HashMap<>();
        }
        upgradeFeatureGatesSetter.accept(this.upgradeFeatureGates);
        return this;
    }

    /**
     * 特性开关信息,格式为key/value键值对。 - Key: 目前有下列值：DisplayPreCheckDetail(展示所有集群升级前检查项详情),EvsSnapshot(使用EVS快照备份集群), LabelForSkippedNode(支持为集群升级过程中跳过的节点打标签), UpgradeStrategy(集群升级策略) - Value: Support 支持,Disable 关闭,Default 使用CCE服务默认规则判断
     * @return upgradeFeatureGates
     */
    public Map<String, String> getUpgradeFeatureGates() {
        return upgradeFeatureGates;
    }

    public void setUpgradeFeatureGates(Map<String, String> upgradeFeatureGates) {
        this.upgradeFeatureGates = upgradeFeatureGates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterUpgradeFeatureGatesResponse that = (ListClusterUpgradeFeatureGatesResponse) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.upgradeFeatureGates, that.upgradeFeatureGates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, upgradeFeatureGates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterUpgradeFeatureGatesResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    upgradeFeatureGates: ").append(toIndentedString(upgradeFeatureGates)).append("\n");
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
