package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 带宽对象 */
public class BatchBandwidthResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_type")

    private String bandwidthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    /** 功能说明：按流量计费,按带宽计费还是按增强型95计费。 取值范围：bandwidth，traffic，95peak_plus(按增强型95计费)不返回或者为空时表示是bandwidth。
     * 约束：只有共享带宽支持95peak_plus（按增强型95计费），按增强型95计费时需要指定保底百分比，默认是20%。 */
    public static final class ChargeModeEnum {

        /** Enum BANDWIDTH for value: "bandwidth" */
        public static final ChargeModeEnum BANDWIDTH = new ChargeModeEnum("bandwidth");

        /** Enum TRAFFIC for value: "traffic" */
        public static final ChargeModeEnum TRAFFIC = new ChargeModeEnum("traffic");

        /** Enum _95PEAK_PLUS for value: "95peak_plus" */
        public static final ChargeModeEnum _95PEAK_PLUS = new ChargeModeEnum("95peak_plus");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("bandwidth", BANDWIDTH);
            map.put("traffic", TRAFFIC);
            map.put("95peak_plus", _95PEAK_PLUS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargeModeEnum(String value) {
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
        public static ChargeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargeModeEnum(value);
            }
            return result;
        }

        public static ChargeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargeModeEnum) {
                return this.value.equals(((ChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private ChargeModeEnum chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_info")

    private List<PublicipInfoResp> publicipInfo = null;

    /** 功能说明：带宽类型，标识是否是共享带宽 取值范围：WHOLE，PER WHOLE表示共享带宽；PER，表示独享带宽 */
    public static final class ShareTypeEnum {

        /** Enum WHOLE for value: "WHOLE" */
        public static final ShareTypeEnum WHOLE = new ShareTypeEnum("WHOLE");

        /** Enum PER for value: "PER" */
        public static final ShareTypeEnum PER = new ShareTypeEnum("PER");

        private static final Map<String, ShareTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ShareTypeEnum> createStaticFields() {
            Map<String, ShareTypeEnum> map = new HashMap<>();
            map.put("WHOLE", WHOLE);
            map.put("PER", PER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ShareTypeEnum(String value) {
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
        public static ShareTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ShareTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ShareTypeEnum(value);
            }
            return result;
        }

        public static ShareTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ShareTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ShareTypeEnum) {
                return this.value.equals(((ShareTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_type")

    private ShareTypeEnum shareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    /** 功能说明：带宽的状态 取值范围： FREEZED：冻结 NORMAL：正常 */
    public static final class StatusEnum {

        /** Enum FREEZED for value: "FREEZED" */
        public static final StatusEnum FREEZED = new StatusEnum("FREEZED");

        /** Enum NORMAL for value: "NORMAL" */
        public static final StatusEnum NORMAL = new StatusEnum("NORMAL");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("FREEZED", FREEZED);
            map.put("NORMAL", NORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    public BatchBandwidthResp withBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }

    /** 功能说明：带宽类型，共享带宽默认为share。 取值范围：share，bgp，telcom，sbgp等。 share：共享带宽 bgp：动态bgp telcom ：联通 sbgp：静态bgp
     * 
     * @return bandwidthType */
    public String getBandwidthType() {
        return bandwidthType;
    }

    public void setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    public BatchBandwidthResp withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /** 功能说明：账单信息 如果billing_info不为空，说明是包周期的带宽
     * 
     * @return billingInfo */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public BatchBandwidthResp withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /** 功能说明：按流量计费,按带宽计费还是按增强型95计费。 取值范围：bandwidth，traffic，95peak_plus(按增强型95计费)不返回或者为空时表示是bandwidth。
     * 约束：只有共享带宽支持95peak_plus（按增强型95计费），按增强型95计费时需要指定保底百分比，默认是20%。
     * 
     * @return chargeMode */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public BatchBandwidthResp withId(String id) {
        this.id = id;
        return this;
    }

    /** 功能说明：带宽唯一标识
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchBandwidthResp withName(String name) {
        this.name = name;
        return this;
    }

    /** 功能说明：带宽名称 取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchBandwidthResp withPublicipInfo(List<PublicipInfoResp> publicipInfo) {
        this.publicipInfo = publicipInfo;
        return this;
    }

    public BatchBandwidthResp addPublicipInfoItem(PublicipInfoResp publicipInfoItem) {
        if (this.publicipInfo == null) {
            this.publicipInfo = new ArrayList<>();
        }
        this.publicipInfo.add(publicipInfoItem);
        return this;
    }

    public BatchBandwidthResp withPublicipInfo(Consumer<List<PublicipInfoResp>> publicipInfoSetter) {
        if (this.publicipInfo == null) {
            this.publicipInfo = new ArrayList<>();
        }
        publicipInfoSetter.accept(this.publicipInfo);
        return this;
    }

    /** 功能说明：带宽对应的弹性公网IP信息 约束：WHOLE类型的带宽支持多个弹性公网IP，PER类型的带宽只能对应一个弹性公网IP
     * 
     * @return publicipInfo */
    public List<PublicipInfoResp> getPublicipInfo() {
        return publicipInfo;
    }

    public void setPublicipInfo(List<PublicipInfoResp> publicipInfo) {
        this.publicipInfo = publicipInfo;
    }

    public BatchBandwidthResp withShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
        return this;
    }

    /** 功能说明：带宽类型，标识是否是共享带宽 取值范围：WHOLE，PER WHOLE表示共享带宽；PER，表示独享带宽
     * 
     * @return shareType */
    public ShareTypeEnum getShareType() {
        return shareType;
    }

    public void setShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
    }

    public BatchBandwidthResp withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 功能说明：带宽大小 取值范围：默认5Mbit/s~2000Mbit/s（具体范围以各区域配置为准，请参见控制台对应页面显示）。
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public BatchBandwidthResp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /** 功能说明：用户所属租户ID
     * 
     * @return tenantId */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public BatchBandwidthResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 功能说明：带宽的状态 取值范围： FREEZED：冻结 NORMAL：正常
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public BatchBandwidthResp withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /** 功能说明：表示中心站点资源或者边缘站点资源，对接了边缘站点的区域会返回此字段 取值范围： center、边缘站点名称 上线区域：华北-乌兰察布一，华南-广州 约束：共享带宽只能插入与该字段相同的publicip
     * 
     * @return publicBorderGroup */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchBandwidthResp batchBandwidthResp = (BatchBandwidthResp) o;
        return Objects.equals(this.bandwidthType, batchBandwidthResp.bandwidthType)
            && Objects.equals(this.billingInfo, batchBandwidthResp.billingInfo)
            && Objects.equals(this.chargeMode, batchBandwidthResp.chargeMode)
            && Objects.equals(this.id, batchBandwidthResp.id) && Objects.equals(this.name, batchBandwidthResp.name)
            && Objects.equals(this.publicipInfo, batchBandwidthResp.publicipInfo)
            && Objects.equals(this.shareType, batchBandwidthResp.shareType)
            && Objects.equals(this.size, batchBandwidthResp.size)
            && Objects.equals(this.tenantId, batchBandwidthResp.tenantId)
            && Objects.equals(this.status, batchBandwidthResp.status)
            && Objects.equals(this.publicBorderGroup, batchBandwidthResp.publicBorderGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthType,
            billingInfo,
            chargeMode,
            id,
            name,
            publicipInfo,
            shareType,
            size,
            tenantId,
            status,
            publicBorderGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchBandwidthResp {\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    publicipInfo: ").append(toIndentedString(publicipInfo)).append("\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
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
