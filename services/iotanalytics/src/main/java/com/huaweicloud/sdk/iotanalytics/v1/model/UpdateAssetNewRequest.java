package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateAssetNewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AssetModRequest body;

    public UpdateAssetNewRequest withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /** 资产ID
     * 
     * @return assetId */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public UpdateAssetNewRequest withBody(AssetModRequest body) {
        this.body = body;
        return this;
    }

    public UpdateAssetNewRequest withBody(Consumer<AssetModRequest> bodySetter) {
        if (this.body == null) {
            this.body = new AssetModRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public AssetModRequest getBody() {
        return body;
    }

    public void setBody(AssetModRequest body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAssetNewRequest updateAssetNewRequest = (UpdateAssetNewRequest) o;
        return Objects.equals(this.assetId, updateAssetNewRequest.assetId)
            && Objects.equals(this.body, updateAssetNewRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAssetNewRequest {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
