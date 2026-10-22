package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ScanProtectionOption
 */
public class ScanProtectionOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_frequency_scan_blocking_config")

    private HighFrequencyScanBlockingConfig highFrequencyScanBlockingConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_traversal_protection_config")

    private DirectoryTraversalProtectionConfig directoryTraversalProtectionConfig;

    public ScanProtectionOption withHighFrequencyScanBlockingConfig(
        HighFrequencyScanBlockingConfig highFrequencyScanBlockingConfig) {
        this.highFrequencyScanBlockingConfig = highFrequencyScanBlockingConfig;
        return this;
    }

    public ScanProtectionOption withHighFrequencyScanBlockingConfig(
        Consumer<HighFrequencyScanBlockingConfig> highFrequencyScanBlockingConfigSetter) {
        if (this.highFrequencyScanBlockingConfig == null) {
            this.highFrequencyScanBlockingConfig = new HighFrequencyScanBlockingConfig();
            highFrequencyScanBlockingConfigSetter.accept(this.highFrequencyScanBlockingConfig);
        }

        return this;
    }

    /**
     * Get highFrequencyScanBlockingConfig
     * @return highFrequencyScanBlockingConfig
     */
    public HighFrequencyScanBlockingConfig getHighFrequencyScanBlockingConfig() {
        return highFrequencyScanBlockingConfig;
    }

    public void setHighFrequencyScanBlockingConfig(HighFrequencyScanBlockingConfig highFrequencyScanBlockingConfig) {
        this.highFrequencyScanBlockingConfig = highFrequencyScanBlockingConfig;
    }

    public ScanProtectionOption withDirectoryTraversalProtectionConfig(
        DirectoryTraversalProtectionConfig directoryTraversalProtectionConfig) {
        this.directoryTraversalProtectionConfig = directoryTraversalProtectionConfig;
        return this;
    }

    public ScanProtectionOption withDirectoryTraversalProtectionConfig(
        Consumer<DirectoryTraversalProtectionConfig> directoryTraversalProtectionConfigSetter) {
        if (this.directoryTraversalProtectionConfig == null) {
            this.directoryTraversalProtectionConfig = new DirectoryTraversalProtectionConfig();
            directoryTraversalProtectionConfigSetter.accept(this.directoryTraversalProtectionConfig);
        }

        return this;
    }

    /**
     * Get directoryTraversalProtectionConfig
     * @return directoryTraversalProtectionConfig
     */
    public DirectoryTraversalProtectionConfig getDirectoryTraversalProtectionConfig() {
        return directoryTraversalProtectionConfig;
    }

    public void setDirectoryTraversalProtectionConfig(
        DirectoryTraversalProtectionConfig directoryTraversalProtectionConfig) {
        this.directoryTraversalProtectionConfig = directoryTraversalProtectionConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScanProtectionOption that = (ScanProtectionOption) obj;
        return Objects.equals(this.highFrequencyScanBlockingConfig, that.highFrequencyScanBlockingConfig)
            && Objects.equals(this.directoryTraversalProtectionConfig, that.directoryTraversalProtectionConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(highFrequencyScanBlockingConfig, directoryTraversalProtectionConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanProtectionOption {\n");
        sb.append("    highFrequencyScanBlockingConfig: ")
            .append(toIndentedString(highFrequencyScanBlockingConfig))
            .append("\n");
        sb.append("    directoryTraversalProtectionConfig: ")
            .append(toIndentedString(directoryTraversalProtectionConfig))
            .append("\n");
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
