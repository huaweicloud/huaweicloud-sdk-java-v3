package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 输出视频资产信息配置。
 */
public class OutputAssetConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    public OutputAssetConfig withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * **参数解释**： 输出视频资产名称。 > * 视频资产名称最大长度支持256；文件名称最大长度支持240（超过长度的会被舍弃）  **约束限制**： 不涉及。 **取值范围**： 字符长度0-256位。 **默认取值**： 不涉及。
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OutputAssetConfig that = (OutputAssetConfig) obj;
        return Objects.equals(this.assetName, that.assetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputAssetConfig {\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
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
