package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateFlinkSavepointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "savepoint_id")

    private String savepointId;

    public CreateFlinkSavepointResponse withSavepointId(String savepointId) {
        this.savepointId = savepointId;
        return this;
    }

    /**
     * **参数解释**：Savepoint唯一标识。 **取值范围**：UUIDv7格式，固定36位，由英文小写字母、数字及中划线组成。 
     * @return savepointId
     */
    public String getSavepointId() {
        return savepointId;
    }

    public void setSavepointId(String savepointId) {
        this.savepointId = savepointId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFlinkSavepointResponse that = (CreateFlinkSavepointResponse) obj;
        return Objects.equals(this.savepointId, that.savepointId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(savepointId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlinkSavepointResponse {\n");
        sb.append("    savepointId: ").append(toIndentedString(savepointId)).append("\n");
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
