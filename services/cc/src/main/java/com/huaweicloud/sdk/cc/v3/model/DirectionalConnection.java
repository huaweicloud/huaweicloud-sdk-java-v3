package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 有向连接
 */
public class DirectionalConnection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_site_code")

    private String localSiteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_site_code")

    private String remoteSiteCode;

    public DirectionalConnection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DirectionalConnection withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DirectionalConnection withLocalSiteCode(String localSiteCode) {
        this.localSiteCode = localSiteCode;
        return this;
    }

    /**
     * 功能说明：本端接入点的编码。
     * @return localSiteCode
     */
    public String getLocalSiteCode() {
        return localSiteCode;
    }

    public void setLocalSiteCode(String localSiteCode) {
        this.localSiteCode = localSiteCode;
    }

    public DirectionalConnection withRemoteSiteCode(String remoteSiteCode) {
        this.remoteSiteCode = remoteSiteCode;
        return this;
    }

    /**
     * 功能说明：远端接入点的编码。
     * @return remoteSiteCode
     */
    public String getRemoteSiteCode() {
        return remoteSiteCode;
    }

    public void setRemoteSiteCode(String remoteSiteCode) {
        this.remoteSiteCode = remoteSiteCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DirectionalConnection that = (DirectionalConnection) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.localSiteCode, that.localSiteCode)
            && Objects.equals(this.remoteSiteCode, that.remoteSiteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, localSiteCode, remoteSiteCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectionalConnection {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localSiteCode: ").append(toIndentedString(localSiteCode)).append("\n");
        sb.append("    remoteSiteCode: ").append(toIndentedString(remoteSiteCode)).append("\n");
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
