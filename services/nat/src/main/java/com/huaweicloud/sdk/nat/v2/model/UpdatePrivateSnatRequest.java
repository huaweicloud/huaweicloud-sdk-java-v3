package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePrivateSnatRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snat_rule_id")

    private String snatRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePrivateSnatOptionBody body;

    public UpdatePrivateSnatRequest withSnatRuleId(String snatRuleId) {
        this.snatRuleId = snatRuleId;
        return this;
    }

    /**
     * SNAT规则的ID。
     * @return snatRuleId
     */
    public String getSnatRuleId() {
        return snatRuleId;
    }

    public void setSnatRuleId(String snatRuleId) {
        this.snatRuleId = snatRuleId;
    }

    public UpdatePrivateSnatRequest withBody(UpdatePrivateSnatOptionBody body) {
        this.body = body;
        return this;
    }

    public UpdatePrivateSnatRequest withBody(Consumer<UpdatePrivateSnatOptionBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePrivateSnatOptionBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePrivateSnatOptionBody getBody() {
        return body;
    }

    public void setBody(UpdatePrivateSnatOptionBody body) {
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
        UpdatePrivateSnatRequest updatePrivateSnatRequest = (UpdatePrivateSnatRequest) o;
        return Objects.equals(this.snatRuleId, updatePrivateSnatRequest.snatRuleId)
            && Objects.equals(this.body, updatePrivateSnatRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snatRuleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivateSnatRequest {\n");
        sb.append("    snatRuleId: ").append(toIndentedString(snatRuleId)).append("\n");
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
