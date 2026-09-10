package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新模型资产请求体
 */
public class UpdateModelAssetReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_desc")

    private String assetDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    public UpdateModelAssetReq withAssetDesc(String assetDesc) {
        this.assetDesc = assetDesc;
        return this;
    }

    /**
     * **参数解释**： 资产描述。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assetDesc
     */
    public String getAssetDesc() {
        return assetDesc;
    }

    public void setAssetDesc(String assetDesc) {
        this.assetDesc = assetDesc;
    }

    public UpdateModelAssetReq withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * **参数解释**： 资产名称。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
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
        UpdateModelAssetReq that = (UpdateModelAssetReq) obj;
        return Objects.equals(this.assetDesc, that.assetDesc) && Objects.equals(this.assetName, that.assetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetDesc, assetName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateModelAssetReq {\n");
        sb.append("    assetDesc: ").append(toIndentedString(assetDesc)).append("\n");
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
