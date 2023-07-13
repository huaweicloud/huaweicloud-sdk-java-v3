package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 异步创建任务请求体。
 */
public class AsyncCreateJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private JobBaseInfo baseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_endpoint")

    private List<JobEndpointInfo> sourceEndpoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_endpoint")

    private List<JobEndpointInfo> targetEndpoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notify")

    private AlarmNotifyConfig alarmNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limit")

    private List<SpeedLimitInfo> speedLimit = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_migration")

    private UserMigrationInfo userMigration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_config")

    private PolicyConfig policyConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_object")

    private DbObject dbObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_param")

    private DbParamInfo dbParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuning_params")

    private TuningParamInfo tuningParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_order")

    private PeriodOrderInfo periodOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_info")

    private JobNodeInfo nodeInfo;

    public AsyncCreateJobReq withBaseInfo(JobBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public AsyncCreateJobReq withBaseInfo(Consumer<JobBaseInfo> baseInfoSetter) {
        if (this.baseInfo == null) {
            this.baseInfo = new JobBaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }

        return this;
    }

    /**
     * Get baseInfo
     * @return baseInfo
     */
    public JobBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(JobBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public AsyncCreateJobReq withSourceEndpoint(List<JobEndpointInfo> sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }

    public AsyncCreateJobReq addSourceEndpointItem(JobEndpointInfo sourceEndpointItem) {
        if (this.sourceEndpoint == null) {
            this.sourceEndpoint = new ArrayList<>();
        }
        this.sourceEndpoint.add(sourceEndpointItem);
        return this;
    }

    public AsyncCreateJobReq withSourceEndpoint(Consumer<List<JobEndpointInfo>> sourceEndpointSetter) {
        if (this.sourceEndpoint == null) {
            this.sourceEndpoint = new ArrayList<>();
        }
        sourceEndpointSetter.accept(this.sourceEndpoint);
        return this;
    }

    /**
     * 创建任务数据库信息体。
     * @return sourceEndpoint
     */
    public List<JobEndpointInfo> getSourceEndpoint() {
        return sourceEndpoint;
    }

    public void setSourceEndpoint(List<JobEndpointInfo> sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
    }

    public AsyncCreateJobReq withTargetEndpoint(List<JobEndpointInfo> targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
        return this;
    }

    public AsyncCreateJobReq addTargetEndpointItem(JobEndpointInfo targetEndpointItem) {
        if (this.targetEndpoint == null) {
            this.targetEndpoint = new ArrayList<>();
        }
        this.targetEndpoint.add(targetEndpointItem);
        return this;
    }

    public AsyncCreateJobReq withTargetEndpoint(Consumer<List<JobEndpointInfo>> targetEndpointSetter) {
        if (this.targetEndpoint == null) {
            this.targetEndpoint = new ArrayList<>();
        }
        targetEndpointSetter.accept(this.targetEndpoint);
        return this;
    }

    /**
     * 创建任务数据库信息体。
     * @return targetEndpoint
     */
    public List<JobEndpointInfo> getTargetEndpoint() {
        return targetEndpoint;
    }

    public void setTargetEndpoint(List<JobEndpointInfo> targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
    }

    public AsyncCreateJobReq withAlarmNotify(AlarmNotifyConfig alarmNotify) {
        this.alarmNotify = alarmNotify;
        return this;
    }

    public AsyncCreateJobReq withAlarmNotify(Consumer<AlarmNotifyConfig> alarmNotifySetter) {
        if (this.alarmNotify == null) {
            this.alarmNotify = new AlarmNotifyConfig();
            alarmNotifySetter.accept(this.alarmNotify);
        }

        return this;
    }

    /**
     * Get alarmNotify
     * @return alarmNotify
     */
    public AlarmNotifyConfig getAlarmNotify() {
        return alarmNotify;
    }

    public void setAlarmNotify(AlarmNotifyConfig alarmNotify) {
        this.alarmNotify = alarmNotify;
    }

    public AsyncCreateJobReq withSpeedLimit(List<SpeedLimitInfo> speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    public AsyncCreateJobReq addSpeedLimitItem(SpeedLimitInfo speedLimitItem) {
        if (this.speedLimit == null) {
            this.speedLimit = new ArrayList<>();
        }
        this.speedLimit.add(speedLimitItem);
        return this;
    }

    public AsyncCreateJobReq withSpeedLimit(Consumer<List<SpeedLimitInfo>> speedLimitSetter) {
        if (this.speedLimit == null) {
            this.speedLimit = new ArrayList<>();
        }
        speedLimitSetter.accept(this.speedLimit);
        return this;
    }

    /**
     * 限速信息体。 - 限速：自定义的最大迁移速度，迁移过程中的迁移速度将不会超过该速度。 - 不限速：对迁移速度不进行限制，通常会最大化使用源数据库的出口带宽。该流速模式同时会对源数据库造成读消耗，消耗取决于源数据库的出口带宽。比如：源数据库的出口带宽为100MB/s，假设高速模式使用了80%带宽，则迁移对源数据库将造成80MB/s的读操作IO消耗。
     * @return speedLimit
     */
    public List<SpeedLimitInfo> getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(List<SpeedLimitInfo> speedLimit) {
        this.speedLimit = speedLimit;
    }

    public AsyncCreateJobReq withUserMigration(UserMigrationInfo userMigration) {
        this.userMigration = userMigration;
        return this;
    }

    public AsyncCreateJobReq withUserMigration(Consumer<UserMigrationInfo> userMigrationSetter) {
        if (this.userMigration == null) {
            this.userMigration = new UserMigrationInfo();
            userMigrationSetter.accept(this.userMigration);
        }

        return this;
    }

    /**
     * Get userMigration
     * @return userMigration
     */
    public UserMigrationInfo getUserMigration() {
        return userMigration;
    }

    public void setUserMigration(UserMigrationInfo userMigration) {
        this.userMigration = userMigration;
    }

    public AsyncCreateJobReq withPolicyConfig(PolicyConfig policyConfig) {
        this.policyConfig = policyConfig;
        return this;
    }

    public AsyncCreateJobReq withPolicyConfig(Consumer<PolicyConfig> policyConfigSetter) {
        if (this.policyConfig == null) {
            this.policyConfig = new PolicyConfig();
            policyConfigSetter.accept(this.policyConfig);
        }

        return this;
    }

    /**
     * Get policyConfig
     * @return policyConfig
     */
    public PolicyConfig getPolicyConfig() {
        return policyConfig;
    }

    public void setPolicyConfig(PolicyConfig policyConfig) {
        this.policyConfig = policyConfig;
    }

    public AsyncCreateJobReq withDbObject(DbObject dbObject) {
        this.dbObject = dbObject;
        return this;
    }

    public AsyncCreateJobReq withDbObject(Consumer<DbObject> dbObjectSetter) {
        if (this.dbObject == null) {
            this.dbObject = new DbObject();
            dbObjectSetter.accept(this.dbObject);
        }

        return this;
    }

    /**
     * Get dbObject
     * @return dbObject
     */
    public DbObject getDbObject() {
        return dbObject;
    }

    public void setDbObject(DbObject dbObject) {
        this.dbObject = dbObject;
    }

    public AsyncCreateJobReq withDbParam(DbParamInfo dbParam) {
        this.dbParam = dbParam;
        return this;
    }

    public AsyncCreateJobReq withDbParam(Consumer<DbParamInfo> dbParamSetter) {
        if (this.dbParam == null) {
            this.dbParam = new DbParamInfo();
            dbParamSetter.accept(this.dbParam);
        }

        return this;
    }

    /**
     * Get dbParam
     * @return dbParam
     */
    public DbParamInfo getDbParam() {
        return dbParam;
    }

    public void setDbParam(DbParamInfo dbParam) {
        this.dbParam = dbParam;
    }

    public AsyncCreateJobReq withTuningParams(TuningParamInfo tuningParams) {
        this.tuningParams = tuningParams;
        return this;
    }

    public AsyncCreateJobReq withTuningParams(Consumer<TuningParamInfo> tuningParamsSetter) {
        if (this.tuningParams == null) {
            this.tuningParams = new TuningParamInfo();
            tuningParamsSetter.accept(this.tuningParams);
        }

        return this;
    }

    /**
     * Get tuningParams
     * @return tuningParams
     */
    public TuningParamInfo getTuningParams() {
        return tuningParams;
    }

    public void setTuningParams(TuningParamInfo tuningParams) {
        this.tuningParams = tuningParams;
    }

    public AsyncCreateJobReq withPeriodOrder(PeriodOrderInfo periodOrder) {
        this.periodOrder = periodOrder;
        return this;
    }

    public AsyncCreateJobReq withPeriodOrder(Consumer<PeriodOrderInfo> periodOrderSetter) {
        if (this.periodOrder == null) {
            this.periodOrder = new PeriodOrderInfo();
            periodOrderSetter.accept(this.periodOrder);
        }

        return this;
    }

    /**
     * Get periodOrder
     * @return periodOrder
     */
    public PeriodOrderInfo getPeriodOrder() {
        return periodOrder;
    }

    public void setPeriodOrder(PeriodOrderInfo periodOrder) {
        this.periodOrder = periodOrder;
    }

    public AsyncCreateJobReq withNodeInfo(JobNodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    public AsyncCreateJobReq withNodeInfo(Consumer<JobNodeInfo> nodeInfoSetter) {
        if (this.nodeInfo == null) {
            this.nodeInfo = new JobNodeInfo();
            nodeInfoSetter.accept(this.nodeInfo);
        }

        return this;
    }

    /**
     * Get nodeInfo
     * @return nodeInfo
     */
    public JobNodeInfo getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(JobNodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AsyncCreateJobReq that = (AsyncCreateJobReq) obj;
        return Objects.equals(this.baseInfo, that.baseInfo) && Objects.equals(this.sourceEndpoint, that.sourceEndpoint)
            && Objects.equals(this.targetEndpoint, that.targetEndpoint)
            && Objects.equals(this.alarmNotify, that.alarmNotify) && Objects.equals(this.speedLimit, that.speedLimit)
            && Objects.equals(this.userMigration, that.userMigration)
            && Objects.equals(this.policyConfig, that.policyConfig) && Objects.equals(this.dbObject, that.dbObject)
            && Objects.equals(this.dbParam, that.dbParam) && Objects.equals(this.tuningParams, that.tuningParams)
            && Objects.equals(this.periodOrder, that.periodOrder) && Objects.equals(this.nodeInfo, that.nodeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseInfo,
            sourceEndpoint,
            targetEndpoint,
            alarmNotify,
            speedLimit,
            userMigration,
            policyConfig,
            dbObject,
            dbParam,
            tuningParams,
            periodOrder,
            nodeInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsyncCreateJobReq {\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    sourceEndpoint: ").append(toIndentedString(sourceEndpoint)).append("\n");
        sb.append("    targetEndpoint: ").append(toIndentedString(targetEndpoint)).append("\n");
        sb.append("    alarmNotify: ").append(toIndentedString(alarmNotify)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    userMigration: ").append(toIndentedString(userMigration)).append("\n");
        sb.append("    policyConfig: ").append(toIndentedString(policyConfig)).append("\n");
        sb.append("    dbObject: ").append(toIndentedString(dbObject)).append("\n");
        sb.append("    dbParam: ").append(toIndentedString(dbParam)).append("\n");
        sb.append("    tuningParams: ").append(toIndentedString(tuningParams)).append("\n");
        sb.append("    periodOrder: ").append(toIndentedString(periodOrder)).append("\n");
        sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
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
