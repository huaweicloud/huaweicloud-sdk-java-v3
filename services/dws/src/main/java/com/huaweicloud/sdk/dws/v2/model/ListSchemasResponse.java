package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSchemasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<SchemaInfo> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListSchemasResponse withSchemas(List<SchemaInfo> schemas) {
        this.schemas = schemas;
        return this;
    }

    public ListSchemasResponse addSchemasItem(SchemaInfo schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public ListSchemasResponse withSchemas(Consumer<List<SchemaInfo>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * **参数解释**： 集群模式空间信息列表。 **取值范围**： 不涉及。
     * @return schemas
     */
    public List<SchemaInfo> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<SchemaInfo> schemas) {
        this.schemas = schemas;
    }

    public ListSchemasResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 总数量。 **取值范围**： 不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSchemasResponse that = (ListSchemasResponse) obj;
        return Objects.equals(this.schemas, that.schemas) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemas, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSchemasResponse {\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
