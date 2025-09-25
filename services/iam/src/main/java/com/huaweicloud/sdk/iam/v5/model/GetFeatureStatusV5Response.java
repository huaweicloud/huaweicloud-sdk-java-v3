package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class GetFeatureStatusV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_status")

    private FeatureStatus featureStatus;

    public GetFeatureStatusV5Response withFeatureStatus(FeatureStatus featureStatus) {
        this.featureStatus = featureStatus;
        return this;
    }

    /**
     * Get featureStatus
     * @return featureStatus
     */
    public FeatureStatus getFeatureStatus() {
        return featureStatus;
    }

    public void setFeatureStatus(FeatureStatus featureStatus) {
        this.featureStatus = featureStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetFeatureStatusV5Response that = (GetFeatureStatusV5Response) obj;
        return Objects.equals(this.featureStatus, that.featureStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(featureStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFeatureStatusV5Response {\n");
        sb.append("    featureStatus: ").append(toIndentedString(featureStatus)).append("\n");
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
