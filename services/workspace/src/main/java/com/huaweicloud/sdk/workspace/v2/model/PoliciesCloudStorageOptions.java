package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云存储设置项。
 */
public class PoliciesCloudStorageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_storage_rule")

    private String cloudStorageRule;

    public PoliciesCloudStorageOptions withCloudStorageRule(String cloudStorageRule) {
        this.cloudStorageRule = cloudStorageRule;
        return this;
    }

    /**
     * 挂盘路径。json格式，长度不能超过500000个字符。
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
        PoliciesCloudStorageOptions that = (PoliciesCloudStorageOptions) obj;
        return Objects.equals(this.cloudStorageRule, that.cloudStorageRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudStorageRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesCloudStorageOptions {\n");
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
