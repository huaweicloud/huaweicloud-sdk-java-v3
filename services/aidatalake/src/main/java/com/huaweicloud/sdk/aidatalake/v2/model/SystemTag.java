package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：系统标签。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
 */
public class SystemTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public SystemTag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**：系统标签键。 **约束限制**：不涉及。 **取值范围**：目前仅支持 _sys_enterprise_project_id。 **默认取值**：不涉及。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SystemTag withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**：系统标签值。企业项目ID，获取方法，请参见[获取企业项目ID](aidatalake_02_0042.xml)。 **约束限制**：不涉及。 **取值范围**：长度为1~64个字符，由英文字母、数字和中划线组成。 **默认取值**：不涉及。 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SystemTag that = (SystemTag) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemTag {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
