package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.GlanceImageMembers;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class GlanceListImageMembersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="members")
    
    private List<GlanceImageMembers> members = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schema")
    
    private String schema;

    public GlanceListImageMembersResponse withMembers(List<GlanceImageMembers> members) {
        this.members = members;
        return this;
    }

    
    public GlanceListImageMembersResponse addMembersItem(GlanceImageMembers membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public GlanceListImageMembersResponse withMembers(Consumer<List<GlanceImageMembers>> membersSetter) {
        if(this.members == null ){
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 成员信息
     * @return members
     */
    public List<GlanceImageMembers> getMembers() {
        return members;
    }

    public void setMembers(List<GlanceImageMembers> members) {
        this.members = members;
    }

    public GlanceListImageMembersResponse withSchema(String schema) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlanceListImageMembersResponse glanceListImageMembersResponse = (GlanceListImageMembersResponse) o;
        return Objects.equals(this.members, glanceListImageMembersResponse.members) &&
            Objects.equals(this.schema, glanceListImageMembersResponse.schema);
    }
    @Override
    public int hashCode() {
        return Objects.hash(members, schema);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceListImageMembersResponse {\n");
            sb.append("    members: ").append(toIndentedString(members)).append("\n");
            sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

