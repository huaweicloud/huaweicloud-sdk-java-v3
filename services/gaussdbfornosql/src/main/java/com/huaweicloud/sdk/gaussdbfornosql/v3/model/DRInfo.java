package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 容灾信息。 **约束限制：** 创建容灾实例时必传。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class DRInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_id")

    private String sourceInstanceId;

    public DRInfo withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /**
     * **参数解释：** 容灾源实例ID。可以调用查询实例列表和详情-QueryingInstancesandDetails接口获取。 **约束限制：** - 创建容灾实例时该参数必传，表示为该源实例创建容灾实例。 - 源实例为GeminiDB Cassandra实例。 - 源实例状态为正常。 - 传该参数时，Datastore的type参数的值必须为“cassandra”。 - 一个源实例只能有一个容灾实例。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DRInfo that = (DRInfo) obj;
        return Objects.equals(this.sourceInstanceId, that.sourceInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DRInfo {\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
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
