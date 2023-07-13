package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 对应linux上device概念，用于串口、AI加速卡的挂载
 */
public class ExtDevice {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cgroup_permissions")

    private String cgroupPermissions;

    public ExtDevice withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 源路径
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ExtDevice withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 卷挂载路径
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ExtDevice withCgroupPermissions(String cgroupPermissions) {
        this.cgroupPermissions = cgroupPermissions;
        return this;
    }

    /**
     * 只读，默认MRW
     * @return cgroupPermissions
     */
    public String getCgroupPermissions() {
        return cgroupPermissions;
    }

    public void setCgroupPermissions(String cgroupPermissions) {
        this.cgroupPermissions = cgroupPermissions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtDevice that = (ExtDevice) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.destination, that.destination)
            && Objects.equals(this.cgroupPermissions, that.cgroupPermissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, destination, cgroupPermissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtDevice {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    cgroupPermissions: ").append(toIndentedString(cgroupPermissions)).append("\n");
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
