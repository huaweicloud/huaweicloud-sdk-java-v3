package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库信息。
 */
public class MysqlDatastoreInReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_version")

    private String kernelVersion;

    public MysqlDatastoreInReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库引擎，现在只支持gaussdb-mysql。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MysqlDatastoreInReq withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 数据库版本。  两位数的大版本号，获取方法请参见[查询数据库引擎的版本](https://support.huaweicloud.com/api-gaussdbformysql/ShowGaussMySqlEngineVersion.html)返回的name字段。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MysqlDatastoreInReq withKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    /**
     * 内核数据库版本。如果需要指定具体的内核版本，请联系客服人员添加白名单。  完整的四位内核数据库版本，获取方法请参见[查询数据库引擎的版本](https://support.huaweicloud.com/api-gaussdbformysql/ShowGaussMySqlEngineVersion.html)返回的kernel_version字段。
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MysqlDatastoreInReq that = (MysqlDatastoreInReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.kernelVersion, that.kernelVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version, kernelVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlDatastoreInReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
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
