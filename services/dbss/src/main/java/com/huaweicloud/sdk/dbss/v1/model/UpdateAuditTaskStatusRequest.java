package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAuditTaskStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "busi_type")

    private String busiType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AuditSummaryStatusRequest body;

    public UpdateAuditTaskStatusRequest withBusiType(String busiType) {
        this.busiType = busiType;
        return this;
    }

    /**
     * **参数解释**： 业务类型。 **约束限制**： 区分大小写，以取值范围为准 **取值范围**： - risk：风险  - audit：审计实例 **默认取值**： 不涉及
     * @return busiType
     */
    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public UpdateAuditTaskStatusRequest withBody(AuditSummaryStatusRequest body) {
        this.body = body;
        return this;
    }

    public UpdateAuditTaskStatusRequest withBody(Consumer<AuditSummaryStatusRequest> bodySetter) {
        if (this.body == null) {
            this.body = new AuditSummaryStatusRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AuditSummaryStatusRequest getBody() {
        return body;
    }

    public void setBody(AuditSummaryStatusRequest body) {
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
        UpdateAuditTaskStatusRequest that = (UpdateAuditTaskStatusRequest) obj;
        return Objects.equals(this.busiType, that.busiType) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busiType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAuditTaskStatusRequest {\n");
        sb.append("    busiType: ").append(toIndentedString(busiType)).append("\n");
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
