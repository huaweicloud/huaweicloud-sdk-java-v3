package com.huaweicloud.sdk.dns.v2.model;

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
public class ShowResourceTagResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterpriseProjectOrDefault")

    private String enterpriseProjectOrDefault;

    public ShowResourceTagResponse withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowResourceTagResponse addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowResourceTagResponse withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 指定实例的标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ShowResourceTagResponse withEnterpriseProjectOrDefault(String enterpriseProjectOrDefault) {
        this.enterpriseProjectOrDefault = enterpriseProjectOrDefault;
        return this;
    }

    /**
     * 企业项目或默认项目
     * @return enterpriseProjectOrDefault
     */
    public String getEnterpriseProjectOrDefault() {
        return enterpriseProjectOrDefault;
    }

    public void setEnterpriseProjectOrDefault(String enterpriseProjectOrDefault) {
        this.enterpriseProjectOrDefault = enterpriseProjectOrDefault;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResourceTagResponse showResourceTagResponse = (ShowResourceTagResponse) o;
        return Objects.equals(this.tags, showResourceTagResponse.tags)
            && Objects.equals(this.enterpriseProjectOrDefault, showResourceTagResponse.enterpriseProjectOrDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, enterpriseProjectOrDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceTagResponse {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectOrDefault: ").append(toIndentedString(enterpriseProjectOrDefault)).append("\n");
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
