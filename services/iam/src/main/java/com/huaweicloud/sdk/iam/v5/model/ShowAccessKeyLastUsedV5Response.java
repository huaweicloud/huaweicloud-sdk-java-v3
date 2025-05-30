package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAccessKeyLastUsedV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key_last_used")

    private AccessKeyLastUsed accessKeyLastUsed;

    public ShowAccessKeyLastUsedV5Response withAccessKeyLastUsed(AccessKeyLastUsed accessKeyLastUsed) {
        this.accessKeyLastUsed = accessKeyLastUsed;
        return this;
    }

    public ShowAccessKeyLastUsedV5Response withAccessKeyLastUsed(Consumer<AccessKeyLastUsed> accessKeyLastUsedSetter) {
        if (this.accessKeyLastUsed == null) {
            this.accessKeyLastUsed = new AccessKeyLastUsed();
            accessKeyLastUsedSetter.accept(this.accessKeyLastUsed);
        }

        return this;
    }

    /**
     * Get accessKeyLastUsed
     * @return accessKeyLastUsed
     */
    public AccessKeyLastUsed getAccessKeyLastUsed() {
        return accessKeyLastUsed;
    }

    public void setAccessKeyLastUsed(AccessKeyLastUsed accessKeyLastUsed) {
        this.accessKeyLastUsed = accessKeyLastUsed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAccessKeyLastUsedV5Response that = (ShowAccessKeyLastUsedV5Response) obj;
        return Objects.equals(this.accessKeyLastUsed, that.accessKeyLastUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeyLastUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAccessKeyLastUsedV5Response {\n");
        sb.append("    accessKeyLastUsed: ").append(toIndentedString(accessKeyLastUsed)).append("\n");
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
