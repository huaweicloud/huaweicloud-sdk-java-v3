package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VodRetrievalData
 */
public class VodRetrievalData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retrieval_warm")

    private Double retrievalWarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retrieval_cold")

    private Double retrievalCold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retrieval_cold_speed")

    private Double retrievalColdSpeed;

    public VodRetrievalData withRetrievalWarm(Double retrievalWarm) {
        this.retrievalWarm = retrievalWarm;
        return this;
    }

    /**
     * 低频取回量 
     * @return retrievalWarm
     */
    public Double getRetrievalWarm() {
        return retrievalWarm;
    }

    public void setRetrievalWarm(Double retrievalWarm) {
        this.retrievalWarm = retrievalWarm;
    }

    public VodRetrievalData withRetrievalCold(Double retrievalCold) {
        this.retrievalCold = retrievalCold;
        return this;
    }

    /**
     * 归档标准取回量 
     * @return retrievalCold
     */
    public Double getRetrievalCold() {
        return retrievalCold;
    }

    public void setRetrievalCold(Double retrievalCold) {
        this.retrievalCold = retrievalCold;
    }

    public VodRetrievalData withRetrievalColdSpeed(Double retrievalColdSpeed) {
        this.retrievalColdSpeed = retrievalColdSpeed;
        return this;
    }

    /**
     * 归档快速取回量 
     * @return retrievalColdSpeed
     */
    public Double getRetrievalColdSpeed() {
        return retrievalColdSpeed;
    }

    public void setRetrievalColdSpeed(Double retrievalColdSpeed) {
        this.retrievalColdSpeed = retrievalColdSpeed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VodRetrievalData that = (VodRetrievalData) obj;
        return Objects.equals(this.retrievalWarm, that.retrievalWarm)
            && Objects.equals(this.retrievalCold, that.retrievalCold)
            && Objects.equals(this.retrievalColdSpeed, that.retrievalColdSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retrievalWarm, retrievalCold, retrievalColdSpeed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VodRetrievalData {\n");
        sb.append("    retrievalWarm: ").append(toIndentedString(retrievalWarm)).append("\n");
        sb.append("    retrievalCold: ").append(toIndentedString(retrievalCold)).append("\n");
        sb.append("    retrievalColdSpeed: ").append(toIndentedString(retrievalColdSpeed)).append("\n");
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
