package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChangeCloudPhoneServerModelRequestBody
 */
public class ChangeCloudPhoneServerModelRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_model_name")

    private String serverModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_model_name")

    private String phoneModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_param")

    private ChangeCloudPhoneServerModelRequestBodyExtendParam extendParam;

    public ChangeCloudPhoneServerModelRequestBody withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云手机服务器的唯一标识。只有特定的服务器才能操作变更规格
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ChangeCloudPhoneServerModelRequestBody withServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
        return this;
    }

    /**
     * 目标云手机服务器规格，不超过64个字节。仅允许相同代系服务器之间的规格切换。
     * @return serverModelName
     */
    public String getServerModelName() {
        return serverModelName;
    }

    public void setServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
    }

    public ChangeCloudPhoneServerModelRequestBody withPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
        return this;
    }

    /**
     * 目标云手机规格。要求与变更前云手机规格路数相同，与目标云手机服务器规格匹配。
     * @return phoneModelName
     */
    public String getPhoneModelName() {
        return phoneModelName;
    }

    public void setPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
    }

    public ChangeCloudPhoneServerModelRequestBody withExtendParam(
        ChangeCloudPhoneServerModelRequestBodyExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public ChangeCloudPhoneServerModelRequestBody withExtendParam(
        Consumer<ChangeCloudPhoneServerModelRequestBodyExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new ChangeCloudPhoneServerModelRequestBodyExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public ChangeCloudPhoneServerModelRequestBodyExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(ChangeCloudPhoneServerModelRequestBodyExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeCloudPhoneServerModelRequestBody changeCloudPhoneServerModelRequestBody =
            (ChangeCloudPhoneServerModelRequestBody) o;
        return Objects.equals(this.serverId, changeCloudPhoneServerModelRequestBody.serverId)
            && Objects.equals(this.serverModelName, changeCloudPhoneServerModelRequestBody.serverModelName)
            && Objects.equals(this.phoneModelName, changeCloudPhoneServerModelRequestBody.phoneModelName)
            && Objects.equals(this.extendParam, changeCloudPhoneServerModelRequestBody.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, serverModelName, phoneModelName, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeCloudPhoneServerModelRequestBody {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    serverModelName: ").append(toIndentedString(serverModelName)).append("\n");
        sb.append("    phoneModelName: ").append(toIndentedString(phoneModelName)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
