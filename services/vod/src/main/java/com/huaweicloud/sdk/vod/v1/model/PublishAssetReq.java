package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PublishAssetReq
 */
public class PublishAssetReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_id")
    
    private List<String> assetId = null;
    
    public PublishAssetReq withAssetId(List<String> assetId) {
        this.assetId = assetId;
        return this;
    }

    
    public PublishAssetReq addAssetIdItem(String assetIdItem) {
        if(this.assetId == null) {
            this.assetId = new ArrayList<>();
        }
        this.assetId.add(assetIdItem);
        return this;
    }

    public PublishAssetReq withAssetId(Consumer<List<String>> assetIdSetter) {
        if(this.assetId == null) {
            this.assetId = new ArrayList<>();
        }
        assetIdSetter.accept(this.assetId);
        return this;
    }

    /**
     * Get assetId
     * @return assetId
     */
    public List<String> getAssetId() {
        return assetId;
    }

    public void setAssetId(List<String> assetId) {
        this.assetId = assetId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublishAssetReq publishAssetReq = (PublishAssetReq) o;
        return Objects.equals(this.assetId, publishAssetReq.assetId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assetId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishAssetReq {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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

