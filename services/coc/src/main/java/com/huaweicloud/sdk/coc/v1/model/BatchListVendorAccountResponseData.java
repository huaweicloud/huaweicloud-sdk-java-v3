package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * BatchListVendorAccountResponseData
 */
public class BatchListVendorAccountResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    /**
     * **参数解释：** 任务状态。 **取值范围：** - waiting：待启动。 - running：同步中。 - success：同步成功。 - failed：同步失败。
     */
    public static final class SyncStatusEnum {

        /**
         * Enum WAITING for value: "waiting"
         */
        public static final SyncStatusEnum WAITING = new SyncStatusEnum("waiting");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final SyncStatusEnum RUNNING = new SyncStatusEnum("running");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final SyncStatusEnum SUCCESS = new SyncStatusEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final SyncStatusEnum FAILED = new SyncStatusEnum("failed");

        private static final Map<String, SyncStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SyncStatusEnum> createStaticFields() {
            Map<String, SyncStatusEnum> map = new HashMap<>();
            map.put("waiting", WAITING);
            map.put("running", RUNNING);
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SyncStatusEnum(String value) {
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
        public static SyncStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SyncStatusEnum(value));
        }

        public static SyncStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SyncStatusEnum) {
                return this.value.equals(((SyncStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_status")

    private SyncStatusEnum syncStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_msg")

    private String failureMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_date")

    private OffsetDateTime syncDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public BatchListVendorAccountResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** CMDB分配的云厂商账户ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchListVendorAccountResponseData withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * **参数解释：** 云广商信息。 **取值范围：** - RMS： 华为云。 - AWS：亚马逊。 - AZURE：微软。 - ALI：阿里云。 - VMWARE：VMware。 - OPENSTACK：openstack云平台。 - HCS：Huawei Cloud Stack。 - OTHER：其他云广商。
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public BatchListVendorAccountResponseData withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * **参数解释：** 供应商的账户ID。 **取值范围：** 字符串，长度0到64个字符。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public BatchListVendorAccountResponseData withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释：** 租户id。 **取值范围：** 不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public BatchListVendorAccountResponseData withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * **参数解释：** 账户名。 **取值范围：** 字符串，长度0到64个字符。
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public BatchListVendorAccountResponseData withAk(String ak) {
        this.ak = ak;
        return this;
    }

    /**
     * **参数解释：** 账户ak。 **取值范围：** 字符串，长度0到64个字符。
     * @return ak
     */
    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public BatchListVendorAccountResponseData withSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * **参数解释：** 任务状态。 **取值范围：** - waiting：待启动。 - running：同步中。 - success：同步成功。 - failed：同步失败。
     * @return syncStatus
     */
    public SyncStatusEnum getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
    }

    public BatchListVendorAccountResponseData withFailureMsg(String failureMsg) {
        this.failureMsg = failureMsg;
        return this;
    }

    /**
     * **参数解释：** 错误信息。 **取值范围：** 不涉及。
     * @return failureMsg
     */
    public String getFailureMsg() {
        return failureMsg;
    }

    public void setFailureMsg(String failureMsg) {
        this.failureMsg = failureMsg;
    }

    public BatchListVendorAccountResponseData withSyncDate(OffsetDateTime syncDate) {
        this.syncDate = syncDate;
        return this;
    }

    /**
     * **参数解释：** 同步时间。 **取值范围：** 不涉及。
     * @return syncDate
     */
    public OffsetDateTime getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(OffsetDateTime syncDate) {
        this.syncDate = syncDate;
    }

    public BatchListVendorAccountResponseData withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** 不涉及。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public BatchListVendorAccountResponseData withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释：** 更新时间。 **取值范围：** 不涉及。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchListVendorAccountResponseData that = (BatchListVendorAccountResponseData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.vendor, that.vendor)
            && Objects.equals(this.accountId, that.accountId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.accountName, that.accountName) && Objects.equals(this.ak, that.ak)
            && Objects.equals(this.syncStatus, that.syncStatus) && Objects.equals(this.failureMsg, that.failureMsg)
            && Objects.equals(this.syncDate, that.syncDate) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            vendor,
            accountId,
            domainId,
            accountName,
            ak,
            syncStatus,
            failureMsg,
            syncDate,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListVendorAccountResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
        sb.append("    failureMsg: ").append(toIndentedString(failureMsg)).append("\n");
        sb.append("    syncDate: ").append(toIndentedString(syncDate)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
