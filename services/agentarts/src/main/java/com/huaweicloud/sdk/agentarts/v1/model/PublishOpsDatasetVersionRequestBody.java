package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 发布评测集新版本的请求体。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class PublishOpsDatasetVersionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    private String versionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public PublishOpsDatasetVersionRequestBody withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * **参数解释：** 用户定义的版本标签或编号。 **约束限制：** 建议长度不超过 100 字符。 **取值范围：** 字符串，如 \"v1.0\"、\"20240413_test\"。 **默认取值：** 不涉及。 
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public PublishOpsDatasetVersionRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 该版本的变更摘要或备注信息。 **约束限制：** 可选参数；长度0到200字符。 **取值范围：** 中英文及常见符号。 **默认取值：** 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublishOpsDatasetVersionRequestBody that = (PublishOpsDatasetVersionRequestBody) obj;
        return Objects.equals(this.versionName, that.versionName) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionName, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishOpsDatasetVersionRequestBody {\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
