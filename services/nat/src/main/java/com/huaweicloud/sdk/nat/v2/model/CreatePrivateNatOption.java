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
 * 创建私网NAT网关实例的请求体。
 */
public class CreatePrivateNatOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 私网NAT网关实例的规格。 取值为： \"Small\"：小型 \"Medium\"：中型 \"Large\"：大型 \"Extra-large\"：超大型
     */
    public static final class SpecEnum {

        /**
         * Enum SMALL for value: "Small"
         */
        public static final SpecEnum SMALL = new SpecEnum("Small");

        /**
         * Enum MEDIUM for value: "Medium"
         */
        public static final SpecEnum MEDIUM = new SpecEnum("Medium");

        /**
         * Enum LARGE for value: "Large"
         */
        public static final SpecEnum LARGE = new SpecEnum("Large");

        /**
         * Enum EXTRA_LARGE for value: "Extra-large"
         */
        public static final SpecEnum EXTRA_LARGE = new SpecEnum("Extra-large");

        private static final Map<String, SpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecEnum> createStaticFields() {
            Map<String, SpecEnum> map = new HashMap<>();
            map.put("Small", SMALL);
            map.put("Medium", MEDIUM);
            map.put("Large", LARGE);
            map.put("Extra-large", EXTRA_LARGE);
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
    @JsonProperty(value = "downlink_vpcs")

    private List<DownlinkVpcOption> downlinkVpcs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<PrivateTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public CreatePrivateNatOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 私网NAT网关实例的名字。 私网NAT网关实例的名字仅支持数字、字母、_（下划线）、-（中划线）、中文。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePrivateNatOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 私网NAT网关实例的描述。长度范围小于等于255个字符，不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreatePrivateNatOption withSpec(SpecEnum spec) {
        this.spec = spec;
        return this;
    }

    /**
     * 私网NAT网关实例的规格。 取值为： \"Small\"：小型 \"Medium\"：中型 \"Large\"：大型 \"Extra-large\"：超大型
     * @return spec
     */
    public SpecEnum getSpec() {
        return spec;
    }

    public void setSpec(SpecEnum spec) {
        this.spec = spec;
    }

    public CreatePrivateNatOption withDownlinkVpcs(List<DownlinkVpcOption> downlinkVpcs) {
        this.downlinkVpcs = downlinkVpcs;
        return this;
    }

    public CreatePrivateNatOption addDownlinkVpcsItem(DownlinkVpcOption downlinkVpcsItem) {
        if (this.downlinkVpcs == null) {
            this.downlinkVpcs = new ArrayList<>();
        }
        this.downlinkVpcs.add(downlinkVpcsItem);
        return this;
    }

    public CreatePrivateNatOption withDownlinkVpcs(Consumer<List<DownlinkVpcOption>> downlinkVpcsSetter) {
        if (this.downlinkVpcs == null) {
            this.downlinkVpcs = new ArrayList<>();
        }
        downlinkVpcsSetter.accept(this.downlinkVpcs);
        return this;
    }

    /**
     * 私网NAT网关实例所属的VPC实例。
     * @return downlinkVpcs
     */
    public List<DownlinkVpcOption> getDownlinkVpcs() {
        return downlinkVpcs;
    }

    public void setDownlinkVpcs(List<DownlinkVpcOption> downlinkVpcs) {
        this.downlinkVpcs = downlinkVpcs;
    }

    public CreatePrivateNatOption withTags(List<PrivateTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreatePrivateNatOption addTagsItem(PrivateTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreatePrivateNatOption withTags(Consumer<List<PrivateTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<PrivateTag> getTags() {
        return tags;
    }

    public void setTags(List<PrivateTag> tags) {
        this.tags = tags;
    }

    public CreatePrivateNatOption withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID 创建私网NAT网关实例时，关联的企业项目ID。 关于企业项目ID的获取及企业项目特性的详细信息，请参考《企业管理用户指南》。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePrivateNatOption that = (CreatePrivateNatOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.spec, that.spec) && Objects.equals(this.downlinkVpcs, that.downlinkVpcs)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, spec, downlinkVpcs, tags, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateNatOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    downlinkVpcs: ").append(toIndentedString(downlinkVpcs)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
