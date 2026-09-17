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
public class AssociateScrumIssueResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<AssociateIssueDetail> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public AssociateScrumIssueResponse withResult(List<AssociateIssueDetail> result) {
        this.result = result;
        return this;
    }

    public AssociateScrumIssueResponse addResultItem(AssociateIssueDetail resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public AssociateScrumIssueResponse withResult(Consumer<List<AssociateIssueDetail>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * **参数解释**： 本次新增的关联关系记录列表,每个元素对应一条关联关系。
     * @return result
     */
    public List<AssociateIssueDetail> getResult() {
        return result;
    }

    public void setResult(List<AssociateIssueDetail> result) {
        this.result = result;
    }

    public AssociateScrumIssueResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 接口整体响应状态。 **取值范围**： - success：关联工作项成功。 - error：关联工作项失败,详见错误码说明。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateScrumIssueResponse that = (AssociateScrumIssueResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateScrumIssueResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
