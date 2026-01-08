package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 条件列表参数较为复杂，存在级联关系，建议同时使用控制台上的添加误报屏蔽规则，单击F12键查看路径后缀为/ignore，方法为POST的请求参数，便于理解参数的填写
 */
public class CreateCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<String> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_operation")

    private String logicOperation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_all_indexes_logic")

    private Integer checkAllIndexesLogic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private String index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_list_id")

    private String valueListId;

    public CreateCondition withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 字段类型，可选值有ip、url、params、cookie、header
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CreateCondition withContents(List<String> contents) {
        this.contents = contents;
        return this;
    }

    public CreateCondition addContentsItem(String contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public CreateCondition withContents(Consumer<List<String>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * 内容,数组长度限制为1，内容格式根据字段类型变化，例如，字段类型为ip时，contents内容格式需为ip地址或ip地址段；字段类型为url时，contents内容格式需为标准url格式；字段类型为params,cookie,header时，内容的格式不做限制
     * @return contents
     */
    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    public CreateCondition withLogicOperation(String logicOperation) {
        this.logicOperation = logicOperation;
        return this;
    }

    /**
     * 匹配逻辑，匹配逻辑根据字段类型变化，字段类型为ip时，匹配逻辑支持（equal：等于，not_equal：不等于），字段类型为url、header、params、cookie时，匹配逻辑支持（equal：等于，not_equal：不等于，contain：包含，not_contain：不包含，prefix：前缀为，not_prefix：前缀不为，suffix：后缀为，not_suffix：后缀不为，regular_match：正则匹配，regular_not_match：正则不匹配）
     * @return logicOperation
     */
    public String getLogicOperation() {
        return logicOperation;
    }

    public void setLogicOperation(String logicOperation) {
        this.logicOperation = logicOperation;
    }

    public CreateCondition withCheckAllIndexesLogic(Integer checkAllIndexesLogic) {
        this.checkAllIndexesLogic = checkAllIndexesLogic;
        return this;
    }

    /**
     * 使用自定义子字段、字段类型为url或ip时不需要传check_all_indexes_logic参数，其它情况下（1：检查所有子字段，2：检查任意子字段）
     * @return checkAllIndexesLogic
     */
    public Integer getCheckAllIndexesLogic() {
        return checkAllIndexesLogic;
    }

    public void setCheckAllIndexesLogic(Integer checkAllIndexesLogic) {
        this.checkAllIndexesLogic = checkAllIndexesLogic;
    }

    public CreateCondition withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * 字段类型为ip且子字段为客户端ip时，不需要传index参数；子字段类型为X-Forwarded-For时，值为x-forwarded-for；字段类型为params、header、cookie并且子字段为自定义时，index的值为自定义子字段
     * @return index
     */
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public CreateCondition withValueListId(String valueListId) {
        this.valueListId = valueListId;
        return this;
    }

    /**
     * 引用表id。当logic_operation参数以any或者all结尾时，需要传该参数。此外，引用表类型要与category类型保持一致。
     * @return valueListId
     */
    public String getValueListId() {
        return valueListId;
    }

    public void setValueListId(String valueListId) {
        this.valueListId = valueListId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCondition that = (CreateCondition) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.contents, that.contents)
            && Objects.equals(this.logicOperation, that.logicOperation)
            && Objects.equals(this.checkAllIndexesLogic, that.checkAllIndexesLogic)
            && Objects.equals(this.index, that.index) && Objects.equals(this.valueListId, that.valueListId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, contents, logicOperation, checkAllIndexesLogic, index, valueListId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCondition {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    logicOperation: ").append(toIndentedString(logicOperation)).append("\n");
        sb.append("    checkAllIndexesLogic: ").append(toIndentedString(checkAllIndexesLogic)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
