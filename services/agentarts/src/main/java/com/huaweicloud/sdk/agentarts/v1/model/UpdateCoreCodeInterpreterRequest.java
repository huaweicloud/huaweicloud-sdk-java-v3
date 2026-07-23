package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateCoreCodeInterpreterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_interpreter_id")

    private UUID codeInterpreterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateCoreCodeInterpreterRequestBody body;

    public UpdateCoreCodeInterpreterRequest withCodeInterpreterId(UUID codeInterpreterId) {
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

    public UpdateCoreCodeInterpreterRequest withBody(UpdateCoreCodeInterpreterRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateCoreCodeInterpreterRequest withBody(Consumer<UpdateCoreCodeInterpreterRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateCoreCodeInterpreterRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateCoreCodeInterpreterRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateCoreCodeInterpreterRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCoreCodeInterpreterRequest that = (UpdateCoreCodeInterpreterRequest) obj;
        return Objects.equals(this.codeInterpreterId, that.codeInterpreterId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeInterpreterId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCoreCodeInterpreterRequest {\n");
        sb.append("    codeInterpreterId: ").append(toIndentedString(codeInterpreterId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
