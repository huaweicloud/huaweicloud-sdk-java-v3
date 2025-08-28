package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSecurityCheckClusterReportResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    /**
     * **参数解释**： 集群类型 **取值范围**： - CCE：CCE Standard集群 - Turbo：CCE Turbo集群 
     */
    public static final class ClusterCategoryEnum {

        /**
         * Enum CCE for value: "CCE"
         */
        public static final ClusterCategoryEnum CCE = new ClusterCategoryEnum("CCE");

        /**
         * Enum TURBO for value: "Turbo"
         */
        public static final ClusterCategoryEnum TURBO = new ClusterCategoryEnum("Turbo");

        private static final Map<String, ClusterCategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClusterCategoryEnum> createStaticFields() {
            Map<String, ClusterCategoryEnum> map = new HashMap<>();
            map.put("CCE", CCE);
            map.put("Turbo", TURBO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClusterCategoryEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ClusterCategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClusterCategoryEnum(value));
        }

        public static ClusterCategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClusterCategoryEnum) {
                return this.value.equals(((ClusterCategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_category")

    private ClusterCategoryEnum clusterCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_image_vul_num")

    private Integer localImageVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_config_num")

    private Integer riskConfigNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged_container_num")

    private Integer privilegedContainerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_num")

    private Integer podNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_num")

    private Integer containerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_num")

    private Integer portNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_num")

    private Integer processNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_num")

    private Integer appNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_image_vul_list")

    private List<ClusterSecurityCheckLocalImageVulInfo> localImageVulList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_detection_list")

    private List<ClusterSecurityCheckBaseLineDetectionInfo> baselineDetectionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged_container_list")

    private List<ClusterSecurityCheckPrivilegedContainerInfo> privilegedContainerList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_list")

    private List<ClusterSecurityCheckPortInfo> portList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_list")

    private List<ClusterSecurityCheckAppInfo> appList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_list")

    private List<ClusterSecurityCheckProcessInfo> processList = null;

    public ShowSecurityCheckClusterReportResponse withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**： 体检时间 **取值范围**： 不涉及 
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public ShowSecurityCheckClusterReportResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID **取值范围**： 不涉及 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowSecurityCheckClusterReportResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**： 集群名称 **取值范围**： 不涉及 
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ShowSecurityCheckClusterReportResponse withClusterCategory(ClusterCategoryEnum clusterCategory) {
        this.clusterCategory = clusterCategory;
        return this;
    }

    /**
     * **参数解释**： 集群类型 **取值范围**： - CCE：CCE Standard集群 - Turbo：CCE Turbo集群 
     * @return clusterCategory
     */
    public ClusterCategoryEnum getClusterCategory() {
        return clusterCategory;
    }

    public void setClusterCategory(ClusterCategoryEnum clusterCategory) {
        this.clusterCategory = clusterCategory;
    }

    public ShowSecurityCheckClusterReportResponse withLocalImageVulNum(Integer localImageVulNum) {
        this.localImageVulNum = localImageVulNum;
        return this;
    }

    /**
     * **参数解释**： 本地镜像漏洞风险数量 **取值范围**： 不涉及 
     * @return localImageVulNum
     */
    public Integer getLocalImageVulNum() {
        return localImageVulNum;
    }

    public void setLocalImageVulNum(Integer localImageVulNum) {
        this.localImageVulNum = localImageVulNum;
    }

    public ShowSecurityCheckClusterReportResponse withRiskConfigNum(Integer riskConfigNum) {
        this.riskConfigNum = riskConfigNum;
        return this;
    }

    /**
     * **参数解释**： 基线风险数量 **取值范围**： 不涉及 
     * @return riskConfigNum
     */
    public Integer getRiskConfigNum() {
        return riskConfigNum;
    }

    public void setRiskConfigNum(Integer riskConfigNum) {
        this.riskConfigNum = riskConfigNum;
    }

    public ShowSecurityCheckClusterReportResponse withPrivilegedContainerNum(Integer privilegedContainerNum) {
        this.privilegedContainerNum = privilegedContainerNum;
        return this;
    }

    /**
     * **参数解释**： 特权容器数量 **取值范围**： 不涉及 
     * @return privilegedContainerNum
     */
    public Integer getPrivilegedContainerNum() {
        return privilegedContainerNum;
    }

    public void setPrivilegedContainerNum(Integer privilegedContainerNum) {
        this.privilegedContainerNum = privilegedContainerNum;
    }

    public ShowSecurityCheckClusterReportResponse withPodNum(Integer podNum) {
        this.podNum = podNum;
        return this;
    }

    /**
     * **参数解释**： pod数量 **取值范围**： 不涉及 
     * @return podNum
     */
    public Integer getPodNum() {
        return podNum;
    }

    public void setPodNum(Integer podNum) {
        this.podNum = podNum;
    }

    public ShowSecurityCheckClusterReportResponse withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**： 节点数量 **取值范围**： 不涉及 
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public ShowSecurityCheckClusterReportResponse withContainerNum(Integer containerNum) {
        this.containerNum = containerNum;
        return this;
    }

    /**
     * **参数解释**： 容器数量 **取值范围**： 不涉及 
     * @return containerNum
     */
    public Integer getContainerNum() {
        return containerNum;
    }

    public void setContainerNum(Integer containerNum) {
        this.containerNum = containerNum;
    }

    public ShowSecurityCheckClusterReportResponse withPortNum(Integer portNum) {
        this.portNum = portNum;
        return this;
    }

    /**
     * **参数解释**： 端口数量 **取值范围**： 不涉及 
     * @return portNum
     */
    public Integer getPortNum() {
        return portNum;
    }

    public void setPortNum(Integer portNum) {
        this.portNum = portNum;
    }

    public ShowSecurityCheckClusterReportResponse withProcessNum(Integer processNum) {
        this.processNum = processNum;
        return this;
    }

    /**
     * **参数解释**： 进程数量 **取值范围**： 不涉及 
     * @return processNum
     */
    public Integer getProcessNum() {
        return processNum;
    }

    public void setProcessNum(Integer processNum) {
        this.processNum = processNum;
    }

    public ShowSecurityCheckClusterReportResponse withAppNum(Integer appNum) {
        this.appNum = appNum;
        return this;
    }

    /**
     * **参数解释**： 软件数量 **取值范围**： 不涉及 
     * @return appNum
     */
    public Integer getAppNum() {
        return appNum;
    }

    public void setAppNum(Integer appNum) {
        this.appNum = appNum;
    }

    public ShowSecurityCheckClusterReportResponse withLocalImageVulList(
        List<ClusterSecurityCheckLocalImageVulInfo> localImageVulList) {
        this.localImageVulList = localImageVulList;
        return this;
    }

    public ShowSecurityCheckClusterReportResponse addLocalImageVulListItem(
        ClusterSecurityCheckLocalImageVulInfo localImageVulListItem) {
        if (this.localImageVulList == null) {
            this.localImageVulList = new ArrayList<>();
        }
        this.localImageVulList.add(localImageVulListItem);
        return this;
    }

    public ShowSecurityCheckClusterReportResponse withLocalImageVulList(
        Consumer<List<ClusterSecurityCheckLocalImageVulInfo>> localImageVulListSetter) {
        if (this.localImageVulList == null) {
            this.localImageVulList = new ArrayList<>();
        }
        localImageVulListSetter.accept(this.localImageVulList);
        return this;
    }

    /**
     * **参数解释**： 本地镜像漏洞列表 **取值范围**： 不涉及 
     * @return localImageVulList
     */
    public List<ClusterSecurityCheckLocalImageVulInfo> getLocalImageVulList() {
        return localImageVulList;
    }

    public void setLocalImageVulList(List<ClusterSecurityCheckLocalImageVulInfo> localImageVulList) {
        this.localImageVulList = localImageVulList;
    }

    public ShowSecurityCheckClusterReportResponse withBaselineDetectionList(
        List<ClusterSecurityCheckBaseLineDetectionInfo> baselineDetectionList) {
        this.baselineDetectionList = baselineDetectionList;
        return this;
    }

    public ShowSecurityCheckClusterReportResponse addBaselineDetectionListItem(
        ClusterSecurityCheckBaseLineDetectionInfo baselineDetectionListItem) {
        if (this.baselineDetectionList == null) {
            this.baselineDetectionList = new ArrayList<>();
        }
        this.baselineDetectionList.add(baselineDetectionListItem);
        return this;
    }

    public ShowSecurityCheckClusterReportResponse withBaselineDetectionList(
        Consumer<List<ClusterSecurityCheckBaseLineDetectionInfo>> baselineDetectionListSetter) {
        if (this.baselineDetectionList == null) {
            this.baselineDetectionList = new ArrayList<>();
        }
        baselineDetectionListSetter.accept(this.baselineDetectionList);
        return this;
    }

    /**
     * **参数解释**： 基线检测列表 **取值范围**： 不涉及 
     * @return baselineDetectionList
     */
    public List<ClusterSecurityCheckBaseLineDetectionInfo> getBaselineDetectionList() {
        return baselineDetectionList;
    }

    public void setBaselineDetectionList(List<ClusterSecurityCheckBaseLineDetectionInfo> baselineDetectionList) {
        this.baselineDetectionList = baselineDetectionList;
    }

    public ShowSecurityCheckClusterReportResponse withPrivilegedContainerList(
        List<ClusterSecurityCheckPrivilegedContainerInfo> privilegedContainerList) {
        this.privilegedContainerList = privilegedContainerList;
        return this;
    }

    public ShowSecurityCheckClusterReportResponse addPrivilegedContainerListItem(
        ClusterSecurityCheckPrivilegedContainerInfo privilegedContainerListItem) {
        if (this.privilegedContainerList == null) {
            this.privilegedContainerList = new ArrayList<>();
        }
        this.privilegedContainerList.add(privilegedContainerListItem);
        return this;
    }

    public ShowSecurityCheckClusterReportResponse withPrivilegedContainerList(
        Consumer<List<ClusterSecurityCheckPrivilegedContainerInfo>> privilegedContainerListSetter) {
        if (this.privilegedContainerList == null) {
            this.privilegedContainerList = new ArrayList<>();
        }
        privilegedContainerListSetter.accept(this.privilegedContainerList);
        return this;
    }

    /**
     * **参数解释**： 特权容器列表 **取值范围**： 不涉及 
     * @return privilegedContainerList
     */
    public List<ClusterSecurityCheckPrivilegedContainerInfo> getPrivilegedContainerList() {
        return privilegedContainerList;
    }

    public void setPrivilegedContainerList(List<ClusterSecurityCheckPrivilegedContainerInfo> privilegedContainerList) {
        this.privilegedContainerList = privilegedContainerList;
    }

    public ShowSecurityCheckClusterReportResponse withPortList(List<ClusterSecurityCheckPortInfo> portList) {
        this.portList = portList;
        return this;
    }

    public ShowSecurityCheckClusterReportResponse addPortListItem(ClusterSecurityCheckPortInfo portListItem) {
        if (this.portList == null) {
            this.portList = new ArrayList<>();
        }
        this.portList.add(portListItem);
        return this;
    }

    public ShowSecurityCheckClusterReportResponse withPortList(
        Consumer<List<ClusterSecurityCheckPortInfo>> portListSetter) {
        if (this.portList == null) {
            this.portList = new ArrayList<>();
        }
        portListSetter.accept(this.portList);
        return this;
    }

    /**
     * **参数解释**： 端口列表 **取值范围**： 不涉及 
     * @return portList
     */
    public List<ClusterSecurityCheckPortInfo> getPortList() {
        return portList;
    }

    public void setPortList(List<ClusterSecurityCheckPortInfo> portList) {
        this.portList = portList;
    }

    public ShowSecurityCheckClusterReportResponse withAppList(List<ClusterSecurityCheckAppInfo> appList) {
        this.appList = appList;
        return this;
    }

    public ShowSecurityCheckClusterReportResponse addAppListItem(ClusterSecurityCheckAppInfo appListItem) {
        if (this.appList == null) {
            this.appList = new ArrayList<>();
        }
        this.appList.add(appListItem);
        return this;
    }

    public ShowSecurityCheckClusterReportResponse withAppList(
        Consumer<List<ClusterSecurityCheckAppInfo>> appListSetter) {
        if (this.appList == null) {
            this.appList = new ArrayList<>();
        }
        appListSetter.accept(this.appList);
        return this;
    }

    /**
     * **参数解释**： 软件列表 **取值范围**： 不涉及 
     * @return appList
     */
    public List<ClusterSecurityCheckAppInfo> getAppList() {
        return appList;
    }

    public void setAppList(List<ClusterSecurityCheckAppInfo> appList) {
        this.appList = appList;
    }

    public ShowSecurityCheckClusterReportResponse withProcessList(List<ClusterSecurityCheckProcessInfo> processList) {
        this.processList = processList;
        return this;
    }

    public ShowSecurityCheckClusterReportResponse addProcessListItem(ClusterSecurityCheckProcessInfo processListItem) {
        if (this.processList == null) {
            this.processList = new ArrayList<>();
        }
        this.processList.add(processListItem);
        return this;
    }

    public ShowSecurityCheckClusterReportResponse withProcessList(
        Consumer<List<ClusterSecurityCheckProcessInfo>> processListSetter) {
        if (this.processList == null) {
            this.processList = new ArrayList<>();
        }
        processListSetter.accept(this.processList);
        return this;
    }

    /**
     * **参数解释**： 进程列表 **取值范围**： 不涉及 
     * @return processList
     */
    public List<ClusterSecurityCheckProcessInfo> getProcessList() {
        return processList;
    }

    public void setProcessList(List<ClusterSecurityCheckProcessInfo> processList) {
        this.processList = processList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecurityCheckClusterReportResponse that = (ShowSecurityCheckClusterReportResponse) obj;
        return Objects.equals(this.scanTime, that.scanTime) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.clusterCategory, that.clusterCategory)
            && Objects.equals(this.localImageVulNum, that.localImageVulNum)
            && Objects.equals(this.riskConfigNum, that.riskConfigNum)
            && Objects.equals(this.privilegedContainerNum, that.privilegedContainerNum)
            && Objects.equals(this.podNum, that.podNum) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.containerNum, that.containerNum) && Objects.equals(this.portNum, that.portNum)
            && Objects.equals(this.processNum, that.processNum) && Objects.equals(this.appNum, that.appNum)
            && Objects.equals(this.localImageVulList, that.localImageVulList)
            && Objects.equals(this.baselineDetectionList, that.baselineDetectionList)
            && Objects.equals(this.privilegedContainerList, that.privilegedContainerList)
            && Objects.equals(this.portList, that.portList) && Objects.equals(this.appList, that.appList)
            && Objects.equals(this.processList, that.processList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanTime,
            clusterId,
            clusterName,
            clusterCategory,
            localImageVulNum,
            riskConfigNum,
            privilegedContainerNum,
            podNum,
            hostNum,
            containerNum,
            portNum,
            processNum,
            appNum,
            localImageVulList,
            baselineDetectionList,
            privilegedContainerList,
            portList,
            appList,
            processList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityCheckClusterReportResponse {\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterCategory: ").append(toIndentedString(clusterCategory)).append("\n");
        sb.append("    localImageVulNum: ").append(toIndentedString(localImageVulNum)).append("\n");
        sb.append("    riskConfigNum: ").append(toIndentedString(riskConfigNum)).append("\n");
        sb.append("    privilegedContainerNum: ").append(toIndentedString(privilegedContainerNum)).append("\n");
        sb.append("    podNum: ").append(toIndentedString(podNum)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    containerNum: ").append(toIndentedString(containerNum)).append("\n");
        sb.append("    portNum: ").append(toIndentedString(portNum)).append("\n");
        sb.append("    processNum: ").append(toIndentedString(processNum)).append("\n");
        sb.append("    appNum: ").append(toIndentedString(appNum)).append("\n");
        sb.append("    localImageVulList: ").append(toIndentedString(localImageVulList)).append("\n");
        sb.append("    baselineDetectionList: ").append(toIndentedString(baselineDetectionList)).append("\n");
        sb.append("    privilegedContainerList: ").append(toIndentedString(privilegedContainerList)).append("\n");
        sb.append("    portList: ").append(toIndentedString(portList)).append("\n");
        sb.append("    appList: ").append(toIndentedString(appList)).append("\n");
        sb.append("    processList: ").append(toIndentedString(processList)).append("\n");
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
