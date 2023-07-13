package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListBrokersRespBrokers
 */
public class ListBrokersRespBrokers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<BigDecimal> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_name")

    private String brokerName;

    public ListBrokersRespBrokers withIds(List<BigDecimal> ids) {
        this.ids = ids;
        return this;
    }

    public ListBrokersRespBrokers addIdsItem(BigDecimal idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public ListBrokersRespBrokers withIds(Consumer<List<BigDecimal>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 全部代理ID。
     * @return ids
     */
    public List<BigDecimal> getIds() {
        return ids;
    }

    public void setIds(List<BigDecimal> ids) {
        this.ids = ids;
    }

    public ListBrokersRespBrokers withBrokerName(String brokerName) {
        this.brokerName = brokerName;
        return this;
    }

    /**
     * 节点名称。
     * @return brokerName
     */
    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBrokersRespBrokers that = (ListBrokersRespBrokers) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.brokerName, that.brokerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, brokerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBrokersRespBrokers {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    brokerName: ").append(toIndentedString(brokerName)).append("\n");
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
