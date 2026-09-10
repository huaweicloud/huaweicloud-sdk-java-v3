package com.huaweicloud.sdk.optverse.v1.model;

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
public class ListModelAssetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assets")

    private List<ModelAssetRsp> assets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListModelAssetsResponse withAssets(List<ModelAssetRsp> assets) {
        this.assets = assets;
        return this;
    }

    public ListModelAssetsResponse addAssetsItem(ModelAssetRsp assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    public ListModelAssetsResponse withAssets(Consumer<List<ModelAssetRsp>> assetsSetter) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        assetsSetter.accept(this.assets);
        return this;
    }

    /**
     * **参数解释**： 资产列表。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assets
     */
    public List<ModelAssetRsp> getAssets() {
        return assets;
    }

    public void setAssets(List<ModelAssetRsp> assets) {
        this.assets = assets;
    }

    public ListModelAssetsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 资产总数。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListModelAssetsResponse that = (ListModelAssetsResponse) obj;
        return Objects.equals(this.assets, that.assets) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assets, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListModelAssetsResponse {\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
