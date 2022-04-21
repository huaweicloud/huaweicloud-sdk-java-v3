package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 场地条件
 */
public class Condition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private Integer environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space")

    private Integer space;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transport")

    private Integer transport;

    public Condition withEnvironment(Integer environment) {
        this.environment = environment;
        return this;
    }

    /**
     * 机房环境条件 取值范围：   - 0：需做详细评估   - 1：机房内已部署华为FusionModule   - 2：机房等级满足T3或同等级国家标准
     * minimum: 0
     * maximum: 2
     * @return environment
     */
    public Integer getEnvironment() {
        return environment;
    }

    public void setEnvironment(Integer environment) {
        this.environment = environment;
    }

    public Condition withSpace(Integer space) {
        this.space = space;
        return this;
    }

    /**
     * 机柜空间条件 取值范围：   - 0：除首柜外，同机房无预留空间   - 1：除首柜外，同机房预留3柜以上空间   - 2：除首柜外，同机房预留1-3柜空间
     * minimum: 0
     * maximum: 2
     * @return space
     */
    public Integer getSpace() {
        return space;
    }

    public void setSpace(Integer space) {
        this.space = space;
    }

    public Condition withTransport(Integer transport) {
        this.transport = transport;
        return this;
    }

    /**
     * 运输条件 取值范围：   - 0：运输通道和机房门的高度或宽度不满足要求   - 1：运输通道，货梯，机房门均可满足整机柜滚轮搬运   - 2：运输通道，货梯，机房门不能支持整机柜滚轮搬运，沿途有台阶
     * minimum: 0
     * maximum: 2
     * @return transport
     */
    public Integer getTransport() {
        return transport;
    }

    public void setTransport(Integer transport) {
        this.transport = transport;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Condition condition = (Condition) o;
        return Objects.equals(this.environment, condition.environment) && Objects.equals(this.space, condition.space)
            && Objects.equals(this.transport, condition.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment, space, transport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Condition {\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    space: ").append(toIndentedString(space)).append("\n");
        sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
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
