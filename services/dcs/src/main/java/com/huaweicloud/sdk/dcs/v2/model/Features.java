package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Features
 */
public class Features {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_acl")

    private Boolean supportAcl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_transparent_client_ip")

    private Boolean supportTransparentClientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_ssl")

    private Boolean supportSsl;

    public Features withSupportAcl(Boolean supportAcl) {
        this.supportAcl = supportAcl;
        return this;
    }

    /**
     * 是否支持acl - true：是 - false：否 
     * @return supportAcl
     */
    public Boolean getSupportAcl() {
        return supportAcl;
    }

    public void setSupportAcl(Boolean supportAcl) {
        this.supportAcl = supportAcl;
    }

    public Features withSupportTransparentClientIp(Boolean supportTransparentClientIp) {
        this.supportTransparentClientIp = supportTransparentClientIp;
        return this;
    }

    /**
     * 实例是否支持客户端ip透传 - true：是 - false：否 
     * @return supportTransparentClientIp
     */
    public Boolean getSupportTransparentClientIp() {
        return supportTransparentClientIp;
    }

    public void setSupportTransparentClientIp(Boolean supportTransparentClientIp) {
        this.supportTransparentClientIp = supportTransparentClientIp;
    }

    public Features withSupportSsl(Boolean supportSsl) {
        this.supportSsl = supportSsl;
        return this;
    }

    /**
     * 是否支持SSL - true：是 - false：否 
     * @return supportSsl
     */
    public Boolean getSupportSsl() {
        return supportSsl;
    }

    public void setSupportSsl(Boolean supportSsl) {
        this.supportSsl = supportSsl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Features features = (Features) o;
        return Objects.equals(this.supportAcl, features.supportAcl)
            && Objects.equals(this.supportTransparentClientIp, features.supportTransparentClientIp)
            && Objects.equals(this.supportSsl, features.supportSsl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportAcl, supportTransparentClientIp, supportSsl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Features {\n");
        sb.append("    supportAcl: ").append(toIndentedString(supportAcl)).append("\n");
        sb.append("    supportTransparentClientIp: ").append(toIndentedString(supportTransparentClientIp)).append("\n");
        sb.append("    supportSsl: ").append(toIndentedString(supportSsl)).append("\n");
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
