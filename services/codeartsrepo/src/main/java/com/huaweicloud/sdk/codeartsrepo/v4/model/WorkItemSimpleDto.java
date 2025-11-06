package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 关联工作项基本信息。
 */
public class WorkItemSimpleDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_id")

    private String relatedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_url")

    private String relatedUrl;

    public WorkItemSimpleDto withRelatedId(String relatedId) {
        this.relatedId = relatedId;
        return this;
    }

    /**
     * **参数解释：** 工作项编号。
     * @return relatedId
     */
    public String getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(String relatedId) {
        this.relatedId = relatedId;
    }

    public WorkItemSimpleDto withRelatedUrl(String relatedUrl) {
        this.relatedUrl = relatedUrl;
        return this;
    }

    /**
     * **参数解释：** 工作项地址。
     * @return relatedUrl
     */
    public String getRelatedUrl() {
        return relatedUrl;
    }

    public void setRelatedUrl(String relatedUrl) {
        this.relatedUrl = relatedUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkItemSimpleDto that = (WorkItemSimpleDto) obj;
        return Objects.equals(this.relatedId, that.relatedId) && Objects.equals(this.relatedUrl, that.relatedUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relatedId, relatedUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemSimpleDto {\n");
        sb.append("    relatedId: ").append(toIndentedString(relatedId)).append("\n");
        sb.append("    relatedUrl: ").append(toIndentedString(relatedUrl)).append("\n");
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
