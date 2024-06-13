package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFirewallTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private ResourceTag tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private ResourceTag sysTags;

    public ShowFirewallTagsResponse withTags(ResourceTag tags) {
        this.tags = tags;
        return this;
    }

    public ShowFirewallTagsResponse withTags(Consumer<ResourceTag> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ResourceTag();
            tagsSetter.accept(this.tags);
        }

        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public ResourceTag getTags() {
        return tags;
    }

    public void setTags(ResourceTag tags) {
        this.tags = tags;
    }

    public ShowFirewallTagsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowFirewallTagsResponse withSysTags(ResourceTag sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ShowFirewallTagsResponse withSysTags(Consumer<ResourceTag> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ResourceTag();
            sysTagsSetter.accept(this.sysTags);
        }

        return this;
    }

    /**
     * Get sysTags
     * @return sysTags
     */
    public ResourceTag getSysTags() {
        return sysTags;
    }

    public void setSysTags(ResourceTag sysTags) {
        this.sysTags = sysTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFirewallTagsResponse that = (ShowFirewallTagsResponse) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, requestId, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFirewallTagsResponse {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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
