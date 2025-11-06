package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateRouteRequestBody
 */
public class UpdateRouteRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configtype")

    private String configtype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configkey")

    private String configkey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configvalue")

    private String configvalue;

    public UpdateRouteRequestBody withConfigtype(String configtype) {
        this.configtype = configtype;
        return this;
    }

    /**
     * 操作类型。add_ip为增加集群路由，del_ip为删除集群路由。
     * @return configtype
     */
    public String getConfigtype() {
        return configtype;
    }

    public void setConfigtype(String configtype) {
        this.configtype = configtype;
    }

    public UpdateRouteRequestBody withConfigkey(String configkey) {
        this.configkey = configkey;
        return this;
    }

    /**
     * 路由ip地址，公网源数据所在的服务器ip。不能以0开头。
     * @return configkey
     */
    public String getConfigkey() {
        return configkey;
    }

    public void setConfigkey(String configkey) {
        this.configkey = configkey;
    }

    public UpdateRouteRequestBody withConfigvalue(String configvalue) {
        this.configvalue = configvalue;
        return this;
    }

    /**
     * 路由子网掩码。如果上面ip取的是16位，子网掩码可以填255.255.0.0，24位的话子网掩码填255.255.255.0
     * @return configvalue
     */
    public String getConfigvalue() {
        return configvalue;
    }

    public void setConfigvalue(String configvalue) {
        this.configvalue = configvalue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRouteRequestBody that = (UpdateRouteRequestBody) obj;
        return Objects.equals(this.configtype, that.configtype) && Objects.equals(this.configkey, that.configkey)
            && Objects.equals(this.configvalue, that.configvalue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configtype, configkey, configvalue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRouteRequestBody {\n");
        sb.append("    configtype: ").append(toIndentedString(configtype)).append("\n");
        sb.append("    configkey: ").append(toIndentedString(configkey)).append("\n");
        sb.append("    configvalue: ").append(toIndentedString(configvalue)).append("\n");
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
