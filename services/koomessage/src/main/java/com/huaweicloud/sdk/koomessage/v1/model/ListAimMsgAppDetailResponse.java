package com.huaweicloud.sdk.koomessage.v1.model;

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
public class ListAimMsgAppDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    /**
     * 状态。
     */
    public static final class StatusEnum {

        /**
         * Enum CREATED_ for value: "CREATED：待上线。应用暂未创建成功，请稍候"
         */
        public static final StatusEnum CREATED_ = new StatusEnum("CREATED：待上线。应用暂未创建成功，请稍候");

        /**
         * Enum SUSPENDED_ for value: "SUSPENDED：暂停。无法发起业务请求。当客户所发短信内容触发业务违规，或客户申请退订短信业务时，运营经理会将客户短信应用暂停"
         */
        public static final StatusEnum SUSPENDED_ =
            new StatusEnum("SUSPENDED：暂停。无法发起业务请求。当客户所发短信内容触发业务违规，或客户申请退订短信业务时，运营经理会将客户短信应用暂停");

        /**
         * Enum LAUNCHED_ for value: "LAUNCHED：正常。应用添加成功，可以正常使用"
         */
        public static final StatusEnum LAUNCHED_ = new StatusEnum("LAUNCHED：正常。应用添加成功，可以正常使用");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATED：待上线。应用暂未创建成功，请稍候", CREATED_);
            map.put("SUSPENDED：暂停。无法发起业务请求。当客户所发短信内容触发业务违规，或客户申请退订短信业务时，运营经理会将客户短信应用暂停", SUSPENDED_);
            map.put("LAUNCHED：正常。应用添加成功，可以正常使用", LAUNCHED_);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "up_link_addr")

    private String upLinkAddr;

    public ListAimMsgAppDetailResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID，用于获取、修改应用的唯一标识。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ListAimMsgAppDetailResponse withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ListAimMsgAppDetailResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListAimMsgAppDetailResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 地域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListAimMsgAppDetailResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式：yyyy-MM-dd'T'HH:mm:ss。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ListAimMsgAppDetailResponse withUpLinkAddr(String upLinkAddr) {
        this.upLinkAddr = upLinkAddr;
        return this;
    }

    /**
     * 上行短信地址。
     * @return upLinkAddr
     */
    public String getUpLinkAddr() {
        return upLinkAddr;
    }

    public void setUpLinkAddr(String upLinkAddr) {
        this.upLinkAddr = upLinkAddr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAimMsgAppDetailResponse that = (ListAimMsgAppDetailResponse) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.region, that.region)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.upLinkAddr, that.upLinkAddr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, appName, status, region, createTime, upLinkAddr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimMsgAppDetailResponse {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    upLinkAddr: ").append(toIndentedString(upLinkAddr)).append("\n");
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
