package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRealNamedResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iccid")

    private String iccid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_named")

    private Boolean realNamed;

    public ShowRealNamedResponse withIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }

    /**
     * ICCID
     * @return iccid
     */
    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public ShowRealNamedResponse withRealNamed(Boolean realNamed) {
        this.realNamed = realNamed;
        return this;
    }

    /**
     * 是否已实名认证: true表示是，false表示否。
     * @return realNamed
     */
    public Boolean getRealNamed() {
        return realNamed;
    }

    public void setRealNamed(Boolean realNamed) {
        this.realNamed = realNamed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRealNamedResponse that = (ShowRealNamedResponse) obj;
        return Objects.equals(this.iccid, that.iccid) && Objects.equals(this.realNamed, that.realNamed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iccid, realNamed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRealNamedResponse {\n");
        sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
        sb.append("    realNamed: ").append(toIndentedString(realNamed)).append("\n");
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
