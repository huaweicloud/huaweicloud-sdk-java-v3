package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 剧本对象
 */
public class AopworkflowInstanceDetailPlaybook {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_name")

    private String enName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public AopworkflowInstanceDetailPlaybook withEnName(String enName) {
        this.enName = enName;
        return this;
    }

    /**
     * **参数解释**: 剧本英文名字 **约束限制**: 不涉及
     * @return enName
     */
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public AopworkflowInstanceDetailPlaybook withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 剧本的ID **约束限制**: 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AopworkflowInstanceDetailPlaybook withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 剧本的名字 **约束限制**: 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AopworkflowInstanceDetailPlaybook that = (AopworkflowInstanceDetailPlaybook) obj;
        return Objects.equals(this.enName, that.enName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enName, id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AopworkflowInstanceDetailPlaybook {\n");
        sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
