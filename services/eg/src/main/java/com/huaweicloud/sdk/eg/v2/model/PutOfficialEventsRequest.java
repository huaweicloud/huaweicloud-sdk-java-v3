package com.huaweicloud.sdk.eg.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class PutOfficialEventsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_name")

    private String sourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PutEventsReq body;

    public PutOfficialEventsRequest withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * 事件源名称
     * @return sourceName
     */
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public PutOfficialEventsRequest withBody(PutEventsReq body) {
        this.body = body;
        return this;
    }

    public PutOfficialEventsRequest withBody(Consumer<PutEventsReq> bodySetter) {
        if (this.body == null) {
            this.body = new PutEventsReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PutEventsReq getBody() {
        return body;
    }

    public void setBody(PutEventsReq body) {
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
        PutOfficialEventsRequest that = (PutOfficialEventsRequest) obj;
        return Objects.equals(this.sourceName, that.sourceName) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutOfficialEventsRequest {\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
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
