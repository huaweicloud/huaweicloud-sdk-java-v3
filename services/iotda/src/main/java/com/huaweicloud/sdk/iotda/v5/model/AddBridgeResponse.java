package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AddBridgeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bridge_id")

    private String bridgeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bridge_name")

    private String bridgeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_info")

    private BridgeAuthInfo authInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public AddBridgeResponse withBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }

    /**
     * 网桥ID，用于唯一标识一个网桥。在注册网桥时直接指定，或者由物联网平台分配获得。
     * @return bridgeId
     */
    public String getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
    }

    public AddBridgeResponse withBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
        return this;
    }

    /**
     * 网桥名称。
     * @return bridgeName
     */
    public String getBridgeName() {
        return bridgeName;
    }

    public void setBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
    }

    public AddBridgeResponse withAuthInfo(BridgeAuthInfo authInfo) {
        this.authInfo = authInfo;
        return this;
    }

    public AddBridgeResponse withAuthInfo(Consumer<BridgeAuthInfo> authInfoSetter) {
        if (this.authInfo == null) {
            this.authInfo = new BridgeAuthInfo();
            authInfoSetter.accept(this.authInfo);
        }

        return this;
    }

    /**
     * Get authInfo
     * @return authInfo
     */
    public BridgeAuthInfo getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(BridgeAuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    public AddBridgeResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 在物联网平台注册网桥的时间。格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddBridgeResponse that = (AddBridgeResponse) obj;
        return Objects.equals(this.bridgeId, that.bridgeId) && Objects.equals(this.bridgeName, that.bridgeName)
            && Objects.equals(this.authInfo, that.authInfo) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bridgeId, bridgeName, authInfo, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddBridgeResponse {\n");
        sb.append("    bridgeId: ").append(toIndentedString(bridgeId)).append("\n");
        sb.append("    bridgeName: ").append(toIndentedString(bridgeName)).append("\n");
        sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
