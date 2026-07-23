package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueryDocParamDto
 */
public class QueryDocParamDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public QueryDocParamDto withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释：**  实例ID，用于筛选与指定数据模型实例关联的结构化文档。 例如查询某产品实例下的所有设计文档。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public QueryDocParamDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：**  文档类型，用于筛选指定类型的结构化文档。  **约束限制：**  不涉及。  **取值范围：**  - directory：目录，用于组织和管理文档层级结构。 - pageDocument：Page文档，适用于富文本编辑场景，如设计说明书、技术文档等。 - boardDocument：Board文档，适用于白板协作场景，如工艺评审、方案讨论等。 - mindDocument：Mind文档，适用于思维导图场景，如产品结构分析、流程梳理等。 - drawDocument：Draw文档，适用于绘图场景，如工艺流程图、设备布局图等。  **默认取值：**  不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryDocParamDto that = (QueryDocParamDto) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDocParamDto {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
