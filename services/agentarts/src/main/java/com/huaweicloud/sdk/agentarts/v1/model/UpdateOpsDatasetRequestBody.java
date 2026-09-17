package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 修改评测集元数据（如名称和描述）的请求体。 **约束限制：** name 为必填项。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class UpdateOpsDatasetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTmsTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<OpsCreateSchemaRequest> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateOpsDatasetRequestBody withTags(List<OpsTmsTag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateOpsDatasetRequestBody addTagsItem(OpsTmsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateOpsDatasetRequestBody withTags(Consumer<List<OpsTmsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 更新评测集时绑定的TMS标签列表，传入则全量替换。 **约束限制：** 数组元素最小数量为0，最大数量为50。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tags
     */
    public List<OpsTmsTag> getTags() {
        return tags;
    }

    public void setTags(List<OpsTmsTag> tags) {
        this.tags = tags;
    }

    public UpdateOpsDatasetRequestBody withSchemas(List<OpsCreateSchemaRequest> schemas) {
        this.schemas = schemas;
        return this;
    }

    public UpdateOpsDatasetRequestBody addSchemasItem(OpsCreateSchemaRequest schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public UpdateOpsDatasetRequestBody withSchemas(Consumer<List<OpsCreateSchemaRequest>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * **参数解释：** 定义评测集结构的一组字段配置列表。 **约束限制：** 数组元素最小数量为0，最大数量为50。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return schemas
     */
    public List<OpsCreateSchemaRequest> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<OpsCreateSchemaRequest> schemas) {
        this.schemas = schemas;
    }

    public UpdateOpsDatasetRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 待更新的评测集显示名称。 **约束限制：** 必填参数；长度1到255字符。 **取值范围：** 中英文、数字、下划线（_）、中划线（-）等。 **默认取值：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateOpsDatasetRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 待更新的评测集用途或内容详细描述。 **约束限制：** 可选参数；长度0到200字符。 **取值范围：** 任意字符串。 **默认取值：** 不涉及。 
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
        UpdateOpsDatasetRequestBody that = (UpdateOpsDatasetRequestBody) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.schemas, that.schemas)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, schemas, name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsDatasetRequestBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
