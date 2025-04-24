package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRabbitMqProductCoresResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_num")

    private Integer coreNum;

    public ShowRabbitMqProductCoresResponse withCoreNum(Integer coreNum) {
        this.coreNum = coreNum;
        return this;
    }

    /**
     * 核数
     * @return coreNum
     */
    public Integer getCoreNum() {
        return coreNum;
    }

    public void setCoreNum(Integer coreNum) {
        this.coreNum = coreNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRabbitMqProductCoresResponse that = (ShowRabbitMqProductCoresResponse) obj;
        return Objects.equals(this.coreNum, that.coreNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coreNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRabbitMqProductCoresResponse {\n");
        sb.append("    coreNum: ").append(toIndentedString(coreNum)).append("\n");
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
