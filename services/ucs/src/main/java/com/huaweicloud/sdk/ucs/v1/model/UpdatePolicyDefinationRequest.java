package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePolicyDefinationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policydefinitionid")

    private String policydefinitionid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UCSConstraintTemplateTagRequest body;

    public UpdatePolicyDefinationRequest withPolicydefinitionid(String policydefinitionid) {
        this.policydefinitionid = policydefinitionid;
        return this;
    }

    /**
     * 策略定义id
     * @return policydefinitionid
     */
    public String getPolicydefinitionid() {
        return policydefinitionid;
    }

    public void setPolicydefinitionid(String policydefinitionid) {
        this.policydefinitionid = policydefinitionid;
    }

    public UpdatePolicyDefinationRequest withBody(UCSConstraintTemplateTagRequest body) {
        this.body = body;
        return this;
    }

    public UpdatePolicyDefinationRequest withBody(Consumer<UCSConstraintTemplateTagRequest> bodySetter) {
        if (this.body == null) {
            this.body = new UCSConstraintTemplateTagRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UCSConstraintTemplateTagRequest getBody() {
        return body;
    }

    public void setBody(UCSConstraintTemplateTagRequest body) {
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
        UpdatePolicyDefinationRequest that = (UpdatePolicyDefinationRequest) obj;
        return Objects.equals(this.policydefinitionid, that.policydefinitionid) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policydefinitionid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyDefinationRequest {\n");
        sb.append("    policydefinitionid: ").append(toIndentedString(policydefinitionid)).append("\n");
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
