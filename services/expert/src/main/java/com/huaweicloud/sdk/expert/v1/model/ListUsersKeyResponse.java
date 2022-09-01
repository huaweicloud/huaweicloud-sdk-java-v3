package com.huaweicloud.sdk.expert.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListUsersKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users_key")

    @JacksonXmlProperty(localName = "users_key")

    private List<String> usersKey = null;

    public ListUsersKeyResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数据总条数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListUsersKeyResponse withUsersKey(List<String> usersKey) {
        this.usersKey = usersKey;
        return this;
    }

    public ListUsersKeyResponse addUsersKeyItem(String usersKeyItem) {
        if (this.usersKey == null) {
            this.usersKey = new ArrayList<>();
        }
        this.usersKey.add(usersKeyItem);
        return this;
    }

    public ListUsersKeyResponse withUsersKey(Consumer<List<String>> usersKeySetter) {
        if (this.usersKey == null) {
            this.usersKey = new ArrayList<>();
        }
        usersKeySetter.accept(this.usersKey);
        return this;
    }

    /**
     * 用户标识
     * @return usersKey
     */
    public List<String> getUsersKey() {
        return usersKey;
    }

    public void setUsersKey(List<String> usersKey) {
        this.usersKey = usersKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUsersKeyResponse listUsersKeyResponse = (ListUsersKeyResponse) o;
        return Objects.equals(this.count, listUsersKeyResponse.count)
            && Objects.equals(this.usersKey, listUsersKeyResponse.usersKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, usersKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsersKeyResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    usersKey: ").append(toIndentedString(usersKey)).append("\n");
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
