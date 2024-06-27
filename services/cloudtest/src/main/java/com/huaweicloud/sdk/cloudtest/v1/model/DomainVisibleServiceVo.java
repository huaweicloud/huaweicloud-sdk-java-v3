package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class DomainVisibleServiceVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_type")

    private Integer executeType;

    public DomainVisibleServiceVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 第三方服务名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DomainVisibleServiceVo withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 第三方服务类型
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public DomainVisibleServiceVo withExecuteType(Integer executeType) {
        this.executeType = executeType;
        return this;
    }

    /**
     * 第三方服务执行方式（0：普通TestHub，1：对接八爪鱼TestHub）
     * @return executeType
     */
    public Integer getExecuteType() {
        return executeType;
    }

    public void setExecuteType(Integer executeType) {
        this.executeType = executeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainVisibleServiceVo that = (DomainVisibleServiceVo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.executeType, that.executeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, executeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainVisibleServiceVo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    executeType: ").append(toIndentedString(executeType)).append("\n");
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
