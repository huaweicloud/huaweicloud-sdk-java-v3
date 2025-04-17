package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RefreshTaskReq
 */
public class RefreshTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id_list")

    private List<String> assetIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urls")

    private List<String> urls = null;

    public RefreshTaskReq withAssetIdList(List<String> assetIdList) {
        this.assetIdList = assetIdList;
        return this;
    }

    public RefreshTaskReq addAssetIdListItem(String assetIdListItem) {
        if (this.assetIdList == null) {
            this.assetIdList = new ArrayList<>();
        }
        this.assetIdList.add(assetIdListItem);
        return this;
    }

    public RefreshTaskReq withAssetIdList(Consumer<List<String>> assetIdListSetter) {
        if (this.assetIdList == null) {
            this.assetIdList = new ArrayList<>();
        }
        assetIdListSetter.accept(this.assetIdList);
        return this;
    }

    /**
     * 完成态、删除态、发布态的媒资ID列表，一次性最多刷新10个媒资ID。
     * @return assetIdList
     */
    public List<String> getAssetIdList() {
        return assetIdList;
    }

    public void setAssetIdList(List<String> assetIdList) {
        this.assetIdList = assetIdList;
    }

    public RefreshTaskReq withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    public RefreshTaskReq addUrlsItem(String urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public RefreshTaskReq withUrls(Consumer<List<String>> urlsSetter) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 完成态、删除态、发布态的播放URL列表，一次性最多刷新10个URL。 单个URL的长度不能超过10240。 
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RefreshTaskReq that = (RefreshTaskReq) obj;
        return Objects.equals(this.assetIdList, that.assetIdList) && Objects.equals(this.urls, that.urls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetIdList, urls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RefreshTaskReq {\n");
        sb.append("    assetIdList: ").append(toIndentedString(assetIdList)).append("\n");
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
