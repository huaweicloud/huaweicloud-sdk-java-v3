package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** IefInfo */
public class IefInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_mode")

    private Long deployMode;

    public IefInfo withDeployMode(Long deployMode) {
        this.deployMode = deployMode;
        return this;
    }

    /** BCS服务边缘节点部署模式，分为：随机模式（0），绑定模式（1）
     * 
     * @return deployMode */
    public Long getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(Long deployMode) {
        this.deployMode = deployMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IefInfo iefInfo = (IefInfo) o;
        return Objects.equals(this.deployMode, iefInfo.deployMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deployMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IefInfo {\n");
        sb.append("    deployMode: ").append(toIndentedString(deployMode)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
