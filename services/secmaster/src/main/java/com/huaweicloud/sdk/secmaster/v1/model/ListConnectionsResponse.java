package com.huaweicloud.sdk.secmaster.v1.model;

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
public class ListConnectionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset")

    private List<AssetInfoResponseBody> asset = null;

    public ListConnectionsResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 错误码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListConnectionsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 错误信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListConnectionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 数据总量
     * minimum: 0
     * maximum: 999999999
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListConnectionsResponse withAsset(List<AssetInfoResponseBody> asset) {
        this.asset = asset;
        return this;
    }

    public ListConnectionsResponse addAssetItem(AssetInfoResponseBody assetItem) {
        if (this.asset == null) {
            this.asset = new ArrayList<>();
        }
        this.asset.add(assetItem);
        return this;
    }

    public ListConnectionsResponse withAsset(Consumer<List<AssetInfoResponseBody>> assetSetter) {
        if (this.asset == null) {
            this.asset = new ArrayList<>();
        }
        assetSetter.accept(this.asset);
        return this;
    }

    /**
     * 操作连接响应体
     * @return asset
     */
    public List<AssetInfoResponseBody> getAsset() {
        return asset;
    }

    public void setAsset(List<AssetInfoResponseBody> asset) {
        this.asset = asset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConnectionsResponse that = (ListConnectionsResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.message, that.message)
            && Objects.equals(this.total, that.total) && Objects.equals(this.asset, that.asset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, total, asset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectionsResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
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
