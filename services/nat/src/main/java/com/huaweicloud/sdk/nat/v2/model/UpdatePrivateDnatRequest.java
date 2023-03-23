package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePrivateDnatRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnat_rule_id")

    private String dnatRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePrivateDnatRequestBody body;

    public UpdatePrivateDnatRequest withDnatRuleId(String dnatRuleId) {
        this.dnatRuleId = dnatRuleId;
        return this;
    }

    /**
     * DNAT规则的ID。
     * @return dnatRuleId
     */
    public String getDnatRuleId() {
        return dnatRuleId;
    }

    public void setDnatRuleId(String dnatRuleId) {
        this.dnatRuleId = dnatRuleId;
    }

    public UpdatePrivateDnatRequest withBody(UpdatePrivateDnatRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePrivateDnatRequest withBody(Consumer<UpdatePrivateDnatRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePrivateDnatRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePrivateDnatRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePrivateDnatRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePrivateDnatRequest updatePrivateDnatRequest = (UpdatePrivateDnatRequest) o;
        return Objects.equals(this.dnatRuleId, updatePrivateDnatRequest.dnatRuleId)
            && Objects.equals(this.body, updatePrivateDnatRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnatRuleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivateDnatRequest {\n");
        sb.append("    dnatRuleId: ").append(toIndentedString(dnatRuleId)).append("\n");
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
