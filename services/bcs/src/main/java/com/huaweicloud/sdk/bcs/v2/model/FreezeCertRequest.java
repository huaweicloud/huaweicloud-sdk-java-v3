package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class FreezeCertRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockchain_id")

    private String blockchainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_name")

    private String orgName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private FreezeCertRequestBody body;

    public FreezeCertRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * userName
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public FreezeCertRequest withBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    /**
     * blockchainID
     * @return blockchainId
     */
    public String getBlockchainId() {
        return blockchainId;
    }

    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    public FreezeCertRequest withOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

    /**
     * orgName
     * @return orgName
     */
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public FreezeCertRequest withBody(FreezeCertRequestBody body) {
        this.body = body;
        return this;
    }

    public FreezeCertRequest withBody(Consumer<FreezeCertRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new FreezeCertRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public FreezeCertRequestBody getBody() {
        return body;
    }

    public void setBody(FreezeCertRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FreezeCertRequest freezeCertRequest = (FreezeCertRequest) o;
        return Objects.equals(this.userName, freezeCertRequest.userName)
            && Objects.equals(this.blockchainId, freezeCertRequest.blockchainId)
            && Objects.equals(this.orgName, freezeCertRequest.orgName)
            && Objects.equals(this.body, freezeCertRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, blockchainId, orgName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FreezeCertRequest {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
