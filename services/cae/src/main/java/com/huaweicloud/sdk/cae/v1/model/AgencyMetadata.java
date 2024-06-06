package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 请求数据。
 */
public class AgencyMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum")

    private Object _enum;

    public AgencyMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 委托名称，固定值“cae_trust”，该值不可修改。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgencyMetadata withEnum(Object _enum) {
        this._enum = _enum;
        return this;
    }

    /**
     * Get _enum
     * @return _enum
     */
    public Object getEnum() {
        return _enum;
    }

    public void setEnum(Object _enum) {
        this._enum = _enum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgencyMetadata that = (AgencyMetadata) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this._enum, that._enum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, _enum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
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
