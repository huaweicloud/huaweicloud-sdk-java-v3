package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库信息。
 */
public class HwcRdsDatastore {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_version")

    private String completeVersion;

    public HwcRdsDatastore withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库引擎，不区分大小写： MySQL PostgreSQL SQLServer
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HwcRdsDatastore withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 数据库版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public HwcRdsDatastore withCompleteVersion(String completeVersion) {
        this.completeVersion = completeVersion;
        return this;
    }

    /**
     * 数据库完整版本号。仅在数据库引擎是“PostgreSQL”时返回。
     * @return completeVersion
     */
    public String getCompleteVersion() {
        return completeVersion;
    }

    public void setCompleteVersion(String completeVersion) {
        this.completeVersion = completeVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HwcRdsDatastore that = (HwcRdsDatastore) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.completeVersion, that.completeVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version, completeVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HwcRdsDatastore {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    completeVersion: ").append(toIndentedString(completeVersion)).append("\n");
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
