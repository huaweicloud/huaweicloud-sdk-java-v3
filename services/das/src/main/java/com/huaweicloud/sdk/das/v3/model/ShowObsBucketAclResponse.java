package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowObsBucketAclResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_risk")

    private String bucketRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_acl")

    private String obsAcl;

    public ShowObsBucketAclResponse withBucketRisk(String bucketRisk) {
        this.bucketRisk = bucketRisk;
        return this;
    }

    /**
     * 桶风险
     * @return bucketRisk
     */
    public String getBucketRisk() {
        return bucketRisk;
    }

    public void setBucketRisk(String bucketRisk) {
        this.bucketRisk = bucketRisk;
    }

    public ShowObsBucketAclResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowObsBucketAclResponse withObsAcl(String obsAcl) {
        this.obsAcl = obsAcl;
        return this;
    }

    /**
     * 桶ACL
     * @return obsAcl
     */
    public String getObsAcl() {
        return obsAcl;
    }

    public void setObsAcl(String obsAcl) {
        this.obsAcl = obsAcl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowObsBucketAclResponse that = (ShowObsBucketAclResponse) obj;
        return Objects.equals(this.bucketRisk, that.bucketRisk) && Objects.equals(this.message, that.message)
            && Objects.equals(this.obsAcl, that.obsAcl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketRisk, message, obsAcl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowObsBucketAclResponse {\n");
        sb.append("    bucketRisk: ").append(toIndentedString(bucketRisk)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    obsAcl: ").append(toIndentedString(obsAcl)).append("\n");
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
