package com.huaweicloud.sdk.secmaster.v1.model;

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
public class DisableAlertRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_list")

    private List<AlertRule> failList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_list")

    private List<AlertRule> successList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public DisableAlertRuleResponse withFailList(List<AlertRule> failList) {
        this.failList = failList;
        return this;
    }

    public DisableAlertRuleResponse addFailListItem(AlertRule failListItem) {
        if (this.failList == null) {
            this.failList = new ArrayList<>();
        }
        this.failList.add(failListItem);
        return this;
    }

    public DisableAlertRuleResponse withFailList(Consumer<List<AlertRule>> failListSetter) {
        if (this.failList == null) {
            this.failList = new ArrayList<>();
        }
        failListSetter.accept(this.failList);
        return this;
    }

    /**
     * 失败列表
     * @return failList
     */
    public List<AlertRule> getFailList() {
        return failList;
    }

    public void setFailList(List<AlertRule> failList) {
        this.failList = failList;
    }

    public DisableAlertRuleResponse withSuccessList(List<AlertRule> successList) {
        this.successList = successList;
        return this;
    }

    public DisableAlertRuleResponse addSuccessListItem(AlertRule successListItem) {
        if (this.successList == null) {
            this.successList = new ArrayList<>();
        }
        this.successList.add(successListItem);
        return this;
    }

    public DisableAlertRuleResponse withSuccessList(Consumer<List<AlertRule>> successListSetter) {
        if (this.successList == null) {
            this.successList = new ArrayList<>();
        }
        successListSetter.accept(this.successList);
        return this;
    }

    /**
     * 成功列表
     * @return successList
     */
    public List<AlertRule> getSuccessList() {
        return successList;
    }

    public void setSuccessList(List<AlertRule> successList) {
        this.successList = successList;
    }

    public DisableAlertRuleResponse withXRequestId(String xRequestId) {
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
        DisableAlertRuleResponse that = (DisableAlertRuleResponse) obj;
        return Objects.equals(this.failList, that.failList) && Objects.equals(this.successList, that.successList)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failList, successList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisableAlertRuleResponse {\n");
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
