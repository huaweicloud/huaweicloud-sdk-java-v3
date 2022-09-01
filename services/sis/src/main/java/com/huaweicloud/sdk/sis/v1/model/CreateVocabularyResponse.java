package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateVocabularyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vocabulary_id")

    @JacksonXmlProperty(localName = "vocabulary_id")

    private String vocabularyId;

    public CreateVocabularyResponse withVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }

    /**
     * 调用成功返回热词表ID，调用失败时无此字段。
     * @return vocabularyId
     */
    public String getVocabularyId() {
        return vocabularyId;
    }

    public void setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVocabularyResponse createVocabularyResponse = (CreateVocabularyResponse) o;
        return Objects.equals(this.vocabularyId, createVocabularyResponse.vocabularyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vocabularyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVocabularyResponse {\n");
        sb.append("    vocabularyId: ").append(toIndentedString(vocabularyId)).append("\n");
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
