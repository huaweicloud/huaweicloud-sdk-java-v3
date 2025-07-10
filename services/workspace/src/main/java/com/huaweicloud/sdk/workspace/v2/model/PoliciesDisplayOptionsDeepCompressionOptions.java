package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 深度压缩控制选项。
 */
public class PoliciesDisplayOptionsDeepCompressionOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deep_compression_level")

    private String deepCompressionLevel;

    public PoliciesDisplayOptionsDeepCompressionOptions withDeepCompressionLevel(String deepCompressionLevel) {
        this.deepCompressionLevel = deepCompressionLevel;
        return this;
    }

    /**
     * 深度压缩级别。取值为： 压缩级别0：Compression grade 0 压缩级别1：Compression grade 1 压缩级别2：Compression grade 2 压缩级别3：Compression grade 3 压缩级别4：Compression grade 4 压缩级别5：Compression grade 5 压缩级别6：Compression grade 6 压缩级别7：Compression grade 7 压缩级别8：Compression grade 8 压缩级别9：Compression grade 9
     * @return deepCompressionLevel
     */
    public String getDeepCompressionLevel() {
        return deepCompressionLevel;
    }

    public void setDeepCompressionLevel(String deepCompressionLevel) {
        this.deepCompressionLevel = deepCompressionLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesDisplayOptionsDeepCompressionOptions that = (PoliciesDisplayOptionsDeepCompressionOptions) obj;
        return Objects.equals(this.deepCompressionLevel, that.deepCompressionLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deepCompressionLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesDisplayOptionsDeepCompressionOptions {\n");
        sb.append("    deepCompressionLevel: ").append(toIndentedString(deepCompressionLevel)).append("\n");
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
