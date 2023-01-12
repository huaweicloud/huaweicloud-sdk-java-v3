package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExecuteAssetActionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ManageAssetReq body;

    public ExecuteAssetActionRequest withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产id
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public ExecuteAssetActionRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * version
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ExecuteAssetActionRequest withBody(ManageAssetReq body) {
        this.body = body;
        return this;
    }

    public ExecuteAssetActionRequest withBody(Consumer<ManageAssetReq> bodySetter) {
        if (this.body == null) {
            this.body = new ManageAssetReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ManageAssetReq getBody() {
        return body;
    }

    public void setBody(ManageAssetReq body) {
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
        ExecuteAssetActionRequest executeAssetActionRequest = (ExecuteAssetActionRequest) o;
        return Objects.equals(this.assetId, executeAssetActionRequest.assetId)
            && Objects.equals(this.version, executeAssetActionRequest.version)
            && Objects.equals(this.body, executeAssetActionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, version, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteAssetActionRequest {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
