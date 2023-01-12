package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListEipResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_word")

    private String keyWord;

    /**
     * 防护状态 null-全部 0-开启防护 1-关闭防护
     */
    public static final class StatusEnum {

        /**
         * Enum NULL for value: "null"
         */
        public static final StatusEnum NULL = new StatusEnum("null");

        /**
         * Enum _0 for value: "0"
         */
        public static final StatusEnum _0 = new StatusEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final StatusEnum _1 = new StatusEnum("1");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("null", NULL);
            map.put("0", _0);
            map.put("1", _1);
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

    /**
     * 是否同步租户EIP数据 0-不同步 1-同步
     */
    public static final class SyncEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final SyncEnum NUMBER_0 = new SyncEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final SyncEnum NUMBER_1 = new SyncEnum(1);

        private static final Map<Integer, SyncEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, SyncEnum> createStaticFields() {
            Map<Integer, SyncEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        SyncEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SyncEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            SyncEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SyncEnum(value);
            }
            return result;
        }

        public static SyncEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            SyncEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SyncEnum) {
                return this.value.equals(((SyncEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync")

    private SyncEnum sync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_key")

    private String deviceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private Integer addressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_key_word")

    private String fwKeyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    public ListEipResourcesRequest withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用查询防火墙实例接口获得，注意type为0的为互联网边界防护对象id，type为1的为VPC边界防护对象id。具体可参考APIExlorer和帮助中心FAQ。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public ListEipResourcesRequest withKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    /**
     * 弹性公网ID/弹性公网IP
     * @return keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public ListEipResourcesRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 防护状态 null-全部 0-开启防护 1-关闭防护
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListEipResourcesRequest withSync(SyncEnum sync) {
        this.sync = sync;
        return this;
    }

    /**
     * 是否同步租户EIP数据 0-不同步 1-同步
     * @return sync
     */
    public SyncEnum getSync() {
        return sync;
    }

    public void setSync(SyncEnum sync) {
        this.sync = sync;
    }

    public ListEipResourcesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数
     * minimum: 0
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEipResourcesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListEipResourcesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id，用户支持企业项目后，由企业项目生成的id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListEipResourcesRequest withDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
        return this;
    }

    /**
     * 设备键
     * @return deviceKey
     */
    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    public ListEipResourcesRequest withAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * 地址类型0 ipv4,1 ipv6
     * @return addressType
     */
    public Integer getAddressType() {
        return addressType;
    }

    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    public ListEipResourcesRequest withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙实例id，创建云防火墙后用于标志防火墙由系统自动生成的标志id，可通过调用查询防火墙实例接口获得。具体可参考APIExlorer和帮助中心FAQ。默认情况下，fw_instance_Id为空时，返回帐号下第一个墙的信息；fw_instance_Id非空时，返回与fw_instance_Id对应墙的信息。
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public ListEipResourcesRequest withFwKeyWord(String fwKeyWord) {
        this.fwKeyWord = fwKeyWord;
        return this;
    }

    /**
     * 所绑定防火墙id防火墙名称
     * @return fwKeyWord
     */
    public String getFwKeyWord() {
        return fwKeyWord;
    }

    public void setFwKeyWord(String fwKeyWord) {
        this.fwKeyWord = fwKeyWord;
    }

    public ListEipResourcesRequest withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 弹性公网ip的企业项目id
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEipResourcesRequest listEipResourcesRequest = (ListEipResourcesRequest) o;
        return Objects.equals(this.objectId, listEipResourcesRequest.objectId)
            && Objects.equals(this.keyWord, listEipResourcesRequest.keyWord)
            && Objects.equals(this.status, listEipResourcesRequest.status)
            && Objects.equals(this.sync, listEipResourcesRequest.sync)
            && Objects.equals(this.limit, listEipResourcesRequest.limit)
            && Objects.equals(this.offset, listEipResourcesRequest.offset)
            && Objects.equals(this.enterpriseProjectId, listEipResourcesRequest.enterpriseProjectId)
            && Objects.equals(this.deviceKey, listEipResourcesRequest.deviceKey)
            && Objects.equals(this.addressType, listEipResourcesRequest.addressType)
            && Objects.equals(this.fwInstanceId, listEipResourcesRequest.fwInstanceId)
            && Objects.equals(this.fwKeyWord, listEipResourcesRequest.fwKeyWord)
            && Objects.equals(this.epsId, listEipResourcesRequest.epsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId,
            keyWord,
            status,
            sync,
            limit,
            offset,
            enterpriseProjectId,
            deviceKey,
            addressType,
            fwInstanceId,
            fwKeyWord,
            epsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEipResourcesRequest {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    deviceKey: ").append(toIndentedString(deviceKey)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    fwKeyWord: ").append(toIndentedString(fwKeyWord)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
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
