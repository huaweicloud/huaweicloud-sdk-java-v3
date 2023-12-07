package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSecurityDataClassificationRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private List<DataClassificationRuleQueryDTO> content = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListSecurityDataClassificationRulesResponse withContent(List<DataClassificationRuleQueryDTO> content) {
        this.content = content;
        return this;
    }

    public ListSecurityDataClassificationRulesResponse addContentItem(DataClassificationRuleQueryDTO contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    public ListSecurityDataClassificationRulesResponse withContent(
        Consumer<List<DataClassificationRuleQueryDTO>> contentSetter) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /**
     * 查询到的所有数据识别规则
     * @return content
     */
    public List<DataClassificationRuleQueryDTO> getContent() {
        return content;
    }

    public void setContent(List<DataClassificationRuleQueryDTO> content) {
        this.content = content;
    }

    public ListSecurityDataClassificationRulesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 数据识别规则总数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityDataClassificationRulesResponse that = (ListSecurityDataClassificationRulesResponse) obj;
        return Objects.equals(this.content, that.content) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityDataClassificationRulesResponse {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
