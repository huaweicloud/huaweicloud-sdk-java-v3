package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateCustomRegexSetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex_set_id")

    private String regexSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AiguardCustomRegexSetUpdateBody body;

    public UpdateCustomRegexSetRequest withRegexSetId(String regexSetId) {
        this.regexSetId = regexSetId;
        return this;
    }

    /**
     * 正则库ID
     * @return regexSetId
     */
    public String getRegexSetId() {
        return regexSetId;
    }

    public void setRegexSetId(String regexSetId) {
        this.regexSetId = regexSetId;
    }

    public UpdateCustomRegexSetRequest withBody(AiguardCustomRegexSetUpdateBody body) {
        this.body = body;
        return this;
    }

    public UpdateCustomRegexSetRequest withBody(Consumer<AiguardCustomRegexSetUpdateBody> bodySetter) {
        if (this.body == null) {
            this.body = new AiguardCustomRegexSetUpdateBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AiguardCustomRegexSetUpdateBody getBody() {
        return body;
    }

    public void setBody(AiguardCustomRegexSetUpdateBody body) {
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
        UpdateCustomRegexSetRequest that = (UpdateCustomRegexSetRequest) obj;
        return Objects.equals(this.regexSetId, that.regexSetId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regexSetId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCustomRegexSetRequest {\n");
        sb.append("    regexSetId: ").append(toIndentedString(regexSetId)).append("\n");
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
