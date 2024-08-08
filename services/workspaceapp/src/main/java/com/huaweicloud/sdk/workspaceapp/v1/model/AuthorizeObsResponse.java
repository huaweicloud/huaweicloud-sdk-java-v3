package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AuthorizeObsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_end_point")

    private String serverEndPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    private String sk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_at")

    private String expiresAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private Policy policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_token")

    private String securityToken;

    public AuthorizeObsResponse withServerEndPoint(String serverEndPoint) {
        this.serverEndPoint = serverEndPoint;
        return this;
    }

    /**
     * 访问的服务终端节点。
     * @return serverEndPoint
     */
    public String getServerEndPoint() {
        return serverEndPoint;
    }

    public void setServerEndPoint(String serverEndPoint) {
        this.serverEndPoint = serverEndPoint;
    }

    public AuthorizeObsResponse withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 存放的桶名称。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public AuthorizeObsResponse withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * 存放目录。
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public AuthorizeObsResponse withAk(String ak) {
        this.ak = ak;
        return this;
    }

    /**
     * 获取的AK。。
     * @return ak
     */
    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public AuthorizeObsResponse withSk(String sk) {
        this.sk = sk;
        return this;
    }

    /**
     * 获取的SK。
     * @return sk
     */
    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public AuthorizeObsResponse withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * AK/SK和securitytoken的过期时间。。
     * @return expiresAt
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public AuthorizeObsResponse withPolicy(Policy policy) {
        this.policy = policy;
        return this;
    }

    public AuthorizeObsResponse withPolicy(Consumer<Policy> policySetter) {
        if (this.policy == null) {
            this.policy = new Policy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public AuthorizeObsResponse withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * 安全校验token，将所获的AK、SK等信息进行加密后的字符串。
     * @return securityToken
     */
    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizeObsResponse that = (AuthorizeObsResponse) obj;
        return Objects.equals(this.serverEndPoint, that.serverEndPoint)
            && Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.ak, that.ak) && Objects.equals(this.sk, that.sk)
            && Objects.equals(this.expiresAt, that.expiresAt) && Objects.equals(this.policy, that.policy)
            && Objects.equals(this.securityToken, that.securityToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverEndPoint, bucketName, directory, ak, sk, expiresAt, policy, securityToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizeObsResponse {\n");
        sb.append("    serverEndPoint: ").append(toIndentedString(serverEndPoint)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
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
