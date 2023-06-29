package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * change_name对象
 */
public class ChangeShareNameReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_name")

    private ShareName changeName;

    public ChangeShareNameReq withChangeName(ShareName changeName) {
        this.changeName = changeName;
        return this;
    }

    public ChangeShareNameReq withChangeName(Consumer<ShareName> changeNameSetter) {
        if (this.changeName == null) {
            this.changeName = new ShareName();
            changeNameSetter.accept(this.changeName);
        }

        return this;
    }

    /**
     * Get changeName
     * @return changeName
     */
    public ShareName getChangeName() {
        return changeName;
    }

    public void setChangeName(ShareName changeName) {
        this.changeName = changeName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeShareNameReq that = (ChangeShareNameReq) obj;
        return Objects.equals(this.changeName, that.changeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeShareNameReq {\n");
        sb.append("    changeName: ").append(toIndentedString(changeName)).append("\n");
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
