package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateClusterSshRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private BigDecimal expireTime;

    public UpdateClusterSshRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateClusterSshRequest withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 开启/关闭集群节点授权
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public UpdateClusterSshRequest withExpireTime(BigDecimal expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 开启集群节点授权截止时间，仅enable为true时需要传递，如不传该值默认为1天授权时间
     * @return expireTime
     */
    public BigDecimal getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(BigDecimal expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateClusterSshRequest that = (UpdateClusterSshRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.expireTime, that.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, enable, expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClusterSshRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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
