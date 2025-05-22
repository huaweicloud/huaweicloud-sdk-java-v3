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
public class ListRedistributionSchemaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<RedisSchema> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListRedistributionSchemaResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * **参数解释**： 错误码。 **取值范围**： 请求正常时为固定值 DWS.0000。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ListRedistributionSchemaResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * **参数解释**： 错误信息。 **取值范围**： 不涉及。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ListRedistributionSchemaResponse withSchemas(List<RedisSchema> schemas) {
        this.schemas = schemas;
        return this;
    }

    public ListRedistributionSchemaResponse addSchemasItem(RedisSchema schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public ListRedistributionSchemaResponse withSchemas(Consumer<List<RedisSchema>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * **参数解释**： 待重分布的schema列表。 **取值范围**： 不涉及。
     * @return schemas
     */
    public List<RedisSchema> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<RedisSchema> schemas) {
        this.schemas = schemas;
    }

    public ListRedistributionSchemaResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 数据总条数。 **取值范围**： 不涉及。
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
        ListRedistributionSchemaResponse that = (ListRedistributionSchemaResponse) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.schemas, that.schemas) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, schemas, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRedistributionSchemaResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
