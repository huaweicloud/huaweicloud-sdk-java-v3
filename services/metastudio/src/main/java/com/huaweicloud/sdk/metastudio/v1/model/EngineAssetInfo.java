package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EngineAssetInfo
 */
public class EngineAssetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_path")

    private String relativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private String assetType;

    public EngineAssetInfo withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    /**
     * 引擎资产的相对路径信息
     * @return relativePath
     */
    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public EngineAssetInfo withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 引擎资产的类型
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EngineAssetInfo that = (EngineAssetInfo) obj;
        return Objects.equals(this.relativePath, that.relativePath) && Objects.equals(this.assetType, that.assetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relativePath, assetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineAssetInfo {\n");
        sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
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
