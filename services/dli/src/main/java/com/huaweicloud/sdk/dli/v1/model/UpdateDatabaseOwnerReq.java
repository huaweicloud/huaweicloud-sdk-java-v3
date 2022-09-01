package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 修改数据库用户的请求body体。
 */
public class UpdateDatabaseOwnerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_owner")

    @JacksonXmlProperty(localName = "new_owner")

    private String newOwner;

    public UpdateDatabaseOwnerReq withNewOwner(String newOwner) {
        this.newOwner = newOwner;
        return this;
    }

    /**
     * 新owner名称。
     * @return newOwner
     */
    public String getNewOwner() {
        return newOwner;
    }

    public void setNewOwner(String newOwner) {
        this.newOwner = newOwner;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDatabaseOwnerReq updateDatabaseOwnerReq = (UpdateDatabaseOwnerReq) o;
        return Objects.equals(this.newOwner, updateDatabaseOwnerReq.newOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newOwner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatabaseOwnerReq {\n");
        sb.append("    newOwner: ").append(toIndentedString(newOwner)).append("\n");
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
