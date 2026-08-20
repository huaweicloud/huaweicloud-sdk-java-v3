package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchBaselineIpdIssuesParam
 */
public class BatchBaselineIpdIssuesParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute")

    private BatchBaselineIpdIssuesParamAttribute attribute;

    public BatchBaselineIpdIssuesParam withId(List<String> id) {
        this.id = id;
        return this;
    }

    public BatchBaselineIpdIssuesParam addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public BatchBaselineIpdIssuesParam withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 需要基线的工作项ID数组。可以通过查询工作项列表或者查询树状工作项接口获取，响应消息体中的id字段的值就是工作项ID。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public BatchBaselineIpdIssuesParam withAttribute(BatchBaselineIpdIssuesParamAttribute attribute) {
        this.attribute = attribute;
        return this;
    }

    public BatchBaselineIpdIssuesParam withAttribute(Consumer<BatchBaselineIpdIssuesParamAttribute> attributeSetter) {
        if (this.attribute == null) {
            this.attribute = new BatchBaselineIpdIssuesParamAttribute();
            attributeSetter.accept(this.attribute);
        }

        return this;
    }

    /**
     * Get attribute
     * @return attribute
     */
    public BatchBaselineIpdIssuesParamAttribute getAttribute() {
        return attribute;
    }

    public void setAttribute(BatchBaselineIpdIssuesParamAttribute attribute) {
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
        BatchBaselineIpdIssuesParam that = (BatchBaselineIpdIssuesParam) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.attribute, that.attribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attribute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchBaselineIpdIssuesParam {\n");
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
