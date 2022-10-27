package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExtensionFileSnake
 */
public class ExtensionFileSnake {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private String assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    public ExtensionFileSnake withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 资源类型
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public ExtensionFileSnake withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 资源地址
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtensionFileSnake extensionFileSnake = (ExtensionFileSnake) o;
        return Objects.equals(this.assetType, extensionFileSnake.assetType)
            && Objects.equals(this.source, extensionFileSnake.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetType, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionFileSnake {\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
