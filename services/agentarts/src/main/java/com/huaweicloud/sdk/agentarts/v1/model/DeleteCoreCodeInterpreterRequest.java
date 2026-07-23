package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * Request Object
 */
public class DeleteCoreCodeInterpreterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_interpreter_id")

    private UUID codeInterpreterId;

    public DeleteCoreCodeInterpreterRequest withCodeInterpreterId(UUID codeInterpreterId) {
        this.codeInterpreterId = codeInterpreterId;
        return this;
    }

    /**
     * **参数解释：** 代码解释器ID，可通过[查询代码解释器列表](https://support.huaweicloud.com/api-agentarts/ListCoreCodeInterpreters.html)接口获取。 **约束限制：** 不涉及。 **取值范围：** 符合UUID正则^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$的36位字符串。 **默认取值：** 不涉及。
     * @return codeInterpreterId
     */
    public UUID getCodeInterpreterId() {
        return codeInterpreterId;
    }

    public void setCodeInterpreterId(UUID codeInterpreterId) {
        this.codeInterpreterId = codeInterpreterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCoreCodeInterpreterRequest that = (DeleteCoreCodeInterpreterRequest) obj;
        return Objects.equals(this.codeInterpreterId, that.codeInterpreterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeInterpreterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCoreCodeInterpreterRequest {\n");
        sb.append("    codeInterpreterId: ").append(toIndentedString(codeInterpreterId)).append("\n");
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
