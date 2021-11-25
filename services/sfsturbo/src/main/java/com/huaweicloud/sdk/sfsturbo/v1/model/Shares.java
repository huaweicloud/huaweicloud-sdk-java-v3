package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Shares */
public class Shares {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_progress")

    private ActionProgress actionProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avail_capacity")

    private String availCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_name")

    private String azName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crypt_key_id")

    private String cryptKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_type")

    private String expandType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_location")

    private String exportLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** SFS Turbo文件系统的计费模式。“0”代表按需付费，“1”代表包周期计费。 */
    public static final class PayModelEnum {

        /** Enum _0 for value: "0" */
        public static final PayModelEnum _0 = new PayModelEnum("0");

        /** Enum _1 for value: "1" */
        public static final PayModelEnum _1 = new PayModelEnum("1");

        private static final Map<String, PayModelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PayModelEnum> createStaticFields() {
            Map<String, PayModelEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PayModelEnum(String value) {
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
        public static PayModelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PayModelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PayModelEnum(value);
            }
            return result;
        }

        public static PayModelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PayModelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PayModelEnum) {
                return this.value.equals(((PayModelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_model")

    private PayModelEnum payModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_proto")

    private String shareProto;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_type")

    private String shareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_status")

    private String subStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    public Shares withActionProgress(ActionProgress actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    public Shares withActionProgress(Consumer<ActionProgress> actionProgressSetter) {
        if (this.actionProgress == null) {
            this.actionProgress = new ActionProgress();
            actionProgressSetter.accept(this.actionProgress);
        }

        return this;
    }

    /** Get actionProgress
     * 
     * @return actionProgress */
    public ActionProgress getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(ActionProgress actionProgress) {
        this.actionProgress = actionProgress;
    }

    public Shares withVersion(String version) {
        this.version = version;
        return this;
    }

    /** SFS Turbo文件系统的版本号。
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Shares withAvailCapacity(String availCapacity) {
        this.availCapacity = availCapacity;
        return this;
    }

    /** SFS Turbo文件系统可用容量，单位GB。
     * 
     * @return availCapacity */
    public String getAvailCapacity() {
        return availCapacity;
    }

    public void setAvailCapacity(String availCapacity) {
        this.availCapacity = availCapacity;
    }

    public Shares withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /** SFS Turbo文件系统所在可用区编码。
     * 
     * @return availabilityZone */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Shares withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /** SFS Turbo文件系统所在可用区名称。
     * 
     * @return azName */
    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public Shares withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 创建时间。UTC时间，例如：2018-11-19T04:02:03
     * 
     * @return createdAt */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Shares withCryptKeyId(String cryptKeyId) {
        this.cryptKeyId = cryptKeyId;
        return this;
    }

    /** 用户指定的加密密钥ID，非加密盘时不返回。
     * 
     * @return cryptKeyId */
    public String getCryptKeyId() {
        return cryptKeyId;
    }

    public void setCryptKeyId(String cryptKeyId) {
        this.cryptKeyId = cryptKeyId;
    }

    public Shares withExpandType(String expandType) {
        this.expandType = expandType;
        return this;
    }

    /** 如果是增强型文件系统，该字段返回bandwidth，否则不返回。
     * 
     * @return expandType */
    public String getExpandType() {
        return expandType;
    }

    public void setExpandType(String expandType) {
        this.expandType = expandType;
    }

    public Shares withExportLocation(String exportLocation) {
        this.exportLocation = exportLocation;
        return this;
    }

    /** SFS Turbo文件系统的挂载端点。
     * 
     * @return exportLocation */
    public String getExportLocation() {
        return exportLocation;
    }

    public void setExportLocation(String exportLocation) {
        this.exportLocation = exportLocation;
    }

    public Shares withId(String id) {
        this.id = id;
        return this;
    }

    /** SFS Turbo的文件系统ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Shares withName(String name) {
        this.name = name;
        return this;
    }

    /** 创建时指定的SFS Turbo文件系统名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shares withPayModel(PayModelEnum payModel) {
        this.payModel = payModel;
        return this;
    }

    /** SFS Turbo文件系统的计费模式。“0”代表按需付费，“1”代表包周期计费。
     * 
     * @return payModel */
    public PayModelEnum getPayModel() {
        return payModel;
    }

    public void setPayModel(PayModelEnum payModel) {
        this.payModel = payModel;
    }

    public Shares withRegion(String region) {
        this.region = region;
        return this;
    }

    /** SFS Turbo文件系统所在区域。
     * 
     * @return region */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Shares withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /** 用户指定的安全组ID。
     * 
     * @return securityGroupId */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public Shares withShareProto(String shareProto) {
        this.shareProto = shareProto;
        return this;
    }

    /** SFS Turbo文件系统的协议类型，当前为NFS
     * 
     * @return shareProto */
    public String getShareProto() {
        return shareProto;
    }

    public void setShareProto(String shareProto) {
        this.shareProto = shareProto;
    }

    public Shares withShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }

    /** SFS Turbo文件系统性能类型，包括“STANDARD”标准型和“PERFORMANCE”性能型。
     * 
     * @return shareType */
    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public Shares withSize(String size) {
        this.size = size;
        return this;
    }

    /** SFS Turbo文件系统总容量，单位GB。
     * 
     * @return size */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Shares withStatus(String status) {
        this.status = status;
        return this;
    }

    /** SFS Turbo文件系统的状态
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Shares withSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }

    /** SFS Turbo文件系统的子状态
     * 
     * @return subStatus */
    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public Shares withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /** 用户指定的子网的网络ID。
     * 
     * @return subnetId */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public Shares withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** 用户指定的VPC ID。
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shares shares = (Shares) o;
        return Objects.equals(this.actionProgress, shares.actionProgress)
            && Objects.equals(this.version, shares.version) && Objects.equals(this.availCapacity, shares.availCapacity)
            && Objects.equals(this.availabilityZone, shares.availabilityZone)
            && Objects.equals(this.azName, shares.azName) && Objects.equals(this.createdAt, shares.createdAt)
            && Objects.equals(this.cryptKeyId, shares.cryptKeyId) && Objects.equals(this.expandType, shares.expandType)
            && Objects.equals(this.exportLocation, shares.exportLocation) && Objects.equals(this.id, shares.id)
            && Objects.equals(this.name, shares.name) && Objects.equals(this.payModel, shares.payModel)
            && Objects.equals(this.region, shares.region)
            && Objects.equals(this.securityGroupId, shares.securityGroupId)
            && Objects.equals(this.shareProto, shares.shareProto) && Objects.equals(this.shareType, shares.shareType)
            && Objects.equals(this.size, shares.size) && Objects.equals(this.status, shares.status)
            && Objects.equals(this.subStatus, shares.subStatus) && Objects.equals(this.subnetId, shares.subnetId)
            && Objects.equals(this.vpcId, shares.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionProgress,
            version,
            availCapacity,
            availabilityZone,
            azName,
            createdAt,
            cryptKeyId,
            expandType,
            exportLocation,
            id,
            name,
            payModel,
            region,
            securityGroupId,
            shareProto,
            shareType,
            size,
            status,
            subStatus,
            subnetId,
            vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Shares {\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    availCapacity: ").append(toIndentedString(availCapacity)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    azName: ").append(toIndentedString(azName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    cryptKeyId: ").append(toIndentedString(cryptKeyId)).append("\n");
        sb.append("    expandType: ").append(toIndentedString(expandType)).append("\n");
        sb.append("    exportLocation: ").append(toIndentedString(exportLocation)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    payModel: ").append(toIndentedString(payModel)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    shareProto: ").append(toIndentedString(shareProto)).append("\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
