package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuleContent
 */
public class RuleContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_modify_when_inherit")

    private Boolean canModifyWhenInherit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private List<RuleProperty> properties = null;

    public RuleContent withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 分组名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public RuleContent withCanModifyWhenInherit(Boolean canModifyWhenInherit) {
        this.canModifyWhenInherit = canModifyWhenInherit;
        return this;
    }

    /**
     * **参数解释**： 继承后的子策略是否可以修改阈值。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return canModifyWhenInherit
     */
    public Boolean getCanModifyWhenInherit() {
        return canModifyWhenInherit;
    }

    public void setCanModifyWhenInherit(Boolean canModifyWhenInherit) {
        this.canModifyWhenInherit = canModifyWhenInherit;
    }

    public RuleContent withProperties(List<RuleProperty> properties) {
        this.properties = properties;
        return this;
    }

    public RuleContent addPropertiesItem(RuleProperty propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public RuleContent withProperties(Consumer<List<RuleProperty>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * **参数解释**： 规则属性列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return properties
     */
    public List<RuleProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<RuleProperty> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleContent that = (RuleContent) obj;
        return Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.canModifyWhenInherit, that.canModifyWhenInherit)
            && Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, canModifyWhenInherit, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleContent {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    canModifyWhenInherit: ").append(toIndentedString(canModifyWhenInherit)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
