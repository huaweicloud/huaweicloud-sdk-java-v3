package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新的集群信息
 */
public class UpdateMultiCloudClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_expiration_date")

    private Long currentExpirationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade")

    private Boolean upgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubeconfig")

    private String kubeconfig;

    public UpdateMultiCloudClusterRequestBody withCurrentExpirationDate(Long currentExpirationDate) {
        this.currentExpirationDate = currentExpirationDate;
        return this;
    }

    /**
     * 当前有效期结束时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return currentExpirationDate
     */
    public Long getCurrentExpirationDate() {
        return currentExpirationDate;
    }

    public void setCurrentExpirationDate(Long currentExpirationDate) {
        this.currentExpirationDate = currentExpirationDate;
    }

    public UpdateMultiCloudClusterRequestBody withUpgrade(Boolean upgrade) {
        this.upgrade = upgrade;
        return this;
    }

    /**
     * 是否升级代理版本
     * @return upgrade
     */
    public Boolean getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(Boolean upgrade) {
        this.upgrade = upgrade;
    }

    public UpdateMultiCloudClusterRequestBody withKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
        return this;
    }

    /**
     * kubeconfig文件
     * @return kubeconfig
     */
    public String getKubeconfig() {
        return kubeconfig;
    }

    public void setKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateMultiCloudClusterRequestBody that = (UpdateMultiCloudClusterRequestBody) obj;
        return Objects.equals(this.currentExpirationDate, that.currentExpirationDate)
            && Objects.equals(this.upgrade, that.upgrade) && Objects.equals(this.kubeconfig, that.kubeconfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentExpirationDate, upgrade, kubeconfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMultiCloudClusterRequestBody {\n");
        sb.append("    currentExpirationDate: ").append(toIndentedString(currentExpirationDate)).append("\n");
        sb.append("    upgrade: ").append(toIndentedString(upgrade)).append("\n");
        sb.append("    kubeconfig: ").append(toIndentedString(kubeconfig)).append("\n");
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
