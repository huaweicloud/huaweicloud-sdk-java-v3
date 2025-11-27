package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleid")

    private String ruleid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateRuleRequestBody body;

    public UpdateRuleRequest withRuleid(String ruleid) {
        this.ruleid = ruleid;
        return this;
    }

    /**
     * 权限策略id
     * @return ruleid
     */
    public String getRuleid() {
        return ruleid;
    }

    public void setRuleid(String ruleid) {
        this.ruleid = ruleid;
    }

    public UpdateRuleRequest withBody(UpdateRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateRuleRequest withBody(Consumer<UpdateRuleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateRuleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateRuleRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateRuleRequestBody body) {
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
        UpdateRuleRequest that = (UpdateRuleRequest) obj;
        return Objects.equals(this.ruleid, that.ruleid) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRuleRequest {\n");
        sb.append("    ruleid: ").append(toIndentedString(ruleid)).append("\n");
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
