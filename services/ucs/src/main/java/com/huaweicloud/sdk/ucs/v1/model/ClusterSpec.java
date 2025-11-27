package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ClusterSpec
 */
public class ClusterSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syncMode")

    private String syncMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterGroupID")

    private String clusterGroupID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manageType")

    private String manageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleNamespaces")

    private List<RuleNamespace> ruleNamespaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiEndpoint")

    private String apiEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secretRef")

    private LocalSecretReference secretRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insecureSkipTLSVerification")

    private Boolean insecureSkipTLSVerification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxyURL")

    private String proxyURL;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableDistMgt")

    private Boolean enableDistMgt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectID")

    private String projectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectName")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone")

    private String zone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taints")

    private List<Taint> taints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IsDownloadedCert")

    private Boolean isDownloadedCert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyId")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operatorNamespace")

    private String operatorNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connectProxyEndpoints")

    private List<ConnectEndpoint> connectProxyEndpoints = null;

    public ClusterSpec withSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }

    /**
     * 集群和karmada控制面之间的同步模式
     * @return syncMode
     */
    public String getSyncMode() {
        return syncMode;
    }

    public void setSyncMode(String syncMode) {
        this.syncMode = syncMode;
    }

    public ClusterSpec withClusterGroupID(String clusterGroupID) {
        this.clusterGroupID = clusterGroupID;
        return this;
    }

    /**
     * 容器舰队id
     * @return clusterGroupID
     */
    public String getClusterGroupID() {
        return clusterGroupID;
    }

    public void setClusterGroupID(String clusterGroupID) {
        this.clusterGroupID = clusterGroupID;
    }

    public ClusterSpec withManageType(String manageType) {
        this.manageType = manageType;
        return this;
    }

    /**
     * 集群类型，取值如下： - grouped：在舰队中纳管的集群 - discrete：未加入舰队的集群 
     * @return manageType
     */
    public String getManageType() {
        return manageType;
    }

    public void setManageType(String manageType) {
        this.manageType = manageType;
    }

    public ClusterSpec withRuleNamespaces(List<RuleNamespace> ruleNamespaces) {
        this.ruleNamespaces = ruleNamespaces;
        return this;
    }

    public ClusterSpec addRuleNamespacesItem(RuleNamespace ruleNamespacesItem) {
        if (this.ruleNamespaces == null) {
            this.ruleNamespaces = new ArrayList<>();
        }
        this.ruleNamespaces.add(ruleNamespacesItem);
        return this;
    }

    public ClusterSpec withRuleNamespaces(Consumer<List<RuleNamespace>> ruleNamespacesSetter) {
        if (this.ruleNamespaces == null) {
            this.ruleNamespaces = new ArrayList<>();
        }
        ruleNamespacesSetter.accept(this.ruleNamespaces);
        return this;
    }

    /**
     * 集群包含的RuleNamespace列表
     * @return ruleNamespaces
     */
    public List<RuleNamespace> getRuleNamespaces() {
        return ruleNamespaces;
    }

    public void setRuleNamespaces(List<RuleNamespace> ruleNamespaces) {
        this.ruleNamespaces = ruleNamespaces;
    }

    public ClusterSpec withApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }

    /**
     * apiserver地址
     * @return apiEndpoint
     */
    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    public ClusterSpec withSecretRef(LocalSecretReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public ClusterSpec withSecretRef(Consumer<LocalSecretReference> secretRefSetter) {
        if (this.secretRef == null) {
            this.secretRef = new LocalSecretReference();
            secretRefSetter.accept(this.secretRef);
        }

        return this;
    }

    /**
     * Get secretRef
     * @return secretRef
     */
    public LocalSecretReference getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(LocalSecretReference secretRef) {
        this.secretRef = secretRef;
    }

    public ClusterSpec withInsecureSkipTLSVerification(Boolean insecureSkipTLSVerification) {
        this.insecureSkipTLSVerification = insecureSkipTLSVerification;
        return this;
    }

    /**
     * 是否跳过https校验
     * @return insecureSkipTLSVerification
     */
    public Boolean getInsecureSkipTLSVerification() {
        return insecureSkipTLSVerification;
    }

    public void setInsecureSkipTLSVerification(Boolean insecureSkipTLSVerification) {
        this.insecureSkipTLSVerification = insecureSkipTLSVerification;
    }

    public ClusterSpec withProxyURL(String proxyURL) {
        this.proxyURL = proxyURL;
        return this;
    }

    /**
     * 代理链接
     * @return proxyURL
     */
    public String getProxyURL() {
        return proxyURL;
    }

    public void setProxyURL(String proxyURL) {
        this.proxyURL = proxyURL;
    }

    public ClusterSpec withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 提供商
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ClusterSpec withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClusterSpec withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 类别
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ClusterSpec withEnableDistMgt(Boolean enableDistMgt) {
        this.enableDistMgt = enableDistMgt;
        return this;
    }

    /**
     * CCE Turbo集群是否支持管理边缘基础设施。
     * @return enableDistMgt
     */
    public Boolean getEnableDistMgt() {
        return enableDistMgt;
    }

    public void setEnableDistMgt(Boolean enableDistMgt) {
        this.enableDistMgt = enableDistMgt;
    }

    public ClusterSpec withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ClusterSpec withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 国家
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ClusterSpec withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 城市
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ClusterSpec withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * 项目id
     * @return projectID
     */
    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public ClusterSpec withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ClusterSpec withZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * 地区
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public ClusterSpec withTaints(List<Taint> taints) {
        this.taints = taints;
        return this;
    }

    public ClusterSpec addTaintsItem(Taint taintsItem) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        this.taints.add(taintsItem);
        return this;
    }

    public ClusterSpec withTaints(Consumer<List<Taint>> taintsSetter) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        taintsSetter.accept(this.taints);
        return this;
    }

    /**
     * 污点
     * @return taints
     */
    public List<Taint> getTaints() {
        return taints;
    }

    public void setTaints(List<Taint> taints) {
        this.taints = taints;
    }

    public ClusterSpec withIsDownloadedCert(Boolean isDownloadedCert) {
        this.isDownloadedCert = isDownloadedCert;
        return this;
    }

    /**
     * 是否已经下载过证书
     * @return isDownloadedCert
     */
    public Boolean getIsDownloadedCert() {
        return isDownloadedCert;
    }

    public void setIsDownloadedCert(Boolean isDownloadedCert) {
        this.isDownloadedCert = isDownloadedCert;
    }

    public ClusterSpec withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略管理id
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ClusterSpec withOperatorNamespace(String operatorNamespace) {
        this.operatorNamespace = operatorNamespace;
        return this;
    }

    /**
     * 集群所属domainID
     * @return operatorNamespace
     */
    public String getOperatorNamespace() {
        return operatorNamespace;
    }

    public void setOperatorNamespace(String operatorNamespace) {
        this.operatorNamespace = operatorNamespace;
    }

    public ClusterSpec withConnectProxyEndpoints(List<ConnectEndpoint> connectProxyEndpoints) {
        this.connectProxyEndpoints = connectProxyEndpoints;
        return this;
    }

    public ClusterSpec addConnectProxyEndpointsItem(ConnectEndpoint connectProxyEndpointsItem) {
        if (this.connectProxyEndpoints == null) {
            this.connectProxyEndpoints = new ArrayList<>();
        }
        this.connectProxyEndpoints.add(connectProxyEndpointsItem);
        return this;
    }

    public ClusterSpec withConnectProxyEndpoints(Consumer<List<ConnectEndpoint>> connectProxyEndpointsSetter) {
        if (this.connectProxyEndpoints == null) {
            this.connectProxyEndpoints = new ArrayList<>();
        }
        connectProxyEndpointsSetter.accept(this.connectProxyEndpoints);
        return this;
    }

    /**
     * 连接代理服务器的终端节点服务ID列表，仅非华为云集群返回该字段
     * @return connectProxyEndpoints
     */
    public List<ConnectEndpoint> getConnectProxyEndpoints() {
        return connectProxyEndpoints;
    }

    public void setConnectProxyEndpoints(List<ConnectEndpoint> connectProxyEndpoints) {
        this.connectProxyEndpoints = connectProxyEndpoints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterSpec that = (ClusterSpec) obj;
        return Objects.equals(this.syncMode, that.syncMode) && Objects.equals(this.clusterGroupID, that.clusterGroupID)
            && Objects.equals(this.manageType, that.manageType)
            && Objects.equals(this.ruleNamespaces, that.ruleNamespaces)
            && Objects.equals(this.apiEndpoint, that.apiEndpoint) && Objects.equals(this.secretRef, that.secretRef)
            && Objects.equals(this.insecureSkipTLSVerification, that.insecureSkipTLSVerification)
            && Objects.equals(this.proxyURL, that.proxyURL) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.type, that.type) && Objects.equals(this.category, that.category)
            && Objects.equals(this.enableDistMgt, that.enableDistMgt) && Objects.equals(this.region, that.region)
            && Objects.equals(this.country, that.country) && Objects.equals(this.city, that.city)
            && Objects.equals(this.projectID, that.projectID) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.zone, that.zone) && Objects.equals(this.taints, that.taints)
            && Objects.equals(this.isDownloadedCert, that.isDownloadedCert)
            && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.operatorNamespace, that.operatorNamespace)
            && Objects.equals(this.connectProxyEndpoints, that.connectProxyEndpoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncMode,
            clusterGroupID,
            manageType,
            ruleNamespaces,
            apiEndpoint,
            secretRef,
            insecureSkipTLSVerification,
            proxyURL,
            provider,
            type,
            category,
            enableDistMgt,
            region,
            country,
            city,
            projectID,
            projectName,
            zone,
            taints,
            isDownloadedCert,
            policyId,
            operatorNamespace,
            connectProxyEndpoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterSpec {\n");
        sb.append("    syncMode: ").append(toIndentedString(syncMode)).append("\n");
        sb.append("    clusterGroupID: ").append(toIndentedString(clusterGroupID)).append("\n");
        sb.append("    manageType: ").append(toIndentedString(manageType)).append("\n");
        sb.append("    ruleNamespaces: ").append(toIndentedString(ruleNamespaces)).append("\n");
        sb.append("    apiEndpoint: ").append(toIndentedString(apiEndpoint)).append("\n");
        sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
        sb.append("    insecureSkipTLSVerification: ")
            .append(toIndentedString(insecureSkipTLSVerification))
            .append("\n");
        sb.append("    proxyURL: ").append(toIndentedString(proxyURL)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    enableDistMgt: ").append(toIndentedString(enableDistMgt)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
        sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
        sb.append("    isDownloadedCert: ").append(toIndentedString(isDownloadedCert)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    operatorNamespace: ").append(toIndentedString(operatorNamespace)).append("\n");
        sb.append("    connectProxyEndpoints: ").append(toIndentedString(connectProxyEndpoints)).append("\n");
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
