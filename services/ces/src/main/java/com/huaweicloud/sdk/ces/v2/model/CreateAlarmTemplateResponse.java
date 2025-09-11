package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateAlarmTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overwrite_result")

    private OverwriteResultResp overwriteResult;

    public CreateAlarmTemplateResponse withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * **参数解释**： 告警模板的ID。     **约束限制**： 不涉及。 **取值范围**： 以at开头，后跟字母、数字，长度为[2,64]个字符。           **默认取值**： 不涉及。 
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public CreateAlarmTemplateResponse withOverwriteResult(OverwriteResultResp overwriteResult) {
        this.overwriteResult = overwriteResult;
        return this;
    }

    public CreateAlarmTemplateResponse withOverwriteResult(Consumer<OverwriteResultResp> overwriteResultSetter) {
        if (this.overwriteResult == null) {
            this.overwriteResult = new OverwriteResultResp();
            overwriteResultSetter.accept(this.overwriteResult);
        }

        return this;
    }

    /**
     * Get overwriteResult
     * @return overwriteResult
     */
    public OverwriteResultResp getOverwriteResult() {
        return overwriteResult;
    }

    public void setOverwriteResult(OverwriteResultResp overwriteResult) {
        this.overwriteResult = overwriteResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAlarmTemplateResponse that = (CreateAlarmTemplateResponse) obj;
        return Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.overwriteResult, that.overwriteResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, overwriteResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAlarmTemplateResponse {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    overwriteResult: ").append(toIndentedString(overwriteResult)).append("\n");
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
