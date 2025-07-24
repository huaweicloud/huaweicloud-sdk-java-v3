package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowShareResponse extends SdkResponse {

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

    /**
     * SFS Turbo文件系统的计费模式。'0'代表按需付费，'1'代表包周期计费。如果文件系统正在创建，该字段不返回。
     */
    public static final class PayModelEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final PayModelEnum _0 = new PayModelEnum("0");

        /**
         * Enum _1 for value: "1"
         */
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PayModelEnum(value));
        }

        public static PayModelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_endpoint")

    private String optionalEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hpc_bw")

    private String hpcBw;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceId")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceType")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusDetail")

    private String statusDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "features")

    private ShareInfoFeatures features;

    public ShowShareResponse withActionProgress(ActionProgress actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    public ShowShareResponse withActionProgress(Consumer<ActionProgress> actionProgressSetter) {
        if (this.actionProgress == null) {
            this.actionProgress = new ActionProgress();
            actionProgressSetter.accept(this.actionProgress);
        }

        return this;
    }

    /**
     * Get actionProgress
     * @return actionProgress
     */
    public ActionProgress getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(ActionProgress actionProgress) {
        this.actionProgress = actionProgress;
    }

    public ShowShareResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * SFS Turbo文件系统的版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowShareResponse withAvailCapacity(String availCapacity) {
        this.availCapacity = availCapacity;
        return this;
    }

    /**
     * SFS Turbo文件系统剩余容量，单位GB。
     * @return availCapacity
     */
    public String getAvailCapacity() {
        return availCapacity;
    }

    public void setAvailCapacity(String availCapacity) {
        this.availCapacity = availCapacity;
    }

    public ShowShareResponse withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * SFS Turbo文件系统所在可用区编码。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ShowShareResponse withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * SFS Turbo文件系统所在可用区名称。
     * @return azName
     */
    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public ShowShareResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。UTC时间，例如：2018-11-19T04:02:03
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ShowShareResponse withCryptKeyId(String cryptKeyId) {
        this.cryptKeyId = cryptKeyId;
        return this;
    }

    /**
     * 用户指定的加密密钥ID，非加密盘时不返回。
     * @return cryptKeyId
     */
    public String getCryptKeyId() {
        return cryptKeyId;
    }

    public void setCryptKeyId(String cryptKeyId) {
        this.cryptKeyId = cryptKeyId;
    }

    public ShowShareResponse withExpandType(String expandType) {
        this.expandType = expandType;
        return this;
    }

    /**
     * 如果是增强版文件系统，该字段返回bandwidth；如果是20MB/s/TiB、40MB/s/TiB、125MB/s/TiB、250MB/s/TiB、500MB/s/TiB、1000MB/s/TiB，该字段返回hpc；否则不返回。
     * @return expandType
     */
    public String getExpandType() {
        return expandType;
    }

    public void setExpandType(String expandType) {
        this.expandType = expandType;
    }

    public ShowShareResponse withExportLocation(String exportLocation) {
        this.exportLocation = exportLocation;
        return this;
    }

    /**
     * SFS Turbo文件系统的挂载端点。例如\"192.168.0.90:/\"。如果文件系统正在创建，该字段不返回。
     * @return exportLocation
     */
    public String getExportLocation() {
        return exportLocation;
    }

    public void setExportLocation(String exportLocation) {
        this.exportLocation = exportLocation;
    }

    public ShowShareResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * SFS Turbo的文件系统ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowShareResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建时指定的SFS Turbo文件系统名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowShareResponse withPayModel(PayModelEnum payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * SFS Turbo文件系统的计费模式。'0'代表按需付费，'1'代表包周期计费。如果文件系统正在创建，该字段不返回。
     * @return payModel
     */
    public PayModelEnum getPayModel() {
        return payModel;
    }

    public void setPayModel(PayModelEnum payModel) {
        this.payModel = payModel;
    }

    public ShowShareResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * SFS Turbo文件系统所在区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowShareResponse withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 用户指定的安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ShowShareResponse withShareProto(String shareProto) {
        this.shareProto = shareProto;
        return this;
    }

    /**
     * SFS Turbo文件系统的协议类型，当前为NFS或 CIFS。
     * @return shareProto
     */
    public String getShareProto() {
        return shareProto;
    }

    public void setShareProto(String shareProto) {
        this.shareProto = shareProto;
    }

    public ShowShareResponse withShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }

    /**
     * SFS Turbo文件系统性能类型，包括“STANDARD”标准型和“PERFORMANCE”性能型。
     * @return shareType
     */
    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public ShowShareResponse withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * SFS Turbo文件系统总容量，单位GB。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ShowShareResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * SFS Turbo文件系统的状态。'100'表示创建中，'200'表示可用，'303'表示创建失败，'800'表示实例被冻结。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowShareResponse withSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }

    /**
     * SFS Turbo文件系统的子状态。当用户未对文件系统有修改类操作时，该字段不返回。 '121'表示扩容中；'132'表示修改安全组中；'137'表示添加VPC中；'138'表示删除VPC中；'150'表示配置联动后端中；'151'表示删除联动后端配置中。 '221'表示扩容成功；'232'表示修改安全组成功；'237'表示添加VPC成功；'238'表示删除VPC成功；'250'表示配置联动后端成功；'251'表示删除联动后端配置成功。 '321'表示扩容失败；'332'表示修改安全组失败；'337'表示添加VPC失败；'338'表示删除VPC失败；'350'表示配置联动后端失败；'351'表示删除联动后端配置失败。
     * @return subStatus
     */
    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public ShowShareResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 用户指定的子网的网络ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ShowShareResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 用户指定的VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowShareResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * SFS Turbo文件系统绑定的企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowShareResponse withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowShareResponse addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowShareResponse withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * tag标签的列表。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public ShowShareResponse withOptionalEndpoint(String optionalEndpoint) {
        this.optionalEndpoint = optionalEndpoint;
        return this;
    }

    /**
     * 可选的挂载IP地址。上一代文件系统规格类型不返回该字段。
     * @return optionalEndpoint
     */
    public String getOptionalEndpoint() {
        return optionalEndpoint;
    }

    public void setOptionalEndpoint(String optionalEndpoint) {
        this.optionalEndpoint = optionalEndpoint;
    }

    public ShowShareResponse withHpcBw(String hpcBw) {
        this.hpcBw = hpcBw;
        return this;
    }

    /**
     * 文件系统的带宽规格。 - \"20M\"表示20MB/s/TiB - \"40M\"表示40MB/s/TiB - \"125M\"表示125MB/s/TiB - \"250M\"表示250MB/s/TiB - \"500M\"表示500MB/s/TiB  - \"1000M\"表示1000MB/s/TiB  - \"2G\"、\"4G\"、\"8G\"、\"16G\"、\"24G\"、\"32G\"或\"48G\"表示HPC缓存型的带宽规格。 
     * @return hpcBw
     */
    public String getHpcBw() {
        return hpcBw;
    }

    public void setHpcBw(String hpcBw) {
        this.hpcBw = hpcBw;
    }

    public ShowShareResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 文件系统规格的节点id，为预留字段，不具备实际含义。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowShareResponse withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 文件系统规格的节点类型，为预留字段，不具备实际含义。
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public ShowShareResponse withStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    /**
     * 文件系统的请求ID，为预留字段，不具备实际含义。
     * @return statusDetail
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public ShowShareResponse withFeatures(ShareInfoFeatures features) {
        this.features = features;
        return this;
    }

    public ShowShareResponse withFeatures(Consumer<ShareInfoFeatures> featuresSetter) {
        if (this.features == null) {
            this.features = new ShareInfoFeatures();
            featuresSetter.accept(this.features);
        }

        return this;
    }

    /**
     * Get features
     * @return features
     */
    public ShareInfoFeatures getFeatures() {
        return features;
    }

    public void setFeatures(ShareInfoFeatures features) {
        this.features = features;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowShareResponse that = (ShowShareResponse) obj;
        return Objects.equals(this.actionProgress, that.actionProgress) && Objects.equals(this.version, that.version)
            && Objects.equals(this.availCapacity, that.availCapacity)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.azName, that.azName)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.cryptKeyId, that.cryptKeyId)
            && Objects.equals(this.expandType, that.expandType)
            && Objects.equals(this.exportLocation, that.exportLocation) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.payModel, that.payModel)
            && Objects.equals(this.region, that.region) && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.shareProto, that.shareProto) && Objects.equals(this.shareType, that.shareType)
            && Objects.equals(this.size, that.size) && Objects.equals(this.status, that.status)
            && Objects.equals(this.subStatus, that.subStatus) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.optionalEndpoint, that.optionalEndpoint)
            && Objects.equals(this.hpcBw, that.hpcBw) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.statusDetail, that.statusDetail) && Objects.equals(this.features, that.features);
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
            vpcId,
            enterpriseProjectId,
            tags,
            optionalEndpoint,
            hpcBw,
            instanceId,
            instanceType,
            statusDetail,
            features);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowShareResponse {\n");
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
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    optionalEndpoint: ").append(toIndentedString(optionalEndpoint)).append("\n");
        sb.append("    hpcBw: ").append(toIndentedString(hpcBw)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
