package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApiGroupCommonInfo
 */
public class ApiGroupCommonInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    /**
     * 状态   - 1： 有效
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
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
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
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

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sl_domain")

    @JacksonXmlProperty(localName = "sl_domain")

    private String slDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_time")

    @JacksonXmlProperty(localName = "register_time")

    private OffsetDateTime registerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_sell_status")

    @JacksonXmlProperty(localName = "on_sell_status")

    private Integer onSellStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_domains")

    @JacksonXmlProperty(localName = "url_domains")

    private List<UrlDomain> urlDomains = null;

    public ApiGroupCommonInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApiGroupCommonInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * API分组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiGroupCommonInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态   - 1： 有效
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ApiGroupCommonInfo withSlDomain(String slDomain) {
        this.slDomain = slDomain;
        return this;
    }

    /**
     * 系统默认分配的子域名
     * @return slDomain
     */
    public String getSlDomain() {
        return slDomain;
    }

    public void setSlDomain(String slDomain) {
        this.slDomain = slDomain;
    }

    public ApiGroupCommonInfo withRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    /**
     * 创建时间
     * @return registerTime
     */
    public OffsetDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
    }

    public ApiGroupCommonInfo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 最近修改时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ApiGroupCommonInfo withOnSellStatus(Integer onSellStatus) {
        this.onSellStatus = onSellStatus;
        return this;
    }

    /**
     * 是否已上架云市场： - 1：已上架 - 2：未上架 - 3：审核中
     * @return onSellStatus
     */
    public Integer getOnSellStatus() {
        return onSellStatus;
    }

    public void setOnSellStatus(Integer onSellStatus) {
        this.onSellStatus = onSellStatus;
    }

    public ApiGroupCommonInfo withUrlDomains(List<UrlDomain> urlDomains) {
        this.urlDomains = urlDomains;
        return this;
    }

    public ApiGroupCommonInfo addUrlDomainsItem(UrlDomain urlDomainsItem) {
        if (this.urlDomains == null) {
            this.urlDomains = new ArrayList<>();
        }
        this.urlDomains.add(urlDomainsItem);
        return this;
    }

    public ApiGroupCommonInfo withUrlDomains(Consumer<List<UrlDomain>> urlDomainsSetter) {
        if (this.urlDomains == null) {
            this.urlDomains = new ArrayList<>();
        }
        urlDomainsSetter.accept(this.urlDomains);
        return this;
    }

    /**
     * 分组上绑定的独立域名列表
     * @return urlDomains
     */
    public List<UrlDomain> getUrlDomains() {
        return urlDomains;
    }

    public void setUrlDomains(List<UrlDomain> urlDomains) {
        this.urlDomains = urlDomains;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiGroupCommonInfo apiGroupCommonInfo = (ApiGroupCommonInfo) o;
        return Objects.equals(this.id, apiGroupCommonInfo.id) && Objects.equals(this.name, apiGroupCommonInfo.name)
            && Objects.equals(this.status, apiGroupCommonInfo.status)
            && Objects.equals(this.slDomain, apiGroupCommonInfo.slDomain)
            && Objects.equals(this.registerTime, apiGroupCommonInfo.registerTime)
            && Objects.equals(this.updateTime, apiGroupCommonInfo.updateTime)
            && Objects.equals(this.onSellStatus, apiGroupCommonInfo.onSellStatus)
            && Objects.equals(this.urlDomains, apiGroupCommonInfo.urlDomains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, slDomain, registerTime, updateTime, onSellStatus, urlDomains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiGroupCommonInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    slDomain: ").append(toIndentedString(slDomain)).append("\n");
        sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    onSellStatus: ").append(toIndentedString(onSellStatus)).append("\n");
        sb.append("    urlDomains: ").append(toIndentedString(urlDomains)).append("\n");
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
