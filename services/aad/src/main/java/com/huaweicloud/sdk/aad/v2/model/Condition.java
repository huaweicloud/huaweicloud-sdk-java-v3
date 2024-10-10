package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * cc规则防护规则限速条件
 */
public class Condition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<String> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private String index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_operation")

    private String logicOperation;

    public Condition withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 字段类型 url：路径 ip：IPv4 ipv6：IPv6 params：Params cookie：Cookie header：Header response_code：Response Code
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Condition withContents(List<String> contents) {
        this.contents = contents;
        return this;
    }

    public Condition addContentsItem(String contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public Condition withContents(Consumer<List<String>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * 条件列表逻辑匹配内容。 当匹配逻辑为exist或not_exist时，contents必须为空，其他情况下contents必填且长度不超过2048 当category为response_code时，contents状态码为200~599，正则为 ^(?:[2-5]\\d{2})$ 当匹配逻辑包含\"len\"时，contents必须为0~65535的整数；当匹配逻辑包含\"num\"时，contents必须为0~512的整数
     * @return contents
     */
    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    public Condition withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * 子字段 当字段类型为ip或ipv6时，index必填且必须为：client-ip：客户端IP、x-forwarded-for：X-Forwarded-For、TCP连接IP: $remote_addr 当字段类型（category）选择“params”、“cookie”、“header”时，请根据实际需求配置子字段且该参数必填。 当匹配逻辑为num_greater、num_less、num_equal、num_not_equal时，子字段必须为空 当子字段不为空时，最大长度不超过2048
     * @return index
     */
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Condition withLogicOperation(String logicOperation) {
        this.logicOperation = logicOperation;
        return this;
    }

    /**
     * 条件列表匹配逻辑。 如果字段类型category是url，匹配逻辑可以为：contain、 not_contain、 equal、 not_equal、 prefix、 not_prefix、 suffix、 not_suffix、 len_greater、 len_less、len_equal或者len_not_equal 如果字段类型category是ip、ipv6或response_code，匹配逻辑可以为： equal、not_equal 如果字段类型category是params、cookie或者header, 匹配逻辑可以为：contain、 not_contain、 equal、 not_equal、 prefix、 not_prefix、 suffix、 not_suffix、 len_greater、 len_less、len_equal、len_not_equal、num_greater、num_less、num_equal、num_not_equal、exist或者not_exist
     * @return logicOperation
     */
    public String getLogicOperation() {
        return logicOperation;
    }

    public void setLogicOperation(String logicOperation) {
        this.logicOperation = logicOperation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Condition that = (Condition) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.contents, that.contents)
            && Objects.equals(this.index, that.index) && Objects.equals(this.logicOperation, that.logicOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, contents, index, logicOperation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Condition {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    logicOperation: ").append(toIndentedString(logicOperation)).append("\n");
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
