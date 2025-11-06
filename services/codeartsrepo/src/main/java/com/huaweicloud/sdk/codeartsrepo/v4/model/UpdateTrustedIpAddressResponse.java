package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateTrustedIpAddressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_range")

    private String ipRange;

    /**
     * **参数解释：** 格式类型。 - 0，表示指定ip。 - 1，表示ip范围。 - 2，表示CIDR。
     */
    public static final class IpTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final IpTypeEnum NUMBER_0 = new IpTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IpTypeEnum NUMBER_1 = new IpTypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final IpTypeEnum NUMBER_2 = new IpTypeEnum(2);

        private static final Map<Integer, IpTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IpTypeEnum> createStaticFields() {
            Map<Integer, IpTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IpTypeEnum(Integer value) {
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
        public static IpTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpTypeEnum(value));
        }

        public static IpTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpTypeEnum) {
                return this.value.equals(((IpTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_type")

    private IpTypeEnum ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_start")

    private String ipStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_end")

    private String ipEnd;

    /**
     * **参数解释：** 是否允许访问代码仓库。 - 0，表示禁止访问。 - 1，表示允许访问。
     */
    public static final class ViewFlagEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ViewFlagEnum NUMBER_0 = new ViewFlagEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ViewFlagEnum NUMBER_1 = new ViewFlagEnum(1);

        private static final Map<Integer, ViewFlagEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ViewFlagEnum> createStaticFields() {
            Map<Integer, ViewFlagEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ViewFlagEnum(Integer value) {
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
        public static ViewFlagEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ViewFlagEnum(value));
        }

        public static ViewFlagEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ViewFlagEnum) {
                return this.value.equals(((ViewFlagEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_flag")

    private ViewFlagEnum viewFlag;

    /**
     * **参数解释：** 是否允许下载代码。 - 0，表示禁止下载。 - 1，表示允许下载。
     */
    public static final class DownloadFlagEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final DownloadFlagEnum NUMBER_0 = new DownloadFlagEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final DownloadFlagEnum NUMBER_1 = new DownloadFlagEnum(1);

        private static final Map<Integer, DownloadFlagEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, DownloadFlagEnum> createStaticFields() {
            Map<Integer, DownloadFlagEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        DownloadFlagEnum(Integer value) {
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
        public static DownloadFlagEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DownloadFlagEnum(value));
        }

        public static DownloadFlagEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DownloadFlagEnum) {
                return this.value.equals(((DownloadFlagEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_flag")

    private DownloadFlagEnum downloadFlag;

    /**
     * **参数解释：** 是否允许提交代码。 - 0，表示禁止提交。 - 1，表示允许提交。
     */
    public static final class UploadFlagEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final UploadFlagEnum NUMBER_0 = new UploadFlagEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final UploadFlagEnum NUMBER_1 = new UploadFlagEnum(1);

        private static final Map<Integer, UploadFlagEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, UploadFlagEnum> createStaticFields() {
            Map<Integer, UploadFlagEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        UploadFlagEnum(Integer value) {
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
        public static UploadFlagEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UploadFlagEnum(value));
        }

        public static UploadFlagEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UploadFlagEnum) {
                return this.value.equals(((UploadFlagEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_flag")

    private UploadFlagEnum uploadFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    /**
     * **参数解释：** 排序。 - 0，表示默认规则。 - 1，表示自定义规则。
     */
    public static final class OrderFlagEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final OrderFlagEnum NUMBER_0 = new OrderFlagEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final OrderFlagEnum NUMBER_1 = new OrderFlagEnum(1);

        private static final Map<Integer, OrderFlagEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, OrderFlagEnum> createStaticFields() {
            Map<Integer, OrderFlagEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        OrderFlagEnum(Integer value) {
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
        public static OrderFlagEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderFlagEnum(value));
        }

        public static OrderFlagEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderFlagEnum) {
                return this.value.equals(((OrderFlagEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_flag")

    private OrderFlagEnum orderFlag;

    public UpdateTrustedIpAddressResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 白名单id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateTrustedIpAddressResponse withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库id。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public UpdateTrustedIpAddressResponse withIpRange(String ipRange) {
        this.ipRange = ipRange;
        return this;
    }

    /**
     * **参数解释：** ip范围。
     * @return ipRange
     */
    public String getIpRange() {
        return ipRange;
    }

    public void setIpRange(String ipRange) {
        this.ipRange = ipRange;
    }

    public UpdateTrustedIpAddressResponse withIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * **参数解释：** 格式类型。 - 0，表示指定ip。 - 1，表示ip范围。 - 2，表示CIDR。
     * @return ipType
     */
    public IpTypeEnum getIpType() {
        return ipType;
    }

    public void setIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
    }

    public UpdateTrustedIpAddressResponse withIpStart(String ipStart) {
        this.ipStart = ipStart;
        return this;
    }

    /**
     * **参数解释：** 起始ip。
     * @return ipStart
     */
    public String getIpStart() {
        return ipStart;
    }

    public void setIpStart(String ipStart) {
        this.ipStart = ipStart;
    }

    public UpdateTrustedIpAddressResponse withIpEnd(String ipEnd) {
        this.ipEnd = ipEnd;
        return this;
    }

    /**
     * **参数解释：** 结束ip。
     * @return ipEnd
     */
    public String getIpEnd() {
        return ipEnd;
    }

    public void setIpEnd(String ipEnd) {
        this.ipEnd = ipEnd;
    }

    public UpdateTrustedIpAddressResponse withViewFlag(ViewFlagEnum viewFlag) {
        this.viewFlag = viewFlag;
        return this;
    }

    /**
     * **参数解释：** 是否允许访问代码仓库。 - 0，表示禁止访问。 - 1，表示允许访问。
     * @return viewFlag
     */
    public ViewFlagEnum getViewFlag() {
        return viewFlag;
    }

    public void setViewFlag(ViewFlagEnum viewFlag) {
        this.viewFlag = viewFlag;
    }

    public UpdateTrustedIpAddressResponse withDownloadFlag(DownloadFlagEnum downloadFlag) {
        this.downloadFlag = downloadFlag;
        return this;
    }

    /**
     * **参数解释：** 是否允许下载代码。 - 0，表示禁止下载。 - 1，表示允许下载。
     * @return downloadFlag
     */
    public DownloadFlagEnum getDownloadFlag() {
        return downloadFlag;
    }

    public void setDownloadFlag(DownloadFlagEnum downloadFlag) {
        this.downloadFlag = downloadFlag;
    }

    public UpdateTrustedIpAddressResponse withUploadFlag(UploadFlagEnum uploadFlag) {
        this.uploadFlag = uploadFlag;
        return this;
    }

    /**
     * **参数解释：** 是否允许提交代码。 - 0，表示禁止提交。 - 1，表示允许提交。
     * @return uploadFlag
     */
    public UploadFlagEnum getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(UploadFlagEnum uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public UpdateTrustedIpAddressResponse withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * **参数解释：** 备注。 **取值范围：** 字符串长度不少于0，不超过200。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public UpdateTrustedIpAddressResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **参数解释：** MMM dd, yyyy hh:mm:ss a            
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UpdateTrustedIpAddressResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。 **参数解释：** MMM dd, yyyy hh:mm:ss a
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UpdateTrustedIpAddressResponse withOrderFlag(OrderFlagEnum orderFlag) {
        this.orderFlag = orderFlag;
        return this;
    }

    /**
     * **参数解释：** 排序。 - 0，表示默认规则。 - 1，表示自定义规则。
     * @return orderFlag
     */
    public OrderFlagEnum getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(OrderFlagEnum orderFlag) {
        this.orderFlag = orderFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTrustedIpAddressResponse that = (UpdateTrustedIpAddressResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.ipRange, that.ipRange) && Objects.equals(this.ipType, that.ipType)
            && Objects.equals(this.ipStart, that.ipStart) && Objects.equals(this.ipEnd, that.ipEnd)
            && Objects.equals(this.viewFlag, that.viewFlag) && Objects.equals(this.downloadFlag, that.downloadFlag)
            && Objects.equals(this.uploadFlag, that.uploadFlag) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.orderFlag, that.orderFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            repositoryId,
            ipRange,
            ipType,
            ipStart,
            ipEnd,
            viewFlag,
            downloadFlag,
            uploadFlag,
            remark,
            createdAt,
            updatedAt,
            orderFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrustedIpAddressResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
        sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
        sb.append("    ipStart: ").append(toIndentedString(ipStart)).append("\n");
        sb.append("    ipEnd: ").append(toIndentedString(ipEnd)).append("\n");
        sb.append("    viewFlag: ").append(toIndentedString(viewFlag)).append("\n");
        sb.append("    downloadFlag: ").append(toIndentedString(downloadFlag)).append("\n");
        sb.append("    uploadFlag: ").append(toIndentedString(uploadFlag)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    orderFlag: ").append(toIndentedString(orderFlag)).append("\n");
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
