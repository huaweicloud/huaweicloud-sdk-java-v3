package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：计算资源简要信息。 **约束限制**：不涉及。 
 */
public class V2ComputeBriefInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private ChargeMode chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private List<ResourceCapacityItem> capacity = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, String> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prometheus_config")

    private PrometheusConfig prometheusConfig;

    public V2ComputeBriefInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：计算资源ID。 **取值范围**：长度为1~36个英文字母、数字和中划线的组合。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public V2ComputeBriefInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：计算资源名称。 **约束限制**：不涉及。 **取值范围**：支持小写字母、数字、中划线，必须字母开头、字母或数字结尾，长度为1~63个字符。 **默认取值**：不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public V2ComputeBriefInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：资源描述信息。 **取值范围**：不允许输入感叹号、小于号、大于号、等号、与号、双引号、单引号、艾特符、井号、百分号、分号、左括号、右括号、竖线、星号、反斜杠。长度为0~512个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public V2ComputeBriefInfo withChargeMode(ChargeMode chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * Get chargeMode
     * @return chargeMode
     */
    public ChargeMode getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeMode chargeMode) {
        this.chargeMode = chargeMode;
    }

    public V2ComputeBriefInfo withCapacity(List<ResourceCapacityItem> capacity) {
        this.capacity = capacity;
        return this;
    }

    public V2ComputeBriefInfo addCapacityItem(ResourceCapacityItem capacityItem) {
        if (this.capacity == null) {
            this.capacity = new ArrayList<>();
        }
        this.capacity.add(capacityItem);
        return this;
    }

    public V2ComputeBriefInfo withCapacity(Consumer<List<ResourceCapacityItem>> capacitySetter) {
        if (this.capacity == null) {
            this.capacity = new ArrayList<>();
        }
        capacitySetter.accept(this.capacity);
        return this;
    }

    /**
     * **参数解释**：计算资源容量配置，由ResourceCapacityItem对象组成的数组，每个对象定义了资源类型、资源数量、资源规格和资源ID等信息。 
     * @return capacity
     */
    public List<ResourceCapacityItem> getCapacity() {
        return capacity;
    }

    public void setCapacity(List<ResourceCapacityItem> capacity) {
        this.capacity = capacity;
    }

    public V2ComputeBriefInfo withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public V2ComputeBriefInfo putPropertiesItem(String key, String propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public V2ComputeBriefInfo withProperties(Consumer<Map<String, String>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * **参数解释**：计算资源额外属性键值对映射。 
     * @return properties
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public V2ComputeBriefInfo withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public V2ComputeBriefInfo addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public V2ComputeBriefInfo withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：标签列表，由Tag对象组成的数组，每个对象定义了标签键和标签值。 
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public V2ComputeBriefInfo withPrometheusConfig(PrometheusConfig prometheusConfig) {
        this.prometheusConfig = prometheusConfig;
        return this;
    }

    public V2ComputeBriefInfo withPrometheusConfig(Consumer<PrometheusConfig> prometheusConfigSetter) {
        if (this.prometheusConfig == null) {
            this.prometheusConfig = new PrometheusConfig();
            prometheusConfigSetter.accept(this.prometheusConfig);
        }

        return this;
    }

    /**
     * Get prometheusConfig
     * @return prometheusConfig
     */
    public PrometheusConfig getPrometheusConfig() {
        return prometheusConfig;
    }

    public void setPrometheusConfig(PrometheusConfig prometheusConfig) {
        this.prometheusConfig = prometheusConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2ComputeBriefInfo that = (V2ComputeBriefInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.capacity, that.capacity) && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.prometheusConfig, that.prometheusConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, chargeMode, capacity, properties, tags, prometheusConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2ComputeBriefInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    prometheusConfig: ").append(toIndentedString(prometheusConfig)).append("\n");
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
