package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * SimDeviceVO
 */
public class SimDeviceVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_id")

    private Long simCardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cid")

    private String cid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_pool_id")

    private Long simPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imei")

    private String imei;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_status")

    private Integer simStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_status")

    private Integer deviceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_model")

    private String deviceModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "act_date")

    private OffsetDateTime actDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_status_date")

    private OffsetDateTime deviceStatusDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iccid")

    private String iccid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private String networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbm")

    private String dbm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signal_level")

    private String signalLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_type")

    private Integer simType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_names")

    private String tagNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private Long orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private OffsetDateTime expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price_plan_name")

    private String pricePlanName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_price_plan_id")

    private Long simPricePlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_left")

    private Double flowLeft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_used")

    private Double flowUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator_status")

    private Integer operatorStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msisdn")

    private String msisdn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imsi")

    private String imsi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute1")

    private String customerAttribute1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute2")

    private String customerAttribute2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute3")

    private String customerAttribute3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute4")

    private String customerAttribute4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute5")

    private String customerAttribute5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute6")

    private String customerAttribute6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_named")

    private Boolean realNamed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cut_net_flag")

    private Boolean cutNetFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exceed_cut_net_flag")

    private Boolean exceedCutNetFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exceed_cut_net_quota")

    private Integer exceedCutNetQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imei_bind_remain_times")

    private Integer imeiBindRemainTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_value")

    private Integer speedValue;

    public SimDeviceVO withSimCardId(Long simCardId) {
        this.simCardId = simCardId;
        return this;
    }

    /**
     * sim卡id
     * @return simCardId
     */
    public Long getSimCardId() {
        return simCardId;
    }

    public void setSimCardId(Long simCardId) {
        this.simCardId = simCardId;
    }

    public SimDeviceVO withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 账户id
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public SimDeviceVO withCid(String cid) {
        this.cid = cid;
        return this;
    }

    /**
     * 容器ID:不同类型卡含义如下 iccid(实体卡)，eid（eSIM）cid（vSIM)
     * @return cid
     */
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public SimDeviceVO withSimPoolId(Long simPoolId) {
        this.simPoolId = simPoolId;
        return this;
    }

    /**
     * 流量池ID
     * @return simPoolId
     */
    public Long getSimPoolId() {
        return simPoolId;
    }

    public void setSimPoolId(Long simPoolId) {
        this.simPoolId = simPoolId;
    }

    public SimDeviceVO withImei(String imei) {
        this.imei = imei;
        return this;
    }

    /**
     * 设备IMEI
     * @return imei
     */
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public SimDeviceVO withSimStatus(Integer simStatus) {
        this.simStatus = simStatus;
        return this;
    }

    /**
     * sim卡状态：  10.可测试  11.未激活  13.可激活  14.已停用  20.在用  30.已拆机
     * @return simStatus
     */
    public Integer getSimStatus() {
        return simStatus;
    }

    public void setSimStatus(Integer simStatus) {
        this.simStatus = simStatus;
    }

    public SimDeviceVO withDeviceStatus(Integer deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }

    /**
     * 设备状态
     * @return deviceStatus
     */
    public Integer getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Integer deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public SimDeviceVO withDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }

    /**
     * 设备模组
     * @return deviceModel
     */
    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public SimDeviceVO withActDate(OffsetDateTime actDate) {
        this.actDate = actDate;
        return this;
    }

    /**
     * 激活日期 例如2020-01-31T16:00:00.000Z
     * @return actDate
     */
    public OffsetDateTime getActDate() {
        return actDate;
    }

    public void setActDate(OffsetDateTime actDate) {
        this.actDate = actDate;
    }

    public SimDeviceVO withDeviceStatusDate(OffsetDateTime deviceStatusDate) {
        this.deviceStatusDate = deviceStatusDate;
        return this;
    }

    /**
     * 设备状态变更时间 例如2020-01-31T16:00:00.000Z
     * @return deviceStatusDate
     */
    public OffsetDateTime getDeviceStatusDate() {
        return deviceStatusDate;
    }

    public void setDeviceStatusDate(OffsetDateTime deviceStatusDate) {
        this.deviceStatusDate = deviceStatusDate;
    }

    public SimDeviceVO withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 设备标识
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public SimDeviceVO withIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }

    /**
     * 码号iccid
     * @return iccid
     */
    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public SimDeviceVO withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * 网络类型
     * @return networkType
     */
    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public SimDeviceVO withDbm(String dbm) {
        this.dbm = dbm;
        return this;
    }

    /**
     * 信号强度
     * @return dbm
     */
    public String getDbm() {
        return dbm;
    }

    public void setDbm(String dbm) {
        this.dbm = dbm;
    }

    public SimDeviceVO withSignalLevel(String signalLevel) {
        this.signalLevel = signalLevel;
        return this;
    }

    /**
     * 信号等级:1.差  2.良  3.良 4.优（该参数只有eSIM,vSIM返回，实体卡不返回）
     * @return signalLevel
     */
    public String getSignalLevel() {
        return signalLevel;
    }

    public void setSignalLevel(String signalLevel) {
        this.signalLevel = signalLevel;
    }

    public SimDeviceVO withSimType(Integer simType) {
        this.simType = simType;
        return this;
    }

    /**
     * sim卡类型 1.vSIM  2.eSIM  3.实体卡
     * @return simType
     */
    public Integer getSimType() {
        return simType;
    }

    public void setSimType(Integer simType) {
        this.simType = simType;
    }

    public SimDeviceVO withTagNames(String tagNames) {
        this.tagNames = tagNames;
        return this;
    }

    /**
     * 标签名
     * @return tagNames
     */
    public String getTagNames() {
        return tagNames;
    }

    public void setTagNames(String tagNames) {
        this.tagNames = tagNames;
    }

    public SimDeviceVO withOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 批次号
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public SimDeviceVO withExpireTime(OffsetDateTime expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 到期时间 例如2021-06-30T00:00:00.000Z
     * @return expireTime
     */
    public OffsetDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(OffsetDateTime expireTime) {
        this.expireTime = expireTime;
    }

    public SimDeviceVO withPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
        return this;
    }

    /**
     * 在用套餐名
     * @return pricePlanName
     */
    public String getPricePlanName() {
        return pricePlanName;
    }

    public void setPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
    }

    public SimDeviceVO withSimPricePlanId(Long simPricePlanId) {
        this.simPricePlanId = simPricePlanId;
        return this;
    }

    /**
     * 套餐订购实例ID
     * @return simPricePlanId
     */
    public Long getSimPricePlanId() {
        return simPricePlanId;
    }

    public void setSimPricePlanId(Long simPricePlanId) {
        this.simPricePlanId = simPricePlanId;
    }

    public SimDeviceVO withFlowLeft(Double flowLeft) {
        this.flowLeft = flowLeft;
        return this;
    }

    /**
     * 剩余流量(单位M)，数据默认截止到昨日24点。
     * @return flowLeft
     */
    public Double getFlowLeft() {
        return flowLeft;
    }

    public void setFlowLeft(Double flowLeft) {
        this.flowLeft = flowLeft;
    }

    public SimDeviceVO withFlowUsed(Double flowUsed) {
        this.flowUsed = flowUsed;
        return this;
    }

    /**
     * 已用流量(单位M)，数据默认截止到昨日24点。
     * @return flowUsed
     */
    public Double getFlowUsed() {
        return flowUsed;
    }

    public void setFlowUsed(Double flowUsed) {
        this.flowUsed = flowUsed;
    }

    public SimDeviceVO withOperatorStatus(Integer operatorStatus) {
        this.operatorStatus = operatorStatus;
        return this;
    }

    /**
     * 运营商状态 -1.正常（非停机状态） 1.停机（超流量停机） 2.停机（超流量阈值停机） 3.停机（流量池停机） 4.停机（套餐到期停机） 5.停机（主动停机） 6.停机（违规停机） 7.停机（机卡分离停机）
     * @return operatorStatus
     */
    public Integer getOperatorStatus() {
        return operatorStatus;
    }

    public void setOperatorStatus(Integer operatorStatus) {
        this.operatorStatus = operatorStatus;
    }

    public SimDeviceVO withMsisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }

    /**
     * MSISDN
     * @return msisdn
     */
    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public SimDeviceVO withImsi(String imsi) {
        this.imsi = imsi;
        return this;
    }

    /**
     * IMSI
     * @return imsi
     */
    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public SimDeviceVO withCustomerAttribute1(String customerAttribute1) {
        this.customerAttribute1 = customerAttribute1;
        return this;
    }

    /**
     * 自定义属性一
     * @return customerAttribute1
     */
    public String getCustomerAttribute1() {
        return customerAttribute1;
    }

    public void setCustomerAttribute1(String customerAttribute1) {
        this.customerAttribute1 = customerAttribute1;
    }

    public SimDeviceVO withCustomerAttribute2(String customerAttribute2) {
        this.customerAttribute2 = customerAttribute2;
        return this;
    }

    /**
     * 自定义属性二
     * @return customerAttribute2
     */
    public String getCustomerAttribute2() {
        return customerAttribute2;
    }

    public void setCustomerAttribute2(String customerAttribute2) {
        this.customerAttribute2 = customerAttribute2;
    }

    public SimDeviceVO withCustomerAttribute3(String customerAttribute3) {
        this.customerAttribute3 = customerAttribute3;
        return this;
    }

    /**
     * 自定义属性三
     * @return customerAttribute3
     */
    public String getCustomerAttribute3() {
        return customerAttribute3;
    }

    public void setCustomerAttribute3(String customerAttribute3) {
        this.customerAttribute3 = customerAttribute3;
    }

    public SimDeviceVO withCustomerAttribute4(String customerAttribute4) {
        this.customerAttribute4 = customerAttribute4;
        return this;
    }

    /**
     * 自定义属性四
     * @return customerAttribute4
     */
    public String getCustomerAttribute4() {
        return customerAttribute4;
    }

    public void setCustomerAttribute4(String customerAttribute4) {
        this.customerAttribute4 = customerAttribute4;
    }

    public SimDeviceVO withCustomerAttribute5(String customerAttribute5) {
        this.customerAttribute5 = customerAttribute5;
        return this;
    }

    /**
     * 自定义属性五
     * @return customerAttribute5
     */
    public String getCustomerAttribute5() {
        return customerAttribute5;
    }

    public void setCustomerAttribute5(String customerAttribute5) {
        this.customerAttribute5 = customerAttribute5;
    }

    public SimDeviceVO withCustomerAttribute6(String customerAttribute6) {
        this.customerAttribute6 = customerAttribute6;
        return this;
    }

    /**
     * 自定义属性六
     * @return customerAttribute6
     */
    public String getCustomerAttribute6() {
        return customerAttribute6;
    }

    public void setCustomerAttribute6(String customerAttribute6) {
        this.customerAttribute6 = customerAttribute6;
    }

    public SimDeviceVO withRealNamed(Boolean realNamed) {
        this.realNamed = realNamed;
        return this;
    }

    /**
     * 是否已实名认证: true表示是，false表示否，系统SIM卡实名认证状态非实时。
     * @return realNamed
     */
    public Boolean getRealNamed() {
        return realNamed;
    }

    public void setRealNamed(Boolean realNamed) {
        this.realNamed = realNamed;
    }

    public SimDeviceVO withCutNetFlag(Boolean cutNetFlag) {
        this.cutNetFlag = cutNetFlag;
        return this;
    }

    /**
     * 是否单独断网 true:断网，false:未断网 （当前仅电信卡支持）
     * @return cutNetFlag
     */
    public Boolean getCutNetFlag() {
        return cutNetFlag;
    }

    public void setCutNetFlag(Boolean cutNetFlag) {
        this.cutNetFlag = cutNetFlag;
    }

    public SimDeviceVO withExceedCutNetFlag(Boolean exceedCutNetFlag) {
        this.exceedCutNetFlag = exceedCutNetFlag;
        return this;
    }

    /**
     * 是否达量断网 true:达量断网，false:未达量断网 （当前仅电信卡支持）
     * @return exceedCutNetFlag
     */
    public Boolean getExceedCutNetFlag() {
        return exceedCutNetFlag;
    }

    public void setExceedCutNetFlag(Boolean exceedCutNetFlag) {
        this.exceedCutNetFlag = exceedCutNetFlag;
    }

    public SimDeviceVO withExceedCutNetQuota(Integer exceedCutNetQuota) {
        this.exceedCutNetQuota = exceedCutNetQuota;
        return this;
    }

    /**
     * 达量断网阈值（单位MB 当前仅电信卡支持）
     * @return exceedCutNetQuota
     */
    public Integer getExceedCutNetQuota() {
        return exceedCutNetQuota;
    }

    public void setExceedCutNetQuota(Integer exceedCutNetQuota) {
        this.exceedCutNetQuota = exceedCutNetQuota;
    }

    public SimDeviceVO withImeiBindRemainTimes(Integer imeiBindRemainTimes) {
        this.imeiBindRemainTimes = imeiBindRemainTimes;
        return this;
    }

    /**
     * 本月机卡绑定剩余次数（当前仅电信卡支持）
     * @return imeiBindRemainTimes
     */
    public Integer getImeiBindRemainTimes() {
        return imeiBindRemainTimes;
    }

    public void setImeiBindRemainTimes(Integer imeiBindRemainTimes) {
        this.imeiBindRemainTimes = imeiBindRemainTimes;
    }

    public SimDeviceVO withSpeedValue(Integer speedValue) {
        this.speedValue = speedValue;
        return this;
    }

    /**
     * 网络限制速率（单位Kbps,当前电信联通卡支持）
     * @return speedValue
     */
    public Integer getSpeedValue() {
        return speedValue;
    }

    public void setSpeedValue(Integer speedValue) {
        this.speedValue = speedValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimDeviceVO simDeviceVO = (SimDeviceVO) o;
        return Objects.equals(this.simCardId, simDeviceVO.simCardId)
            && Objects.equals(this.accountId, simDeviceVO.accountId) && Objects.equals(this.cid, simDeviceVO.cid)
            && Objects.equals(this.simPoolId, simDeviceVO.simPoolId) && Objects.equals(this.imei, simDeviceVO.imei)
            && Objects.equals(this.simStatus, simDeviceVO.simStatus)
            && Objects.equals(this.deviceStatus, simDeviceVO.deviceStatus)
            && Objects.equals(this.deviceModel, simDeviceVO.deviceModel)
            && Objects.equals(this.actDate, simDeviceVO.actDate)
            && Objects.equals(this.deviceStatusDate, simDeviceVO.deviceStatusDate)
            && Objects.equals(this.nodeId, simDeviceVO.nodeId) && Objects.equals(this.iccid, simDeviceVO.iccid)
            && Objects.equals(this.networkType, simDeviceVO.networkType) && Objects.equals(this.dbm, simDeviceVO.dbm)
            && Objects.equals(this.signalLevel, simDeviceVO.signalLevel)
            && Objects.equals(this.simType, simDeviceVO.simType) && Objects.equals(this.tagNames, simDeviceVO.tagNames)
            && Objects.equals(this.orderId, simDeviceVO.orderId)
            && Objects.equals(this.expireTime, simDeviceVO.expireTime)
            && Objects.equals(this.pricePlanName, simDeviceVO.pricePlanName)
            && Objects.equals(this.simPricePlanId, simDeviceVO.simPricePlanId)
            && Objects.equals(this.flowLeft, simDeviceVO.flowLeft)
            && Objects.equals(this.flowUsed, simDeviceVO.flowUsed)
            && Objects.equals(this.operatorStatus, simDeviceVO.operatorStatus)
            && Objects.equals(this.msisdn, simDeviceVO.msisdn) && Objects.equals(this.imsi, simDeviceVO.imsi)
            && Objects.equals(this.customerAttribute1, simDeviceVO.customerAttribute1)
            && Objects.equals(this.customerAttribute2, simDeviceVO.customerAttribute2)
            && Objects.equals(this.customerAttribute3, simDeviceVO.customerAttribute3)
            && Objects.equals(this.customerAttribute4, simDeviceVO.customerAttribute4)
            && Objects.equals(this.customerAttribute5, simDeviceVO.customerAttribute5)
            && Objects.equals(this.customerAttribute6, simDeviceVO.customerAttribute6)
            && Objects.equals(this.realNamed, simDeviceVO.realNamed)
            && Objects.equals(this.cutNetFlag, simDeviceVO.cutNetFlag)
            && Objects.equals(this.exceedCutNetFlag, simDeviceVO.exceedCutNetFlag)
            && Objects.equals(this.exceedCutNetQuota, simDeviceVO.exceedCutNetQuota)
            && Objects.equals(this.imeiBindRemainTimes, simDeviceVO.imeiBindRemainTimes)
            && Objects.equals(this.speedValue, simDeviceVO.speedValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simCardId,
            accountId,
            cid,
            simPoolId,
            imei,
            simStatus,
            deviceStatus,
            deviceModel,
            actDate,
            deviceStatusDate,
            nodeId,
            iccid,
            networkType,
            dbm,
            signalLevel,
            simType,
            tagNames,
            orderId,
            expireTime,
            pricePlanName,
            simPricePlanId,
            flowLeft,
            flowUsed,
            operatorStatus,
            msisdn,
            imsi,
            customerAttribute1,
            customerAttribute2,
            customerAttribute3,
            customerAttribute4,
            customerAttribute5,
            customerAttribute6,
            realNamed,
            cutNetFlag,
            exceedCutNetFlag,
            exceedCutNetQuota,
            imeiBindRemainTimes,
            speedValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimDeviceVO {\n");
        sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
        sb.append("    simPoolId: ").append(toIndentedString(simPoolId)).append("\n");
        sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
        sb.append("    simStatus: ").append(toIndentedString(simStatus)).append("\n");
        sb.append("    deviceStatus: ").append(toIndentedString(deviceStatus)).append("\n");
        sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
        sb.append("    actDate: ").append(toIndentedString(actDate)).append("\n");
        sb.append("    deviceStatusDate: ").append(toIndentedString(deviceStatusDate)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    dbm: ").append(toIndentedString(dbm)).append("\n");
        sb.append("    signalLevel: ").append(toIndentedString(signalLevel)).append("\n");
        sb.append("    simType: ").append(toIndentedString(simType)).append("\n");
        sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    pricePlanName: ").append(toIndentedString(pricePlanName)).append("\n");
        sb.append("    simPricePlanId: ").append(toIndentedString(simPricePlanId)).append("\n");
        sb.append("    flowLeft: ").append(toIndentedString(flowLeft)).append("\n");
        sb.append("    flowUsed: ").append(toIndentedString(flowUsed)).append("\n");
        sb.append("    operatorStatus: ").append(toIndentedString(operatorStatus)).append("\n");
        sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
        sb.append("    imsi: ").append(toIndentedString(imsi)).append("\n");
        sb.append("    customerAttribute1: ").append(toIndentedString(customerAttribute1)).append("\n");
        sb.append("    customerAttribute2: ").append(toIndentedString(customerAttribute2)).append("\n");
        sb.append("    customerAttribute3: ").append(toIndentedString(customerAttribute3)).append("\n");
        sb.append("    customerAttribute4: ").append(toIndentedString(customerAttribute4)).append("\n");
        sb.append("    customerAttribute5: ").append(toIndentedString(customerAttribute5)).append("\n");
        sb.append("    customerAttribute6: ").append(toIndentedString(customerAttribute6)).append("\n");
        sb.append("    realNamed: ").append(toIndentedString(realNamed)).append("\n");
        sb.append("    cutNetFlag: ").append(toIndentedString(cutNetFlag)).append("\n");
        sb.append("    exceedCutNetFlag: ").append(toIndentedString(exceedCutNetFlag)).append("\n");
        sb.append("    exceedCutNetQuota: ").append(toIndentedString(exceedCutNetQuota)).append("\n");
        sb.append("    imeiBindRemainTimes: ").append(toIndentedString(imeiBindRemainTimes)).append("\n");
        sb.append("    speedValue: ").append(toIndentedString(speedValue)).append("\n");
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
