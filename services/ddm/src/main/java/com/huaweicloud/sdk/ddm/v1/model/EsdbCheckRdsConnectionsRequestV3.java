package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求体
 */
public class EsdbCheckRdsConnectionsRequestV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infos")

    private List<EsdbCheckRdsConnectionRequestV3> infos = null;

    public EsdbCheckRdsConnectionsRequestV3 withInfos(List<EsdbCheckRdsConnectionRequestV3> infos) {
        this.infos = infos;
        return this;
    }

    public EsdbCheckRdsConnectionsRequestV3 addInfosItem(EsdbCheckRdsConnectionRequestV3 infosItem) {
        if (this.infos == null) {
            this.infos = new ArrayList<>();
        }
        this.infos.add(infosItem);
        return this;
    }

    public EsdbCheckRdsConnectionsRequestV3 withInfos(Consumer<List<EsdbCheckRdsConnectionRequestV3>> infosSetter) {
        if (this.infos == null) {
            this.infos = new ArrayList<>();
        }
        infosSetter.accept(this.infos);
        return this;
    }

    /**
     * **参数解释**：  rds连通性检查相关信息的集合。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return infos
     */
    public List<EsdbCheckRdsConnectionRequestV3> getInfos() {
        return infos;
    }

    public void setInfos(List<EsdbCheckRdsConnectionRequestV3> infos) {
        this.infos = infos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EsdbCheckRdsConnectionsRequestV3 that = (EsdbCheckRdsConnectionsRequestV3) obj;
        return Objects.equals(this.infos, that.infos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EsdbCheckRdsConnectionsRequestV3 {\n");
        sb.append("    infos: ").append(toIndentedString(infos)).append("\n");
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
