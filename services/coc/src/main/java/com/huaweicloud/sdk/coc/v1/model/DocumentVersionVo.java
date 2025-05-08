package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DocumentVersionVo
 */
public class DocumentVersionVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uuid")

    private String versionUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public DocumentVersionVo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号，如v1
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DocumentVersionVo withVersionUuid(String versionUuid) {
        this.versionUuid = versionUuid;
        return this;
    }

    /**
     * 版本id
     * @return versionUuid
     */
    public String getVersionUuid() {
        return versionUuid;
    }

    public void setVersionUuid(String versionUuid) {
        this.versionUuid = versionUuid;
    }

    public DocumentVersionVo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 版本创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentVersionVo that = (DocumentVersionVo) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.versionUuid, that.versionUuid)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, versionUuid, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentVersionVo {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionUuid: ").append(toIndentedString(versionUuid)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
