package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 热度策略的分群配置 */
public class Category {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_meta_list")

    private List<String> userMetaList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_meta_list")

    private List<String> itemMetaList = null;

    public Category withUserMetaList(List<String> userMetaList) {
        this.userMetaList = userMetaList;
        return this;
    }

    public Category addUserMetaListItem(String userMetaListItem) {
        if (this.userMetaList == null) {
            this.userMetaList = new ArrayList<>();
        }
        this.userMetaList.add(userMetaListItem);
        return this;
    }

    public Category withUserMetaList(Consumer<List<String>> userMetaListSetter) {
        if (this.userMetaList == null) {
            this.userMetaList = new ArrayList<>();
        }
        userMetaListSetter.accept(this.userMetaList);
        return this;
    }

    /** 用户特征。
     * 
     * @return userMetaList */
    public List<String> getUserMetaList() {
        return userMetaList;
    }

    public void setUserMetaList(List<String> userMetaList) {
        this.userMetaList = userMetaList;
    }

    public Category withItemMetaList(List<String> itemMetaList) {
        this.itemMetaList = itemMetaList;
        return this;
    }

    public Category addItemMetaListItem(String itemMetaListItem) {
        if (this.itemMetaList == null) {
            this.itemMetaList = new ArrayList<>();
        }
        this.itemMetaList.add(itemMetaListItem);
        return this;
    }

    public Category withItemMetaList(Consumer<List<String>> itemMetaListSetter) {
        if (this.itemMetaList == null) {
            this.itemMetaList = new ArrayList<>();
        }
        itemMetaListSetter.accept(this.itemMetaList);
        return this;
    }

    /** 物品特征。
     * 
     * @return itemMetaList */
    public List<String> getItemMetaList() {
        return itemMetaList;
    }

    public void setItemMetaList(List<String> itemMetaList) {
        this.itemMetaList = itemMetaList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Category category = (Category) o;
        return Objects.equals(this.userMetaList, category.userMetaList)
            && Objects.equals(this.itemMetaList, category.itemMetaList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userMetaList, itemMetaList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Category {\n");
        sb.append("    userMetaList: ").append(toIndentedString(userMetaList)).append("\n");
        sb.append("    itemMetaList: ").append(toIndentedString(itemMetaList)).append("\n");
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
