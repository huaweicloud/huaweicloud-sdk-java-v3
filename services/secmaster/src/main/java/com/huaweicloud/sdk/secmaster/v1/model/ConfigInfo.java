package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConfigInfo
 */
public class ConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accounts")

    private List<String> accounts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert")

    private Boolean alert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_accounts")

    private Boolean allAccounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csvc")

    private String csvc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csvc_display")

    private String csvcDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Long enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_account_auto_access")

    private Boolean newAccountAutoAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shards")

    private Long shards;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_display")

    private String sourceDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private Long sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_name")

    private String sourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Long ttl;

    public ConfigInfo withAccounts(List<String> accounts) {
        this.accounts = accounts;
        return this;
    }

    public ConfigInfo addAccountsItem(String accountsItem) {
        if (this.accounts == null) {
            this.accounts = new ArrayList<>();
        }
        this.accounts.add(accountsItem);
        return this;
    }

    public ConfigInfo withAccounts(Consumer<List<String>> accountsSetter) {
        if (this.accounts == null) {
            this.accounts = new ArrayList<>();
        }
        accountsSetter.accept(this.accounts);
        return this;
    }

    /**
     * 纳管账号列表(非跨账号场景不传递)
     * @return accounts
     */
    public List<String> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<String> accounts) {
        this.accounts = accounts;
    }

    public ConfigInfo withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ConfigInfo withAlert(Boolean alert) {
        this.alert = alert;
        return this;
    }

    /**
     * 自动转告警的开关
     * @return alert
     */
    public Boolean getAlert() {
        return alert;
    }

    public void setAlert(Boolean alert) {
        this.alert = alert;
    }

    public ConfigInfo withAllAccounts(Boolean allAccounts) {
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

    public ConfigInfo withCsvc(String csvc) {
        this.csvc = csvc;
        return this;
    }

    /**
     * 云产品
     * @return csvc
     */
    public String getCsvc() {
        return csvc;
    }

    public void setCsvc(String csvc) {
        this.csvc = csvc;
    }

    public ConfigInfo withCsvcDisplay(String csvcDisplay) {
        this.csvcDisplay = csvcDisplay;
        return this;
    }

    /**
     * 云服务描述
     * @return csvcDisplay
     */
    public String getCsvcDisplay() {
        return csvcDisplay;
    }

    public void setCsvcDisplay(String csvcDisplay) {
        this.csvcDisplay = csvcDisplay;
    }

    public ConfigInfo withEnable(Long enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 启用状态：0未启用；1启用
     * minimum: 0
     * maximum: 10
     * @return enable
     */
    public Long getEnable() {
        return enable;
    }

    public void setEnable(Long enable) {
        this.enable = enable;
    }

    public ConfigInfo withNewAccountAutoAccess(Boolean newAccountAutoAccess) {
        this.newAccountAutoAccess = newAccountAutoAccess;
        return this;
    }

    /**
     * 新账号自动同步的开关
     * @return newAccountAutoAccess
     */
    public Boolean getNewAccountAutoAccess() {
        return newAccountAutoAccess;
    }

    public void setNewAccountAutoAccess(Boolean newAccountAutoAccess) {
        this.newAccountAutoAccess = newAccountAutoAccess;
    }

    public ConfigInfo withShards(Long shards) {
        this.shards = shards;
        return this;
    }

    /**
     * 所需分区数
     * minimum: 0
     * maximum: 99
     * @return shards
     */
    public Long getShards() {
        return shards;
    }

    public void setShards(Long shards) {
        this.shards = shards;
    }

    public ConfigInfo withSourceDisplay(String sourceDisplay) {
        this.sourceDisplay = sourceDisplay;
        return this;
    }

    /**
     * 数据源描述
     * @return sourceDisplay
     */
    public String getSourceDisplay() {
        return sourceDisplay;
    }

    public void setSourceDisplay(String sourceDisplay) {
        this.sourceDisplay = sourceDisplay;
    }

    public ConfigInfo withSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 数据源ID
     * minimum: 0
     * maximum: 9223372036854775807
     * @return sourceId
     */
    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public ConfigInfo withSourceName(String sourceName) {
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

    public ConfigInfo withTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 数据生命周期
     * minimum: 7
     * maximum: 180
     * @return ttl
     */
    public Long getTtl() {
        return ttl;
    }

    public void setTtl(Long ttl) {
        this.ttl = ttl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigInfo that = (ConfigInfo) obj;
        return Objects.equals(this.accounts, that.accounts) && Objects.equals(this.action, that.action)
            && Objects.equals(this.alert, that.alert) && Objects.equals(this.allAccounts, that.allAccounts)
            && Objects.equals(this.csvc, that.csvc) && Objects.equals(this.csvcDisplay, that.csvcDisplay)
            && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.newAccountAutoAccess, that.newAccountAutoAccess)
            && Objects.equals(this.shards, that.shards) && Objects.equals(this.sourceDisplay, that.sourceDisplay)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.sourceName, that.sourceName)
            && Objects.equals(this.ttl, that.ttl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accounts,
            action,
            alert,
            allAccounts,
            csvc,
            csvcDisplay,
            enable,
            newAccountAutoAccess,
            shards,
            sourceDisplay,
            sourceId,
            sourceName,
            ttl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigInfo {\n");
        sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
        sb.append("    allAccounts: ").append(toIndentedString(allAccounts)).append("\n");
        sb.append("    csvc: ").append(toIndentedString(csvc)).append("\n");
        sb.append("    csvcDisplay: ").append(toIndentedString(csvcDisplay)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    newAccountAutoAccess: ").append(toIndentedString(newAccountAutoAccess)).append("\n");
        sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
        sb.append("    sourceDisplay: ").append(toIndentedString(sourceDisplay)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
