package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateBucketCredentialResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_end_point")

    private String serverEndPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_path")

    private String objectPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private ObsPolicy policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential")

    private ObsCredential credential;

    public CreateBucketCredentialResponse withServerEndPoint(String serverEndPoint) {
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

    public CreateBucketCredentialResponse withBucketName(String bucketName) {
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

    public CreateBucketCredentialResponse withObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }

    /**
     * OBS对象路径。 注: path是对象在obs中的完整路径。 例如桶存在如下目录结构的数据。   Bucket:     ├─dir1     | ├─object1.txt     | └─object2.txt     └─object3.txt Object1的path: dir1/object1.txt Object2的path: dir1/object2.txt Object3的path: object3.txt
     * @return objectPath
     */
    public String getObjectPath() {
        return objectPath;
    }

    public void setObjectPath(String objectPath) {
        this.objectPath = objectPath;
    }

    public CreateBucketCredentialResponse withPolicy(ObsPolicy policy) {
        this.policy = policy;
        return this;
    }

    public CreateBucketCredentialResponse withPolicy(Consumer<ObsPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new ObsPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public ObsPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(ObsPolicy policy) {
        this.policy = policy;
    }

    public CreateBucketCredentialResponse withCredential(ObsCredential credential) {
        this.credential = credential;
        return this;
    }

    public CreateBucketCredentialResponse withCredential(Consumer<ObsCredential> credentialSetter) {
        if (this.credential == null) {
            this.credential = new ObsCredential();
            credentialSetter.accept(this.credential);
        }

        return this;
    }

    /**
     * Get credential
     * @return credential
     */
    public ObsCredential getCredential() {
        return credential;
    }

    public void setCredential(ObsCredential credential) {
        this.credential = credential;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBucketCredentialResponse that = (CreateBucketCredentialResponse) obj;
        return Objects.equals(this.serverEndPoint, that.serverEndPoint)
            && Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.objectPath, that.objectPath)
            && Objects.equals(this.policy, that.policy) && Objects.equals(this.credential, that.credential);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverEndPoint, bucketName, objectPath, policy, credential);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBucketCredentialResponse {\n");
        sb.append("    serverEndPoint: ").append(toIndentedString(serverEndPoint)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectPath: ").append(toIndentedString(objectPath)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
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
