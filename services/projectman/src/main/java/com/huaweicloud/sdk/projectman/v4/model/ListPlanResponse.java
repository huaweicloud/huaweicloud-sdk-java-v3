package com.huaweicloud.sdk.projectman.v4.model;

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
public class ListPlanResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<PlanResponseResult> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private PlanListResponsePage page;

    public ListPlanResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 返回状态。 **取值范围**： - success：查询计划列表成功 - error：查询计划列表失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListPlanResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**： 提示信息。 **取值范围**： 不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListPlanResponse withResult(List<PlanResponseResult> result) {
        this.result = result;
        return this;
    }

    public ListPlanResponse addResultItem(PlanResponseResult resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ListPlanResponse withResult(Consumer<List<PlanResponseResult>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * **参数解释**： 计划列表，包含发布及其子迭代的完整信息。
     * @return result
     */
    public List<PlanResponseResult> getResult() {
        return result;
    }

    public void setResult(List<PlanResponseResult> result) {
        this.result = result;
    }

    public ListPlanResponse withPage(PlanListResponsePage page) {
        this.page = page;
        return this;
    }

    public ListPlanResponse withPage(Consumer<PlanListResponsePage> pageSetter) {
        if (this.page == null) {
            this.page = new PlanListResponsePage();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public PlanListResponsePage getPage() {
        return page;
    }

    public void setPage(PlanListResponsePage page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPlanResponse that = (ListPlanResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.message, that.message)
            && Objects.equals(this.result, that.result) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, message, result, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPlanResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
