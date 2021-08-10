package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** API版本详细信息列表。 */
public class ApiVersion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ApiVersion withId(String id) {
        this.id = id;
        return this;
    }

    /** API版本号，如v3。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApiVersion withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 版本状态。 取值“CURRENT”，表示该版本为主推版本。取值“SUPPORTED”，表示为老版本，但是现在还继续支持。 取值“DEPRECATED”，表示为废弃版本，存在后续删除的可能。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ApiVersion withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /** 版本发布时间。 格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指UTC时间。
     * 
     * @return updated */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ApiVersion withVersion(String version) {
        this.version = version;
        return this;
    }

    /** API的微版本，如果不支持微版本，则为空
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiVersion apiVersion = (ApiVersion) o;
        return Objects.equals(this.id, apiVersion.id) && Objects.equals(this.status, apiVersion.status)
            && Objects.equals(this.updated, apiVersion.updated) && Objects.equals(this.version, apiVersion.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, updated, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiVersion {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
