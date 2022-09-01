package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 创建容灾演练请求数据结构
 */
public class CreateDisasterRecoveryDrillRequestParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    @JacksonXmlProperty(localName = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drill_vpc_id")

    @JacksonXmlProperty(localName = "drill_vpc_id")

    private String drillVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    public CreateDisasterRecoveryDrillRequestParams withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 保护组的ID。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public CreateDisasterRecoveryDrillRequestParams withDrillVpcId(String drillVpcId) {
        this.drillVpcId = drillVpcId;
        return this;
    }

    /**
     * 演练虚拟私有云ID，不指定时系统会自动创建演练VPC。
     * @return drillVpcId
     */
    public String getDrillVpcId() {
        return drillVpcId;
    }

    public void setDrillVpcId(String drillVpcId) {
        this.drillVpcId = drillVpcId;
    }

    public CreateDisasterRecoveryDrillRequestParams withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指定容灾演练的名称，最大支持长度为64个字节。只包含中文字符、英文字母（a～ｚ、Ａ～Ｚ）、数字（０~９）、小数点（．）、下划线（_）、中划线（-）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDisasterRecoveryDrillRequestParams createDisasterRecoveryDrillRequestParams =
            (CreateDisasterRecoveryDrillRequestParams) o;
        return Objects.equals(this.serverGroupId, createDisasterRecoveryDrillRequestParams.serverGroupId)
            && Objects.equals(this.drillVpcId, createDisasterRecoveryDrillRequestParams.drillVpcId)
            && Objects.equals(this.name, createDisasterRecoveryDrillRequestParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroupId, drillVpcId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDisasterRecoveryDrillRequestParams {\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    drillVpcId: ").append(toIndentedString(drillVpcId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
