package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据搜索引擎类型。
 */
public class ClusterListDatastore {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supportSecuritymode")

    private Boolean supportSecuritymode;

    public ClusterListDatastore withType(String type) {
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

    public ClusterListDatastore withVersion(String version) {
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

    public ClusterListDatastore withSupportSecuritymode(Boolean supportSecuritymode) {
        this.supportSecuritymode = supportSecuritymode;
        return this;
    }

    /**
     * 是否支持安全模式
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
        ClusterListDatastore that = (ClusterListDatastore) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.supportSecuritymode, that.supportSecuritymode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version, supportSecuritymode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterListDatastore {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
