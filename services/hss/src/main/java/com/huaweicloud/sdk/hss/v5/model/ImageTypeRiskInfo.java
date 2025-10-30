package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageTypeRiskInfo
 */
public class ImageTypeRiskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local")

    private Integer local;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registriy")

    private Integer registriy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd")

    private Integer cicd;

    public ImageTypeRiskInfo withLocal(Integer local) {
        this.local = local;
        return this;
    }

    /**
     * 本地镜像
     * minimum: 0
     * maximum: 65535
     * @return local
     */
    public Integer getLocal() {
        return local;
    }

    public void setLocal(Integer local) {
        this.local = local;
    }

    public ImageTypeRiskInfo withRegistriy(Integer registriy) {
        this.registriy = registriy;
        return this;
    }

    /**
     * 仓库镜像
     * minimum: 0
     * maximum: 65535
     * @return registriy
     */
    public Integer getRegistriy() {
        return registriy;
    }

    public void setRegistriy(Integer registriy) {
        this.registriy = registriy;
    }

    public ImageTypeRiskInfo withCicd(Integer cicd) {
        this.cicd = cicd;
        return this;
    }

    /**
     * cicd镜像
     * minimum: 0
     * maximum: 65535
     * @return cicd
     */
    public Integer getCicd() {
        return cicd;
    }

    public void setCicd(Integer cicd) {
        this.cicd = cicd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageTypeRiskInfo that = (ImageTypeRiskInfo) obj;
        return Objects.equals(this.local, that.local) && Objects.equals(this.registriy, that.registriy)
            && Objects.equals(this.cicd, that.cicd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(local, registriy, cicd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageTypeRiskInfo {\n");
        sb.append("    local: ").append(toIndentedString(local)).append("\n");
        sb.append("    registriy: ").append(toIndentedString(registriy)).append("\n");
        sb.append("    cicd: ").append(toIndentedString(cicd)).append("\n");
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
