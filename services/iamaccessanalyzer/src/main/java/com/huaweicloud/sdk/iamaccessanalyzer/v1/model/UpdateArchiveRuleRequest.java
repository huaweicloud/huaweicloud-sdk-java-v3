package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateArchiveRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyzer_id")

    private String analyzerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archive_rule_id")

    private String archiveRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateArchiveRuleReqBody body;

    public UpdateArchiveRuleRequest withAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
        return this;
    }

    /**
     * 分析器的唯一标识符。
     * @return analyzerId
     */
    public String getAnalyzerId() {
        return analyzerId;
    }

    public void setAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
    }

    public UpdateArchiveRuleRequest withArchiveRuleId(String archiveRuleId) {
        this.archiveRuleId = archiveRuleId;
        return this;
    }

    /**
     * 存档规则的唯一标识符。
     * @return archiveRuleId
     */
    public String getArchiveRuleId() {
        return archiveRuleId;
    }

    public void setArchiveRuleId(String archiveRuleId) {
        this.archiveRuleId = archiveRuleId;
    }

    public UpdateArchiveRuleRequest withBody(UpdateArchiveRuleReqBody body) {
        this.body = body;
        return this;
    }

    public UpdateArchiveRuleRequest withBody(Consumer<UpdateArchiveRuleReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateArchiveRuleReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateArchiveRuleReqBody getBody() {
        return body;
    }

    public void setBody(UpdateArchiveRuleReqBody body) {
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
        UpdateArchiveRuleRequest that = (UpdateArchiveRuleRequest) obj;
        return Objects.equals(this.analyzerId, that.analyzerId)
            && Objects.equals(this.archiveRuleId, that.archiveRuleId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(analyzerId, archiveRuleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateArchiveRuleRequest {\n");
        sb.append("    analyzerId: ").append(toIndentedString(analyzerId)).append("\n");
        sb.append("    archiveRuleId: ").append(toIndentedString(archiveRuleId)).append("\n");
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
