package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOpsEvaluationModelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private Model model;

    public ShowOpsEvaluationModelResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * **参数解释：** 接口返回的提示信息。 **约束限制：** 不涉及。 **取值范围：** 不涉及。
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ShowOpsEvaluationModelResponse withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释：** 接口返回的状态码。 **约束限制：** 不涉及。 **取值范围：** 不涉及。
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ShowOpsEvaluationModelResponse withModel(Model model) {
        this.model = model;
        return this;
    }

    public ShowOpsEvaluationModelResponse withModel(Consumer<Model> modelSetter) {
        if (this.model == null) {
            this.model = new Model();
            modelSetter.accept(this.model);
        }

        return this;
    }

    /**
     * Get model
     * @return model
     */
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluationModelResponse that = (ShowOpsEvaluationModelResponse) obj;
        return Objects.equals(this.msg, that.msg) && Objects.equals(this.code, that.code)
            && Objects.equals(this.model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msg, code, model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluationModelResponse {\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
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
