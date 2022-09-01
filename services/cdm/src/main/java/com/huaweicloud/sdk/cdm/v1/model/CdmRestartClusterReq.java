package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CdmRestartClusterReq
 */
public class CdmRestartClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart")

    @JacksonXmlProperty(localName = "restart")

    private CdmRestartClusterReqRestart restart;

    public CdmRestartClusterReq withRestart(CdmRestartClusterReqRestart restart) {
        this.restart = restart;
        return this;
    }

    public CdmRestartClusterReq withRestart(Consumer<CdmRestartClusterReqRestart> restartSetter) {
        if (this.restart == null) {
            this.restart = new CdmRestartClusterReqRestart();
            restartSetter.accept(this.restart);
        }

        return this;
    }

    /**
     * Get restart
     * @return restart
     */
    public CdmRestartClusterReqRestart getRestart() {
        return restart;
    }

    public void setRestart(CdmRestartClusterReqRestart restart) {
        this.restart = restart;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CdmRestartClusterReq cdmRestartClusterReq = (CdmRestartClusterReq) o;
        return Objects.equals(this.restart, cdmRestartClusterReq.restart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmRestartClusterReq {\n");
        sb.append("    restart: ").append(toIndentedString(restart)).append("\n");
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
