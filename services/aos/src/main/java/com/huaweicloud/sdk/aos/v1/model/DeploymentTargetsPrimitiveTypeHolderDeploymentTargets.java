package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 部署目标信息。
 */
public class DeploymentTargetsPrimitiveTypeHolderDeploymentTargets {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<String> regions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ids")

    private List<String> domainIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ids_uri")

    private String domainIdsUri;

    public DeploymentTargetsPrimitiveTypeHolderDeploymentTargets withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    public DeploymentTargetsPrimitiveTypeHolderDeploymentTargets addRegionsItem(String regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public DeploymentTargetsPrimitiveTypeHolderDeploymentTargets withRegions(Consumer<List<String>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 用户指定资源栈集操作所涉及的区域。  *在DeployStackSet API中，根据用户输入regions和domain_ids列表，以笛卡尔积的形式选择资源栈集中存在的资源栈实例进行部署。如果指定了没有被资源栈集所管理的region，则会报错。*
     * @return regions
     */
    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public DeploymentTargetsPrimitiveTypeHolderDeploymentTargets withDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }

    public DeploymentTargetsPrimitiveTypeHolderDeploymentTargets addDomainIdsItem(String domainIdsItem) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        this.domainIds.add(domainIdsItem);
        return this;
    }

    public DeploymentTargetsPrimitiveTypeHolderDeploymentTargets withDomainIds(Consumer<List<String>> domainIdsSetter) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        domainIdsSetter.accept(this.domainIds);
        return this;
    }

    /**
     * 权限模型是SELF_MANAGED时，用户指定包含本次操作涉及到的租户ID内容。  *在DeployStackSet API中，如果指定该参数，根据用户输入的domain_ids列表和regions列表，以笛卡尔积的形式选择资源栈集中存在的资源栈实例进行部署。如果指定了没有被资源栈集所管理的domain_id，则会报错。*  domain_ids和domain_ids_uri 有且仅有一个存在。
     * @return domainIds
     */
    public List<String> getDomainIds() {
        return domainIds;
    }

    public void setDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
    }

    public DeploymentTargetsPrimitiveTypeHolderDeploymentTargets withDomainIdsUri(String domainIdsUri) {
        this.domainIdsUri = domainIdsUri;
        return this;
    }

    /**
     * 权限模型是SELF_MANAGED时，用户指定包含本次操作涉及到的租户ID内容文件的OBS地址。  内容格式要求每个租户ID以逗号（,）分割，支持换行。当前仅支持csv文件，且文件的编码格式须为UTF-8。文件内容大小不超过100KB。  上传的csv文件应尽量避免Excel操作，以防出现读取内容不一致的问题。推荐使用记事本打开确认内容是否符合预期。  *在DeployStackSet API中，如果指定该参数，根据用户输入的domain_ids_uri文件内容和regions列表，以笛卡尔积的形式选择资源栈集中存在的资源栈实例进行部署。如果内容包含了没有被资源栈集所管理的domain_id，则会报错。*  domain_ids和domain_ids_uri有且仅有一个存在。
     * @return domainIdsUri
     */
    public String getDomainIdsUri() {
        return domainIdsUri;
    }

    public void setDomainIdsUri(String domainIdsUri) {
        this.domainIdsUri = domainIdsUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeploymentTargetsPrimitiveTypeHolderDeploymentTargets that =
            (DeploymentTargetsPrimitiveTypeHolderDeploymentTargets) obj;
        return Objects.equals(this.regions, that.regions) && Objects.equals(this.domainIds, that.domainIds)
            && Objects.equals(this.domainIdsUri, that.domainIdsUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions, domainIds, domainIdsUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentTargetsPrimitiveTypeHolderDeploymentTargets {\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    domainIds: ").append(toIndentedString(domainIds)).append("\n");
        sb.append("    domainIdsUri: ").append(toIndentedString(domainIdsUri)).append("\n");
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
