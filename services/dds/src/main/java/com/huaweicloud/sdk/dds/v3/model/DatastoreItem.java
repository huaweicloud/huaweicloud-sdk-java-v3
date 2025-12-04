package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库信息。
 */
public class DatastoreItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_available")

    private Boolean patchAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whole_version")

    private String wholeVersion;

    public DatastoreItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库引擎。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DatastoreItem withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 数据库版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DatastoreItem withPatchAvailable(Boolean patchAvailable) {
        this.patchAvailable = patchAvailable;
        return this;
    }

    /**
     * 是否有补丁版本的数据库支持升级，返回true时可以通过升级补丁接口进行数据库升级，否则不允许升级补丁。
     * @return patchAvailable
     */
    public Boolean getPatchAvailable() {
        return patchAvailable;
    }

    public void setPatchAvailable(Boolean patchAvailable) {
        this.patchAvailable = patchAvailable;
    }

    public DatastoreItem withWholeVersion(String wholeVersion) {
        this.wholeVersion = wholeVersion;
        return this;
    }

    /**
     * 数据库的完整版本号。
     * @return wholeVersion
     */
    public String getWholeVersion() {
        return wholeVersion;
    }

    public void setWholeVersion(String wholeVersion) {
        this.wholeVersion = wholeVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatastoreItem that = (DatastoreItem) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.patchAvailable, that.patchAvailable)
            && Objects.equals(this.wholeVersion, that.wholeVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version, patchAvailable, wholeVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatastoreItem {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    patchAvailable: ").append(toIndentedString(patchAvailable)).append("\n");
        sb.append("    wholeVersion: ").append(toIndentedString(wholeVersion)).append("\n");
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
