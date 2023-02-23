package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.GaussDBforOpenGaussUserForListAttributes;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库用户信息。
 */
public class GaussDBforOpenGaussUserForList  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attributes")
    

    private GaussDBforOpenGaussUserForListAttributes attributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="memberof")
    

    private String memberof;

    public GaussDBforOpenGaussUserForList withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 帐号名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public GaussDBforOpenGaussUserForList withAttributes(GaussDBforOpenGaussUserForListAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public GaussDBforOpenGaussUserForList withAttributes(Consumer<GaussDBforOpenGaussUserForListAttributes> attributesSetter) {
        if(this.attributes == null ){
            this.attributes = new GaussDBforOpenGaussUserForListAttributes();
            attributesSetter.accept(this.attributes);
        }
        
        return this;
    }


    /**
     * Get attributes
     * @return attributes
     */
    public GaussDBforOpenGaussUserForListAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(GaussDBforOpenGaussUserForListAttributes attributes) {
        this.attributes = attributes;
    }

    

    public GaussDBforOpenGaussUserForList withMemberof(String memberof) {
        this.memberof = memberof;
        return this;
    }

    


    /**
     * 用户的默认权限。
     * @return memberof
     */
    public String getMemberof() {
        return memberof;
    }

    public void setMemberof(String memberof) {
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
        GaussDBforOpenGaussUserForList gaussDBforOpenGaussUserForList = (GaussDBforOpenGaussUserForList) o;
        return Objects.equals(this.name, gaussDBforOpenGaussUserForList.name) &&
            Objects.equals(this.attributes, gaussDBforOpenGaussUserForList.attributes) &&
            Objects.equals(this.memberof, gaussDBforOpenGaussUserForList.memberof);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, attributes, memberof);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GaussDBforOpenGaussUserForList {\n");
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

