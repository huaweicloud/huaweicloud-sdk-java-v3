package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CustomConditions
 */
public class CustomConditions  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    
    private String category;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="index")
    
    private String index;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logic")
    
    private Integer logic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="contents")
    
    private List<String> contents = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value_list_id")
    
    private String valueListId;

    public CustomConditions withCategory(String category) {
        this.category = category;
        return this;
    }

    


    /**
     * 条件类型 固定值path、user-agent、ip、params、cookie、referer、header
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    

    public CustomConditions withIndex(String index) {
        this.index = index;
        return this;
    }

    


    /**
     * 当“category”为“cookie”时，index表示cookie name。当“category”为“params”时，index表示param name。当“category”为“header”时，index表示header中的选项。
     * @return index
     */
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    

    public CustomConditions withLogic(Integer logic) {
        this.logic = logic;
        return this;
    }

    


    /**
     * “contain”，“not_contain”，“equal”,“not_equal”,“prefix”，“not_prefix”，“suffix”，“not_suffix”分别代表包含、不包含、等于、不等于、前缀为、前缀不为、后缀为、后缀不为。当条件类型“category”为ip时，“logic”只能为“equal”或者“not_equal”。
     * @return logic
     */
    public Integer getLogic() {
        return logic;
    }

    public void setLogic(Integer logic) {
        this.logic = logic;
    }

    

    public CustomConditions withContents(List<String> contents) {
        this.contents = contents;
        return this;
    }

    
    public CustomConditions addContentsItem(String contentsItem) {
        if(this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public CustomConditions withContents(Consumer<List<String>> contentsSetter) {
        if(this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * 条件匹配的内容
     * @return contents
     */
    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    

    public CustomConditions withValueListId(String valueListId) {
        this.valueListId = valueListId;
        return this;
    }

    


    /**
     * 引用表的id
     * @return valueListId
     */
    public String getValueListId() {
        return valueListId;
    }

    public void setValueListId(String valueListId) {
        this.valueListId = valueListId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomConditions customConditions = (CustomConditions) o;
        return Objects.equals(this.category, customConditions.category) &&
            Objects.equals(this.index, customConditions.index) &&
            Objects.equals(this.logic, customConditions.logic) &&
            Objects.equals(this.contents, customConditions.contents) &&
            Objects.equals(this.valueListId, customConditions.valueListId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(category, index, logic, contents, valueListId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomConditions {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    valueListId: ").append(toIndentedString(valueListId)).append("\n");
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

