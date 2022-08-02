package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库信息。
 */
public class ListInstancesDatastoreResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_available")

    private Boolean patchAvailable;

    public ListInstancesDatastoreResult withType(String type) {
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

    public ListInstancesDatastoreResult withVersion(String version) {
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

    public ListInstancesDatastoreResult withPatchAvailable(Boolean patchAvailable) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesDatastoreResult listInstancesDatastoreResult = (ListInstancesDatastoreResult) o;
        return Objects.equals(this.type, listInstancesDatastoreResult.type)
            && Objects.equals(this.version, listInstancesDatastoreResult.version)
            && Objects.equals(this.patchAvailable, listInstancesDatastoreResult.patchAvailable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version, patchAvailable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesDatastoreResult {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    patchAvailable: ").append(toIndentedString(patchAvailable)).append("\n");
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
