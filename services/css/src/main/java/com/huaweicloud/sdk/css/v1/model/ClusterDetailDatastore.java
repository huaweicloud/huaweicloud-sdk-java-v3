package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据搜索引擎类型。
 */
public class ClusterDetailDatastore {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subVersion")

    private String subVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isEosCluster")

    private Boolean isEosCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supportSecuritymode")

    private Boolean supportSecuritymode;

    public ClusterDetailDatastore withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 引擎类型，目前只支持elasticsearch。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClusterDetailDatastore withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * CSS集群引擎版本号。详细请参考CSS[支持的集群版本](css_03_0056.xml)。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClusterDetailDatastore withSubVersion(String subVersion) {
        this.subVersion = subVersion;
        return this;
    }

    /**
     * 集群发布版本号。
     * @return subVersion
     */
    public String getSubVersion() {
        return subVersion;
    }

    public void setSubVersion(String subVersion) {
        this.subVersion = subVersion;
    }

    public ClusterDetailDatastore withIsEosCluster(Boolean isEosCluster) {
        this.isEosCluster = isEosCluster;
        return this;
    }

    /**
     * 表示集群发布版本是否EOS。
     * @return isEosCluster
     */
    public Boolean getIsEosCluster() {
        return isEosCluster;
    }

    public void setIsEosCluster(Boolean isEosCluster) {
        this.isEosCluster = isEosCluster;
    }

    public ClusterDetailDatastore withSupportSecuritymode(Boolean supportSecuritymode) {
        this.supportSecuritymode = supportSecuritymode;
        return this;
    }

    /**
     * 集群认证是否支持安全模式。
     * @return supportSecuritymode
     */
    public Boolean getSupportSecuritymode() {
        return supportSecuritymode;
    }

    public void setSupportSecuritymode(Boolean supportSecuritymode) {
        this.supportSecuritymode = supportSecuritymode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterDetailDatastore that = (ClusterDetailDatastore) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.subVersion, that.subVersion) && Objects.equals(this.isEosCluster, that.isEosCluster)
            && Objects.equals(this.supportSecuritymode, that.supportSecuritymode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version, subVersion, isEosCluster, supportSecuritymode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterDetailDatastore {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    subVersion: ").append(toIndentedString(subVersion)).append("\n");
        sb.append("    isEosCluster: ").append(toIndentedString(isEosCluster)).append("\n");
        sb.append("    supportSecuritymode: ").append(toIndentedString(supportSecuritymode)).append("\n");
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
