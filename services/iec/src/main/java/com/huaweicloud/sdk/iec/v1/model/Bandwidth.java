package com.huaweicloud.sdk.iec.v1.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.Operator;
import com.huaweicloud.sdk.iec.v1.model.PublicipInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 带宽对象
 */
public class Bandwidth  {

    /**
     * 带宽类型。 取值范围： share：共享类型
     */
    public static final class BandwidthTypeEnum {

        
        /**
         * Enum SHARE for value: "share"
         */
        public static final BandwidthTypeEnum SHARE = new BandwidthTypeEnum("share");
        

        private static final Map<String, BandwidthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BandwidthTypeEnum> createStaticFields() {
            Map<String, BandwidthTypeEnum> map = new HashMap<>();
            map.put("share", SHARE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BandwidthTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BandwidthTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            BandwidthTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BandwidthTypeEnum(value);
            }
            return result;
        }

        public static BandwidthTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            BandwidthTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof BandwidthTypeEnum) {
                return this.value.equals(((BandwidthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth_type")
    
    private BandwidthTypeEnum bandwidthType;
    /**
     * 计费模式，当前只支持峰值95计费。  取值范围：  - 95peak_plus：峰值95计费
     */
    public static final class ChargeModeEnum {

        
        /**
         * Enum _95PEAK_PLUS for value: "95peak_plus"
         */
        public static final ChargeModeEnum _95PEAK_PLUS = new ChargeModeEnum("95peak_plus");
        

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("95peak_plus", _95PEAK_PLUS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargeModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargeModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargeModeEnum(value);
            }
            return result;
        }

        public static ChargeModeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof ChargeModeEnum) {
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
    @JsonProperty(value="charge_mode")
    
    private ChargeModeEnum chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operator")
    
    private Operator operator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip_info")
    
    private List<PublicipInfo> publicipInfo = null;
        /**
     * 共享带宽类型，标识是否是共享带宽。  取值范围：  - WHOLE：共享带宽
     */
    public static final class ShareTypeEnum {

        
        /**
         * Enum WHOLE for value: "WHOLE"
         */
        public static final ShareTypeEnum WHOLE = new ShareTypeEnum("WHOLE");
        

        private static final Map<String, ShareTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ShareTypeEnum> createStaticFields() {
            Map<String, ShareTypeEnum> map = new HashMap<>();
            map.put("WHOLE", WHOLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ShareTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ShareTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ShareTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ShareTypeEnum(value);
            }
            return result;
        }

        public static ShareTypeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof ShareTypeEnum) {
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
    @JsonProperty(value="share_type")
    
    private ShareTypeEnum shareType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="site_id")
    
    private String siteId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="site_info")
    
    private String siteInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;
    /**
     * 带宽的状态。  取值范围：  - FREEZED：冻结  - NORMAL：正常
     */
    public static final class StatusEnum {

        
        /**
         * Enum FREEZED for value: "FREEZED"
         */
        public static final StatusEnum FREEZED = new StatusEnum("FREEZED");
        
        /**
         * Enum NORMAL for value: "NORMAL"
         */
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof StatusEnum) {
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
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private String updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pool_id")
    
    private String poolId;

    public Bandwidth withBandwidthType(BandwidthTypeEnum bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }

    


    /**
     * 带宽类型。 取值范围： share：共享类型
     * @return bandwidthType
     */
    public BandwidthTypeEnum getBandwidthType() {
        return bandwidthType;
    }

    public void setBandwidthType(BandwidthTypeEnum bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    

    public Bandwidth withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * 计费模式，当前只支持峰值95计费。  取值范围：  - 95peak_plus：峰值95计费
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    

    public Bandwidth withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public Bandwidth withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 带宽ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Bandwidth withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 带宽名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Bandwidth withOperator(Operator operator) {
        this.operator = operator;
        return this;
    }

    public Bandwidth withOperator(Consumer<Operator> operatorSetter) {
        if(this.operator == null ){
            this.operator = new Operator();
            operatorSetter.accept(this.operator);
        }
        
        return this;
    }


    /**
     * Get operator
     * @return operator
     */
    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    

    public Bandwidth withPublicipInfo(List<PublicipInfo> publicipInfo) {
        this.publicipInfo = publicipInfo;
        return this;
    }

    
    public Bandwidth addPublicipInfoItem(PublicipInfo publicipInfoItem) {
        if(this.publicipInfo == null) {
            this.publicipInfo = new ArrayList<>();
        }
        this.publicipInfo.add(publicipInfoItem);
        return this;
    }

    public Bandwidth withPublicipInfo(Consumer<List<PublicipInfo>> publicipInfoSetter) {
        if(this.publicipInfo == null) {
            this.publicipInfo = new ArrayList<>();
        }
        publicipInfoSetter.accept(this.publicipInfo);
        return this;
    }

    /**
     * 弹性公网IP信息。
     * @return publicipInfo
     */
    public List<PublicipInfo> getPublicipInfo() {
        return publicipInfo;
    }

    public void setPublicipInfo(List<PublicipInfo> publicipInfo) {
        this.publicipInfo = publicipInfo;
    }

    

    public Bandwidth withShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
        return this;
    }

    


    /**
     * 共享带宽类型，标识是否是共享带宽。  取值范围：  - WHOLE：共享带宽
     * @return shareType
     */
    public ShareTypeEnum getShareType() {
        return shareType;
    }

    public void setShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
    }

    

    public Bandwidth withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    


    /**
     * 边缘站点ID。
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    

    public Bandwidth withSiteInfo(String siteInfo) {
        this.siteInfo = siteInfo;
        return this;
    }

    


    /**
     * 站点信息。
     * @return siteInfo
     */
    public String getSiteInfo() {
        return siteInfo;
    }

    public void setSiteInfo(String siteInfo) {
        this.siteInfo = siteInfo;
    }

    

    public Bandwidth withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 带宽大小。
     * minimum: 300
     * maximum: 2000
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public Bandwidth withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 带宽的状态。  取值范围：  - FREEZED：冻结  - NORMAL：正常
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public Bandwidth withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 更新时间。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    public Bandwidth withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    


    /**
     * 线路ID。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bandwidth bandwidth = (Bandwidth) o;
        return Objects.equals(this.bandwidthType, bandwidth.bandwidthType) &&
            Objects.equals(this.chargeMode, bandwidth.chargeMode) &&
            Objects.equals(this.createTime, bandwidth.createTime) &&
            Objects.equals(this.id, bandwidth.id) &&
            Objects.equals(this.name, bandwidth.name) &&
            Objects.equals(this.operator, bandwidth.operator) &&
            Objects.equals(this.publicipInfo, bandwidth.publicipInfo) &&
            Objects.equals(this.shareType, bandwidth.shareType) &&
            Objects.equals(this.siteId, bandwidth.siteId) &&
            Objects.equals(this.siteInfo, bandwidth.siteInfo) &&
            Objects.equals(this.size, bandwidth.size) &&
            Objects.equals(this.status, bandwidth.status) &&
            Objects.equals(this.updateTime, bandwidth.updateTime) &&
            Objects.equals(this.poolId, bandwidth.poolId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidthType, chargeMode, createTime, id, name, operator, publicipInfo, shareType, siteId, siteInfo, size, status, updateTime, poolId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bandwidth {\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    publicipInfo: ").append(toIndentedString(publicipInfo)).append("\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    siteInfo: ").append(toIndentedString(siteInfo)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
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

