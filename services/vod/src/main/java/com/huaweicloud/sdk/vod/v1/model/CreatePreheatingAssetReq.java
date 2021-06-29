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
 * CreatePreheatingAssetReq
 */
public class CreatePreheatingAssetReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_id")
    
    private String assetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="urls")
    
    private List<String> urls = null;
    
    public CreatePreheatingAssetReq withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    


    /**
     * 已发布媒资的ID。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    

    public CreatePreheatingAssetReq withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    
    public CreatePreheatingAssetReq addUrlsItem(String urlsItem) {
        if(this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public CreatePreheatingAssetReq withUrls(Consumer<List<String>> urlsSetter) {
        if(this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 已发布媒资的播放URL列表，一次最多只能预热10个URL。
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePreheatingAssetReq createPreheatingAssetReq = (CreatePreheatingAssetReq) o;
        return Objects.equals(this.assetId, createPreheatingAssetReq.assetId) &&
            Objects.equals(this.urls, createPreheatingAssetReq.urls);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assetId, urls);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePreheatingAssetReq {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

