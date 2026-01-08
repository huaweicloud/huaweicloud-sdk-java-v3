package com.huaweicloud.sdk.nat.v2.model;

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

/**
 * 创建公网NAT网关实例的请求体。
 */
public class CreateNatGatewayOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router_id")

    private String routerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_network_id")

    private String internalNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ngport_ip_address")

    private String ngportIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    /**
     * 公网NAT网关的规格。 取值为： - 1：小型，SNAT最大连接数10000 - 2：中型，SNAT最大连接数50000 - 3：大型，SNAT最大连接数200000 - 4：超大型，SNAT最大连接数1000000 - 5：企业型，SNAT最大连接数10000000 
     */
    public static final class SpecEnum {

        /**
         * Enum _1 for value: "1"
         */
        public static final SpecEnum _1 = new SpecEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final SpecEnum _2 = new SpecEnum("2");

        /**
         * Enum _3 for value: "3"
         */
        public static final SpecEnum _3 = new SpecEnum("3");

        /**
         * Enum _4 for value: "4"
         */
        public static final SpecEnum _4 = new SpecEnum("4");

        /**
         * Enum _5 for value: "5"
         */
        public static final SpecEnum _5 = new SpecEnum("5");

        private static final Map<String, SpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecEnum> createStaticFields() {
            Map<String, SpecEnum> map = new HashMap<>();
            map.put("1", _1);
            map.put("2", _2);
            map.put("3", _3);
            map.put("4", _4);
            map.put("5", _5);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecEnum(String value) {
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
        public static SpecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpecEnum(value));
        }

        public static SpecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpecEnum) {
                return this.value.equals(((SpecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private SpecEnum spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_conf")

    private SessionConfiguration sessionConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prepaid_options")

    private PrepaidOptions prepaidOptions;

    public CreateNatGatewayOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 公网NAT网关实例的名字，长度限制为64。 公网NAT网关实例的名字仅支持数字、字母、_（下划线）、-（中划线）、中文。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateNatGatewayOption withRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }

    /**
     * VPC的id。
     * @return routerId
     */
    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public CreateNatGatewayOption withInternalNetworkId(String internalNetworkId) {
        this.internalNetworkId = internalNetworkId;
        return this;
    }

    /**
     * 公网NAT网关下行口（DVR的下一跳）所属的network id。
     * @return internalNetworkId
     */
    public String getInternalNetworkId() {
        return internalNetworkId;
    }

    public void setInternalNetworkId(String internalNetworkId) {
        this.internalNetworkId = internalNetworkId;
    }

    public CreateNatGatewayOption withNgportIpAddress(String ngportIpAddress) {
        this.ngportIpAddress = ngportIpAddress;
        return this;
    }

    /**
     * 公网NAT网关ng口占用的ip。
     * @return ngportIpAddress
     */
    public String getNgportIpAddress() {
        return ngportIpAddress;
    }

    public void setNgportIpAddress(String ngportIpAddress) {
        this.ngportIpAddress = ngportIpAddress;
    }

    public CreateNatGatewayOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 公网NAT网关实例的描述，长度范围小于等于255个字符，不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateNatGatewayOption withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateNatGatewayOption addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateNatGatewayOption withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表, 用以标识资源类型
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CreateNatGatewayOption withSpec(SpecEnum spec) {
        this.spec = spec;
        return this;
    }

    /**
     * 公网NAT网关的规格。 取值为： - 1：小型，SNAT最大连接数10000 - 2：中型，SNAT最大连接数50000 - 3：大型，SNAT最大连接数200000 - 4：超大型，SNAT最大连接数1000000 - 5：企业型，SNAT最大连接数10000000 
     * @return spec
     */
    public SpecEnum getSpec() {
        return spec;
    }

    public void setSpec(SpecEnum spec) {
        this.spec = spec;
    }

    public CreateNatGatewayOption withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID 创建公网NAT网关实例时，关联的企业项目ID。 关于企业项目ID的获取及企业项目特性的详细信息，请参考《企业管理用户指南》。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateNatGatewayOption withSessionConf(SessionConfiguration sessionConf) {
        this.sessionConf = sessionConf;
        return this;
    }

    public CreateNatGatewayOption withSessionConf(Consumer<SessionConfiguration> sessionConfSetter) {
        if (this.sessionConf == null) {
            this.sessionConf = new SessionConfiguration();
            sessionConfSetter.accept(this.sessionConf);
        }

        return this;
    }

    /**
     * Get sessionConf
     * @return sessionConf
     */
    public SessionConfiguration getSessionConf() {
        return sessionConf;
    }

    public void setSessionConf(SessionConfiguration sessionConf) {
        this.sessionConf = sessionConf;
    }

    public CreateNatGatewayOption withPrepaidOptions(PrepaidOptions prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
        return this;
    }

    public CreateNatGatewayOption withPrepaidOptions(Consumer<PrepaidOptions> prepaidOptionsSetter) {
        if (this.prepaidOptions == null) {
            this.prepaidOptions = new PrepaidOptions();
            prepaidOptionsSetter.accept(this.prepaidOptions);
        }

        return this;
    }

    /**
     * Get prepaidOptions
     * @return prepaidOptions
     */
    public PrepaidOptions getPrepaidOptions() {
        return prepaidOptions;
    }

    public void setPrepaidOptions(PrepaidOptions prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNatGatewayOption that = (CreateNatGatewayOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.routerId, that.routerId)
            && Objects.equals(this.internalNetworkId, that.internalNetworkId)
            && Objects.equals(this.ngportIpAddress, that.ngportIpAddress)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.sessionConf, that.sessionConf)
            && Objects.equals(this.prepaidOptions, that.prepaidOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            routerId,
            internalNetworkId,
            ngportIpAddress,
            description,
            tags,
            spec,
            enterpriseProjectId,
            sessionConf,
            prepaidOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNatGatewayOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    routerId: ").append(toIndentedString(routerId)).append("\n");
        sb.append("    internalNetworkId: ").append(toIndentedString(internalNetworkId)).append("\n");
        sb.append("    ngportIpAddress: ").append(toIndentedString(ngportIpAddress)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    sessionConf: ").append(toIndentedString(sessionConf)).append("\n");
        sb.append("    prepaidOptions: ").append(toIndentedString(prepaidOptions)).append("\n");
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
