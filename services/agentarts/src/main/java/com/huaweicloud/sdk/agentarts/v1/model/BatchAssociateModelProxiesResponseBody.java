package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 批量操作模型代理的请求体。 **取值范围：** 不涉及。 
 */
public class BatchAssociateModelProxiesResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_details")

    private List<CoreModelProxyDetails> successDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_details")

    private List<CodeModelProxyFailedItem> failedDetails = null;

    public BatchAssociateModelProxiesResponseBody withSuccessDetails(List<CoreModelProxyDetails> successDetails) {
        this.successDetails = successDetails;
        return this;
    }

    public BatchAssociateModelProxiesResponseBody addSuccessDetailsItem(CoreModelProxyDetails successDetailsItem) {
        if (this.successDetails == null) {
            this.successDetails = new ArrayList<>();
        }
        this.successDetails.add(successDetailsItem);
        return this;
    }

    public BatchAssociateModelProxiesResponseBody withSuccessDetails(
        Consumer<List<CoreModelProxyDetails>> successDetailsSetter) {
        if (this.successDetails == null) {
            this.successDetails = new ArrayList<>();
        }
        successDetailsSetter.accept(this.successDetails);
        return this;
    }

    /**
     * **参数解释：** 成功详情。 **取值范围：** 不涉及。 
     * @return successDetails
     */
    public List<CoreModelProxyDetails> getSuccessDetails() {
        return successDetails;
    }

    public void setSuccessDetails(List<CoreModelProxyDetails> successDetails) {
        this.successDetails = successDetails;
    }

    public BatchAssociateModelProxiesResponseBody withFailedDetails(List<CodeModelProxyFailedItem> failedDetails) {
        this.failedDetails = failedDetails;
        return this;
    }

    public BatchAssociateModelProxiesResponseBody addFailedDetailsItem(CodeModelProxyFailedItem failedDetailsItem) {
        if (this.failedDetails == null) {
            this.failedDetails = new ArrayList<>();
        }
        this.failedDetails.add(failedDetailsItem);
        return this;
    }

    public BatchAssociateModelProxiesResponseBody withFailedDetails(
        Consumer<List<CodeModelProxyFailedItem>> failedDetailsSetter) {
        if (this.failedDetails == null) {
            this.failedDetails = new ArrayList<>();
        }
        failedDetailsSetter.accept(this.failedDetails);
        return this;
    }

    /**
     * **参数解释：** 失败详情。 **取值范围：** 不涉及。 
     * @return failedDetails
     */
    public List<CodeModelProxyFailedItem> getFailedDetails() {
        return failedDetails;
    }

    public void setFailedDetails(List<CodeModelProxyFailedItem> failedDetails) {
        this.failedDetails = failedDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAssociateModelProxiesResponseBody that = (BatchAssociateModelProxiesResponseBody) obj;
        return Objects.equals(this.successDetails, that.successDetails)
            && Objects.equals(this.failedDetails, that.failedDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successDetails, failedDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAssociateModelProxiesResponseBody {\n");
        sb.append("    successDetails: ").append(toIndentedString(successDetails)).append("\n");
        sb.append("    failedDetails: ").append(toIndentedString(failedDetails)).append("\n");
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
