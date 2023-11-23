package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAuthorizationPrivilegesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object")

    private String _object;

    public ListAuthorizationPrivilegesRequest withObject(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * 授权对象，和授权接口中的object对应 \"jobs.flink.flink作业ID\"，查询指定的作业。 \"groups.程序包组名\"，查询指定的程序包组。 \"resources.程序包名\"，查询指定程序包。
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuthorizationPrivilegesRequest that = (ListAuthorizationPrivilegesRequest) obj;
        return Objects.equals(this._object, that._object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_object);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthorizationPrivilegesRequest {\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
