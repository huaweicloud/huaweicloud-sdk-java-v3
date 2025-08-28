package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListVulHostAppsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_container")

    private Boolean isContainer;

    public ListVulHostAppsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListVulHostAppsRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 主机id **约束限制**: 不涉及 **取值范围**: 字符长度1-128 **默认取值**: 不涉及 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListVulHostAppsRequest withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * **参数解释**: 漏洞ID **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值**: 不涉及 
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public ListVulHostAppsRequest withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * **参数解释**: 漏洞处置状态 **约束限制**: 不涉及 **取值范围**: - handled : 已处理 - unhandled : 未处理  **默认取值**: 不涉及 
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public ListVulHostAppsRequest withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**: 存在漏洞的容器ID **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ListVulHostAppsRequest withIsContainer(Boolean isContainer) {
        this.isContainer = isContainer;
        return this;
    }

    /**
     * **参数解释**: 是否是容器场景 **约束限制**: 不涉及 **取值范围**: - true：是容器场景 - false：不是容器场景  **默认取值**: 不涉及 
     * @return isContainer
     */
    public Boolean getIsContainer() {
        return isContainer;
    }

    public void setIsContainer(Boolean isContainer) {
        this.isContainer = isContainer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVulHostAppsRequest that = (ListVulHostAppsRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.vulId, that.vulId)
            && Objects.equals(this.handleStatus, that.handleStatus)
            && Objects.equals(this.containerId, that.containerId) && Objects.equals(this.isContainer, that.isContainer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, hostId, vulId, handleStatus, containerId, isContainer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVulHostAppsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    isContainer: ").append(toIndentedString(isContainer)).append("\n");
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
