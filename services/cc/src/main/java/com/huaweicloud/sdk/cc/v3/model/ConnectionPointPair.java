package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 带宽包两端接入站点的站点编码，成对配置
 */
public class ConnectionPointPair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_point_pair")

    private List<ConnectionPoint> connectionPointPair = null;

    public ConnectionPointPair withConnectionPointPair(List<ConnectionPoint> connectionPointPair) {
        this.connectionPointPair = connectionPointPair;
        return this;
    }

    public ConnectionPointPair addConnectionPointPairItem(ConnectionPoint connectionPointPairItem) {
        if (this.connectionPointPair == null) {
            this.connectionPointPair = new ArrayList<>();
        }
        this.connectionPointPair.add(connectionPointPairItem);
        return this;
    }

    public ConnectionPointPair withConnectionPointPair(Consumer<List<ConnectionPoint>> connectionPointPairSetter) {
        if (this.connectionPointPair == null) {
            this.connectionPointPair = new ArrayList<>();
        }
        connectionPointPairSetter.accept(this.connectionPointPair);
        return this;
    }

    /**
     * 中心网络连接的两个端点定义，长度固定为2的数组。
     * @return connectionPointPair
     */
    public List<ConnectionPoint> getConnectionPointPair() {
        return connectionPointPair;
    }

    public void setConnectionPointPair(List<ConnectionPoint> connectionPointPair) {
        this.connectionPointPair = connectionPointPair;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectionPointPair that = (ConnectionPointPair) obj;
        return Objects.equals(this.connectionPointPair, that.connectionPointPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionPointPair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionPointPair {\n");
        sb.append("    connectionPointPair: ").append(toIndentedString(connectionPointPair)).append("\n");
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
