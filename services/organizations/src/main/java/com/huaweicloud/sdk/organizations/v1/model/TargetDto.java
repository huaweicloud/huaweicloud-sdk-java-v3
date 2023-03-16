package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 要邀请加入组织的帐号的标识符（ID）。
 */
public class TargetDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity")

    private String entity;

    public TargetDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 目标类型，account：账户，email：邮箱。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TargetDto withEntity(String entity) {
        this.entity = entity;
        return this;
    }

    /**
     * 如果指定 'type:account'，则必须提供帐号ID作为实体。如果指定'type:email'，则必须指定与帐号关联的电子邮件地址。
     * @return entity
     */
    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TargetDto targetDto = (TargetDto) o;
        return Objects.equals(this.type, targetDto.type) && Objects.equals(this.entity, targetDto.entity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, entity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetDto {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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
