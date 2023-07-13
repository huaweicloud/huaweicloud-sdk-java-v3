package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ClusterUpgradeResponseAction
 */
public class ClusterUpgradeResponseAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetVersion")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetPlatformVersion")

    private String targetPlatformVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private UpgradeStrategy strategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private Object config;

    public ClusterUpgradeResponseAction withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 当前集群版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClusterUpgradeResponseAction withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 目标集群版本，例如\"v1.23\"
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public ClusterUpgradeResponseAction withTargetPlatformVersion(String targetPlatformVersion) {
        this.targetPlatformVersion = targetPlatformVersion;
        return this;
    }

    /**
     * 目标集群的平台版本号，表示集群版本(version)下的内部版本，不支持用户指定。
     * @return targetPlatformVersion
     */
    public String getTargetPlatformVersion() {
        return targetPlatformVersion;
    }

    public void setTargetPlatformVersion(String targetPlatformVersion) {
        this.targetPlatformVersion = targetPlatformVersion;
    }

    public ClusterUpgradeResponseAction withStrategy(UpgradeStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public ClusterUpgradeResponseAction withStrategy(Consumer<UpgradeStrategy> strategySetter) {
        if (this.strategy == null) {
            this.strategy = new UpgradeStrategy();
            strategySetter.accept(this.strategy);
        }

        return this;
    }

    /**
     * Get strategy
     * @return strategy
     */
    public UpgradeStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(UpgradeStrategy strategy) {
        this.strategy = strategy;
    }

    public ClusterUpgradeResponseAction withConfig(Object config) {
        this.config = config;
        return this;
    }

    /**
     * 升级过程中指定的集群配置
     * @return config
     */
    public Object getConfig() {
        return config;
    }

    public void setConfig(Object config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterUpgradeResponseAction that = (ClusterUpgradeResponseAction) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.targetPlatformVersion, that.targetPlatformVersion)
            && Objects.equals(this.strategy, that.strategy) && Objects.equals(this.config, that.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, targetVersion, targetPlatformVersion, strategy, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterUpgradeResponseAction {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    targetPlatformVersion: ").append(toIndentedString(targetPlatformVersion)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
