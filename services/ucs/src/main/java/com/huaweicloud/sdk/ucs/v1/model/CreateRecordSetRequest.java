package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateRecordSetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Zone-Project-ID")

    private String xZoneProjectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Zone-ID")

    private String xZoneID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<CreateRecordSetRequestBody> body = null;

    public CreateRecordSetRequest withXZoneProjectID(String xZoneProjectID) {
        this.xZoneProjectID = xZoneProjectID;
        return this;
    }

    /**
     * 项目ID
     * @return xZoneProjectID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Zone-Project-ID")
    public String getXZoneProjectID() {
        return xZoneProjectID;
    }

    public void setXZoneProjectID(String xZoneProjectID) {
        this.xZoneProjectID = xZoneProjectID;
    }

    public CreateRecordSetRequest withXZoneID(String xZoneID) {
        this.xZoneID = xZoneID;
        return this;
    }

    /**
     * DNS区域ID
     * @return xZoneID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Zone-ID")
    public String getXZoneID() {
        return xZoneID;
    }

    public void setXZoneID(String xZoneID) {
        this.xZoneID = xZoneID;
    }

    public CreateRecordSetRequest withBody(List<CreateRecordSetRequestBody> body) {
        this.body = body;
        return this;
    }

    public CreateRecordSetRequest addBodyItem(CreateRecordSetRequestBody bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public CreateRecordSetRequest withBody(Consumer<List<CreateRecordSetRequestBody>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<CreateRecordSetRequestBody> getBody() {
        return body;
    }

    public void setBody(List<CreateRecordSetRequestBody> body) {
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
        CreateRecordSetRequest that = (CreateRecordSetRequest) obj;
        return Objects.equals(this.xZoneProjectID, that.xZoneProjectID) && Objects.equals(this.xZoneID, that.xZoneID)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xZoneProjectID, xZoneID, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRecordSetRequest {\n");
        sb.append("    xZoneProjectID: ").append(toIndentedString(xZoneProjectID)).append("\n");
        sb.append("    xZoneID: ").append(toIndentedString(xZoneID)).append("\n");
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
