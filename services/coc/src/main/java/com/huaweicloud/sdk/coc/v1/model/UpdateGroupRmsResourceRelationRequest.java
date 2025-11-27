package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateGroupRmsResourceRelationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private GroupRmsResourceRelationUpdateRequest body;

    public UpdateGroupRmsResourceRelationRequest withBody(GroupRmsResourceRelationUpdateRequest body) {
        this.body = body;
        return this;
    }

    public UpdateGroupRmsResourceRelationRequest withBody(Consumer<GroupRmsResourceRelationUpdateRequest> bodySetter) {
        if (this.body == null) {
            this.body = new GroupRmsResourceRelationUpdateRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public GroupRmsResourceRelationUpdateRequest getBody() {
        return body;
    }

    public void setBody(GroupRmsResourceRelationUpdateRequest body) {
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
        UpdateGroupRmsResourceRelationRequest that = (UpdateGroupRmsResourceRelationRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGroupRmsResourceRelationRequest {\n");
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
