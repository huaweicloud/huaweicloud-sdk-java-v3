package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** OBS（对象存储服务）配置，用于从 OBS 获取 OpenAPI 规范文档。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreGatewayObsConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    private String objectKey;

    public CoreGatewayObsConfiguration withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * **参数解释：** OBS 桶名称。 **约束限制：** 不涉及。 **取值范围：** 长度为 3-63 个字符，匹配单个小写字母或数字，或者以字母数字开头和结尾、中间可含1到61个小写字母/数字/点/短横线的字符串，符合正则条件^[a-z0-9]\\([a-z0-9.-]{1,61}[a-z0-9])?$。 **默认取值：** 不涉及。 
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public CoreGatewayObsConfiguration withObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    /**
     * **参数解释：** OBS 对象键名（文件路径）： - 示例：specs/petstore.yaml **约束限制：** 不涉及。 **取值范围：** 长度为 1-1024 个字符。 **默认取值：** 不涉及。 
     * @return objectKey
     */
    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayObsConfiguration that = (CoreGatewayObsConfiguration) obj;
        return Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.objectKey, that.objectKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, objectKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayObsConfiguration {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
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
