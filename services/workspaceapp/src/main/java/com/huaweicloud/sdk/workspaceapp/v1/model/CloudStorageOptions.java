package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云存储配置。
 */
public class CloudStorageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_storage_rule")

    private String cloudStorageRule;

    public CloudStorageOptions withCloudStorageRule(String cloudStorageRule) {
        this.cloudStorageRule = cloudStorageRule;
        return this;
    }

    /**
     * 配置项内容。
     * @return cloudStorageRule
     */
    public String getCloudStorageRule() {
        return cloudStorageRule;
    }

    public void setCloudStorageRule(String cloudStorageRule) {
        this.cloudStorageRule = cloudStorageRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudStorageOptions that = (CloudStorageOptions) obj;
        return Objects.equals(this.cloudStorageRule, that.cloudStorageRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudStorageRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudStorageOptions {\n");
        sb.append("    cloudStorageRule: ").append(toIndentedString(cloudStorageRule)).append("\n");
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
