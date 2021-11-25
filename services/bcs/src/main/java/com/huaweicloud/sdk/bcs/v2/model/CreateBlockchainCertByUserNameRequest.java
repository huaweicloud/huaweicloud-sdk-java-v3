package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
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

    public CreateBlockchainCertByUserNameRequest withBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    /** blockchainID
     * 
     * @return blockchainId */
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

    /** peer组织名称
     * 
     * @return orgName */
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

    /** 用户名称，字符串长度4-24，必须包含a-z，0-9，以小写字母开头，以小写字母或者数字结尾
     * 
     * @return userName */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
            && Objects.equals(this.userName, createBlockchainCertByUserNameRequest.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockchainId, orgName, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBlockchainCertByUserNameRequest {\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
