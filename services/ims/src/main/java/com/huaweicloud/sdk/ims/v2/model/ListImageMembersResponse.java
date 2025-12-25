package com.huaweicloud.sdk.ims.v2.model;

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
public class ListImageMembersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<ImageMember> members = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private GlancePageInfo pageInfo;

    public ListImageMembersResponse withMembers(List<ImageMember> members) {
        this.members = members;
        return this;
    }

    public ListImageMembersResponse addMembersItem(ImageMember membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public ListImageMembersResponse withMembers(Consumer<List<ImageMember>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 成员信息
     * @return members
     */
    public List<ImageMember> getMembers() {
        return members;
    }

    public void setMembers(List<ImageMember> members) {
        this.members = members;
    }

    public ListImageMembersResponse withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * 视图信息
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public ListImageMembersResponse withPageInfo(GlancePageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListImageMembersResponse withPageInfo(Consumer<GlancePageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new GlancePageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public GlancePageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(GlancePageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImageMembersResponse that = (ListImageMembersResponse) obj;
        return Objects.equals(this.members, that.members) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members, schema, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImageMembersResponse {\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
