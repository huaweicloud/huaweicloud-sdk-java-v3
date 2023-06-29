package com.huaweicloud.sdk.roma.v2.model;

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
public class CreateAuthorizingAppsV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auths")

    private List<ApiAuthRelations> auths = null;

    public CreateAuthorizingAppsV2Response withAuths(List<ApiAuthRelations> auths) {
        this.auths = auths;
        return this;
    }

    public CreateAuthorizingAppsV2Response addAuthsItem(ApiAuthRelations authsItem) {
        if (this.auths == null) {
            this.auths = new ArrayList<>();
        }
        this.auths.add(authsItem);
        return this;
    }

    public CreateAuthorizingAppsV2Response withAuths(Consumer<List<ApiAuthRelations>> authsSetter) {
        if (this.auths == null) {
            this.auths = new ArrayList<>();
        }
        authsSetter.accept(this.auths);
        return this;
    }

    /**
     * API与APP的授权关系列表
     * @return auths
     */
    public List<ApiAuthRelations> getAuths() {
        return auths;
    }

    public void setAuths(List<ApiAuthRelations> auths) {
        this.auths = auths;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAuthorizingAppsV2Response that = (CreateAuthorizingAppsV2Response) obj;
        return Objects.equals(this.auths, that.auths);
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
