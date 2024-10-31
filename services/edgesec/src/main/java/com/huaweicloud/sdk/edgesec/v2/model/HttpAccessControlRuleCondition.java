package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 条件列表参数较为复杂，存在级联关系，建议同时使用控制台上的添加误报屏蔽规则，单击F12键查看路径后缀为/access-control-rule，方法为POST的请求参数，便于理解参数的填写
 */
public class HttpAccessControlRuleCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private String index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<String> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_operation")

    private String logicOperation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_list_id")

    private String valueListId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_all_indexes_logic")

    private Integer checkAllIndexesLogic;

    public HttpAccessControlRuleCondition withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 字段类型。可选值为：url、custom_asn、custom_geoip、robot、user-agent、ip、params、cookie、referer、header、method、request_line、request、response_code、response_length、response_time、response_header、response_body
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public HttpAccessControlRuleCondition withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * 子字段：  - 字段类型为url、custom_asn、custom_geoip、robot、user-agent、referer、request_line、method、request、response_code、response_length、response_time、response_body时，不需要传index参数    - 字段类型为params、cookie、header、response_header并且子字段为自定义时，index的值为自定义子字段
     * @return index
     */
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public HttpAccessControlRuleCondition withContents(List<String> contents) {
        this.contents = contents;
        return this;
    }

    public HttpAccessControlRuleCondition addContentsItem(String contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public HttpAccessControlRuleCondition withContents(Consumer<List<String>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * 内容列表
     * @return contents
     */
    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    public HttpAccessControlRuleCondition withLogicOperation(String logicOperation) {
        this.logicOperation = logicOperation;
        return this;
    }

    /**
     * 处理逻辑
     * @return logicOperation
     */
    public String getLogicOperation() {
        return logicOperation;
    }

    public void setLogicOperation(String logicOperation) {
        this.logicOperation = logicOperation;
    }

    public HttpAccessControlRuleCondition withValueListId(String valueListId) {
        this.valueListId = valueListId;
        return this;
    }

    /**
     * 引用表id
     * @return valueListId
     */
    public String getValueListId() {
        return valueListId;
    }

    public void setValueListId(String valueListId) {
        this.valueListId = valueListId;
    }

    public HttpAccessControlRuleCondition withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 若防护规则涉及阈值，即使用该字段
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public HttpAccessControlRuleCondition withCheckAllIndexesLogic(Integer checkAllIndexesLogic) {
        this.checkAllIndexesLogic = checkAllIndexesLogic;
        return this;
    }

    /**
     * 1.所有子字段/2.任意子字段
     * @return checkAllIndexesLogic
     */
    public Integer getCheckAllIndexesLogic() {
        return checkAllIndexesLogic;
    }

    public void setCheckAllIndexesLogic(Integer checkAllIndexesLogic) {
        this.checkAllIndexesLogic = checkAllIndexesLogic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpAccessControlRuleCondition that = (HttpAccessControlRuleCondition) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.index, that.index)
            && Objects.equals(this.contents, that.contents) && Objects.equals(this.logicOperation, that.logicOperation)
            && Objects.equals(this.valueListId, that.valueListId) && Objects.equals(this.size, that.size)
            && Objects.equals(this.checkAllIndexesLogic, that.checkAllIndexesLogic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, index, contents, logicOperation, valueListId, size, checkAllIndexesLogic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpAccessControlRuleCondition {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    logicOperation: ").append(toIndentedString(logicOperation)).append("\n");
        sb.append("    valueListId: ").append(toIndentedString(valueListId)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    checkAllIndexesLogic: ").append(toIndentedString(checkAllIndexesLogic)).append("\n");
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
