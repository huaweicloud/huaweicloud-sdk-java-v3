package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 添加网桥结构体。
 */
public class AddBridge {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bridge_name")

    private String bridgeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bridge_id")

    private String bridgeId;

    public AddBridge withBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
        return this;
    }

    /**
     * 网桥名称。**取值范围**：长度不超过64，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。
     * @return bridgeName
     */
    public String getBridgeName() {
        return bridgeName;
    }

    public void setBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
    }

    public AddBridge withBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }

    /**
     * 网桥ID。**取值范围**：长度不超过36，只允许字母、数字、_-字符的组合。
     * @return bridgeId
     */
    public String getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddBridge that = (AddBridge) obj;
        return Objects.equals(this.bridgeName, that.bridgeName) && Objects.equals(this.bridgeId, that.bridgeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bridgeName, bridgeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddBridge {\n");
        sb.append("    bridgeName: ").append(toIndentedString(bridgeName)).append("\n");
        sb.append("    bridgeId: ").append(toIndentedString(bridgeId)).append("\n");
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
