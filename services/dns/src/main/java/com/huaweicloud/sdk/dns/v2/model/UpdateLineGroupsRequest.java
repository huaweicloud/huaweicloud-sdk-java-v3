package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateLineGroupsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linegroup_id")

    private String linegroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateLineGroupsRequestBody body;

    public UpdateLineGroupsRequest withLinegroupId(String linegroupId) {
        this.linegroupId = linegroupId;
        return this;
    }

    /**
     * 线路分组ID
     * @return linegroupId
     */
    public String getLinegroupId() {
        return linegroupId;
    }

    public void setLinegroupId(String linegroupId) {
        this.linegroupId = linegroupId;
    }

    public UpdateLineGroupsRequest withBody(UpdateLineGroupsRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateLineGroupsRequest withBody(Consumer<UpdateLineGroupsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateLineGroupsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateLineGroupsRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateLineGroupsRequestBody body) {
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
        UpdateLineGroupsRequest that = (UpdateLineGroupsRequest) obj;
        return Objects.equals(this.linegroupId, that.linegroupId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linegroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLineGroupsRequest {\n");
        sb.append("    linegroupId: ").append(toIndentedString(linegroupId)).append("\n");
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
