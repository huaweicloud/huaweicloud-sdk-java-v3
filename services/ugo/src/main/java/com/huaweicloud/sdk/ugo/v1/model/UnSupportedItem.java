package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** SQL翻译接口返回的SQL语句中的不支持特性 */
public class UnSupportedItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_name")

    private String itemName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    public UnSupportedItem withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    /** 输入SQL转换到目标端不支持的特性
     * 
     * @return itemName */
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public UnSupportedItem withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /** 不支持特性的改造建议
     * 
     * @return suggestion */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnSupportedItem unSupportedItem = (UnSupportedItem) o;
        return Objects.equals(this.itemName, unSupportedItem.itemName)
            && Objects.equals(this.suggestion, unSupportedItem.suggestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, suggestion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnSupportedItem {\n");
        sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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
