package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HsmClusterInfo
 */
public class HsmClusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hsm_project")

    private String hsmProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hsm_cluster_id")

    private String hsmClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hsm_ca_cert")

    private String hsmCaCert;

    public HsmClusterInfo withHsmProject(String hsmProject) {
        this.hsmProject = hsmProject;
        return this;
    }

    /**
     * 项目信息
     * @return hsmProject
     */
    public String getHsmProject() {
        return hsmProject;
    }

    public void setHsmProject(String hsmProject) {
        this.hsmProject = hsmProject;
    }

    public HsmClusterInfo withHsmClusterId(String hsmClusterId) {
        this.hsmClusterId = hsmClusterId;
        return this;
    }

    /**
     * 加密机集群标识符
     * @return hsmClusterId
     */
    public String getHsmClusterId() {
        return hsmClusterId;
    }

    public void setHsmClusterId(String hsmClusterId) {
        this.hsmClusterId = hsmClusterId;
    }

    public HsmClusterInfo withHsmCaCert(String hsmCaCert) {
        this.hsmCaCert = hsmCaCert;
        return this;
    }

    /**
     * pem格式证书base64之后的字符串
     * @return hsmCaCert
     */
    public String getHsmCaCert() {
        return hsmCaCert;
    }

    public void setHsmCaCert(String hsmCaCert) {
        this.hsmCaCert = hsmCaCert;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HsmClusterInfo that = (HsmClusterInfo) obj;
        return Objects.equals(this.hsmProject, that.hsmProject) && Objects.equals(this.hsmClusterId, that.hsmClusterId)
            && Objects.equals(this.hsmCaCert, that.hsmCaCert);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hsmProject, hsmClusterId, hsmCaCert);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HsmClusterInfo {\n");
        sb.append("    hsmProject: ").append(toIndentedString(hsmProject)).append("\n");
        sb.append("    hsmClusterId: ").append(toIndentedString(hsmClusterId)).append("\n");
        sb.append("    hsmCaCert: ").append(toIndentedString(hsmCaCert)).append("\n");
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
