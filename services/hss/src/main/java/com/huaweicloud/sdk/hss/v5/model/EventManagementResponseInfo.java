package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 事件详情统计
 */
public class EventManagementResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_class_id")

    private String eventClassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

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
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_phase")

    private String attackPhase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_tag")

    private String attackTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occur_time")

    private Long occurTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_time")

    private Long handleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_method")

    private String handleMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handler")

    private String handler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_accept_list")

    private List<String> operateAcceptList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_detail_list")

    private List<EventDetailResponseInfo> operateDetailList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forensic_info")

    private Object forensicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_info")

    private EventResourceResponseInfo resourceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geo_info")

    private Object geoInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware_info")

    private Object malwareInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_info")

    private Object networkInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_info")

    private Object appInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_info")

    private Object systemInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_info")

    private Object extendInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommendation")

    private String recommendation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_abstract")

    private String eventAbstract;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_info_list")

    private List<EventProcessResponseInfo> processInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_info_list")

    private List<EventUserResponseInfo> userInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_info_list")

    private List<EventFileResponseInfo> fileInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_details")

    private String eventDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_list")

    private List<String> tagList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_count")

    private Integer eventCount;

    public EventManagementResponseInfo withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 事件编号
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public EventManagementResponseInfo withEventClassId(String eventClassId) {
        this.eventClassId = eventClassId;
        return this;
    }

    /**
     * 事件分类，包含如下:   - container_1001 : 容器命名空间   - container_1002 : 容器开放端口   - container_1003 : 容器安全选项   - container_1004 : 容器挂载目录   - containerescape_0001 : 容器高危系统调用   - containerescape_0002 : Shocker攻击   - containerescape_0003 : DirtCow攻击   - containerescape_0004 : 容器文件逃逸攻击   - dockerfile_001 : 用户自定义容器保护文件被修改   - dockerfile_002 : 容器文件系统可执行文件被修改   - dockerproc_001 : 容器进程异常事件上报   - fileprotect_0001 : 文件提权   - fileprotect_0002 : 关键文件变更   - fileprotect_0003 : 关键文件路径变更   - fileprotect_0004 : 文件/目录变更   - av_1002 : 病毒   - av_1003 : 蠕虫   - av_1004 : 木马   - av_1005 : 僵尸网络   - av_1006 : 后门   - av_1007 : 间谍软件   - av_1008 : 恶意广告软件   - av_1009 : 钓鱼   - av_1010 : Rootkit   - av_1011 : 勒索软件   - av_1012 : 黑客工具   - av_1013 : 灰色软件   - av_1015 : Webshell   - av_1016 : 挖矿软件   - login_0001 : 尝试暴力破解   - login_0002 : 爆破成功   - login_1001 : 登录成功   - login_1002 : 异地登录   - login_1003 : 弱口令   - malware_0001 : shell变更事件上报   - malware_0002 : 反弹shell事件上报   - malware_1001 : 恶意程序   - procdet_0001 : 进程异常行为检测   - procdet_0002 : 进程提权   - procreport_0001 : 危险命令   - user_1001 : 账号变更   - user_1002 : 风险账号   - vmescape_0001 : 虚拟机敏感命令执行   - vmescape_0002 : 虚拟化进程访问敏感文件   - vmescape_0003 : 虚拟机异常端口访问   - webshell_0001 : 网站后门   - network_1001 : 恶意挖矿   - network_1002 : 对外DDoS攻击   - network_1003 : 恶意扫描   - network_1004 : 敏感区域攻击   - ransomware_0001 : 勒索攻击   - ransomware_0002 : 勒索攻击   - ransomware_0003 : 勒索攻击   - fileless_0001 : 进程注入   - fileless_0002 : 动态库注入进程   - fileless_0003 : 关键配置变更   - fileless_0004 : 环境变量变更   - fileless_0005 : 内存文件进程   - fileless_0006 : vdso劫持   - crontab_1001 : Crontab可疑任务   - vul_exploit_0001 : Redis漏洞利用攻击   - vul_exploit_0002 : Hadoop漏洞利用攻击   - vul_exploit_0003 : MySQL漏洞利用攻击   - rootkit_0001 : 可疑rootkit文件   - rootkit_0002 : 可疑内核模块   - RASP_0004 : 上传Webshell   - RASP_0018 : 无文件Webshell   - blockexec_001 : 已知勒索攻击   - hips_0001 : Windows Defender防护被禁用   - hips_0002 : 可疑的黑客工具   - hips_0003 : 可疑的勒索加密行为   - hips_0004 : 隐藏账号创建   - hips_0005 : 读取用户密码凭据   - hips_0006 : 可疑的SAM文件导出   - hips_0007 : 可疑shadow copy删除操作   - hips_0008 : 备份文件删除   - hips_0009 : 可疑勒索病毒操作注册表   - hips_0010 : 可疑的异常进程行为   - hips_0011 : 可疑的扫描探测   - hips_0012 : 可疑的勒索病毒脚本运行   - hips_0013 : 可疑的挖矿命令执行   - hips_0014 : 可疑的禁用windows安全中心   - hips_0015 : 可疑的停止防火墙服务行为   - hips_0016 : 可疑的系统自动恢复禁用   - hips_0017 : Offies 创建可执行文件   - hips_0018 : 带宏Offies文件异常创建   - hips_0019 : 可疑的注册表操作   - hips_0020 : Confluence远程代码执行   - hips_0021 : MSDT远程代码执行   - portscan_0001 : 通用端口扫描   - portscan_0002 : 秘密端口扫描   - k8s_1001 : Kubernetes事件删除   - k8s_1002 : 创建特权Pod   - k8s_1003 : Pod中使用交互式shell   - k8s_1004 : 创建敏感目录Pod   - k8s_1005 : 创建主机网络的Pod   - k8s_1006 : 创建主机Pid空间的Pod   - k8s_1007 : 普通pod访问APIserver认证失败   - k8s_1008 : 普通Pod通过Curl访问APIServer   - k8s_1009 : 系统管理空间执行exec   - k8s_1010 : 系统管理空间创建Pod   - k8s_1011 : 创建静态Pod   - k8s_1012 : 创建DaemonSet   - k8s_1013 : 创建集群计划任务   - k8s_1014 : Secrets操作   - k8s_1015 : 枚举用户可执行的操作   - k8s_1016 : 高权限RoleBinding或ClusterRoleBinding   - k8s_1017 : ServiceAccount创建   - k8s_1018 : 创建Cronjob   - k8s_1019 : Pod中exec使用交互式shell   - k8s_1020 : 无权限访问Apiserver   - k8s_1021 : 使用curl访问APIServer   - k8s_1022 : Ingress漏洞   - k8s_1023 : 中间人攻击   - k8s_1024 : 蠕虫挖矿木马   - k8s_1025 : K8s事件删除   - k8s_1026 : SelfSubjectRulesReview场景   - imgblock_0001 : 镜像白名单阻断   - imgblock_0002 : 镜像黑名单阻断   - imgblock_0003 : 镜像标签白名单阻断   - imgblock_0004 : 镜像标签黑名单阻断   - imgblock_0005 : 创建容器白名单阻断   - imgblock_0006 : 创建容器黑名单阻断   - imgblock_0007 : 容器mount proc阻断   - imgblock_0008 : 容器seccomp unconfined阻断   - imgblock_0009 : 容器特权阻断   - imgblock_0010 : 容器capabilities阻断
     * @return eventClassId
     */
    public String getEventClassId() {
        return eventClassId;
    }

    public void setEventClassId(String eventClassId) {
        this.eventClassId = eventClassId;
    }

    public EventManagementResponseInfo withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型，包含如下:   - 1001 : 通用恶意软件   - 1002 : 病毒   - 1003 : 蠕虫   - 1004 : 木马   - 1005 : 僵尸网络   - 1006 : 后门   - 1010 : Rootkit   - 1011 : 勒索软件   - 1012 ：黑客工具   - 1015 : Webshell   - 1016 : 挖矿   - 1017 : 反弹Shell   - 2001 : 一般漏洞利用   - 2012 : 远程代码执行   - 2047 : Redis漏洞利用   - 2048 : Hadoop漏洞利用   - 2049 : MySQL漏洞利用   - 3002 : 文件提权   - 3003 : 进程提权   - 3004 : 关键文件变更   - 3005 : 文件/目录变更   - 3007 : 进程异常行为   - 3015 : 高危命令执行   - 3018 : 异常Shell   - 3027 : Crontab可疑任务   - 3029 ：系统安全防护被禁用   - 3030 ：备份删除   - 3031 ：异常注册表操作   - 3036 : 容器镜像阻断   - 4002 : 暴力破解   - 4004 : 异常登录   - 4006 : 非法系统账号   - 4014 : 用户账号添加   - 4020 : 用户密码窃取   - 6002 : 端口扫描   - 6003 : 主机扫描   - 13001 : Kubernetes事件删除   - 13002 : Pod异常行为   - 13003 : 枚举用户信息   - 13004 : 绑定集群用户角色
     * minimum: 1000
     * maximum: 30000
     * @return eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public EventManagementResponseInfo withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 事件名称
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public EventManagementResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 威胁等级，包含如下:   - Security : 安全   - Low : 低危   - Medium : 中危   - High : 高危   - Critical : 危急
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public EventManagementResponseInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * 容器实例名称，只有容器类型的告警有
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public EventManagementResponseInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称，只有容器类型的告警有
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public EventManagementResponseInfo withHostName(String hostName) {
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

    public EventManagementResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public EventManagementResponseInfo withPrivateIp(String privateIp) {
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

    public EventManagementResponseInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 弹性公网IP地址
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public EventManagementResponseInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，包含如下2种。   - Linux ：Linux。   - Windows ：Windows。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public EventManagementResponseInfo withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * 服务器状态，包含如下4种。   - ACTIVE ：运行中。   - SHUTOFF ：关机。   - BUILDING ：创建中。   - ERROR ：故障。
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public EventManagementResponseInfo withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * Agent状态，包含如下5种。   - installed ：已安装。   - not_installed ：未安装。   - online ：在线。   - offline ：离线。   - install_failed ：安装失败。   - installing ：安装中。
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public EventManagementResponseInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 防护状态，包含如下2种。 - closed ：未防护。 - opened ：防护中。
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public EventManagementResponseInfo withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * 资产重要性，包含如下4种   - important ：重要资产   - common ：一般资产   - test ：测试资产
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public EventManagementResponseInfo withAttackPhase(String attackPhase) {
        this.attackPhase = attackPhase;
        return this;
    }

    /**
     * 攻击阶段，包含如下：   - reconnaissance : 侦查跟踪   - weaponization : 武器构建   - delivery : 载荷投递   - exploit : 漏洞利用   - installation : 安装植入   - command_and_control : 命令与控制   - actions : 目标达成
     * @return attackPhase
     */
    public String getAttackPhase() {
        return attackPhase;
    }

    public void setAttackPhase(String attackPhase) {
        this.attackPhase = attackPhase;
    }

    public EventManagementResponseInfo withAttackTag(String attackTag) {
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

    public EventManagementResponseInfo withOccurTime(Long occurTime) {
        this.occurTime = occurTime;
        return this;
    }

    /**
     * 发生时间，毫秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return occurTime
     */
    public Long getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Long occurTime) {
        this.occurTime = occurTime;
    }

    public EventManagementResponseInfo withHandleTime(Long handleTime) {
        this.handleTime = handleTime;
        return this;
    }

    /**
     * 处理时间，毫秒，已处理的告警才有
     * minimum: 0
     * maximum: 9223372036854775807
     * @return handleTime
     */
    public Long getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Long handleTime) {
        this.handleTime = handleTime;
    }

    public EventManagementResponseInfo withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * 处理状态，包含如下:   - unhandled ：未处理   - handled : 已处理
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public EventManagementResponseInfo withHandleMethod(String handleMethod) {
        this.handleMethod = handleMethod;
        return this;
    }

    /**
     * 处理方式，已处理的告警才有，包含如下:   - mark_as_handled : 手动处理   - ignore : 忽略   - add_to_alarm_whitelist : 加入告警白名单   - add_to_login_whitelist : 加入登录白名单   - isolate_and_kill : 隔离查杀
     * @return handleMethod
     */
    public String getHandleMethod() {
        return handleMethod;
    }

    public void setHandleMethod(String handleMethod) {
        this.handleMethod = handleMethod;
    }

    public EventManagementResponseInfo withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    /**
     * 备注信息，已处理的告警才有
     * @return handler
     */
    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public EventManagementResponseInfo withOperateAcceptList(List<String> operateAcceptList) {
        this.operateAcceptList = operateAcceptList;
        return this;
    }

    public EventManagementResponseInfo addOperateAcceptListItem(String operateAcceptListItem) {
        if (this.operateAcceptList == null) {
            this.operateAcceptList = new ArrayList<>();
        }
        this.operateAcceptList.add(operateAcceptListItem);
        return this;
    }

    public EventManagementResponseInfo withOperateAcceptList(Consumer<List<String>> operateAcceptListSetter) {
        if (this.operateAcceptList == null) {
            this.operateAcceptList = new ArrayList<>();
        }
        operateAcceptListSetter.accept(this.operateAcceptList);
        return this;
    }

    /**
     * 支持的处理操作
     * @return operateAcceptList
     */
    public List<String> getOperateAcceptList() {
        return operateAcceptList;
    }

    public void setOperateAcceptList(List<String> operateAcceptList) {
        this.operateAcceptList = operateAcceptList;
    }

    public EventManagementResponseInfo withOperateDetailList(List<EventDetailResponseInfo> operateDetailList) {
        this.operateDetailList = operateDetailList;
        return this;
    }

    public EventManagementResponseInfo addOperateDetailListItem(EventDetailResponseInfo operateDetailListItem) {
        if (this.operateDetailList == null) {
            this.operateDetailList = new ArrayList<>();
        }
        this.operateDetailList.add(operateDetailListItem);
        return this;
    }

    public EventManagementResponseInfo withOperateDetailList(
        Consumer<List<EventDetailResponseInfo>> operateDetailListSetter) {
        if (this.operateDetailList == null) {
            this.operateDetailList = new ArrayList<>();
        }
        operateDetailListSetter.accept(this.operateDetailList);
        return this;
    }

    /**
     * 操作详情信息列表（页面不展示）
     * @return operateDetailList
     */
    public List<EventDetailResponseInfo> getOperateDetailList() {
        return operateDetailList;
    }

    public void setOperateDetailList(List<EventDetailResponseInfo> operateDetailList) {
        this.operateDetailList = operateDetailList;
    }

    public EventManagementResponseInfo withForensicInfo(Object forensicInfo) {
        this.forensicInfo = forensicInfo;
        return this;
    }

    /**
     * 取证信息，json格式
     * @return forensicInfo
     */
    public Object getForensicInfo() {
        return forensicInfo;
    }

    public void setForensicInfo(Object forensicInfo) {
        this.forensicInfo = forensicInfo;
    }

    public EventManagementResponseInfo withResourceInfo(EventResourceResponseInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
        return this;
    }

    public EventManagementResponseInfo withResourceInfo(Consumer<EventResourceResponseInfo> resourceInfoSetter) {
        if (this.resourceInfo == null) {
            this.resourceInfo = new EventResourceResponseInfo();
            resourceInfoSetter.accept(this.resourceInfo);
        }

        return this;
    }

    /**
     * Get resourceInfo
     * @return resourceInfo
     */
    public EventResourceResponseInfo getResourceInfo() {
        return resourceInfo;
    }

    public void setResourceInfo(EventResourceResponseInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

    public EventManagementResponseInfo withGeoInfo(Object geoInfo) {
        this.geoInfo = geoInfo;
        return this;
    }

    /**
     * 地理位置信息，json格式
     * @return geoInfo
     */
    public Object getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(Object geoInfo) {
        this.geoInfo = geoInfo;
    }

    public EventManagementResponseInfo withMalwareInfo(Object malwareInfo) {
        this.malwareInfo = malwareInfo;
        return this;
    }

    /**
     * 恶意软件信息，json格式
     * @return malwareInfo
     */
    public Object getMalwareInfo() {
        return malwareInfo;
    }

    public void setMalwareInfo(Object malwareInfo) {
        this.malwareInfo = malwareInfo;
    }

    public EventManagementResponseInfo withNetworkInfo(Object networkInfo) {
        this.networkInfo = networkInfo;
        return this;
    }

    /**
     * 网络信息，json格式
     * @return networkInfo
     */
    public Object getNetworkInfo() {
        return networkInfo;
    }

    public void setNetworkInfo(Object networkInfo) {
        this.networkInfo = networkInfo;
    }

    public EventManagementResponseInfo withAppInfo(Object appInfo) {
        this.appInfo = appInfo;
        return this;
    }

    /**
     * 应用信息，json格式
     * @return appInfo
     */
    public Object getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(Object appInfo) {
        this.appInfo = appInfo;
    }

    public EventManagementResponseInfo withSystemInfo(Object systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }

    /**
     * 系统信息，json格式
     * @return systemInfo
     */
    public Object getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(Object systemInfo) {
        this.systemInfo = systemInfo;
    }

    public EventManagementResponseInfo withExtendInfo(Object extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }

    /**
     * 事件扩展信息，json格式
     * @return extendInfo
     */
    public Object getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(Object extendInfo) {
        this.extendInfo = extendInfo;
    }

    public EventManagementResponseInfo withRecommendation(String recommendation) {
        this.recommendation = recommendation;
        return this;
    }

    /**
     * 处置建议
     * @return recommendation
     */
    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public EventManagementResponseInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 告警说明
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventManagementResponseInfo withEventAbstract(String eventAbstract) {
        this.eventAbstract = eventAbstract;
        return this;
    }

    /**
     * 告警摘要
     * @return eventAbstract
     */
    public String getEventAbstract() {
        return eventAbstract;
    }

    public void setEventAbstract(String eventAbstract) {
        this.eventAbstract = eventAbstract;
    }

    public EventManagementResponseInfo withProcessInfoList(List<EventProcessResponseInfo> processInfoList) {
        this.processInfoList = processInfoList;
        return this;
    }

    public EventManagementResponseInfo addProcessInfoListItem(EventProcessResponseInfo processInfoListItem) {
        if (this.processInfoList == null) {
            this.processInfoList = new ArrayList<>();
        }
        this.processInfoList.add(processInfoListItem);
        return this;
    }

    public EventManagementResponseInfo withProcessInfoList(
        Consumer<List<EventProcessResponseInfo>> processInfoListSetter) {
        if (this.processInfoList == null) {
            this.processInfoList = new ArrayList<>();
        }
        processInfoListSetter.accept(this.processInfoList);
        return this;
    }

    /**
     * 进程信息列表
     * @return processInfoList
     */
    public List<EventProcessResponseInfo> getProcessInfoList() {
        return processInfoList;
    }

    public void setProcessInfoList(List<EventProcessResponseInfo> processInfoList) {
        this.processInfoList = processInfoList;
    }

    public EventManagementResponseInfo withUserInfoList(List<EventUserResponseInfo> userInfoList) {
        this.userInfoList = userInfoList;
        return this;
    }

    public EventManagementResponseInfo addUserInfoListItem(EventUserResponseInfo userInfoListItem) {
        if (this.userInfoList == null) {
            this.userInfoList = new ArrayList<>();
        }
        this.userInfoList.add(userInfoListItem);
        return this;
    }

    public EventManagementResponseInfo withUserInfoList(Consumer<List<EventUserResponseInfo>> userInfoListSetter) {
        if (this.userInfoList == null) {
            this.userInfoList = new ArrayList<>();
        }
        userInfoListSetter.accept(this.userInfoList);
        return this;
    }

    /**
     * 用户信息列表
     * @return userInfoList
     */
    public List<EventUserResponseInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<EventUserResponseInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }

    public EventManagementResponseInfo withFileInfoList(List<EventFileResponseInfo> fileInfoList) {
        this.fileInfoList = fileInfoList;
        return this;
    }

    public EventManagementResponseInfo addFileInfoListItem(EventFileResponseInfo fileInfoListItem) {
        if (this.fileInfoList == null) {
            this.fileInfoList = new ArrayList<>();
        }
        this.fileInfoList.add(fileInfoListItem);
        return this;
    }

    public EventManagementResponseInfo withFileInfoList(Consumer<List<EventFileResponseInfo>> fileInfoListSetter) {
        if (this.fileInfoList == null) {
            this.fileInfoList = new ArrayList<>();
        }
        fileInfoListSetter.accept(this.fileInfoList);
        return this;
    }

    /**
     * 文件信息列表
     * @return fileInfoList
     */
    public List<EventFileResponseInfo> getFileInfoList() {
        return fileInfoList;
    }

    public void setFileInfoList(List<EventFileResponseInfo> fileInfoList) {
        this.fileInfoList = fileInfoList;
    }

    public EventManagementResponseInfo withEventDetails(String eventDetails) {
        this.eventDetails = eventDetails;
        return this;
    }

    /**
     * 事件信息的简述
     * @return eventDetails
     */
    public String getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(String eventDetails) {
        this.eventDetails = eventDetails;
    }

    public EventManagementResponseInfo withTagList(List<String> tagList) {
        this.tagList = tagList;
        return this;
    }

    public EventManagementResponseInfo addTagListItem(String tagListItem) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        this.tagList.add(tagListItem);
        return this;
    }

    public EventManagementResponseInfo withTagList(Consumer<List<String>> tagListSetter) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        tagListSetter.accept(this.tagList);
        return this;
    }

    /**
     * 标签列表
     * @return tagList
     */
    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public EventManagementResponseInfo withEventCount(Integer eventCount) {
        this.eventCount = eventCount;
        return this;
    }

    /**
     * 事件发生次数
     * minimum: 0
     * maximum: 2147483647
     * @return eventCount
     */
    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventManagementResponseInfo that = (EventManagementResponseInfo) obj;
        return Objects.equals(this.eventId, that.eventId) && Objects.equals(this.eventClassId, that.eventClassId)
            && Objects.equals(this.eventType, that.eventType) && Objects.equals(this.eventName, that.eventName)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.containerName, that.containerName)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.hostStatus, that.hostStatus) && Objects.equals(this.agentStatus, that.agentStatus)
            && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.assetValue, that.assetValue) && Objects.equals(this.attackPhase, that.attackPhase)
            && Objects.equals(this.attackTag, that.attackTag) && Objects.equals(this.occurTime, that.occurTime)
            && Objects.equals(this.handleTime, that.handleTime) && Objects.equals(this.handleStatus, that.handleStatus)
            && Objects.equals(this.handleMethod, that.handleMethod) && Objects.equals(this.handler, that.handler)
            && Objects.equals(this.operateAcceptList, that.operateAcceptList)
            && Objects.equals(this.operateDetailList, that.operateDetailList)
            && Objects.equals(this.forensicInfo, that.forensicInfo)
            && Objects.equals(this.resourceInfo, that.resourceInfo) && Objects.equals(this.geoInfo, that.geoInfo)
            && Objects.equals(this.malwareInfo, that.malwareInfo) && Objects.equals(this.networkInfo, that.networkInfo)
            && Objects.equals(this.appInfo, that.appInfo) && Objects.equals(this.systemInfo, that.systemInfo)
            && Objects.equals(this.extendInfo, that.extendInfo)
            && Objects.equals(this.recommendation, that.recommendation)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.eventAbstract, that.eventAbstract)
            && Objects.equals(this.processInfoList, that.processInfoList)
            && Objects.equals(this.userInfoList, that.userInfoList)
            && Objects.equals(this.fileInfoList, that.fileInfoList)
            && Objects.equals(this.eventDetails, that.eventDetails) && Objects.equals(this.tagList, that.tagList)
            && Objects.equals(this.eventCount, that.eventCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId,
            eventClassId,
            eventType,
            eventName,
            severity,
            containerName,
            imageName,
            hostName,
            hostId,
            privateIp,
            publicIp,
            osType,
            hostStatus,
            agentStatus,
            protectStatus,
            assetValue,
            attackPhase,
            attackTag,
            occurTime,
            handleTime,
            handleStatus,
            handleMethod,
            handler,
            operateAcceptList,
            operateDetailList,
            forensicInfo,
            resourceInfo,
            geoInfo,
            malwareInfo,
            networkInfo,
            appInfo,
            systemInfo,
            extendInfo,
            recommendation,
            description,
            eventAbstract,
            processInfoList,
            userInfoList,
            fileInfoList,
            eventDetails,
            tagList,
            eventCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventManagementResponseInfo {\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventClassId: ").append(toIndentedString(eventClassId)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    attackPhase: ").append(toIndentedString(attackPhase)).append("\n");
        sb.append("    attackTag: ").append(toIndentedString(attackTag)).append("\n");
        sb.append("    occurTime: ").append(toIndentedString(occurTime)).append("\n");
        sb.append("    handleTime: ").append(toIndentedString(handleTime)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    handleMethod: ").append(toIndentedString(handleMethod)).append("\n");
        sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
        sb.append("    operateAcceptList: ").append(toIndentedString(operateAcceptList)).append("\n");
        sb.append("    operateDetailList: ").append(toIndentedString(operateDetailList)).append("\n");
        sb.append("    forensicInfo: ").append(toIndentedString(forensicInfo)).append("\n");
        sb.append("    resourceInfo: ").append(toIndentedString(resourceInfo)).append("\n");
        sb.append("    geoInfo: ").append(toIndentedString(geoInfo)).append("\n");
        sb.append("    malwareInfo: ").append(toIndentedString(malwareInfo)).append("\n");
        sb.append("    networkInfo: ").append(toIndentedString(networkInfo)).append("\n");
        sb.append("    appInfo: ").append(toIndentedString(appInfo)).append("\n");
        sb.append("    systemInfo: ").append(toIndentedString(systemInfo)).append("\n");
        sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
        sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    eventAbstract: ").append(toIndentedString(eventAbstract)).append("\n");
        sb.append("    processInfoList: ").append(toIndentedString(processInfoList)).append("\n");
        sb.append("    userInfoList: ").append(toIndentedString(userInfoList)).append("\n");
        sb.append("    fileInfoList: ").append(toIndentedString(fileInfoList)).append("\n");
        sb.append("    eventDetails: ").append(toIndentedString(eventDetails)).append("\n");
        sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
        sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
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
