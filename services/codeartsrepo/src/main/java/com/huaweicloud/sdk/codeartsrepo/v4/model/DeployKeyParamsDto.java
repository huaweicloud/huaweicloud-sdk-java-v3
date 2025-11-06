package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeployKeyParamsDto
 */
public class DeployKeyParamsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    public DeployKeyParamsDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释：** 标题。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DeployKeyParamsDto withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** key值。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployKeyParamsDto that = (DeployKeyParamsDto) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployKeyParamsDto {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
