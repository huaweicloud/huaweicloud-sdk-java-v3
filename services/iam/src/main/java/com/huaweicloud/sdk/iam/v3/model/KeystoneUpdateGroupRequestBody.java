package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class KeystoneUpdateGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    @JacksonXmlProperty(localName = "group")

    private KeystoneUpdateGroupOption group;

    public KeystoneUpdateGroupRequestBody withGroup(KeystoneUpdateGroupOption group) {
        this.group = group;
        return this;
    }

    public KeystoneUpdateGroupRequestBody withGroup(Consumer<KeystoneUpdateGroupOption> groupSetter) {
        if (this.group == null) {
            this.group = new KeystoneUpdateGroupOption();
            groupSetter.accept(this.group);
        }

        return this;
    }

    /**
     * Get group
     * @return group
     */
    public KeystoneUpdateGroupOption getGroup() {
        return group;
    }

    public void setGroup(KeystoneUpdateGroupOption group) {
        this.group = group;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneUpdateGroupRequestBody keystoneUpdateGroupRequestBody = (KeystoneUpdateGroupRequestBody) o;
        return Objects.equals(this.group, keystoneUpdateGroupRequestBody.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateGroupRequestBody {\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
