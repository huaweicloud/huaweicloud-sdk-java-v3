package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowVulAffectedStaticsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_type")

    private String selectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_ids")

    private List<String> containerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_container")

    private Boolean isContainer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_ids")

    private List<String> vulIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ids")

    private List<String> hostIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    public ShowVulAffectedStaticsRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowVulAffectedStaticsRequest withSelectType(String selectType) {
        this.selectType = selectType;
        return this;
    }

    /**
     * **参数解释**: 选择全部漏洞类型 **约束限制**: 不涉及 **取值范围**: - all_vul：选择全部漏洞 - all_host：选择全部主机漏洞  **默认取值**: 不涉及 
     * @return selectType
     */
    public String getSelectType() {
        return selectType;
    }

    public void setSelectType(String selectType) {
        this.selectType = selectType;
    }

    public ShowVulAffectedStaticsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 漏洞类型，当前select_type为all_vul此字段为必选 **约束限制**: 不涉及 **取值范围**: - linux_vul：linux漏洞 - windows_vul：windows漏洞 - web_cms：Web-CMS漏洞 - app_vul：应用漏洞 - urgent_vul：应急漏洞 - cluster_vul：集群漏洞  **默认取值**: 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowVulAffectedStaticsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**: 集群id **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值**: 不涉及 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowVulAffectedStaticsRequest withContainerIds(List<String> containerIds) {
        this.containerIds = containerIds;
        return this;
    }

    public ShowVulAffectedStaticsRequest addContainerIdsItem(String containerIdsItem) {
        if (this.containerIds == null) {
            this.containerIds = new ArrayList<>();
        }
        this.containerIds.add(containerIdsItem);
        return this;
    }

    public ShowVulAffectedStaticsRequest withContainerIds(Consumer<List<String>> containerIdsSetter) {
        if (this.containerIds == null) {
            this.containerIds = new ArrayList<>();
        }
        containerIdsSetter.accept(this.containerIds);
        return this;
    }

    /**
     * **参数解释**: 容器id集合 **约束限制**: 不涉及 **取值范围**: 最小值1，最大值1000 **默认取值**: 不涉及 
     * @return containerIds
     */
    public List<String> getContainerIds() {
        return containerIds;
    }

    public void setContainerIds(List<String> containerIds) {
        this.containerIds = containerIds;
    }

    public ShowVulAffectedStaticsRequest withIsContainer(Boolean isContainer) {
        this.isContainer = isContainer;
        return this;
    }

    /**
     * **参数解释**: 是否是容器场景 **约束限制**: 不涉及 **取值范围**: - true：是容器场景 - false：不是容器场景 **默认取值**: false 
     * @return isContainer
     */
    public Boolean getIsContainer() {
        return isContainer;
    }

    public void setIsContainer(Boolean isContainer) {
        this.isContainer = isContainer;
    }

    public ShowVulAffectedStaticsRequest withVulIds(List<String> vulIds) {
        this.vulIds = vulIds;
        return this;
    }

    public ShowVulAffectedStaticsRequest addVulIdsItem(String vulIdsItem) {
        if (this.vulIds == null) {
            this.vulIds = new ArrayList<>();
        }
        this.vulIds.add(vulIdsItem);
        return this;
    }

    public ShowVulAffectedStaticsRequest withVulIds(Consumer<List<String>> vulIdsSetter) {
        if (this.vulIds == null) {
            this.vulIds = new ArrayList<>();
        }
        vulIdsSetter.accept(this.vulIds);
        return this;
    }

    /**
     * **参数解释**: 漏洞id集合 **约束限制**: 不涉及 **取值范围**: 最小值1，最大值1000 **默认取值**: 不涉及 
     * @return vulIds
     */
    public List<String> getVulIds() {
        return vulIds;
    }

    public void setVulIds(List<String> vulIds) {
        this.vulIds = vulIds;
    }

    public ShowVulAffectedStaticsRequest withHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }

    public ShowVulAffectedStaticsRequest addHostIdsItem(String hostIdsItem) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        this.hostIds.add(hostIdsItem);
        return this;
    }

    public ShowVulAffectedStaticsRequest withHostIds(Consumer<List<String>> hostIdsSetter) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        hostIdsSetter.accept(this.hostIds);
        return this;
    }

    /**
     * **参数解释**: 主机id集合 **约束限制**: 不涉及 **取值范围**: 最小值1，最大值1000 **默认取值**: 不涉及 
     * @return hostIds
     */
    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    public ShowVulAffectedStaticsRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**: 类别，默认为host **约束限制**: 不涉及 **取值范围**: - host：主机 - container：容器 - serverless：serverless场景  **默认取值**: host 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulAffectedStaticsRequest that = (ShowVulAffectedStaticsRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.selectType, that.selectType) && Objects.equals(this.type, that.type)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.containerIds, that.containerIds)
            && Objects.equals(this.isContainer, that.isContainer) && Objects.equals(this.vulIds, that.vulIds)
            && Objects.equals(this.hostIds, that.hostIds) && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            selectType,
            type,
            clusterId,
            containerIds,
            isContainer,
            vulIds,
            hostIds,
            category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulAffectedStaticsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    selectType: ").append(toIndentedString(selectType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    containerIds: ").append(toIndentedString(containerIds)).append("\n");
        sb.append("    isContainer: ").append(toIndentedString(isContainer)).append("\n");
        sb.append("    vulIds: ").append(toIndentedString(vulIds)).append("\n");
        sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
