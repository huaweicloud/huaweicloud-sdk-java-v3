package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RestorePtrReq
 */
public class RestorePtrReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ptrdname")

    private Object ptrdname;

    public RestorePtrReq withPtrdname(Object ptrdname) {
        this.ptrdname = ptrdname;
        return this;
    }

    /**
     * PTR记录对应的域名。  此处值为null。
     * @return ptrdname
     */
    public Object getPtrdname() {
        return ptrdname;
    }

    public void setPtrdname(Object ptrdname) {
        this.ptrdname = ptrdname;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestorePtrReq that = (RestorePtrReq) obj;
        return Objects.equals(this.ptrdname, that.ptrdname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ptrdname);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestorePtrReq {\n");
        sb.append("    ptrdname: ").append(toIndentedString(ptrdname)).append("\n");
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
