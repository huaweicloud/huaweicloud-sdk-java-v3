package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：OBS存储配置。 **约束限制**：不涉及。
 */
public class ObsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    public ObsConfig withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * **参数解释**：OBS桶名称。该桶的类型必须是并行文件系统。 **约束限制**：不涉及。 **取值范围**：长度为3~63个字符，支持小写字母、数字、中划线和句点的组合。 **默认取值**：不涉及。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ObsConfig withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释**：委托名称。云服务将使用该委托操作OBS桶。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObsConfig that = (ObsConfig) obj;
        return Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.agencyName, that.agencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, agencyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsConfig {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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
