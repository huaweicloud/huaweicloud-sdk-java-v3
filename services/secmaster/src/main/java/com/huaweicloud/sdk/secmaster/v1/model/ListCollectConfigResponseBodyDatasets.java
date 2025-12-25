package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListCollectConfigResponseBodyDatasets
 */
public class ListCollectConfigResponseBodyDatasets {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_all_num")

    private BigDecimal accountAllNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_successful_num")

    private BigDecimal accountSuccessfulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accounts")

    private List<ListCollectConfigResponseBodyAccounts> accounts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert")

    private Boolean alert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_accounts")

    private Boolean allAccounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_alert")

    private Boolean allowAlert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_id")

    private String dataspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_name")

    private String dataspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_active_time")

    private BigDecimal lastActiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_account_auto_access")

    private Boolean newAccountAutoAccess;

    /**
     * 日志的接入状态,可能的值为FAIL,DEFAULT,CREATING,SUCCESS,FAIL表示失败,DEFAULT表示待接入,CREATING表示接入中,SUCCESS表示成功
     */
    public static final class ProcessStatusEnum {

        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final ProcessStatusEnum FAIL = new ProcessStatusEnum("FAIL");

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final ProcessStatusEnum DEFAULT = new ProcessStatusEnum("DEFAULT");

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final ProcessStatusEnum CREATING = new ProcessStatusEnum("CREATING");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final ProcessStatusEnum SUCCESS = new ProcessStatusEnum("SUCCESS");

        private static final Map<String, ProcessStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProcessStatusEnum> createStaticFields() {
            Map<String, ProcessStatusEnum> map = new HashMap<>();
            map.put("FAIL", FAIL);
            map.put("DEFAULT", DEFAULT);
            map.put("CREATING", CREATING);
            map.put("SUCCESS", SUCCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProcessStatusEnum(String value) {
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
        public static ProcessStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProcessStatusEnum(value));
        }

        public static ProcessStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProcessStatusEnum) {
                return this.value.equals(((ProcessStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private ProcessStatusEnum processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference")

    private ListCollectConfigResponseBodyReference reference;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sink_msg")

    private String sinkMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private BigDecimal sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_name")

    private String sourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private ListCollectConfigResponseBodyTarget target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public ListCollectConfigResponseBodyDatasets withAccountAllNum(BigDecimal accountAllNum) {
        this.accountAllNum = accountAllNum;
        return this;
    }

    /**
     * 接入账号总数量
     * minimum: 0
     * maximum: 1E+4
     * @return accountAllNum
     */
    public BigDecimal getAccountAllNum() {
        return accountAllNum;
    }

    public void setAccountAllNum(BigDecimal accountAllNum) {
        this.accountAllNum = accountAllNum;
    }

    public ListCollectConfigResponseBodyDatasets withAccountSuccessfulNum(BigDecimal accountSuccessfulNum) {
        this.accountSuccessfulNum = accountSuccessfulNum;
        return this;
    }

    /**
     * 成功接入账号数量
     * minimum: 0
     * maximum: 1E+4
     * @return accountSuccessfulNum
     */
    public BigDecimal getAccountSuccessfulNum() {
        return accountSuccessfulNum;
    }

    public void setAccountSuccessfulNum(BigDecimal accountSuccessfulNum) {
        this.accountSuccessfulNum = accountSuccessfulNum;
    }

    public ListCollectConfigResponseBodyDatasets withAccounts(List<ListCollectConfigResponseBodyAccounts> accounts) {
        this.accounts = accounts;
        return this;
    }

    public ListCollectConfigResponseBodyDatasets addAccountsItem(ListCollectConfigResponseBodyAccounts accountsItem) {
        if (this.accounts == null) {
            this.accounts = new ArrayList<>();
        }
        this.accounts.add(accountsItem);
        return this;
    }

    public ListCollectConfigResponseBodyDatasets withAccounts(
        Consumer<List<ListCollectConfigResponseBodyAccounts>> accountsSetter) {
        if (this.accounts == null) {
            this.accounts = new ArrayList<>();
        }
        accountsSetter.accept(this.accounts);
        return this;
    }

    /**
     * 账号列表
     * @return accounts
     */
    public List<ListCollectConfigResponseBodyAccounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<ListCollectConfigResponseBodyAccounts> accounts) {
        this.accounts = accounts;
    }

    public ListCollectConfigResponseBodyDatasets withAlert(Boolean alert) {
        this.alert = alert;
        return this;
    }

    /**
     * 自动转告警开关
     * @return alert
     */
    public Boolean getAlert() {
        return alert;
    }

    public void setAlert(Boolean alert) {
        this.alert = alert;
    }

    public ListCollectConfigResponseBodyDatasets withAllAccounts(Boolean allAccounts) {
        this.allAccounts = allAccounts;
        return this;
    }

    /**
     * 是否接入已纳管的全量账号
     * @return allAccounts
     */
    public Boolean getAllAccounts() {
        return allAccounts;
    }

    public void setAllAccounts(Boolean allAccounts) {
        this.allAccounts = allAccounts;
    }

    public ListCollectConfigResponseBodyDatasets withAllowAlert(Boolean allowAlert) {
        this.allowAlert = allowAlert;
        return this;
    }

    /**
     * 能否开自动转告警
     * @return allowAlert
     */
    public Boolean getAllowAlert() {
        return allowAlert;
    }

    public void setAllowAlert(Boolean allowAlert) {
        this.allowAlert = allowAlert;
    }

    public ListCollectConfigResponseBodyDatasets withDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
        return this;
    }

    /**
     * 数据空间ID
     * @return dataspaceId
     */
    public String getDataspaceId() {
        return dataspaceId;
    }

    public void setDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
    }

    public ListCollectConfigResponseBodyDatasets withDataspaceName(String dataspaceName) {
        this.dataspaceName = dataspaceName;
        return this;
    }

    /**
     * 数据空间名称
     * @return dataspaceName
     */
    public String getDataspaceName() {
        return dataspaceName;
    }

    public void setDataspaceName(String dataspaceName) {
        this.dataspaceName = dataspaceName;
    }

    public ListCollectConfigResponseBodyDatasets withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 开启状态
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public ListCollectConfigResponseBodyDatasets withLastActiveTime(BigDecimal lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
        return this;
    }

    /**
     * 上次活跃时间
     * minimum: 0
     * maximum: 4.9E+12
     * @return lastActiveTime
     */
    public BigDecimal getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(BigDecimal lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public ListCollectConfigResponseBodyDatasets withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 限制
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListCollectConfigResponseBodyDatasets withNewAccountAutoAccess(Boolean newAccountAutoAccess) {
        this.newAccountAutoAccess = newAccountAutoAccess;
        return this;
    }

    /**
     * 新账号自动接入开关
     * @return newAccountAutoAccess
     */
    public Boolean getNewAccountAutoAccess() {
        return newAccountAutoAccess;
    }

    public void setNewAccountAutoAccess(Boolean newAccountAutoAccess) {
        this.newAccountAutoAccess = newAccountAutoAccess;
    }

    public ListCollectConfigResponseBodyDatasets withProcessStatus(ProcessStatusEnum processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * 日志的接入状态,可能的值为FAIL,DEFAULT,CREATING,SUCCESS,FAIL表示失败,DEFAULT表示待接入,CREATING表示接入中,SUCCESS表示成功
     * @return processStatus
     */
    public ProcessStatusEnum getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(ProcessStatusEnum processStatus) {
        this.processStatus = processStatus;
    }

    public ListCollectConfigResponseBodyDatasets withReference(ListCollectConfigResponseBodyReference reference) {
        this.reference = reference;
        return this;
    }

    public ListCollectConfigResponseBodyDatasets withReference(
        Consumer<ListCollectConfigResponseBodyReference> referenceSetter) {
        if (this.reference == null) {
            this.reference = new ListCollectConfigResponseBodyReference();
            referenceSetter.accept(this.reference);
        }

        return this;
    }

    /**
     * Get reference
     * @return reference
     */
    public ListCollectConfigResponseBodyReference getReference() {
        return reference;
    }

    public void setReference(ListCollectConfigResponseBodyReference reference) {
        this.reference = reference;
    }

    public ListCollectConfigResponseBodyDatasets withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 所属区域
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListCollectConfigResponseBodyDatasets withSinkMsg(String sinkMsg) {
        this.sinkMsg = sinkMsg;
        return this;
    }

    /**
     * 错误信息
     * @return sinkMsg
     */
    public String getSinkMsg() {
        return sinkMsg;
    }

    public void setSinkMsg(String sinkMsg) {
        this.sinkMsg = sinkMsg;
    }

    public ListCollectConfigResponseBodyDatasets withSourceId(BigDecimal sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 日志ID
     * minimum: 0
     * maximum: 1E+4
     * @return sourceId
     */
    public BigDecimal getSourceId() {
        return sourceId;
    }

    public void setSourceId(BigDecimal sourceId) {
        this.sourceId = sourceId;
    }

    public ListCollectConfigResponseBodyDatasets withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * 日志名称
     * @return sourceName
     */
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public ListCollectConfigResponseBodyDatasets withTarget(ListCollectConfigResponseBodyTarget target) {
        this.target = target;
        return this;
    }

    public ListCollectConfigResponseBodyDatasets withTarget(
        Consumer<ListCollectConfigResponseBodyTarget> targetSetter) {
        if (this.target == null) {
            this.target = new ListCollectConfigResponseBodyTarget();
            targetSetter.accept(this.target);
        }

        return this;
    }

    /**
     * Get target
     * @return target
     */
    public ListCollectConfigResponseBodyTarget getTarget() {
        return target;
    }

    public void setTarget(ListCollectConfigResponseBodyTarget target) {
        this.target = target;
    }

    public ListCollectConfigResponseBodyDatasets withType(String type) {
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

    public ListCollectConfigResponseBodyDatasets withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollectConfigResponseBodyDatasets that = (ListCollectConfigResponseBodyDatasets) obj;
        return Objects.equals(this.accountAllNum, that.accountAllNum)
            && Objects.equals(this.accountSuccessfulNum, that.accountSuccessfulNum)
            && Objects.equals(this.accounts, that.accounts) && Objects.equals(this.alert, that.alert)
            && Objects.equals(this.allAccounts, that.allAccounts) && Objects.equals(this.allowAlert, that.allowAlert)
            && Objects.equals(this.dataspaceId, that.dataspaceId)
            && Objects.equals(this.dataspaceName, that.dataspaceName) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.lastActiveTime, that.lastActiveTime) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.newAccountAutoAccess, that.newAccountAutoAccess)
            && Objects.equals(this.processStatus, that.processStatus) && Objects.equals(this.reference, that.reference)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.sinkMsg, that.sinkMsg)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.sourceName, that.sourceName)
            && Objects.equals(this.target, that.target) && Objects.equals(this.type, that.type)
            && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountAllNum,
            accountSuccessfulNum,
            accounts,
            alert,
            allAccounts,
            allowAlert,
            dataspaceId,
            dataspaceName,
            enable,
            lastActiveTime,
            limit,
            newAccountAutoAccess,
            processStatus,
            reference,
            regionId,
            sinkMsg,
            sourceId,
            sourceName,
            target,
            type,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollectConfigResponseBodyDatasets {\n");
        sb.append("    accountAllNum: ").append(toIndentedString(accountAllNum)).append("\n");
        sb.append("    accountSuccessfulNum: ").append(toIndentedString(accountSuccessfulNum)).append("\n");
        sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
        sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
        sb.append("    allAccounts: ").append(toIndentedString(allAccounts)).append("\n");
        sb.append("    allowAlert: ").append(toIndentedString(allowAlert)).append("\n");
        sb.append("    dataspaceId: ").append(toIndentedString(dataspaceId)).append("\n");
        sb.append("    dataspaceName: ").append(toIndentedString(dataspaceName)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    lastActiveTime: ").append(toIndentedString(lastActiveTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    newAccountAutoAccess: ").append(toIndentedString(newAccountAutoAccess)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    sinkMsg: ").append(toIndentedString(sinkMsg)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
