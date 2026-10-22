package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：OBS存储配置。
 */
public class AuraV2ObsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    public AuraV2ObsConfig withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * **参数解释**：OBS桶名称。 **约束限制**：不涉及。 **取值范围**：长度为3~63个字符，支持小写字母、数字、中划线和句点的组合。 **默认取值**：不涉及。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuraV2ObsConfig that = (AuraV2ObsConfig) obj;
        return Objects.equals(this.bucketName, that.bucketName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuraV2ObsConfig {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
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
