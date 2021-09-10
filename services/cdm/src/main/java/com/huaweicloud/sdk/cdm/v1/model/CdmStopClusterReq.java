package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** CdmStopClusterReq */
public class CdmStopClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop")

    private CdmStopClusterReqStop stop;

    public CdmStopClusterReq withStop(CdmStopClusterReqStop stop) {
        this.stop = stop;
        return this;
    }

    public CdmStopClusterReq withStop(Consumer<CdmStopClusterReqStop> stopSetter) {
        if (this.stop == null) {
            this.stop = new CdmStopClusterReqStop();
            stopSetter.accept(this.stop);
        }

        return this;
    }

    /** Get stop
     * 
     * @return stop */
    public CdmStopClusterReqStop getStop() {
        return stop;
    }

    public void setStop(CdmStopClusterReqStop stop) {
        this.stop = stop;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CdmStopClusterReq cdmStopClusterReq = (CdmStopClusterReq) o;
        return Objects.equals(this.stop, cdmStopClusterReq.stop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmStopClusterReq {\n");
        sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
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
