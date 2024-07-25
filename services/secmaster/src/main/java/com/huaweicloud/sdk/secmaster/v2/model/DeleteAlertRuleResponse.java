package com.huaweicloud.sdk.secmaster.v2.model;

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
public class DeleteAlertRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private Boolean deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_list")

    private List<AlertRule> failList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_list")

    private List<AlertRule> successList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public DeleteAlertRuleResponse withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * 是否删除.
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public DeleteAlertRuleResponse withFailList(List<AlertRule> failList) {
        this.failList = failList;
        return this;
    }

    public DeleteAlertRuleResponse addFailListItem(AlertRule failListItem) {
        if (this.failList == null) {
            this.failList = new ArrayList<>();
        }
        this.failList.add(failListItem);
        return this;
    }

    public DeleteAlertRuleResponse withFailList(Consumer<List<AlertRule>> failListSetter) {
        if (this.failList == null) {
            this.failList = new ArrayList<>();
        }
        failListSetter.accept(this.failList);
        return this;
    }

    /**
     * Alert rule ID.
     * @return failList
     */
    public List<AlertRule> getFailList() {
        return failList;
    }

    public void setFailList(List<AlertRule> failList) {
        this.failList = failList;
    }

    public DeleteAlertRuleResponse withSuccessList(List<AlertRule> successList) {
        this.successList = successList;
        return this;
    }

    public DeleteAlertRuleResponse addSuccessListItem(AlertRule successListItem) {
        if (this.successList == null) {
            this.successList = new ArrayList<>();
        }
        this.successList.add(successListItem);
        return this;
    }

    public DeleteAlertRuleResponse withSuccessList(Consumer<List<AlertRule>> successListSetter) {
        if (this.successList == null) {
            this.successList = new ArrayList<>();
        }
        successListSetter.accept(this.successList);
        return this;
    }

    /**
     * Alert rule ID.
     * @return successList
     */
    public List<AlertRule> getSuccessList() {
        return successList;
    }

    public void setSuccessList(List<AlertRule> successList) {
        this.successList = successList;
    }

    public DeleteAlertRuleResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAlertRuleResponse that = (DeleteAlertRuleResponse) obj;
        return Objects.equals(this.deleted, that.deleted) && Objects.equals(this.failList, that.failList)
            && Objects.equals(this.successList, that.successList) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleted, failList, successList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAlertRuleResponse {\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    failList: ").append(toIndentedString(failList)).append("\n");
        sb.append("    successList: ").append(toIndentedString(successList)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
