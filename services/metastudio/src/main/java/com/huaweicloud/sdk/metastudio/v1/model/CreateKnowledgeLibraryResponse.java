package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateKnowledgeLibraryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_library_id")

    private String knowledgeLibraryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CreateKnowledgeLibraryResponse withKnowledgeLibraryId(String knowledgeLibraryId) {
        this.knowledgeLibraryId = knowledgeLibraryId;
        return this;
    }

    /**
     * 知识库ID。
     * @return knowledgeLibraryId
     */
    public String getKnowledgeLibraryId() {
        return knowledgeLibraryId;
    }

    public void setKnowledgeLibraryId(String knowledgeLibraryId) {
        this.knowledgeLibraryId = knowledgeLibraryId;
    }

    public CreateKnowledgeLibraryResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateKnowledgeLibraryResponse that = (CreateKnowledgeLibraryResponse) obj;
        return Objects.equals(this.knowledgeLibraryId, that.knowledgeLibraryId)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(knowledgeLibraryId, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKnowledgeLibraryResponse {\n");
        sb.append("    knowledgeLibraryId: ").append(toIndentedString(knowledgeLibraryId)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
