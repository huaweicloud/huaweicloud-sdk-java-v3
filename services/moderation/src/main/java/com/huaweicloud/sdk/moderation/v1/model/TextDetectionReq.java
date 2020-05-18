package com.huaweicloud.sdk.moderation.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.moderation.v1.model.TextDetectionItemsReq;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class TextDetectionReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="categories")
    
    private List<String> categories = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="items")
    
    private List<TextDetectionItemsReq> items = new ArrayList<>();
    
    public TextDetectionReq withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    
    public TextDetectionReq addCategoriesItem(String categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public TextDetectionReq withCategories(Consumer<List<String>> categoriesSetter) {
        if(this.categories == null ){
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 检测场景。  当前支持的场景有默认场景和用户自定义场景：  默认场景为：  * politics：涉政  * porn：涉黄  * ad：广告  * abuse：辱骂  * contraband：违禁品  * flood：灌水  - 用户自定义场景为：自定义黑名单词库。  > 说明： - 自定义词库的创建和使用请参见[配置自定义词库](https://support.huaweicloud.com/api-moderation/moderation_03_0027.html)。 - flood场景不支持使用自定义白名单词库。
     * @return categories
     */
    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public TextDetectionReq withItems(List<TextDetectionItemsReq> items) {
        this.items = items;
        return this;
    }

    
    public TextDetectionReq addItemsItem(TextDetectionItemsReq itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    public TextDetectionReq withItems(Consumer<List<TextDetectionItemsReq>> itemsSetter) {
        if(this.items == null ){
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 待检测的文本列表，目前暂时每次只支持传一个item。
     * @return items
     */
    public List<TextDetectionItemsReq> getItems() {
        return items;
    }

    public void setItems(List<TextDetectionItemsReq> items) {
        this.items = items;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextDetectionReq textDetectionReq = (TextDetectionReq) o;
        return Objects.equals(this.categories, textDetectionReq.categories) &&
            Objects.equals(this.items, textDetectionReq.items);
    }
    @Override
    public int hashCode() {
        return Objects.hash(categories, items);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextDetectionReq {\n");
            sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
            sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

