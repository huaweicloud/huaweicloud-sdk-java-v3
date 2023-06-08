package com.huaweicloud.sdk.eds.v1.model;

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
public class ShowContractResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contract_name")

    private String contractName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contract_description")

    private String contractDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_connector_id")

    private String ownerConnectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_connector_name")

    private String ownerConnectorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribe_connector_id")

    private String subscribeConnectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribe_connector_name")

    private String subscribeConnectorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriber_name")

    private String subscriberName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriber_id")

    private String subscriberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_id")

    private String approverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_name")

    private String approverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offer_id")

    private String offerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offer_name")

    private String offerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_control_policies")

    private List<UseControlPoliciesInner> useControlPolicies = null;

    public ShowContractResponse withContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }

    /**
     * 合约名称
     * @return contractName
     */
    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public ShowContractResponse withContractDescription(String contractDescription) {
        this.contractDescription = contractDescription;
        return this;
    }

    /**
     * 合约描述
     * @return contractDescription
     */
    public String getContractDescription() {
        return contractDescription;
    }

    public void setContractDescription(String contractDescription) {
        this.contractDescription = contractDescription;
    }

    public ShowContractResponse withOwnerConnectorId(String ownerConnectorId) {
        this.ownerConnectorId = ownerConnectorId;
        return this;
    }

    /**
     * 提供者连接器ID
     * @return ownerConnectorId
     */
    public String getOwnerConnectorId() {
        return ownerConnectorId;
    }

    public void setOwnerConnectorId(String ownerConnectorId) {
        this.ownerConnectorId = ownerConnectorId;
    }

    public ShowContractResponse withOwnerConnectorName(String ownerConnectorName) {
        this.ownerConnectorName = ownerConnectorName;
        return this;
    }

    /**
     * 提供者连接器名称
     * @return ownerConnectorName
     */
    public String getOwnerConnectorName() {
        return ownerConnectorName;
    }

    public void setOwnerConnectorName(String ownerConnectorName) {
        this.ownerConnectorName = ownerConnectorName;
    }

    public ShowContractResponse withSubscribeConnectorId(String subscribeConnectorId) {
        this.subscribeConnectorId = subscribeConnectorId;
        return this;
    }

    /**
     * 订阅连接器ID
     * @return subscribeConnectorId
     */
    public String getSubscribeConnectorId() {
        return subscribeConnectorId;
    }

    public void setSubscribeConnectorId(String subscribeConnectorId) {
        this.subscribeConnectorId = subscribeConnectorId;
    }

    public ShowContractResponse withSubscribeConnectorName(String subscribeConnectorName) {
        this.subscribeConnectorName = subscribeConnectorName;
        return this;
    }

    /**
     * 订阅连接器名称
     * @return subscribeConnectorName
     */
    public String getSubscribeConnectorName() {
        return subscribeConnectorName;
    }

    public void setSubscribeConnectorName(String subscribeConnectorName) {
        this.subscribeConnectorName = subscribeConnectorName;
    }

    public ShowContractResponse withSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
        return this;
    }

    /**
     * 订阅人名称
     * @return subscriberName
     */
    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public ShowContractResponse withSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
        return this;
    }

    /**
     * 订阅人id
     * @return subscriberId
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public ShowContractResponse withApproverId(String approverId) {
        this.approverId = approverId;
        return this;
    }

    /**
     * 审批人ID
     * @return approverId
     */
    public String getApproverId() {
        return approverId;
    }

    public void setApproverId(String approverId) {
        this.approverId = approverId;
    }

    public ShowContractResponse withApproverName(String approverName) {
        this.approverName = approverName;
        return this;
    }

    /**
     * 审批人名称
     * @return approverName
     */
    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }

    public ShowContractResponse withOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    /**
     * offer ID
     * @return offerId
     */
    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public ShowContractResponse withOfferName(String offerName) {
        this.offerName = offerName;
        return this;
    }

    /**
     * offer 名称
     * @return offerName
     */
    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public ShowContractResponse withUseControlPolicies(List<UseControlPoliciesInner> useControlPolicies) {
        this.useControlPolicies = useControlPolicies;
        return this;
    }

    public ShowContractResponse addUseControlPoliciesItem(UseControlPoliciesInner useControlPoliciesItem) {
        if (this.useControlPolicies == null) {
            this.useControlPolicies = new ArrayList<>();
        }
        this.useControlPolicies.add(useControlPoliciesItem);
        return this;
    }

    public ShowContractResponse withUseControlPolicies(
        Consumer<List<UseControlPoliciesInner>> useControlPoliciesSetter) {
        if (this.useControlPolicies == null) {
            this.useControlPolicies = new ArrayList<>();
        }
        useControlPoliciesSetter.accept(this.useControlPolicies);
        return this;
    }

    /**
     * 合约使用控制策略列表
     * @return useControlPolicies
     */
    public List<UseControlPoliciesInner> getUseControlPolicies() {
        return useControlPolicies;
    }

    public void setUseControlPolicies(List<UseControlPoliciesInner> useControlPolicies) {
        this.useControlPolicies = useControlPolicies;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowContractResponse showContractResponse = (ShowContractResponse) o;
        return Objects.equals(this.contractName, showContractResponse.contractName)
            && Objects.equals(this.contractDescription, showContractResponse.contractDescription)
            && Objects.equals(this.ownerConnectorId, showContractResponse.ownerConnectorId)
            && Objects.equals(this.ownerConnectorName, showContractResponse.ownerConnectorName)
            && Objects.equals(this.subscribeConnectorId, showContractResponse.subscribeConnectorId)
            && Objects.equals(this.subscribeConnectorName, showContractResponse.subscribeConnectorName)
            && Objects.equals(this.subscriberName, showContractResponse.subscriberName)
            && Objects.equals(this.subscriberId, showContractResponse.subscriberId)
            && Objects.equals(this.approverId, showContractResponse.approverId)
            && Objects.equals(this.approverName, showContractResponse.approverName)
            && Objects.equals(this.offerId, showContractResponse.offerId)
            && Objects.equals(this.offerName, showContractResponse.offerName)
            && Objects.equals(this.useControlPolicies, showContractResponse.useControlPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractName,
            contractDescription,
            ownerConnectorId,
            ownerConnectorName,
            subscribeConnectorId,
            subscribeConnectorName,
            subscriberName,
            subscriberId,
            approverId,
            approverName,
            offerId,
            offerName,
            useControlPolicies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowContractResponse {\n");
        sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
        sb.append("    contractDescription: ").append(toIndentedString(contractDescription)).append("\n");
        sb.append("    ownerConnectorId: ").append(toIndentedString(ownerConnectorId)).append("\n");
        sb.append("    ownerConnectorName: ").append(toIndentedString(ownerConnectorName)).append("\n");
        sb.append("    subscribeConnectorId: ").append(toIndentedString(subscribeConnectorId)).append("\n");
        sb.append("    subscribeConnectorName: ").append(toIndentedString(subscribeConnectorName)).append("\n");
        sb.append("    subscriberName: ").append(toIndentedString(subscriberName)).append("\n");
        sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
        sb.append("    approverId: ").append(toIndentedString(approverId)).append("\n");
        sb.append("    approverName: ").append(toIndentedString(approverName)).append("\n");
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
        sb.append("    useControlPolicies: ").append(toIndentedString(useControlPolicies)).append("\n");
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
