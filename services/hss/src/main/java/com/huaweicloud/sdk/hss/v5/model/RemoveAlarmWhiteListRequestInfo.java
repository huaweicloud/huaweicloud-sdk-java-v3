package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除告警白名单列表
 */
public class RemoveAlarmWhiteListRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<AlarmWhiteListRequestInfo> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_alarm")

    private Boolean restoreAlarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_all")

    private Boolean deleteAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    public RemoveAlarmWhiteListRequestInfo withDataList(List<AlarmWhiteListRequestInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public RemoveAlarmWhiteListRequestInfo addDataListItem(AlarmWhiteListRequestInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public RemoveAlarmWhiteListRequestInfo withDataList(Consumer<List<AlarmWhiteListRequestInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释** : \"删除告警白名单详情\" 删除条件以data_list优先： 1、删除具体某些白名单时，data_list必需，delete_all可以不填。（data_list内hash、description、event_type必需，确定要删除白名单规则时delete_white_rule必须为true） 2、删除所有白名单时（delete_all 必须为true），data_list一定不要传。 **约束限制** : 不涉及 **取值范围** : 最小值0，最大值100 **默认取值** : 不涉及 
     * @return dataList
     */
    public List<AlarmWhiteListRequestInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<AlarmWhiteListRequestInfo> dataList) {
        this.dataList = dataList;
    }

    public RemoveAlarmWhiteListRequestInfo withRestoreAlarm(Boolean restoreAlarm) {
        this.restoreAlarm = restoreAlarm;
        return this;
    }

    /**
     * **参数解释**: 是否需要恢复相关告警 **约束限制**: 不涉及 **取值范围**: - true ：恢复告警 - false ：不恢复告警  **默认取值**: false
     * @return restoreAlarm
     */
    public Boolean getRestoreAlarm() {
        return restoreAlarm;
    }

    public void setRestoreAlarm(Boolean restoreAlarm) {
        this.restoreAlarm = restoreAlarm;
    }

    public RemoveAlarmWhiteListRequestInfo withDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
        return this;
    }

    /**
     * **参数解释**: 是否删除所有白名单内容 1、删除所有白名单时，必须填。删除所有某种类型白名单时，请同时填写event_type参数 2、删除具体某些白名单时，请填写data_list。 **约束限制**: 不涉及 **取值范围**: - true ：删除所有白名单内容 - false ：不删除所有白名单内容  **默认取值**: false 
     * @return deleteAll
     */
    public Boolean getDeleteAll() {
        return deleteAll;
    }

    public void setDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
    }

    public RemoveAlarmWhiteListRequestInfo withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数解释**： 事件类型 **取值范围**：   - 1001：通用恶意软件   - 1002：病毒   - 1003：蠕虫   - 1004：木马   - 1005：僵尸网络   - 1006：后门   - 1010：Rootkit   - 1011：勒索软件   - 1012：黑客工具   - 1015：Webshell   - 1016：挖矿   - 1017：反弹Shell   - 2001：一般漏洞利用   - 2012：远程代码执行   - 2047：Redis漏洞利用   - 2048：Hadoop漏洞利用   - 2049：MySQL漏洞利用   - 3002：文件提权   - 3003：进程提权   - 3004：关键文件变更   - 3005：文件/目录变更   - 3007：进程异常行为   - 3015：高危命令执行   - 3018：异常Shell   - 3027：Crontab可疑任务   - 3029：系统安全防护被禁用   - 3030：备份删除   - 3031：异常注册表操作   - 3036：容器镜像阻断   - 4002：暴力破解   - 4004：异常登录   - 4006：非法系统账号   - 4014：用户账号添加   - 4020：用户密码窃取   - 6002：端口扫描   - 6003：主机扫描   - 13001：Kubernetes事件删除   - 13002：Pod异常行为   - 13003：枚举用户信息   - 13004：绑定集群用户角色 
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveAlarmWhiteListRequestInfo that = (RemoveAlarmWhiteListRequestInfo) obj;
        return Objects.equals(this.dataList, that.dataList) && Objects.equals(this.restoreAlarm, that.restoreAlarm)
            && Objects.equals(this.deleteAll, that.deleteAll) && Objects.equals(this.eventType, that.eventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataList, restoreAlarm, deleteAll, eventType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveAlarmWhiteListRequestInfo {\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    restoreAlarm: ").append(toIndentedString(restoreAlarm)).append("\n");
        sb.append("    deleteAll: ").append(toIndentedString(deleteAll)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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
