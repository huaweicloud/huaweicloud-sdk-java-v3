package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 沙箱类型，linux沙箱专用
 */
public class ContainerExtraLinuxInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    public ContainerExtraLinuxInfo withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * 操作系统: - ubt : ubuntu - centos : centos - debian - redhat - opensuse - kylin - uos - euleros
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerExtraLinuxInfo that = (ContainerExtraLinuxInfo) obj;
        return Objects.equals(this.os, that.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(os);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerExtraLinuxInfo {\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
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
