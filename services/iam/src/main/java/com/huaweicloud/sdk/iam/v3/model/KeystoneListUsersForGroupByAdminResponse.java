package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUserResult;
import com.huaweicloud.sdk.iam.v3.model.Links;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class KeystoneListUsersForGroupByAdminResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private Links links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    private List<KeystoneUserResult> users = null;
    
    public KeystoneListUsersForGroupByAdminResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneListUsersForGroupByAdminResponse withLinks(Consumer<Links> linksSetter) {
        if(this.links == null ){
            this.links = new Links();
        }
        linksSetter.accept(this.links);
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public KeystoneListUsersForGroupByAdminResponse withUsers(List<KeystoneUserResult> users) {
        this.users = users;
        return this;
    }

    
    public KeystoneListUsersForGroupByAdminResponse addUsersItem(KeystoneUserResult usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public KeystoneListUsersForGroupByAdminResponse withUsers(Consumer<List<KeystoneUserResult>> usersSetter) {
        if(this.users == null ){
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * IAM用户信息列表。
     * @return users
     */
    public List<KeystoneUserResult> getUsers() {
        return users;
    }

    public void setUsers(List<KeystoneUserResult> users) {
        this.users = users;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListUsersForGroupByAdminResponse keystoneListUsersForGroupByAdminResponse = (KeystoneListUsersForGroupByAdminResponse) o;
        return Objects.equals(this.links, keystoneListUsersForGroupByAdminResponse.links) &&
            Objects.equals(this.users, keystoneListUsersForGroupByAdminResponse.users);
    }
    @Override
    public int hashCode() {
        return Objects.hash(links, users);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListUsersForGroupByAdminResponse {\n");
            sb.append("    links: ").append(toIndentedString(links)).append("\n");
            sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

