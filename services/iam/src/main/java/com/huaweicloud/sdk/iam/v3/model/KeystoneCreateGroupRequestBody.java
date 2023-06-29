package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class KeystoneCreateGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private KeystoneCreateGroupOption group;

    public KeystoneCreateGroupRequestBody withGroup(KeystoneCreateGroupOption group) {
        this.group = group;
        return this;
    }

    public KeystoneCreateGroupRequestBody withGroup(Consumer<KeystoneCreateGroupOption> groupSetter) {
        if (this.group == null) {
            this.group = new KeystoneCreateGroupOption();
            groupSetter.accept(this.group);
        }

        return this;
    }

    /**
     * Get group
     * @return group
     */
    public KeystoneCreateGroupOption getGroup() {
        return group;
    }

    public void setGroup(KeystoneCreateGroupOption group) {
        this.group = group;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeystoneCreateGroupRequestBody that = (KeystoneCreateGroupRequestBody) obj;
        return Objects.equals(this.group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateGroupRequestBody {\n");
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
