package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MemberItemDto
 */
public class MemberItemDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "$ref")

    private String $ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public MemberItemDto withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 成员的全局唯一标识符（ID）
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public MemberItemDto with$Ref(String $ref) {
        this.$ref = $ref;
        return this;
    }

    /**
     * 成员的引用信息
     * @return $ref
     */
    public String get$Ref() {
        return $ref;
    }

    public void set$Ref(String $ref) {
        this.$ref = $ref;
    }

    public MemberItemDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 成员类型 User：用户
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberItemDto that = (MemberItemDto) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.$ref, that.$ref)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, $ref, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberItemDto {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    $ref: ").append(toIndentedString($ref)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
