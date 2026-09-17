package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作项状态查询接口返回状态数据
 */
public class StatusVoIpd {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belonging")

    private String belonging;

    public StatusVoIpd withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 状态名称。 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusVoIpd withBelonging(String belonging) {
        this.belonging = belonging;
        return this;
    }

    /**
     * **参数解释**： 工作项的状态属性。 **取值范围**： START、IN_PROGRESS、END。
     * @return belonging
     */
    public String getBelonging() {
        return belonging;
    }

    public void setBelonging(String belonging) {
        this.belonging = belonging;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatusVoIpd that = (StatusVoIpd) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.belonging, that.belonging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, belonging);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusVoIpd {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    belonging: ").append(toIndentedString(belonging)).append("\n");
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
