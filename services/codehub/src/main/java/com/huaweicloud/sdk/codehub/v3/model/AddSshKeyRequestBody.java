package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** AddSshKeyRequestBody */
public class AddSshKeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    public AddSshKeyRequestBody withKey(String key) {
        this.key = key;
        return this;
    }

    /** 密钥
     * 
     * @return key */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AddSshKeyRequestBody withTitle(String title) {
        this.title = title;
        return this;
    }

    /** 密钥名称
     * 
     * @return title */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddSshKeyRequestBody addSshKeyRequestBody = (AddSshKeyRequestBody) o;
        return Objects.equals(this.key, addSshKeyRequestBody.key)
            && Objects.equals(this.title, addSshKeyRequestBody.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddSshKeyRequestBody {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
