package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListPreviewFindingsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyzer_id")

    private String analyzerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_preview_id")

    private String accessPreviewId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListPreviewFindingsReqBody body;

    public ListPreviewFindingsRequest withAnalyzerId(String analyzerId) {
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

    public ListPreviewFindingsRequest withAccessPreviewId(String accessPreviewId) {
        this.accessPreviewId = accessPreviewId;
        return this;
    }

    /**
     * 访问预览的唯一标识符。
     * @return accessPreviewId
     */
    public String getAccessPreviewId() {
        return accessPreviewId;
    }

    public void setAccessPreviewId(String accessPreviewId) {
        this.accessPreviewId = accessPreviewId;
    }

    public ListPreviewFindingsRequest withBody(ListPreviewFindingsReqBody body) {
        this.body = body;
        return this;
    }

    public ListPreviewFindingsRequest withBody(Consumer<ListPreviewFindingsReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListPreviewFindingsReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ListPreviewFindingsReqBody getBody() {
        return body;
    }

    public void setBody(ListPreviewFindingsReqBody body) {
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
        ListPreviewFindingsRequest that = (ListPreviewFindingsRequest) obj;
        return Objects.equals(this.analyzerId, that.analyzerId)
            && Objects.equals(this.accessPreviewId, that.accessPreviewId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(analyzerId, accessPreviewId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPreviewFindingsRequest {\n");
        sb.append("    analyzerId: ").append(toIndentedString(analyzerId)).append("\n");
        sb.append("    accessPreviewId: ").append(toIndentedString(accessPreviewId)).append("\n");
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
