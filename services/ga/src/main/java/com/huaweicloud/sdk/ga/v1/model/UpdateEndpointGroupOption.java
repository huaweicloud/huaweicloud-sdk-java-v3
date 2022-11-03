package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新终端节点组的详细信息。
 */
public class UpdateEndpointGroupOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_dial_percentage")

    private Integer trafficDialPercentage;

    public UpdateEndpointGroupOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 终端节点组名称，取值范围：1~64个字符之间，只能由数字、字母、中划线和中文组成。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateEndpointGroupOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 终端节点组描述信息，取值范围：0~255个字符之间，禁止输入字符：<>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateEndpointGroupOption withTrafficDialPercentage(Integer trafficDialPercentage) {
        this.trafficDialPercentage = trafficDialPercentage;
        return this;
    }

    /**
     * 流量拨分到此组的百分比。
     * minimum: 0
     * maximum: 100
     * @return trafficDialPercentage
     */
    public Integer getTrafficDialPercentage() {
        return trafficDialPercentage;
    }

    public void setTrafficDialPercentage(Integer trafficDialPercentage) {
        this.trafficDialPercentage = trafficDialPercentage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEndpointGroupOption updateEndpointGroupOption = (UpdateEndpointGroupOption) o;
        return Objects.equals(this.name, updateEndpointGroupOption.name)
            && Objects.equals(this.description, updateEndpointGroupOption.description)
            && Objects.equals(this.trafficDialPercentage, updateEndpointGroupOption.trafficDialPercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, trafficDialPercentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointGroupOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    trafficDialPercentage: ").append(toIndentedString(trafficDialPercentage)).append("\n");
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
