package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 压缩开关控制项。
 */
public class FileRedirectionOptionsCompressionSwitchOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compression_threshold")

    private Integer compressionThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minimum_compression_rate")

    private Integer minimumCompressionRate;

    public FileRedirectionOptionsCompressionSwitchOptions withCompressionThreshold(Integer compressionThreshold) {
        this.compressionThreshold = compressionThreshold;
        return this;
    }

    /**
     * 压缩阈值（Byte）。取值范围为[0-10240]。默认：512。
     * minimum: 0
     * maximum: 10240
     * @return compressionThreshold
     */
    public Integer getCompressionThreshold() {
        return compressionThreshold;
    }

    public void setCompressionThreshold(Integer compressionThreshold) {
        this.compressionThreshold = compressionThreshold;
    }

    public FileRedirectionOptionsCompressionSwitchOptions withMinimumCompressionRate(Integer minimumCompressionRate) {
        this.minimumCompressionRate = minimumCompressionRate;
        return this;
    }

    /**
     * 最小压缩率。取值范围为[0-1000]。默认：900。
     * minimum: 0
     * maximum: 1000
     * @return minimumCompressionRate
     */
    public Integer getMinimumCompressionRate() {
        return minimumCompressionRate;
    }

    public void setMinimumCompressionRate(Integer minimumCompressionRate) {
        this.minimumCompressionRate = minimumCompressionRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileRedirectionOptionsCompressionSwitchOptions that = (FileRedirectionOptionsCompressionSwitchOptions) obj;
        return Objects.equals(this.compressionThreshold, that.compressionThreshold)
            && Objects.equals(this.minimumCompressionRate, that.minimumCompressionRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compressionThreshold, minimumCompressionRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileRedirectionOptionsCompressionSwitchOptions {\n");
        sb.append("    compressionThreshold: ").append(toIndentedString(compressionThreshold)).append("\n");
        sb.append("    minimumCompressionRate: ").append(toIndentedString(minimumCompressionRate)).append("\n");
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
