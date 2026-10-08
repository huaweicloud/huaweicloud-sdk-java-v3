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
public class BatchDisassociateModelProxiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_details")

    private List<CoreModelProxyDetails> successDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_details")

    private List<CodeModelProxyFailedItem> failedDetails = null;

    public BatchDisassociateModelProxiesResponse withSuccessDetails(List<CoreModelProxyDetails> successDetails) {
        this.successDetails = successDetails;
        return this;
    }

    public BatchDisassociateModelProxiesResponse addSuccessDetailsItem(CoreModelProxyDetails successDetailsItem) {
        if (this.successDetails == null) {
            this.successDetails = new ArrayList<>();
        }
        this.successDetails.add(successDetailsItem);
        return this;
    }

    public BatchDisassociateModelProxiesResponse withSuccessDetails(
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

    public BatchDisassociateModelProxiesResponse withFailedDetails(List<CodeModelProxyFailedItem> failedDetails) {
        this.failedDetails = failedDetails;
        return this;
    }

    public BatchDisassociateModelProxiesResponse addFailedDetailsItem(CodeModelProxyFailedItem failedDetailsItem) {
        if (this.failedDetails == null) {
            this.failedDetails = new ArrayList<>();
        }
        this.failedDetails.add(failedDetailsItem);
        return this;
    }

    public BatchDisassociateModelProxiesResponse withFailedDetails(
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
        BatchDisassociateModelProxiesResponse that = (BatchDisassociateModelProxiesResponse) obj;
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
        sb.append("class BatchDisassociateModelProxiesResponse {\n");
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
