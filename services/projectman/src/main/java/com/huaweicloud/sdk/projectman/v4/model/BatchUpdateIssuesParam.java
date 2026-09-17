package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量更新工作项参数，支持更新不同工作项的相同字段
 */
public class BatchUpdateIssuesParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute")

    private IssueUpdateAttribute attribute;

    public BatchUpdateIssuesParam withId(List<String> id) {
        this.id = id;
        return this;
    }

    public BatchUpdateIssuesParam addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public BatchUpdateIssuesParam withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * **参数解释**： 需要更新的工作项ID数组，可通过[高级查询工作项](ListIssuesV4.xml)接口获取，响应消息体中的**id**字段的值就是工作项ID。 **约束限制**： 18~19位的数字字符串(工作项的**id**字段对应的字符串)。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public BatchUpdateIssuesParam withAttribute(IssueUpdateAttribute attribute) {
        this.attribute = attribute;
        return this;
    }

    public BatchUpdateIssuesParam withAttribute(Consumer<IssueUpdateAttribute> attributeSetter) {
        if (this.attribute == null) {
            this.attribute = new IssueUpdateAttribute();
            attributeSetter.accept(this.attribute);
        }

        return this;
    }

    /**
     * Get attribute
     * @return attribute
     */
    public IssueUpdateAttribute getAttribute() {
        return attribute;
    }

    public void setAttribute(IssueUpdateAttribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateIssuesParam that = (BatchUpdateIssuesParam) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.attribute, that.attribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attribute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateIssuesParam {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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
