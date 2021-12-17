package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class PublishRootAssetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_asset_id")

    private String rootAssetId;

    public PublishRootAssetRequest withRootAssetId(String rootAssetId) {
        this.rootAssetId = rootAssetId;
        return this;
    }

    /** 根资产ID
     * 
     * @return rootAssetId */
    public String getRootAssetId() {
        return rootAssetId;
    }

    public void setRootAssetId(String rootAssetId) {
        this.rootAssetId = rootAssetId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublishRootAssetRequest publishRootAssetRequest = (PublishRootAssetRequest) o;
        return Objects.equals(this.rootAssetId, publishRootAssetRequest.rootAssetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rootAssetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishRootAssetRequest {\n");
        sb.append("    rootAssetId: ").append(toIndentedString(rootAssetId)).append("\n");
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
