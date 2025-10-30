package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListWebAppAndServicesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogue")

    private String catalogue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_dir")

    private String installDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "part_match")

    private Boolean partMatch;

    public ListWebAppAndServicesRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListWebAppAndServicesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 默认为0 
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListWebAppAndServicesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值10-200 **默认取值**: 10 
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListWebAppAndServicesRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**: 资产类别 **约束限制**: 不涉及 **取值范围**: - host：主机资产 - container：容器资产  **默认取值**: host 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ListWebAppAndServicesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: web应用，web服务或数据库名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-256 **默认取值**: 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListWebAppAndServicesRequest withCatalogue(String catalogue) {
        this.catalogue = catalogue;
        return this;
    }

    /**
     * **参数解释**: 资产类型 **约束限制**: 不涉及 **取值范围**: - web-app：web应用 - web-service：web服务 - database：数据库  **默认取值**: 不涉及 
     * @return catalogue
     */
    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue;
    }

    public ListWebAppAndServicesRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称(可选)，可让用户根据主机名字搜索 **约束限制**: 不涉及 **取值范围**: 字符长度0-256 **默认取值**: 不涉及 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListWebAppAndServicesRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 服务器id(可选)，可让用户根据主机id搜索 **约束限制**: 不涉及 **取值范围**: 字符长度0-64 **默认取值**: 不涉及 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListWebAppAndServicesRequest withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * **参数解释**: 服务器ip(可选)，可让用户根据主机ip搜索 **约束限制**: 不涉及 **取值范围**: 字符长度0-256 **默认取值**: 不涉及 
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public ListWebAppAndServicesRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: web应用，web服务或数据库版本，可让用户根据版本搜索 **约束限制**: 不涉及 **取值范围**: 字符长度0-256 **默认取值**: 不涉及 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListWebAppAndServicesRequest withInstallDir(String installDir) {
        this.installDir = installDir;
        return this;
    }

    /**
     * **参数解释**: web应用，web服务或数据库安装目录，可让用户根据安装目录搜索 **约束限制**: 不涉及 **取值范围**: 字符长度0-256 **默认取值**: 不涉及 
     * @return installDir
     */
    public String getInstallDir() {
        return installDir;
    }

    public void setInstallDir(String installDir) {
        this.installDir = installDir;
    }

    public ListWebAppAndServicesRequest withPartMatch(Boolean partMatch) {
        this.partMatch = partMatch;
        return this;
    }

    /**
     * **参数解释**: 是否模糊匹配，默认false表示精确匹配 **约束限制**: 不涉及 **取值范围**: - true：模糊匹配 - false：精确匹配  **默认取值**: false 
     * @return partMatch
     */
    public Boolean getPartMatch() {
        return partMatch;
    }

    public void setPartMatch(Boolean partMatch) {
        this.partMatch = partMatch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWebAppAndServicesRequest that = (ListWebAppAndServicesRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.category, that.category) && Objects.equals(this.name, that.name)
            && Objects.equals(this.catalogue, that.catalogue) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.version, that.version) && Objects.equals(this.installDir, that.installDir)
            && Objects.equals(this.partMatch, that.partMatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            offset,
            limit,
            category,
            name,
            catalogue,
            hostName,
            hostId,
            hostIp,
            version,
            installDir,
            partMatch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWebAppAndServicesRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    catalogue: ").append(toIndentedString(catalogue)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    installDir: ").append(toIndentedString(installDir)).append("\n");
        sb.append("    partMatch: ").append(toIndentedString(partMatch)).append("\n");
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
