package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作的事件
 */
public class OperateEventRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_class_id")

    private String eventClassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occur_time")

    private Long occurTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_detail_list")

    private List<EventDetailRequestInfo> operateDetailList = null;

    public OperateEventRequestInfo withEventClassId(String eventClassId) {
        this.eventClassId = eventClassId;
        return this;
    }

    /**
     * 事件分类，包含如下:   - container_1001 : 容器命名空间   - container_1002 : 容器开放端口   - container_1003 : 容器安全选项   - container_1004 : 容器挂载目录   - containerescape_0001 : 容器高危系统调用   - containerescape_0002 : Shocker攻击   - containerescape_0003 : DirtCow攻击   - containerescape_0004 : 容器文件逃逸攻击   - dockerfile_001 : 用户自定义容器保护文件被修改   - dockerfile_002 : 容器文件系统可执行文件被修改   - dockerproc_001 : 容器进程异常事件上报   - fileprotect_0001 : 文件提权   - fileprotect_0002 : 关键文件变更   - fileprotect_0003 : 关键文件路径变更   - fileprotect_0004 : 文件目录变更   - login_0001 : 尝试暴力破解   - login_0002 : 爆破成功   - login_1001 : 登录成功   - login_1002 : 异地登录   - login_1003 : 弱口令   - malware_0001 : shell变更事件上报   - malware_0002 : 反弹shell事件上报   - malware_1001 : 恶意程序   - procdet_0001 : 进程异常行为检测   - procdet_0002 : 进程提权   - procreport_0001 : 危险命令   - user_1001 : 账号变更   - user_1002 : 风险账号   - vmescape_0001 : 虚拟机敏感命令执行   - vmescape_0002 : 虚拟化进程访问敏感文件   - vmescape_0003 : 虚拟机异常端口访问   - webshell_0001 : 网站后门   - network_1001 : 恶意挖矿   - network_1002 : 对外DDoS攻击   - network_1003 : 恶意扫描   - network_1004 : 敏感区域攻击   - crontab_1001 : Crontab可疑任务   - vul_exploit_0001 : Redis漏洞利用攻击   - vul_exploit_0002 : Hadoop漏洞利用攻击   - vul_exploit_0003 : MySQL漏洞利用攻击
     * @return eventClassId
     */
    public String getEventClassId() {
        return eventClassId;
    }

    public void setEventClassId(String eventClassId) {
        this.eventClassId = eventClassId;
    }

    public OperateEventRequestInfo withEventId(String eventId) {
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

    public OperateEventRequestInfo withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型，包含如下:   - 1001 : 恶意软件   - 1010 : Rootkit   - 1011 : 勒索软件   - 1015 : Webshell   - 1017 : 反弹Shell   - 2001 : 一般漏洞利用   - 2047 : Redis漏洞利用   - 2048 : Hadoop漏洞利用   - 2049 : MySQL漏洞利用   - 3002 : 文件提权   - 3003 : 进程提权   - 3004 : 关键文件变更   - 3005 : 文件/目录变更   - 3007 : 进程异常行为   - 3015 : 高危命令执行   - 3018 : 异常Shell   - 3027 : Crontab可疑任务   - 4002 : 暴力破解   - 4004 : 异常登录   - 4006 : 非法系统账号
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

    public OperateEventRequestInfo withOccurTime(Long occurTime) {
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

    public OperateEventRequestInfo withOperateDetailList(List<EventDetailRequestInfo> operateDetailList) {
        this.operateDetailList = operateDetailList;
        return this;
    }

    public OperateEventRequestInfo addOperateDetailListItem(EventDetailRequestInfo operateDetailListItem) {
        if (this.operateDetailList == null) {
            this.operateDetailList = new ArrayList<>();
        }
        this.operateDetailList.add(operateDetailListItem);
        return this;
    }

    public OperateEventRequestInfo withOperateDetailList(
        Consumer<List<EventDetailRequestInfo>> operateDetailListSetter) {
        if (this.operateDetailList == null) {
            this.operateDetailList = new ArrayList<>();
        }
        operateDetailListSetter.accept(this.operateDetailList);
        return this;
    }

    /**
     * 操作详情信息列表，当 operate_type 为 add_to_alarm_whitelist 或 remove_from_alarm_whitelist 时，必传 keyword 和 hash；当 operate_type 为 add_to_login_whitelist 或 remove_from_login_whitelist 时，必传 login_ip， private_ip 和 login_user_name；当 operate_type 为 isolate_and_kill 或 do_not_isolate_or_kill 时，必传 agent_id，file_hash，file_path，process_pid；其余情况可不填写内容。
     * @return operateDetailList
     */
    public List<EventDetailRequestInfo> getOperateDetailList() {
        return operateDetailList;
    }

    public void setOperateDetailList(List<EventDetailRequestInfo> operateDetailList) {
        this.operateDetailList = operateDetailList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperateEventRequestInfo operateEventRequestInfo = (OperateEventRequestInfo) o;
        return Objects.equals(this.eventClassId, operateEventRequestInfo.eventClassId)
            && Objects.equals(this.eventId, operateEventRequestInfo.eventId)
            && Objects.equals(this.eventType, operateEventRequestInfo.eventType)
            && Objects.equals(this.occurTime, operateEventRequestInfo.occurTime)
            && Objects.equals(this.operateDetailList, operateEventRequestInfo.operateDetailList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventClassId, eventId, eventType, occurTime, operateDetailList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateEventRequestInfo {\n");
        sb.append("    eventClassId: ").append(toIndentedString(eventClassId)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    occurTime: ").append(toIndentedString(occurTime)).append("\n");
        sb.append("    operateDetailList: ").append(toIndentedString(operateDetailList)).append("\n");
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
