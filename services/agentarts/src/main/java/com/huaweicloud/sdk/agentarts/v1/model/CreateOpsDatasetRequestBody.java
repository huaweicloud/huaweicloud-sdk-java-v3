package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建评测集请求
 */
public class CreateOpsDatasetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<CreateOpsSchemaRequest> schemas = null;

    public CreateOpsDatasetRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 评测集的名称。 **约束限制：** 字符串长度2-50字符，租户内唯一。 **取值范围：** 支持中英文、数字、下划线（_）、中划线（-）和空格，长度2-50字符，但不允许以空格开头或结尾。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateOpsDatasetRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 评测集的用途及业务背景描述。 **约束限制：** 长度0-200字符。 **取值范围：** 任意字符串。 **默认取值：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateOpsDatasetRequestBody withSchemas(List<CreateOpsSchemaRequest> schemas) {
        this.schemas = schemas;
        return this;
    }

    public CreateOpsDatasetRequestBody addSchemasItem(CreateOpsSchemaRequest schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public CreateOpsDatasetRequestBody withSchemas(Consumer<List<CreateOpsSchemaRequest>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * **参数解释：** 定义评测集结构的一组字段配置列表。 **约束限制：** 列表元素数量上限为50个。 **取值范围：** CreateOpsSchemaRequest 对象数组。 **默认取值：** 空列表。
     * @return schemas
     */
    public List<CreateOpsSchemaRequest> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<CreateOpsSchemaRequest> schemas) {
        this.schemas = schemas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOpsDatasetRequestBody that = (CreateOpsDatasetRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.schemas, that.schemas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, schemas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOpsDatasetRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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
