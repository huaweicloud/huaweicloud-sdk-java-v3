package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateEsElbRequestBody
 */
public class UpdateEsElbRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_id")

    private String elbId;

    public UpdateEsElbRequestBody withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 打开或关闭es负载均衡器。 - true：开启。 - false：关闭。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public UpdateEsElbRequestBody withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 委托名称。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public UpdateEsElbRequestBody withElbId(String elbId) {
        this.elbId = elbId;
        return this;
    }

    /**
     * 负载均衡器id。
     * @return elbId
     */
    public String getElbId() {
        return elbId;
    }

    public void setElbId(String elbId) {
        this.elbId = elbId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEsElbRequestBody that = (UpdateEsElbRequestBody) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.agency, that.agency)
            && Objects.equals(this.elbId, that.elbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, agency, elbId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEsElbRequestBody {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    elbId: ").append(toIndentedString(elbId)).append("\n");
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
