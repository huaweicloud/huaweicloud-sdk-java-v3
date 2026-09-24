package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOpsEvaluatorTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private ShowOpsEvaluatorTemplateResponseBodyTemplate template;

    public ShowOpsEvaluatorTemplateResponse withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释：** API执行状态码。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 
     * minimum: 0
     * maximum: 2147483647
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ShowOpsEvaluatorTemplateResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * **参数解释：** 响应状态描述信息。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ShowOpsEvaluatorTemplateResponse withTemplate(ShowOpsEvaluatorTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponse withTemplate(
        Consumer<ShowOpsEvaluatorTemplateResponseBodyTemplate> templateSetter) {
        if (this.template == null) {
            this.template = new ShowOpsEvaluatorTemplateResponseBodyTemplate();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public ShowOpsEvaluatorTemplateResponseBodyTemplate getTemplate() {
        return template;
    }

    public void setTemplate(ShowOpsEvaluatorTemplateResponseBodyTemplate template) {
        this.template = template;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluatorTemplateResponse that = (ShowOpsEvaluatorTemplateResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.msg, that.msg)
            && Objects.equals(this.template, that.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg, template);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluatorTemplateResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
