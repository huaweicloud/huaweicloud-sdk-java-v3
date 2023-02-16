package com.huaweicloud.sdk.imagesearch.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v2.model.SearchInfo;
import com.huaweicloud.sdk.imagesearch.v2.model.SearchItem;
import com.huaweicloud.sdk.imagesearch.v2.model.SearchRestInfoImageInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 搜索的相关信息。
 */
public class SearchRestInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="items")
    
    
    private List<SearchItem> items = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="search_info")
    
    
    private SearchInfo searchInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_info")
    
    
    private SearchRestInfoImageInfo imageInfo;

    public SearchRestInfo withItems(List<SearchItem> items) {
        this.items = items;
        return this;
    }

    
    public SearchRestInfo addItemsItem(SearchItem itemsItem) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public SearchRestInfo withItems(Consumer<List<SearchItem>> itemsSetter) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 搜索结果列表。
     * @return items
     */
    public List<SearchItem> getItems() {
        return items;
    }

    public void setItems(List<SearchItem> items) {
        this.items = items;
    }

    

    public SearchRestInfo withSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
        return this;
    }

    public SearchRestInfo withSearchInfo(Consumer<SearchInfo> searchInfoSetter) {
        if(this.searchInfo == null ){
            this.searchInfo = new SearchInfo();
            searchInfoSetter.accept(this.searchInfo);
        }
        
        return this;
    }


    /**
     * Get searchInfo
     * @return searchInfo
     */
    public SearchInfo getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }

    

    public SearchRestInfo withImageInfo(SearchRestInfoImageInfo imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }

    public SearchRestInfo withImageInfo(Consumer<SearchRestInfoImageInfo> imageInfoSetter) {
        if(this.imageInfo == null ){
            this.imageInfo = new SearchRestInfoImageInfo();
            imageInfoSetter.accept(this.imageInfo);
        }
        
        return this;
    }


    /**
     * Get imageInfo
     * @return imageInfo
     */
    public SearchRestInfoImageInfo getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(SearchRestInfoImageInfo imageInfo) {
        this.imageInfo = imageInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchRestInfo searchRestInfo = (SearchRestInfo) o;
        return Objects.equals(this.items, searchRestInfo.items) &&
            Objects.equals(this.searchInfo, searchRestInfo.searchInfo) &&
            Objects.equals(this.imageInfo, searchRestInfo.imageInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(items, searchInfo, imageInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchRestInfo {\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    searchInfo: ").append(toIndentedString(searchInfo)).append("\n");
        sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
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

