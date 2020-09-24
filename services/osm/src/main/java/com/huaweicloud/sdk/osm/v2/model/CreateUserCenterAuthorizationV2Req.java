package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateUserCenterAuthorizationV2Req
 */
public class CreateUserCenterAuthorizationV2Req  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_authorized")
    
    private Integer isAuthorized;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authorization_content")
    
    private String authorizationContent;

    public CreateUserCenterAuthorizationV2Req withIsAuthorized(Integer isAuthorized) {
        this.isAuthorized = isAuthorized;
        return this;
    }

    


    /**
     * 是否同意 0不同意 1同意
     * minimum: 0
     * maximum: 1
     * @return isAuthorized
     */
    public Integer getIsAuthorized() {
        return isAuthorized;
    }

    public void setIsAuthorized(Integer isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    public CreateUserCenterAuthorizationV2Req withAuthorizationContent(String authorizationContent) {
        this.authorizationContent = authorizationContent;
        return this;
    }

    


    /**
     * 机密信息内容
     * @return authorizationContent
     */
    public String getAuthorizationContent() {
        return authorizationContent;
    }

    public void setAuthorizationContent(String authorizationContent) {
        this.authorizationContent = authorizationContent;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateUserCenterAuthorizationV2Req createUserCenterAuthorizationV2Req = (CreateUserCenterAuthorizationV2Req) o;
        return Objects.equals(this.isAuthorized, createUserCenterAuthorizationV2Req.isAuthorized) &&
            Objects.equals(this.authorizationContent, createUserCenterAuthorizationV2Req.authorizationContent);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isAuthorized, authorizationContent);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserCenterAuthorizationV2Req {\n");
        sb.append("    isAuthorized: ").append(toIndentedString(isAuthorized)).append("\n");
        sb.append("    authorizationContent: ").append(toIndentedString(authorizationContent)).append("\n");
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

