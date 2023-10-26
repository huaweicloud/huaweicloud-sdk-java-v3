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
public class ListSecurityEventsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_days")

    private Integer lastDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_types")

    private List<Integer> eventTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_class_ids")

    private List<String> eventClassIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_list")

    private List<String> severityList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_tag")

    private String attackTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_list")

    private List<String> tagList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "att_ck")

    private String attCk;

    public ListSecurityEventsRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region id
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListSecurityEventsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 租户企业项目ID，查询所有企业项目时填写：all_granted_eps
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListSecurityEventsRequest withLastDays(Integer lastDays) {
        this.lastDays = lastDays;
        return this;
    }

    /**
     * 查询时间范围天数，与自定义查询时间begin_time，end_time互斥
     * minimum: 1
     * maximum: 30
     * @return lastDays
     */
    public Integer getLastDays() {
        return lastDays;
    }

    public void setLastDays(Integer lastDays) {
        this.lastDays = lastDays;
    }

    public ListSecurityEventsRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListSecurityEventsRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 服务器ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListSecurityEventsRequest withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 服务器私有IP
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ListSecurityEventsRequest withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * 容器实例名称
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ListSecurityEventsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
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

    public ListSecurityEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数
     * minimum: 10
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSecurityEventsRequest withEventTypes(List<Integer> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public ListSecurityEventsRequest addEventTypesItem(Integer eventTypesItem) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<>();
        }
        this.eventTypes.add(eventTypesItem);
        return this;
    }

    public ListSecurityEventsRequest withEventTypes(Consumer<List<Integer>> eventTypesSetter) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<>();
        }
        eventTypesSetter.accept(this.eventTypes);
        return this;
    }

    /**
     * 事件类型，包含如下:   - 1001 : 通用恶意软件   - 1002 : 病毒   - 1003 : 蠕虫   - 1004 : 木马   - 1005 : 僵尸网络   - 1006 : 后门   - 1010 : Rootkit   - 1011 : 勒索软件   - 1012 ：黑客工具   - 1015 : Webshell   - 1016 : 挖矿   - 1017 : 反弹Shell   - 2001 : 一般漏洞利用   - 2012 : 远程代码执行   - 2047 : Redis漏洞利用   - 2048 : Hadoop漏洞利用   - 2049 : MySQL漏洞利用   - 3002 : 文件提权   - 3003 : 进程提权   - 3004 : 关键文件变更   - 3005 : 文件/目录变更   - 3007 : 进程异常行为   - 3015 : 高危命令执行   - 3018 : 异常Shell   - 3026 : crontab提权   - 3027 : Crontab可疑任务   - 3029 ：系统安全防护被禁用   - 3030 ：备份删除   - 3031 ：异常注册表操作   - 3036 : 容器镜像阻断   - 4002 : 暴力破解   - 4004 : 异常登录   - 4006 : 非法系统账号   - 4014 : 用户账号添加   - 4020 : 用户密码窃取   - 6002 : 端口扫描   - 6003 : 主机扫描   - 13001 : Kubernetes事件删除   - 13002 : Pod异常行为   - 13003 : 枚举用户信息   - 13004 : 绑定集群用户角色
     * @return eventTypes
     */
    public List<Integer> getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(List<Integer> eventTypes) {
        this.eventTypes = eventTypes;
    }

    public ListSecurityEventsRequest withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * 处置状态，包含如下:   - unhandled ：未处理   - handled : 已处理
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public ListSecurityEventsRequest withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 威胁等级，包含如下:   - Security ：安全   - Low : 低危   - Medium : 中危   - High : 高危   - Critical : 危急
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ListSecurityEventsRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 事件类别，包含如下:   - host : 主机安全事件   - container : 容器安全事件
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ListSecurityEventsRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 自定义查询时间，与查询时间范围天数互斥，查询时间段的起始时间，毫秒级时间戳，end_time减去begin_time小于等于2天，与查询时间范围天数互斥
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListSecurityEventsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 自定义时间，查询时间段的终止时间，毫秒级时间戳，end_time减去begin_time小于等于2天，与查询时间范围天数互斥
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListSecurityEventsRequest withEventClassIds(List<String> eventClassIds) {
        this.eventClassIds = eventClassIds;
        return this;
    }

    public ListSecurityEventsRequest addEventClassIdsItem(String eventClassIdsItem) {
        if (this.eventClassIds == null) {
            this.eventClassIds = new ArrayList<>();
        }
        this.eventClassIds.add(eventClassIdsItem);
        return this;
    }

    public ListSecurityEventsRequest withEventClassIds(Consumer<List<String>> eventClassIdsSetter) {
        if (this.eventClassIds == null) {
            this.eventClassIds = new ArrayList<>();
        }
        eventClassIdsSetter.accept(this.eventClassIds);
        return this;
    }

    /**
     * 事件标识，包含如下: - container_1001 : 容器命名空间 - container_1002 : 容器开放端口 - container_1003 : 容器安全选项 - container_1004 : 容器挂载目录 - containerescape_0001 : 容器高危系统调用 - containerescape_0002 : Shocker攻击 - containerescape_0003 : DirtCow攻击 - containerescape_0004 : 容器文件逃逸攻击 - dockerfile_001 : 用户自定义容器保护文件被修改 - dockerfile_002 : 容器文件系统可执行文件被修改 - dockerproc_001 : 容器进程异常事件上报 - fileprotect_0001 : 文件提权 - fileprotect_0002 : 关键文件变更 - fileprotect_0003 : 关键文件路径变更 - fileprotect_0004 : 文件/目录变更 - av_1002 : 病毒 - av_1003 : 蠕虫 - av_1004 : 木马 - av_1005 : 僵尸网络 - av_1006 : 后门 - av_1007 : 间谍软件 - av_1008 : 恶意广告软件 - av_1009 : 钓鱼 - av_1010 : Rootkit - av_1011 : 勒索软件 - av_1012 : 黑客工具 - av_1013 : 灰色软件 - av_1015 : Webshell - av_1016 : 挖矿软件 - login_0001 : 尝试暴力破解 - login_0002 : 爆破成功 - login_1001 : 登录成功 - login_1002 : 异地登录 - login_1003 : 弱口令 - malware_0001 : shell变更事件上报 - malware_0002 : 反弹shell事件上报 - malware_1001 : 恶意程序 - procdet_0001 : 进程异常行为检测 - procdet_0002 : 进程提权 - crontab_0001 : crontab脚本提权 - crontab_0002 : 恶意路径提权 - procreport_0001 : 危险命令 - user_1001 : 账号变更 - user_1002 : 风险账号 - vmescape_0001 : 虚拟机敏感命令执行 - vmescape_0002 : 虚拟化进程访问敏感文件 - vmescape_0003 : 虚拟机异常端口访问 - webshell_0001 : 网站后门 - network_1001 : 恶意挖矿 - network_1002 : 对外DDoS攻击 - network_1003 : 恶意扫描 - network_1004 : 敏感区域攻击 - ransomware_0001 : 勒索攻击 - ransomware_0002 : 勒索攻击 - ransomware_0003 : 勒索攻击 - fileless_0001 : 进程注入 - fileless_0002 : 动态库注入进程 - fileless_0003 : 关键配置变更 - fileless_0004 : 环境变量变更 - fileless_0005 : 内存文件进程 - fileless_0006 : vdso劫持 - crontab_1001 : Crontab可疑任务 - vul_exploit_0001 : Redis漏洞利用攻击 - vul_exploit_0002 : Hadoop漏洞利用攻击 - vul_exploit_0003 : MySQL漏洞利用攻击 - rootkit_0001 : 可疑rootkit文件 - rootkit_0002 : 可疑内核模块 - RASP_0004 : 上传Webshell - RASP_0018 : 无文件Webshell - blockexec_001 : 已知勒索攻击 - hips_0001 : Windows Defender防护被禁用 - hips_0002 : 可疑的黑客工具 - hips_0003 : 可疑的勒索加密行为 - hips_0004 : 隐藏账号创建 - hips_0005 : 读取用户密码凭据 - hips_0006 : 可疑的SAM文件导出 - hips_0007 : 可疑shadow copy删除操作 - hips_0008 : 备份文件删除 - hips_0009 : 可疑勒索病毒操作注册表 - hips_0010 : 可疑的异常进程行为 - hips_0011 : 可疑的扫描探测 - hips_0012 : 可疑的勒索病毒脚本运行 - hips_0013 : 可疑的挖矿命令执行 - hips_0014 : 可疑的禁用windows安全中心 - hips_0015 : 可疑的停止防火墙服务行为 - hips_0016 : 可疑的系统自动恢复禁用 - hips_0017 : Offies 创建可执行文件 - hips_0018 : 带宏Offies文件异常创建 - hips_0019 : 可疑的注册表操作 - hips_0020 : Confluence远程代码执行 - hips_0021 : MSDT远程代码执行 - portscan_0001 : 通用端口扫描 - portscan_0002 : 秘密端口扫描 - k8s_1001 : Kubernetes事件删除 - k8s_1002 : 创建特权Pod - k8s_1003 : Pod中使用交互式shell - k8s_1004 : 创建敏感目录Pod - k8s_1005 : 创建主机网络的Pod - k8s_1006 : 创建主机Pid空间的Pod - k8s_1007 : 普通pod访问APIserver认证失败 - k8s_1008 : 普通Pod通过Curl访问APIServer - k8s_1009 : 系统管理空间执行exec - k8s_1010 : 系统管理空间创建Pod - k8s_1011 : 创建静态Pod - k8s_1012 : 创建DaemonSet - k8s_1013 : 创建集群计划任务 - k8s_1014 : Secrets操作 - k8s_1015 : 枚举用户可执行的操作 - k8s_1016 : 高权限RoleBinding或ClusterRoleBinding - k8s_1017 : ServiceAccount创建 - k8s_1018 : 创建Cronjob - k8s_1019 : Pod中exec使用交互式shell - k8s_1020 : 无权限访问Apiserver - k8s_1021 : 使用curl访问APIServer - k8s_1022 : Ingress漏洞 - k8s_1023 : 中间人攻击 - k8s_1024 : 蠕虫挖矿木马 - k8s_1025 : K8s事件删除 - k8s_1026 : SelfSubjectRulesReview场景 - imgblock_0001 : 镜像白名单阻断 - imgblock_0002 : 镜像黑名单阻断 - imgblock_0003 : 镜像标签白名单阻断 - imgblock_0004 : 镜像标签黑名单阻断 - imgblock_0005 : 创建容器白名单阻断 - imgblock_0006 : 创建容器黑名单阻断 - imgblock_0007 : 容器mount proc阻断 - imgblock_0008 : 容器seccomp unconfined阻断 - imgblock_0009 : 容器特权阻断 - imgblock_0010 : 容器capabilities阻断
     * @return eventClassIds
     */
    public List<String> getEventClassIds() {
        return eventClassIds;
    }

    public void setEventClassIds(List<String> eventClassIds) {
        this.eventClassIds = eventClassIds;
    }

    public ListSecurityEventsRequest withSeverityList(List<String> severityList) {
        this.severityList = severityList;
        return this;
    }

    public ListSecurityEventsRequest addSeverityListItem(String severityListItem) {
        if (this.severityList == null) {
            this.severityList = new ArrayList<>();
        }
        this.severityList.add(severityListItem);
        return this;
    }

    public ListSecurityEventsRequest withSeverityList(Consumer<List<String>> severityListSetter) {
        if (this.severityList == null) {
            this.severityList = new ArrayList<>();
        }
        severityListSetter.accept(this.severityList);
        return this;
    }

    /**
     * 威胁等级，包含如下:   - Security ：安全   - Low : 低危   - Medium : 中危   - High : 高危   - Critical : 危急
     * @return severityList
     */
    public List<String> getSeverityList() {
        return severityList;
    }

    public void setSeverityList(List<String> severityList) {
        this.severityList = severityList;
    }

    public ListSecurityEventsRequest withAttackTag(String attackTag) {
        this.attackTag = attackTag;
        return this;
    }

    /**
     * 攻击标识，包含如下：   - attack_success : 攻击成功   - attack_attempt : 攻击尝试   - attack_blocked : 攻击被阻断   - abnormal_behavior : 异常行为   - collapsible_host : 主机失陷   - system_vulnerability : 系统脆弱性
     * @return attackTag
     */
    public String getAttackTag() {
        return attackTag;
    }

    public void setAttackTag(String attackTag) {
        this.attackTag = attackTag;
    }

    public ListSecurityEventsRequest withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * 资产重要性，包含如下3种   - important ：重要资产   - common ：一般资产   - test ：测试资产
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public ListSecurityEventsRequest withTagList(List<String> tagList) {
        this.tagList = tagList;
        return this;
    }

    public ListSecurityEventsRequest addTagListItem(String tagListItem) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        this.tagList.add(tagListItem);
        return this;
    }

    public ListSecurityEventsRequest withTagList(Consumer<List<String>> tagListSetter) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        tagListSetter.accept(this.tagList);
        return this;
    }

    /**
     * 事件标签列表，例如:[\"热点事件\"]
     * @return tagList
     */
    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public ListSecurityEventsRequest withAttCk(String attCk) {
        this.attCk = attCk;
        return this;
    }

    /**
     * ATT&CK攻击阶，包含如下：   - Reconnaissance : 侦察   - Initial Access : 初始访问   - Execution : 执行   - Persistence : 持久化   - Privilege Escalation : 权限提升   - Defense Evasion : 防御绕过   - Credential Access : 凭据访问   - Command and Control : 命令与控制   - Impact : 影响破坏
     * @return attCk
     */
    public String getAttCk() {
        return attCk;
    }

    public void setAttCk(String attCk) {
        this.attCk = attCk;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityEventsRequest that = (ListSecurityEventsRequest) obj;
        return Objects.equals(this.region, that.region)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.lastDays, that.lastDays) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.eventTypes, that.eventTypes)
            && Objects.equals(this.handleStatus, that.handleStatus) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.category, that.category) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.eventClassIds, that.eventClassIds)
            && Objects.equals(this.severityList, that.severityList) && Objects.equals(this.attackTag, that.attackTag)
            && Objects.equals(this.assetValue, that.assetValue) && Objects.equals(this.tagList, that.tagList)
            && Objects.equals(this.attCk, that.attCk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region,
            enterpriseProjectId,
            lastDays,
            hostName,
            hostId,
            privateIp,
            containerName,
            offset,
            limit,
            eventTypes,
            handleStatus,
            severity,
            category,
            beginTime,
            endTime,
            eventClassIds,
            severityList,
            attackTag,
            assetValue,
            tagList,
            attCk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityEventsRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    lastDays: ").append(toIndentedString(lastDays)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    eventClassIds: ").append(toIndentedString(eventClassIds)).append("\n");
        sb.append("    severityList: ").append(toIndentedString(severityList)).append("\n");
        sb.append("    attackTag: ").append(toIndentedString(attackTag)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
        sb.append("    attCk: ").append(toIndentedString(attCk)).append("\n");
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
