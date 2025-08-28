package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SystemSecurityPolicy
 */
public class SystemSecurityPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocols")

    private String protocols;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ciphers")

    private String ciphers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public SystemSecurityPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：系统安全策略的名称。  **取值范围**：不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SystemSecurityPolicy withProtocols(String protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * **参数解释**：系统安全策略的TLS协议列表。  **取值范围**：不涉及
     * @return protocols
     */
    public String getProtocols() {
        return protocols;
    }

    public void setProtocols(String protocols) {
        this.protocols = protocols;
    }

    public SystemSecurityPolicy withCiphers(String ciphers) {
        this.ciphers = ciphers;
        return this;
    }

    /**
     * **参数解释**：系统安全策略的加密套件列表。  **取值范围**：不涉及
     * @return ciphers
     */
    public String getCiphers() {
        return ciphers;
    }

    public void setCiphers(String ciphers) {
        this.ciphers = ciphers;
    }

    public SystemSecurityPolicy withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：项目ID。获取方式请参见[获取项目ID](elb_fl_0008.xml)。  **取值范围**：长度为32个字符，由小写字母和数字组成。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SystemSecurityPolicy that = (SystemSecurityPolicy) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.protocols, that.protocols)
            && Objects.equals(this.ciphers, that.ciphers) && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, protocols, ciphers, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemSecurityPolicy {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
        sb.append("    ciphers: ").append(toIndentedString(ciphers)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
