package com.huaweicloud.sdk.eds.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CancelContractResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contract_id")

    private String contractId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contract_name")

    private String contractName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private String resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_description")

    private String resultDescription;

    public CancelContractResponse withContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }

    /**
     * 合约ID
     * @return contractId
     */
    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public CancelContractResponse withContractName(String contractName) {
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

    public CancelContractResponse withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 合约操作结果返回码
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public CancelContractResponse withResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
        return this;
    }

    /**
     * 合约操作结果描述
     * @return resultDescription
     */
    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CancelContractResponse cancelContractResponse = (CancelContractResponse) o;
        return Objects.equals(this.contractId, cancelContractResponse.contractId)
            && Objects.equals(this.contractName, cancelContractResponse.contractName)
            && Objects.equals(this.resultCode, cancelContractResponse.resultCode)
            && Objects.equals(this.resultDescription, cancelContractResponse.resultDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractId, contractName, resultCode, resultDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelContractResponse {\n");
        sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
        sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    resultDescription: ").append(toIndentedString(resultDescription)).append("\n");
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
