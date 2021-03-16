package com.huaweicloud.sdk.apig.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.AppAuthResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateAuthorizingAppsV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auths")
    
    private List<AppAuthResp> auths = null;
    
    public CreateAuthorizingAppsV2Response withAuths(List<AppAuthResp> auths) {
        this.auths = auths;
        return this;
    }

    
    public CreateAuthorizingAppsV2Response addAuthsItem(AppAuthResp authsItem) {
        this.auths.add(authsItem);
        return this;
    }

    public CreateAuthorizingAppsV2Response withAuths(Consumer<List<AppAuthResp>> authsSetter) {
        if(this.auths == null ){
            this.auths = new ArrayList<>();
        }
        authsSetter.accept(this.auths);
        return this;
    }

    /**
     * API与APP的授权关系列表
     * @return auths
     */
    public List<AppAuthResp> getAuths() {
        return auths;
    }

    public void setAuths(List<AppAuthResp> auths) {
        this.auths = auths;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAuthorizingAppsV2Response createAuthorizingAppsV2Response = (CreateAuthorizingAppsV2Response) o;
        return Objects.equals(this.auths, createAuthorizingAppsV2Response.auths);
    }
    @Override
    public int hashCode() {
        return Objects.hash(auths);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAuthorizingAppsV2Response {\n");
        sb.append("    auths: ").append(toIndentedString(auths)).append("\n");
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

