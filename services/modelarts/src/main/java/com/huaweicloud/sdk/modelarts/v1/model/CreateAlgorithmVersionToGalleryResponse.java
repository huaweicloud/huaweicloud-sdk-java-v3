package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateAlgorithmVersionToGalleryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_id")

    private String contentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_num")

    private String versionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_uri")

    private String contentUri;

    public CreateAlgorithmVersionToGalleryResponse withContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * **参数解释**：资产id。 **取值范围**：不涉及。
     * @return contentId
     */
    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public CreateAlgorithmVersionToGalleryResponse withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * **参数解释**：版本号id。 **取值范围**：不涉及。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public CreateAlgorithmVersionToGalleryResponse withVersionNum(String versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    /**
     * **参数解释**：版本数量。 **取值范围**：不涉及。
     * @return versionNum
     */
    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public CreateAlgorithmVersionToGalleryResponse withContentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    /**
     * **参数解释**：资产uri地址。 **取值范围**：不涉及。
     * @return contentUri
     */
    public String getContentUri() {
        return contentUri;
    }

    public void setContentUri(String contentUri) {
        this.contentUri = contentUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAlgorithmVersionToGalleryResponse that = (CreateAlgorithmVersionToGalleryResponse) obj;
        return Objects.equals(this.contentId, that.contentId) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.versionNum, that.versionNum) && Objects.equals(this.contentUri, that.contentUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, versionId, versionNum, contentUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAlgorithmVersionToGalleryResponse {\n");
        sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    versionNum: ").append(toIndentedString(versionNum)).append("\n");
        sb.append("    contentUri: ").append(toIndentedString(contentUri)).append("\n");
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
