package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class KeystoneListUsersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private Links links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<KeystoneListUsersResult> users = null;

    public KeystoneListUsersResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneListUsersResponse withLinks(Consumer<Links> linksSetter) {
        if (this.links == null) {
            this.links = new Links();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /** Get links
     * 
     * @return links */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public KeystoneListUsersResponse withUsers(List<KeystoneListUsersResult> users) {
        this.users = users;
        return this;
    }

    public KeystoneListUsersResponse addUsersItem(KeystoneListUsersResult usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public KeystoneListUsersResponse withUsers(Consumer<List<KeystoneListUsersResult>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /** IAM用户信息列表。
     * 
     * @return users */
    public List<KeystoneListUsersResult> getUsers() {
        return users;
    }

    public void setUsers(List<KeystoneListUsersResult> users) {
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
        KeystoneListUsersResponse keystoneListUsersResponse = (KeystoneListUsersResponse) o;
        return Objects.equals(this.links, keystoneListUsersResponse.links)
            && Objects.equals(this.users, keystoneListUsersResponse.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListUsersResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
