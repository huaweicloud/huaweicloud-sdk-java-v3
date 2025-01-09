package com.huaweicloud.sdk.workspace.v2.model;

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
 * NAT映射配置。
 */
public class UpdateNatMappingConfig {

    /**
     * NAT映射类型。 - PORT:端口映射. - HOST:地址映射,最多支持配置10个地址.
     */
    public static final class NatMapTypeEnum {

        /**
         * Enum PORT for value: "PORT"
         */
        public static final NatMapTypeEnum PORT = new NatMapTypeEnum("PORT");

        /**
         * Enum HOST for value: "HOST"
         */
        public static final NatMapTypeEnum HOST = new NatMapTypeEnum("HOST");

        private static final Map<String, NatMapTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NatMapTypeEnum> createStaticFields() {
            Map<String, NatMapTypeEnum> map = new HashMap<>();
            map.put("PORT", PORT);
            map.put("HOST", HOST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NatMapTypeEnum(String value) {
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
        public static NatMapTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NatMapTypeEnum(value));
        }

        public static NatMapTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NatMapTypeEnum) {
                return this.value.equals(((NatMapTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_map_type")

    private NatMapTypeEnum natMapType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_map_value")

    private String natMapValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_ip")

    private String natIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_port")

    private String natPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vag_ip")

    private String vagIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_filter_type")

    private Integer accessFilterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public UpdateNatMappingConfig withNatMapType(NatMapTypeEnum natMapType) {
        this.natMapType = natMapType;
        return this;
    }

    /**
     * NAT映射类型。 - PORT:端口映射. - HOST:地址映射,最多支持配置10个地址.
     * @return natMapType
     */
    public NatMapTypeEnum getNatMapType() {
        return natMapType;
    }

    public void setNatMapType(NatMapTypeEnum natMapType) {
        this.natMapType = natMapType;
    }

    public UpdateNatMappingConfig withNatMapValue(String natMapValue) {
        this.natMapValue = natMapValue;
        return this;
    }

    /**
     * nat_map_type为PORT时表示端口,取值9443/9445. nat_map_type为HOST时表示接入地址.
     * @return natMapValue
     */
    public String getNatMapValue() {
        return natMapValue;
    }

    public void setNatMapValue(String natMapValue) {
        this.natMapValue = natMapValue;
    }

    public UpdateNatMappingConfig withNatIp(String natIp) {
        this.natIp = natIp;
        return this;
    }

    /**
     * nat Ip。
     * @return natIp
     */
    public String getNatIp() {
        return natIp;
    }

    public void setNatIp(String natIp) {
        this.natIp = natIp;
    }

    public UpdateNatMappingConfig withNatPort(String natPort) {
        this.natPort = natPort;
        return this;
    }

    /**
     * nat端口,取值范围0-65535。
     * @return natPort
     */
    public String getNatPort() {
        return natPort;
    }

    public void setNatPort(String natPort) {
        this.natPort = natPort;
    }

    public UpdateNatMappingConfig withVagIp(String vagIp) {
        this.vagIp = vagIp;
        return this;
    }

    /**
     * vag Ip。
     * @return vagIp
     */
    public String getVagIp() {
        return vagIp;
    }

    public void setVagIp(String vagIp) {
        this.vagIp = vagIp;
    }

    public UpdateNatMappingConfig withAccessFilterType(Integer accessFilterType) {
        this.accessFilterType = accessFilterType;
        return this;
    }

    /**
     * 0标识不开启，1表示开启。
     * minimum: 0
     * maximum: 1
     * @return accessFilterType
     */
    public Integer getAccessFilterType() {
        return accessFilterType;
    }

    public void setAccessFilterType(Integer accessFilterType) {
        this.accessFilterType = accessFilterType;
    }

    public UpdateNatMappingConfig withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdateNatMappingConfig withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateNatMappingConfig addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateNatMappingConfig withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签对象
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNatMappingConfig that = (UpdateNatMappingConfig) obj;
        return Objects.equals(this.natMapType, that.natMapType) && Objects.equals(this.natMapValue, that.natMapValue)
            && Objects.equals(this.natIp, that.natIp) && Objects.equals(this.natPort, that.natPort)
            && Objects.equals(this.vagIp, that.vagIp) && Objects.equals(this.accessFilterType, that.accessFilterType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(natMapType, natMapValue, natIp, natPort, vagIp, accessFilterType, enterpriseProjectId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNatMappingConfig {\n");
        sb.append("    natMapType: ").append(toIndentedString(natMapType)).append("\n");
        sb.append("    natMapValue: ").append(toIndentedString(natMapValue)).append("\n");
        sb.append("    natIp: ").append(toIndentedString(natIp)).append("\n");
        sb.append("    natPort: ").append(toIndentedString(natPort)).append("\n");
        sb.append("    vagIp: ").append(toIndentedString(vagIp)).append("\n");
        sb.append("    accessFilterType: ").append(toIndentedString(accessFilterType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
