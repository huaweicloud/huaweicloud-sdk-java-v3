package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** RestorePtrReq */
public class RestorePtrReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ptrdname")

    private String ptrdname;

    public RestorePtrReq withPtrdname(String ptrdname) {
        this.ptrdname = ptrdname;
        return this;
    }

    /** PTR记录对应的域名。 此处值为null。
     * 
     * @return ptrdname */
    public String getPtrdname() {
        return ptrdname;
    }

    public void setPtrdname(String ptrdname) {
        this.ptrdname = ptrdname;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestorePtrReq restorePtrReq = (RestorePtrReq) o;
        return Objects.equals(this.ptrdname, restorePtrReq.ptrdname);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
