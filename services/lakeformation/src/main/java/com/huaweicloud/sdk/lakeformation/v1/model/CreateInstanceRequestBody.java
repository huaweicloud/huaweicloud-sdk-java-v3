package com.huaweicloud.sdk.lakeformation.v1.model;

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
 * 创建LakeFormation实例请求体
 */
public class CreateInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 支付类型，postPaid为按需期
     */
    public static final class ChargeModeEnum {

        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargeModeEnum POSTPAID = new ChargeModeEnum("postPaid");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("postPaid", POSTPAID);
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
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared")

    private Boolean shared;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specs")

    private List<CreateSpec> specs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    public CreateInstanceRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInstanceRequestBody withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 支付类型，postPaid为按需期
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public CreateInstanceRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id，只有对接了企业项目才可以填写
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateInstanceRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateInstanceRequestBody withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * false:物理多租 true:逻辑多租
     * @return shared
     */
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public CreateInstanceRequestBody withSpecs(List<CreateSpec> specs) {
        this.specs = specs;
        return this;
    }

    public CreateInstanceRequestBody addSpecsItem(CreateSpec specsItem) {
        if (this.specs == null) {
            this.specs = new ArrayList<>();
        }
        this.specs.add(specsItem);
        return this;
    }

    public CreateInstanceRequestBody withSpecs(Consumer<List<CreateSpec>> specsSetter) {
        if (this.specs == null) {
            this.specs = new ArrayList<>();
        }
        specsSetter.accept(this.specs);
        return this;
    }

    /**
     * 规格列表
     * @return specs
     */
    public List<CreateSpec> getSpecs() {
        return specs;
    }

    public void setSpecs(List<CreateSpec> specs) {
        this.specs = specs;
    }

    public CreateInstanceRequestBody withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateInstanceRequestBody addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateInstanceRequestBody withTags(Consumer<List<ResourceTag>> tagsSetter) {
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
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceRequestBody createInstanceRequestBody = (CreateInstanceRequestBody) o;
        return Objects.equals(this.name, createInstanceRequestBody.name)
            && Objects.equals(this.chargeMode, createInstanceRequestBody.chargeMode)
            && Objects.equals(this.enterpriseProjectId, createInstanceRequestBody.enterpriseProjectId)
            && Objects.equals(this.description, createInstanceRequestBody.description)
            && Objects.equals(this.shared, createInstanceRequestBody.shared)
            && Objects.equals(this.specs, createInstanceRequestBody.specs)
            && Objects.equals(this.tags, createInstanceRequestBody.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, chargeMode, enterpriseProjectId, description, shared, specs, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    specs: ").append(toIndentedString(specs)).append("\n");
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
