package com.huaweicloud.sdk.iotedge.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * license信息
 */
public class LicenseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "esn")

    private String esn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grace_time")

    private String graceTime;

    public LicenseInfo withEsn(String esn) {
        this.esn = esn;
        return this;
    }

    /**
     * esn码
     * @return esn
     */
    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public LicenseInfo withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 超期时间
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public LicenseInfo withGraceTime(String graceTime) {
        this.graceTime = graceTime;
        return this;
    }

    /**
     * 宽限期
     * @return graceTime
     */
    public String getGraceTime() {
        return graceTime;
    }

    public void setGraceTime(String graceTime) {
        this.graceTime = graceTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LicenseInfo that = (LicenseInfo) obj;
        return Objects.equals(this.esn, that.esn) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.graceTime, that.graceTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(esn, expireTime, graceTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LicenseInfo {\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    graceTime: ").append(toIndentedString(graceTime)).append("\n");
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
