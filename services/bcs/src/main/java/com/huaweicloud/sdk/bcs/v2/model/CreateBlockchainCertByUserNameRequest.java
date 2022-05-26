package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateBlockchainCertByUserNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockchain_id")

    private String blockchainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_name")

    private String orgName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateBlockchainCertByUserNameRequestBody body;

    public CreateBlockchainCertByUserNameRequest withBlockchainId(String blockchainId) {
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

    public CreateBlockchainCertByUserNameRequest withOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

    /**
     * peer组织名称
     * @return orgName
     */
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public CreateBlockchainCertByUserNameRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称，字符串长度4-24，仅支持小写字母和数字，以小写字母开头
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateBlockchainCertByUserNameRequest withBody(CreateBlockchainCertByUserNameRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateBlockchainCertByUserNameRequest withBody(
        Consumer<CreateBlockchainCertByUserNameRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateBlockchainCertByUserNameRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateBlockchainCertByUserNameRequestBody getBody() {
        return body;
    }

    public void setBody(CreateBlockchainCertByUserNameRequestBody body) {
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
        CreateBlockchainCertByUserNameRequest createBlockchainCertByUserNameRequest =
            (CreateBlockchainCertByUserNameRequest) o;
        return Objects.equals(this.blockchainId, createBlockchainCertByUserNameRequest.blockchainId)
            && Objects.equals(this.orgName, createBlockchainCertByUserNameRequest.orgName)
            && Objects.equals(this.userName, createBlockchainCertByUserNameRequest.userName)
            && Objects.equals(this.body, createBlockchainCertByUserNameRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockchainId, orgName, userName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBlockchainCertByUserNameRequest {\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
