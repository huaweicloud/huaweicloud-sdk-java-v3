package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务单目录-后续结合项目信息
 */
public class OrderCatalogue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_type")

    private String subType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribe")

    private Boolean subscribe;

    public OrderCatalogue withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 服务单类型编码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OrderCatalogue withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OrderCatalogue withSubType(String subType) {
        this.subType = subType;
        return this;
    }

    /**
     * 子类型
     * @return subType
     */
    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public OrderCatalogue withSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
        return this;
    }

    /**
     * 是否已开通
     * @return subscribe
     */
    public Boolean getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderCatalogue that = (OrderCatalogue) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.type, that.type)
            && Objects.equals(this.subType, that.subType) && Objects.equals(this.subscribe, that.subscribe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, type, subType, subscribe);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderCatalogue {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
        sb.append("    subscribe: ").append(toIndentedString(subscribe)).append("\n");
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
