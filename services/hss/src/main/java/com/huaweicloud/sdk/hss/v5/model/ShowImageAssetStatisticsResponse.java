package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowImageAssetStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_num")

    private Integer localNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_num")

    private Integer cicdNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_num")

    private Integer registryNum;

    public ShowImageAssetStatisticsResponse withLocalNum(Integer localNum) {
        this.localNum = localNum;
        return this;
    }

    /**
     * **参数解释**: 本地镜像数量 **取值范围**: 最小值0，最大值65535 
     * minimum: 0
     * maximum: 65535
     * @return localNum
     */
    public Integer getLocalNum() {
        return localNum;
    }

    public void setLocalNum(Integer localNum) {
        this.localNum = localNum;
    }

    public ShowImageAssetStatisticsResponse withCicdNum(Integer cicdNum) {
        this.cicdNum = cicdNum;
        return this;
    }

    /**
     * **参数解释**: cicd镜像数量 **取值范围**: 最小值0，最大值65535 
     * minimum: 0
     * maximum: 65535
     * @return cicdNum
     */
    public Integer getCicdNum() {
        return cicdNum;
    }

    public void setCicdNum(Integer cicdNum) {
        this.cicdNum = cicdNum;
    }

    public ShowImageAssetStatisticsResponse withRegistryNum(Integer registryNum) {
        this.registryNum = registryNum;
        return this;
    }

    /**
     * **参数解释**: 仓库镜像数量 **取值范围**: 最小值0，最大值65535 
     * minimum: 0
     * maximum: 65535
     * @return registryNum
     */
    public Integer getRegistryNum() {
        return registryNum;
    }

    public void setRegistryNum(Integer registryNum) {
        this.registryNum = registryNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowImageAssetStatisticsResponse that = (ShowImageAssetStatisticsResponse) obj;
        return Objects.equals(this.localNum, that.localNum) && Objects.equals(this.cicdNum, that.cicdNum)
            && Objects.equals(this.registryNum, that.registryNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localNum, cicdNum, registryNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageAssetStatisticsResponse {\n");
        sb.append("    localNum: ").append(toIndentedString(localNum)).append("\n");
        sb.append("    cicdNum: ").append(toIndentedString(cicdNum)).append("\n");
        sb.append("    registryNum: ").append(toIndentedString(registryNum)).append("\n");
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
