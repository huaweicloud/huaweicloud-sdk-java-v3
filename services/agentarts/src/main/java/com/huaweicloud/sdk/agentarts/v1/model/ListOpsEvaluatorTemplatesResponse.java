package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListOpsEvaluatorTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_templates")

    private List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates> evaluatorTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    private Integer pageNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_pages")

    private Long totalPages;

    public ListOpsEvaluatorTemplatesResponse withEvaluatorTemplates(
        List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates> evaluatorTemplates) {
        this.evaluatorTemplates = evaluatorTemplates;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponse addEvaluatorTemplatesItem(
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates evaluatorTemplatesItem) {
        if (this.evaluatorTemplates == null) {
            this.evaluatorTemplates = new ArrayList<>();
        }
        this.evaluatorTemplates.add(evaluatorTemplatesItem);
        return this;
    }

    public ListOpsEvaluatorTemplatesResponse withEvaluatorTemplates(
        Consumer<List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates>> evaluatorTemplatesSetter) {
        if (this.evaluatorTemplates == null) {
            this.evaluatorTemplates = new ArrayList<>();
        }
        evaluatorTemplatesSetter.accept(this.evaluatorTemplates);
        return this;
    }

    /**
     * **参数解释：** 评估器模板列表包含获取到的所有符合条件的评估器模板数据，用于展示和选择。 **取值范围：** 评估器模板对象数组。 
     * @return evaluatorTemplates
     */
    public List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates> getEvaluatorTemplates() {
        return evaluatorTemplates;
    }

    public void setEvaluatorTemplates(
        List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates> evaluatorTemplates) {
        this.evaluatorTemplates = evaluatorTemplates;
    }

    public ListOpsEvaluatorTemplatesResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 符合条件的模板总数。 **取值范围：** 0到2,147,483,647。 
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListOpsEvaluatorTemplatesResponse withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释：** API执行状态码。 **取值范围：** 32位整数。 
     * minimum: 0
     * maximum: 2147483647
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ListOpsEvaluatorTemplatesResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * **参数解释：** 响应状态描述信息。 **取值范围：** 不涉及。 
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ListOpsEvaluatorTemplatesResponse withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * **参数解释：** 当前页码。 **约束限制：** 不涉及。 **取值范围：** 正整数。 
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public ListOpsEvaluatorTemplatesResponse withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * **参数解释：** 每页返回的记录条数。 **约束限制：** 不涉及。 **取值范围：** 1~100。 
     * minimum: 1
     * maximum: 100
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListOpsEvaluatorTemplatesResponse withTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * **参数解释：** 总页数。 **约束限制：** 不涉及。 **取值范围：** 非负整数。 
     * @return totalPages
     */
    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorTemplatesResponse that = (ListOpsEvaluatorTemplatesResponse) obj;
        return Objects.equals(this.evaluatorTemplates, that.evaluatorTemplates)
            && Objects.equals(this.total, that.total) && Objects.equals(this.code, that.code)
            && Objects.equals(this.msg, that.msg) && Objects.equals(this.pageNumber, that.pageNumber)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.totalPages, that.totalPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorTemplates, total, code, msg, pageNumber, pageSize, totalPages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorTemplatesResponse {\n");
        sb.append("    evaluatorTemplates: ").append(toIndentedString(evaluatorTemplates)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
