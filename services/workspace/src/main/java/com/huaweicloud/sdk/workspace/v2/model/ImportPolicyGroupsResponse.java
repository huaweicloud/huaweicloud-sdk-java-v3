package com.huaweicloud.sdk.workspace.v2.model;

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
public class ImportPolicyGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoded_authorization_message")

    private String encodedAuthorizationMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_name_list")

    private List<PolicyGroupNameInfo> policyGroupNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_policy_group_name_list")

    private List<PolicyGroupNameInfo> failedPolicyGroupNameList = null;

    public ImportPolicyGroupsResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ImportPolicyGroupsResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ImportPolicyGroupsResponse withEncodedAuthorizationMessage(String encodedAuthorizationMessage) {
        this.encodedAuthorizationMessage = encodedAuthorizationMessage;
        return this;
    }

    /**
     * 加密后的详细拒绝原因，用户可以自行调用STS服务的decode-authorization-message接口进行解密。
     * @return encodedAuthorizationMessage
     */
    public String getEncodedAuthorizationMessage() {
        return encodedAuthorizationMessage;
    }

    public void setEncodedAuthorizationMessage(String encodedAuthorizationMessage) {
        this.encodedAuthorizationMessage = encodedAuthorizationMessage;
    }

    public ImportPolicyGroupsResponse withPolicyGroupNameList(List<PolicyGroupNameInfo> policyGroupNameList) {
        this.policyGroupNameList = policyGroupNameList;
        return this;
    }

    public ImportPolicyGroupsResponse addPolicyGroupNameListItem(PolicyGroupNameInfo policyGroupNameListItem) {
        if (this.policyGroupNameList == null) {
            this.policyGroupNameList = new ArrayList<>();
        }
        this.policyGroupNameList.add(policyGroupNameListItem);
        return this;
    }

    public ImportPolicyGroupsResponse withPolicyGroupNameList(
        Consumer<List<PolicyGroupNameInfo>> policyGroupNameListSetter) {
        if (this.policyGroupNameList == null) {
            this.policyGroupNameList = new ArrayList<>();
        }
        policyGroupNameListSetter.accept(this.policyGroupNameList);
        return this;
    }

    /**
     * 导入策略组所有名字列表。
     * @return policyGroupNameList
     */
    public List<PolicyGroupNameInfo> getPolicyGroupNameList() {
        return policyGroupNameList;
    }

    public void setPolicyGroupNameList(List<PolicyGroupNameInfo> policyGroupNameList) {
        this.policyGroupNameList = policyGroupNameList;
    }

    public ImportPolicyGroupsResponse withFailedPolicyGroupNameList(
        List<PolicyGroupNameInfo> failedPolicyGroupNameList) {
        this.failedPolicyGroupNameList = failedPolicyGroupNameList;
        return this;
    }

    public ImportPolicyGroupsResponse addFailedPolicyGroupNameListItem(
        PolicyGroupNameInfo failedPolicyGroupNameListItem) {
        if (this.failedPolicyGroupNameList == null) {
            this.failedPolicyGroupNameList = new ArrayList<>();
        }
        this.failedPolicyGroupNameList.add(failedPolicyGroupNameListItem);
        return this;
    }

    public ImportPolicyGroupsResponse withFailedPolicyGroupNameList(
        Consumer<List<PolicyGroupNameInfo>> failedPolicyGroupNameListSetter) {
        if (this.failedPolicyGroupNameList == null) {
            this.failedPolicyGroupNameList = new ArrayList<>();
        }
        failedPolicyGroupNameListSetter.accept(this.failedPolicyGroupNameList);
        return this;
    }

    /**
     * 导入策略组失败名字列表。
     * @return failedPolicyGroupNameList
     */
    public List<PolicyGroupNameInfo> getFailedPolicyGroupNameList() {
        return failedPolicyGroupNameList;
    }

    public void setFailedPolicyGroupNameList(List<PolicyGroupNameInfo> failedPolicyGroupNameList) {
        this.failedPolicyGroupNameList = failedPolicyGroupNameList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportPolicyGroupsResponse that = (ImportPolicyGroupsResponse) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.encodedAuthorizationMessage, that.encodedAuthorizationMessage)
            && Objects.equals(this.policyGroupNameList, that.policyGroupNameList)
            && Objects.equals(this.failedPolicyGroupNameList, that.failedPolicyGroupNameList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(errorCode, errorMsg, encodedAuthorizationMessage, policyGroupNameList, failedPolicyGroupNameList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportPolicyGroupsResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    encodedAuthorizationMessage: ")
            .append(toIndentedString(encodedAuthorizationMessage))
            .append("\n");
        sb.append("    policyGroupNameList: ").append(toIndentedString(policyGroupNameList)).append("\n");
        sb.append("    failedPolicyGroupNameList: ").append(toIndentedString(failedPolicyGroupNameList)).append("\n");
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
