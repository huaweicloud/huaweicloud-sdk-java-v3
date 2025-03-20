package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateAccessKeyV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    private AccessKeyMetadata accessKey;

    public UpdateAccessKeyV5Response withAccessKey(AccessKeyMetadata accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public UpdateAccessKeyV5Response withAccessKey(Consumer<AccessKeyMetadata> accessKeySetter) {
        if (this.accessKey == null) {
            this.accessKey = new AccessKeyMetadata();
            accessKeySetter.accept(this.accessKey);
        }

        return this;
    }

    /**
     * Get accessKey
     * @return accessKey
     */
    public AccessKeyMetadata getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(AccessKeyMetadata accessKey) {
        this.accessKey = accessKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAccessKeyV5Response that = (UpdateAccessKeyV5Response) obj;
        return Objects.equals(this.accessKey, that.accessKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccessKeyV5Response {\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
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
