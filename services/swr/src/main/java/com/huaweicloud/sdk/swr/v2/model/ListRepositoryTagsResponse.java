package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRepositoryTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<ShowReposTagResp> body = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Range")

    private String contentRange;

    public ListRepositoryTagsResponse withBody(List<ShowReposTagResp> body) {
        this.body = body;
        return this;
    }

    public ListRepositoryTagsResponse addBodyItem(ShowReposTagResp bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ListRepositoryTagsResponse withBody(Consumer<List<ShowReposTagResp>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * 镜像tag列表
     * @return body
     */
    public List<ShowReposTagResp> getBody() {
        return body;
    }

    public void setBody(List<ShowReposTagResp> body) {
        this.body = body;
    }

    public ListRepositoryTagsResponse withContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * Get contentRange
     * @return contentRange
     */
    public String getContentRange() {
        return contentRange;
    }

    public void setContentRange(String contentRange) {
        this.contentRange = contentRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRepositoryTagsResponse that = (ListRepositoryTagsResponse) obj;
        return Objects.equals(this.body, that.body) && Objects.equals(this.contentRange, that.contentRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, contentRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRepositoryTagsResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    contentRange: ").append(toIndentedString(contentRange)).append("\n");
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
