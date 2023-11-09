package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchChangeTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TagsReq body;

    public BatchChangeTagsRequest withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面id。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public BatchChangeTagsRequest withBody(TagsReq body) {
        this.body = body;
        return this;
    }

    public BatchChangeTagsRequest withBody(Consumer<TagsReq> bodySetter) {
        if (this.body == null) {
            this.body = new TagsReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TagsReq getBody() {
        return body;
    }

    public void setBody(TagsReq body) {
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
        BatchChangeTagsRequest that = (BatchChangeTagsRequest) obj;
        return Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchChangeTagsRequest {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
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
