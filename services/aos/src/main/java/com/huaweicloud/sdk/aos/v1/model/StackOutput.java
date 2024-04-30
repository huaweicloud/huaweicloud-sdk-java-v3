package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源栈输出
 */
public class StackOutput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive")

    private Boolean sensitive;

    public StackOutput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源栈输出的名称，由用户在模板中定义  以 HCL 模板为例，name 为 vpc_id  ```hcl output \"vpc_id\" {   value = huaweicloud_vpc.my_hello_world_vpc.id } ```  以 json 模板为例，name 为 vpc_id ```json {   \"output\": {     \"vpc_id\": [       {         \"value\": \"${huaweicloud_vpc.my_hello_world_vpc.id}\"       }     ]   } } ```
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StackOutput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 资源栈输出的描述，由用户在模板中定义
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StackOutput withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源栈输出的类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StackOutput withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 资源栈输出的值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StackOutput withSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }

    /**
     * 标识该资源栈输出是否为敏感信息，由用户在模板中定义  如果用户在模板中将该输出定义为sensitive，则返回体中该输出的value和type不会返回真实值，而是返回`<sensitive>`
     * @return sensitive
     */
    public Boolean getSensitive() {
        return sensitive;
    }

    public void setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StackOutput that = (StackOutput) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.type, that.type) && Objects.equals(this.value, that.value)
            && Objects.equals(this.sensitive, that.sensitive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, type, value, sensitive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackOutput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
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
