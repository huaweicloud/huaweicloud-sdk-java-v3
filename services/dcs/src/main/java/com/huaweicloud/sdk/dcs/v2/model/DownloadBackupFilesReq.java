package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** DownloadBackupFilesReq */
public class DownloadBackupFilesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration")

    private Integer expiration;

    public DownloadBackupFilesReq withExpiration(Integer expiration) {
        this.expiration = expiration;
        return this;
    }

    /** 设置URL的有效期，必须在5分钟和24小时之内，单位为秒。
     * 
     * @return expiration */
    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadBackupFilesReq downloadBackupFilesReq = (DownloadBackupFilesReq) o;
        return Objects.equals(this.expiration, downloadBackupFilesReq.expiration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expiration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadBackupFilesReq {\n");
        sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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
