package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库用户信息。
 */
public class PgUserForList  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attributes")
    
    private Object attributes;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="memberof")
    
    private List<String> memberof = null;
    
    public PgUserForList withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 数据库用户名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public PgUserForList withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    


    /**
     * 用户的权限属性。
     * @return attributes
     */
    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    

    public PgUserForList withMemberof(List<String> memberof) {
        this.memberof = memberof;
        return this;
    }

    
    public PgUserForList addMemberofItem(String memberofItem) {
        if(this.memberof == null) {
            this.memberof = new ArrayList<>();
        }
        this.memberof.add(memberofItem);
        return this;
    }

    public PgUserForList withMemberof(Consumer<List<String>> memberofSetter) {
        if(this.memberof == null) {
            this.memberof = new ArrayList<>();
        }
        memberofSetter.accept(this.memberof);
        return this;
    }

    /**
     * 用户的权限属性。
     * @return memberof
     */
    public List<String> getMemberof() {
        return memberof;
    }

    public void setMemberof(List<String> memberof) {
        this.memberof = memberof;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PgUserForList pgUserForList = (PgUserForList) o;
        return Objects.equals(this.name, pgUserForList.name) &&
            Objects.equals(this.attributes, pgUserForList.attributes) &&
            Objects.equals(this.memberof, pgUserForList.memberof);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, attributes, memberof);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PgUserForList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    memberof: ").append(toIndentedString(memberof)).append("\n");
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

