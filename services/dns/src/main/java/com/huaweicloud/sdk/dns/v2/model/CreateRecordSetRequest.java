package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateRecordSetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateRecordSetRequestBody body;

    public CreateRecordSetRequest withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * **参数解释：** 域名ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public CreateRecordSetRequest withBody(CreateRecordSetRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateRecordSetRequest withBody(Consumer<CreateRecordSetRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateRecordSetRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateRecordSetRequestBody getBody() {
        return body;
    }

    public void setBody(CreateRecordSetRequestBody body) {
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
        return Objects.equals(this.zoneId, that.zoneId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRecordSetRequest {\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
